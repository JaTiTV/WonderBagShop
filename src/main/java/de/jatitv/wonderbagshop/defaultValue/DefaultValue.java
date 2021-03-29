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

package de.jatitv.wonderbagshop.defaultValue;

import org.bukkit.Sound;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DefaultValue {

    // Config

    public static boolean Debug = false;
    public static int DebugStage = 1;
    public static Boolean UpdateCheckOnJoin = true;
    public static String language = "en_EN";

    public static String Currency = "$";
    public static String GUI_Name = "§2Wonder§6Bag§9Shop";

    public static Boolean ItemNumbers = true;

    public static Boolean UseChest = true;
    public static Boolean UseChest_and_Item = true;
    public static Boolean ChestDrop = false;
    public static Boolean RemoveChestInCreativemode = true;
    public static Boolean RemoveUseItemByUse = true;

    public static Boolean Title_Enable = true;

    // Sound

    public static Boolean Sound_Enable = true;

    public static Boolean Sound_Shop_Buy_Enable = true;
    public static Sound Sound_Shop_Buy;
    public static String Sound_Shop_Buy_input = "ENTITY_PLAYER_LEVELUP";

    public static Boolean Sound_Shop_NoMoney_Enable = true;
    public static Sound Sound_Shop_NoMoney;
    public static String Sound_Shop_NoMoney_input = "BLOCK_NOTE_BLOCK_HARP";

    public static Boolean Sound_Shop_NoInventorySpace_Enable = true;
    public static Sound Sound_Shop_NoInventorySpace;
    public static String Sound_Shop_NoInventorySpace_input = "BLOCK_NOTE_BLOCK_GUITAR";

    public static Boolean Sound_Give_Enable = true;
    public static Sound Sound_Give = Sound.ENTITY_PLAYER_LEVELUP;
    public static String Sound_Give_input = "ENTITY_PLAYER_LEVELUP";

    public static Boolean Sound_PlayerNotFound_Enable = true;
    public static Sound Sound_PlayerNotFound;
    public static String Sound_PlayerNotFound_input = "BLOCK_NOTE_BLOCK_HARP";

    public static Boolean Sound_Gift_Enable = true;
    public static Sound Sound_Gift;
    public static String Sound_Gift_input = "ENTITY_PLAYER_LEVELUP";

    // Messages

    public static String PrefixHC = "§8[§2W§6B§9S§8] ";
    public static String Prefix = "§8[§2W§6B§9S§8]";

    // EN
    public static String NoPermissionForCommand = "§8[§2W§6B§9S§8] §cFor §b[cmd] §cyou lack the permission §6[perm]§c!";
    public static String NoPermission = "§8[§2W§6B§9S§8] §cYou do not have permission for WonderBagShop!";
    public static String VaultNotSetUp = "§8[§2W§6B§9S§8] §4Vault / Economy not set up!";
    public static String SoundNotFound = "§8[§2W§6B§9S§8] §4The sound §6[sound] §4could not be found! Please check your settings.";
    public static String ReloadStart = "§6Plugin reload...";
    public static String ReloadEnd = "§2Plugin successfully reloaded.";
    public static String HelpHelp        = "§8'§b/wonderbagshop help§8' §eOpens this help.";
    public static String HelpShop        = "§8'§b/wonderbagshop§8' §eOpens the shop GUI.";
    public static String HelpInfo        = "§8'§b/wonderbagshop info§8' §eCall the info about §2W§6B§9S§e.";
    public static String HelpGift        = "§8'§b/wonderbagshop gift §7<player>§8' §eOpens the gift GUI and Give away a WonderBag.";
    public static String HelpGive        = "§8'§b/wonderbagshop give §7<player>§8' §eOpens the give GUI and Give a player a WonderBag.";
    public static String HelpGiveAll     = "§8'§b/wonderbagshop giveall§8' §eOpens the give GUI and Give all player a WonderBag.";
    public static String HelpGiveConsole = "§8'§b/wonderbagshop give §7<player> <ChestSmall | ChestMedium | ChestLarge | ItemSmall | ItemMedium | ItemLarge>§8' §eGive a player a WonderBag. §4Only for the console!";
    public static String HelpGiveAllConsole = "§8'§b/wonderbagshop giveall §7<ChestSmall | ChestMedium | ChestLarge | ItemSmall | ItemMedium | ItemLarge>§8' §eGive all player a WonderBag. §4Only for the console!";
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
    public static String Bypass = "§8[§2W§6B§9S§8] §2You have a bypass you were not deducted money!";
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

    // DE
    public static String DE_NoPermissionForCommand = "§8[§2W§6B§9S§8] §cF[ue]r §b[cmd] §cfehlt dir die Permission §6[perm]§c!";
    public static String DE_NoPermission = "§8[§2W§6B§9S§8] §cDu hast keine Permission für §2Wonder§6Bag§9Shop!";
    public static String DE_VaultNotSetUp = "§8[§2W§6B§9S§8] §4Vault / Economy nicht Installiert!";
    public static String DE_SoundNotFound = "§8[§2W§6B§9S§8] §4Der Sound §6[sound] §4konnte nicht gefunden werden! Bitte überprüfe deine Einstellungen.";
    public static String DE_ReloadStart = "§6Plugin reload...";
    public static String DE_ReloadEnd = "§2Plugin erfolgreich neu geladen.";

    public static String DE_HelpHelp        = "§8'§b/wonderbagshop help§8' §e[OE]ffnet diese help.";
    public static String DE_HelpShop        = "§8'§b/wonderbagshop§8' §e[OE]ffnet den Shop.";
    public static String DE_HelpInfo        = "§8'§b/wonderbagshop info§8' §eRufe die Infos von §2W§6B§9S §eauf.";
    public static String DE_HelpGift        = "§8'§b/wonderbagshop gift §7<player>§8' §e[OE]ffne die gift GUI und verschenke eine WonderBag.";
    public static String DE_HelpGive        = "§8'§b/wonderbagshop give §7<player>§8' §e[OE]ffne die give GUI und gebe einem Spieler eine WonderBag.";
    public static String DE_HelpGiveAll     = "§8'§b/wonderbagshop giveall§8' §e[OE]ffne die give GUI und gebe allen Spielern eine WonderBag.";
    public static String DE_HelpGiveConsole = "§8'§b/wonderbagshop give §7<player> <ChestSmall | ChestMedium | ChestLarge | ItemSmall | ItemMedium | ItemLarge>§8' §eGebe einem Spieler eine WonderBag. §4NUR FÜR DIE KONSOLE!";
    public static String DE_HelpGiveAllConsole = "§8'§b/wonderbagshop giveall §7<ChestSmall | ChestMedium | ChestLarge | ItemSmall | ItemMedium | ItemLarge>§8' §eGebe allen Spielern eine WonderBag. §4NUR FÜR DIE KONSOLE!";
    public static String DE_HelpSettings    = "§8'§b/wonderbagshop settings§8' §eBearbeite die Einstellungen.";
    public static String DE_HelpReload      = "§8'§b/wonderbagshop reload§8' §eLade das Plugin neu.";

    public static String DE_No_money = "§8[§2W§6B§9S§8] §cDu hast nicht gen[ue]gend Geld!";
    public static String DE_NoInventorySpace = "§8[§2W§6B§9S§8] §cDu hast keinen Platz in deinem Inventar!";
    public static String DE_Buy_msg = "§8[§2W§6B§9S§8] §2Du hast dir [wonderbag] §2f[ue]r §6[price] [currency] §2gekauft!";
    public static String DE_Bypass = "§8[§2W§6B§9S§8] §2Du hast einen bypass, dir wurde kein geld abgezogen!";

    public static String DE_give = "§8[§2W§6B§9S§8] §2Du hast §6[player] §2eine [wonderbag] §2gegeben!";
    public static String DE_giveReceived = "§8[§2W§6B§9S§8] §2Du hast von §6[sender] §2eine [wonderbag]§2 bekommen.";

    public static String DE_gift = "§8[§2W§6B§9S§8] §2Du hast §6[player] §2eine [wonderbag] §2f[ue]r [price] §2geschenkt!";
    public static String DE_giftReceived = "§8[§2W§6B§9S§8] §2Du hast von §6[sender] §2eine [wonderbag] §2geschenkt bekommen.";

    public static String DE_PlayerNotFound = "§8[§2W§6B§9S§8] §cDer Spieler §6[player] §cwurde nicht gefunden oder ist nicht Online!";
    public static String DE_PlayerNoInventorySpace = "§8[§2W§6B§9S§8] §6[player] §chat keinen freien Platz in seinem Inventar!";

    public static String DE_Title_Reload = "§2Plugin erfolgreich neu geladen.";
    public static String DE_Title_Buy = "§2Du hast dir [wonderbag] §2f[ue]r §6[price] [currency] §2gekauft!";
    public static String DE_Title_No_money = "§cDu hast nicht gen[ue]gend Geld!";
    public static String DE_Title_NoInventorySpace = "§cDu hast keinen Platz in deinem Inventar!";
    public static String DE_Title_Give = "§2Du hast §6[player] §2eine [wonderbag] §2gegeben!";
    public static String DE_Title_GiveReceived = "§2Du hast von §6[sender] §2eine [wonderbag]§2 bekommen.";
    public static String DE_Title_Gift = "§2Du hast §6[player] §2eine [wonderbag] §2f[ue]r [price] §2geschenkt!";
    public static String DE_Title_GiftReceived = "§2Du hast von §6[sender] §2eine [wonderbag] §2geschenkt bekommen.";
    public static String DE_Title_PlayerNotFound = "§cDer Spieler §6[player] §cwurde nicht gefunden oder ist nicht Online!";
    public static String DE_Title_PlayerNoInventorySpace = "§6[player] §chat keinen freien Platz in seinem Inventar!";

    // FR
    public static String FR_NoPermissionForCommand = "§8[§2W§6B§9S§8] §cPour faire §b[cmd] §cil vous manque la permission §6[perm]§c!";
    public static String FR_NoPermission = "§8[§2W§6B§9S§8] §cVous n'avez pas la permission pour §2Wonder§6Bag§9Shop!";
    public static String FR_VaultNotSetUp = "§8[§2W§6B§9S§8] §4Vault / Economie non mis en place!";
    public static String FR_SoundNotFound = "§8[§2W§6B§9S§8] §4Le son §6[sound] §4n'a pas pu être trouvé ! Vérifiez vos paramètres.";
    public static String FR_ReloadStart = "§6Le plugin recharge...";
    public static String FR_ReloadEnd = "§2Le plugin est rechargé.";

    public static String FR_HelpHelp        = "§8'§b/wonderbagshop help§8' §eOuvre cette aide.";
    public static String FR_HelpShop        = "§8'§b/wonderbagshop§8' §eOuvre le magasin.";
    public static String FR_HelpInfo        = "§8'§b/wonderbagshop info§8' §eDonne les infos sur §2W§6B§9S§e.";
    public static String FR_HelpGift        = "§8'§b/wonderbagshop gift §7<player>§8' §eOuvre l'interface de cadeau et offre un WonderBag au joueur.";
    public static String FR_HelpGive        = "§8'§b/wonderbagshop give §7<player>§8' §eOuvre l'interface de don et donne un WonderBag au joueur.";
    public static String FR_HelpGiveAll     = "§8'§b/wonderbagshop giveall§8' §eOuvre l'interface de don et offre à tous les joueurs un WonderBag.";
    public static String FR_HelpGiveConsole = "§8'§b/wonderbagshop give §7<player> <ChestSmall | ChestMedium | ChestLarge | ItemSmall | ItemMedium | ItemLarge>§8' §eDonner un WonderBag au joueur. §4Seulement depuis la console!";
    public static String FR_HelpGiveAllConsole = "§8'§b/wonderbagshop giveall §7<ChestSmall | ChestMedium | ChestLarge | ItemSmall | ItemMedium | ItemLarge>§8' §eDonner un WonderBag à tous les joueurs. §4Seulement depuis la console!";
    public static String FR_HelpSettings    = "§8'§b/wonderbagshop settings§8' §eChanger les paramètres.";
    public static String FR_HelpReload      = "§8'§b/wonderbagshop reload§8' §eRecharger le plugin.";

    public static String FR_No_money = "§8[§2W§6B§9S§8] §cVous n'avez pas assez d'argent!";
    public static String FR_NoInventorySpace = "§8[§2W§6B§9S§8] §cPas d'espace libre dans l'inventaire!";
    public static String FR_Buy_msg = "§8[§2W§6B§9S§8] §2Vous avez acheté [wonderbag] §2pour §6[price] [currency]§2!";
    public static String FR_Bypass = "§8[§2W§6B§9S§8] §2Vous avez un pontage, vous n'avez pas été déduit de l'argent!";

    public static String FR_give = "§8[§2W§6B§9S§8] §2Vous avez donné à §6[player] §2un [wonderbag]§2!";
    public static String FR_giveReceived = "§8[§2W§6B§9S§8] §2Vous avez reçu un [wonderbag] §2de §6[sender]§2!";

    public static String FR_gift = "§8[§2W§6B§9S§8] §2Vous avez offert à §6[player] §2un [wonderbag] §2pour §6[price] [currency]§2!";
    public static String FR_giftReceived = "§8[§2W§6B§9S§8] §2Vous avez reçu un [wonderbag] §2comme cadeau de la part de §6[sender]§2!";

    public static String FR_PlayerNotFound = "§8[§2W§6B§9S§8] §cLe joueur §6[player] §cn'a pas pu être trouvé ou n'est pas connecté!";
    public static String FR_PlayerNoInventorySpace = "§8[§2W§6B§9S§8] §6[player] §cn'a pas d'espace libre dans son inventaire!";

    public static String FR_Title_Reload = "§2Plugin rechargé.";
    public static String FR_Title_Buy = "§2Vous avez acheté un [wonderbag] §2pour §6[price] [currency]§2!";
    public static String FR_Title_No_money = "§cVous n'avez pas assez d'argent!";
    public static String FR_Title_NoInventorySpace = "§cVous n'avez pas de place dans votre inventaire!";
    public static String FR_Title_Give = "§bVous avez donné à §6[player] §2un [wonderbag]§b!";
    public static String FR_Title_GiveReceived = "§bYou have received a [wonderbag] §bfrom §6[sender]§b!";
    public static String FR_Title_Gift = "§bVous avez donné à §6[player] §bun [wonderbag] §bpour §6[price] [currency]§b!";
    public static String FR_Title_GiftReceived = "§bVous avez reçu un [wonderbag] §bcomme cadeau de §6[sender]§b!";
    public static String FR_Title_PlayerNotFound = "§cLe joueur §6[player] §cn'a pas pu être trouvé ou n'est pas connecté!";
    public static String FR_Title_PlayerNoInventorySpace = "§6[player] §cn'a pas d'espace libre dans son inventaire!";

    // NO
    public static String NO_NoPermissionForCommand = "§8[§2W§6B§9S§8] §cDu har ikke tillatelse §6[perm]§c for §b[cmd]§c!";
    public static String NO_NoPermission = "§8[§2W§6B§9S§8] §cDu har ikke tillatelse for §2Wonder§6Bag§9Shop!";
    public static String NO_VaultNotSetUp = "§8[§2W§6B§9S§8] §4Vault / Økonomi ikke satt opp!";
    public static String NO_SoundNotFound = "§8[§2W§6B§9S§8] §4Kan ikke finne lydeffekten §6[sound]§4! Sjekk instillingene dine!";
    public static String NO_ReloadStart = "§6Restarter plugin...";
    public static String NO_ReloadEnd = "§2Plugin restartet.";

    public static String NO_HelpHelp        = "§8'§b/wonderbagshop help§8' §eÅpner hjelp.";
    public static String NO_HelpShop        = "§8'§b/wonderbagshop§8' §eÅpner butikk.";
    public static String NO_HelpInfo        = "§8'§b/wonderbagshop info§8' §eViser informasjon om §2W§6B§9S§e.";
    public static String NO_HelpGift        = "§8'§b/wonderbagshop gift §7<player>§8' §eÅpner gave GUI og gir en WonderBag til en spiller.";
    public static String NO_HelpGive        = "§8'§b/wonderbagshop give §7<player>§8' §eÅpner gi GUI og gir en WonderBag til en spiller.";
    public static String NO_HelpGiveAll     = "§8'§b/wonderbagshop giveall§8' §eÅpner gi GUI og gir alle spillere en WonderBag.";
    public static String NO_HelpGiveConsole = "§8'§b/wonderbagshop give §7<player> <ChestSmall | ChestMedium | ChestLarge | ItemSmall | ItemMedium | ItemLarge>§8' §eGir en spiller en Wonderbag. §4Kun for konsollen!";
    public static String NO_HelpGiveAllConsole = "§8'§b/wonderbagshop giveall §7<ChestSmall | ChestMedium | ChestLarge | ItemSmall | ItemMedium | ItemLarge>§8' §eGir alle spillere en WonderBag. §4Kun for konsollen!";
    public static String NO_HelpSettings    = "§8'§b/wonderbagshop settings§8' §eEndre instillingene.";
    public static String NO_HelpReload      = "§8'§b/wonderbagshop reload§8' §eRestarter pluginen.";

    public static String NO_No_money = "§8[§2W§6B§9S§8] §cDu har ikke nok penger!";
    public static String NO_NoInventorySpace = "§8[§2W§6B§9S§8] §cIkke nok ledig plass!";
    public static String NO_Buy_msg = "§8[§2W§6B§9S§8] §2Du kjøpte [wonderbag] §2for §6[price] [currency]§2!";
    public static String NO_Bypass = "§8[§2W§6B§9S§8] §2Du har en bypass, ingen penger ble tatt ut!";

    public static String NO_give = "§8[§2W§6B§9S§8] §2Du gav §6[player] §2en [wonderbag]§2!";
    public static String NO_giveReceived = "§8[§2W§6B§9S§8] §2Du har mottatt [wonderbag] §2fra §6[sender]§2!";

    public static String NO_gift = "§8[§2W§6B§9S§8] §2Du gav §6[player] §2en [wonderbag] §2for §6[price] [currency]§2!";
    public static String NO_giftReceived = "§8[§2W§6B§9S§8] §2Du har mottatt en [wonderbag] §2som en gave fra §6[sender]§2!";

    public static String NO_PlayerNotFound = "§8[§2W§6B§9S§8] §cSpilleren §6[player] §ckunne ikke bli funnet!";
    public static String NO_PlayerNoInventorySpace = "§8[§2W§6B§9S§8] §6[player] §char ikke nok ledig plass!";

    public static String NO_Title_Reload = "§2Plugin startet!";
    public static String NO_Title_Buy = "§2Du kjøpte [wonderbag] §2for §6[price] [currency]§2!";
    public static String NO_Title_No_money = "§cDu har ikke nok penger!";
    public static String NO_Title_NoInventorySpace = "§cIkke nok ledig plass!";
    public static String NO_Title_Give = "§bDu gav §6[player] §2b [wonderbag]§b!";
    public static String NO_Title_GiveReceived = "§bDu har mottatt en [wonderbag] §bfra §6[sender]§b!";
    public static String NO_Title_Gift = "§bDu gav §6[player] §ben [wonderbag] §bfor §6[price] [currency]§b!";
    public static String NO_Title_GiftReceived = "§bDu har mottatt en [wonderbag] §bsom en gave fra §6[sender]§b!";
    public static String NO_Title_PlayerNotFound = "§cSpilleren §6[player] §cble ikke funnet!";
    public static String NO_Title_PlayerNoInventorySpace = "§6[player] §char ikke nok ledig plass!";

}