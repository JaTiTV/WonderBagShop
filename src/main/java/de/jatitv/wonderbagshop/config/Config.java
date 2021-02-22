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


        if (yamlConfiguration_config.contains("Shop.Sound.BuyEnable")) {
            DefultValue.Sound_Shop_Buy_Enable = yamlConfiguration_config.getBoolean("Shop.Sound.BuyEnable");
        } else {
            yamlConfiguration_config.set("Shop.Sound.BuyEnable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Shop Sound Buy Enable §4was added to §9Config.yml§4!");
        }

        if(yamlConfiguration_config.contains("Shop.Sound.Buy")){
            DefultValue.Sound_Shop_Buy_input = replace(yamlConfiguration_config.getString("Shop.Sound.Buy"));
        }else{
            yamlConfiguration_config.set("Shop.Sound.Buy", "ENTITY_PLAYER_LEVELUP");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6SShop Sound Buy §4was added to §9Config.yml§4!");
        }


        if (yamlConfiguration_config.contains("Shop.Sound.NoMoneyEnable")) {
            DefultValue.Sound_Shop_NoMoney_Enable = yamlConfiguration_config.getBoolean("Shop.Sound.NoMoneyEnable");
        } else {
            yamlConfiguration_config.set("Shop.Sound.NoMoneyEnable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Shop Sound NoMoney Enable §4was added to §9Config.yml§4!");
        }

        if(yamlConfiguration_config.contains("Shop.Sound.NoMoney")){
            DefultValue.Sound_Shop_NoMoney_input = replace(yamlConfiguration_config.getString("Shop.Sound.NoMoney"));
        }else{
            yamlConfiguration_config.set("Shop.Sound.NoMoney", "BLOCK_NOTE_BLOCK_HARP");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6Shop Sound NoMoney §4was added to §9Config.yml§4!");
        }


        if (yamlConfiguration_config.contains("Shop.Sound.NoInventorySpaceEnable")) {
            DefultValue.Sound_Shop_NoInventorySpace_Enable = yamlConfiguration_config.getBoolean("Shop.Sound.NoInventorySpaceEnable");
        } else {
            yamlConfiguration_config.set("Shop.Sound.NoInventorySpaceEnable", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Shop Sound NoInventorySpace Enable §4was added to §9Config.yml§4!");
        }

        if(yamlConfiguration_config.contains("Shop.Sound.NoInventorySpace")){
            DefultValue.Sound_Shop_NoInventorySpace_input = replace(yamlConfiguration_config.getString("Shop.Sound.NoInventorySpace"));
        }else{
            yamlConfiguration_config.set("Shop.Sound.NoInventorySpace", "BLOCK_NOTE_BLOCK_GUITAR");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6Shop Sound NoInventorySpace §4was added to §9Config.yml§4!");
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

        if (yamlConfiguration_config.contains("WonderBags.ChestDrop")) {
            DefultValue.ChestDrop = yamlConfiguration_config.getBoolean("WonderBags.ChestDrop");
        } else {
            yamlConfiguration_config.set("WonderBags.ChestDrop", false);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6ItemNumbers §4was added to §9Config.yml§4!");
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