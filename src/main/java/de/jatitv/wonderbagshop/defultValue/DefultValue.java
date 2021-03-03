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

package de.jatitv.wonderbagshop.defultValue;

import org.bukkit.Sound;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DefultValue {

    // Config

    public static boolean Debug = false;
    public static int DebugStage = 1;
    public static Boolean UpdateCheckOnJoin = true;

    public static String Currency = "$";
    public static String GUI_Name = "§2Wonder§6Bag§9Shop";

    public static Boolean ItemNumbers = true;

    public static Boolean UseChest = true;
    public static Boolean UseChest_and_Item = true;
    public static Boolean ChestDrop = false;

    public static Boolean Title_Enable = true;

    // Sound

    public static Boolean Sound_Enable = true;

    public static Boolean Sound_Shop_Buy_Enable = true;
    public static Sound Sound_Shop_Buy = Sound.ENTITY_PLAYER_LEVELUP;
    public static String Sound_Shop_Buy_input = "ENTITY_PLAYER_LEVELUP";

    public static Boolean Sound_Shop_NoMoney_Enable = true;
    public static Sound Sound_Shop_NoMoney = Sound.BLOCK_NOTE_BLOCK_HARP;
    public static String Sound_Shop_NoMoney_input = "BLOCK_NOTE_BLOCK_HARP";

    public static Boolean Sound_Shop_NoInventorySpace_Enable = true;
    public static Sound Sound_Shop_NoInventorySpace = Sound.BLOCK_NOTE_BLOCK_GUITAR;
    public static String Sound_Shop_NoInventorySpace_input = "BLOCK_NOTE_BLOCK_GUITAR";

    public static Boolean Sound_Give_Enable = true;
    public static Sound Sound_Give = Sound.ENTITY_PLAYER_LEVELUP;
    public static String Sound_Give_input = "ENTITY_PLAYER_LEVELUP";

    public static Boolean Sound_PlayerNotFound_Enable = true;
    public static Sound Sound_PlayerNotFound = Sound.BLOCK_NOTE_BLOCK_HARP;
    public static String Sound_PlayerNotFound_input = "BLOCK_NOTE_BLOCK_HARP";

    public static Boolean Sound_Gift_Enable = true;
    public static Sound Sound_Gift = Sound.ENTITY_PLAYER_LEVELUP;
    public static String Sound_Gift_input = "ENTITY_PLAYER_LEVELUP";

    // Messages

    public static String PrefixHC = "§8[§2W§6B§9S§8] ";
    public static String Prefix = "§8[§2W§6B§9S§8]";

    public static String NoPermissionForCommand = "§8[§2W§6B§9S§8] §cFor §b[cmd] §cyou lack the permission §6[perm]§c!";
    public static String NoPermission = "§8[§2W§6B§9S§8] §cYou do not have permission for WonderBagShop!";

    public static String VaultNotSetUp = "§8[§2W§6B§9S§8] §4Vault / Economy not set up!";
    public static String SoundNotFound = "§8[§2W§6B§9S§8] §4The sound §6[sound] §4could not be found! Please check your settings.";

    public static String ReloadStart = "§6Plugin reload...";
    public static String ReloadEnd = "§2Plugin successfully reloaded.";

    public static void Help(CommandSender sender) {
        if (sender.hasPermission("wonderbagshop.command")
                || sender.hasPermission("wonderbagshop.command.info")
                || sender.hasPermission("wonderbagshop.command.give")
                || sender.hasPermission("wonderbagshop.command.gift")
                || sender.hasPermission("wonderbagshop.command.admin")
                || sender.isOp()) {
            sender.sendMessage(PrefixHC + " §8----- §2Wonder§6Bag§9Shop §chelp §8-----");
            sender.sendMessage(PrefixHC);
            if (sender.hasPermission("wonderbagshop.command") || sender.hasPermission("wonderbagshop.command.admin") || sender.isOp()) {
                sender.sendMessage(PrefixHC + " " + HelpHelp);
                sender.sendMessage(PrefixHC + " " + HelpShop);
            }
            if (sender.hasPermission("wonderbagshop.command.info") || sender.hasPermission("wonderbagshop.command.admin") || sender.isOp()) {
                sender.sendMessage(PrefixHC + " " + HelpInfo);
            }
            if (sender.hasPermission("wonderbagshop.command.gift") || sender.hasPermission("wonderbagshop.command.admin") || sender.isOp()) {
                sender.sendMessage(PrefixHC + " " + HelpGift);
            }
            if (sender instanceof Player) {
                if (sender.hasPermission("wonderbagshop.command.give") || sender.hasPermission("wonderbagshop.command.admin") || sender.isOp()) {
                    sender.sendMessage(PrefixHC + " " + HelpGive);
                }
                if (sender.hasPermission("wonderbagshop.command.giveall") || sender.hasPermission("wonderbagshop.command.admin") || sender.isOp()) {
                    sender.sendMessage(PrefixHC + " " + HelpGiveAll);
                }
            } else {
                if (sender.hasPermission("wonderbagshop.command.give") || sender.hasPermission("wonderbagshop.command.admin") || sender.isOp()) {
                    sender.sendMessage(PrefixHC + " " + HelpGive);
                    sender.sendMessage(PrefixHC + " " + HelpGiveConsole);
                }
                if (sender.hasPermission("wonderbagshop.command.giveall") || sender.hasPermission("wonderbagshop.command.admin") || sender.isOp()) {
                    sender.sendMessage(PrefixHC + " " + HelpGiveAll);
                    sender.sendMessage(PrefixHC + " " + HelpGiveAllConsole);
                }
            }
            if (sender.hasPermission("wonderbagshop.command.admin") || sender.isOp()) {
                sender.sendMessage(PrefixHC + " " + HelpSettings);
            }
            if (sender.hasPermission("wonderbagshop.command.admin") || sender.isOp()) {
                sender.sendMessage(PrefixHC + " " + HelpReload);
            }
            sender.sendMessage(PrefixHC);
            sender.sendMessage(PrefixHC + " §8----------------------------");
        } else {
            sender.sendMessage(DefultValue.NoPermission);
        }
    }

    public static String HelpHelp        = "§8'§b/wonderbagshop help§8' §eOpens this help.";
    public static String HelpShop        = "§8'§b/wonderbagshop§8' §eOpens the shop GUI.";
    public static String HelpInfo        = "§8'§b/wonderbagshop info§8' §eCall the info about §2W§6B§9S§e.";
    public static String HelpGift        = "§8'§b/wonderbagshop gift §7<player>§8' §eOpens the gift GUI and Give away a WonderBag.";

    public static String HelpGive        = "§8'§b/wonderbagshop give §7<player>§8' §eOpens the give GUI and Give a player a WonderBag.";
    public static String HelpGiveAll     = "§8'§b/wonderbagshop giveall§8' §eOpens the give GUI and Give all player a WonderBag.";
    public static String HelpGiveConsole = "§8'§b/wonderbagshop give §7<player> <ChestSmall | ChestMedium | ChestLarge | ItemSmall | ItemMedium | ItemLarge>§8'" +
            " §eGive a player a WonderBag. §4Only for the console!";
    public static String HelpGiveAllConsole = "§8'§b/wonderbagshop giveall §7<ChestSmall | ChestMedium | ChestLarge | ItemSmall | ItemMedium | ItemLarge>§8'\" +\n" +
            "            \" §eGive all player a WonderBag. §4Only for the console!";
    public static String HelpSettings    = "§8'§b/wonderbagshop settings§8' §eEdit the Settings.";
    public static String HelpReload      = "§8'§b/wonderbagshop reload§8' §eReloads the Plugin.";

    public static String No_money = "§8[§2W§6B§9S§8] §cYou do not have enough money!";
    public static String NoInventorySpace = "§8[§2W§6B§9S§8] §cNo free inventory space!";

    public static String give = "§8[§2W§6B§9S§8] §2You gave §6[player] §2a [wonderbag]§2!";
    public static String giveReceived = "§8[§2W§6B§9S§8] §2You have received a [wonderbag] §2from §6[sender]§2!";

    public static String gift = "§8[§2W§6B§9S§8] §2You gift §6[player] §2a [wonderbag] §2for §6[price] [currency]§2!";
    public static String giftReceived = "§8[§2W§6B§9S§8] §2You have received a [wonderbag] §2as a gift from §6[sender]§2!";

    public static String PlayerNotFound = "§8[§2W§6B§9S§8] §cThe player §6[player] §cwas not found or is not online!";
    public static String PlayerNoInventorySpace = "§8[§2W§6B§9S§8] §6[player] §chas no free inventory space available!";

    public static String Buy_msg = "§8[§2W§6B§9S§8] §2You bought [wonderbag] §2for §6[price] [currency]§2!";


    public static Boolean Title_Buy_Enable = true;
    public static String Title_Buy = "§2You bought [wonderbag] §2for §6[price] [currency]§2!";

    public static Boolean Title_Reload_Enable = true;
    public static String Title_Reload = "§bPlugin successfully reloaded.";
    public static Boolean Title_No_money_Enable = true;
    public static String Title_No_money = "§cYou do not have enough money!";
    public static Boolean Title_NoInventorySpace_Enable = true;
    public static String Title_NoInventorySpace = "§cNo free inventory space!";

    public static Boolean Title_Give_Enable = true;
    public static String Title_Give = "§bYou gave §6[player] §ba [wonderbag]§b!";
    public static Boolean Title_GiveReceived_Enable = true;
    public static String Title_GiveReceived = "§bYou have received a [wonderbag] §bfrom §6[sender]§b!";

    public static Boolean Title_Gift_Enable = true;
    public static String Title_Gift = "§bYou gift §6[player] §ba [wonderbag] §bfor §6[price] [currency]§b!";
    public static Boolean Title_GiftReceived_Enable = true;
    public static String Title_GiftReceived = "§bYou have received a [wonderbag] §bas a gift from §6[sender]§b!";

    public static Boolean Title_PlayerNotFound_Enable = true;
    public static String Title_PlayerNotFound = "§cThe player §6[player] §cwas not found or is not online!";

    public static Boolean Title_PlayerNoInventorySpace_Enable = true;
    public static String Title_PlayerNoInventorySpace = "§6[player] §chas no free inventory space available!";


    public static String SettingsGUIchatSet = "§eEnter the new value for §6[setting] §ein the chat.";
    public static String SettingsGUIchatSetTo = "§6[setting] §esuccessfully set to: §6";
    public static String SettingsGUIchatCancel = "§eEnter §8'§6cancel§8' §eto abort.";
    public static String SettingsGUIchatIsCanceled = "§eThe §6[setting] §esetting was canceled.";

}