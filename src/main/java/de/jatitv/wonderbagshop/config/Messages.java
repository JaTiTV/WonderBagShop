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

        DefultValue.WB1price_ST = String.valueOf(DefultValue_WB1.price);
        //DefultValue.WB2price_ST = String.valueOf(DefultValue_WB2.price);
        //DefultValue.WB3price_ST = String.valueOf(DefultValue_WB3.price);

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Messages.yml load...");

        File messagesYML = new File(Main.thisp().getDataFolder().getPath(), "Messages.yml");
        YamlConfiguration yamlConfiguration_msg = YamlConfiguration.loadConfiguration(messagesYML);

        if (yamlConfiguration_msg.contains("Plugin.NoPermission")) {
            DefultValue.NoPermission = replace(yamlConfiguration_msg.getString("Plugin.NoPermission"));
        } else {
            yamlConfiguration_msg.set("Plugin.NoPermission", "[prefix] &cF[ue]r &b[cmd] &cfehlt dir die Permission &6[perm]&c!");
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
            yamlConfiguration_msg.set("Help", "&8[&2W&6B&9S&8] &8----- &2Wonder&6Bag&9Shop &chelp &8-----\n&8[&2W&6B&9S&8]\n&8[&2W&6B&9S&8] '&b/wonderbagshop&e' Öffnet diese help." +
                    "\n&8[&2W&6B&9S&8] '&b/wonderbagshop shop&e' Öffnet den Shop.\n&8[&2W&6B&9S&8] '&b/wonderbagshop reload&e' Läd die Cofig neu.\n&8[&2W&6B&9S&8]\n" +
                    "&8[&2W&6B&9S&8] &8----------------------------");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Help §4was added to §9Messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("Shop.No_money")){
            DefultValue.No_money = replace(yamlConfiguration_msg.getString("Shop.No_money"));
        }else{
            yamlConfiguration_msg.set("Shop.No_money", "[prefix] &cDu hast nicht gen[ue]gend Geld!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6No_money §4was added to §9Messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("Shop.WonderBag.buy_msg.WonderBag_1")){
            DefultValue.WB1buy_msg = replace(yamlConfiguration_msg.getString("Shop.WonderBag.buy_msg.WonderBag_1"));
        }else{
            yamlConfiguration_msg.set("Shop.WonderBag.buy_msg.WonderBag_1", "[prefix] &bDu hast dir [WB1Name] &bf[ue]r [WB1Price] [currency] &bgekauft!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6WonderBag Item_1 buy_msg §4was added to §9Messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("Shop.WonderBag.buy_msg.WonderBag_2")){
            DefultValue.WB2buy_msg = replace(yamlConfiguration_msg.getString("Shop.WonderBag.buy_msg.WonderBag_2"));
        }else{
            yamlConfiguration_msg.set("Shop.WonderBag.buy_msg.WonderBag_2", "[prefix] &bDu hast dir [WB2Name] &bf[ue]r [WB2Price] [currency] &bgekauft!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6WonderBag Item_2 buy_msg §4was added to §9Messages.yml§4!");
        }

        if(yamlConfiguration_msg.contains("Shop.WonderBag.buy_msg.WonderBag_3")){
            DefultValue.WB3buy_msg = replace(yamlConfiguration_msg.getString("Shop.WonderBag.buy_msg.WonderBag_3"));
        }else{
            yamlConfiguration_msg.set("Shop.WonderBag.buy_msg.WonderBag_3", "[prefix] &bDu hast dir [WB3Name] &bf[ue]r [WB3Price] [currency] &bgekauft!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6WonderBag Item_3 buy_msg §4was added to §9Messages.yml§4!");
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
        File WB1YML = new File(Main.thisp().getDataFolder().getPath(), "WonderBag_1.yml");
        YamlConfiguration yamlConfiguration_wb1 = YamlConfiguration.loadConfiguration(WB1YML);

        File WB2YML = new File(Main.thisp().getDataFolder().getPath(), "WonderBag_2.yml");
        YamlConfiguration yamlConfiguration_wb2 = YamlConfiguration.loadConfiguration(WB2YML);

        File WB3YML = new File(Main.thisp().getDataFolder().getPath(), "WonderBag_3.yml");
        YamlConfiguration yamlConfiguration_wb3 = YamlConfiguration.loadConfiguration(WB3YML);

        return Text.replace("[prefix]", DefultValue.Prefix).replace("&", "§").replace("[currency]", DefultValue.Currency)
                .replace("[ue]", "ü").replace("[UE]", "Ü").replace("[oe]", "Ö").replace("[OE]", "Ö")
                .replace("[ae]", "ä").replace("[AE]", "Ä").replace("[WB1Name]", DefultValue_WB1.Name)
                .replace("[WB2Name]", DefultValue_WB2.Name).replace("[WB3Name]", DefultValue_WB3.Name)
                .replace("[WB1Price]", String.valueOf(yamlConfiguration_wb1.get("Shop.price")))
                .replace("[WB2Price]", String.valueOf(yamlConfiguration_wb2.get("Shop.price")))
                .replace("[WB3Price]", String.valueOf(yamlConfiguration_wb3.get("Shop.price")));
    }



}
