// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.config;

import de.jatitv.wonderbagshop.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Shop {

    public static String ShopName = "§2Wonder§6Bag§9Shop";
    public static String WB1Name = "§2Wonder§6Bag §91";
    public static String WB1Lore1 = "§8-------------";
    public static String WB1Lore2 = "§61000 $";
    public static String WB1ChestName = "§2Wonder§6Bag §91";
    public static String WB1Items = "GOLD_BLOCK\nDIAMOND\nDIAMOND_SWORD";
    public static Integer WB1price = 1000;
    public static String WB1buy_msg = "§8[§2Wonder§6Bag§9Shop§8] §2Du hast dir §2Wonder§6Bag §91 §2für §61000 $ §2gekauft!";
    public static String WB2Name = "§2Wonder§6Bag §92";
    public static String WB2Lore1 = "§8-------------";
    public static String WB2Lore2 = "§62000 $";
    public static String WB2ChestName = "§2Wonder§6Bag §92";
    public static String WB2Items = "GOLD_BLOCK\nDIAMOND\nDIAMOND_SWORD";
    public static Integer WB2price = 2000;
    public static String WB2buy_msg = "§8[§2Wonder§6Bag§9Shop§8] §2Du hast dir §2Wonder§6Bag §92 §2für §62000 $ §2gekauft!";
    public static String WB3Name = "§2Wonder§6Bag §93";
    public static String WB3Lore1 = "§8-------------";
    public static String WB3Lore2 = "§63000 $";
    public static String WB3ChestName = "§2Wonder§6Bag §93";
    public static String WB3Items = "GOLD_BLOCK\nDIAMOND\nDIAMOND_SWORD";
    public static Integer WB3price = 3000;
    public static String WB3buy_msg = "§8[§2Wonder§6Bag§9Shop§8] §2Du hast dir §2Wonder§6Bag §93 §2für §63000 $ §2gekauft!";

    public static void shopCreate(){

        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop-Config load...");

        File shopYML = new File(Main.thisp().getDataFolder().getPath(), "shop.yml");
        YamlConfiguration yamlConfiguration_shop = YamlConfiguration.loadConfiguration(shopYML);

        if(yamlConfiguration_shop.contains("ShopName")){
            ShopName = replace(yamlConfiguration_shop.getString("ShopName"));
        }else{
            yamlConfiguration_shop.set("ShopName", "&2Wonder&6Bag&9Shop");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6ShopName §4was added to §9messages.yml§4!");
        }

        // Item 1

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.Name")){
            WB1Name = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.Name"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.Name", "&61 &2Wonder&6Bag &91");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag Item_1 Name §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.Lore_1")){
            WB1Lore1 = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.Lore_1"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.Lore_1", "&8-------------");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag Item_1 Lore_1 §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.Lore_2")){
            WB1Lore2 = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.Lore_2"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.Lore_2", "&61000 [currency]");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag Item_1 Lore_2 §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.ChestName")){
            WB1ChestName = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.ChestName"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.ChestName", "&2Wonder&6Bag &91");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag/WonderBag_1/ChestName §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.Items")){
            WB1Items = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.Items"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.Items", "GOLD_BLOCK\nDIAMOND\nDIAMOND_SWORD");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag Item_1 Items §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.price")){
            WB1price = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.price"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.price", "1000");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag Item_1 price §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_1.buy_msg")){
            WB1buy_msg = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_1.buy_msg"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.buy_msg", "[prefix]&2Du hast dir [WB1Name] §2für [WB1Price] $ §2gekauft!");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag Item_1 buy_msg §4was added to §9messages.yml§4!");
        }

        // Item 2

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_2.Name")){
            WB2Name = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_2.Name"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_2.Name", "&61 &2Wonder&6Bag &92");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag WonderBag_2 Name §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_2.Lore_1")){
            WB2Lore1 = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_2.Lore_1"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_2.Lore_1", "&8-------------");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag WonderBag_2 Lore_1 §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_2.Lore_2")){
            WB2Lore2 = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_2.Lore_2"));
        }else{
            yamlConfiguration_shop.set("WonderBag.Item_2.WonderBag_2", "&62000 [currency]");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag WonderBag_2 Lore_2 §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_2.ChestName")){
            WB2ChestName = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_2.ChestName"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_1.ChestName", "&2Wonder&6Bag &92");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag/WonderBag_2/ChestName §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.Item_2.Items")){
            WB2Items = replace(yamlConfiguration_shop.getString("WonderBag.Item_2.Items"));
        }else{
            yamlConfiguration_shop.set("WonderBag.Item_2.Items", "GOLD_BLOCK\nDIAMOND\nDIAMOND_SWORD");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag Item_2 Items §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.Item_2.price")){
            WB2price = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.Item_2.price"));
        }else{
            yamlConfiguration_shop.set("WonderBag.Item_2.price", "1000");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag Item_2 price §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.Item_2.buy_msg")){
            WB2buy_msg = replace(yamlConfiguration_shop.getString("WonderBag.Item_2.buy_msg"));
        }else{
            yamlConfiguration_shop.set("WonderBag.Item_2.buy_msg", "[prefix]&2Du hast dir [WB2Name] §2für [WB2Price] $ §2gekauft!");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag Item_2 buy_msg §4was added to §9messages.yml§4!");
        }

        // Item 3

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.Name")){
            WB3Name = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.Name"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.Name", "&61 &2Wonder&6Bag &93");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag Item_3 Name §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.Lore_1")){
            WB3Lore1 = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.Lore_1"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.Lore_1", "&8-------------");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag Item_3 Lore_1 §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.Lore_2")){
            WB3Lore2 = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.Lore_2"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.Lore_2", "&63000 [currency]");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag Item_3 Lore_2 §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.ChestName")){
            WB3ChestName = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.ChestName"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.ChestName", "&2Wonder&6Bag &93");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag/WonderBag_3/ChestName §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.Items")){
            WB3Items = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.Items"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.Items", "GOLD_BLOCK\nDIAMOND\nDIAMOND_SWORD");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag Item_3 Items §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.price")){
            WB3price = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.price"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.price", "1000");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag Item_3 price §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.WonderBag_3.buy_msg")){
            WB3buy_msg = replace(yamlConfiguration_shop.getString("WonderBag.WonderBag_3.buy_msg"));
        }else{
            yamlConfiguration_shop.set("WonderBag.WonderBag_3.buy_msg", "[prefix]&2Du hast dir [WB3Name] §2für [WB3Price] $ §2gekauft!");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Shop Setting §6WonderBag Item_3 buy_msg §4was added to §9messages.yml§4!");
        }

        try {
            yamlConfiguration_shop.save(shopYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2Shop-Config loaded successfully.");
    }

    public static void shopDisable(){
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Config successfully deactivated.");
    }

    private static String replace(String Text) {
        return Text.replace("[prefix]", Messages.Prefix).replace("[currency]", Config.Currency).replace("&", "§").replace("[WB1Name]", WB1Name).replace("[WB2Name]", WB2Name).replace("[WB3Name]", WB3Name).replace("[WB1Price]", WB1Lore2).replace("[WB2Price]", WB1Lore2).replace("[WB3Price]", WB1Lore2).replace("[ue]", "ü").replace("[UE]", "Ü").replace("[oe]", "Ö").replace("[OE]", "Ö").replace("[ae]", "Ä").replace("[AE]", "Ä");
    }

}
