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

import de.jatitv.wonderbagshop.defultValue.DefultValue;
import de.jatitv.wonderbagshop.defultValue.DefultValueChest_1;
import de.jatitv.wonderbagshop.defultValue.DefultValueChest_2;
import de.jatitv.wonderbagshop.defultValue.DefultValueChest_3;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Messages {

    public static void messagesCreate() throws InterruptedException {

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Messages.yml load...");

        File messagesYML = new File(Main.thisp().getDataFolder().getPath(), "Messages.yml");
        YamlConfiguration yamlConfiguration_msg = YamlConfiguration.loadConfiguration(messagesYML);


        if (!yamlConfiguration_msg.contains("Do_not_remove_or_change.Version")) {
            yamlConfiguration_msg.set("Do_not_remove_or_change.Version", "This file was created with version " + Main.getPlugin().getDescription().getVersion());
        }

        yamlConfiguration_msg.set("Do_not_remove_or_change.BuildNr", Main.Build);
        if (!yamlConfiguration_msg.contains("Do_not_remove_or_change.Autor")) {
            yamlConfiguration_msg.set("Do_not_remove_or_change.Autor", Main.Autor);
        }
        if (!yamlConfiguration_msg.contains("Do_not_remove_or_change.Spigot")) {
            yamlConfiguration_msg.set("Do_not_remove_or_change.Spigot", "https://www.spigotmc.org/resources/wonderbagshop.89234/");
        }
        if (!yamlConfiguration_msg.contains("Do_not_remove_or_change.Discord")) {
            yamlConfiguration_msg.set("Do_not_remove_or_change.Discord", "You can find more information about WonderBagShop on Discord: https://discord.com/invite/vRyXFFterJ");
        }
        if (!yamlConfiguration_msg.contains("Do_not_remove_or_change.--------------------------------------------")) {
            yamlConfiguration_msg.set("Do_not_remove_or_change.--------------------------------------------", "--------------------------------------------");
        }


        if (yamlConfiguration_msg.contains("Plugin.NoPermissionForCommand")) {
            DefultValue.NoPermissionForCommand = replace(yamlConfiguration_msg.getString("Plugin.NoPermissionForCommand"));
        } else {
            yamlConfiguration_msg.set("Plugin.NoPermissionForCommand", "[prefix] &cFor &b[cmd] &cyou lack the permission &6[perm]&c!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6NoPermissionForCommand §4was added to §9Messages.yml§4!");
        }
        if (yamlConfiguration_msg.contains("Plugin.NoPermission")) {
            DefultValue.NoPermission = replace(yamlConfiguration_msg.getString("Plugin.NoPermission"));
        } else {
            yamlConfiguration_msg.set("Plugin.NoPermission", "[prefix] &cYou do not have permission for &2Wonder&6Bag&9Shop!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6NoPermission §4was added to §9Messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Plugin.VaultNotSetUp")) {
            DefultValue.VaultNotSetUp = replace(yamlConfiguration_msg.getString("Plugin.VaultNotSetUp"));
        } else {
            yamlConfiguration_msg.set("Plugin.VaultNotSetUp", "[prefix] &4Vault / Economy not set up!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6VaultNotSetUp §4was added to §9Messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Plugin.SoundNotFound")) {
            DefultValue.SoundNotFound = replace(yamlConfiguration_msg.getString("Plugin.SoundNotFound"));
        } else {
            yamlConfiguration_msg.set("Plugin.SoundNotFound", "[prefix] &4The sound &6[sound] &4could not be found! Please check your settings.");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6SoundNotFound §4was added to §9Messages.yml§4!");
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

        if (yamlConfiguration_msg.contains("Help.Help")) {
            DefultValue.HelpHelp = replace(yamlConfiguration_msg.getString("Help.Help"));
        } else {
            yamlConfiguration_msg.set("Help.Help", "&8'&b/wonderbagshop help&8' &eOpens this help.");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Help Help §4was added to §9Messages.yml§4!");
        }
        if (yamlConfiguration_msg.contains("Help.Shop")) {
            DefultValue.HelpShop = replace(yamlConfiguration_msg.getString("Help.Shop"));
        } else {
            yamlConfiguration_msg.set("Help.Shop", "&8'&b/wonderbagshop&8' &eOpens the shop.");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Help Shop §4was added to §9Messages.yml§4!");
        }
        if (yamlConfiguration_msg.contains("Help.Info")) {
            DefultValue.HelpInfo = replace(yamlConfiguration_msg.getString("Help.Info"));
        } else {
            yamlConfiguration_msg.set("Help.Info", "&8'&b/wonderbagshop info&8' &eCall the info about &2W&6B&9S&e.");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Help Info §4was added to §9Messages.yml§4!");
        }
        if (yamlConfiguration_msg.contains("Help.Gift")) {
            DefultValue.HelpGift = replace(yamlConfiguration_msg.getString("Help.Gift"));
        } else {
            yamlConfiguration_msg.set("Help.Gift", "&8'&b/wonderbagshop gift &7<player>&8' &eOpens the gift GUI and Give away a WonderBag.");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Help Gift §4was added to §9Messages.yml§4!");
        }
        if (yamlConfiguration_msg.contains("Help.Give")) {
            DefultValue.HelpGive = replace(yamlConfiguration_msg.getString("Help.Give"));
        } else {
            yamlConfiguration_msg.set("Help.Give", "&8'&b/wonderbagshop give &7<player>&8' &eOpens the give GUI and Give a player a WonderBag.");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Help Give §4was added to §9Messages.yml§4!");
        }
        if (yamlConfiguration_msg.contains("Help.GiveConsole")) {
            DefultValue.HelpGiveConsole = replace(yamlConfiguration_msg.getString("Help.GiveConsole"));
        } else {
            // ToDo
            yamlConfiguration_msg.set("Help.GiveConsole", "&8'&b/wonderbagshop give &7<player> " +
                    "<ChestSmall | ChestMedium | ChestLarge | ItemSmall | ItemMedium | ItemLarge>&8' &eGive a player a WonderBag. &4Only for the console!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Help GiveConsole §4was added to §9Messages.yml§4!");
        }
        if (yamlConfiguration_msg.contains("Help.Settings")) {
            DefultValue.HelpSettings = replace(yamlConfiguration_msg.getString("Help.Settings"));
        } else {
            yamlConfiguration_msg.set("Help.Settings", "&8'&b/wonderbagshop settings&8' &eEdit the Settings.");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Help Settings §4was added to §9Messages.yml§4!");
        }
        if (yamlConfiguration_msg.contains("Help.Reload")) {
            DefultValue.HelpReload = replace(yamlConfiguration_msg.getString("Help.Reload"));
        } else {
            yamlConfiguration_msg.set("Help.Reload", "&8'&b/wonderbagshop reload&8' &eReloads the Plugin.");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Help Reload §4was added to §9Messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Shop.No_money")) {
            DefultValue.No_money = replace(yamlConfiguration_msg.getString("Shop.No_money"));
        } else {
            yamlConfiguration_msg.set("Shop.No_money", "[prefix] &cYou do not have enough money!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6No_money §4was added to §9Messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Shop.NoInventorySpace")) {
            DefultValue.NoInventorySpace = replace(yamlConfiguration_msg.getString("Shop.NoInventorySpace"));
        } else {
            yamlConfiguration_msg.set("Shop.NoInventorySpace", "[prefix] &cNo free inventory space!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6NoInventorySpace §4was added to §9Messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Shop.Buy_msg")) {
            DefultValue.Buy_msg = replace(yamlConfiguration_msg.getString("Shop.Buy_msg"));
        } else {
            yamlConfiguration_msg.set("Shop.Buy_msg", "[prefix] &2You bought [wonderbag] &2for &6[price] [currency]&2!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Buy_msg §4was added to §9Messages.yml§4!");
        }

        // give / gift

        if (yamlConfiguration_msg.contains("Give.Sender")) {
            DefultValue.give = replace(yamlConfiguration_msg.getString("Give.Sender"));
        } else {
            yamlConfiguration_msg.set("Give.Sender", "[prefix] &2You gave &6[player] &2a [wonderbag]&2!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Give Sender §4was added to §9Messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Give.Receiver")) {
            DefultValue.giveReceived = replace(yamlConfiguration_msg.getString("Give.Receiver"));
        } else {
            yamlConfiguration_msg.set("Give.Receiver", "[prefix] &2You have received a [wonderbag] &2from &6[sender]&2!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Give Receiver §4was added to §9Messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Gift.Sender")) {
            DefultValue.give = replace(yamlConfiguration_msg.getString("Gift.Sender"));
        } else {
            yamlConfiguration_msg.set("Gift.Sender", "[prefix] &2You gift &6[player] &2a [wonderbag] &2for &6[price] [currency]&2!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Gift Sender §4was added to §9Messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Gift.Receiver")) {
            DefultValue.giveReceived = replace(yamlConfiguration_msg.getString("Gift.Receiver"));
        } else {
            yamlConfiguration_msg.set("Gift.Receiver", "[prefix] &2You have received a [wonderbag] &2as a gift from &6[sender]&2!");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Gift Receiver §4was added to §9Messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Give_&_Gift.PlayerNotFond")) {
            DefultValue.PlayerNotFound = replace(yamlConfiguration_msg.getString("Give_&_Gift.PlayerNotFond"));
        } else {
            yamlConfiguration_msg.set("Give_&_Gift.PlayerNotFond", "[prefix] &cThe player &6[player] &cwas not found or is not online!.");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Message §6Give_&_Gift PlayerNotFond §4was added to §9Messages.yml§4!");
        }

        if (yamlConfiguration_msg.contains("Give_&_Gift.PlayerNoInventorySpace")) {
            DefultValue.PlayerNoInventorySpace = replace(yamlConfiguration_msg.getString("Give_&_Gift.PlayerNoInventorySpace"));
        } else {
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

    public static void messagesDisable() {
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Messages.yml successfully deactivated.");
    }

    private static String replace(String Text) {

        return Text.replace("[prefix]", DefultValue.Prefix).replace("&", "§").replace("[currency]", DefultValue.Currency)
                .replace("[ue]", "ü").replace("[UE]", "Ü").replace("[oe]", "Ö").replace("[OE]", "Ö")
                .replace("[ae]", "ä").replace("[AE]", "Ä").replace("[WB1Name]", DefultValueChest_1.Name)
                .replace("[WB2Name]", DefultValueChest_2.Name).replace("[WB3Name]", DefultValueChest_3.Name);
    }
}