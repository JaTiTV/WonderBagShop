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
import de.jatitv.wonderbagshop.defultValue.DefultValueChest_2;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class WonderBagChest_2 {

    public static void WB2ChestCreate() throws InterruptedException {


        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag Chest medium.yml load...");

        File WB2ChestYML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Chest/" + "medium.yml");
        YamlConfiguration yamlConfiguration_WB2_Chest = YamlConfiguration.loadConfiguration(WB2ChestYML);


        if (!yamlConfiguration_WB2_Chest.contains("Do_not_remove_or_change.Created")) {
            yamlConfiguration_WB2_Chest.set("Do_not_remove_or_change.Created", "This file was created with version " + Main.getPlugin().getDescription().getVersion());
        }

        yamlConfiguration_WB2_Chest.set("Do_not_remove_or_change.Version", Main.getPlugin().getDescription().getVersion());

        yamlConfiguration_WB2_Chest.set("Do_not_remove_or_change.Autor", Main.Autor);

        yamlConfiguration_WB2_Chest.set("Do_not_remove_or_change.Spigot", Main.Spigot);

        yamlConfiguration_WB2_Chest.set("Do_not_remove_or_change.Discord", Main.Discord);


        // Shop

        if (yamlConfiguration_WB2_Chest.contains("Shop.Name")) {
            DefultValueChest_2.Name = replace(yamlConfiguration_WB2_Chest.getString("Shop.Name"));
        } else {
            yamlConfiguration_WB2_Chest.set("Shop.Name", "&2Wonder&6Bag&7: &9medium");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Shop Name §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Shop.price")) {
            DefultValueChest_2.price = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Shop.price"));
        } else {
            yamlConfiguration_WB2_Chest.set("Shop.price", DefultValueChest_2.price);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Shop price §4was added to §9WonderBag Chest medium.yml§4!");
        }

        // WonderBag

        if (yamlConfiguration_WB2_Chest.contains("WonderBag.DisplayName")) {
            DefultValueChest_2.DisplayName = replace(yamlConfiguration_WB2_Chest.getString("WonderBag.DisplayName"));
        } else {
            yamlConfiguration_WB2_Chest.set("WonderBag.DisplayName", "&2Wonder&6Bag &9medium");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6WonderBag DisplayName §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("WonderBag.Item_amount_(1-9)")) {
            DefultValueChest_2.Item_anz = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("WonderBag.Item_amount_(1-9)"));
        } else {
            yamlConfiguration_WB2_Chest.set("WonderBag.Item_amount_(1-9)", DefultValueChest_2.Item_anz);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6WonderBag Item_amount_(1-9) §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.getInt("WonderBag.Item_amount_(1-9)") > 9) {
            yamlConfiguration_WB2_Chest.set("WonderBag.Item_amount_(1-9)", 9);
        }

        // Items

        if (yamlConfiguration_WB2_Chest.contains("Item1.Item")) {
            DefultValueChest_2.Item1_Item = (yamlConfiguration_WB2_Chest.getString("Item1.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item1.Item", DefultValueChest_2.Item1_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item1 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item1.StackSize")) {
            DefultValueChest_2.Item1_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item1.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item1.StackSize", DefultValueChest_2.Item1_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item1 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item2.Item")) {
            DefultValueChest_2.Item2_Item = (yamlConfiguration_WB2_Chest.getString("Item2.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item2.Item", DefultValueChest_2.Item2_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item2 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item2.StackSize")) {
            DefultValueChest_2.Item2_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item2.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item2.StackSize", DefultValueChest_2.Item2_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item2 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item3.Item")) {
            DefultValueChest_2.Item3_Item = (yamlConfiguration_WB2_Chest.getString("Item3.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item3.Item", DefultValueChest_2.Item3_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item3 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item3.StackSize")) {
            DefultValueChest_2.Item3_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item3.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item3.StackSize", DefultValueChest_2.Item3_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item3 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item4.Item")) {
            DefultValueChest_2.Item4_Item = (yamlConfiguration_WB2_Chest.getString("Item4.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item4.Item", DefultValueChest_2.Item4_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item4 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item4.StackSize")) {
            DefultValueChest_2.Item4_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item4.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item4.StackSize", DefultValueChest_2.Item4_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item4 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item5.Item")) {
            DefultValueChest_2.Item5_Item = (yamlConfiguration_WB2_Chest.getString("Item5.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item5.Item", DefultValueChest_2.Item5_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item5 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item5.StackSize")) {
            DefultValueChest_2.Item5_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item5.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item5.StackSize", DefultValueChest_2.Item5_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item5 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item6.Item")) {
            DefultValueChest_2.Item6_Item = (yamlConfiguration_WB2_Chest.getString("Item6.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item6.Item", DefultValueChest_2.Item6_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item6 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item6.StackSize")) {
            DefultValueChest_2.Item6_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item6.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item6.StackSize", DefultValueChest_2.Item6_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item6 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item7.Item")) {
            DefultValueChest_2.Item7_Item = (yamlConfiguration_WB2_Chest.getString("Item7.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item7.Item", DefultValueChest_2.Item7_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item7 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item7.StackSize")) {
            DefultValueChest_2.Item7_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item7.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item7.StackSize", DefultValueChest_2.Item7_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item7 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item8.Item")) {
            DefultValueChest_2.Item8_Item = (yamlConfiguration_WB2_Chest.getString("Item8.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item8.Item", DefultValueChest_2.Item8_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item8 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item8.StackSize")) {
            DefultValueChest_2.Item8_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item8.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item8.StackSize", DefultValueChest_2.Item8_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item8 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item9.Item")) {
            DefultValueChest_2.Item9_Item = (yamlConfiguration_WB2_Chest.getString("Item9.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item9.Item", DefultValueChest_2.Item9_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item9 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item9.StackSize")) {
            DefultValueChest_2.Item9_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item9.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item9.StackSize", DefultValueChest_2.Item9_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item9 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item10.Item")) {
            DefultValueChest_2.Item10_Item = (yamlConfiguration_WB2_Chest.getString("Item10.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item10.Item", DefultValueChest_2.Item10_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item10 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item10.StackSize")) {
            DefultValueChest_2.Item10_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item10.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item10.StackSize", DefultValueChest_2.Item10_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item10 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item11.Item")) {
            DefultValueChest_2.Item11_Item = (yamlConfiguration_WB2_Chest.getString("Item11.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item11.Item", DefultValueChest_2.Item11_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item11 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item11.StackSize")) {
            DefultValueChest_2.Item11_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item11.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item11.StackSize", DefultValueChest_2.Item11_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item11 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item12.Item")) {
            DefultValueChest_2.Item12_Item = (yamlConfiguration_WB2_Chest.getString("Item12.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item12.Item", DefultValueChest_2.Item12_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item12 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item12.StackSize")) {
            DefultValueChest_2.Item12_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item12.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item12.StackSize", DefultValueChest_2.Item12_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item12 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item13.Item")) {
            DefultValueChest_2.Item13_Item = (yamlConfiguration_WB2_Chest.getString("Item13.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item13.Item", DefultValueChest_2.Item13_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item13 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item13.StackSize")) {
            DefultValueChest_2.Item13_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item13.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item13.StackSize", DefultValueChest_2.Item13_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item13 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item14.Item")) {
            DefultValueChest_2.Item14_Item = (yamlConfiguration_WB2_Chest.getString("Item14.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item14.Item", DefultValueChest_2.Item14_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item14 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item14.StackSize")) {
            DefultValueChest_2.Item14_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item14.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item14.StackSize", DefultValueChest_2.Item14_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item14 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item15.Item")) {
            DefultValueChest_2.Item15_Item = (yamlConfiguration_WB2_Chest.getString("Item15.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item15.Item", DefultValueChest_2.Item15_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item15 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item15.StackSize")) {
            DefultValueChest_2.Item15_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item15.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item15.StackSize", DefultValueChest_2.Item15_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item15 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item16.Item")) {
            DefultValueChest_2.Item16_Item = (yamlConfiguration_WB2_Chest.getString("Item16.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item16.Item", DefultValueChest_2.Item16_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item16 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item16.StackSize")) {
            DefultValueChest_2.Item16_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item16.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item16.StackSize", DefultValueChest_2.Item16_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item16 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item17.Item")) {
            DefultValueChest_2.Item17_Item = (yamlConfiguration_WB2_Chest.getString("Item17.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item17.Item", DefultValueChest_2.Item17_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item17 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item17.StackSize")) {
            DefultValueChest_2.Item17_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item17.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item17.StackSize", DefultValueChest_2.Item17_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item17 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item18.Item")) {
            DefultValueChest_2.Item18_Item = (yamlConfiguration_WB2_Chest.getString("Item18.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item18.Item", DefultValueChest_2.Item18_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item18 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item18.StackSize")) {
            DefultValueChest_2.Item18_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item18.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item18.StackSize", DefultValueChest_2.Item18_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item18 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item19.Item")) {
            DefultValueChest_2.Item19_Item = (yamlConfiguration_WB2_Chest.getString("Item19.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item19.Item", DefultValueChest_2.Item19_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item19 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item19.StackSize")) {
            DefultValueChest_2.Item19_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item19.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item19.StackSize", DefultValueChest_2.Item19_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item19 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item20.Item")) {
            DefultValueChest_2.Item20_Item = (yamlConfiguration_WB2_Chest.getString("Item20.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item20.Item", DefultValueChest_2.Item20_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item20 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item20.StackSize")) {
            DefultValueChest_2.Item20_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item20.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item20.StackSize", DefultValueChest_2.Item20_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item20 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item21.Item")) {
            DefultValueChest_2.Item21_Item = (yamlConfiguration_WB2_Chest.getString("Item21.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item21.Item", DefultValueChest_2.Item21_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item21 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item21.StackSize")) {
            DefultValueChest_2.Item21_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item21.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item21.StackSize", DefultValueChest_2.Item21_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item21 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item22.Item")) {
            DefultValueChest_2.Item22_Item = (yamlConfiguration_WB2_Chest.getString("Item22.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item22.Item", DefultValueChest_2.Item22_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item22 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item22.StackSize")) {
            DefultValueChest_2.Item22_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item22.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item22.StackSize", DefultValueChest_2.Item22_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item22 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item23.Item")) {
            DefultValueChest_2.Item23_Item = (yamlConfiguration_WB2_Chest.getString("Item23.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item23.Item", DefultValueChest_2.Item23_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item23 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item23.StackSize")) {
            DefultValueChest_2.Item23_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item23.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item23.StackSize", DefultValueChest_2.Item23_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item23 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item24.Item")) {
            DefultValueChest_2.Item24_Item = (yamlConfiguration_WB2_Chest.getString("Item24.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item24.Item", DefultValueChest_2.Item24_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item24 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item24.StackSize")) {
            DefultValueChest_2.Item24_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item24.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item24.StackSize", DefultValueChest_2.Item24_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item24 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item25.Item")) {
            DefultValueChest_2.Item25_Item = (yamlConfiguration_WB2_Chest.getString("Item25.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item25.Item", DefultValueChest_2.Item25_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item25 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item25.StackSize")) {
            DefultValueChest_2.Item25_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item25.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item25.StackSize", DefultValueChest_2.Item25_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item25 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item26.Item")) {
            DefultValueChest_2.Item26_Item = (yamlConfiguration_WB2_Chest.getString("Item26.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item26.Item", DefultValueChest_2.Item26_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item26 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item26.StackSize")) {
            DefultValueChest_2.Item26_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item26.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item26.StackSize", DefultValueChest_2.Item26_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item26 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item27.Item")) {
            DefultValueChest_2.Item27_Item = (yamlConfiguration_WB2_Chest.getString("Item27.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item27.Item", DefultValueChest_2.Item27_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item27 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item27.StackSize")) {
            DefultValueChest_2.Item27_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item27.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item27.StackSize", DefultValueChest_2.Item27_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item27 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item28.Item")) {
            DefultValueChest_2.Item28_Item = (yamlConfiguration_WB2_Chest.getString("Item28.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item28.Item", DefultValueChest_2.Item28_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item28 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item28.StackSize")) {
            DefultValueChest_2.Item28_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item28.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item28.StackSize", DefultValueChest_2.Item28_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item28 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item29.Item")) {
            DefultValueChest_2.Item29_Item = (yamlConfiguration_WB2_Chest.getString("Item29.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item29.Item", DefultValueChest_2.Item29_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item29 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item29.StackSize")) {
            DefultValueChest_2.Item29_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item29.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item29.StackSize", DefultValueChest_2.Item29_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item29 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item30.Item")) {
            DefultValueChest_2.Item30_Item = (yamlConfiguration_WB2_Chest.getString("Item30.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item30.Item", DefultValueChest_2.Item30_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item30 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item30.StackSize")) {
            DefultValueChest_2.Item30_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item30.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item30.StackSize", DefultValueChest_2.Item30_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item30 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item31.Item")) {
            DefultValueChest_2.Item31_Item = (yamlConfiguration_WB2_Chest.getString("Item31.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item31.Item", DefultValueChest_2.Item31_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item31 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item31.StackSize")) {
            DefultValueChest_2.Item31_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item31.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item31.StackSize", DefultValueChest_2.Item31_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item31 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item32.Item")) {
            DefultValueChest_2.Item32_Item = (yamlConfiguration_WB2_Chest.getString("Item32.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item32.Item", DefultValueChest_2.Item32_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item32 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item32.StackSize")) {
            DefultValueChest_2.Item32_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item32.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item32.StackSize", DefultValueChest_2.Item32_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item32 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item33.Item")) {
            DefultValueChest_2.Item33_Item = (yamlConfiguration_WB2_Chest.getString("Item33.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item33.Item", DefultValueChest_2.Item33_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item33 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item33.StackSize")) {
            DefultValueChest_2.Item33_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item33.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item33.StackSize", DefultValueChest_2.Item33_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item33 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item34.Item")) {
            DefultValueChest_2.Item34_Item = (yamlConfiguration_WB2_Chest.getString("Item34.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item34.Item", DefultValueChest_2.Item34_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item34 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item34.StackSize")) {
            DefultValueChest_2.Item34_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item34.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item34.StackSize", DefultValueChest_2.Item34_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item34 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item35.Item")) {
            DefultValueChest_2.Item35_Item = (yamlConfiguration_WB2_Chest.getString("Item35.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item35.Item", DefultValueChest_2.Item35_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item35 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item35.StackSize")) {
            DefultValueChest_2.Item35_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item35.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item35.StackSize", DefultValueChest_2.Item35_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item35 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item36.Item")) {
            DefultValueChest_2.Item36_Item = (yamlConfiguration_WB2_Chest.getString("Item36.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item36.Item", DefultValueChest_2.Item36_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item36 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item36.StackSize")) {
            DefultValueChest_2.Item36_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item36.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item36.StackSize", DefultValueChest_2.Item36_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item36 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item37.Item")) {
            DefultValueChest_2.Item37_Item = (yamlConfiguration_WB2_Chest.getString("Item37.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item37.Item", DefultValueChest_2.Item37_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item37 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item37.StackSize")) {
            DefultValueChest_2.Item37_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item37.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item37.StackSize", DefultValueChest_2.Item37_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item37 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item38.Item")) {
            DefultValueChest_2.Item38_Item = (yamlConfiguration_WB2_Chest.getString("Item38.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item38.Item", DefultValueChest_2.Item38_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item38 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item38.StackSize")) {
            DefultValueChest_2.Item38_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item38.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item38.StackSize", DefultValueChest_2.Item38_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item38 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item39.Item")) {
            DefultValueChest_2.Item39_Item = (yamlConfiguration_WB2_Chest.getString("Item39.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item39.Item", DefultValueChest_2.Item39_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item39 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item39.StackSize")) {
            DefultValueChest_2.Item39_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item39.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item39.StackSize", DefultValueChest_2.Item39_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item39 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item40.Item")) {
            DefultValueChest_2.Item40_Item = (yamlConfiguration_WB2_Chest.getString("Item40.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item40.Item", DefultValueChest_2.Item40_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item40 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item40.StackSize")) {
            DefultValueChest_2.Item40_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item40.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item40.StackSize", DefultValueChest_2.Item40_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item40 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item41.Item")) {
            DefultValueChest_2.Item41_Item = (yamlConfiguration_WB2_Chest.getString("Item41.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item41.Item", DefultValueChest_2.Item41_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item41 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item41.StackSize")) {
            DefultValueChest_2.Item41_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item41.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item41.StackSize", DefultValueChest_2.Item1_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item41 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item42.Item")) {
            DefultValueChest_2.Item42_Item = (yamlConfiguration_WB2_Chest.getString("Item42.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item42.Item", DefultValueChest_2.Item42_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item42 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item42.StackSize")) {
            DefultValueChest_2.Item42_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item42.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item42.StackSize", DefultValueChest_2.Item42_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item42 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item43.Item")) {
            DefultValueChest_2.Item43_Item = (yamlConfiguration_WB2_Chest.getString("Item43.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item43.Item", DefultValueChest_2.Item43_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item43 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item43.StackSize")) {
            DefultValueChest_2.Item43_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item43.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item43.StackSize", DefultValueChest_2.Item43_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item43 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item44.Item")) {
            DefultValueChest_2.Item44_Item = (yamlConfiguration_WB2_Chest.getString("Item44.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item44.Item", DefultValueChest_2.Item44_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item44 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item44.StackSize")) {
            DefultValueChest_2.Item44_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item44.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item44.StackSize", DefultValueChest_2.Item44_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item44 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item45.Item")) {
            DefultValueChest_2.Item45_Item = (yamlConfiguration_WB2_Chest.getString("Item45.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item45.Item", DefultValueChest_2.Item45_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item45 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item45.StackSize")) {
            DefultValueChest_2.Item45_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item45.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item45.StackSize", DefultValueChest_2.Item45_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item45 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item46.Item")) {
            DefultValueChest_2.Item46_Item = (yamlConfiguration_WB2_Chest.getString("Item46.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item46.Item", DefultValueChest_2.Item46_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item46 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item46.StackSize")) {
            DefultValueChest_2.Item46_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item46.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item46.StackSize", DefultValueChest_2.Item46_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item46 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item47.Item")) {
            DefultValueChest_2.Item47_Item = (yamlConfiguration_WB2_Chest.getString("Item47.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item47.Item", DefultValueChest_2.Item47_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item47 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item47.StackSize")) {
            DefultValueChest_2.Item7_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item47.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item47.StackSize", DefultValueChest_2.Item47_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item47 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item48.Item")) {
            DefultValueChest_2.Item48_Item = (yamlConfiguration_WB2_Chest.getString("Item48.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item48.Item", DefultValueChest_2.Item48_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item48 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item48.StackSize")) {
            DefultValueChest_2.Item48_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item48.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item48.StackSize", DefultValueChest_2.Item48_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item48 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item49.Item")) {
            DefultValueChest_2.Item49_Item = (yamlConfiguration_WB2_Chest.getString("Item49.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item49.Item", DefultValueChest_2.Item49_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item49 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item49.StackSize")) {
            DefultValueChest_2.Item49_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item49.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item49.StackSize", DefultValueChest_2.Item49_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item49 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item50.Item")) {
            DefultValueChest_2.Item50_Item = (yamlConfiguration_WB2_Chest.getString("Item50.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item50.Item", DefultValueChest_2.Item50_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item50 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item50.StackSize")) {
            DefultValueChest_2.Item50_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item50.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item50.StackSize", DefultValueChest_2.Item50_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item50 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item51.Item")) {
            DefultValueChest_2.Item51_Item = (yamlConfiguration_WB2_Chest.getString("Item51.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item51.Item", DefultValueChest_2.Item51_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item51 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item51.StackSize")) {
            DefultValueChest_2.Item51_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item51.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item51.StackSize", DefultValueChest_2.Item51_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item51 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item52.Item")) {
            DefultValueChest_2.Item52_Item = (yamlConfiguration_WB2_Chest.getString("Item52.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item52.Item", DefultValueChest_2.Item52_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item52 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item52.StackSize")) {
            DefultValueChest_2.Item52_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item52.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item52.StackSize", DefultValueChest_2.Item52_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item52 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item53.Item")) {
            DefultValueChest_2.Item53_Item = (yamlConfiguration_WB2_Chest.getString("Item53.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item53.Item", DefultValueChest_2.Item53_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item53 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item53.StackSize")) {
            DefultValueChest_2.Item53_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item53.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item53.StackSize", DefultValueChest_2.Item53_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item53 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item54.Item")) {
            DefultValueChest_2.Item54_Item = (yamlConfiguration_WB2_Chest.getString("Item54.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item54.Item", DefultValueChest_2.Item54_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item54 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item54.StackSize")) {
            DefultValueChest_2.Item54_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item54.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item54.StackSize", DefultValueChest_2.Item54_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item54 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item55.Item")) {
            DefultValueChest_2.Item55_Item = (yamlConfiguration_WB2_Chest.getString("Item55.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item55.Item", DefultValueChest_2.Item55_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item55 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item55.StackSize")) {
            DefultValueChest_2.Item55_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item55.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item55.StackSize", DefultValueChest_2.Item55_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item55 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item56.Item")) {
            DefultValueChest_2.Item56_Item = (yamlConfiguration_WB2_Chest.getString("Item56.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item56.Item", DefultValueChest_2.Item56_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item56 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item56.StackSize")) {
            DefultValueChest_2.Item56_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item56.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item56.StackSize", DefultValueChest_2.Item56_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item56 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item57.Item")) {
            DefultValueChest_2.Item57_Item = (yamlConfiguration_WB2_Chest.getString("Item57.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item57.Item", DefultValueChest_2.Item57_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item57 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item57.StackSize")) {
            DefultValueChest_2.Item57_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item57.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item57.StackSize", DefultValueChest_2.Item57_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item57 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item58.Item")) {
            DefultValueChest_2.Item58_Item = (yamlConfiguration_WB2_Chest.getString("Item58.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item58.Item", DefultValueChest_2.Item58_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item58 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item58.StackSize")) {
            DefultValueChest_2.Item58_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item58.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item58.StackSize", DefultValueChest_2.Item58_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item58 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item59.Item")) {
            DefultValueChest_2.Item59_Item = (yamlConfiguration_WB2_Chest.getString("Item59.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item59.Item", DefultValueChest_2.Item59_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item59 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item59.StackSize")) {
            DefultValueChest_2.Item9_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item59.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item59.StackSize", DefultValueChest_2.Item59_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item59 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item60.Item")) {
            DefultValueChest_2.Item60_Item = (yamlConfiguration_WB2_Chest.getString("Item60.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item60.Item", DefultValueChest_2.Item60_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item60 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item60.StackSize")) {
            DefultValueChest_2.Item60_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item60.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item60.StackSize", DefultValueChest_2.Item60_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item60 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item61.Item")) {
            DefultValueChest_2.Item61_Item = (yamlConfiguration_WB2_Chest.getString("Item61.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item61.Item", DefultValueChest_2.Item61_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item61 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item61.StackSize")) {
            DefultValueChest_2.Item61_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item61.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item61.StackSize", DefultValueChest_2.Item61_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item61 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item62.Item")) {
            DefultValueChest_2.Item62_Item = (yamlConfiguration_WB2_Chest.getString("Item62.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item62.Item", DefultValueChest_2.Item62_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item62 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item62.StackSize")) {
            DefultValueChest_2.Item62_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item62.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item62.StackSize", DefultValueChest_2.Item62_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item62 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item63.Item")) {
            DefultValueChest_2.Item63_Item = (yamlConfiguration_WB2_Chest.getString("Item63.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item63.Item", DefultValueChest_2.Item63_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item63 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item63.StackSize")) {
            DefultValueChest_2.Item63_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item63.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item63.StackSize", DefultValueChest_2.Item63_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item63 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item64.Item")) {
            DefultValueChest_2.Item64_Item = (yamlConfiguration_WB2_Chest.getString("Item64.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item64.Item", DefultValueChest_2.Item64_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item64 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item64.StackSize")) {
            DefultValueChest_2.Item64_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item64.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item64.StackSize", DefultValueChest_2.Item64_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item64 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item65.Item")) {
            DefultValueChest_2.Item65_Item = (yamlConfiguration_WB2_Chest.getString("Item65.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item65.Item", DefultValueChest_2.Item65_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item65 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item65.StackSize")) {
            DefultValueChest_2.Item65_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item65.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item65.StackSize", DefultValueChest_2.Item65_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item65 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item66.Item")) {
            DefultValueChest_2.Item66_Item = (yamlConfiguration_WB2_Chest.getString("Item66.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item66.Item", DefultValueChest_2.Item66_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item66 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item66.StackSize")) {
            DefultValueChest_2.Item66_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item66.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item66.StackSize", DefultValueChest_2.Item66_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item66 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item67.Item")) {
            DefultValueChest_2.Item67_Item = (yamlConfiguration_WB2_Chest.getString("Item67.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item67.Item", DefultValueChest_2.Item67_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item67 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item67.StackSize")) {
            DefultValueChest_2.Item67_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item67.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item67.StackSize", DefultValueChest_2.Item67_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item67 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item68.Item")) {
            DefultValueChest_2.Item68_Item = (yamlConfiguration_WB2_Chest.getString("Item68.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item68.Item", DefultValueChest_2.Item8_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item68 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item68.StackSize")) {
            DefultValueChest_2.Item68_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item68.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item68.StackSize", DefultValueChest_2.Item68_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item68 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item69.Item")) {
            DefultValueChest_2.Item69_Item = (yamlConfiguration_WB2_Chest.getString("Item69.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item69.Item", DefultValueChest_2.Item69_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item69 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item69.StackSize")) {
            DefultValueChest_2.Item69_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item69.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item69.StackSize", DefultValueChest_2.Item69_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item69 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        if (yamlConfiguration_WB2_Chest.contains("Item70.Item")) {
            DefultValueChest_2.Item70_Item = (yamlConfiguration_WB2_Chest.getString("Item70.Item").toUpperCase().replace(".", "_"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item70.Item", DefultValueChest_2.Item70_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item70 Item §4was added to §9WonderBag Chest medium.yml§4!");
        }
        if (yamlConfiguration_WB2_Chest.contains("Item70.StackSize")) {
            DefultValueChest_2.Item70_StackSize = Integer.valueOf(yamlConfiguration_WB2_Chest.getString("Item70.StackSize"));
        } else {
            yamlConfiguration_WB2_Chest.set("Item70.StackSize", DefultValueChest_2.Item70_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item70 StackSize §4was added to §9WonderBag Chest medium.yml§4!");
        }

        try {
            yamlConfiguration_WB2_Chest.save(WB2ChestYML);
        } catch (IOException e) {
            e.printStackTrace();
        }


        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2WonderBag Chest medium.yml loaded successfully.");

    }

    public static void WB2ChestDisable() {
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag Chest medium.yml successfully deactivated.");
    }

    private static String replace(String Text) {

        File WB2YML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Chest/" + "medium.yml");
        YamlConfiguration yamlConfiguration_WB2_Chest = YamlConfiguration.loadConfiguration(WB2YML);

        return Text.replace("[prefix]", DefultValue.Prefix).replace("&", "§").replace("[currency]", DefultValue.Currency)
                .replace("[ue]", "ü").replace("[UE]", "Ü").replace("[oe]", "Ö").replace("[OE]", "Ö")
                .replace("[ae]", "ä").replace("[AE]", "Ä").replace("[WB1Name]", DefultValueChest_2.Name)
                .replace("[WB2Price]", String.valueOf(yamlConfiguration_WB2_Chest.get("Shop.price")));
    }
}