// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.commands;

import de.jatitv.wonderbagshop.config.Messages;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WonderBagShop {

    private static CommandSender.Spigot player;

    public static void testSend(Player player) {
        player.sendMessage(Messages.Help);
    }

}
