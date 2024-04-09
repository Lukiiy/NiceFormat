package me.lukiiy.niceformat;

import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    public static main Plugin;

    @Override
    public void onEnable() {
        Plugin = this;
        getServer().getPluginManager().registerEvent(Event.Type.PLAYER_CHAT, new Chat(), Event.Priority.Lowest, this);
        getCommand("niceformat").setExecutor(new ReloadCMD());
        config();
    }

    @Override
    public void onDisable() {}

    public String get(String path) {return getConfiguration().getString(path);}
    public boolean getBoolean(String path) {return getConfiguration().getBoolean(path, true);}

    public void config() {
        getConfiguration().load();
        getConfiguration().getBoolean("color", true);
        getConfiguration().getString("format", "(p): (msg)");
        getConfiguration().save();
    }
}