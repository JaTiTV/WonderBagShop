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

package de.jatitv.wonderbagshop.commands;

import de.jatitv.wonderbagshop.config.Config;
import de.jatitv.wonderbagshop.config.Messages;
import de.jatitv.wonderbagshop.config.Shop;
import de.jatitv.wonderbagshop.main.Vault;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Reload {

    public static void reloadConfirmPlayer(Player player) {
        player.sendMessage(Messages.PrefixHC + Messages.ReloadStart);

        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§6Plugin reload...");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Config.configCreate();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Shop.shopCreate();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Messages.messagesCreate();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Vault.loadVault();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2Plugin successfully reloaded.");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");

        player.sendMessage(Messages.PrefixHC + Messages.ReloadEnd);
    }
    public static void reloadConfirmConsole() {
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§6Plugin reload...");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Config.configCreate();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Shop.shopCreate();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Messages.messagesCreate();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Vault.loadVault();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2Plugin successfully reloaded.");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
    }
}
