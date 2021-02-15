// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.main;

import de.jatitv.wonderbagshop.config.Config;
import de.jatitv.wonderbagshop.config.Messages;
import de.jatitv.wonderbagshop.config.Shop;
import org.bukkit.Bukkit;

public class Load {

    public static void LoadSend(String version) {
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2-----------------------------------------------------------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2 __          __             _           §6____               §9_____ _                 ");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2 \\ \\        / /            | |         §6|  _ \\             §9/ ____| |                ");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2  \\ \\  /\\  / /__  _ __   __| | ___ _ __§6| |_) | __ _  __ _§9| (___ | |__   ___  _ __  ");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2   \\ \\/  \\/ / _ \\| '_ \\ / _` |/ _ \\ '__§6|  _ < / _` |/ _` |§9\\___ \\| '_ \\ / _ \\| '_ \\ ");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2    \\  /\\  / (_) | | | | (_| |  __/ |  §6| |_) | (_| | (_| |§9____) | | | | (_) | |_) |");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2     \\/  \\/ \\___/|_| |_|\\__,_|\\___|_|  §6|____/ \\__,_|\\__, |§9_____/|_| |_|\\___/| .__/ ");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2                                                    §6 __/ |                  §9| |    ");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2                                                    §6|___/                   §9|_|    ");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2Autor: §6JaTiTV");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2Version: §6" + version);
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Config.configCreate();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Messages.messagesCreate();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Shop.shopCreate();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Vault.loadVault();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2-----------------------------------------------------------------------------------");
    }


}
