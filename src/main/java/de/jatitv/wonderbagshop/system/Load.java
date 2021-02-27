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

package de.jatitv.wonderbagshop.system;

import de.jatitv.wonderbagshop.config.*;
import de.jatitv.wonderbagshop.defultValue.DefultValue;
import org.bukkit.Bukkit;

public class Load {

    public static void LoadSend(String version) throws InterruptedException {
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2-----------------------------------------------------------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2 __          __             _           §6____               §9_____ _                 ");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2 \\ \\        / /            | |         §6|  _ \\             §9/ ____| |                ");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2  \\ \\  /\\  / /__  _ __   __| | ___ _ __§6| |_) | __ _  __ _§9| (___ | |__   ___  _ __  ");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2   \\ \\/  \\/ / _ \\| '_ \\ / _` |/ _ \\ '__§6|  _ < / _` |/ _` |§9\\___ \\| '_ \\ / _ \\| '_ \\ ");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2    \\  /\\  / (_) | | | | (_| |  __/ |  §6| |_) | (_| | (_| |§9____) | | | | (_) | |_) |");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2     \\/  \\/ \\___/|_| |_|\\__,_|\\___|_|  §6|____/ \\__,_|\\__, |§9_____/|_| |_|\\___/| .__/ ");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2                                                    §6 __/ |                  §9| |    ");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2                                                    §6|___/                   §9|_|    ");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2Autor: §6JaTiTV");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2Version: §6" + version);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Config.configCreate();
        Thread.sleep(1000);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        WonderBagChest_1.WB1ChestCreate();
        Thread.sleep(1000);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        WonderBagChest_2.WB2ChestCreate();
        Thread.sleep(1000);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        WonderBagChest_3.WB3ChestCreate();
        Thread.sleep(1000);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        WonderBagItem_1.WB1ItemCreate();
        Thread.sleep(1000);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        WonderBagItem_2.WB2ItemCreate();
        Thread.sleep(1000);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        WonderBagItem_3.WB3ItemCreate();
        Thread.sleep(1000);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Messages.messagesCreate();
        Thread.sleep(1000);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Vault.loadVault();
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        if (Bukkit.getPluginManager().getPlugin("NBTAPI") == null || Bukkit.getPluginManager().getPlugin("Vault") == null){
            if (Bukkit.getPluginManager().getPlugin("NBTAPI") == null) {
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4NBTAPI could not be found! §9Please download it here: " +
                        "§6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefultValue.PrefixHC);
            }
            if (Bukkit.getPluginManager().getPlugin("Vault") == null) {
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4Vault could not be found! §9Please download it here: " +
                        "§6https://www.spigotmc.org/resources/vault.34315/§4\n" + DefultValue.PrefixHC);
            }
            Thread.sleep(30000);
        }
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2-----------------------------------------------------------------------------------");
    }
}