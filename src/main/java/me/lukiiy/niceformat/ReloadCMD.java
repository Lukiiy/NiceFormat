package me.lukiiy.niceformat;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        NiceFormat.getInstance().setupConfig();
        commandSender.sendMessage("§aNiceFormat Reload complete.");
        return true;
    }
}
