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

package de.jatitv.wonderbagshop.config.wonderBags.item;

import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_1;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class WonderBagItem_1 {

    public static void WB1ItemCreate() throws InterruptedException {
        Long long_ = Long.valueOf(System.currentTimeMillis());


        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4WonderBag Item small.yml load...");

        File WB1ItemYML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Item/" + "small.yml");
        YamlConfiguration yamlConfiguration_WB1_Item = YamlConfiguration.loadConfiguration(WB1ItemYML);


        if (!yamlConfiguration_WB1_Item.contains("Do_not_remove_or_change.Created")) {
            yamlConfiguration_WB1_Item.set("Do_not_remove_or_change.Created", "This file was created with version " + Main.getPlugin().getDescription().getVersion());
        }

        yamlConfiguration_WB1_Item.set("Do_not_remove_or_change.Version", Main.getPlugin().getDescription().getVersion());

        yamlConfiguration_WB1_Item.set("Do_not_remove_or_change.Autor", Main.Autor);

        yamlConfiguration_WB1_Item.set("Do_not_remove_or_change.Spigot", Main.Spigot);

        yamlConfiguration_WB1_Item.set("Do_not_remove_or_change.Discord", Main.Discord);


        // Shop

        if (yamlConfiguration_WB1_Item.contains("Shop.Name")) {
            DefaultValueItem_1.Name = replace(yamlConfiguration_WB1_Item.getString("Shop.Name"));
        } else {
            yamlConfiguration_WB1_Item.set("Shop.Name", "&2Wonder&6Bag&7: &9small");
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Shop Name §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Shop.price")) {
            DefaultValueItem_1.price = (yamlConfiguration_WB1_Item.getDouble("Shop.price"));
        } else {
            yamlConfiguration_WB1_Item.set("Shop.price", DefaultValueItem_1.price);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Shop price §4was added to §9WonderBag Item small.yml§4!");
        }

        // WonderBag

        if (yamlConfiguration_WB1_Item.contains("WonderBag.DisplayName")) {
            DefaultValueItem_1.DisplayName = replace(yamlConfiguration_WB1_Item.getString("WonderBag.DisplayName"));
        } else {
            yamlConfiguration_WB1_Item.set("WonderBag.DisplayName", "&2Wonder&6Bag &9small");
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6WonderBag DisplayName §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("WonderBag.Item")) {
            DefaultValueItem_1.Item = replace(yamlConfiguration_WB1_Item.getString("WonderBag.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("WonderBag.Item", "PAPER");
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6WonderBags Item §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("WonderBag.Item_amount_(1-9)")) {
            DefaultValueItem_1.Item_anz = Integer.valueOf(yamlConfiguration_WB1_Item.getString("WonderBag.Item_amount_(1-9)"));
        } else {
            yamlConfiguration_WB1_Item.set("WonderBag.Item_amount_(1-9)", DefaultValueItem_1.Item_anz);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6WonderBag Item_amount_(1-9) §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.getInt("WonderBag.Item_amount_(1-9)") > 9){
            yamlConfiguration_WB1_Item.set("WonderBag.Item_amount_(1-9)", 9);
        }

        // Items

        if (yamlConfiguration_WB1_Item.contains("Item1.Item")) {
            DefaultValueItem_1.Item1_Item = (yamlConfiguration_WB1_Item.getString("Item1.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item1.Item", DefaultValueItem_1.Item1_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item1 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item1.StackSize")) {
            DefaultValueItem_1.Item1_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item1.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item1.StackSize", DefaultValueItem_1.Item1_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item1 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item2.Item")) {
            DefaultValueItem_1.Item2_Item = (yamlConfiguration_WB1_Item.getString("Item2.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item2.Item", DefaultValueItem_1.Item2_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item2 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item2.StackSize")) {
            DefaultValueItem_1.Item2_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item2.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item2.StackSize", DefaultValueItem_1.Item2_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item2 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item3.Item")) {
            DefaultValueItem_1.Item3_Item = (yamlConfiguration_WB1_Item.getString("Item3.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item3.Item", DefaultValueItem_1.Item3_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item3 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item3.StackSize")) {
            DefaultValueItem_1.Item3_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item3.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item3.StackSize", DefaultValueItem_1.Item3_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item3 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item4.Item")) {
            DefaultValueItem_1.Item4_Item = (yamlConfiguration_WB1_Item.getString("Item4.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item4.Item", DefaultValueItem_1.Item4_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item4 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item4.StackSize")) {
            DefaultValueItem_1.Item4_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item4.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item4.StackSize", DefaultValueItem_1.Item4_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item4 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item5.Item")) {
            DefaultValueItem_1.Item5_Item = (yamlConfiguration_WB1_Item.getString("Item5.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item5.Item", DefaultValueItem_1.Item5_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item5 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item5.StackSize")) {
            DefaultValueItem_1.Item5_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item5.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item5.StackSize", DefaultValueItem_1.Item5_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item5 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item6.Item")) {
            DefaultValueItem_1.Item6_Item = (yamlConfiguration_WB1_Item.getString("Item6.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item6.Item", DefaultValueItem_1.Item6_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item6 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item6.StackSize")) {
            DefaultValueItem_1.Item6_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item6.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item6.StackSize", DefaultValueItem_1.Item6_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item6 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item7.Item")) {
            DefaultValueItem_1.Item7_Item = (yamlConfiguration_WB1_Item.getString("Item7.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item7.Item", DefaultValueItem_1.Item7_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item7 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item7.StackSize")) {
            DefaultValueItem_1.Item7_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item7.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item7.StackSize", DefaultValueItem_1.Item7_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item7 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item8.Item")) {
            DefaultValueItem_1.Item8_Item = (yamlConfiguration_WB1_Item.getString("Item8.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item8.Item", DefaultValueItem_1.Item8_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item8 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item8.StackSize")) {
            DefaultValueItem_1.Item8_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item8.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item8.StackSize", DefaultValueItem_1.Item8_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item8 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item9.Item")) {
            DefaultValueItem_1.Item9_Item = (yamlConfiguration_WB1_Item.getString("Item9.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item9.Item", DefaultValueItem_1.Item9_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item9 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item9.StackSize")) {
            DefaultValueItem_1.Item9_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item9.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item9.StackSize", DefaultValueItem_1.Item9_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item9 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item10.Item")) {
            DefaultValueItem_1.Item10_Item = (yamlConfiguration_WB1_Item.getString("Item10.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item10.Item", DefaultValueItem_1.Item10_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item10 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item10.StackSize")) {
            DefaultValueItem_1.Item10_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item10.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item10.StackSize", DefaultValueItem_1.Item10_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item10 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item11.Item")) {
            DefaultValueItem_1.Item11_Item = (yamlConfiguration_WB1_Item.getString("Item11.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item11.Item", DefaultValueItem_1.Item11_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item11 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item11.StackSize")) {
            DefaultValueItem_1.Item11_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item11.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item11.StackSize", DefaultValueItem_1.Item11_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item11 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item12.Item")) {
            DefaultValueItem_1.Item12_Item = (yamlConfiguration_WB1_Item.getString("Item12.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item12.Item", DefaultValueItem_1.Item12_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item12 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item12.StackSize")) {
            DefaultValueItem_1.Item12_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item12.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item12.StackSize", DefaultValueItem_1.Item12_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item12 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item13.Item")) {
            DefaultValueItem_1.Item13_Item = (yamlConfiguration_WB1_Item.getString("Item13.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item13.Item", DefaultValueItem_1.Item13_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item13 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item13.StackSize")) {
            DefaultValueItem_1.Item13_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item13.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item13.StackSize", DefaultValueItem_1.Item13_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item13 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item14.Item")) {
            DefaultValueItem_1.Item14_Item = (yamlConfiguration_WB1_Item.getString("Item14.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item14.Item", DefaultValueItem_1.Item14_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item14 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item14.StackSize")) {
            DefaultValueItem_1.Item14_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item14.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item14.StackSize", DefaultValueItem_1.Item14_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item14 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item15.Item")) {
            DefaultValueItem_1.Item15_Item = (yamlConfiguration_WB1_Item.getString("Item15.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item15.Item", DefaultValueItem_1.Item15_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item15 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item15.StackSize")) {
            DefaultValueItem_1.Item15_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item15.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item15.StackSize", DefaultValueItem_1.Item15_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item15 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item16.Item")) {
            DefaultValueItem_1.Item16_Item = (yamlConfiguration_WB1_Item.getString("Item16.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item16.Item", DefaultValueItem_1.Item16_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item16 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item16.StackSize")) {
            DefaultValueItem_1.Item16_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item16.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item16.StackSize", DefaultValueItem_1.Item16_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item16 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item17.Item")) {
            DefaultValueItem_1.Item17_Item = (yamlConfiguration_WB1_Item.getString("Item17.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item17.Item", DefaultValueItem_1.Item17_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item17 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item17.StackSize")) {
            DefaultValueItem_1.Item17_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item17.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item17.StackSize", DefaultValueItem_1.Item17_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item17 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item18.Item")) {
            DefaultValueItem_1.Item18_Item = (yamlConfiguration_WB1_Item.getString("Item18.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item18.Item", DefaultValueItem_1.Item18_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item18 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item18.StackSize")) {
            DefaultValueItem_1.Item18_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item18.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item18.StackSize", DefaultValueItem_1.Item18_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item18 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item19.Item")) {
            DefaultValueItem_1.Item19_Item = (yamlConfiguration_WB1_Item.getString("Item19.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item19.Item", DefaultValueItem_1.Item19_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item19 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item19.StackSize")) {
            DefaultValueItem_1.Item19_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item19.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item19.StackSize", DefaultValueItem_1.Item19_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item19 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item20.Item")) {
            DefaultValueItem_1.Item20_Item = (yamlConfiguration_WB1_Item.getString("Item20.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item20.Item", DefaultValueItem_1.Item20_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item20 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item20.StackSize")) {
            DefaultValueItem_1.Item20_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item20.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item20.StackSize", DefaultValueItem_1.Item20_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item20 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item21.Item")) {
            DefaultValueItem_1.Item21_Item = (yamlConfiguration_WB1_Item.getString("Item21.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item21.Item", DefaultValueItem_1.Item21_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item21 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item21.StackSize")) {
            DefaultValueItem_1.Item21_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item21.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item21.StackSize", DefaultValueItem_1.Item21_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item21 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item22.Item")) {
            DefaultValueItem_1.Item22_Item = (yamlConfiguration_WB1_Item.getString("Item22.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item22.Item", DefaultValueItem_1.Item22_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item22 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item22.StackSize")) {
            DefaultValueItem_1.Item22_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item22.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item22.StackSize", DefaultValueItem_1.Item22_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item22 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item23.Item")) {
            DefaultValueItem_1.Item23_Item = (yamlConfiguration_WB1_Item.getString("Item23.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item23.Item", DefaultValueItem_1.Item23_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item23 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item23.StackSize")) {
            DefaultValueItem_1.Item23_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item23.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item23.StackSize", DefaultValueItem_1.Item23_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item23 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item24.Item")) {
            DefaultValueItem_1.Item24_Item = (yamlConfiguration_WB1_Item.getString("Item24.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item24.Item", DefaultValueItem_1.Item24_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item24 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item24.StackSize")) {
            DefaultValueItem_1.Item24_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item24.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item24.StackSize", DefaultValueItem_1.Item24_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item24 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item25.Item")) {
            DefaultValueItem_1.Item25_Item = (yamlConfiguration_WB1_Item.getString("Item25.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item25.Item", DefaultValueItem_1.Item25_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item25 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item25.StackSize")) {
            DefaultValueItem_1.Item25_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item25.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item25.StackSize", DefaultValueItem_1.Item25_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item25 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item26.Item")) {
            DefaultValueItem_1.Item26_Item = (yamlConfiguration_WB1_Item.getString("Item26.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item26.Item", DefaultValueItem_1.Item26_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item26 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item26.StackSize")) {
            DefaultValueItem_1.Item26_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item26.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item26.StackSize", DefaultValueItem_1.Item26_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item26 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item27.Item")) {
            DefaultValueItem_1.Item27_Item = (yamlConfiguration_WB1_Item.getString("Item27.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item27.Item", DefaultValueItem_1.Item27_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item27 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item27.StackSize")) {
            DefaultValueItem_1.Item27_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item27.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item27.StackSize", DefaultValueItem_1.Item27_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item27 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item28.Item")) {
            DefaultValueItem_1.Item28_Item = (yamlConfiguration_WB1_Item.getString("Item28.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item28.Item", DefaultValueItem_1.Item28_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item28 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item28.StackSize")) {
            DefaultValueItem_1.Item28_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item28.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item28.StackSize", DefaultValueItem_1.Item28_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item28 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item29.Item")) {
            DefaultValueItem_1.Item29_Item = (yamlConfiguration_WB1_Item.getString("Item29.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item29.Item", DefaultValueItem_1.Item29_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item29 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item29.StackSize")) {
            DefaultValueItem_1.Item29_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item29.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item29.StackSize", DefaultValueItem_1.Item29_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item29 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item30.Item")) {
            DefaultValueItem_1.Item30_Item = (yamlConfiguration_WB1_Item.getString("Item30.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item30.Item", DefaultValueItem_1.Item30_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item30 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item30.StackSize")) {
            DefaultValueItem_1.Item30_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item30.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item30.StackSize", DefaultValueItem_1.Item30_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item30 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item31.Item")) {
            DefaultValueItem_1.Item31_Item = (yamlConfiguration_WB1_Item.getString("Item31.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item31.Item", DefaultValueItem_1.Item31_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item31 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item31.StackSize")) {
            DefaultValueItem_1.Item31_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item31.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item31.StackSize", DefaultValueItem_1.Item31_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item31 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item32.Item")) {
            DefaultValueItem_1.Item32_Item = (yamlConfiguration_WB1_Item.getString("Item32.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item32.Item", DefaultValueItem_1.Item32_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item32 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item32.StackSize")) {
            DefaultValueItem_1.Item32_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item32.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item32.StackSize", DefaultValueItem_1.Item32_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item32 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item33.Item")) {
            DefaultValueItem_1.Item33_Item = (yamlConfiguration_WB1_Item.getString("Item33.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item33.Item", DefaultValueItem_1.Item33_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item33 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item33.StackSize")) {
            DefaultValueItem_1.Item33_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item33.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item33.StackSize", DefaultValueItem_1.Item33_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item33 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item34.Item")) {
            DefaultValueItem_1.Item34_Item = (yamlConfiguration_WB1_Item.getString("Item34.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item34.Item", DefaultValueItem_1.Item34_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item34 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item34.StackSize")) {
            DefaultValueItem_1.Item34_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item34.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item34.StackSize", DefaultValueItem_1.Item34_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item34 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item35.Item")) {
            DefaultValueItem_1.Item35_Item = (yamlConfiguration_WB1_Item.getString("Item35.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item35.Item", DefaultValueItem_1.Item35_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item35 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item35.StackSize")) {
            DefaultValueItem_1.Item35_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item35.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item35.StackSize", DefaultValueItem_1.Item35_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item35 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item36.Item")) {
            DefaultValueItem_1.Item36_Item = (yamlConfiguration_WB1_Item.getString("Item36.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item36.Item", DefaultValueItem_1.Item36_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item36 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item36.StackSize")) {
            DefaultValueItem_1.Item36_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item36.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item36.StackSize", DefaultValueItem_1.Item36_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item36 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item37.Item")) {
            DefaultValueItem_1.Item37_Item = (yamlConfiguration_WB1_Item.getString("Item37.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item37.Item", DefaultValueItem_1.Item37_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item37 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item37.StackSize")) {
            DefaultValueItem_1.Item37_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item37.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item37.StackSize", DefaultValueItem_1.Item37_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item37 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item38.Item")) {
            DefaultValueItem_1.Item38_Item = (yamlConfiguration_WB1_Item.getString("Item38.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item38.Item", DefaultValueItem_1.Item38_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item38 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item38.StackSize")) {
            DefaultValueItem_1.Item38_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item38.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item38.StackSize", DefaultValueItem_1.Item38_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item38 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item39.Item")) {
            DefaultValueItem_1.Item39_Item = (yamlConfiguration_WB1_Item.getString("Item39.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item39.Item", DefaultValueItem_1.Item39_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item39 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item39.StackSize")) {
            DefaultValueItem_1.Item39_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item39.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item39.StackSize", DefaultValueItem_1.Item39_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item39 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item40.Item")) {
            DefaultValueItem_1.Item40_Item = (yamlConfiguration_WB1_Item.getString("Item40.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item40.Item", DefaultValueItem_1.Item40_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item40 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item40.StackSize")) {
            DefaultValueItem_1.Item40_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item40.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item40.StackSize", DefaultValueItem_1.Item40_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item40 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item41.Item")) {
            DefaultValueItem_1.Item41_Item = (yamlConfiguration_WB1_Item.getString("Item41.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item41.Item", DefaultValueItem_1.Item41_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item41 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item41.StackSize")) {
            DefaultValueItem_1.Item41_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item41.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item41.StackSize", DefaultValueItem_1.Item1_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item41 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item42.Item")) {
            DefaultValueItem_1.Item42_Item = (yamlConfiguration_WB1_Item.getString("Item42.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item42.Item", DefaultValueItem_1.Item42_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item42 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item42.StackSize")) {
            DefaultValueItem_1.Item42_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item42.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item42.StackSize", DefaultValueItem_1.Item42_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item42 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item43.Item")) {
            DefaultValueItem_1.Item43_Item = (yamlConfiguration_WB1_Item.getString("Item43.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item43.Item", DefaultValueItem_1.Item43_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item43 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item43.StackSize")) {
            DefaultValueItem_1.Item43_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item43.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item43.StackSize", DefaultValueItem_1.Item43_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item43 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item44.Item")) {
            DefaultValueItem_1.Item44_Item = (yamlConfiguration_WB1_Item.getString("Item44.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item44.Item", DefaultValueItem_1.Item44_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item44 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item44.StackSize")) {
            DefaultValueItem_1.Item44_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item44.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item44.StackSize", DefaultValueItem_1.Item44_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item44 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item45.Item")) {
            DefaultValueItem_1.Item45_Item = (yamlConfiguration_WB1_Item.getString("Item45.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item45.Item", DefaultValueItem_1.Item45_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item45 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item45.StackSize")) {
            DefaultValueItem_1.Item45_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item45.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item45.StackSize", DefaultValueItem_1.Item45_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item45 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item46.Item")) {
            DefaultValueItem_1.Item46_Item = (yamlConfiguration_WB1_Item.getString("Item46.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item46.Item", DefaultValueItem_1.Item46_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item46 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item46.StackSize")) {
            DefaultValueItem_1.Item46_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item46.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item46.StackSize", DefaultValueItem_1.Item46_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item46 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item47.Item")) {
            DefaultValueItem_1.Item47_Item = (yamlConfiguration_WB1_Item.getString("Item47.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item47.Item", DefaultValueItem_1.Item47_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item47 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item47.StackSize")) {
            DefaultValueItem_1.Item7_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item47.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item47.StackSize", DefaultValueItem_1.Item47_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item47 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item48.Item")) {
            DefaultValueItem_1.Item48_Item = (yamlConfiguration_WB1_Item.getString("Item48.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item48.Item", DefaultValueItem_1.Item48_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item48 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item48.StackSize")) {
            DefaultValueItem_1.Item48_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item48.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item48.StackSize", DefaultValueItem_1.Item48_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item48 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item49.Item")) {
            DefaultValueItem_1.Item49_Item = (yamlConfiguration_WB1_Item.getString("Item49.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item49.Item", DefaultValueItem_1.Item49_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item49 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item49.StackSize")) {
            DefaultValueItem_1.Item49_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item49.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item49.StackSize", DefaultValueItem_1.Item49_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item49 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item50.Item")) {
            DefaultValueItem_1.Item50_Item = (yamlConfiguration_WB1_Item.getString("Item50.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item50.Item", DefaultValueItem_1.Item50_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item50 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item50.StackSize")) {
            DefaultValueItem_1.Item50_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item50.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item50.StackSize", DefaultValueItem_1.Item50_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item50 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item51.Item")) {
            DefaultValueItem_1.Item51_Item = (yamlConfiguration_WB1_Item.getString("Item51.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item51.Item", DefaultValueItem_1.Item51_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item51 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item51.StackSize")) {
            DefaultValueItem_1.Item51_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item51.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item51.StackSize", DefaultValueItem_1.Item51_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item51 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item52.Item")) {
            DefaultValueItem_1.Item52_Item = (yamlConfiguration_WB1_Item.getString("Item52.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item52.Item", DefaultValueItem_1.Item52_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item52 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item52.StackSize")) {
            DefaultValueItem_1.Item52_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item52.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item52.StackSize", DefaultValueItem_1.Item52_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item52 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item53.Item")) {
            DefaultValueItem_1.Item53_Item = (yamlConfiguration_WB1_Item.getString("Item53.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item53.Item", DefaultValueItem_1.Item53_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item53 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item53.StackSize")) {
            DefaultValueItem_1.Item53_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item53.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item53.StackSize", DefaultValueItem_1.Item53_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item53 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item54.Item")) {
            DefaultValueItem_1.Item54_Item = (yamlConfiguration_WB1_Item.getString("Item54.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item54.Item", DefaultValueItem_1.Item54_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item54 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item54.StackSize")) {
            DefaultValueItem_1.Item54_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item54.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item54.StackSize", DefaultValueItem_1.Item54_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item54 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item55.Item")) {
            DefaultValueItem_1.Item55_Item = (yamlConfiguration_WB1_Item.getString("Item55.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item55.Item", DefaultValueItem_1.Item55_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item55 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item55.StackSize")) {
            DefaultValueItem_1.Item55_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item55.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item55.StackSize", DefaultValueItem_1.Item55_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item55 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item56.Item")) {
            DefaultValueItem_1.Item56_Item = (yamlConfiguration_WB1_Item.getString("Item56.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item56.Item", DefaultValueItem_1.Item56_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item56 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item56.StackSize")) {
            DefaultValueItem_1.Item56_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item56.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item56.StackSize", DefaultValueItem_1.Item56_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item56 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item57.Item")) {
            DefaultValueItem_1.Item57_Item = (yamlConfiguration_WB1_Item.getString("Item57.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item57.Item", DefaultValueItem_1.Item57_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item57 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item57.StackSize")) {
            DefaultValueItem_1.Item57_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item57.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item57.StackSize", DefaultValueItem_1.Item57_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item57 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item58.Item")) {
            DefaultValueItem_1.Item58_Item = (yamlConfiguration_WB1_Item.getString("Item58.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item58.Item", DefaultValueItem_1.Item58_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item58 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item58.StackSize")) {
            DefaultValueItem_1.Item58_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item58.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item58.StackSize", DefaultValueItem_1.Item58_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item58 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item59.Item")) {
            DefaultValueItem_1.Item59_Item = (yamlConfiguration_WB1_Item.getString("Item59.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item59.Item", DefaultValueItem_1.Item59_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item59 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item59.StackSize")) {
            DefaultValueItem_1.Item9_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item59.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item59.StackSize", DefaultValueItem_1.Item59_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item59 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item60.Item")) {
            DefaultValueItem_1.Item60_Item = (yamlConfiguration_WB1_Item.getString("Item60.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item60.Item", DefaultValueItem_1.Item60_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item60 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item60.StackSize")) {
            DefaultValueItem_1.Item60_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item60.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item60.StackSize", DefaultValueItem_1.Item60_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item60 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item61.Item")) {
            DefaultValueItem_1.Item61_Item = (yamlConfiguration_WB1_Item.getString("Item61.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item61.Item", DefaultValueItem_1.Item61_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item61 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item61.StackSize")) {
            DefaultValueItem_1.Item61_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item61.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item61.StackSize", DefaultValueItem_1.Item61_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item61 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item62.Item")) {
            DefaultValueItem_1.Item62_Item = (yamlConfiguration_WB1_Item.getString("Item62.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item62.Item", DefaultValueItem_1.Item62_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item62 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item62.StackSize")) {
            DefaultValueItem_1.Item62_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item62.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item62.StackSize", DefaultValueItem_1.Item62_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item62 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item63.Item")) {
            DefaultValueItem_1.Item63_Item = (yamlConfiguration_WB1_Item.getString("Item63.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item63.Item", DefaultValueItem_1.Item63_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item63 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item63.StackSize")) {
            DefaultValueItem_1.Item63_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item63.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item63.StackSize", DefaultValueItem_1.Item63_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item63 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item64.Item")) {
            DefaultValueItem_1.Item64_Item = (yamlConfiguration_WB1_Item.getString("Item64.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item64.Item", DefaultValueItem_1.Item64_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item64 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item64.StackSize")) {
            DefaultValueItem_1.Item64_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item64.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item64.StackSize", DefaultValueItem_1.Item64_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item64 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item65.Item")) {
            DefaultValueItem_1.Item65_Item = (yamlConfiguration_WB1_Item.getString("Item65.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item65.Item", DefaultValueItem_1.Item65_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item65 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item65.StackSize")) {
            DefaultValueItem_1.Item65_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item65.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item65.StackSize", DefaultValueItem_1.Item65_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item65 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item66.Item")) {
            DefaultValueItem_1.Item66_Item = (yamlConfiguration_WB1_Item.getString("Item66.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item66.Item", DefaultValueItem_1.Item66_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item66 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item66.StackSize")) {
            DefaultValueItem_1.Item66_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item66.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item66.StackSize", DefaultValueItem_1.Item66_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item66 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item67.Item")) {
            DefaultValueItem_1.Item67_Item = (yamlConfiguration_WB1_Item.getString("Item67.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item67.Item", DefaultValueItem_1.Item67_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item67 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item67.StackSize")) {
            DefaultValueItem_1.Item67_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item67.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item67.StackSize", DefaultValueItem_1.Item67_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item67 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item68.Item")) {
            DefaultValueItem_1.Item68_Item = (yamlConfiguration_WB1_Item.getString("Item68.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item68.Item", DefaultValueItem_1.Item8_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item68 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item68.StackSize")) {
            DefaultValueItem_1.Item68_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item68.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item68.StackSize", DefaultValueItem_1.Item68_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item68 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item69.Item")) {
            DefaultValueItem_1.Item69_Item = (yamlConfiguration_WB1_Item.getString("Item69.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item69.Item", DefaultValueItem_1.Item69_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item69 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item69.StackSize")) {
            DefaultValueItem_1.Item69_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item69.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item69.StackSize", DefaultValueItem_1.Item69_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item69 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        if (yamlConfiguration_WB1_Item.contains("Item70.Item")) {
            DefaultValueItem_1.Item70_Item = (yamlConfiguration_WB1_Item.getString("Item70.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Item.set("Item70.Item", DefaultValueItem_1.Item70_Item);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item70 Item §4was added to §9WonderBag Item small.yml§4!");
        }
        if (yamlConfiguration_WB1_Item.contains("Item70.StackSize")) {
            DefaultValueItem_1.Item70_StackSize = Integer.valueOf(yamlConfiguration_WB1_Item.getString("Item70.StackSize"));
        } else {
            yamlConfiguration_WB1_Item.set("Item70.StackSize", DefaultValueItem_1.Item70_StackSize);
            if (WB1ItemYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item70 StackSize §4was added to §9WonderBag Item small.yml§4!");
        }

        try {
            yamlConfiguration_WB1_Item.save(WB1ItemYML);
        } catch (IOException e) {
            e.printStackTrace();
        }


        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2WonderBag Item small.yml loaded successfully." + " §7- §e" + (System.currentTimeMillis() - long_.longValue()) + "ms");

    }

    public static void WB1ItemDisable() {
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4WonderBag Item small.yml successfully deactivated.");
    }

    private static String replace(String Text) {

        File WB1YML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Item/" + "small.yml");
        YamlConfiguration yamlConfiguration_WB1_Item = YamlConfiguration.loadConfiguration(WB1YML);

        return Text.replace("[prefix]", DefaultValue.Prefix).replace("&", "§").replace("[currency]", DefaultValue.Currency)
                .replace("[ue]", "ü").replace("[UE]", "Ü").replace("[oe]", "Ö").replace("[OE]", "Ö")
                .replace("[ae]", "ä").replace("[AE]", "Ä").replace("[WB1Name]", DefaultValueItem_1.Name)
                .replace("[WB1Price]", String.valueOf(yamlConfiguration_WB1_Item.get("Shop.price")));
    }
}