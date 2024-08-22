package cn.qy.MomoTech;

import cn.qy.MomoTech.Listeners.Listeners;
import cn.qy.MomoTech.language.LanguageManager;
import cn.qy.MomoTech.tasks.ItemRegisterTask;
import cn.qy.MomoTech.tasks.MachineRegisterTask;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.logging.Logger;

public class MomoTech extends JavaPlugin implements SlimefunAddon {

    public static double tps;
    public static Logger logger;
    public static Server server;
    public static int playerNumber;
    public static int seed;
    public static LanguageManager languageManager;
    private static MomoTech instance;

    public static MomoTech getInstance() {
        return instance;
    }

    public static void init(Server s) {
        playerNumber = s.getOnlinePlayers().size();
        tps = s.getTPS()[0];
        seed = new Random().nextInt() % 1000000;
    }

    @Override
    public void onEnable() {
        getLogger().info("MomoTech has been enabled.");
        getLogger().info("---------< MomoTech >-------");
        getLogger().info("|  Authors:QYhB05,mmmjjkx  |");
        getLogger().info("|      Plugin:MomoTech     |");
        getLogger().info("|      Version:1.1.11      |");
        getLogger().info("----------------------------");
        getLogger().info("> Discord: ");
        getLogger().info("> E-mail:3392295184@qq.com");
        getLogger().info("----------------------------");
        getLogger().info("Loading MomoTech...");
        instance = this;
        languageManager = new LanguageManager(this);
        getLogger().info("Staring Listener Registration...");
        getServer().getPluginManager().registerEvents(new Listeners(), this);
        getLogger().info("Successful Listener Registration");
        getLogger().info("Initializing items...");
        init(getServer());
        logger = getLogger();
        server = getServer();
        getLogger().info("Registering Items...");
        ItemRegisterTask.run(getLogger());
        getLogger().info("Successful Item Registration");
        getLogger().info("Registering Machines...");
        MachineRegisterTask.run(getLogger());
        getLogger().info("Successful Machine Registration");
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
        getLogger().info("MomoTech has been disabled.");
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return "https://github.com/lijinhong11/MomoTech/issues";
    }

    @Override
    public @NotNull JavaPlugin getJavaPlugin() {
        return this;
    }
}
