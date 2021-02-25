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
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB1;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB2;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB3;
import de.jatitv.wonderbagshop.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Messages {

    public static void messagesCreate(){

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Messages.yml load...");

        File messagesYML = new File(Main.thisp().getDataFolder().getPath(), "Messages.yml");
        YamlConfiguration yamlConfiguration_msg = YamlConfiguration.loadConfiguration(messagesYML);

        if (yamlConfiguration_msg.contains("Plugin.NoPermission")) {
            DefultValue.NoPermission = replace(yamlConfiguration_msg.getString("Plugin.NoPermission"));
        } else {
            yamlConfiguration_msg.set("Plugin.NoPermission", "[prefix] &cFor &b[cmd] &cyou lack the permission &6[perm]&c!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6NoPermission §4was added to §9Messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Plugin.Reload.Start")) {
            DefultValue.ReloadStart = replace(yamlConfiguration_msg.getString("Plugin.Reload.Start"));
        } else {
            yamlConfiguration_msg.set("Plugin.Reload.Start", "&6Plugin reload...");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Reload Start §4was added to §9Messages.yml§4!");
        }
        if (yamlConfiguration_msg.contains("Plugin.Reload.End")) {
            DefultValue.ReloadEnd = replace(yamlConfiguration_msg.getString("Plugin.Reload.End"));
        } else {
            yamlConfiguration_msg.set("Plugin.Reload.End", "&2Plugin successfully reloaded.");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Reload End §4was added to §9Messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Plugin.VaultNotSetUp")) {
            DefultValue.VaultNotSetUp = replace(yamlConfiguration_msg.getString("Plugin.VaultNotSetUp"));
        } else {
            yamlConfiguration_msg.set("Plugin.VaultNotSetUp", "[prefix] &4Vault / Economy not set up!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6VaultNotSetUp §4was added to §9Messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Help")) {
            DefultValue.Help = replace(yamlConfiguration_msg.getString("Help"));
        } else {
            yamlConfiguration_msg.set("Help",
                    "[prefix] &8----- &2Wonder&6Bag&9Shop &chelp &8-----" +
                            "\n[prefix]" +
                            "\n[prefix] &8'&b/wonderbagshop&8' &eOpens this help." +
                            "\n[prefix] &8'&b/wonderbagshop shop&8' &eOpens the shop." +
                            "\n[prefix] &8'&b/wonderbagshop gift &7<player>&8' &eGive away a WonderBag." +
                            "\n[prefix] &8'&b/wonderbagshop give &7<player> <size>&8' &eGive a player a WonderBag." +
                            "\n[prefix] &8'&b/wonderbagshop reload&8' &eReloads the Plugin." +
                            "\n[prefix]" +
                            "\n[prefix] &8----------------------------");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Help §4was added to §9Messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("Shop.No_money")){
            DefultValue.No_money = replace(yamlConfiguration_msg.getString("Shop.No_money"));
        }else{
            yamlConfiguration_msg.set("Shop.No_money", "[prefix] &cYou do not have enough money!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6No_money §4was added to §9Messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("Shop.NoInventorySpace")){
            DefultValue.NoInventorySpace = replace(yamlConfiguration_msg.getString("Shop.NoInventorySpace"));
        }else{
            yamlConfiguration_msg.set("Shop.NoInventorySpace", "[prefix] &cNo free inventory space!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6NoInventorySpace §4was added to §9Messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("Shop.Buy_msg")){
            DefultValue.Buy_msg = replace(yamlConfiguration_msg.getString("Shop.Buy_msg"));
        }else{
            yamlConfiguration_msg.set("Shop.Buy_msg", "[prefix] &2You bought [wonderbag] &2for &6[price] [currency]&2!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Buy_msg §4was added to §9Messages.yml§4!");
        }

        // give / gift

        if(yamlConfiguration_msg.contains("Give.Sender")){
            DefultValue.give = replace(yamlConfiguration_msg.getString("Give.Sender"));
        }else{
            yamlConfiguration_msg.set("Give.Sender", "[prefix] &2You gave &6[player] &2a [wonderbag]&2!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Give Sender §4was added to §9Messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("Give.Receiver")){
            DefultValue.received = replace(yamlConfiguration_msg.getString("Give.Receiver"));
        }else{
            yamlConfiguration_msg.set("Give.Receiver", "[prefix] &2You have received a [wonderbag] &2from &6[sender]&2!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Give Receiver §4was added to §9Messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("Gift.Sender")){
            DefultValue.give = replace(yamlConfiguration_msg.getString("Gift.Sender"));
        }else{
            yamlConfiguration_msg.set("Gift.Sender", "[prefix] &2You gift &6[player] &2a [wonderbag] &2for &6[price] [currency]&2!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Gift Sender §4was added to §9Messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("Gift.Receiver")){
            DefultValue.received = replace(yamlConfiguration_msg.getString("Gift.Receiver"));
        }else{
            yamlConfiguration_msg.set("Gift.Receiver", "[prefix] &2You have received a [wonderbag] &2as a gift from &6[sender]&2!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Gift Receiver §4was added to §9Messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("Give_&_Gift.PlayerNotFond")){
            DefultValue.PlayerNotFound = replace(yamlConfiguration_msg.getString("Give_&_Gift.PlayerNotFond"));
        }else{
            yamlConfiguration_msg.set("Give_&_Gift.PlayerNotFond", "[prefix] &cThe player &6[player] &cwas not found or is not online!.");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Give_&_Gift PlayerNotFond §4was added to §9Messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("Give_&_Gift.PlayerNoInventorySpace")){
            DefultValue.PlayerNoInventorySpace = replace(yamlConfiguration_msg.getString("Give_&_Gift.PlayerNoInventorySpace"));
        }else{
            yamlConfiguration_msg.set("Give_&_Gift.PlayerNoInventorySpace", "[prefix] &6[player] &chas no free inventory space available!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Give_&_Gift PlayerNoInventorySpace §4was added to §9Messages.yml§4!");
        }




        try {
            yamlConfiguration_msg.save(messagesYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2Messages.yml loaded successfully.");
    }

    public static void messagesDisable(){
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Messages.yml successfully deactivated.");
    }

    private static String replace(String Text) {

        File WB1YML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/" + "WonderBag_1.yml");
        YamlConfiguration yamlConfiguration_WB1 = YamlConfiguration.loadConfiguration(WB1YML);

        File WB2YML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/" + "WonderBag_2.yml");
        YamlConfiguration yamlConfiguration_WB2 = YamlConfiguration.loadConfiguration(WB2YML);

        File WB3YML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/" + "WonderBag_3.yml");
        YamlConfiguration yamlConfiguration_WB3 = YamlConfiguration.loadConfiguration(WB3YML);

        return Text.replace("[prefix]", DefultValue.Prefix).replace("&", "§").replace("[currency]", DefultValue.Currency)
                .replace("[ue]", "ü").replace("[UE]", "Ü").replace("[oe]", "Ö").replace("[OE]", "Ö")
                .replace("[ae]", "ä").replace("[AE]", "Ä").replace("[WB1Name]", DefultValue_WB1.Name)
                .replace("[WB2Name]", DefultValue_WB2.Name).replace("[WB3Name]", DefultValue_WB3.Name)
                .replace("[WB1Price]", String.valueOf(yamlConfiguration_WB1.get("Shop.price")))
                .replace("[WB2Price]", String.valueOf(yamlConfiguration_WB2.get("Shop.price")))
                .replace("[WB3Price]", String.valueOf(yamlConfiguration_WB3.get("Shop.price")));
    }
}