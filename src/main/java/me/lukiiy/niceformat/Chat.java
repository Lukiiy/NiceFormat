package me.lukiiy.niceformat;

import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;

public class Chat extends PlayerListener {

    public void onPlayerChat(PlayerChatEvent e) {
        e.setMessage(e.getMessage().replace('&', '§')); // Chat Colr
        e.setFormat("%1$s: %2$s"); // Format
    }
}
