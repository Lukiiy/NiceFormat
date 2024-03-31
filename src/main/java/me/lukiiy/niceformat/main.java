package me.lukiiy.niceformat;

import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    @Override
    public void onEnable() {getServer().getPluginManager().registerEvent(Event.Type.PLAYER_CHAT, new Chat(), Event.Priority.Lowest, this);}

    @Override
    public void onDisable() {}
}