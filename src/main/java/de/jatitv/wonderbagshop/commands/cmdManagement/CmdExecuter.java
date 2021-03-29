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

import de.jatitv.wonderbagshop.commands.*;
import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import de.jatitv.wonderbagshop.gui.Shop;
import de.jatitv.wonderbagshop.gui.ShopGift;
import de.jatitv.wonderbagshop.gui.ShopGive;
import de.jatitv.wonderbagshop.gui.ShopGiveAll;
import de.jatitv.wonderbagshop.system.Main;
import de.jatitv.wonderbagshop.gui.settingsGUI.GUI_Settings;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdExecuter implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                if (player.hasPermission("wonderbagshop.command") || player.isOp()) {
                    if (Bukkit.getPluginManager().getPlugin("NBTAPI") != null) {
                        Shop.openShop(player);
                    } else {
                        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4NBTAPI could not be connected / found! " +
                                "§9Please download it here: §6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefaultValue.PrefixHC);
                        player.sendMessage(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4NBTAPI could not be connected / found! §9Please download it here: " +
                                "§6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefaultValue.PrefixHC);
                    }
                } else {
                    player.sendMessage(DefaultValue.NoPermission.replace("[cmd]", "/wonderbagshop").replace("[perm]", "wonderbagshop.command"));
                }
            } else {
                switch (args[0].toLowerCase()) {
                    case "info":
                    case "plugin":
                    case "pl":
                    case "version":
                    case "ver":
                        if (player.hasPermission("wonderbagshop.command.info") || player.isOp()) {
                            sender.sendMessage(DefaultValue.PrefixHC + "§8-------- §4Plugin-Info §8--------");
                            sender.sendMessage(DefaultValue.PrefixHC + "§2This plugin was developed by §9JaTiTV");
                            sender.sendMessage(DefaultValue.PrefixHC + "§2");
                            sender.sendMessage(DefaultValue.PrefixHC + "§2Twitch: §ehttps://www.twitch.tv/jatitv");
                            sender.sendMessage(DefaultValue.PrefixHC + "§2Support-Discord: §ehttps://discord.gg/vRyXFFterJ");
                            sender.sendMessage(DefaultValue.PrefixHC + "§2Spigot: §ehttps://www.spigotmc.org/resources/wonderbagshop.89234/");
                            sender.sendMessage(DefaultValue.PrefixHC + "§2");
                            sender.sendMessage(DefaultValue.PrefixHC + "§2Version: §6" + Main.getPlugin().getDescription().getVersion());
                            sender.sendMessage(DefaultValue.PrefixHC + "§8-----------------------------");

                            if (Bukkit.getPluginManager().getPlugin("NBTAPI") == null) {
                                Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4NBTAPI could not be connected / found! " +
                                        "§9Please download it here: §6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefaultValue.PrefixHC);
                                player.sendMessage(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4NBTAPI could not be connected / found! §9Please download it here: " +
                                        "§6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefaultValue.PrefixHC);
                            }
                            if (Bukkit.getPluginManager().getPlugin("Vault") == null) {
                                Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4Vault could not be connected / found! " +
                                        "§9Please download it here: §6https://www.spigotmc.org/resources/vault.34315/§4\n" + DefaultValue.PrefixHC);
                                player.sendMessage(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4NBTAPI could not be connected / found! §9Please download it here: " +
                                        "§6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefaultValue.PrefixHC);
                            }

                        } else {
                            player.sendMessage(DefaultValue.NoPermissionForCommand.replace("[cmd]", "/wonderbagshop info")
                                    .replace("[perm]", "wonderbagshop.command.info"));
                        }
                        break;


                    case "give":
                        if (Bukkit.getPluginManager().getPlugin("NBTAPI") != null) {
                            if (player.hasPermission("wonderbagshop.command.give") || player.isOp()) {

                                if (args.length == 2) {
                                    if (Bukkit.getPlayer(args[1]) != null) {
                                        ShopGive.ShopSendSender.put(player, Bukkit.getPlayer(args[1]));
                                        ShopGive.openShop(player);
                                    } else {
                                        if(DefaultValue.Title_PlayerNotFound_Enable && DefaultValue.Title_Enable){
                                            player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_PlayerNotFound.replace("[player]", args[1])
                                                    , 10, 70, 20);
                                        } else player.sendMessage(DefaultValue.PlayerNotFound.replace("[player]", args[1]));
                                        if (DefaultValue.Sound_PlayerNotFound_Enable && DefaultValue.Sound_Enable) {
                                            player.playSound(player.getLocation(), DefaultValue.Sound_PlayerNotFound, 3, 1);
                                        }
                                    }

                                } else {
                                    Help.Help(sender);
                                }


                            } else {
                                player.sendMessage(DefaultValue.NoPermissionForCommand.replace("[cmd]", "/wonderbagshop give")
                                        .replace("[perm]", "wonderbagshop.command.give"));
                            }
                        } else {
                            Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4NBTAPI could not be connected / found! " +
                                    "§9Please download it here: §6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefaultValue.PrefixHC);
                            player.sendMessage(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4NBTAPI could not be connected / found! §9Please download it here: " +
                                    "§6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefaultValue.PrefixHC);
                        }
                        break;
                    case "giveall":
                        if (Bukkit.getPluginManager().getPlugin("NBTAPI") != null) {
                            if (player.hasPermission("wonderbagshop.command.giveall") || player.isOp()) {

                                ShopGiveAll.openShop(player);


                            } else {
                                player.sendMessage(DefaultValue.NoPermissionForCommand.replace("[cmd]", "/wonderbagshop give")
                                        .replace("[perm]", "wonderbagshop.command.give"));
                            }
                        } else {
                            Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4NBTAPI could not be connected / found! " +
                                    "§9Please download it here: §6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefaultValue.PrefixHC);
                            player.sendMessage(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4NBTAPI could not be connected / found! §9Please download it here: " +
                                    "§6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefaultValue.PrefixHC);
                        }
                        break;


                    case "gift":
                        if (Bukkit.getPluginManager().getPlugin("NBTAPI") != null) {
                            if (player.hasPermission("wonderbagshop.command.gift") || player.isOp()) {

                                if (args.length == 2) {
                                    if (Bukkit.getPlayer(args[1]) != null) {
                                        ShopGift.ShopSendSender.put(player, Bukkit.getPlayer(args[1]));
                                        ShopGift.openShop(player);
                                    } else {
                                        if(DefaultValue.Title_PlayerNotFound_Enable && DefaultValue.Title_Enable){
                                            player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_PlayerNotFound.replace("[player]", args[1])
                                                    , 10, 70, 20);
                                        } else player.sendMessage(DefaultValue.PlayerNotFound.replace("[player]", args[1]));
                                        if (DefaultValue.Sound_PlayerNotFound_Enable && DefaultValue.Sound_Enable) {
                                            player.playSound(player.getLocation(), DefaultValue.Sound_PlayerNotFound, 3, 1);
                                        }
                                    }

                                } else {
                                    Help.Help(sender);
                                }


                            } else {
                                player.sendMessage(DefaultValue.NoPermissionForCommand.replace("[cmd]", "/wonderbagshop send")
                                        .replace("[perm]", "wonderbagshop.command.gift"));
                            }
                        } else {
                            Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4NBTAPI could not be connected / found! " +
                                    "§9Please download it here: §6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefaultValue.PrefixHC);
                            player.sendMessage(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4NBTAPI could not be connected / found! §9Please download it here: " +
                                    "§6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefaultValue.PrefixHC);
                        }
                        break;

                    case "reload":
                    case "rl":
                        if (player.hasPermission("wonderbagshop.admin") || player.isOp()) {
                            if (sender instanceof Player) sender.sendMessage(DefaultValue.PrefixHC + DefaultValue.ReloadStart);
                            Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");
                            Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§6Plugin reload...");
                            Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");

                            Bukkit.getServer().getPluginManager().getPlugin(Main.plugin.getName()).onEnable();

                            if (sender instanceof Player) sender.sendMessage(DefaultValue.PrefixHC + DefaultValue.ReloadEnd);
                            Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");
                            Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2Plugin successfully reloaded.");
                            Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");
                        } else {
                            player.sendMessage(DefaultValue.NoPermissionForCommand.replace("[cmd]", "/wonderbagshop reload")
                                    .replace("[perm]", "wonderbagshop.command.reload"));
                        }
                        break;

                    case "settings":
                        if (player.hasPermission("wonderbagshop.admin") || player.isOp()) {
                            GUI_Settings.openSettings(player);
                        } else {
                            player.sendMessage(DefaultValue.NoPermissionForCommand.replace("[cmd]", "/wonderbagshop settings")
                                    .replace("[perm]", "wonderbagshop.admin"));
                        }
                        break;


                    case "help":
                    default:
                        Help.Help(sender);
                        break;

                }
            }

        } else {
            if (args.length == 1 || args.length == 2 || args.length == 3) {
                switch (args[0].toLowerCase()) {
                    case "info":
                    case "plugin":
                    case "pl":
                    case "version":
                    case "ver":
                        sender.sendMessage(DefaultValue.PrefixHC + "§8-------- §4Plugin-Info §8--------");
                        sender.sendMessage(DefaultValue.PrefixHC + "§2This plugin was developed by §9JaTiTV");
                        sender.sendMessage(DefaultValue.PrefixHC + "§2");
                        sender.sendMessage(DefaultValue.PrefixHC + "§2Twitch: §ehttps://www.twitch.tv/jatitv");
                        sender.sendMessage(DefaultValue.PrefixHC + "§2Support-Discord: §ehttps://discord.gg/vRyXFFterJ");
                        sender.sendMessage(DefaultValue.PrefixHC + "§2Spigot: §ehttps://www.spigotmc.org/resources/wonderbagshop.89234/");
                        sender.sendMessage(DefaultValue.PrefixHC + "§2");
                        sender.sendMessage(DefaultValue.PrefixHC + "§2Version: §6" + Main.getPlugin().getDescription().getVersion());
                        sender.sendMessage(DefaultValue.PrefixHC + "§8-----------------------------");
                        break;
                    default:
                        Help.Help(sender);
                        break;
                    case "rl":
                    case "reload":
                        if (sender instanceof Player) sender.sendMessage(DefaultValue.PrefixHC + DefaultValue.ReloadStart);
                        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");
                        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§6Plugin reload...");
                        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");

                        Bukkit.getServer().getPluginManager().getPlugin(Main.plugin.getName()).onEnable();

                        if (sender instanceof Player) sender.sendMessage(DefaultValue.PrefixHC + DefaultValue.ReloadEnd);
                        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");
                        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2Plugin successfully reloaded.");
                        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");
                        break;

                    case "give":
                        if (args.length == 3) {
                            if (Bukkit.getPlayer(args[1]) != null) {
                                if (Bukkit.getPluginManager().getPlugin("NBTAPI") != null) {
                                    ConsoleGive.giveCommand(sender, args[1], args[2]);
                                } else {
                                    sender.sendMessage(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4NBTAPI could not be connected / found! " +
                                            "§9Please download it here: §6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefaultValue.PrefixHC);
                                }
                            } else {
                                sender.sendMessage(DefaultValue.PlayerNotFound.replace("[player]", args[1]));
                            }
                        } else {
                            Help.Help(sender);
                        }
                        break;
                    case "giveall":
                        if (args.length == 2) {

                            if (Bukkit.getPluginManager().getPlugin("NBTAPI") != null) {
                                ConsoleGiveAll.giveCommand(sender, args[1]);
                            } else {
                                sender.sendMessage(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4NBTAPI could not be connected / found! " +
                                        "§9Please download it here: §6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefaultValue.PrefixHC);
                            }

                        } else {
                            Help.Help(sender);
                        }
                        break;
                }
            } else {
                sender.sendMessage("§8[§2Wonder§6Bag§9Shop§8] §cThis command is only for players!");
            }
        }
        return false;
    }
}