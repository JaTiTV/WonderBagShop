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
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class Load {

    public static void LoadSend(String version) throws InterruptedException {
        File configYML = new File(Main.thisp().getDataFolder().getPath(), "Config.yml");
        YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);

        if (yamlConfiguration_config.getInt("Plugin.Debug.DebugStage_(1-3)") > 3) {
            yamlConfiguration_config.set("Plugin.Debug.DebugStage_(1-3)", 3);
        }

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
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2Spigot: §6" + Main.Spigot);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2Discord: §6" + Main.DiscordLoad);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
        if (yamlConfiguration_config.getBoolean("Plugin.Debug.Enable")) {
            int DebugStage = yamlConfiguration_config.getInt("Plugin.Debug.DebugStage_(1-3)");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4-------------------------------");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Debugmodus is enable on stage: §6" + DebugStage + " §4!!!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4-------------------------------");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4");
            Thread.sleep(5000);
        }
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Plugin load...");
        if (Main.UpdateMSG) {
            String ver = (String) yamlConfiguration_config.get("Do_not_remove_or_change.Version");
            if (configYML.isFile()) {
                if (ver == null){
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4-------------------------------");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                    Bukkit.getConsoleSender().sendMessage(Main.UpdateInfo);
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4-------------------------------");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                    Thread.sleep(20000);
                } else {
                    if (!ver.equals(Main.getPlugin().getDescription().getVersion())) {

                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4-------------------------------");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                        Bukkit.getConsoleSender().sendMessage(Main.UpdateInfo);
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4-------------------------------");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2");
                        Thread.sleep(20000);
                    } else Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
                }
            } else {
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4");
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4");
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6Thanks for downloading and installing WonderBagShop");
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4");
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4");
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
                Thread.sleep(5000);
            }
        }

        Config.configCreate();
        Thread.sleep(1000);

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");

        WonderBagChest_1.WB1ChestCreate();
        Thread.sleep(1000);

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");

        WonderBagChest_2.WB2ChestCreate();
        Thread.sleep(1000);

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");

        WonderBagChest_3.WB3ChestCreate();
        Thread.sleep(1000);

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");

        WonderBagItem_1.WB1ItemCreate();
        Thread.sleep(1000);

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");

        WonderBagItem_2.WB2ItemCreate();
        Thread.sleep(1000);

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");

        WonderBagItem_3.WB3ItemCreate();
        Thread.sleep(1000);

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");

        Messages.messagesCreate();
        Thread.sleep(1000);

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");

        Vault.loadVault();

        if (Bukkit.getPluginManager().getPlugin("NBTAPI") == null || Bukkit.getPluginManager().getPlugin("Vault") == null) {
            if (Bukkit.getPluginManager().getPlugin("NBTAPI") == null) {
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4NBTAPI could not be found! §9Please download it here: " +
                        "§6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefultValue.PrefixHC);
            }
            if (Bukkit.getPluginManager().getPlugin("Vault") == null) {
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4Vault could not be found! §9Please download it here: " +
                        "§6https://www.spigotmc.org/resources/vault.34315/§4\n" + DefultValue.PrefixHC);
            }
            Thread.sleep(10000);
        }
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§8-------------------------------");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2Plugin loaded successfully.");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2-----------------------------------------------------------------------------------");
    }
}