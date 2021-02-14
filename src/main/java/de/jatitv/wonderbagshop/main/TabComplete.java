// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class TabComplete implements TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String lable, String[] args) {
        if(sender instanceof Player) {
            List<String> list = new ArrayList<>();
            Player player = (Player) sender;
            if (args.length == 0 || args.length == 1) {
                if (args[0].isEmpty()) {
                    if (player.hasPermission("wonderbagshop.command.reload") || player.isOp()) {
                        list.add("reload");
                        list.add("rl");
                    }
                    if (player.hasPermission("wonderbagshop.command") || player.isOp()) {
                        list.add("help");
                    }
                    if (player.hasPermission("wonderbagshop.command.info") || player.isOp()) {
                        list.add("info");
                    }
                    return list;
                }

                if (args[0].charAt(0) == 'i') {
                    list.add("info");
                } else if (args[0].charAt(0) == 'r' && args[0].length() < 3) {
                    list.add("reload");
                    list.add("rl");
                } else if (args[0].charAt(0) == 'r' && args[0].charAt(2) == 'l') {
                    list.add("reload");
                } else if (args[0].charAt(0) == 'r' && args[0].charAt(2) == 'l') {
                    list.add("rl");
                } else if (args[0].charAt(0) == 'h') {
                    list.add("help");
                }
                return list;
            }
        }
        return new ArrayList();
    }

}
