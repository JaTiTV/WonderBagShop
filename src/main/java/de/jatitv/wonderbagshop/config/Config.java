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


        if (yamlConfiguration_config.contains("Shop.Sound")) {
            DefultValue.Sound_Shop_input = yamlConfiguration_config.getString("Shop.Sound");
        } else {
            yamlConfiguration_config.set("Shop.Sound", "ENTITY_PLAYER_LEVELUP");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6Sound §4was added to §9Config.yml§4!");
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

        if (yamlConfiguration_config.contains("WonderBags.BlockChestDrop")) {
            DefultValue.BlockChestDrop = yamlConfiguration_config.getBoolean("WonderBags.BlockChestDrop");
        } else {
            yamlConfiguration_config.set("WonderBags.BlockChestDrop", true);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6ItemNumbers §4was added to §9Config.yml§4!");
        }



        try {
            yamlConfiguration_config.save(configYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sound sound_shop = Sound.valueOf(DefultValue.Sound_Shop_input);
        if(sound_shop == null){
            Bukkit.getConsoleSender().sendMessage("[Booster] Der Sound Shop wurde nicht gefunden!");
            DefultValue.Sound_Shop = Sound.ENTITY_PLAYER_LEVELUP;
        }else{
            DefultValue.Sound_Shop = sound_shop;
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