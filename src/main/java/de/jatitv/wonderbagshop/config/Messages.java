// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.config;

import de.jatitv.wonderbagshop.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Messages {

    public static String PrefixHC = "§8[§2W§6B§9S§8] ";
    public static String Prefix = "§8[§2W§6B§9S§8]";
    public static String NoPermission = "§8[§2W§6B§9S§8] §cFür §b[command] §cfehlt dir die Permission §6[permission]§c!";
    public static String ReloadStart = "§6Plugin reload...";
    public static String ReloadEnd = "§2Plugin successfully reloaded.";
    public static String VaultNotSetUp = "§8[§2W§6B§9S§8] §4Vault / Economy not set up!";
    public static String Help = "§8[§2W§6B§9S§8] §8----- §2Wonder§6Bag§9Shop §chelp §8-----\n§8[§2W§6B§9S§8]\n§8[§2W§6B§9S§8] '§b/wonderbagshop§e' Öffnet diese help." +
            "\n§8[§2W§6B§9S§8] '§b/wonderbagshop shop§e' Öffnet den Shop.\n§8[§2W§6B§9S§8] '§b/wonderbagshop reload§e' Läd die Cofig neu.\n§8[§2W§6B§9S§8]\n" +
            "§8[§2W§6B§9S§8] §8----------------------------";
    public static String No_money = "§8[§2W§6B§9S§8] §cDu hast nicht genügend Geld";
    public static String WB1buy_msg = "§8[§2Wonder§6Bag§9Shop§8] §2Du hast dir §2Wonder§6Bag §91 §2für §61000 $ §2gekauft!";
    public static String WB2buy_msg = "§8[§2Wonder§6Bag§9Shop§8] §2Du hast dir §2Wonder§6Bag §92 §2für §62000 $ §2gekauft!";
    public static String WB3buy_msg = "§8[§2Wonder§6Bag§9Shop§8] §2Du hast dir §2Wonder§6Bag §93 §2für §63000 $ §2gekauft!";

    public static void messagesCreate(){

        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Messages load...");

        File messagesYML = new File(Main.thisp().getDataFolder().getPath(), "messages.yml");
        YamlConfiguration yamlConfiguration_msg = YamlConfiguration.loadConfiguration(messagesYML);

        if (yamlConfiguration_msg.contains("Plugin.NoPermission")) {
            NoPermission = replace(yamlConfiguration_msg.getString("Plugin.NoPermission"));
        } else {
            yamlConfiguration_msg.set("Plugin.NoPermission", "[prefix] &cFür &b[command] &cfehlt dir die Permission &6[permission]&c!");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Message §6NoPermission §4was added to §9messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Plugin.Reload.Start")) {
            ReloadStart = replace(yamlConfiguration_msg.getString("Plugin.Reload.Start"));
        } else {
            yamlConfiguration_msg.set("Plugin.Reload.Start", "&6Plugin reload...");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Message §6Reload Start §4was added to §9messages.yml§4!");
        }
        if (yamlConfiguration_msg.contains("Plugin.Reload.End")) {
            ReloadEnd = replace(yamlConfiguration_msg.getString("Plugin.Reload.End"));
        } else {
            yamlConfiguration_msg.set("Plugin.Reload.End", "&2Plugin successfully reloaded.");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Message §6Reload End §4was added to §9messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Plugin.VaultNotSetUp")) {
            VaultNotSetUp = replace(yamlConfiguration_msg.getString("Plugin.VaultNotSetUp"));
        } else {
            yamlConfiguration_msg.set("Plugin.VaultNotSetUp", "&4Vault / Economy not set up!");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Message §6VaultNotSetUp §4was added to §9messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Help")) {
            Help = replace(yamlConfiguration_msg.getString("Help"));
        } else {
            yamlConfiguration_msg.set("Help", "[prefix] &8----- &2Wonder&6Bag&9Shop &chelp &8-----\n[prefix]\n[prefix]'&b/wonderbagshop&e' [OE]ffnet diese help." +
                    "\n[prefix]'&b/wonderbagshop shop&e' [OE]ffnet den Shop.\n[prefix]'&b/wonderbagshop reload&e' L[ae]d die Cofig neu.\n[prefix]" +
                    "\n[prefix]&8----------------------------");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Message §6Help §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("Shop.No_money")){
            No_money = replace(yamlConfiguration_msg.getString("Shop.No_money"));
        }else{
            yamlConfiguration_msg.set("Shop.No_money", "[prefix] &cDu hast nicht genügend Geld");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Message §6No_money §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("WonderBag.buy_msg.WonderBag_1")){
            WB1buy_msg = replace(yamlConfiguration_msg.getString("WonderBag.buy_msg.WonderBag_1"));
        }else{
            yamlConfiguration_msg.set("WonderBag.buy_msg.WonderBag_1", "[prefix]&2Du hast dir [WB1Name] §2für [WB1Price] $ §2gekauft!");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Message §6WonderBag Item_1 buy_msg §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("WonderBag.buy_msg.WonderBag_2")){
            WB2buy_msg = replace(yamlConfiguration_msg.getString("WonderBag.buy_msg.WonderBag_2"));
        }else{
            yamlConfiguration_msg.set("WonderBag.buy_msg.WonderBag_2", "[prefix]&2Du hast dir [WB2Name] §2für [WB2Price] $ §2gekauft!");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Message §6WonderBag Item_2 buy_msg §4was added to §9messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("WonderBag.buy_msg.WonderBag_3")){
            WB3buy_msg = replace(yamlConfiguration_msg.getString("WonderBag.buy_msg.WonderBag_3"));
        }else{
            yamlConfiguration_msg.set("WonderBag.buy_msg.WonderBag_3", "[prefix]&2Du hast dir [WB3Name] §2für [WB3Price] $ §2gekauft!");
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Message §6WonderBag Item_3 buy_msg §4was added to §9messages.yml§4!");
        }


        try {
            yamlConfiguration_msg.save(messagesYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2Messages loaded successfully.");
    }

    public static void messagesDisable(){
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4messages.yml successfully deactivated.");
    }

    private static String replace(String Text) {
        return Text.replace("[prefix]", Prefix).replace("&", "§").replace("[ue]", "ü").replace("[UE]", "Ü")
                .replace("[oe]", "Ö").replace("[OE]", "Ö").replace("[ae]", "ä").replace("[AE]", "Ä");
    }



}
