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

package de.jatitv.wonderbagshop.settingsGUI;

import de.jatitv.wonderbagshop.defultValue.DefultValue;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigDEFULT {

    public static void configDEFULTCreate() {

        File configYML = new File(Main.thisp().getDataFolder().getPath(), "Config.yml");
        YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);


        yamlConfiguration_config.set("Shop.GUI_Name", "&2Wonder&6Bag&9Shop");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6ShopName_GUI §4was set to §9Config.yml§4!");


        yamlConfiguration_config.set("Shop.Currency", "$");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Currency §4was set to §9Config.yml§4!");


        yamlConfiguration_config.set("Shop.ItemNumbers", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6ItemNumbers §4was set to §9Config.yml§4!");


        yamlConfiguration_config.set("WonderBags.UseChest", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6UseChest §4was set to §9Config.yml§4!");

        yamlConfiguration_config.set("WonderBags.UseChest_and_Item", false);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6UseChest_and_Item §4was set to §9Config.yml§4!");

        yamlConfiguration_config.set("WonderBags.ChestDrop", false);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6ChestDrop §4was set to §9Config.yml§4!");


        /**
         *Sound
         */


        yamlConfiguration_config.set("Sound.Buy.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Buy Enable §4was set to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.Buy.Sound", "ENTITY_PLAYER_LEVELUP");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6Sound Buy §4was set to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.NoMoney.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoMoney Enable §4was set to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.NoMoney.Sound", "BLOCK_NOTE_BLOCK_HARP");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6 Sound NoMoney §4was set to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.NoInventorySpace.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoInventorySpace Enable §4was set to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.NoInventorySpace.Sound", "BLOCK_NOTE_BLOCK_GUITAR");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6Sound NoInventorySpace §4was set to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.Give.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Give Enable §4was set to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.Give.Sound", "ENTITY_PLAYER_LEVELUP");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6Sound Give §4was set to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.Gift.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Gift Enable §4was set to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.Gift.Sound", "ENTITY_PLAYER_LEVELUP");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6Sound Gift §4was set to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.PlayerNotFound.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound PlayerNotFound Enable §4was set to §9Config.yml§4!");

        yamlConfiguration_config.set("Sound.PlayerNotFound.Sound", "ENTITY_PLAYER_LEVELUP");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6Sound Send §4was set to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.NoInventorySpace.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoInventorySpace Enable §4was set to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.NoInventorySpace.Sound", "BLOCK_NOTE_BLOCK_GUITAR");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6Sound NoInventorySpace §4was set to §9Config.yml§4!");


        try {
            yamlConfiguration_config.save(configYML);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}