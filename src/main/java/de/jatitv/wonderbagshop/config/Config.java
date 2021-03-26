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

package de.jatitv.wonderbagshop.config;

import de.jatitv.wonderbagshop.defultValue.DefultValue;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Config{


    public static void configCreate() throws InterruptedException {

        File configYML = new File(Main.thisp().getDataFolder().getPath(), "Config.yml");
        YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Config.yml load...");


        if (!yamlConfiguration_config.contains("Do_not_remove_or_change.Created")) {
            yamlConfiguration_config.set("Do_not_remove_or_change.Created", "This file was created with version " + Main.getPlugin().getDescription().getVersion());
        }

        yamlConfiguration_config.set("Do_not_remove_or_change.Version", Main.getPlugin().getDescription().getVersion());

        yamlConfiguration_config.set("Do_not_remove_or_change.Autor", Main.Autor);

        yamlConfiguration_config.set("Do_not_remove_or_change.Spigot", Main.Spigot);

        yamlConfiguration_config.set("Do_not_remove_or_change.Discord", Main.Discord);



        if (yamlConfiguration_config.contains("Plugin.UpdateCheckOnJoin")) {
            DefultValue.UpdateCheckOnJoin = yamlConfiguration_config.getBoolean("Plugin.UpdateCheckOnJoin");
        } else {
            yamlConfiguration_config.set("Plugin.UpdateCheckOnJoin", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6UpdateCheckOnJoin §4was added to §9Config.yml§4!");
        }

        if (yamlConfiguration_config.contains("Plugin.Debug.Enable")) {
            DefultValue.Debug = yamlConfiguration_config.getBoolean("Plugin.Debug.Enable");
        } else {
            yamlConfiguration_config.set("Plugin.Debug.Enable", false);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Debug Enable §4was added to §9Config.yml§4!");
        }

        if (yamlConfiguration_config.contains("Plugin.Debug.DebugStage_(1-3)")) {
            DefultValue.DebugStage = yamlConfiguration_config.getInt("Plugin.Debug.DebugStage_(1-3)");
        } else {
            yamlConfiguration_config.set("Plugin.Debug.DebugStage_(1-3)", 1);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6DebugStage §4was added to §9Config.yml§4!");
        }
        if (yamlConfiguration_config.getInt("Plugin.Debug.DebugStage_(1-3)") > 3) {
            yamlConfiguration_config.set("Plugin.Debug.DebugStage_(1-3)", 3);
        }
        if (yamlConfiguration_config.getInt("Plugin.Debug.DebugStage_(1-3)") < 1) {
            yamlConfiguration_config.set("Plugin.Debug.DebugStage_(1-3)", 1);
        }

        if (yamlConfiguration_config.contains("Shop.GUI_Name")) {
            DefultValue.GUI_Name = replace(yamlConfiguration_config.getString("Shop.GUI_Name"));
        } else {
            yamlConfiguration_config.set("Shop.GUI_Name", "&2Wonder&6Bag&9Shop");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6ShopName_GUI §4was added to §9Config.yml§4!");
        }

        if (yamlConfiguration_config.contains("Shop.Currency")) {
            DefultValue.Currency = yamlConfiguration_config.getString("Shop.Currency");
        } else {
            yamlConfiguration_config.set("Shop.Currency", "$");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Currency §4was added to §9Config.yml§4!");
        }

        if (yamlConfiguration_config.contains("Shop.ItemNumbers")) {
            DefultValue.ItemNumbers = yamlConfiguration_config.getBoolean("Shop.ItemNumbers");
        } else {
            yamlConfiguration_config.set("Shop.ItemNumbers", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6ItemNumbers §4was added to §9Config.yml§4!");
        }

        if (yamlConfiguration_config.contains("WonderBags.UseChest")) {
            DefultValue.UseChest = yamlConfiguration_config.getBoolean("WonderBags.UseChest");
        } else {
            yamlConfiguration_config.set("WonderBags.UseChest", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6UseChest §4was added to §9Config.yml§4!");
        }

        if (yamlConfiguration_config.contains("WonderBags.UseChest_and_Item")) {
            DefultValue.UseChest_and_Item = yamlConfiguration_config.getBoolean("WonderBags.UseChest_and_Item");
        } else {
            yamlConfiguration_config.set("WonderBags.UseChest_and_Item", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6UseChest_and_Item §4was added to §9Config.yml§4!");
        }

        if (yamlConfiguration_config.contains("WonderBags.ChestDrop")) {
            DefultValue.ChestDrop = yamlConfiguration_config.getBoolean("WonderBags.ChestDrop");
        } else {
            yamlConfiguration_config.set("WonderBags.ChestDrop", false);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6ChestDrop §4was added to §9Config.yml§4!");
        }

        if (yamlConfiguration_config.contains("WonderBags.RemoveChestInCreativemode")) {
            DefultValue.RemoveChestInCreativemode = yamlConfiguration_config.getBoolean("WonderBags.RemoveChestInCreativemode");
        } else {
            yamlConfiguration_config.set("WonderBags.RemoveChestInCreativemode", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6RemoveChestInCreativemode §4was added to §9Config.yml§4!");
        }

        /**
         *Sound
         */

        if (yamlConfiguration_config.contains("Sound.Enable")) {
            DefultValue.Sound_Enable = yamlConfiguration_config.getBoolean("Sound.Enable");
        } else {
            yamlConfiguration_config.set("Sound.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Enable §4was added to §9Config.yml§4!");
        }

        if (yamlConfiguration_config.contains("Sound.Buy.Enable")) {
            DefultValue.Sound_Shop_Buy_Enable = yamlConfiguration_config.getBoolean("Sound.Buy.Enable");
        } else {
            yamlConfiguration_config.set("Sound.Buy.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Buy Enable §4was added to §9Config.yml§4!");
        }
        if (yamlConfiguration_config.contains("Sound.Buy.Sound")) {
            DefultValue.Sound_Shop_Buy_input = replace(yamlConfiguration_config.getString("Sound.Buy.Sound").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_config.set("Sound.Buy.Sound", "ENTITY_PLAYER_LEVELUP");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Buy §4was added to §9Config.yml§4!");
        }


        if (yamlConfiguration_config.contains("Sound.NoMoney.Enable")) {
            DefultValue.Sound_Shop_NoMoney_Enable = yamlConfiguration_config.getBoolean("Sound.NoMoney.Enable");
        } else {
            yamlConfiguration_config.set("Sound.NoMoney.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoMoney Enable §4was added to §9Config.yml§4!");
        }
        if (yamlConfiguration_config.contains("Sound.NoMoney.Sound")) {
            DefultValue.Sound_Shop_NoMoney_input = replace(yamlConfiguration_config.getString("Sound.NoMoney.Sound").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_config.set("Sound.NoMoney.Sound", "BLOCK_NOTE_BLOCK_HARP");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoMoney §4was added to §9Config.yml§4!");
        }


        if (yamlConfiguration_config.contains("Sound.NoInventorySpace.Enable")) {
            DefultValue.Sound_Shop_NoInventorySpace_Enable = yamlConfiguration_config.getBoolean("Sound.NoInventorySpace.Enable");
        } else {
            yamlConfiguration_config.set("Sound.NoInventorySpace.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoInventorySpace Enable §4was added to §9Config.yml§4!");
        }
        if (yamlConfiguration_config.contains("Sound.NoInventorySpace.Sound")) {
            DefultValue.Sound_Shop_NoInventorySpace_input = replace(yamlConfiguration_config.getString("Sound.NoInventorySpace.Sound").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_config.set("Sound.NoInventorySpace.Sound", "BLOCK_NOTE_BLOCK_GUITAR");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoInventorySpace §4was added to §9Config.yml§4!");
        }


        if (yamlConfiguration_config.contains("Sound.Give.Enable")) {
            DefultValue.Sound_Give_Enable = yamlConfiguration_config.getBoolean("Sound.Give.Enable");
        } else {
            yamlConfiguration_config.set("Sound.Give.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Give Enable §4was added to §9Config.yml§4!");
        }
        if (yamlConfiguration_config.contains("Sound.Give.Sound")) {
            DefultValue.Sound_Give_input = replace(yamlConfiguration_config.getString("Sound.Give.Sound").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_config.set("Sound.Give.Sound", "ENTITY_PLAYER_LEVELUP");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Give §4was added to §9Config.yml§4!");
        }


        if (yamlConfiguration_config.contains("Sound.Gift.Enable")) {
            DefultValue.Sound_Gift_Enable = yamlConfiguration_config.getBoolean("Sound.Gift.Enable");
        } else {
            yamlConfiguration_config.set("Sound.Gift.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Gift Enable §4was added to §9Config.yml§4!");
        }
        if (yamlConfiguration_config.contains("Sound.Gift.Sound")) {
            DefultValue.Sound_Gift_input = replace(yamlConfiguration_config.getString("Sound.Gift.Sound").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_config.set("Sound.Gift.Sound", "ENTITY_PLAYER_LEVELUP");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Gift §4was added to §9Config.yml§4!");
        }


        if (yamlConfiguration_config.contains("Sound.PlayerNotFound.Enable")) {
            DefultValue.Sound_PlayerNotFound_Enable = yamlConfiguration_config.getBoolean("Sound.PlayerNotFound.Enable");
        } else {
            yamlConfiguration_config.set("Sound.PlayerNotFound.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound PlayerNotFound Enable §4was added to §9Config.yml§4!");
        }
        if (yamlConfiguration_config.contains("Sound.PlayerNotFound.Sound")) {
            DefultValue.Sound_PlayerNotFound_input = replace(yamlConfiguration_config.getString("Sound.PlayerNotFound.Sound").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_config.set("Sound.PlayerNotFound.Sound", "BLOCK_NOTE_BLOCK_HARP");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Send §4was added to §9Config.yml§4!");
        }

        /**
         * Title
         */

        if (yamlConfiguration_config.contains("Title.Enable")) {
            DefultValue.Title_Enable = yamlConfiguration_config.getBoolean("Title.Enable");
        } else {
            yamlConfiguration_config.set("Title.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title Enable §4was added to §9Config.yml§4!");
        }

        if (yamlConfiguration_config.contains("Title.Reload.Enable")) {
            DefultValue.Title_Reload_Enable = yamlConfiguration_config.getBoolean("Title.Reload.Enable");
        } else {
            yamlConfiguration_config.set("Title.Reload.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title Reload Enable §4was added to §9Config.yml§4!");
        }

        if (yamlConfiguration_config.contains("Title.Buy.Enable")) {
            DefultValue.Title_Buy_Enable = yamlConfiguration_config.getBoolean("Title.Buy.Enable");
        } else {
            yamlConfiguration_config.set("Title.Buy.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title Buy Enable §4was added to §9Config.yml§4!");
        }

        if (yamlConfiguration_config.contains("Title.NoMoney.Enable")) {
            DefultValue.Title_No_money_Enable = yamlConfiguration_config.getBoolean("Title.NoMoney.Enable");
        } else {
            yamlConfiguration_config.set("Title.NoMoney.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title NoM oney Enable §4was added to §9Config.yml§4!");
        }
        if (yamlConfiguration_config.contains("Title.NoInventorySpace.Enable")) {
            DefultValue.Title_NoInventorySpace_Enable = yamlConfiguration_config.getBoolean("Title.NoInventorySpace.Enable");
        } else {
            yamlConfiguration_config.set("Title.NoInventorySpace.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title NoInventorySpace Enable §4was added to §9Config.yml§4!");
        }
        if (yamlConfiguration_config.contains("Title.Give.Enable")) {
            DefultValue.Title_Give_Enable = yamlConfiguration_config.getBoolean("Title.Give.Enable");
        } else {
            yamlConfiguration_config.set("Title.Give.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title Give Enable §4was added to §9Config.yml§4!");
        }
        if (yamlConfiguration_config.contains("Title.GiveReceived.Enable")) {
            DefultValue.Title_GiveReceived_Enable = yamlConfiguration_config.getBoolean("Title.GiveReceived.Enable");
        } else {
            yamlConfiguration_config.set("Title.GiveReceived.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title GiveReceived Enable §4was added to §9Config.yml§4!");
        }
        if (yamlConfiguration_config.contains("Title.Gift.Enable")) {
            DefultValue.Title_Gift_Enable = yamlConfiguration_config.getBoolean("Title.Gift.Enable");
        } else {
            yamlConfiguration_config.set("Title.Gift.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title Gift Enable §4was added to §9Config.yml§4!");
        }
        if (yamlConfiguration_config.contains("Title.GiftReceived.Enable")) {
            DefultValue.Title_GiftReceived_Enable = yamlConfiguration_config.getBoolean("Title.GiftReceived.Enable");
        } else {
            yamlConfiguration_config.set("Title.GiftReceived.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title GiftReceived Enable §4was added to §9Config.yml§4!");
        }
        if (yamlConfiguration_config.contains("Title.PlayerNoInventorySpace.Enable")) {
            DefultValue.Title_PlayerNoInventorySpace_Enable = yamlConfiguration_config.getBoolean("Title.PlayerNoInventorySpace.Enable");
        } else {
            yamlConfiguration_config.set("Title.PlayerNoInventorySpace.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title PlayerNoInventorySpace Enable §4was added to §9Config.yml§4!");
        }
        if (yamlConfiguration_config.contains("Title.PlayerNotFound.Enable")) {
            DefultValue.Title_PlayerNotFound_Enable = yamlConfiguration_config.getBoolean("Title.PlayerNotFound.Enable");
        } else {
            yamlConfiguration_config.set("Title.PlayerNotFound.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Title PlayerNotFound Enable §4was added to §9Config.yml§4!");
        }

        try {
            yamlConfiguration_config.save(configYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Sound sound_Buy = Sound.valueOf(DefultValue.Sound_Shop_Buy_input);
            if (sound_Buy != null) {
                DefultValue.Sound_Shop_Buy = sound_Buy;
            }
        } catch (Exception e) {
            Bukkit.getConsoleSender().sendMessage("§4\n§4\n§4\n" + DefultValue.SoundNotFound.replace("[prefix]", DefultValue.Prefix)
                    .replace("[sound]", "§8Buy: §6" + DefultValue.Sound_Shop_Buy_input) + "§4\n§4\n§4\n");
            DefultValue.Sound_Shop_Buy = Sound.ENTITY_PLAYER_LEVELUP;
        }

        try {
            Sound sound_NoMoney = Sound.valueOf(DefultValue.Sound_Shop_NoMoney_input);
            if (sound_NoMoney != null) {
                DefultValue.Sound_Shop_NoMoney = sound_NoMoney;
            }
        } catch (Exception e) {
            Bukkit.getConsoleSender().sendMessage("§4\n§4\n§4\n" + DefultValue.SoundNotFound.replace("[prefix]", DefultValue.Prefix)
                    .replace("[sound]", "§8NoMoney: §6" + DefultValue.Sound_Shop_NoMoney_input) + "§4\n§4\n§4\n");
            DefultValue.Sound_Shop_NoMoney = Sound.BLOCK_NOTE_BLOCK_BASS;
        }

        try {
            Sound sound_NoInventorySpace = Sound.valueOf(DefultValue.Sound_Shop_NoInventorySpace_input);
            if (sound_NoInventorySpace != null) {
                DefultValue.Sound_Shop_NoInventorySpace = sound_NoInventorySpace;
            }
        } catch (Exception e) {
            Bukkit.getConsoleSender().sendMessage("§4\n§4\n§4\n" + DefultValue.SoundNotFound.replace("[prefix]", DefultValue.Prefix)
                    .replace("[sound]", "§8NoInventorySpace: §6" + DefultValue.Sound_Shop_NoInventorySpace_input) + "§4\n§4\n§4\n");
            DefultValue.Sound_Shop_NoInventorySpace = Sound.BLOCK_NOTE_BLOCK_GUITAR;
        }

        try {
            Sound sound_Give = Sound.valueOf(DefultValue.Sound_Give_input);
            if (sound_Give != null) {
                DefultValue.Sound_Give = sound_Give;
            }
        } catch (Exception e) {
            Bukkit.getConsoleSender().sendMessage("§4\n§4\n§4\n" + DefultValue.SoundNotFound.replace("[prefix]", DefultValue.Prefix)
                    .replace("[sound]", "§8Give: §6" + DefultValue.Sound_Give_input) + "§4\n§4\n§4\n");
            DefultValue.Sound_Give = Sound.ENTITY_PLAYER_LEVELUP;
        }

        try {
            Sound sound_Gift = Sound.valueOf(DefultValue.Sound_Gift_input);
            if (sound_Gift != null) {
                DefultValue.Sound_Gift = sound_Gift;
            }
        } catch (Exception e) {
            Bukkit.getConsoleSender().sendMessage("§4\n§4\n§4\n" + DefultValue.SoundNotFound.replace("[prefix]", DefultValue.Prefix)
                    .replace("[sound]", "§8Gift: §6" + DefultValue.Sound_Gift_input) + "§4\n§4\n§4\n");
            DefultValue.Sound_Gift = Sound.ENTITY_PLAYER_LEVELUP;
        }

        try {
            Sound sound_PlayerNotFound = Sound.valueOf(DefultValue.Sound_PlayerNotFound_input);
            if (sound_PlayerNotFound != null) {
                DefultValue.Sound_PlayerNotFound = sound_PlayerNotFound;
            }
        } catch (Exception e) {
            Bukkit.getConsoleSender().sendMessage("§4\n§4\n§4\n" + DefultValue.SoundNotFound.replace("[prefix]", DefultValue.Prefix)
                    .replace("[sound]", "§8PlayerNotFound: §6" + DefultValue.Sound_PlayerNotFound_input) + "§4\n§4\n§4\n");
            DefultValue.Sound_PlayerNotFound = Sound.BLOCK_NOTE_BLOCK_HARP;
        }

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2Config.yml loaded successfully.");

    }

    public static void configDisable() {
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Config.yml successfully deactivated.");
    }

    private static String replace(String Text) {
        return Text.replace("&", "§").replace("%ue%", "ü").replace("%UE%", "Ü").replace("%oe%", "ö")
                .replace("%OE%", "Ö").replace("%ae%", "ä").replace("%AE%", "Ä");
    }
}