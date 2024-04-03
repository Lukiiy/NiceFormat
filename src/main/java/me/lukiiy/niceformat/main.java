package me.lukiiy.niceformat;

import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    public static main Plugin;
    public static boolean Color = true;
    public static String Format = "%1$s: %2$s";

    @Override
    public void onEnable() {
        Plugin = this;
        getServer().getPluginManager().registerEvent(Event.Type.PLAYER_CHAT, new Chat(), Event.Priority.Lowest, this);
        getCommand("niceformat").setExecutor(new ReloadCMD());
        config();
    }

    @Override
    public void onDisable() {}

    public void config() {
        getConfiguration().load();
        Color = getConfiguration().getBoolean("color", Color);
        Format = getConfiguration().getString("format", Format)
                .replace("(p)", "%1$s")
                .replace("(msg)", "%2$s");
        getConfiguration().save();
    }
}