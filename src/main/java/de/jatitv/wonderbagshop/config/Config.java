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

import de.jatitv.wonderbagshop.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Config {

    public static void configCreate(){

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Config load...");

        File configYML = new File(Main.thisp().getDataFolder().getPath(), "config.yml");
        YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);

        if (yamlConfiguration_config.contains("Language")) {
            DefultValue.Lang = yamlConfiguration_config.getString("Language");
        } else {
            yamlConfiguration_config.set("Language", "EN");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Language §4was added to §9config.yml§4!");
        }

        if (yamlConfiguration_config.contains("Currency")) {
            DefultValue.Currency = yamlConfiguration_config.getString("Currency");
        } else {
            yamlConfiguration_config.set("Currency", "$");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Currency §4was added to §9config.yml§4!");
        }

        if(yamlConfiguration_config.contains("ItemList.WonderBag_1")){
            DefultValue.WB1Items = replace(yamlConfiguration_config.getString("ItemList.WonderBag_1"));
        }else{
            yamlConfiguration_config.set("ItemList.WonderBag_1", DefultValue.WB1ItemsLIST);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6ItemList/WonderBag_1 §4was added to §9config.yml§4!");
        }

        if(yamlConfiguration_config.contains("ItemList.WonderBag_2")){
            DefultValue.WB2Items = replace(yamlConfiguration_config.getString("ItemList.WonderBag_2"));
        }else{
            yamlConfiguration_config.set("ItemList.WonderBag_2", DefultValue.WB2ItemsLIST);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6ItemList/WonderBag_2 §4was added to §9config.yml§4!");
        }

        if(yamlConfiguration_config.contains("ItemList.WonderBag_3")){
            DefultValue.WB3Items = replace(yamlConfiguration_config.getString("ItemList.WonderBag_3"));
        }else{
            yamlConfiguration_config.set("ItemList.WonderBag_3", DefultValue.WB3ItemsLIST);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6ItemList/WonderBag_3 §4was added to §9config.yml§4!");
        }

        try {
            yamlConfiguration_config.save(configYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2Config loaded successfully.");
    }

    public static void configDisable(){
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4config.yml successfully deactivated.");
    }

    private static String replace(String Text) {
        return Text.replace("&", "§").replace("%ue%", "ü").replace("%UE%", "Ü").replace("%oe%", "ö")
                .replace("%OE%", "Ö").replace("%ae%", "ä").replace("%AE%", "Ä");
    }
}
