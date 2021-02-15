// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.commands;

import de.jatitv.wonderbagshop.config.Config;
import de.jatitv.wonderbagshop.config.Messages;
import de.jatitv.wonderbagshop.config.Shop;
import de.jatitv.wonderbagshop.main.Vault;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Reload {

    public static void reloadConfirmPlayer(Player player) {
        player.sendMessage("§8[§2Wonder§6Bag§9Shop§8] " + Messages.ReloadStart);

        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§6Plugin reload...");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§8-------------------------------");
        Config.configCreate();
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2");
        Messages.messagesCreate();
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2");
        Shop.shopCreate();
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2");
        Vault.loadVault();
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2Plugin successfully reloaded.");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§8-------------------------------");

        player.sendMessage("§8[§2Wonder§6Bag§9Shop§8] " + Messages.ReloadEnd);
    }
    public static void reloadConfirmConsole() {
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§6Plugin reload...");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§8-------------------------------");
        Config.configCreate();
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2");
        Messages.messagesCreate();
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2");
        Shop.shopCreate();
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2");
        Vault.loadVault();
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2Plugin successfully reloaded.");
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§8-------------------------------");
    }
}
