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

package de.jatitv.wonderbagshop.DefultValue;

import org.bukkit.Sound;

public class DefultValue {

    // Config

    public static String Currency = "$";
    public static String GUI_Name = "§2Wonder§6Bag§9Shop";

    public static Boolean ItemNumbers = true;

    public static Boolean ChestDrop = false;

    // Sound

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

    public static String NoPermission = "§8[§2W§6B§9S§8] §cFor §b[cmd] §cyou lack the permission §6[perm]§c!";

    public static String ReloadStart = "§6Plugin reload...";
    public static String ReloadEnd = "§2Plugin successfully reloaded.";

    public static String VaultNotSetUp = "§8[§2W§6B§9S§8] §4Vault / Economy not set up!";

    public static String Help =
            "§8[§2W§6B§9S§8] §8----- §2Wonder§6Bag§9Shop §chelp §8-----" +
            "\n§8[§2W§6B§9S§8]" +
            "\n§8[§2W§6B§9S§8] §8'§b/wonderbagshop§8' §eOpens this help." +
            "\n§8[§2W§6B§9S§8] §8'§b/wonderbagshop shop§8' §eOpens the shop." +
            "\n§8[§2W§6B§9S§8] §8'§b/wonderbagshop gift §7<player>§8' §eGive away a WonderBag." +
            "\n§8[§2W§6B§9S§8] §8'§b/wonderbagshop give §7<player> <size>§8' §eGive a player a WonderBag." +
            "\n§8[§2W§6B§9S§8] §8'§b/wonderbagshop reload§8' §eReloads the Plugin." +
            "\n§8[§2W§6B§9S§8]" +
            "\n§8[§2W§6B§9S§8] §8----------------------------";

    public static String No_money = "§8[§2W§6B§9S§8] §cYou do not have enough money!";
    public static String NoInventorySpace = "§8[§2W§6B§9S§8] §cNo free inventory space!";

    public static String give = "§8[§2W§6B§9S§8] §2You gave §6[player] §2a [wonderbag]§2!";
    public static String received = "§8[§2W§6B§9S§8] §2You have received a [wonderbag] §2from §6[sender]§2!";

    public static String gift = "§8[§2W§6B§9S§8] §2You gift §6[player] §2a [wonderbag] §2for §6[price] [currency]§2!";
    public static String giftReceived = "§8[§2W§6B§9S§8] §2You have received a [wonderbag] §2as a gift from §6[sender]§2!";

    public static String PlayerNoInventorySpace = "§8[§2W§6B§9S§8] §6[player] §chas no free inventory space available!";
    public static String PlayerNotFound = "§8[§2W§6B§9S§8] §cThe player §6[player]§c was not found or is not online!";

    public static String Buy_msg = "§8[§2W§6B§9S§8] §2You bought [wonderbag] §2for §6[price] [currency]§2!";
}