package cn.qy.MomoTech;

import cn.qy.MomoTech.Listeners.Listeners;
import cn.qy.MomoTech.language.LanguageManager;
import cn.qy.MomoTech.tasks.ItemRegisterTask;
import cn.qy.MomoTech.tasks.MachineRegisterTask;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import lombok.Getter;
import me.matl114.matlib.core.UtilInitialization;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MomoTech extends JavaPlugin implements SlimefunAddon {

    public static double tps;
    public static Logger logger;
    public static Server server;
    public static LanguageManager languageManager;
    public static int playerNumber;
    public static int seed;
    private static MomoTech instance;
    public static Config config;
    @Getter
    private static boolean autoUpdate = false;
    @Getter
    private static boolean disableCopierDupeStorage=false;
    @Getter
    private static Set<String> copierBlacklist = new HashSet<>();
    public static MomoTech getInstance() {
        return instance;
    }

    public static void init(Logger l, Server s) {
        playerNumber = s.getOnlinePlayers().size();
        tps = s.getTPS()[0];
        seed = new Random().nextInt() % 1000000;
    }

    @Override
    public void onEnable() {
        new UtilInitialization(this,"MomoTech").displayName("MomoTech").onEnable();
        getLogger().info("MomoTech has been enabled.");
        getLogger().info("---------< MomoTech >-------");
        getLogger().info("|      Authors:QYhB05      |");
        getLogger().info("|      Plugin:MomoTech     |");
        getLogger().info("|      Version:1.1.11      |");
        getLogger().info("----------------------------");
        getLogger().info("> QQ Group:827684043");
        getLogger().info("> E-mail:3392295184@qq.com");
        getLogger().info("> Used API version: 1.20.1-R0.1-SNAPSHOT");
        getLogger().info("> Slimefun4 version supported: Chinese version");
        getLogger().info("> License:MIT");
        getLogger().info("----------------------------");
        getLogger().info("Loading MomoTech...");
        instance = this;
        config=new Config(this);
        saveDefaultConfig();
        saveConfig();
        // Removed saveFiles() call - LanguageManager will handle lang files
        disableCopierDupeStorage = config.getOrSetDefault("options.disable-copier-dupe-storage",false);
        List<String> blacklist = config.getOrSetDefault("options.copier-blacklist",new ArrayList<String>());
        if (blacklist!=null){
            copierBlacklist.addAll(blacklist);
        }
        config.save();
        languageManager = new LanguageManager(this);
        getLogger().info("Registering Listener...");
        getServer().getPluginManager().registerEvents(new Listeners(), this);
        getLogger().info("Registered Listener successfully.");
        getLogger().info("Initializing items...");
        Bukkit.getScheduler().runTaskTimer(this,()->{
            playerNumber = Bukkit.getOnlinePlayers().size();
            tps = Bukkit.getTPS()[0];
        },0,40);
        init(getLogger(), getServer());
        logger = getLogger();
        server = getServer();
        getLogger().info("Registering Items...");
        ItemRegisterTask.run(getLogger());
        getLogger().info("Registered Items successfully.");
        getLogger().info("Registering Machines...");
        MachineRegisterTask.run(getLogger());
        getLogger().info("Registered Machines successfully.");
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
        getLogger().info("MomoTech has been disabled.");
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public @NotNull JavaPlugin getJavaPlugin() {
        return this;
    }
}
