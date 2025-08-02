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
        languageManager = new LanguageManager(this);
        new UtilInitialization(this,"MomoTech").displayName(MomoTech.languageManager.getInfo("momotech")).onEnable();
        getLogger().info(MomoTech.languageManager.getInfo("momotech_enabled.l1"));
        getLogger().info(MomoTech.languageManager.getInfo("momotech_enabled.l2"));
        getLogger().info(MomoTech.languageManager.getInfo("momotech_enabled.l3"));
        getLogger().info(MomoTech.languageManager.getInfo("momotech_enabled.l4"));
        getLogger().info(MomoTech.languageManager.getInfo("momotech_enabled.l5"));
        getLogger().info(MomoTech.languageManager.getInfo("momotech_enabled.l6"));
        getLogger().info(MomoTech.languageManager.getInfo("momotech_enabled.l7"));
        getLogger().info(MomoTech.languageManager.getInfo("momotech_enabled.l8"));
        getLogger().info(MomoTech.languageManager.getInfo("momotech_enabled.l9"));
        getLogger().info(MomoTech.languageManager.getInfo("momotech_enabled.l10"));
        getLogger().info(MomoTech.languageManager.getInfo("momotech_enabled.l11"));
        getLogger().info(MomoTech.languageManager.getInfo("momotech_enabled.l12"));
        getLogger().info(MomoTech.languageManager.getInfo("momotech_enabled.l13"));
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

        getLogger().info(MomoTech.languageManager.getInfo("registering_listener"));
        getServer().getPluginManager().registerEvents(new Listeners(), this);
        getLogger().info(MomoTech.languageManager.getInfo("registering_listener_succeed"));
        getLogger().info(MomoTech.languageManager.getInfo("initializing_items"));
        Bukkit.getScheduler().runTaskTimer(this,()->{
            playerNumber = Bukkit.getOnlinePlayers().size();
            tps = Bukkit.getTPS()[0];
        },0,40);
        init(getLogger(), getServer());
        logger = getLogger();
        server = getServer();
        getLogger().info(MomoTech.languageManager.getInfo("registering_items"));
        ItemRegisterTask.run(getLogger());
        getLogger().info(MomoTech.languageManager.getInfo("registering_items_succeed"));
        getLogger().info(MomoTech.languageManager.getInfo("registering_machines"));
        MachineRegisterTask.run(getLogger());
        getLogger().info(MomoTech.languageManager.getInfo("registering_machines_succeed"));
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
        getLogger().info(MomoTech.languageManager.getInfo("momotech_disabled"));
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
