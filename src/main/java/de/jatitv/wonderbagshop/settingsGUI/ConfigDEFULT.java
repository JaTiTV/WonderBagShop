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


        yamlConfiguration_config.set("Plugin.UpdateCheckOnJoin", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6UpdateCheckOnJoin §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Plugin.Debug.Enable", false);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Debug Enable §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Plugin.Debug.DebugStage_(1-3)", 1);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6DebugStage §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Shop.GUI_Name", "&2Wonder&6Bag&9Shop");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6ShopName_GUI §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Shop.Currency", "$");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Currency §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Shop.ItemNumbers", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6ItemNumbers §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("WonderBags.UseChest", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6UseChest §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("WonderBags.UseChest_and_Item", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6UseChest_and_Item §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("WonderBags.ChestDrop", false);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6ChestDrop §4was added to §9Config.yml§4!");


        /**
         *Sound
         */


        yamlConfiguration_config.set("Sound.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Enable §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.Buy.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Buy Enable §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.Buy.Sound", "ENTITY_PLAYER_LEVELUP");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Buy §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.NoMoney.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoMoney Enable §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.NoMoney.Sound", "BLOCK_NOTE_BLOCK_HARP");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoMoney §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.NoInventorySpace.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoInventorySpace Enable §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.NoInventorySpace.Sound", "BLOCK_NOTE_BLOCK_GUITAR");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoInventorySpace §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.Give.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Give Enable §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.Give.Sound", "ENTITY_PLAYER_LEVELUP");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Give §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.Gift.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Gift Enable §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.Gift.Sound", "ENTITY_PLAYER_LEVELUP");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Gift §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.PlayerNotFound.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound PlayerNotFound Enable §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.PlayerNotFound.Sound", "ENTITY_PLAYER_LEVELUP");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Send §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Sound.NoInventorySpace.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoInventorySpace Enable §4was added to §9Config.yml§4!");

        yamlConfiguration_config.set("Sound.NoInventorySpace.Sound", "BLOCK_NOTE_BLOCK_GUITAR");
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoInventorySpace §4was added to §9Config.yml§4!");


        /**
         * Title
         */


        yamlConfiguration_config.set("Title.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title Enable §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Title.Reload.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title Reload Enable §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Title.NoMoney.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title NoM oney Enable §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Title.NoInventorySpace.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title NoInventorySpace Enable §4was added to §9Config.yml§4!");

        yamlConfiguration_config.set("Title.Give.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title Give Enable §4was added to §9Config.yml§4!");


        yamlConfiguration_config.set("Title.GiveReceived.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title GiveReceived Enable §4was added to §9Config.yml§4!");

        yamlConfiguration_config.set("Title.Gift.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title Gift Enable §4was added to §9Config.yml§4!");

        yamlConfiguration_config.set("Title.GiftReceived.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title GiftReceived Enable §4was added to §9Config.yml§4!");

        yamlConfiguration_config.set("Title.PlayerNoInventorySpace.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title PlayerNoInventorySpace Enable §4was added to §9Config.yml§4!");

        yamlConfiguration_config.set("Title.PlayerNotFound.Enable", true);
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title PlayerNotFound Enable §4was added to §9Config.yml§4!");


        try {
            yamlConfiguration_config.save(configYML);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}