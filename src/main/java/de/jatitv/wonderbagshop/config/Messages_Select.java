// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.config;

import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_1;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_2;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_3;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class Messages_Select {

    public static void selectCreate() {

        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Select language...");

        String selectMSG;
        String sel;

        switch (DefaultValue.language) {
            case "de_DE":
                selectMSG = "German";
                sel = "de_DE";
                break;
            case "fr_FR":
                selectMSG = "French";
                sel = "fr_FR";
                break;
            case "no_NO":
                selectMSG = "Norwegian";
                sel = "no_NO";
                break;
            default:
                selectMSG = "English";
                sel = "en_EN";
                break;
        }

        File messagesYML = new File(Main.thisp().getDataFolder().getPath(), "languages/" + sel + "_Messages.yml");
        YamlConfiguration yamlConfiguration_msg = YamlConfiguration.loadConfiguration(messagesYML);

        DefaultValue.NoPermissionForCommand = replace(yamlConfiguration_msg.getString("Plugin.NoPermissionForCommand"));
        DefaultValue.NoPermission = replace(yamlConfiguration_msg.getString("Plugin.NoPermission"));
        DefaultValue.VaultNotSetUp = replace(yamlConfiguration_msg.getString("Plugin.VaultNotSetUp"));
        DefaultValue.SoundNotFound = replace(yamlConfiguration_msg.getString("Plugin.SoundNotFound"));
        DefaultValue.ReloadStart = replace(yamlConfiguration_msg.getString("Plugin.Reload.Start"));
        DefaultValue.ReloadEnd = replace(yamlConfiguration_msg.getString("Plugin.Reload.End"));
        DefaultValue.HelpHelp = replace(yamlConfiguration_msg.getString("Help.Help"));
        DefaultValue.HelpShop = replace(yamlConfiguration_msg.getString("Help.Shop"));
        DefaultValue.HelpInfo = replace(yamlConfiguration_msg.getString("Help.Info"));
        DefaultValue.HelpGift = replace(yamlConfiguration_msg.getString("Help.Gift"));
        DefaultValue.HelpGive = replace(yamlConfiguration_msg.getString("Help.Give"));
        DefaultValue.HelpGiveAll = replace(yamlConfiguration_msg.getString("Help.Giveall"));
        DefaultValue.HelpGiveConsole = replace(yamlConfiguration_msg.getString("Help.GiveConsole"));
        DefaultValue.HelpGiveAllConsole = replace(yamlConfiguration_msg.getString("Help.GiveallConsole"));
        DefaultValue.HelpSettings = replace(yamlConfiguration_msg.getString("Help.Settings"));
        DefaultValue.HelpReload = replace(yamlConfiguration_msg.getString("Help.Reload"));
        DefaultValue.No_money = replace(yamlConfiguration_msg.getString("Shop.No_money"));
        DefaultValue.NoInventorySpace = replace(yamlConfiguration_msg.getString("Shop.NoInventorySpace"));
        DefaultValue.Buy_msg = replace(yamlConfiguration_msg.getString("Shop.Buy_msg"));
        DefaultValue.Bypass = replace(yamlConfiguration_msg.getString("Shop.Bypass"));
        DefaultValue.give = replace(yamlConfiguration_msg.getString("Give.Sender"));
        DefaultValue.giveReceived = replace(yamlConfiguration_msg.getString("Give.Receiver"));
        DefaultValue.gift = replace(yamlConfiguration_msg.getString("Gift.Sender"));
        DefaultValue.giftReceived = replace(yamlConfiguration_msg.getString("Gift.Receiver"));
        DefaultValue.PlayerNotFound = replace(yamlConfiguration_msg.getString("Give_&_Gift.PlayerNotFond"));
        DefaultValue.PlayerNoInventorySpace = replace(yamlConfiguration_msg.getString("Give_&_Gift.PlayerNoInventorySpace"));
        DefaultValue.Title_Reload = replace(yamlConfiguration_msg.getString("Title.Reload"));
        DefaultValue.Title_Buy = replace(yamlConfiguration_msg.getString("Title.Buy"));
        DefaultValue.Title_No_money = replace(yamlConfiguration_msg.getString("Title.No_money"));
        DefaultValue.Title_NoInventorySpace = replace(yamlConfiguration_msg.getString("Title.NoInventorySpace"));
        DefaultValue.Title_Give = replace(yamlConfiguration_msg.getString("Title.Give.Sender"));
        DefaultValue.Title_GiveReceived = replace(yamlConfiguration_msg.getString("Title.Give.Receiver"));
        DefaultValue.Title_Gift = replace(yamlConfiguration_msg.getString("Title.Gift.Sender"));
        DefaultValue.Title_GiftReceived = replace(yamlConfiguration_msg.getString("Title.Gift.Receiver"));
        DefaultValue.Title_PlayerNotFound = replace(yamlConfiguration_msg.getString("Title.Give_&_Gift.PlayerNotFond"));
        DefaultValue.Title_PlayerNoInventorySpace = replace(yamlConfiguration_msg.getString("Title.Give_&_Gift.PlayerNoInventorySpace"));

        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2Language successfully selected to: §6" + selectMSG);
    }


    private static String replace(String Text) {

        return Text.replace("[prefix]", DefaultValue.Prefix).replace("&", "§").replace("[currency]", DefaultValue.Currency)
                .replace("[ue]", "ü").replace("[UE]", "Ü").replace("[oe]", "Ö").replace("[OE]", "Ö")
                .replace("[ae]", "ä").replace("[AE]", "Ä").replace("[WB1Name]", DefaultValueChest_1.Name)
                .replace("[WB2Name]", DefaultValueChest_2.Name).replace("[WB3Name]", DefaultValueChest_3.Name);
    }

}
