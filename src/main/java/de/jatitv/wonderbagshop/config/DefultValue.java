// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.config;

public class DefultValue {

    // Config

    public static String Lang = "EN";
    public static String Currency = "$";

    public static String WB1Items = "GOLD_BLOCK\nDIAMOND\nDIAMOND_SWORD";
    public static String WB2Items = "";
    public static String WB3Items = "";
    public static String[] WB1ItemsLIST = new String[] { "GOLD_BLOCK", "DIAMOND", "DIAMOND_SWORD" };
    public static String[] WB2ItemsLIST = new String[] { "GOLD_BLOCK", "DIAMOND", "DIAMOND_SWORD" };
    public static String[] WB3ItemsLIST = new String[] { "GOLD_BLOCK", "DIAMOND", "DIAMOND_SWORD" };

    public static Integer WB1Item_anz = 5;
    public static Integer WB2Item_anz = 8;
    public static Integer WB3Item_anz = 10;

    public static Integer WB1Item_max_Stack = 10;
    public static Integer WB2Item_max_Stack = 10;
    public static Integer WB3Item_max_Stack = 10;

    // Messages

    public static String PrefixHC = "§8[§2W§6B§9S§8] ";
    public static String Prefix = "§8[§2W§6B§9S§8]";

    public static String NoPermission = "§8[§2W§6B§9S§8] §cFür §b[cmd] §cfehlt dir die Permission §6[perm]§c!";

    public static String ReloadStart = "§6Plugin reload...";
    public static String ReloadEnd = "§2Plugin successfully reloaded.";

    public static String VaultNotSetUp = "§8[§2W§6B§9S§8] §4Vault / Economy not set up!";

    public static String Help = "§8[§2W§6B§9S§8] §8----- §2Wonder§6Bag§9Shop §chelp §8-----\n§8[§2W§6B§9S§8]\n§8[§2W§6B§9S§8] '§b/wonderbagshop§e' Öffnet diese help." +
            "\n§8[§2W§6B§9S§8] '§b/wonderbagshop shop§e' Öffnet den Shop.\n§8[§2W§6B§9S§8] '§b/wonderbagshop reload§e' Läd die Cofig neu.\n§8[§2W§6B§9S§8]\n" +
            "§8[§2W§6B§9S§8] §8----------------------------";

    public static String No_money = "§8[§2W§6B§9S§8] §cDu hast nicht genügend Geld!";

    public static String WB1buy_msg = "§8[§2W§6B§9S§8] §bDu hast dir §2Wonder§6Bag §91 §bfür §61000 $ §bgekauft!";
    public static String WB2buy_msg = "§8[§2W§6B§9S§8] §bDu hast dir §2Wonder§6Bag §92 §bfür §62000 $ §bgekauft!";
    public static String WB3buy_msg = "§8[§2W§6B§9S§8] §bDu hast dir §2Wonder§6Bag §93 §bfür §63000 $ §bgekauft!";

    public static String WB1price_ST = String.valueOf(DefultValue.WB1price);
    public static String WB2price_ST = String.valueOf(DefultValue.WB2price);
    public static String WB3price_ST = String.valueOf(DefultValue.WB3price);

    // Shop

    public static String ShopName_GUI = "§2Wonder§6Bag§9Shop";

    public static String WB1Name = "§2Wonder§6Bag §91";
    public static String WB1ChestName = "§2Wonder§6Bag §91";
    public static Integer WB1price = 1000;

    public static String WB2Name = "§2Wonder§6Bag §92";
    public static String WB2ChestName = "§2Wonder§6Bag §92";
    public static Integer WB2price = 2000;

    public static String WB3Name = "§2Wonder§6Bag §93";
    public static String WB3ChestName = "§2Wonder§6Bag §93";
    public static Integer WB3price = 3000;

}
