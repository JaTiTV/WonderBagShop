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

public class Shop {

    public static String ShopName_GUI = "§2Wonder§6Bag§9Shop";
    public static String WB1Name = "§2Wonder§6Bag §91";
    public static String WB1ChestName = "§2Wonder§6Bag §91";
    public static String WB1Items = "GOLD_BLOCK\nDIAMOND\nDIAMOND_SWORD";
    public static Integer WB1price = 1000;
    public static String WB2Name = "§2Wonder§6Bag §92";
    public static String WB2ChestName = "§2Wonder§6Bag §92";
    public static String WB2Items = "GOLD_BLOCK\nDIAMOND\nDIAMOND_SWORD";
    public static Integer WB2price = 2000;
    public static String WB3Name = "§2Wonder§6Bag §93";
    public static String WB3ChestName = "§2Wonder§6Bag §93";
    public static String WB3Items = "GOLD_BLOCK\nDIAMOND\nDIAMOND_SWORD";
    public static Integer WB3price = 3000;

    public static void shopCreate(){

        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Shop-Config load...");

        File shopYML = new File(Main.thisp().getDataFolder().getPath(), "shop.yml");
        YamlConfiguration yamlConfiguration_shop = YamlConfiguration.loadConfiguration(shopYML);

        if(yamlConfiguration_shop.contains("ShopName_GUI")){
            ShopName_GUI = replace(yamlConfiguration_shop.getString("ShopName_GUI"));
        }else{
            yamlConfiguration_shop.set("ShopName_GUI", "&2Wonder&6Bag&9Shop");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Shop Setting §6ShopName_GUI §4was added to §9shop.yml§4!");
        }

        // Item 1

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.Name")){
            WB1Name = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.Name"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.Name", "&2Wonder&6Bag &91");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Shop Setting §6WonderBag Item_1 Name §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.ChestName")){
            WB1ChestName = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.ChestName"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.ChestName", "&2Wonder&6Bag &91");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Shop Setting §6WonderBag/WonderBag_1/ChestName §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.price")){
            WB1price = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.price"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.price", "1000");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Shop Setting §6WonderBag Item_1 price §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.Items")){
            WB1Items = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.Items"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.Items", "GOLD_BLOCK\nDIAMOND\nDIAMOND_SWORD");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Shop Setting §6WonderBag Item_1 Items §4was added to §9shop.yml§4!");
        }

        // Item 2

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_2.Name")){
            WB2Name = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_2.Name"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_2.Name", "&2Wonder&6Bag &92");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Shop Setting §6WonderBag WonderBag_2 Name §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_2.ChestName")){
            WB2ChestName = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_2.ChestName"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_2.ChestName", "&2Wonder&6Bag &92");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Shop Setting §6WonderBag/WonderBag_2/ChestName §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_2.price")){
            WB2price = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.WonderBag_2.price"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_2.price", "2000");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Shop Setting §6WonderBag Item_2 price §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_2.Items")){
            WB2Items = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_2.Items"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_2.Items", "GOLD_BLOCK\nDIAMOND\nDIAMOND_SWORD");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Shop Setting §6WonderBag Item_2 Items §4was added to §9shop.yml§4!");
        }

        // Item 3

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.Name")){
            WB3Name = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.Name"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.Name", "&2Wonder&6Bag &93");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Shop Setting §6WonderBag Item_3 Name §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.ChestName")){
            WB3ChestName = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.ChestName"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.ChestName", "&2Wonder&6Bag &93");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Shop Setting §6WonderBag/WonderBag_3/ChestName §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.price")){
            WB3price = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.price"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.price", "3000");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Shop Setting §6WonderBag Item_3 price §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.Items")){
            WB3Items = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.Items"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.Items", "GOLD_BLOCK\nDIAMOND\nDIAMOND_SWORD");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Shop Setting §6WonderBag Item_3 Items §4was added to §9shop.yml§4!");
        }

        try {
            yamlConfiguration_shop.save(shopYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2Shop-Config loaded successfully.");
    }

    public static void shopDisable(){
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4shop.yml successfully deactivated.");
    }

    private static String replace(String Text) {
        return Text.replace("[prefix]", Messages.Prefix).replace("[currency]", Config.Currency).replace("&", "§").replace("[WB1Name]", WB1Name)
                .replace("[WB2Name]", WB2Name).replace("[WB3Name]", WB3Name).replace("[ue]", "ü").replace("[UE]", "Ü")
                .replace("[oe]", "Ö").replace("[OE]", "Ö").replace("[ae]", "Ä").replace("[AE]", "Ä");
    }

}
