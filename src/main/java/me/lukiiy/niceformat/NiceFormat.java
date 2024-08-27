package me.lukiiy.niceformat;

import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.config.Configuration;

public class NiceFormat extends JavaPlugin {
    @Getter private static NiceFormat instance;
    public Configuration config;

    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvent(Event.Type.PLAYER_CHAT, new Chat(), Event.Priority.Lowest, this);
        getCommand("niceformat").setExecutor(new ReloadCMD());
        setupConfig();
    }

    @Override
    public void onDisable() {}

    // Config
    public void setupConfig() {
        config = getConfiguration();
        config.load();

        config.getBoolean("color", true);
        config.getString("format", "(p): (msg)");

        config.save();
    }

    public String get(String path) {return instance.config.getString(path);}
    public boolean getBoolean(String path) {return instance.config.getBoolean(path, true);}
}