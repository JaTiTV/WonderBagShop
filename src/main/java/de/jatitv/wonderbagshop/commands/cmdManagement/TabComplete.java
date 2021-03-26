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

package de.jatitv.wonderbagshop.commands.cmdManagement;

import de.jatitv.wonderbagshop.defultValue.DefultValue;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TabComplete implements TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String lable, String[] args) {
        if (sender instanceof Player) {
            List<String> list = new ArrayList<>();
            if (DefultValue.Debug && DefultValue.DebugStage > 2){
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6" + Bukkit.getName() + " used TabComplete by wbs");
            }

            if (args.length == 0 || args.length == 1) {
                if (args[0].isEmpty()) {

                    if (DefultValue.Debug && DefultValue.DebugStage > 2){
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6" + Bukkit.getName() + " used TabComplete §4args.length == 0 || args.length == 1");
                    }

                    if (sender.hasPermission("wonderbagshop.command")
                            || sender.hasPermission("wonderbagshop.command.info")
                            || sender.hasPermission("wonderbagshop.command.give")
                            || sender.hasPermission("wonderbagshop.command.gift")
                            || sender.hasPermission("wonderbagshop.admin")
                            || sender.isOp()) {
                        list.add("help");
                    }
                    if (sender.hasPermission("wonderbagshop.command.info") || sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("info");
                    }
                    if (sender.hasPermission("wonderbagshop.command.give") || sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("give");
                    }
                    if (sender.hasPermission("wonderbagshop.command.giveall") || sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("giveall");
                    }
                    if (sender.hasPermission("wonderbagshop.command.gift") || sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("gift");
                    }

                    if (sender.hasPermission("wonderbagshop.command.reload") || sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("reload");
                        list.add("rl");
                    }
                    if (sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("settings");
                    }
                    return list;
                }


                if (args[0].charAt(0) == 'h') {
                    if (DefultValue.Debug && DefultValue.DebugStage > 2){
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6" + sender + " used TabComplete §4args[0].charAt(0) == 'h'");
                    }
                    if (sender.hasPermission("wonderbagshop.command") || sender.hasPermission("wonderbagshop.command.info")
                            || sender.hasPermission("wonderbagshop.command.give") || sender.hasPermission("wonderbagshop.command.gift")
                            || sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("help");
                    }

                } else if (args[0].charAt(0) == 'i') {
                    if (DefultValue.Debug && DefultValue.DebugStage > 2){
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6" + sender + " used TabComplete §4args[0].charAt(0) == 'i'");
                    }
                    if (sender.hasPermission("wonderbagshop.command.info") || sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("info");
                    }

                } else if (args[0].charAt(0) == 'g' && args[0].length() < 3) {
                    if (DefultValue.Debug && DefultValue.DebugStage > 2){
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6" + sender + " used TabComplete §4args[0].charAt(0) == 'g' && args[0].length() < 3");
                    }
                    if (sender.hasPermission("wonderbagshop.command.give") || sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("give");
                    }
                    if (sender.hasPermission("wonderbagshop.command.giveall") || sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("giveall");
                    }
                    if (sender.hasPermission("wonderbagshop.command.gift") || sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("gift");
                    }

                } else if (args[0].charAt(0) == 'g' && args[0].charAt(2) == 'v') {
                    if (DefultValue.Debug && DefultValue.DebugStage > 2){
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6" + sender + " used TabComplete §4args[0].charAt(0) == 'g' && args[0].charAt(2) == 'v'");
                    }
                    if (sender.hasPermission("wonderbagshop.command.give") || sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("give");
                    }
                    if (sender.hasPermission("wonderbagshop.command.giveall") || sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("giveall");
                    }

                } else if (args[0].charAt(0) == 'g' && args[0].charAt(2) == 'f') {
                    if (DefultValue.Debug && DefultValue.DebugStage > 2){
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6" + sender + " used TabComplete §4args[0].charAt(0) == 'g' && args[0].charAt(2) == 'f'");
                    }
                    if (sender.hasPermission("wonderbagshop.command.gift") || sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("gift");
                    }

                } else if (args[0].charAt(0) == 'r' && args[0].length() < 3) {
                    if (DefultValue.Debug && DefultValue.DebugStage > 2){
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6" + sender + " used TabComplete §4args[0].charAt(0) == 'r' && args[0].length() < 3");
                    }
                    if (sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("reload");
                        list.add("rl");
                    }
                } else if (args[0].charAt(0) == 'r' && args[0].charAt(1) == 'e') {
                    if (DefultValue.Debug && DefultValue.DebugStage > 2){
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6" + sender + " used TabComplete §4args[0].charAt(0) == 'r' && args[0].charAt(1) == 'e'");
                    }
                    if (sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("reload");
                    }
                } else if (args[0].charAt(0) == 'r' && args[0].charAt(1) == 'l') {
                    if (DefultValue.Debug && DefultValue.DebugStage > 2){
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6" + sender + " used TabComplete §4args[0].charAt(0) == 'r' && args[0].charAt(1) == 'l'");
                    }
                    if (sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("rl");
                    }

                } else if (args[0].charAt(0) == 's') {
                    if (DefultValue.Debug && DefultValue.DebugStage > 2){
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6" + sender + " used TabComplete §4args[0].charAt(0) == 's'");
                    }
                    if (sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                        list.add("settings");
                    }
                }
                return list;
            }
            if (args.length == 2 && args[0].equalsIgnoreCase("give")) {
                if (DefultValue.Debug && DefultValue.DebugStage > 2){
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6" + sender + " used TabComplete §4args.length == 2 && args[0].equalsIgnoreCase(\"give\"");
                }
                Iterator var6 = Bukkit.getOnlinePlayers().iterator();

                while (var6.hasNext()) {
                    Player player1 = (Player) var6.next();
                    list.add(player1.getName());
                }
                return list;

            }

            if (args.length == 2 && args[0].equalsIgnoreCase("gift")) {
                if (DefultValue.Debug && DefultValue.DebugStage > 2){
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6" + sender + " used TabComplete §4args.length == 2 && args[0].equalsIgnoreCase(\"gift\"");
                }
                Iterator var6 = Bukkit.getOnlinePlayers().iterator();

                while (var6.hasNext()) {
                    Player player1 = (Player) var6.next();
                    list.add(player1.getName());
                }

                return list;
            }
        }
        return new ArrayList();
    }
}