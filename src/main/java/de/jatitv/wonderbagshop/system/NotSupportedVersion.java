// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.system;

import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import org.bukkit.Bukkit;

public class NotSupportedVersion {

    public static void notSupportedVersion(String version){
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4-----------------------------------------------------------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2 __          __             _           §6____               §9_____ _                 ");
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2 \\ \\        / /            | |         §6|  _ \\             §9/ ____| |                ");
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2  \\ \\  /\\  / /__  _ __   __| | ___ _ __§6| |_) | __ _  __ _§9| (___ | |__   ___  _ __  ");
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2   \\ \\/  \\/ / _ \\| '_ \\ / _` |/ _ \\ '__§6|  _ < / _` |/ _` |§9\\___ \\| '_ \\ / _ \\| '_ \\ ");
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2    \\  /\\  / (_) | | | | (_| |  __/ |  §6| |_) | (_| | (_| |§9____) | | | | (_) | |_) |");
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2     \\/  \\/ \\___/|_| |_|\\__,_|\\___|_|  §6|____/ \\__,_|\\__, |§9_____/|_| |_|\\___/| .__/ ");
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2                                                    §6 __/ |                  §9| |    ");
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2                                                    §6|___/                   §9|_|    ");
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4");
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2Autor: §6JaTiTV");
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2Version: §6" + version);
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2Spigot: §6" + Main.Spigot);
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2Discord: §6" + Main.Discord);
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4You are using §2Wonder§6Bag§9Shop §4with an unsupported Minecraft version. Please use at least version §61.13§4!");
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4-----------------------------------------------------------------------------------");
    }

}
