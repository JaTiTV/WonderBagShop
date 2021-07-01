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

public class Messages_FR {

    public static void messagesCreate() throws InterruptedException {
        Long long_ = Long.valueOf(System.currentTimeMillis());


        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4fr_FR_Messages.yml load...");


        File messagesFRYML = new File(Main.thisp().getDataFolder().getPath(), "languages/fr_FR_Messages.yml");
        YamlConfiguration yamlConfiguration_FRmsg = YamlConfiguration.loadConfiguration(messagesFRYML);


        if (!yamlConfiguration_FRmsg.contains("Do_not_remove_or_change.Created")) {
            yamlConfiguration_FRmsg.set("Do_not_remove_or_change.Created", "This file was created with version " + Main.getPlugin().getDescription().getVersion());
        }

        yamlConfiguration_FRmsg.set("Do_not_remove_or_change.Version", Main.getPlugin().getDescription().getVersion());

        yamlConfiguration_FRmsg.set("Do_not_remove_or_change.Autor", Main.Autor);

        yamlConfiguration_FRmsg.set("Do_not_remove_or_change.Spigot", Main.Spigot);

        yamlConfiguration_FRmsg.set("Do_not_remove_or_change.Discord", Main.Discord);



        if (!yamlConfiguration_FRmsg.contains("Plugin.NoPermissionForCommand")) {
            yamlConfiguration_FRmsg.set("Plugin.NoPermissionForCommand", DefaultValue.FR_NoPermissionForCommand.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6NoPermissionForCommand §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Plugin.NoPermission")) {
            yamlConfiguration_FRmsg.set("Plugin.NoPermission", DefaultValue.FR_NoPermission.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6NoPermission §4was added to §9fr_FR_Messages.yml§4!");
        }

        if (!yamlConfiguration_FRmsg.contains("Plugin.VaultNotSetUp")) {
            yamlConfiguration_FRmsg.set("Plugin.VaultNotSetUp", DefaultValue.FR_VaultNotSetUp.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6VaultNotSetUp §4was added to §9fr_FR_Messages.yml§4!");
        }

        if (!yamlConfiguration_FRmsg.contains("Plugin.SoundNotFound")) {
            yamlConfiguration_FRmsg.set("Plugin.SoundNotFound", DefaultValue.FR_SoundNotFound.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6SoundNotFound §4was added to §9fr_FR_Messages.yml§4!");
        }

        if (!yamlConfiguration_FRmsg.contains("Plugin.Reload.Start")) {
            yamlConfiguration_FRmsg.set("Plugin.Reload.Start", DefaultValue.FR_ReloadStart.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Reload Start §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Plugin.Reload.End")) {
            yamlConfiguration_FRmsg.set("Plugin.Reload.End", DefaultValue.FR_ReloadEnd.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Reload End §4was added to §9fr_FR_Messages.yml§4!");
        }

        if (!yamlConfiguration_FRmsg.contains("Help.Help")) {
            yamlConfiguration_FRmsg.set("Help.Help", DefaultValue.FR_HelpHelp.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Help §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Help.Shop")) {
            yamlConfiguration_FRmsg.set("Help.Shop", DefaultValue.FR_HelpShop.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Shop §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Help.Info")) {
            yamlConfiguration_FRmsg.set("Help.Info", DefaultValue.FR_HelpInfo.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Info §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Help.Gift")) {
            yamlConfiguration_FRmsg.set("Help.Gift",  DefaultValue.FR_HelpGift.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Gift §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Help.Give")) {
            yamlConfiguration_FRmsg.set("Help.Give", DefaultValue.FR_HelpGive.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Give §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Help.Giveall")) {
            yamlConfiguration_FRmsg.set("Help.Giveall", DefaultValue.FR_HelpGiveAll.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Giveall §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Help.GiveConsole")) {
            yamlConfiguration_FRmsg.set("Help.GiveConsole", DefaultValue.FR_HelpGiveConsole.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help GiveConsole §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Help.GiveallConsole")) {
            yamlConfiguration_FRmsg.set("Help.GiveallConsole", DefaultValue.FR_HelpGiveAllConsole.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help GiveallConsole §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Help.Settings")) {
            yamlConfiguration_FRmsg.set("Help.Settings", DefaultValue.FR_HelpSettings.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Settings §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Help.Reload")) {
            yamlConfiguration_FRmsg.set("Help.Reload", DefaultValue.FR_HelpReload.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Help Reload §4was added to §9fr_FR_Messages.yml§4!");
        }

        if (!yamlConfiguration_FRmsg.contains("Shop.No_money")) {
            yamlConfiguration_FRmsg.set("Shop.No_money", DefaultValue.FR_No_money.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6No_money §4was added to §9fr_FR_Messages.yml§4!");
        }

        if (!yamlConfiguration_FRmsg.contains("Shop.NoInventorySpace")) {
            yamlConfiguration_FRmsg.set("Shop.NoInventorySpace", DefaultValue.FR_NoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6NoInventorySpace §4was added to §9fr_FR_Messages.yml§4!");
        }

        if (!yamlConfiguration_FRmsg.contains("Shop.Buy_msg")) {
            yamlConfiguration_FRmsg.set("Shop.Buy_msg", DefaultValue.FR_Buy_msg.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Buy_msg §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Shop.Bypass")) {
            yamlConfiguration_FRmsg.set("Shop.Bypass", DefaultValue.FR_Bypass.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Bypass §4was added to §9en_EN_Messages.yml§4!");
        }

        // give / gift

        if (!yamlConfiguration_FRmsg.contains("Give.Sender")) {
            yamlConfiguration_FRmsg.set("Give.Sender", DefaultValue.FR_give.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give Sender §4was added to §9fr_FR_Messages.yml§4!");
        }

        if (!yamlConfiguration_FRmsg.contains("Give.Receiver")) {
            yamlConfiguration_FRmsg.set("Give.Receiver", DefaultValue.FR_giveReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give Receiver §4was added to §9fr_FR_Messages.yml§4!");
        }

        if (!yamlConfiguration_FRmsg.contains("Gift.Sender")) {
            yamlConfiguration_FRmsg.set("Gift.Sender", DefaultValue.FR_gift.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Gift Sender §4was added to §9fr_FR_Messages.yml§4!");
        }

        if (!yamlConfiguration_FRmsg.contains("Gift.Receiver")) {
            yamlConfiguration_FRmsg.set("Gift.Receiver", DefaultValue.FR_giftReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Gift Receiver §4was added to §9fr_FR_Messages.yml§4!");
        }

        if (!yamlConfiguration_FRmsg.contains("Give_&_Gift.PlayerNotFond")) {
            yamlConfiguration_FRmsg.set("Give_&_Gift.PlayerNotFond", DefaultValue.FR_PlayerNotFound.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give_&_Gift PlayerNotFond §4was added to §9fr_FR_Messages.yml§4!");
        }

        if (!yamlConfiguration_FRmsg.contains("Give_&_Gift.PlayerNoInventorySpace")) {
            yamlConfiguration_FRmsg.set("Give_&_Gift.PlayerNoInventorySpace", DefaultValue.FR_PlayerNoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Give_&_Gift PlayerNoInventorySpace §4was added to §9fr_FR_Messages.yml§4!");
        }

        if (!yamlConfiguration_FRmsg.contains("Title.Reload")) {
            yamlConfiguration_FRmsg.set("Title.Reload",  DefaultValue.FR_Title_Reload.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Reload §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Title.Buy")) {
            yamlConfiguration_FRmsg.set("Title.Buy", DefaultValue.FR_Title_Buy.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Buy §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Title.No_money")) {
            yamlConfiguration_FRmsg.set("Title.No_money", DefaultValue.FR_Title_No_money.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title No_money §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Title.NoInventorySpace")) {
            yamlConfiguration_FRmsg.set("Title.NoInventorySpace", DefaultValue.FR_Title_NoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title NoInventorySpace §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Title.Give.Sender")) {
            yamlConfiguration_FRmsg.set("Title.Give.Sender", DefaultValue.FR_Title_Give.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give Sender §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Title.Give.Receiver")) {
            yamlConfiguration_FRmsg.set("Title.Give.Receiver", DefaultValue.FR_Title_GiveReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give Receiver §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Title.Gift.Sender")) {
            yamlConfiguration_FRmsg.set("Title.Gift.Sender", DefaultValue.FR_Title_Gift.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Gift Sender §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Title.Gift.Receiver")) {
            yamlConfiguration_FRmsg.set("Title.Gift.Receiver", DefaultValue.FR_Title_GiftReceived.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Gift Receiver §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Title.Give_&_Gift.PlayerNotFond")) {
            yamlConfiguration_FRmsg.set("Title.Give_&_Gift.PlayerNotFond", DefaultValue.FR_Title_PlayerNotFound.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give_&_Gift PlayerNotFond §4was added to §9fr_FR_Messages.yml§4!");
        }
        if (!yamlConfiguration_FRmsg.contains("Title.Give_&_Gift.PlayerNoInventorySpace")) {
            yamlConfiguration_FRmsg.set("Title.Give_&_Gift.PlayerNoInventorySpace", DefaultValue.FR_Title_PlayerNoInventorySpace.replace(DefaultValue.Prefix, "[prefix]").replace("§", "&"));
            if (messagesFRYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Message §6Title Give_&_Gift PlayerNoInventorySpace §4was added to §9fr_FR_Messages.yml§4!");
        }


        try {
            yamlConfiguration_FRmsg.save(messagesFRYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2fr_FR_Messages.yml loaded successfully." + " §7- §e" + (System.currentTimeMillis() - long_.longValue()) + "ms");

    }

    public static void messagesDisable() {
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4fr_FR_Messages.yml successfully deactivated.");
    }

}