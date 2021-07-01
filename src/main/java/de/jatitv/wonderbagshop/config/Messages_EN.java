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

public class Messages_EN {

    public static void messagesCreate() throws InterruptedException {
        Long long_ = Long.valueOf(System.currentTimeMillis());


        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4en_EN_Messages.yml load...");


        File messagesENYML = new File(Main.thisp().getDataFolder().getPath(), "languages/en_EN_Messages.yml");
        YamlConfiguration yamlConfiguration_ENmsg = YamlConfiguration.loadConfiguration(messagesENYML);


        if (!yamlConfiguration_ENmsg.contains("Do_not_remove_or_change.Created")) {
            yamlConfiguration_ENmsg.set("Do_not_remove_or_change.Created", "This file was created with version " + Main.getPlugin().getDescription().getVersion());
        }

        yamlConfiguration_ENmsg.set("Do_not_remove_or_change.Version", Main.getPlugin().getDescription().getVersion());

        yamlConfiguration_ENmsg.set("Do_not_remove_or_change.Autor", Main.Autor);

        yamlConfiguration_ENmsg.set("Do_not_remove_or_change.Spigot", Main.Spigot);

        yamlConfiguration_ENmsg.set("Do_not_remove_or_change.Discord", Main.Discord);



        if (!yamlConfiguration_ENmsg.contains("Plugin.NoPermissionForCommand")) {
            yamlConfiguration_ENmsg.set("Plugin.NoPermissionForCommand", DefaultValue.NoPermissionForCommand.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6NoPermissionForCommand §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Plugin.NoPermission")) {
            yamlConfiguration_ENmsg.set("Plugin.NoPermission", DefaultValue.NoPermission.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6NoPermission §4was added to §9en_EN_Messages.yml§4!");
        }

        if (!yamlConfiguration_ENmsg.contains("Plugin.VaultNotSetUp")) {
            yamlConfiguration_ENmsg.set("Plugin.VaultNotSetUp", DefaultValue.VaultNotSetUp.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6VaultNotSetUp §4was added to §9en_EN_Messages.yml§4!");
        }

        if (!yamlConfiguration_ENmsg.contains("Plugin.SoundNotFound")) {
            yamlConfiguration_ENmsg.set("Plugin.SoundNotFound", DefaultValue.SoundNotFound.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6SoundNotFound §4was added to §9en_EN_Messages.yml§4!");
        }

        if (!yamlConfiguration_ENmsg.contains("Plugin.Reload.Start")) {
            yamlConfiguration_ENmsg.set("Plugin.Reload.Start", DefaultValue.ReloadStart.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Reload Start §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Plugin.Reload.End")) {
            yamlConfiguration_ENmsg.set("Plugin.Reload.End", DefaultValue.ReloadEnd.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Reload End §4was added to §9en_EN_Messages.yml§4!");
        }

        if (!yamlConfiguration_ENmsg.contains("Help.Help")) {
            yamlConfiguration_ENmsg.set("Help.Help", DefaultValue.HelpHelp.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Help §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Help.Shop")) {
            yamlConfiguration_ENmsg.set("Help.Shop", DefaultValue.HelpShop.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Shop §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Help.Info")) {
            yamlConfiguration_ENmsg.set("Help.Info", DefaultValue.HelpInfo.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Info §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Help.Gift")) {
            yamlConfiguration_ENmsg.set("Help.Gift",  DefaultValue.HelpGift.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Gift §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Help.Give")) {
            yamlConfiguration_ENmsg.set("Help.Give", DefaultValue.HelpGive.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Give §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Help.Giveall")) {
            yamlConfiguration_ENmsg.set("Help.Giveall", DefaultValue.HelpGiveAll.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Giveall §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Help.GiveConsole")) {
            yamlConfiguration_ENmsg.set("Help.GiveConsole", DefaultValue.HelpGiveConsole.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help GiveConsole §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Help.GiveallConsole")) {
            yamlConfiguration_ENmsg.set("Help.GiveallConsole", DefaultValue.HelpGiveAllConsole.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help GiveallConsole §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Help.Settings")) {
            yamlConfiguration_ENmsg.set("Help.Settings", DefaultValue.HelpSettings.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Settings §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Help.Reload")) {
            yamlConfiguration_ENmsg.set("Help.Reload", DefaultValue.HelpReload.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Reload §4was added to §9en_EN_Messages.yml§4!");
        }

        if (!yamlConfiguration_ENmsg.contains("Shop.No_money")) {
            yamlConfiguration_ENmsg.set("Shop.No_money", DefaultValue.No_money.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6No_money §4was added to §9en_EN_Messages.yml§4!");
        }

        if (!yamlConfiguration_ENmsg.contains("Shop.NoInventorySpace")) {
            yamlConfiguration_ENmsg.set("Shop.NoInventorySpace", DefaultValue.NoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6NoInventorySpace §4was added to §9en_EN_Messages.yml§4!");
        }

        if (!yamlConfiguration_ENmsg.contains("Shop.Buy_msg")) {
            yamlConfiguration_ENmsg.set("Shop.Buy_msg", DefaultValue.Buy_msg.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Buy_msg §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Shop.Bypass")) {
            yamlConfiguration_ENmsg.set("Shop.Bypass", DefaultValue.Bypass.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Bypass §4was added to §9en_EN_Messages.yml§4!");
        }

        // give / gift

        if (!yamlConfiguration_ENmsg.contains("Give.Sender")) {
            yamlConfiguration_ENmsg.set("Give.Sender", DefaultValue.give.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give Sender §4was added to §9en_EN_Messages.yml§4!");
        }

        if (!yamlConfiguration_ENmsg.contains("Give.Receiver")) {
            yamlConfiguration_ENmsg.set("Give.Receiver", DefaultValue.giveReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give Receiver §4was added to §9en_EN_Messages.yml§4!");
        }

        if (!yamlConfiguration_ENmsg.contains("Gift.Sender")) {
            yamlConfiguration_ENmsg.set("Gift.Sender", DefaultValue.gift.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Gift Sender §4was added to §9en_EN_Messages.yml§4!");
        }

        if (!yamlConfiguration_ENmsg.contains("Gift.Receiver")) {
            yamlConfiguration_ENmsg.set("Gift.Receiver", DefaultValue.giftReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Gift Receiver §4was added to §9en_EN_Messages.yml§4!");
        }

        if (!yamlConfiguration_ENmsg.contains("Give_&_Gift.PlayerNotFond")) {
            yamlConfiguration_ENmsg.set("Give_&_Gift.PlayerNotFond", DefaultValue.PlayerNotFound.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give_&_Gift PlayerNotFond §4was added to §9en_EN_Messages.yml§4!");
        }

        if (!yamlConfiguration_ENmsg.contains("Give_&_Gift.PlayerNoInventorySpace")) {
            yamlConfiguration_ENmsg.set("Give_&_Gift.PlayerNoInventorySpace", DefaultValue.PlayerNoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give_&_Gift PlayerNoInventorySpace §4was added to §9en_EN_Messages.yml§4!");
        }

        if (!yamlConfiguration_ENmsg.contains("Title.Reload")) {
            yamlConfiguration_ENmsg.set("Title.Reload",  DefaultValue.Title_Reload.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Reload §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Title.Buy")) {
            yamlConfiguration_ENmsg.set("Title.Buy", DefaultValue.Title_Buy.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Buy §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Title.No_money")) {
            yamlConfiguration_ENmsg.set("Title.No_money", DefaultValue.Title_No_money.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title No_money §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Title.NoInventorySpace")) {
            yamlConfiguration_ENmsg.set("Title.NoInventorySpace", DefaultValue.Title_NoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title NoInventorySpace §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Title.Give.Sender")) {
            yamlConfiguration_ENmsg.set("Title.Give.Sender", DefaultValue.Title_Give.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give Sender §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Title.Give.Receiver")) {
            yamlConfiguration_ENmsg.set("Title.Give.Receiver", DefaultValue.Title_GiveReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give Receiver §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Title.Gift.Sender")) {
            yamlConfiguration_ENmsg.set("Title.Gift.Sender", DefaultValue.Title_Gift.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Gift Sender §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Title.Gift.Receiver")) {
            yamlConfiguration_ENmsg.set("Title.Gift.Receiver", DefaultValue.Title_GiftReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Gift Receiver §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Title.Give_&_Gift.PlayerNotFond")) {
            yamlConfiguration_ENmsg.set("Title.Give_&_Gift.PlayerNotFond", DefaultValue.Title_PlayerNotFound.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give_&_Gift PlayerNotFond §4was added to §9en_EN_Messages.yml§4!");
        }
        if (!yamlConfiguration_ENmsg.contains("Title.Give_&_Gift.PlayerNoInventorySpace")) {
            yamlConfiguration_ENmsg.set("Title.Give_&_Gift.PlayerNoInventorySpace", DefaultValue.Title_PlayerNoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesENYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give_&_Gift PlayerNoInventorySpace §4was added to §9en_EN_Messages.yml§4!");
        }


        try {
            yamlConfiguration_ENmsg.save(messagesENYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2en_EN_Messages.yml loaded successfully." + " §7- §e" + (System.currentTimeMillis() - long_.longValue()) + "ms");

    }

    public static void messagesDisable() {
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4en_EN_Messages.yml successfully deactivated.");
    }

}