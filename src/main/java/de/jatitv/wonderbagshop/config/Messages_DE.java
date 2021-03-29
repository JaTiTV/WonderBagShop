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

public class Messages_DE {

    public static void messagesCreate() throws InterruptedException {


        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4de_DE_Messages.yml load...");


        File messagesDEYML = new File(Main.thisp().getDataFolder().getPath(), "languages/de_DE_Messages.yml");
        YamlConfiguration yamlConfiguration_DEmsg = YamlConfiguration.loadConfiguration(messagesDEYML);


        if (!yamlConfiguration_DEmsg.contains("Do_not_remove_or_change.Created")) {
            yamlConfiguration_DEmsg.set("Do_not_remove_or_change.Created", "This file was created with version " + Main.getPlugin().getDescription().getVersion());
        }

        yamlConfiguration_DEmsg.set("Do_not_remove_or_change.Version", Main.getPlugin().getDescription().getVersion());

        yamlConfiguration_DEmsg.set("Do_not_remove_or_change.Autor", Main.Autor);

        yamlConfiguration_DEmsg.set("Do_not_remove_or_change.Spigot", Main.Spigot);

        yamlConfiguration_DEmsg.set("Do_not_remove_or_change.Discord", Main.Discord);



        if (!yamlConfiguration_DEmsg.contains("Plugin.NoPermissionForCommand")) {
            yamlConfiguration_DEmsg.set("Plugin.NoPermissionForCommand", DefaultValue.DE_NoPermissionForCommand.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6NoPermissionForCommand §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Plugin.NoPermission")) {
            yamlConfiguration_DEmsg.set("Plugin.NoPermission", DefaultValue.DE_NoPermission.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6NoPermission §4was added to §9de_DE_Messages.yml§4!");
        }

        if (!yamlConfiguration_DEmsg.contains("Plugin.VaultNotSetUp")) {
            yamlConfiguration_DEmsg.set("Plugin.VaultNotSetUp", DefaultValue.DE_VaultNotSetUp.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6VaultNotSetUp §4was added to §9de_DE_Messages.yml§4!");
        }

        if (!yamlConfiguration_DEmsg.contains("Plugin.SoundNotFound")) {
            yamlConfiguration_DEmsg.set("Plugin.SoundNotFound", DefaultValue.DE_SoundNotFound.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6SoundNotFound §4was added to §9de_DE_Messages.yml§4!");
        }

        if (!yamlConfiguration_DEmsg.contains("Plugin.Reload.Start")) {
            yamlConfiguration_DEmsg.set("Plugin.Reload.Start", DefaultValue.DE_ReloadStart.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Reload Start §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Plugin.Reload.End")) {
            yamlConfiguration_DEmsg.set("Plugin.Reload.End", DefaultValue.DE_ReloadEnd.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Reload End §4was added to §9de_DE_Messages.yml§4!");
        }

        if (!yamlConfiguration_DEmsg.contains("Help.Help")) {
            yamlConfiguration_DEmsg.set("Help.Help", DefaultValue.DE_HelpHelp.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Help §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Help.Shop")) {
            yamlConfiguration_DEmsg.set("Help.Shop", DefaultValue.DE_HelpShop.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Shop §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Help.Info")) {
            yamlConfiguration_DEmsg.set("Help.Info", DefaultValue.DE_HelpInfo.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Info §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Help.Gift")) {
            yamlConfiguration_DEmsg.set("Help.Gift",  DefaultValue.DE_HelpGift.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Gift §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Help.Give")) {
            yamlConfiguration_DEmsg.set("Help.Give", DefaultValue.DE_HelpGive.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Give §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Help.Giveall")) {
            yamlConfiguration_DEmsg.set("Help.Giveall", DefaultValue.DE_HelpGiveAll.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Giveall §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Help.GiveConsole")) {
            yamlConfiguration_DEmsg.set("Help.GiveConsole", DefaultValue.DE_HelpGiveConsole.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help GiveConsole §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Help.GiveallConsole")) {
            yamlConfiguration_DEmsg.set("Help.GiveallConsole", DefaultValue.DE_HelpGiveAllConsole.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help GiveallConsole §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Help.Settings")) {
            yamlConfiguration_DEmsg.set("Help.Settings", DefaultValue.DE_HelpSettings.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Settings §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Help.Reload")) {
            yamlConfiguration_DEmsg.set("Help.Reload", DefaultValue.DE_HelpReload.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Reload §4was added to §9de_DE_Messages.yml§4!");
        }

        if (!yamlConfiguration_DEmsg.contains("Shop.No_money")) {
            yamlConfiguration_DEmsg.set("Shop.No_money", DefaultValue.DE_No_money.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6No_money §4was added to §9de_DE_Messages.yml§4!");
        }

        if (!yamlConfiguration_DEmsg.contains("Shop.NoInventorySpace")) {
            yamlConfiguration_DEmsg.set("Shop.NoInventorySpace", DefaultValue.DE_NoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6NoInventorySpace §4was added to §9de_DE_Messages.yml§4!");
        }

        if (!yamlConfiguration_DEmsg.contains("Shop.Buy_msg")) {
            yamlConfiguration_DEmsg.set("Shop.Buy_msg", DefaultValue.DE_Buy_msg.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Buy_msg §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Shop.Bypass")) {
            yamlConfiguration_DEmsg.set("Shop.Bypass", DefaultValue.DE_Bypass.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Bypass §4was added to §9en_EN_Messages.yml§4!");
        }

        // give / gift

        if (!yamlConfiguration_DEmsg.contains("Give.Sender")) {
            yamlConfiguration_DEmsg.set("Give.Sender", DefaultValue.DE_give.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give Sender §4was added to §9de_DE_Messages.yml§4!");
        }

        if (!yamlConfiguration_DEmsg.contains("Give.Receiver")) {
            yamlConfiguration_DEmsg.set("Give.Receiver", DefaultValue.DE_giveReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give Receiver §4was added to §9de_DE_Messages.yml§4!");
        }

        if (!yamlConfiguration_DEmsg.contains("Gift.Sender")) {
            yamlConfiguration_DEmsg.set("Gift.Sender", DefaultValue.DE_gift.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Gift Sender §4was added to §9de_DE_Messages.yml§4!");
        }

        if (!yamlConfiguration_DEmsg.contains("Gift.Receiver")) {
            yamlConfiguration_DEmsg.set("Gift.Receiver", DefaultValue.DE_giftReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Gift Receiver §4was added to §9de_DE_Messages.yml§4!");
        }

        if (!yamlConfiguration_DEmsg.contains("Give_&_Gift.PlayerNotFond")) {
            yamlConfiguration_DEmsg.set("Give_&_Gift.PlayerNotFond", DefaultValue.DE_PlayerNotFound.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give_&_Gift PlayerNotFond §4was added to §9de_DE_Messages.yml§4!");
        }

        if (!yamlConfiguration_DEmsg.contains("Give_&_Gift.PlayerNoInventorySpace")) {
            yamlConfiguration_DEmsg.set("Give_&_Gift.PlayerNoInventorySpace", DefaultValue.DE_PlayerNoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give_&_Gift PlayerNoInventorySpace §4was added to §9de_DE_Messages.yml§4!");
        }

        if (!yamlConfiguration_DEmsg.contains("Title.Reload")) {
            yamlConfiguration_DEmsg.set("Title.Reload",  DefaultValue.DE_Title_Reload.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Reload §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Title.Buy")) {
            yamlConfiguration_DEmsg.set("Title.Buy", DefaultValue.DE_Title_Buy.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Buy §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Title.No_money")) {
            yamlConfiguration_DEmsg.set("Title.No_money", DefaultValue.DE_Title_No_money.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title No_money §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Title.NoInventorySpace")) {
            yamlConfiguration_DEmsg.set("Title.NoInventorySpace", DefaultValue.DE_Title_NoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title NoInventorySpace §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Title.Give.Sender")) {
            yamlConfiguration_DEmsg.set("Title.Give.Sender", DefaultValue.DE_Title_Give.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give Sender §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Title.Give.Receiver")) {
            yamlConfiguration_DEmsg.set("Title.Give.Receiver", DefaultValue.DE_Title_GiveReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give Receiver §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Title.Gift.Sender")) {
            yamlConfiguration_DEmsg.set("Title.Gift.Sender", DefaultValue.DE_Title_Gift.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Gift Sender §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Title.Gift.Receiver")) {
            yamlConfiguration_DEmsg.set("Title.Gift.Receiver", DefaultValue.DE_Title_GiftReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Gift Receiver §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Title.Give_&_Gift.PlayerNotFond")) {
            yamlConfiguration_DEmsg.set("Title.Give_&_Gift.PlayerNotFond", DefaultValue.DE_Title_PlayerNotFound.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give_&_Gift PlayerNotFond §4was added to §9de_DE_Messages.yml§4!");
        }
        if (!yamlConfiguration_DEmsg.contains("Title.Give_&_Gift.PlayerNoInventorySpace")) {
            yamlConfiguration_DEmsg.set("Title.Give_&_Gift.PlayerNoInventorySpace", DefaultValue.DE_Title_PlayerNoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesDEYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give_&_Gift PlayerNoInventorySpace §4was added to §9de_DE_Messages.yml§4!");
        }


        try {
            yamlConfiguration_DEmsg.save(messagesDEYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2de_DE_Messages.yml loaded successfully.");

    }

    public static void messagesDisable() {
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4de_DE_Messages.yml successfully deactivated.");
    }

}