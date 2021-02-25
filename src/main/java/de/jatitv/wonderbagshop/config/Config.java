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

import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import de.jatitv.wonderbagshop.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Config {

    public static void configCreate(){

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Config.yml load...");

        File configYML = new File(Main.thisp().getDataFolder().getPath(), "Config.yml");
        YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);

        if(yamlConfiguration_config.contains("Shop.GUI_Name")){
            DefultValue.GUI_Name = replace(yamlConfiguration_config.getString("Shop.GUI_Name"));
        }else{
            yamlConfiguration_config.set("Shop.GUI_Name", "&2Wonder&6Bag&9Shop");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6ShopName_GUI §4was added to §9Config.yml§4!");
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
            yamlConfiguration_config.set("WonderBags.UseChest", false);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6UseChest §4was added to §9Config.yml§4!");
        }

        if (yamlConfiguration_config.contains("WonderBags.ChestDrop")) {
            DefultValue.ChestDrop = yamlConfiguration_config.getBoolean("WonderBags.ChestDrop");
        } else {
            yamlConfiguration_config.set("WonderBags.ChestDrop", false);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6ChestDrop §4was added to §9Config.yml§4!");
        }

        /**
         *Sound
         */

        if (yamlConfiguration_config.contains("Sound.Buy.Enable")) {
            DefultValue.Sound_Shop_Buy_Enable = yamlConfiguration_config.getBoolean("Sound.Buy.Enable");
        } else {
            yamlConfiguration_config.set("Sound.Buy.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Buy Enable §4was added to §9Config.yml§4!");
        }
        if(yamlConfiguration_config.contains("Sound.Buy.Sound")){
            DefultValue.Sound_Shop_Buy_input = replace(yamlConfiguration_config.getString("Sound.Buy.Sound"));
        }else{
            yamlConfiguration_config.set("Sound.Buy.Sound", "ENTITY_PLAYER_LEVELUP");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6Sound Buy §4was added to §9Config.yml§4!");
        }


        if (yamlConfiguration_config.contains("Sound.NoMoney.Enable")) {
            DefultValue.Sound_Shop_NoMoney_Enable = yamlConfiguration_config.getBoolean("Sound.NoMoney.Enable");
        } else {
            yamlConfiguration_config.set("Sound.NoMoney.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoMoney Enable §4was added to §9Config.yml§4!");
        }
        if(yamlConfiguration_config.contains("Sound.NoMoney.Sound")){
            DefultValue.Sound_Shop_NoMoney_input = replace(yamlConfiguration_config.getString("Sound.NoMoney.Sound"));
        }else{
            yamlConfiguration_config.set("Sound.NoMoney.Sound", "BLOCK_NOTE_BLOCK_HARP");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6 Sound NoMoney §4was added to §9Config.yml§4!");
        }


        if (yamlConfiguration_config.contains("Sound.NoInventorySpace.Enable")) {
            DefultValue.Sound_Shop_NoInventorySpace_Enable = yamlConfiguration_config.getBoolean("Sound.NoInventorySpace.Enable");
        } else {
            yamlConfiguration_config.set("Sound.NoInventorySpace.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoInventorySpace Enable §4was added to §9Config.yml§4!");
        }
        if(yamlConfiguration_config.contains("Sound.NoInventorySpace.Sound")){
            DefultValue.Sound_Shop_NoInventorySpace_input = replace(yamlConfiguration_config.getString("Sound.NoInventorySpace.Sound"));
        }else{
            yamlConfiguration_config.set("Sound.NoInventorySpace.Sound", "BLOCK_NOTE_BLOCK_GUITAR");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6Sound NoInventorySpace §4was added to §9Config.yml§4!");
        }


        if (yamlConfiguration_config.contains("Sound.Give.Enable")) {
            DefultValue.Sound_Give_Enable = yamlConfiguration_config.getBoolean("Sound.Give.Enable");
        } else {
            yamlConfiguration_config.set("Sound.Give.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Give Enable §4was added to §9Config.yml§4!");
        }
        if(yamlConfiguration_config.contains("Sound.Give.Sound")){
            DefultValue.Sound_Give_input = replace(yamlConfiguration_config.getString("Sound.Give.Sound"));
        }else{
            yamlConfiguration_config.set("Sound.Give.Sound", "ENTITY_PLAYER_LEVELUP");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6Sound Give §4was added to §9Config.yml§4!");
        }


        if (yamlConfiguration_config.contains("Sound.Gift.Enable")) {
            DefultValue.Sound_Gift_Enable = yamlConfiguration_config.getBoolean("Sound.Gift.Enable");
        } else {
            yamlConfiguration_config.set("Sound.Gift.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound Gift Enable §4was added to §9Config.yml§4!");
        }
        if(yamlConfiguration_config.contains("Sound.Gift.Sound")){
            DefultValue.Sound_Gift_input = replace(yamlConfiguration_config.getString("Sound.Gift.Sound"));
        }else{
            yamlConfiguration_config.set("Sound.Gift.Sound", "ENTITY_PLAYER_LEVELUP");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6Sound Gift §4was added to §9Config.yml§4!");
        }


        if (yamlConfiguration_config.contains("Sound.PlayerNotFound.Enable")) {
            DefultValue.Sound_PlayerNotFound_Enable = yamlConfiguration_config.getBoolean("Sound.PlayerNotFound.Enable");
        } else {
            yamlConfiguration_config.set("Sound.PlayerNotFound.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound PlayerNotFound Enable §4was added to §9Config.yml§4!");
        }
        if(yamlConfiguration_config.contains("Sound.PlayerNotFound.Sound")){
            DefultValue.Sound_PlayerNotFound_input = replace(yamlConfiguration_config.getString("Sound.PlayerNotFound.Sound"));
        }else{
            yamlConfiguration_config.set("Sound.PlayerNotFound.Sound", "ENTITY_PLAYER_LEVELUP");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6Sound Send §4was added to §9Config.yml§4!");
        }


        if (yamlConfiguration_config.contains("Sound.NoInventorySpace.Enable")) {
            DefultValue.Sound_Shop_NoInventorySpace_Enable = yamlConfiguration_config.getBoolean("Sound.NoInventorySpace.Enable");
        } else {
            yamlConfiguration_config.set("Sound.NoInventorySpace.Enable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Sound NoInventorySpace Enable §4was added to §9Config.yml§4!");
        }
        if(yamlConfiguration_config.contains("Sound.NoInventorySpace.Sound")){
            DefultValue.Sound_Shop_NoInventorySpace_input = replace(yamlConfiguration_config.getString("Sound.NoInventorySpace.Sound"));
        }else{
            yamlConfiguration_config.set("Sound.NoInventorySpace.Sound", "BLOCK_NOTE_BLOCK_GUITAR");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6Sound NoInventorySpace §4was added to §9Config.yml§4!");
        }

        try {
            yamlConfiguration_config.save(configYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sound sound_Buy = Sound.valueOf(DefultValue.Sound_Shop_Buy_input);
        if(sound_Buy == null){
            DefultValue.Sound_Shop_Buy = Sound.ENTITY_PLAYER_LEVELUP;
        }else{
            DefultValue.Sound_Shop_Buy = sound_Buy;
        }

        Sound sound_NoMoney = Sound.valueOf(DefultValue.Sound_Shop_NoMoney_input);
        if(sound_NoMoney == null){
            DefultValue.Sound_Shop_NoMoney = Sound.BLOCK_NOTE_BLOCK_BASS;
        }else{
            DefultValue.Sound_Shop_NoMoney = sound_NoMoney;
        }

        Sound sound_NoInventorySpace = Sound.valueOf(DefultValue.Sound_Shop_NoInventorySpace_input);
        if(sound_NoInventorySpace == null){
            DefultValue.Sound_Shop_NoInventorySpace = Sound.BLOCK_NOTE_BLOCK_GUITAR;
        }else{
            DefultValue.Sound_Shop_NoInventorySpace = sound_NoInventorySpace;
        }

        Sound sound_Give = Sound.valueOf(DefultValue.Sound_Give_input);
        if(sound_Give == null){
            DefultValue.Sound_Give = Sound.ENTITY_PLAYER_LEVELUP;
        }else{
            DefultValue.Sound_Give = sound_Give;
        }

        Sound sound_Gift = Sound.valueOf(DefultValue.Sound_Gift_input);
        if(sound_Gift == null){
            DefultValue.Sound_Gift = Sound.ENTITY_PLAYER_LEVELUP;
        }else{
            DefultValue.Sound_Gift = sound_Gift;
        }

        Sound sound_PlayerNotFound = Sound.valueOf(DefultValue.Sound_PlayerNotFound_input);
        if(sound_PlayerNotFound == null){
            DefultValue.Sound_PlayerNotFound = Sound.ENTITY_PLAYER_LEVELUP;
        }else{
            DefultValue.Sound_PlayerNotFound = sound_PlayerNotFound;
        }


        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2Config.yml loaded successfully.");
    }

    public static void configDisable(){
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Config.yml successfully deactivated.");
    }

    private static String replace(String Text) {
        return Text.replace("&", "§").replace("%ue%", "ü").replace("%UE%", "Ü").replace("%oe%", "ö")
                .replace("%OE%", "Ö").replace("%ae%", "ä").replace("%AE%", "Ä");
    }
}