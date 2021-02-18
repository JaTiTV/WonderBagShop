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

    public static void shopCreate(){

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop-Config load...");

        File shopYML = new File(Main.thisp().getDataFolder().getPath(), "shop.yml");
        YamlConfiguration yamlConfiguration_shop = YamlConfiguration.loadConfiguration(shopYML);

        if(yamlConfiguration_shop.contains("ShopName_GUI")){
            DefultValue.ShopName_GUI = replace(yamlConfiguration_shop.getString("ShopName_GUI"));
        }else{
            yamlConfiguration_shop.set("ShopName_GUI", "&2Wonder&6Bag&9Shop");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6ShopName_GUI §4was added to §9shop.yml§4!");
        }

        // Item 1

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.Name")){
            DefultValue.WB1Name = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.Name"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.Name", "&2Wonder&6Bag &91");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_1 Name §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.ChestName")){
            DefultValue.WB1ChestName = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.ChestName"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.ChestName", "&2Wonder&6Bag &91");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag/WonderBag_1/ChestName §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.price")){
            DefultValue.WB1price = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.price"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.price", "1000");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_1 price §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.Item_amount_(1-15)")){
            DefultValue.WB1Item_anz = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.Item_amount_(1-15)"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.Item_amount_(1-15)", "5");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_1 Item_amount_(1-15) §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.Item_MaxStack_(1-64)")){
            DefultValue.WB1Item_max_Stack = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.Item_MaxStack_(1-64)"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.Item_MaxStack_(1-64)", "10");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_1 Item_MaxStack_(1-64) §4was added to §9shop.yml§4!");
        }

        // Item 2

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_2.Name")){
            DefultValue.WB2Name = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_2.Name"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_2.Name", "&2Wonder&6Bag &92");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag WonderBag_2 Name §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_2.ChestName")){
            DefultValue.WB2ChestName = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_2.ChestName"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_2.ChestName", "&2Wonder&6Bag &92");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag/WonderBag_2/ChestName §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_2.price")){
            DefultValue.WB2price = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.WonderBag_2.price"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_2.price", "2000");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_2 price §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_2.Item_amount_(1-15)")){
            DefultValue.WB2Item_anz = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.WonderBag_2.Item_amount_(1-15)"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_2.Item_amount_(1-15)", "8");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_2 Item_amount_(1-15) §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_2.Item_MaxStack_(1-64)")){
            DefultValue.WB2Item_max_Stack = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.WonderBag_2.Item_MaxStack_(1-64)"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_2.Item_MaxStack_(1-64)", "10");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_2 Item_MaxStack_(1-64) §4was added to §9shop.yml§4!");
        }

        // Item 3

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.Name")){
            DefultValue.WB3Name = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.Name"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.Name", "&2Wonder&6Bag &93");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_3 Name §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.ChestName")){
            DefultValue.WB3ChestName = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.ChestName"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.ChestName", "&2Wonder&6Bag &93");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag/WonderBag_3/ChestName §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.price")){
            DefultValue.WB3price = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.price"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.price", "3000");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_3 price §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.Item_amount_(1-15)")){
            DefultValue.WB3Item_anz = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.Item_amount_(1-15)"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.Item_amount_(1-15)", "8");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_3 Item_amount_(1-15) §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.Item_MaxStack_(1-64)")){
            DefultValue.WB3Item_max_Stack = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.Item_MaxStack_(1-64)"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.Item_MaxStack_(1-64)", "10");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_3 Item_MaxStack_(1-64) §4was added to §9shop.yml§4!");
        }

        try {
            yamlConfiguration_shop.save(shopYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2Shop-Config loaded successfully.");
    }

    public static void shopDisable(){
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4shop.yml successfully deactivated.");
    }

    private static String replace(String Text) {
        return Text.replace("[prefix]", DefultValue.Prefix).replace("[currency]", DefultValue.Currency).replace("&", "§")
                .replace("[WB1Name]", DefultValue.WB1Name).replace("[WB2Name]", DefultValue.WB2Name).replace("[WB3Name]", DefultValue.WB3Name)
                .replace("[ue]", "ü").replace("[UE]", "Ü").replace("[oe]", "Ö").replace("[OE]", "Ö")
                .replace("[ae]", "Ä").replace("[AE]", "Ä");
    }

}
