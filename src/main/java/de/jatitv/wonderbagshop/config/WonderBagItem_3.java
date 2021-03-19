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
import de.jatitv.wonderbagshop.defultValue.DefultValueItem_3;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class WonderBagItem_3 {

    public static void WB3ItemCreate() throws InterruptedException {


        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag Item large.yml load...");

        File WB3ItemYML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Item/" + "large.yml");
        YamlConfiguration yamlConfiguration_WB3_Item = YamlConfiguration.loadConfiguration(WB3ItemYML);


        if (!yamlConfiguration_WB3_Item.contains("Do_not_remove_or_change.Created")) {
            yamlConfiguration_WB3_Item.set("Do_not_remove_or_change.Created", "This file was created with version " + Main.getPlugin().getDescription().getVersion());
        }
        yamlConfiguration_WB3_Item.set("Do_not_remove_or_change.Version", Main.getPlugin().getDescription().getVersion());

        yamlConfiguration_WB3_Item.set("Do_not_remove_or_change.Autor", Main.Autor);

        yamlConfiguration_WB3_Item.set("Do_not_remove_or_change.Spigot", Main.Spigot);

        yamlConfiguration_WB3_Item.set("Do_not_remove_or_change.Discord", Main.Discord);

        // Shop

        if (yamlConfiguration_WB3_Item.contains("Shop.Name")) {
            DefultValueItem_3.Name = replace(yamlConfiguration_WB3_Item.getString("Shop.Name"));
        } else {
            yamlConfiguration_WB3_Item.set("Shop.Name", "&2Wonder&6Bag&7: &9large");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Shop Name §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Shop.price")) {
            DefultValueItem_3.price = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Shop.price"));
        } else {
            yamlConfiguration_WB3_Item.set("Shop.price", DefultValueItem_3.price);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Shop price §4was added to §9WonderBag Item large.yml§4!");
        }

        // WonderBag

        if (yamlConfiguration_WB3_Item.contains("WonderBag.DisplayName")) {
            DefultValueItem_3.DisplayName = replace(yamlConfiguration_WB3_Item.getString("WonderBag.DisplayName"));
        } else {
            yamlConfiguration_WB3_Item.set("WonderBag.DisplayName", "&2Wonder&6Bag &9large");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6WonderBag DisplayName §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("WonderBag.Item")) {
            DefultValueItem_3.Item = replace(yamlConfiguration_WB3_Item.getString("WonderBag.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("WonderBag.Item", "PAPER");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6WonderBags Item §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("WonderBag.Item_amount_(1-9)")) {
            DefultValueItem_3.Item_anz = Integer.valueOf(yamlConfiguration_WB3_Item.getString("WonderBag.Item_amount_(1-9)"));
        } else {
            yamlConfiguration_WB3_Item.set("WonderBag.Item_amount_(1-9)", DefultValueItem_3.Item_anz);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6WonderBag Item_amount_(1-9) §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.getInt("WonderBag.Item_amount_(1-9)") > 9) {
            yamlConfiguration_WB3_Item.set("WonderBag.Item_amount_(1-9)", 9);
        }

        // Items

        if (yamlConfiguration_WB3_Item.contains("Item1.Item")) {
            DefultValueItem_3.Item1_Item = (yamlConfiguration_WB3_Item.getString("Item1.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item1.Item", DefultValueItem_3.Item1_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item1 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item1.StackSize")) {
            DefultValueItem_3.Item1_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item1.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item1.StackSize", DefultValueItem_3.Item1_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item1 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item2.Item")) {
            DefultValueItem_3.Item2_Item = (yamlConfiguration_WB3_Item.getString("Item2.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item2.Item", DefultValueItem_3.Item2_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item2 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item2.StackSize")) {
            DefultValueItem_3.Item2_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item2.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item2.StackSize", DefultValueItem_3.Item2_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item2 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item3.Item")) {
            DefultValueItem_3.Item3_Item = (yamlConfiguration_WB3_Item.getString("Item3.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item3.Item", DefultValueItem_3.Item3_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item3 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item3.StackSize")) {
            DefultValueItem_3.Item3_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item3.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item3.StackSize", DefultValueItem_3.Item3_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item3 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item4.Item")) {
            DefultValueItem_3.Item4_Item = (yamlConfiguration_WB3_Item.getString("Item4.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item4.Item", DefultValueItem_3.Item4_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item4 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item4.StackSize")) {
            DefultValueItem_3.Item4_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item4.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item4.StackSize", DefultValueItem_3.Item4_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item4 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item5.Item")) {
            DefultValueItem_3.Item5_Item = (yamlConfiguration_WB3_Item.getString("Item5.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item5.Item", DefultValueItem_3.Item5_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item5 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item5.StackSize")) {
            DefultValueItem_3.Item5_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item5.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item5.StackSize", DefultValueItem_3.Item5_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item5 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item6.Item")) {
            DefultValueItem_3.Item6_Item = (yamlConfiguration_WB3_Item.getString("Item6.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item6.Item", DefultValueItem_3.Item6_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item6 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item6.StackSize")) {
            DefultValueItem_3.Item6_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item6.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item6.StackSize", DefultValueItem_3.Item6_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item6 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item7.Item")) {
            DefultValueItem_3.Item7_Item = (yamlConfiguration_WB3_Item.getString("Item7.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item7.Item", DefultValueItem_3.Item7_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item7 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item7.StackSize")) {
            DefultValueItem_3.Item7_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item7.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item7.StackSize", DefultValueItem_3.Item7_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item7 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item8.Item")) {
            DefultValueItem_3.Item8_Item = (yamlConfiguration_WB3_Item.getString("Item8.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item8.Item", DefultValueItem_3.Item8_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item8 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item8.StackSize")) {
            DefultValueItem_3.Item8_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item8.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item8.StackSize", DefultValueItem_3.Item8_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item8 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item9.Item")) {
            DefultValueItem_3.Item9_Item = (yamlConfiguration_WB3_Item.getString("Item9.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item9.Item", DefultValueItem_3.Item9_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item9 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item9.StackSize")) {
            DefultValueItem_3.Item9_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item9.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item9.StackSize", DefultValueItem_3.Item9_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item9 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item10.Item")) {
            DefultValueItem_3.Item10_Item = (yamlConfiguration_WB3_Item.getString("Item10.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item10.Item", DefultValueItem_3.Item10_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item10 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item10.StackSize")) {
            DefultValueItem_3.Item10_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item10.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item10.StackSize", DefultValueItem_3.Item10_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item10 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item11.Item")) {
            DefultValueItem_3.Item11_Item = (yamlConfiguration_WB3_Item.getString("Item11.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item11.Item", DefultValueItem_3.Item11_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item11 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item11.StackSize")) {
            DefultValueItem_3.Item11_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item11.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item11.StackSize", DefultValueItem_3.Item11_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item11 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item12.Item")) {
            DefultValueItem_3.Item12_Item = (yamlConfiguration_WB3_Item.getString("Item12.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item12.Item", DefultValueItem_3.Item12_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item12 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item12.StackSize")) {
            DefultValueItem_3.Item12_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item12.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item12.StackSize", DefultValueItem_3.Item12_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item12 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item13.Item")) {
            DefultValueItem_3.Item13_Item = (yamlConfiguration_WB3_Item.getString("Item13.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item13.Item", DefultValueItem_3.Item13_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item13 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item13.StackSize")) {
            DefultValueItem_3.Item13_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item13.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item13.StackSize", DefultValueItem_3.Item13_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item13 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item14.Item")) {
            DefultValueItem_3.Item14_Item = (yamlConfiguration_WB3_Item.getString("Item14.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item14.Item", DefultValueItem_3.Item14_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item14 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item14.StackSize")) {
            DefultValueItem_3.Item14_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item14.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item14.StackSize", DefultValueItem_3.Item14_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item14 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item15.Item")) {
            DefultValueItem_3.Item15_Item = (yamlConfiguration_WB3_Item.getString("Item15.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item15.Item", DefultValueItem_3.Item15_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item15 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item15.StackSize")) {
            DefultValueItem_3.Item15_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item15.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item15.StackSize", DefultValueItem_3.Item15_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item15 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item16.Item")) {
            DefultValueItem_3.Item16_Item = (yamlConfiguration_WB3_Item.getString("Item16.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item16.Item", DefultValueItem_3.Item16_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item16 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item16.StackSize")) {
            DefultValueItem_3.Item16_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item16.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item16.StackSize", DefultValueItem_3.Item16_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item16 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item17.Item")) {
            DefultValueItem_3.Item17_Item = (yamlConfiguration_WB3_Item.getString("Item17.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item17.Item", DefultValueItem_3.Item17_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item17 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item17.StackSize")) {
            DefultValueItem_3.Item17_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item17.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item17.StackSize", DefultValueItem_3.Item17_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item17 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item18.Item")) {
            DefultValueItem_3.Item18_Item = (yamlConfiguration_WB3_Item.getString("Item18.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item18.Item", DefultValueItem_3.Item18_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item18 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item18.StackSize")) {
            DefultValueItem_3.Item18_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item18.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item18.StackSize", DefultValueItem_3.Item18_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item18 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item19.Item")) {
            DefultValueItem_3.Item19_Item = (yamlConfiguration_WB3_Item.getString("Item19.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item19.Item", DefultValueItem_3.Item19_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item19 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item19.StackSize")) {
            DefultValueItem_3.Item19_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item19.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item19.StackSize", DefultValueItem_3.Item19_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item19 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item20.Item")) {
            DefultValueItem_3.Item20_Item = (yamlConfiguration_WB3_Item.getString("Item20.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item20.Item", DefultValueItem_3.Item20_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item20 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item20.StackSize")) {
            DefultValueItem_3.Item20_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item20.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item20.StackSize", DefultValueItem_3.Item20_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item20 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item21.Item")) {
            DefultValueItem_3.Item21_Item = (yamlConfiguration_WB3_Item.getString("Item21.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item21.Item", DefultValueItem_3.Item21_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item21 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item21.StackSize")) {
            DefultValueItem_3.Item21_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item21.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item21.StackSize", DefultValueItem_3.Item21_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item21 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item22.Item")) {
            DefultValueItem_3.Item22_Item = (yamlConfiguration_WB3_Item.getString("Item22.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item22.Item", DefultValueItem_3.Item22_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item22 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item22.StackSize")) {
            DefultValueItem_3.Item22_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item22.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item22.StackSize", DefultValueItem_3.Item22_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item22 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item23.Item")) {
            DefultValueItem_3.Item23_Item = (yamlConfiguration_WB3_Item.getString("Item23.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item23.Item", DefultValueItem_3.Item23_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item23 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item23.StackSize")) {
            DefultValueItem_3.Item23_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item23.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item23.StackSize", DefultValueItem_3.Item23_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item23 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item24.Item")) {
            DefultValueItem_3.Item24_Item = (yamlConfiguration_WB3_Item.getString("Item24.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item24.Item", DefultValueItem_3.Item24_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item24 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item24.StackSize")) {
            DefultValueItem_3.Item24_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item24.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item24.StackSize", DefultValueItem_3.Item24_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item24 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item25.Item")) {
            DefultValueItem_3.Item25_Item = (yamlConfiguration_WB3_Item.getString("Item25.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item25.Item", DefultValueItem_3.Item25_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item25 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item25.StackSize")) {
            DefultValueItem_3.Item25_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item25.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item25.StackSize", DefultValueItem_3.Item25_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item25 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item26.Item")) {
            DefultValueItem_3.Item26_Item = (yamlConfiguration_WB3_Item.getString("Item26.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item26.Item", DefultValueItem_3.Item26_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item26 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item26.StackSize")) {
            DefultValueItem_3.Item26_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item26.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item26.StackSize", DefultValueItem_3.Item26_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item26 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item27.Item")) {
            DefultValueItem_3.Item27_Item = (yamlConfiguration_WB3_Item.getString("Item27.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item27.Item", DefultValueItem_3.Item27_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item27 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item27.StackSize")) {
            DefultValueItem_3.Item27_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item27.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item27.StackSize", DefultValueItem_3.Item27_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item27 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item28.Item")) {
            DefultValueItem_3.Item28_Item = (yamlConfiguration_WB3_Item.getString("Item28.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item28.Item", DefultValueItem_3.Item28_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item28 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item28.StackSize")) {
            DefultValueItem_3.Item28_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item28.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item28.StackSize", DefultValueItem_3.Item28_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item28 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item29.Item")) {
            DefultValueItem_3.Item29_Item = (yamlConfiguration_WB3_Item.getString("Item29.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item29.Item", DefultValueItem_3.Item29_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item29 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item29.StackSize")) {
            DefultValueItem_3.Item29_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item29.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item29.StackSize", DefultValueItem_3.Item29_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item29 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item30.Item")) {
            DefultValueItem_3.Item30_Item = (yamlConfiguration_WB3_Item.getString("Item30.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item30.Item", DefultValueItem_3.Item30_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item30 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item30.StackSize")) {
            DefultValueItem_3.Item30_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item30.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item30.StackSize", DefultValueItem_3.Item30_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item30 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item31.Item")) {
            DefultValueItem_3.Item31_Item = (yamlConfiguration_WB3_Item.getString("Item31.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item31.Item", DefultValueItem_3.Item31_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item31 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item31.StackSize")) {
            DefultValueItem_3.Item31_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item31.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item31.StackSize", DefultValueItem_3.Item31_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item31 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item32.Item")) {
            DefultValueItem_3.Item32_Item = (yamlConfiguration_WB3_Item.getString("Item32.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item32.Item", DefultValueItem_3.Item32_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item32 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item32.StackSize")) {
            DefultValueItem_3.Item32_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item32.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item32.StackSize", DefultValueItem_3.Item32_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item32 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item33.Item")) {
            DefultValueItem_3.Item33_Item = (yamlConfiguration_WB3_Item.getString("Item33.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item33.Item", DefultValueItem_3.Item33_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item33 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item33.StackSize")) {
            DefultValueItem_3.Item33_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item33.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item33.StackSize", DefultValueItem_3.Item33_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item33 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item34.Item")) {
            DefultValueItem_3.Item34_Item = (yamlConfiguration_WB3_Item.getString("Item34.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item34.Item", DefultValueItem_3.Item34_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item34 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item34.StackSize")) {
            DefultValueItem_3.Item34_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item34.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item34.StackSize", DefultValueItem_3.Item34_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item34 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item35.Item")) {
            DefultValueItem_3.Item35_Item = (yamlConfiguration_WB3_Item.getString("Item35.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item35.Item", DefultValueItem_3.Item35_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item35 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item35.StackSize")) {
            DefultValueItem_3.Item35_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item35.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item35.StackSize", DefultValueItem_3.Item35_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item35 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item36.Item")) {
            DefultValueItem_3.Item36_Item = (yamlConfiguration_WB3_Item.getString("Item36.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item36.Item", DefultValueItem_3.Item36_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item36 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item36.StackSize")) {
            DefultValueItem_3.Item36_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item36.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item36.StackSize", DefultValueItem_3.Item36_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item36 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item37.Item")) {
            DefultValueItem_3.Item37_Item = (yamlConfiguration_WB3_Item.getString("Item37.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item37.Item", DefultValueItem_3.Item37_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item37 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item37.StackSize")) {
            DefultValueItem_3.Item37_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item37.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item37.StackSize", DefultValueItem_3.Item37_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item37 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item38.Item")) {
            DefultValueItem_3.Item38_Item = (yamlConfiguration_WB3_Item.getString("Item38.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item38.Item", DefultValueItem_3.Item38_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item38 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item38.StackSize")) {
            DefultValueItem_3.Item38_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item38.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item38.StackSize", DefultValueItem_3.Item38_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item38 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item39.Item")) {
            DefultValueItem_3.Item39_Item = (yamlConfiguration_WB3_Item.getString("Item39.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item39.Item", DefultValueItem_3.Item39_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item39 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item39.StackSize")) {
            DefultValueItem_3.Item39_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item39.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item39.StackSize", DefultValueItem_3.Item39_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item39 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item40.Item")) {
            DefultValueItem_3.Item40_Item = (yamlConfiguration_WB3_Item.getString("Item40.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item40.Item", DefultValueItem_3.Item40_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item40 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item40.StackSize")) {
            DefultValueItem_3.Item40_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item40.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item40.StackSize", DefultValueItem_3.Item40_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item40 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item41.Item")) {
            DefultValueItem_3.Item41_Item = (yamlConfiguration_WB3_Item.getString("Item41.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item41.Item", DefultValueItem_3.Item41_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item41 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item41.StackSize")) {
            DefultValueItem_3.Item41_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item41.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item41.StackSize", DefultValueItem_3.Item1_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item41 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item42.Item")) {
            DefultValueItem_3.Item42_Item = (yamlConfiguration_WB3_Item.getString("Item42.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item42.Item", DefultValueItem_3.Item42_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item42 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item42.StackSize")) {
            DefultValueItem_3.Item42_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item42.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item42.StackSize", DefultValueItem_3.Item42_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item42 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item43.Item")) {
            DefultValueItem_3.Item43_Item = (yamlConfiguration_WB3_Item.getString("Item43.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item43.Item", DefultValueItem_3.Item43_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item43 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item43.StackSize")) {
            DefultValueItem_3.Item43_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item43.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item43.StackSize", DefultValueItem_3.Item43_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item43 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item44.Item")) {
            DefultValueItem_3.Item44_Item = (yamlConfiguration_WB3_Item.getString("Item44.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item44.Item", DefultValueItem_3.Item44_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item44 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item44.StackSize")) {
            DefultValueItem_3.Item44_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item44.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item44.StackSize", DefultValueItem_3.Item44_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item44 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item45.Item")) {
            DefultValueItem_3.Item45_Item = (yamlConfiguration_WB3_Item.getString("Item45.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item45.Item", DefultValueItem_3.Item45_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item45 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item45.StackSize")) {
            DefultValueItem_3.Item45_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item45.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item45.StackSize", DefultValueItem_3.Item45_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item45 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item46.Item")) {
            DefultValueItem_3.Item46_Item = (yamlConfiguration_WB3_Item.getString("Item46.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item46.Item", DefultValueItem_3.Item46_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item46 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item46.StackSize")) {
            DefultValueItem_3.Item46_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item46.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item46.StackSize", DefultValueItem_3.Item46_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item46 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item47.Item")) {
            DefultValueItem_3.Item47_Item = (yamlConfiguration_WB3_Item.getString("Item47.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item47.Item", DefultValueItem_3.Item47_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item47 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item47.StackSize")) {
            DefultValueItem_3.Item7_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item47.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item47.StackSize", DefultValueItem_3.Item47_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item47 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item48.Item")) {
            DefultValueItem_3.Item48_Item = (yamlConfiguration_WB3_Item.getString("Item48.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item48.Item", DefultValueItem_3.Item48_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item48 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item48.StackSize")) {
            DefultValueItem_3.Item48_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item48.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item48.StackSize", DefultValueItem_3.Item48_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item48 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item49.Item")) {
            DefultValueItem_3.Item49_Item = (yamlConfiguration_WB3_Item.getString("Item49.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item49.Item", DefultValueItem_3.Item49_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item49 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item49.StackSize")) {
            DefultValueItem_3.Item49_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item49.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item49.StackSize", DefultValueItem_3.Item49_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item49 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item50.Item")) {
            DefultValueItem_3.Item50_Item = (yamlConfiguration_WB3_Item.getString("Item50.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item50.Item", DefultValueItem_3.Item50_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item50 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item50.StackSize")) {
            DefultValueItem_3.Item50_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item50.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item50.StackSize", DefultValueItem_3.Item50_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item50 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item51.Item")) {
            DefultValueItem_3.Item51_Item = (yamlConfiguration_WB3_Item.getString("Item51.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item51.Item", DefultValueItem_3.Item51_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item51 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item51.StackSize")) {
            DefultValueItem_3.Item51_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item51.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item51.StackSize", DefultValueItem_3.Item51_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item51 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item52.Item")) {
            DefultValueItem_3.Item52_Item = (yamlConfiguration_WB3_Item.getString("Item52.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item52.Item", DefultValueItem_3.Item52_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item52 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item52.StackSize")) {
            DefultValueItem_3.Item52_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item52.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item52.StackSize", DefultValueItem_3.Item52_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item52 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item53.Item")) {
            DefultValueItem_3.Item53_Item = (yamlConfiguration_WB3_Item.getString("Item53.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item53.Item", DefultValueItem_3.Item53_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item53 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item53.StackSize")) {
            DefultValueItem_3.Item53_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item53.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item53.StackSize", DefultValueItem_3.Item53_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item53 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item54.Item")) {
            DefultValueItem_3.Item54_Item = (yamlConfiguration_WB3_Item.getString("Item54.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item54.Item", DefultValueItem_3.Item54_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item54 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item54.StackSize")) {
            DefultValueItem_3.Item54_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item54.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item54.StackSize", DefultValueItem_3.Item54_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item54 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item55.Item")) {
            DefultValueItem_3.Item55_Item = (yamlConfiguration_WB3_Item.getString("Item55.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item55.Item", DefultValueItem_3.Item55_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item55 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item55.StackSize")) {
            DefultValueItem_3.Item55_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item55.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item55.StackSize", DefultValueItem_3.Item55_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item55 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item56.Item")) {
            DefultValueItem_3.Item56_Item = (yamlConfiguration_WB3_Item.getString("Item56.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item56.Item", DefultValueItem_3.Item56_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item56 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item56.StackSize")) {
            DefultValueItem_3.Item56_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item56.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item56.StackSize", DefultValueItem_3.Item56_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item56 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item57.Item")) {
            DefultValueItem_3.Item57_Item = (yamlConfiguration_WB3_Item.getString("Item57.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item57.Item", DefultValueItem_3.Item57_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item57 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item57.StackSize")) {
            DefultValueItem_3.Item57_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item57.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item57.StackSize", DefultValueItem_3.Item57_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item57 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item58.Item")) {
            DefultValueItem_3.Item58_Item = (yamlConfiguration_WB3_Item.getString("Item58.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item58.Item", DefultValueItem_3.Item58_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item58 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item58.StackSize")) {
            DefultValueItem_3.Item58_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item58.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item58.StackSize", DefultValueItem_3.Item58_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item58 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item59.Item")) {
            DefultValueItem_3.Item59_Item = (yamlConfiguration_WB3_Item.getString("Item59.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item59.Item", DefultValueItem_3.Item59_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item59 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item59.StackSize")) {
            DefultValueItem_3.Item9_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item59.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item59.StackSize", DefultValueItem_3.Item59_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item59 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item60.Item")) {
            DefultValueItem_3.Item60_Item = (yamlConfiguration_WB3_Item.getString("Item60.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item60.Item", DefultValueItem_3.Item60_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item60 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item60.StackSize")) {
            DefultValueItem_3.Item60_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item60.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item60.StackSize", DefultValueItem_3.Item60_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item60 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item61.Item")) {
            DefultValueItem_3.Item61_Item = (yamlConfiguration_WB3_Item.getString("Item61.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item61.Item", DefultValueItem_3.Item61_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item61 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item61.StackSize")) {
            DefultValueItem_3.Item61_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item61.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item61.StackSize", DefultValueItem_3.Item61_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item61 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item62.Item")) {
            DefultValueItem_3.Item62_Item = (yamlConfiguration_WB3_Item.getString("Item62.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item62.Item", DefultValueItem_3.Item62_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item62 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item62.StackSize")) {
            DefultValueItem_3.Item62_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item62.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item62.StackSize", DefultValueItem_3.Item62_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item62 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item63.Item")) {
            DefultValueItem_3.Item63_Item = (yamlConfiguration_WB3_Item.getString("Item63.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item63.Item", DefultValueItem_3.Item63_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item63 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item63.StackSize")) {
            DefultValueItem_3.Item63_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item63.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item63.StackSize", DefultValueItem_3.Item63_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item63 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item64.Item")) {
            DefultValueItem_3.Item64_Item = (yamlConfiguration_WB3_Item.getString("Item64.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item64.Item", DefultValueItem_3.Item64_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item64 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item64.StackSize")) {
            DefultValueItem_3.Item64_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item64.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item64.StackSize", DefultValueItem_3.Item64_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item64 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item65.Item")) {
            DefultValueItem_3.Item65_Item = (yamlConfiguration_WB3_Item.getString("Item65.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item65.Item", DefultValueItem_3.Item65_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item65 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item65.StackSize")) {
            DefultValueItem_3.Item65_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item65.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item65.StackSize", DefultValueItem_3.Item65_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item65 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item66.Item")) {
            DefultValueItem_3.Item66_Item = (yamlConfiguration_WB3_Item.getString("Item66.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item66.Item", DefultValueItem_3.Item66_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item66 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item66.StackSize")) {
            DefultValueItem_3.Item66_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item66.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item66.StackSize", DefultValueItem_3.Item66_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item66 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item67.Item")) {
            DefultValueItem_3.Item67_Item = (yamlConfiguration_WB3_Item.getString("Item67.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item67.Item", DefultValueItem_3.Item67_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item67 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item67.StackSize")) {
            DefultValueItem_3.Item67_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item67.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item67.StackSize", DefultValueItem_3.Item67_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item67 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item68.Item")) {
            DefultValueItem_3.Item68_Item = (yamlConfiguration_WB3_Item.getString("Item68.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item68.Item", DefultValueItem_3.Item8_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item68 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item68.StackSize")) {
            DefultValueItem_3.Item68_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item68.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item68.StackSize", DefultValueItem_3.Item68_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item68 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item69.Item")) {
            DefultValueItem_3.Item69_Item = (yamlConfiguration_WB3_Item.getString("Item69.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item69.Item", DefultValueItem_3.Item69_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item69 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item69.StackSize")) {
            DefultValueItem_3.Item69_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item69.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item69.StackSize", DefultValueItem_3.Item69_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item69 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        if (yamlConfiguration_WB3_Item.contains("Item70.Item")) {
            DefultValueItem_3.Item70_Item = (yamlConfiguration_WB3_Item.getString("Item70.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB3_Item.set("Item70.Item", DefultValueItem_3.Item70_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item70 Item §4was added to §9WonderBag Item large.yml§4!");
        }
        if (yamlConfiguration_WB3_Item.contains("Item70.StackSize")) {
            DefultValueItem_3.Item70_StackSize = Integer.valueOf(yamlConfiguration_WB3_Item.getString("Item70.StackSize"));
        } else {
            yamlConfiguration_WB3_Item.set("Item70.StackSize", DefultValueItem_3.Item70_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item70 StackSize §4was added to §9WonderBag Item large.yml§4!");
        }

        try {
            yamlConfiguration_WB3_Item.save(WB3ItemYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2WonderBag Item large.yml loaded successfully.");

    }

    public static void WB3ItemDisable() {
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag Item large.yml successfully deactivated.");
    }

    private static String replace(String Text) {

        File WB3YML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Item/" + "large.yml");
        YamlConfiguration yamlConfiguration_WB3_Item = YamlConfiguration.loadConfiguration(WB3YML);

        return Text.replace("[prefix]", DefultValue.Prefix).replace("&", "§").replace("[currency]", DefultValue.Currency)
                .replace("[ue]", "ü").replace("[UE]", "Ü").replace("[oe]", "Ö").replace("[OE]", "Ö")
                .replace("[ae]", "ä").replace("[AE]", "Ä").replace("[WB1Name]", DefultValueItem_3.Name)
                .replace("[WB3Price]", String.valueOf(yamlConfiguration_WB3_Item.get("Shop.price")));
    }
}