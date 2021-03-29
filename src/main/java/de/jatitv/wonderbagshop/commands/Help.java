// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.commands;

import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Help {

    public static void Help(CommandSender sender) {
        if (sender.hasPermission("wonderbagshop.command")
                || sender.hasPermission("wonderbagshop.command.info")
                || sender.hasPermission("wonderbagshop.command.give")
                || sender.hasPermission("wonderbagshop.command.gift")
                || sender.hasPermission("wonderbagshop.admin")
                || sender.isOp()) {
            sender.sendMessage(DefaultValue.PrefixHC + " §8----- §2Wonder§6Bag§9Shop §chelp §8-----");
            sender.sendMessage(DefaultValue.PrefixHC);
            if (sender.hasPermission("wonderbagshop.command") || sender.isOp()) {
                sender.sendMessage(DefaultValue.PrefixHC + " " + DefaultValue.HelpHelp);
                sender.sendMessage(DefaultValue.PrefixHC + " " + DefaultValue.HelpShop);
            }
            if (sender.hasPermission("wonderbagshop.command.info") || sender.isOp()) {
                sender.sendMessage(DefaultValue.PrefixHC + " " + DefaultValue.HelpInfo);
            }
            if (sender.hasPermission("wonderbagshop.command.gift") || sender.isOp()) {
                sender.sendMessage(DefaultValue.PrefixHC + " " + DefaultValue.HelpGift);
            }
            if (sender instanceof Player) {
                if (sender.hasPermission("wonderbagshop.command.give") || sender.isOp()) {
                    sender.sendMessage(DefaultValue.PrefixHC + " " + DefaultValue.HelpGive);
                }
                if (sender.hasPermission("wonderbagshop.command.giveall") || sender.isOp()) {
                    sender.sendMessage(DefaultValue.PrefixHC + " " + DefaultValue.HelpGiveAll);
                }
            } else {
                if (sender.hasPermission("wonderbagshop.command.give") || sender.isOp()) {
                    sender.sendMessage(DefaultValue.PrefixHC + " " + DefaultValue.HelpGive);
                    sender.sendMessage(DefaultValue.PrefixHC + " " + DefaultValue.HelpGiveConsole);
                }
                if (sender.hasPermission("wonderbagshop.command.giveall") || sender.isOp()) {
                    sender.sendMessage(DefaultValue.PrefixHC + " " + DefaultValue.HelpGiveAll);
                    sender.sendMessage(DefaultValue.PrefixHC + " " + DefaultValue.HelpGiveAllConsole);
                }
            }
            if (sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                sender.sendMessage(DefaultValue.PrefixHC + " " + DefaultValue.HelpSettings);
            }
            if (sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                sender.sendMessage(DefaultValue.PrefixHC + " " + DefaultValue.HelpReload);
            }
            sender.sendMessage(DefaultValue.PrefixHC);
            sender.sendMessage(DefaultValue.PrefixHC + " §8----------------------------");
        } else {
            sender.sendMessage(DefaultValue.NoPermission);
        }
    }

}
