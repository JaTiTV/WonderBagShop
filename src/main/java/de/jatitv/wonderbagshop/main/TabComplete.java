// This claas was created by JaTiTV

// ___________________________________________________________________________________
//  __          __             _           ____               _____ _
//  \ \        / /            | |         |  _ \             / ____| |
//   \ \  /\  / /__  _ __   __| | ___ _ __| |_) | __ _  __ _| (___ | |__   ___  _ __
//    \ \/  \/ / _ \| '_ \ / _` |/ _ \ '__|  _ < / _` |/ _` |\___ \| '_ \ / _ \| '_ \
//     \  /\  / (_) | | | | (_| |  __/ |  | |_) | (_| | (_| |____) | | | | (_) | |_) |
//      \/  \/ \___/|_| |_|\__,_|\___|_|  |____/ \__,_|\__, |_____/|_| |_|\___/| .__/
//                                                      __/ |                  | |
//                                                     |___/                   |_|
// ___________________________________________________________________________________

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
                    if (player.hasPermission("wonderbagshop.command.reload") || player.hasPermission("wonderbagshop.admin") || player.isOp()) {
                        list.add("reload");
                        list.add("rl");
                    }
                    if (player.hasPermission("wonderbagshop.command") || player.hasPermission("wonderbagshop.admin") || player.isOp()) {
                        list.add("help");
                    }
                    if (player.hasPermission("wonderbagshop.command.info") || player.hasPermission("wonderbagshop.admin") || player.isOp()) {
                        list.add("info");
                    }
                    return list;
                }

                if (args[0].charAt(0) == 'i') {
                    list.add("info");
                } else if (args[0].charAt(0) == 'r' && args[0].length() < 3) {
                    list.add("reload");
                    list.add("rl");
                } else if (args[0].charAt(0) == 'r' && args[0].charAt(1) == 'e') {
                    list.add("reload");
                } else if (args[0].charAt(0) == 'r' && args[0].charAt(1) == 'l') {
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