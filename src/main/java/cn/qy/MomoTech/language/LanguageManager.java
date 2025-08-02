package cn.qy.MomoTech.language;

import org.bukkit.ChatColor;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.JarURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class LanguageManager {
    private final Plugin plugin;
    private final Map<String, YamlConfiguration> configurations = new HashMap<>();
    private YamlConfiguration defaultConfiguration;

    public LanguageManager(Plugin plugin) {
        this.plugin = plugin;

        loadLanguages();
    }

    private void loadLanguages() {
        // Ensure lang directory exists
        File langDir = new File(plugin.getDataFolder(), "lang");
        if (!langDir.exists()) {
            langDir.mkdirs();
        }

        // Load default configuration
        File defaultLangFile = new File(plugin.getDataFolder(), "lang/en-US.yml");
        if (!defaultLangFile.exists()) {
            plugin.saveResource("lang/en-US.yml", false);
        }
        defaultConfiguration = YamlConfiguration.loadConfiguration(defaultLangFile);

        File pluginFolder = plugin.getDataFolder();

        // Check if lang resource directory exists
        URL fileURL = plugin.getClass().getResource("lang/");
        if (fileURL == null) {
            plugin.getLogger().warning("Lang resource directory not found in JAR!");
            return;
        }
        
        String jarPath = fileURL.toString().substring(0, fileURL.toString().indexOf("!/") + 2);

        try {
            URL jar = new URL(jarPath);
            JarURLConnection jarCon = (JarURLConnection) jar.openConnection();
            JarFile jarFile = jarCon.getJarFile();
            Enumeration<JarEntry> jarEntries = jarFile.entries();

            while (jarEntries.hasMoreElements()) {
                JarEntry entry = jarEntries.nextElement();
                String name = entry.getName();
                if (name.startsWith("lang/") && name.endsWith(".yml") && !entry.isDirectory()) {
                    String realName = name.replace("lang/", "");
                    try (InputStream stream = plugin.getClass().getResourceAsStream(name)) {
                        File destinationFile = new File(pluginFolder, "lang/" + realName);

                        if (!destinationFile.exists() && stream != null) {
                            plugin.saveResource("lang/" + realName, false);
                            plugin.getLogger().info("Created language file: " + realName);
                        }

                        completeLangFile("lang/" + realName);
                    } catch (Exception e) {
                        plugin.getLogger().warning("Failed to process language file '" + realName + "': " + e.getMessage());
                    }
                }
            }
            jarFile.close();
        } catch (Exception e) {
            plugin.getLogger().severe("Failed to load language files from JAR: " + e.getMessage());
            e.printStackTrace();
        }

        // Load all language files into memory
        File[] languageFiles = langDir.listFiles((dir, name) -> name.endsWith(".yml"));
        if (languageFiles != null) {
            for (File languageFile : languageFiles) {
                String language = languageFile.getName().replace(".yml", "");
                try {
                    configurations.put(language, YamlConfiguration.loadConfiguration(languageFile));
                    plugin.getLogger().info("Loaded language: " + language);
                } catch (Exception e) {
                    plugin.getLogger().warning("Failed to load language file '" + languageFile.getName() + "': " + e.getMessage());
                }
            }
        }
    }

    public String getInfo(String path) {
        return ChatColor.translateAlternateColorCodes('&', getConfiguration().getString("info." + path, ""));
    }

    public String getGeneric(String path) {
        return ChatColor.translateAlternateColorCodes('&', getConfiguration().getString("generic." + path, ""));
    }

    public String getItemName(String path) {
        return ChatColor.translateAlternateColorCodes('&', getConfiguration().getString("item." + path + ".name", ""));
    }

    public String[] getItemLore(String path) {
        List<String> colored =  getConfiguration().getStringList("item." + path + ".lore");

        if (colored.size() == 1 && colored.get(0).isBlank()) {
            return new String[0];
        }

        colored.replaceAll(s -> ChatColor.translateAlternateColorCodes('&', s));
        return colored.toArray(new String[0]);
    }

    public String getGuideName(String path) {
        return ChatColor.translateAlternateColorCodes('&', getConfiguration().getString("guide." + path + ".name", ""));
    }

    public String[] getGuideLore(String path) {
        List<String> colored =  getConfiguration().getStringList("guide." + path + ".lore");

        if (colored.size() == 1 && colored.get(0).isBlank()) {
            return new String[0];
        }

        colored.replaceAll(s -> ChatColor.translateAlternateColorCodes('&', s));
        return colored.toArray(new String[0]);
    }

    public String getRecipeDescriptionTitle(String path) {
        return ChatColor.translateAlternateColorCodes('&', getConfiguration().getString("description." + path + ".title", ""));
    }
    
    public String[] getRecipeDescriptionLore(String path) {
        List<String> colored =  getConfiguration().getStringList("description." + path + ".lore");

        if (colored.size() == 1 && colored.get(0).isBlank()) {
            return new String[0];
        }

        colored.replaceAll(s -> ChatColor.translateAlternateColorCodes('&', s));
        return colored.toArray(new String[0]);
    }

    private Configuration getConfiguration() {
        String language = plugin.getConfig().getString("options.language", "en-US");
        return configurations.getOrDefault(language, defaultConfiguration);
    }

    private void completeLangFile(String resourceFile) {
        File file = new File(plugin.getDataFolder(), resourceFile);

        if (!file.exists()) {
            try (InputStream stream = plugin.getResource(resourceFile)) {
                if (stream != null) {
                    plugin.saveResource(resourceFile, false);
                    return;
                }
            } catch (Exception e) {
                plugin.getLogger().warning("File completion of '" + resourceFile + "' is failed: " + e.getMessage());
                return;
            }
            plugin.getLogger().warning("File completion of '" + resourceFile + "' is failed.");
            return;
        }

        try (InputStream resourceStream = plugin.getResource(resourceFile)) {
            if (resourceStream == null) {
                plugin.getLogger().warning("File completion of '" + resourceFile + "' is failed.");
                return;
            }

            try (Reader reader = new InputStreamReader(resourceStream, StandardCharsets.UTF_8)) {
                YamlConfiguration configuration = YamlConfiguration.loadConfiguration(reader);
                YamlConfiguration configuration2 = YamlConfiguration.loadConfiguration(file);

                Set<String> keys = configuration.getKeys(true);
                for (String key : keys) {
                    Object value = configuration.get(key);
                    if (value instanceof List<?>) {
                        List<?> list2 = configuration2.getList(key);
                        if (list2 == null) {
                            configuration2.set(key, value);
                            continue;
                        }
                    }
                    if (!configuration2.contains(key)) {
                        configuration2.set(key, value);
                    }
                    if (!configuration.getComments(key).equals(configuration2.getComments(key))) {
                        configuration2.setComments(key, configuration.getComments(key));
                    }
                }
                for (String key : configuration2.getKeys(true)) {
                    if (configuration2.contains(key) && !configuration.contains(key)) {
                        configuration2.set(key, null);
                    }
                }
                configuration2.save(file);
            }
        } catch (Exception e) {
            plugin.getLogger().warning("File completion of '" + resourceFile + "' is failed: " + e.getMessage());
        }
    }
}