package me.lukiiy.niceformat;

import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;

public class Chat extends PlayerListener {
    public void onPlayerChat(PlayerChatEvent e) {
        if (main.Plugin.getBoolean("color")) e.setMessage(e.getMessage().replace('&', '§'));
        e.setFormat(main.Plugin.get("format").replace("(p)", "%1$s").replace("(msg)", "%2$s"));
    }
}
