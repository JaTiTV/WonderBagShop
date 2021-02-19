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

import de.jatitv.wonderbagshop.config.*;
import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import de.jatitv.wonderbagshop.main.Vault;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Reload {

    public static void reloadConfirmPlayer(Player player) {
        player.sendMessage(DefultValue.PrefixHC + DefultValue.ReloadStart);

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6Plugin reload...");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Config.configCreate();
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        WonderBag_1.WB1Create();
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        WonderBag_2.WB2Create();
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        WonderBag_3.WB3Create();
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Messages.messagesCreate();
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Vault.loadVault();
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        if (Bukkit.getPluginManager().getPlugin("NBTAPI") == null) {
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4NBTAPI could not be connected / found! §9Please download it here: " +
                    "§6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefultValue.PrefixHC);
        }
        if (Bukkit.getPluginManager().getPlugin("Vault") == null) {
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4Vault could not be connected / found! §9Please download it here: " +
                    "§6https://www.spigotmc.org/resources/vault.34315/§4\n" + DefultValue.PrefixHC);
        }
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2Plugin successfully reloaded.");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");

        player.sendMessage(DefultValue.PrefixHC + DefultValue.ReloadEnd);
    }
    public static void reloadConfirmConsole() {
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6Plugin reload...");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Config.configCreate();
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        WonderBag_1.WB1Create();
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        WonderBag_2.WB2Create();
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        WonderBag_3.WB3Create();
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Messages.messagesCreate();
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Vault.loadVault();
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        if (Bukkit.getPluginManager().getPlugin("NBTAPI") == null) {
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4NBTAPI could not be connected / found! §9Please download it here: " +
                    "§6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefultValue.PrefixHC);
        }
        if (Bukkit.getPluginManager().getPlugin("Vault") == null) {
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4Vault could not be connected / found! §9Please download it here: " +
                    "§6https://www.spigotmc.org/resources/vault.34315/§4\n" + DefultValue.PrefixHC);
        }
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2Plugin successfully reloaded.");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
    }
}