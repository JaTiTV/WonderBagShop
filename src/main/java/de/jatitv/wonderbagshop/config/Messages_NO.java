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

import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Messages_NO {

    public static void messagesCreate() throws InterruptedException {


        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4no_NO_Messages.yml load...");


        File messagesNOYML = new File(Main.thisp().getDataFolder().getPath(), "languages/no_NO_Messages.yml");
        YamlConfiguration yamlConfiguration_NOmsg = YamlConfiguration.loadConfiguration(messagesNOYML);


        if (!yamlConfiguration_NOmsg.contains("Do_not_remove_or_change.Created")) {
            yamlConfiguration_NOmsg.set("Do_not_remove_or_change.Created", "This file was created with version " + Main.getPlugin().getDescription().getVersion());
        }

        yamlConfiguration_NOmsg.set("Do_not_remove_or_change.Version", Main.getPlugin().getDescription().getVersion());

        yamlConfiguration_NOmsg.set("Do_not_remove_or_change.Autor", Main.Autor);

        yamlConfiguration_NOmsg.set("Do_not_remove_or_change.Spigot", Main.Spigot);

        yamlConfiguration_NOmsg.set("Do_not_remove_or_change.Discord", Main.Discord);



        if (!yamlConfiguration_NOmsg.contains("Plugin.NoPermissionForCommand")) {
            yamlConfiguration_NOmsg.set("Plugin.NoPermissionForCommand", DefaultValue.NO_NoPermissionForCommand.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6NoPermissionForCommand §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Plugin.NoPermission")) {
            yamlConfiguration_NOmsg.set("Plugin.NoPermission", DefaultValue.NO_NoPermission.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6NoPermission §4was added to §9no_NO_Messages.yml§4!");
        }

        if (!yamlConfiguration_NOmsg.contains("Plugin.VaultNotSetUp")) {
            yamlConfiguration_NOmsg.set("Plugin.VaultNotSetUp", DefaultValue.NO_VaultNotSetUp.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6VaultNotSetUp §4was added to §9no_NO_Messages.yml§4!");
        }

        if (!yamlConfiguration_NOmsg.contains("Plugin.SoundNotFound")) {
            yamlConfiguration_NOmsg.set("Plugin.SoundNotFound", DefaultValue.NO_SoundNotFound.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6SoundNotFound §4was added to §9no_NO_Messages.yml§4!");
        }

        if (!yamlConfiguration_NOmsg.contains("Plugin.Reload.Start")) {
            yamlConfiguration_NOmsg.set("Plugin.Reload.Start", DefaultValue.NO_ReloadStart.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Reload Start §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Plugin.Reload.End")) {
            yamlConfiguration_NOmsg.set("Plugin.Reload.End", DefaultValue.NO_ReloadEnd.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Reload End §4was added to §9no_NO_Messages.yml§4!");
        }

        if (!yamlConfiguration_NOmsg.contains("Help.Help")) {
            yamlConfiguration_NOmsg.set("Help.Help", DefaultValue.NO_HelpHelp.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Help §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Help.Shop")) {
            yamlConfiguration_NOmsg.set("Help.Shop", DefaultValue.NO_HelpShop.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Shop §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Help.Info")) {
            yamlConfiguration_NOmsg.set("Help.Info", DefaultValue.NO_HelpInfo.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Info §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Help.Gift")) {
            yamlConfiguration_NOmsg.set("Help.Gift",  DefaultValue.NO_HelpGift.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Gift §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Help.Give")) {
            yamlConfiguration_NOmsg.set("Help.Give", DefaultValue.NO_HelpGive.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Give §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Help.Giveall")) {
            yamlConfiguration_NOmsg.set("Help.Giveall", DefaultValue.NO_HelpGiveAll.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Giveall §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Help.GiveConsole")) {
            yamlConfiguration_NOmsg.set("Help.GiveConsole", DefaultValue.NO_HelpGiveConsole.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help GiveConsole §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Help.GiveallConsole")) {
            yamlConfiguration_NOmsg.set("Help.GiveallConsole", DefaultValue.NO_HelpGiveAllConsole.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help GiveallConsole §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Help.Settings")) {
            yamlConfiguration_NOmsg.set("Help.Settings", DefaultValue.NO_HelpSettings.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Settings §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Help.Reload")) {
            yamlConfiguration_NOmsg.set("Help.Reload", DefaultValue.NO_HelpReload.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Reload §4was added to §9no_NO_Messages.yml§4!");
        }

        if (!yamlConfiguration_NOmsg.contains("Shop.No_money")) {
            yamlConfiguration_NOmsg.set("Shop.No_money", DefaultValue.NO_No_money.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6No_money §4was added to §9no_NO_Messages.yml§4!");
        }

        if (!yamlConfiguration_NOmsg.contains("Shop.NoInventorySpace")) {
            yamlConfiguration_NOmsg.set("Shop.NoInventorySpace", DefaultValue.NO_NoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6NoInventorySpace §4was added to §9no_NO_Messages.yml§4!");
        }

        if (!yamlConfiguration_NOmsg.contains("Shop.Buy_msg")) {
            yamlConfiguration_NOmsg.set("Shop.Buy_msg", DefaultValue.NO_Buy_msg.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Buy_msg §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Shop.Bypass")) {
            yamlConfiguration_NOmsg.set("Shop.Bypass", DefaultValue.NO_Bypass.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Bypass §4was added to §9en_EN_Messages.yml§4!");
        }

        // give / gift

        if (!yamlConfiguration_NOmsg.contains("Give.Sender")) {
            yamlConfiguration_NOmsg.set("Give.Sender", DefaultValue.NO_give.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give Sender §4was added to §9no_NO_Messages.yml§4!");
        }

        if (!yamlConfiguration_NOmsg.contains("Give.Receiver")) {
            yamlConfiguration_NOmsg.set("Give.Receiver", DefaultValue.NO_giveReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give Receiver §4was added to §9no_NO_Messages.yml§4!");
        }

        if (!yamlConfiguration_NOmsg.contains("Gift.Sender")) {
            yamlConfiguration_NOmsg.set("Gift.Sender", DefaultValue.NO_gift.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Gift Sender §4was added to §9no_NO_Messages.yml§4!");
        }

        if (!yamlConfiguration_NOmsg.contains("Gift.Receiver")) {
            yamlConfiguration_NOmsg.set("Gift.Receiver", DefaultValue.NO_giftReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Gift Receiver §4was added to §9no_NO_Messages.yml§4!");
        }

        if (!yamlConfiguration_NOmsg.contains("Give_&_Gift.PlayerNotFond")) {
            yamlConfiguration_NOmsg.set("Give_&_Gift.PlayerNotFond", DefaultValue.NO_PlayerNotFound.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give_&_Gift PlayerNotFond §4was added to §9no_NO_Messages.yml§4!");
        }

        if (!yamlConfiguration_NOmsg.contains("Give_&_Gift.PlayerNoInventorySpace")) {
            yamlConfiguration_NOmsg.set("Give_&_Gift.PlayerNoInventorySpace", DefaultValue.NO_PlayerNoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give_&_Gift PlayerNoInventorySpace §4was added to §9no_NO_Messages.yml§4!");
        }

        if (!yamlConfiguration_NOmsg.contains("Title.Reload")) {
            yamlConfiguration_NOmsg.set("Title.Reload",  DefaultValue.NO_Title_Reload.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Reload §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Title.Buy")) {
            yamlConfiguration_NOmsg.set("Title.Buy", DefaultValue.NO_Title_Buy.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Buy §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Title.No_money")) {
            yamlConfiguration_NOmsg.set("Title.No_money", DefaultValue.NO_Title_No_money.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title No_money §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Title.NoInventorySpace")) {
            yamlConfiguration_NOmsg.set("Title.NoInventorySpace", DefaultValue.NO_Title_NoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title NoInventorySpace §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Title.Give.Sender")) {
            yamlConfiguration_NOmsg.set("Title.Give.Sender", DefaultValue.NO_Title_Give.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give Sender §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Title.Give.Receiver")) {
            yamlConfiguration_NOmsg.set("Title.Give.Receiver", DefaultValue.NO_Title_GiveReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give Receiver §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Title.Gift.Sender")) {
            yamlConfiguration_NOmsg.set("Title.Gift.Sender", DefaultValue.NO_Title_Gift.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Gift Sender §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Title.Gift.Receiver")) {
            yamlConfiguration_NOmsg.set("Title.Gift.Receiver", DefaultValue.NO_Title_GiftReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Gift Receiver §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Title.Give_&_Gift.PlayerNotFond")) {
            yamlConfiguration_NOmsg.set("Title.Give_&_Gift.PlayerNotFond", DefaultValue.NO_Title_PlayerNotFound.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give_&_Gift PlayerNotFond §4was added to §9no_NO_Messages.yml§4!");
        }
        if (!yamlConfiguration_NOmsg.contains("Title.Give_&_Gift.PlayerNoInventorySpace")) {
            yamlConfiguration_NOmsg.set("Title.Give_&_Gift.PlayerNoInventorySpace", DefaultValue.NO_Title_PlayerNoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesNOYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give_&_Gift PlayerNoInventorySpace §4was added to §9no_NO_Messages.yml§4!");
        }


        try {
            yamlConfiguration_NOmsg.save(messagesNOYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2no_NO_Messages.yml loaded successfully.");

    }

    public static void messagesDisable() {
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4no_NO_Messages.yml successfully deactivated.");
    }

}