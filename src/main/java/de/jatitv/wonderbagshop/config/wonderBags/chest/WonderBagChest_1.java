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

package de.jatitv.wonderbagshop.config.wonderBags.chest;

import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_1;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class WonderBagChest_1 {

    public static void WB1ChestCreate() throws InterruptedException {
        Long long_ = Long.valueOf(System.currentTimeMillis());


        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4WonderBag Chest small.yml load...");


        File WB1ChestYML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Chest/" + "small.yml");
        YamlConfiguration yamlConfiguration_WB1_Chest = YamlConfiguration.loadConfiguration(WB1ChestYML);


        if (!yamlConfiguration_WB1_Chest.contains("Do_not_remove_or_change.Created")) {
            yamlConfiguration_WB1_Chest.set("Do_not_remove_or_change.Created", "This file was created with version " + Main.getPlugin().getDescription().getVersion());
        }

        yamlConfiguration_WB1_Chest.set("Do_not_remove_or_change.Version", Main.getPlugin().getDescription().getVersion());

        yamlConfiguration_WB1_Chest.set("Do_not_remove_or_change.Autor", Main.Autor);

        yamlConfiguration_WB1_Chest.set("Do_not_remove_or_change.Spigot", Main.Spigot);

        yamlConfiguration_WB1_Chest.set("Do_not_remove_or_change.Discord", Main.Discord);



        // Shop

        if (yamlConfiguration_WB1_Chest.contains("Shop.Name")) {
            DefaultValueChest_1.Name = replace(yamlConfiguration_WB1_Chest.getString("Shop.Name"));
        } else {
            yamlConfiguration_WB1_Chest.set("Shop.Name", "&2Wonder&6Bag&7: &9small");
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Shop Name §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Shop.price")) {
            DefaultValueChest_1.price = (yamlConfiguration_WB1_Chest.getDouble("Shop.price"));
        } else {
            yamlConfiguration_WB1_Chest.set("Shop.price", DefaultValueChest_1.price);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Shop price §4was added to §9WonderBag Chest small.yml§4!");
        }

        // WonderBag

        if (yamlConfiguration_WB1_Chest.contains("WonderBag.DisplayName")) {
            DefaultValueChest_1.DisplayName = replace(yamlConfiguration_WB1_Chest.getString("WonderBag.DisplayName"));
        } else {
            yamlConfiguration_WB1_Chest.set("WonderBag.DisplayName", "&2Wonder&6Bag &9small");
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6WonderBag DisplayName §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("WonderBag.Item_amount_(1-9)")) {
            DefaultValueChest_1.Item_anz = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("WonderBag.Item_amount_(1-9)"));
        } else {
            yamlConfiguration_WB1_Chest.set("WonderBag.Item_amount_(1-9)", DefaultValueChest_1.Item_anz);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6WonderBag Item_amount_(1-9) §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.getInt("WonderBag.Item_amount_(1-9)") > 9) {
            yamlConfiguration_WB1_Chest.set("WonderBag.Item_amount_(1-9)", 9);
        }
        if (yamlConfiguration_WB1_Chest.getInt("WonderBag.Item_amount_(1-9)") < 1) {
            yamlConfiguration_WB1_Chest.set("WonderBag.Item_amount_(1-9)", 1);
        }

        // Items

        if (yamlConfiguration_WB1_Chest.contains("Item1.Item")) {
            DefaultValueChest_1.Item1_Item = (yamlConfiguration_WB1_Chest.getString("Item1.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item1.Item", DefaultValueChest_1.Item1_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item1 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item1.StackSize")) {
            DefaultValueChest_1.Item1_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item1.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item1.StackSize", DefaultValueChest_1.Item1_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item1 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item2.Item")) {
            DefaultValueChest_1.Item2_Item = (yamlConfiguration_WB1_Chest.getString("Item2.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item2.Item", DefaultValueChest_1.Item2_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item2 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item2.StackSize")) {
            DefaultValueChest_1.Item2_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item2.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item2.StackSize", DefaultValueChest_1.Item2_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item2 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item3.Item")) {
            DefaultValueChest_1.Item3_Item = (yamlConfiguration_WB1_Chest.getString("Item3.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item3.Item", DefaultValueChest_1.Item3_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item3 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item3.StackSize")) {
            DefaultValueChest_1.Item3_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item3.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item3.StackSize", DefaultValueChest_1.Item3_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item3 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item4.Item")) {
            DefaultValueChest_1.Item4_Item = (yamlConfiguration_WB1_Chest.getString("Item4.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item4.Item", DefaultValueChest_1.Item4_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item4 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item4.StackSize")) {
            DefaultValueChest_1.Item4_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item4.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item4.StackSize", DefaultValueChest_1.Item4_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item4 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item5.Item")) {
            DefaultValueChest_1.Item5_Item = (yamlConfiguration_WB1_Chest.getString("Item5.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item5.Item", DefaultValueChest_1.Item5_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item5 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item5.StackSize")) {
            DefaultValueChest_1.Item5_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item5.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item5.StackSize", DefaultValueChest_1.Item5_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item5 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item6.Item")) {
            DefaultValueChest_1.Item6_Item = (yamlConfiguration_WB1_Chest.getString("Item6.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item6.Item", DefaultValueChest_1.Item6_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item6 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item6.StackSize")) {
            DefaultValueChest_1.Item6_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item6.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item6.StackSize", DefaultValueChest_1.Item6_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item6 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item7.Item")) {
            DefaultValueChest_1.Item7_Item = (yamlConfiguration_WB1_Chest.getString("Item7.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item7.Item", DefaultValueChest_1.Item7_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item7 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item7.StackSize")) {
            DefaultValueChest_1.Item7_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item7.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item7.StackSize", DefaultValueChest_1.Item7_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item7 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item8.Item")) {
            DefaultValueChest_1.Item8_Item = (yamlConfiguration_WB1_Chest.getString("Item8.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item8.Item", DefaultValueChest_1.Item8_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item8 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item8.StackSize")) {
            DefaultValueChest_1.Item8_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item8.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item8.StackSize", DefaultValueChest_1.Item8_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item8 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item9.Item")) {
            DefaultValueChest_1.Item9_Item = (yamlConfiguration_WB1_Chest.getString("Item9.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item9.Item", DefaultValueChest_1.Item9_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item9 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item9.StackSize")) {
            DefaultValueChest_1.Item9_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item9.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item9.StackSize", DefaultValueChest_1.Item9_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item9 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item10.Item")) {
            DefaultValueChest_1.Item10_Item = (yamlConfiguration_WB1_Chest.getString("Item10.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item10.Item", DefaultValueChest_1.Item10_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item10 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item10.StackSize")) {
            DefaultValueChest_1.Item10_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item10.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item10.StackSize", DefaultValueChest_1.Item10_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item10 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item11.Item")) {
            DefaultValueChest_1.Item11_Item = (yamlConfiguration_WB1_Chest.getString("Item11.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item11.Item", DefaultValueChest_1.Item11_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item11 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item11.StackSize")) {
            DefaultValueChest_1.Item11_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item11.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item11.StackSize", DefaultValueChest_1.Item11_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item11 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item12.Item")) {
            DefaultValueChest_1.Item12_Item = (yamlConfiguration_WB1_Chest.getString("Item12.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item12.Item", DefaultValueChest_1.Item12_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item12 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item12.StackSize")) {
            DefaultValueChest_1.Item12_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item12.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item12.StackSize", DefaultValueChest_1.Item12_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item12 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item13.Item")) {
            DefaultValueChest_1.Item13_Item = (yamlConfiguration_WB1_Chest.getString("Item13.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item13.Item", DefaultValueChest_1.Item13_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item13 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item13.StackSize")) {
            DefaultValueChest_1.Item13_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item13.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item13.StackSize", DefaultValueChest_1.Item13_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item13 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item14.Item")) {
            DefaultValueChest_1.Item14_Item = (yamlConfiguration_WB1_Chest.getString("Item14.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item14.Item", DefaultValueChest_1.Item14_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item14 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item14.StackSize")) {
            DefaultValueChest_1.Item14_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item14.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item14.StackSize", DefaultValueChest_1.Item14_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item14 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item15.Item")) {
            DefaultValueChest_1.Item15_Item = (yamlConfiguration_WB1_Chest.getString("Item15.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item15.Item", DefaultValueChest_1.Item15_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item15 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item15.StackSize")) {
            DefaultValueChest_1.Item15_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item15.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item15.StackSize", DefaultValueChest_1.Item15_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item15 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item16.Item")) {
            DefaultValueChest_1.Item16_Item = (yamlConfiguration_WB1_Chest.getString("Item16.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item16.Item", DefaultValueChest_1.Item16_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item16 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item16.StackSize")) {
            DefaultValueChest_1.Item16_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item16.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item16.StackSize", DefaultValueChest_1.Item16_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item16 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item17.Item")) {
            DefaultValueChest_1.Item17_Item = (yamlConfiguration_WB1_Chest.getString("Item17.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item17.Item", DefaultValueChest_1.Item17_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item17 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item17.StackSize")) {
            DefaultValueChest_1.Item17_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item17.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item17.StackSize", DefaultValueChest_1.Item17_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item17 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item18.Item")) {
            DefaultValueChest_1.Item18_Item = (yamlConfiguration_WB1_Chest.getString("Item18.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item18.Item", DefaultValueChest_1.Item18_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item18 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item18.StackSize")) {
            DefaultValueChest_1.Item18_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item18.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item18.StackSize", DefaultValueChest_1.Item18_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item18 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item19.Item")) {
            DefaultValueChest_1.Item19_Item = (yamlConfiguration_WB1_Chest.getString("Item19.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item19.Item", DefaultValueChest_1.Item19_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item19 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item19.StackSize")) {
            DefaultValueChest_1.Item19_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item19.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item19.StackSize", DefaultValueChest_1.Item19_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item19 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item20.Item")) {
            DefaultValueChest_1.Item20_Item = (yamlConfiguration_WB1_Chest.getString("Item20.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item20.Item", DefaultValueChest_1.Item20_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item20 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item20.StackSize")) {
            DefaultValueChest_1.Item20_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item20.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item20.StackSize", DefaultValueChest_1.Item20_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item20 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item21.Item")) {
            DefaultValueChest_1.Item21_Item = (yamlConfiguration_WB1_Chest.getString("Item21.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item21.Item", DefaultValueChest_1.Item21_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item21 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item21.StackSize")) {
            DefaultValueChest_1.Item21_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item21.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item21.StackSize", DefaultValueChest_1.Item21_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item21 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item22.Item")) {
            DefaultValueChest_1.Item22_Item = (yamlConfiguration_WB1_Chest.getString("Item22.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item22.Item", DefaultValueChest_1.Item22_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item22 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item22.StackSize")) {
            DefaultValueChest_1.Item22_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item22.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item22.StackSize", DefaultValueChest_1.Item22_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item22 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item23.Item")) {
            DefaultValueChest_1.Item23_Item = (yamlConfiguration_WB1_Chest.getString("Item23.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item23.Item", DefaultValueChest_1.Item23_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item23 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item23.StackSize")) {
            DefaultValueChest_1.Item23_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item23.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item23.StackSize", DefaultValueChest_1.Item23_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item23 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item24.Item")) {
            DefaultValueChest_1.Item24_Item = (yamlConfiguration_WB1_Chest.getString("Item24.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item24.Item", DefaultValueChest_1.Item24_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item24 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item24.StackSize")) {
            DefaultValueChest_1.Item24_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item24.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item24.StackSize", DefaultValueChest_1.Item24_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item24 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item25.Item")) {
            DefaultValueChest_1.Item25_Item = (yamlConfiguration_WB1_Chest.getString("Item25.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item25.Item", DefaultValueChest_1.Item25_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item25 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item25.StackSize")) {
            DefaultValueChest_1.Item25_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item25.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item25.StackSize", DefaultValueChest_1.Item25_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item25 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item26.Item")) {
            DefaultValueChest_1.Item26_Item = (yamlConfiguration_WB1_Chest.getString("Item26.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item26.Item", DefaultValueChest_1.Item26_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item26 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item26.StackSize")) {
            DefaultValueChest_1.Item26_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item26.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item26.StackSize", DefaultValueChest_1.Item26_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item26 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item27.Item")) {
            DefaultValueChest_1.Item27_Item = (yamlConfiguration_WB1_Chest.getString("Item27.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item27.Item", DefaultValueChest_1.Item27_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item27 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item27.StackSize")) {
            DefaultValueChest_1.Item27_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item27.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item27.StackSize", DefaultValueChest_1.Item27_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item27 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item28.Item")) {
            DefaultValueChest_1.Item28_Item = (yamlConfiguration_WB1_Chest.getString("Item28.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item28.Item", DefaultValueChest_1.Item28_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item28 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item28.StackSize")) {
            DefaultValueChest_1.Item28_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item28.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item28.StackSize", DefaultValueChest_1.Item28_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item28 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item29.Item")) {
            DefaultValueChest_1.Item29_Item = (yamlConfiguration_WB1_Chest.getString("Item29.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item29.Item", DefaultValueChest_1.Item29_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item29 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item29.StackSize")) {
            DefaultValueChest_1.Item29_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item29.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item29.StackSize", DefaultValueChest_1.Item29_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item29 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item30.Item")) {
            DefaultValueChest_1.Item30_Item = (yamlConfiguration_WB1_Chest.getString("Item30.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item30.Item", DefaultValueChest_1.Item30_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item30 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item30.StackSize")) {
            DefaultValueChest_1.Item30_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item30.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item30.StackSize", DefaultValueChest_1.Item30_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item30 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item31.Item")) {
            DefaultValueChest_1.Item31_Item = (yamlConfiguration_WB1_Chest.getString("Item31.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item31.Item", DefaultValueChest_1.Item31_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item31 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item31.StackSize")) {
            DefaultValueChest_1.Item31_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item31.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item31.StackSize", DefaultValueChest_1.Item31_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item31 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item32.Item")) {
            DefaultValueChest_1.Item32_Item = (yamlConfiguration_WB1_Chest.getString("Item32.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item32.Item", DefaultValueChest_1.Item32_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item32 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item32.StackSize")) {
            DefaultValueChest_1.Item32_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item32.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item32.StackSize", DefaultValueChest_1.Item32_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item32 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item33.Item")) {
            DefaultValueChest_1.Item33_Item = (yamlConfiguration_WB1_Chest.getString("Item33.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item33.Item", DefaultValueChest_1.Item33_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item33 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item33.StackSize")) {
            DefaultValueChest_1.Item33_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item33.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item33.StackSize", DefaultValueChest_1.Item33_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item33 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item34.Item")) {
            DefaultValueChest_1.Item34_Item = (yamlConfiguration_WB1_Chest.getString("Item34.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item34.Item", DefaultValueChest_1.Item34_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item34 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item34.StackSize")) {
            DefaultValueChest_1.Item34_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item34.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item34.StackSize", DefaultValueChest_1.Item34_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item34 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item35.Item")) {
            DefaultValueChest_1.Item35_Item = (yamlConfiguration_WB1_Chest.getString("Item35.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item35.Item", DefaultValueChest_1.Item35_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item35 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item35.StackSize")) {
            DefaultValueChest_1.Item35_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item35.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item35.StackSize", DefaultValueChest_1.Item35_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item35 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item36.Item")) {
            DefaultValueChest_1.Item36_Item = (yamlConfiguration_WB1_Chest.getString("Item36.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item36.Item", DefaultValueChest_1.Item36_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item36 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item36.StackSize")) {
            DefaultValueChest_1.Item36_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item36.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item36.StackSize", DefaultValueChest_1.Item36_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item36 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item37.Item")) {
            DefaultValueChest_1.Item37_Item = (yamlConfiguration_WB1_Chest.getString("Item37.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item37.Item", DefaultValueChest_1.Item37_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item37 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item37.StackSize")) {
            DefaultValueChest_1.Item37_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item37.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item37.StackSize", DefaultValueChest_1.Item37_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item37 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item38.Item")) {
            DefaultValueChest_1.Item38_Item = (yamlConfiguration_WB1_Chest.getString("Item38.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item38.Item", DefaultValueChest_1.Item38_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item38 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item38.StackSize")) {
            DefaultValueChest_1.Item38_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item38.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item38.StackSize", DefaultValueChest_1.Item38_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item38 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item39.Item")) {
            DefaultValueChest_1.Item39_Item = (yamlConfiguration_WB1_Chest.getString("Item39.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item39.Item", DefaultValueChest_1.Item39_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item39 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item39.StackSize")) {
            DefaultValueChest_1.Item39_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item39.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item39.StackSize", DefaultValueChest_1.Item39_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item39 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item40.Item")) {
            DefaultValueChest_1.Item40_Item = (yamlConfiguration_WB1_Chest.getString("Item40.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item40.Item", DefaultValueChest_1.Item40_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item40 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item40.StackSize")) {
            DefaultValueChest_1.Item40_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item40.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item40.StackSize", DefaultValueChest_1.Item40_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item40 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item41.Item")) {
            DefaultValueChest_1.Item41_Item = (yamlConfiguration_WB1_Chest.getString("Item41.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item41.Item", DefaultValueChest_1.Item41_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item41 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item41.StackSize")) {
            DefaultValueChest_1.Item41_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item41.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item41.StackSize", DefaultValueChest_1.Item1_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item41 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item42.Item")) {
            DefaultValueChest_1.Item42_Item = (yamlConfiguration_WB1_Chest.getString("Item42.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item42.Item", DefaultValueChest_1.Item42_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item42 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item42.StackSize")) {
            DefaultValueChest_1.Item42_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item42.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item42.StackSize", DefaultValueChest_1.Item42_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item42 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item43.Item")) {
            DefaultValueChest_1.Item43_Item = (yamlConfiguration_WB1_Chest.getString("Item43.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item43.Item", DefaultValueChest_1.Item43_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item43 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item43.StackSize")) {
            DefaultValueChest_1.Item43_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item43.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item43.StackSize", DefaultValueChest_1.Item43_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item43 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item44.Item")) {
            DefaultValueChest_1.Item44_Item = (yamlConfiguration_WB1_Chest.getString("Item44.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item44.Item", DefaultValueChest_1.Item44_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item44 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item44.StackSize")) {
            DefaultValueChest_1.Item44_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item44.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item44.StackSize", DefaultValueChest_1.Item44_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item44 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item45.Item")) {
            DefaultValueChest_1.Item45_Item = (yamlConfiguration_WB1_Chest.getString("Item45.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item45.Item", DefaultValueChest_1.Item45_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item45 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item45.StackSize")) {
            DefaultValueChest_1.Item45_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item45.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item45.StackSize", DefaultValueChest_1.Item45_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item45 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item46.Item")) {
            DefaultValueChest_1.Item46_Item = (yamlConfiguration_WB1_Chest.getString("Item46.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item46.Item", DefaultValueChest_1.Item46_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item46 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item46.StackSize")) {
            DefaultValueChest_1.Item46_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item46.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item46.StackSize", DefaultValueChest_1.Item46_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item46 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item47.Item")) {
            DefaultValueChest_1.Item47_Item = (yamlConfiguration_WB1_Chest.getString("Item47.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item47.Item", DefaultValueChest_1.Item47_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item47 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item47.StackSize")) {
            DefaultValueChest_1.Item7_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item47.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item47.StackSize", DefaultValueChest_1.Item47_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item47 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item48.Item")) {
            DefaultValueChest_1.Item48_Item = (yamlConfiguration_WB1_Chest.getString("Item48.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item48.Item", DefaultValueChest_1.Item48_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item48 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item48.StackSize")) {
            DefaultValueChest_1.Item48_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item48.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item48.StackSize", DefaultValueChest_1.Item48_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item48 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item49.Item")) {
            DefaultValueChest_1.Item49_Item = (yamlConfiguration_WB1_Chest.getString("Item49.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item49.Item", DefaultValueChest_1.Item49_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item49 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item49.StackSize")) {
            DefaultValueChest_1.Item49_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item49.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item49.StackSize", DefaultValueChest_1.Item49_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item49 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item50.Item")) {
            DefaultValueChest_1.Item50_Item = (yamlConfiguration_WB1_Chest.getString("Item50.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item50.Item", DefaultValueChest_1.Item50_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item50 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item50.StackSize")) {
            DefaultValueChest_1.Item50_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item50.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item50.StackSize", DefaultValueChest_1.Item50_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item50 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item51.Item")) {
            DefaultValueChest_1.Item51_Item = (yamlConfiguration_WB1_Chest.getString("Item51.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item51.Item", DefaultValueChest_1.Item51_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item51 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item51.StackSize")) {
            DefaultValueChest_1.Item51_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item51.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item51.StackSize", DefaultValueChest_1.Item51_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item51 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item52.Item")) {
            DefaultValueChest_1.Item52_Item = (yamlConfiguration_WB1_Chest.getString("Item52.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item52.Item", DefaultValueChest_1.Item52_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item52 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item52.StackSize")) {
            DefaultValueChest_1.Item52_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item52.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item52.StackSize", DefaultValueChest_1.Item52_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item52 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item53.Item")) {
            DefaultValueChest_1.Item53_Item = (yamlConfiguration_WB1_Chest.getString("Item53.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item53.Item", DefaultValueChest_1.Item53_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item53 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item53.StackSize")) {
            DefaultValueChest_1.Item53_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item53.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item53.StackSize", DefaultValueChest_1.Item53_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item53 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item54.Item")) {
            DefaultValueChest_1.Item54_Item = (yamlConfiguration_WB1_Chest.getString("Item54.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item54.Item", DefaultValueChest_1.Item54_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item54 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item54.StackSize")) {
            DefaultValueChest_1.Item54_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item54.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item54.StackSize", DefaultValueChest_1.Item54_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item54 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item55.Item")) {
            DefaultValueChest_1.Item55_Item = (yamlConfiguration_WB1_Chest.getString("Item55.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item55.Item", DefaultValueChest_1.Item55_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item55 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item55.StackSize")) {
            DefaultValueChest_1.Item55_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item55.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item55.StackSize", DefaultValueChest_1.Item55_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item55 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item56.Item")) {
            DefaultValueChest_1.Item56_Item = (yamlConfiguration_WB1_Chest.getString("Item56.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item56.Item", DefaultValueChest_1.Item56_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item56 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item56.StackSize")) {
            DefaultValueChest_1.Item56_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item56.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item56.StackSize", DefaultValueChest_1.Item56_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item56 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item57.Item")) {
            DefaultValueChest_1.Item57_Item = (yamlConfiguration_WB1_Chest.getString("Item57.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item57.Item", DefaultValueChest_1.Item57_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item57 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item57.StackSize")) {
            DefaultValueChest_1.Item57_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item57.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item57.StackSize", DefaultValueChest_1.Item57_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item57 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item58.Item")) {
            DefaultValueChest_1.Item58_Item = (yamlConfiguration_WB1_Chest.getString("Item58.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item58.Item", DefaultValueChest_1.Item58_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item58 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item58.StackSize")) {
            DefaultValueChest_1.Item58_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item58.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item58.StackSize", DefaultValueChest_1.Item58_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item58 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item59.Item")) {
            DefaultValueChest_1.Item59_Item = (yamlConfiguration_WB1_Chest.getString("Item59.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item59.Item", DefaultValueChest_1.Item59_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item59 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item59.StackSize")) {
            DefaultValueChest_1.Item9_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item59.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item59.StackSize", DefaultValueChest_1.Item59_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item59 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item60.Item")) {
            DefaultValueChest_1.Item60_Item = (yamlConfiguration_WB1_Chest.getString("Item60.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item60.Item", DefaultValueChest_1.Item60_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item60 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item60.StackSize")) {
            DefaultValueChest_1.Item60_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item60.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item60.StackSize", DefaultValueChest_1.Item60_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item60 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item61.Item")) {
            DefaultValueChest_1.Item61_Item = (yamlConfiguration_WB1_Chest.getString("Item61.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item61.Item", DefaultValueChest_1.Item61_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item61 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item61.StackSize")) {
            DefaultValueChest_1.Item61_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item61.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item61.StackSize", DefaultValueChest_1.Item61_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item61 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item62.Item")) {
            DefaultValueChest_1.Item62_Item = (yamlConfiguration_WB1_Chest.getString("Item62.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item62.Item", DefaultValueChest_1.Item62_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item62 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item62.StackSize")) {
            DefaultValueChest_1.Item62_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item62.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item62.StackSize", DefaultValueChest_1.Item62_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item62 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item63.Item")) {
            DefaultValueChest_1.Item63_Item = (yamlConfiguration_WB1_Chest.getString("Item63.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item63.Item", DefaultValueChest_1.Item63_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item63 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item63.StackSize")) {
            DefaultValueChest_1.Item63_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item63.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item63.StackSize", DefaultValueChest_1.Item63_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item63 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item64.Item")) {
            DefaultValueChest_1.Item64_Item = (yamlConfiguration_WB1_Chest.getString("Item64.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item64.Item", DefaultValueChest_1.Item64_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item64 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item64.StackSize")) {
            DefaultValueChest_1.Item64_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item64.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item64.StackSize", DefaultValueChest_1.Item64_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item64 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item65.Item")) {
            DefaultValueChest_1.Item65_Item = (yamlConfiguration_WB1_Chest.getString("Item65.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item65.Item", DefaultValueChest_1.Item65_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item65 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item65.StackSize")) {
            DefaultValueChest_1.Item65_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item65.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item65.StackSize", DefaultValueChest_1.Item65_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item65 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item66.Item")) {
            DefaultValueChest_1.Item66_Item = (yamlConfiguration_WB1_Chest.getString("Item66.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item66.Item", DefaultValueChest_1.Item66_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item66 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item66.StackSize")) {
            DefaultValueChest_1.Item66_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item66.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item66.StackSize", DefaultValueChest_1.Item66_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item66 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item67.Item")) {
            DefaultValueChest_1.Item67_Item = (yamlConfiguration_WB1_Chest.getString("Item67.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item67.Item", DefaultValueChest_1.Item67_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item67 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item67.StackSize")) {
            DefaultValueChest_1.Item67_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item67.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item67.StackSize", DefaultValueChest_1.Item67_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item67 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item68.Item")) {
            DefaultValueChest_1.Item68_Item = (yamlConfiguration_WB1_Chest.getString("Item68.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item68.Item", DefaultValueChest_1.Item8_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item68 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item68.StackSize")) {
            DefaultValueChest_1.Item68_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item68.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item68.StackSize", DefaultValueChest_1.Item68_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item68 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item69.Item")) {
            DefaultValueChest_1.Item69_Item = (yamlConfiguration_WB1_Chest.getString("Item69.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item69.Item", DefaultValueChest_1.Item69_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item69 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item69.StackSize")) {
            DefaultValueChest_1.Item69_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item69.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item69.StackSize", DefaultValueChest_1.Item69_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item69 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        if (yamlConfiguration_WB1_Chest.contains("Item70.Item")) {
            DefaultValueChest_1.Item70_Item = (yamlConfiguration_WB1_Chest.getString("Item70.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item70.Item", DefaultValueChest_1.Item70_Item);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item70 Item §4was added to §9WonderBag Chest small.yml§4!");
        }
        if (yamlConfiguration_WB1_Chest.contains("Item70.StackSize")) {
            DefaultValueChest_1.Item70_StackSize = Integer.valueOf(yamlConfiguration_WB1_Chest.getString("Item70.StackSize"));
        } else {
            yamlConfiguration_WB1_Chest.set("Item70.StackSize", DefaultValueChest_1.Item70_StackSize);
            if (WB1ChestYML.isFile()) Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4Setting §6Item70 StackSize §4was added to §9WonderBag Chest small.yml§4!");
        }

        try {
            yamlConfiguration_WB1_Chest.save(WB1ChestYML);
        } catch (IOException e) {
            e.printStackTrace();
        }


        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2WonderBag Chest small.yml loaded successfully." + " §7- §e" + (System.currentTimeMillis() - long_.longValue()) + "ms");

    }

    public static void WB1ChestDisable() {
        Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4WonderBag Chest small.yml successfully deactivated.");
    }

    private static String replace(String Text) {

        File WB1YML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Chest/" + "small.yml");
        YamlConfiguration yamlConfiguration_WB1_Chest = YamlConfiguration.loadConfiguration(WB1YML);

        return Text.replace("[prefix]", DefaultValue.Prefix).replace("&", "§").replace("[currency]", DefaultValue.Currency)
                .replace("[ue]", "ü").replace("[UE]", "Ü").replace("[oe]", "Ö").replace("[OE]", "Ö")
                .replace("[ae]", "ä").replace("[AE]", "Ä").replace("[WB1Name]", DefaultValueChest_1.Name)
                .replace("[WB1Price]", String.valueOf(yamlConfiguration_WB1_Chest.get("Shop.price")));
    }
}