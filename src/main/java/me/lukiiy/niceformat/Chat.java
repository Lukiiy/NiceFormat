package me.lukiiy.niceformat;

import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;

public class Chat extends PlayerListener {
    public void onPlayerChat(PlayerChatEvent e) {
        if (main.Color) e.setMessage(e.getMessage().replace('&', '§'));
        e.setFormat(main.Format);
    }
}
