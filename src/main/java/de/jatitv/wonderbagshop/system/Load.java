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
import de.jatitv.wonderbagshop.config.wonderBags.chest.WonderBagChest_1;
import de.jatitv.wonderbagshop.config.wonderBags.chest.WonderBagChest_2;
import de.jatitv.wonderbagshop.config.wonderBags.chest.WonderBagChest_3;
import de.jatitv.wonderbagshop.config.wonderBags.item.WonderBagItem_1;
import de.jatitv.wonderbagshop.config.wonderBags.item.WonderBagItem_2;
import de.jatitv.wonderbagshop.config.wonderBags.item.WonderBagItem_3;
import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import de.jatitv.wonderbagshop.defaultValue.ItemsSelect;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.List;

public class Load {

    public static void LoadSend(String Prefix, List Autor, String Version, String Spigot, String Discord) throws InterruptedException {
        Long long_ = Long.valueOf(System.currentTimeMillis());
        File configYML = new File(Main.thisp().getDataFolder().getPath(), "Config.yml");
        YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);

        if (configYML.isFile()){
            if (yamlConfiguration_config.getInt("Plugin.Debug.DebugStage_(1-3)") > 3) {
                yamlConfiguration_config.set("Plugin.Debug.DebugStage_(1-3)", 3);
            }
        }

        send.console(Main.Prefix + "§4============================= §8[§2Wonder§6Bag§9Shop§8] §4=============================");
        send.console(DefaultValue.PrefixHC + "§2");
        send.console(DefaultValue.PrefixHC + "§2 __          __             _           §6____               §9_____ _                 ");
        send.console(DefaultValue.PrefixHC + "§2 \\ \\        / /            | |         §6|  _ \\             §9/ ____| |                ");
        send.console(DefaultValue.PrefixHC + "§2  \\ \\  /\\  / /__  _ __   __| | ___ _ __§6| |_) | __ _  __ _§9| (___ | |__   ___  _ __  ");
        send.console(DefaultValue.PrefixHC + "§2   \\ \\/  \\/ / _ \\| '_ \\ / _` |/ _ \\ '__§6|  _ < / _` |/ _` |§9\\___ \\| '_ \\ / _ \\| '_ \\ ");
        send.console(DefaultValue.PrefixHC + "§2    \\  /\\  / (_) | | | | (_| |  __/ |  §6| |_) | (_| | (_| |§9____) | | | | (_) | |_) |");
        send.console(DefaultValue.PrefixHC + "§2     \\/  \\/ \\___/|_| |_|\\__,_|\\___|_|  §6|____/ \\__,_|\\__, |§9_____/|_| |_|\\___/| .__/ ");
        send.console(DefaultValue.PrefixHC + "§2                                                    §6 __/ |                  §9| |    ");
        send.console(DefaultValue.PrefixHC + "§2                                                    §6|___/                   §9|_|    ");
        send.console(DefaultValue.PrefixHC + "§2");
        send.console(Prefix + " §2Autor: §6" + String.valueOf(Autor).replace("[", "").replace("]", ""));
        send.console(Prefix + " §2Version: §6" + Version);
        send.console(Prefix + " §2Spigot: §6" + Spigot);
        send.console(Prefix + " §2Discord: §6" + Discord);

        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Plugin load...");

        ItemsSelect.Select();
        Config.configCreate();
        send.console(DefaultValue.PrefixHC + "§8-------------------------------");
        WonderBagChest_1.WB1ChestCreate();
        send.console(DefaultValue.PrefixHC + "§8-------------------------------");
        WonderBagChest_2.WB2ChestCreate();
        send.console(DefaultValue.PrefixHC + "§8-------------------------------");
        WonderBagChest_3.WB3ChestCreate();
        send.console(DefaultValue.PrefixHC + "§8-------------------------------");
        WonderBagItem_1.WB1ItemCreate();
        send.console(DefaultValue.PrefixHC + "§8-------------------------------");
        WonderBagItem_2.WB2ItemCreate();
        send.console(DefaultValue.PrefixHC + "§8-------------------------------");
        WonderBagItem_3.WB3ItemCreate();
        send.console(DefaultValue.PrefixHC + "§8-------------------------------");
        Messages_EN.messagesCreate();
        send.console(DefaultValue.PrefixHC + "§8-------------------------------");
        Messages_DE.messagesCreate();
        send.console(DefaultValue.PrefixHC + "§8-------------------------------");
        Messages_FR.messagesCreate();
        send.console(DefaultValue.PrefixHC + "§8-------------------------------");
        Messages_NO.messagesCreate();
        send.console(DefaultValue.PrefixHC + "§8-------------------------------");
        Messages_Select.selectCreate();
        send.console(DefaultValue.PrefixHC + "§8-------------------------------");
        Vault.loadVault();
        if (Bukkit.getPluginManager().getPlugin("NBTAPI") == null || Bukkit.getPluginManager().getPlugin("Vault") == null) {
            if (Bukkit.getPluginManager().getPlugin("NBTAPI") == null) {
                send.console(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4NBTAPI could not be found! §9Please download it here: " +
                        "§6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefaultValue.PrefixHC);
            }
            if (Bukkit.getPluginManager().getPlugin("Vault") == null) {
                send.console(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4Vault could not be found! §9Please download it here: " +
                        "§6https://www.spigotmc.org/resources/vault.34315/§4\n" + DefaultValue.PrefixHC);
            }
            Thread.sleep(5000);
        }
        UpdateChecker.onUpdateCheck();
        send.console(DefaultValue.PrefixHC + "§8-------------------------------");
        send.console(Prefix + " §2Plugin loaded successfully." + " §7- §e" + (System.currentTimeMillis() - long_.longValue()) + "ms");
        send.console(Main.Prefix + "§4========================================================================");
    }
}