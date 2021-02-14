// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.main;

import de.jatitv.wonderbagshop.commands.Reload;
import de.jatitv.wonderbagshop.commands.Shop;
import de.jatitv.wonderbagshop.config.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdExecuter implements CommandExecutor {

    private void Version(String version) {
        String VER = version;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                if (player.hasPermission("wonderbagshop.command")) {
                    Shop.openShop(player);
                } else {
                    player.sendMessage(Messages.NoPermission.replace("[command]", "/wonderbagshop").replace("[permission]", "wonderbagshop.command"));
                }
            } else {
                switch (args[0].toLowerCase()) {
                    case "info":
                    case "plugin":
                    case "pl":
                    case "version":
                        if (player.hasPermission("wonderbagshop.command.info") || player.hasPermission("wonderbagshop.admin") || player.isOp()){
                            sender.sendMessage(Messages.Prefix + "§8-------- §4Plugin-Info §8--------");
                            sender.sendMessage(Messages.Prefix + "§2");
                            sender.sendMessage(Messages.Prefix + "§2This plugin was developed by §9JaTiTV §8(german)§2.");
                            sender.sendMessage(Messages.Prefix + "§2");
                            sender.sendMessage(Messages.Prefix + "§2Twitch: §ehttps://www.twitch.tv/jatitv");
                            sender.sendMessage(Messages.Prefix + "§2Support-Discord: §eComming Soon!");
                            sender.sendMessage(Messages.Prefix + "§2Spigot: §eComming Soon!");
                            sender.sendMessage(Messages.Prefix + "§2");
                            sender.sendMessage(Messages.Prefix + "§2Version: §9" + Main.getPlugin().getDescription().getVersion());
                            sender.sendMessage(Messages.Prefix + "§2API: §9" + Main.getPlugin().getDescription().getAPIVersion());
                            sender.sendMessage(Messages.Prefix + "§2");
                            sender.sendMessage(Messages.Prefix + "§8--------------------------");
                        } else {
                            player.sendMessage(Messages.NoPermission.replace("[command]", "/wonderbagshop info").replace("[permission]", "wonderbagshop.command.info"));
                        }
                        break;
                    case "reload":
                    case "rl":
                        if (player.hasPermission("wonderbagshop.command.reload") || player.isOp()){
                        Reload.reloadConfirmPlayer(player);
                        } else {
                            player.sendMessage(Messages.NoPermission.replace("[command]", "/wonderbagshop reload").replace("[permission]", "wonderbagshop.command.reload"));
                        }
                        break;
                    case "help":
                    default:
                        if (player.hasPermission("wonderbagshop.command.admin") || player.isOp()){
                            player.sendMessage(Messages.Help);
                        } else {
                            player.sendMessage(Messages.NoPermission.replace("[command]", "/wonderbagshop help").replace("[permission]", "wonderbagshop.command"));
                        }
                        break;
                }
            }
        } else {
            if (args.length == 1) {
                switch (args[0].toLowerCase()) {
                    case "info":
                    case "plugin":
                    case "pl":
                    case "version":
                        sender.sendMessage(Messages.Prefix + "§8-------- §4Plugin-Info §8--------");
                        sender.sendMessage(Messages.Prefix + "§2");
                        sender.sendMessage(Messages.Prefix + "§2This plugin was developed by §9JaTiTV §8(german)§2.");
                        sender.sendMessage(Messages.Prefix + "§2");
                        sender.sendMessage(Messages.Prefix + "§2Twitch: §ehttps://www.twitch.tv/jatitv");
                        sender.sendMessage(Messages.Prefix + "§2Support-Discord: §eComming Soon!");
                        sender.sendMessage(Messages.Prefix + "§2Spigot: §eComming Soon!");
                        sender.sendMessage(Messages.Prefix + "§2");
                        sender.sendMessage(Messages.Prefix + "§2Version: §9" + Main.getPlugin().getDescription().getVersion());
                        sender.sendMessage(Messages.Prefix + "§2API: §9" + Main.getPlugin().getDescription().getAPIVersion());
                        sender.sendMessage(Messages.Prefix + "§2");
                        sender.sendMessage(Messages.Prefix + "§8-----------------------------");
                        break;
                    default:
                        sender.sendMessage(Messages.Help);
                        break;
                    case "rl":
                    case "reload":
                        Reload.reloadConfirmConsole();
                        break;
                }
            }else{
                sender.sendMessage("§8[§2Wonder§6Bag§9Shop§8] §cThis command is only for players!");
            }
        }
        return false;
    }
}
