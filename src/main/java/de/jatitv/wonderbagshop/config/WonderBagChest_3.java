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
import de.jatitv.wonderbagshop.defultValue.DefultValue_WB3_Chest;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class WonderBagChest_3 {

    public static void WB3ChestCreate() throws InterruptedException {

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag Chest large.yml load...");

        File WB3ChestYML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Chest/" + "large.yml");
        YamlConfiguration yamlConfiguration_WB3_Chest = YamlConfiguration.loadConfiguration(WB3ChestYML);


        // Shop

        if(yamlConfiguration_WB3_Chest.contains("Shop.Name")){
            DefultValue_WB3_Chest.Name = replace(yamlConfiguration_WB3_Chest.getString("Shop.Name"));
        }else{
            yamlConfiguration_WB3_Chest.set("Shop.Name", "&2Wonder&6Bag&7: &9large");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Shop Name §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Shop.price")){
            DefultValue_WB3_Chest.price = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Shop.price"));
        }else{
            yamlConfiguration_WB3_Chest.set("Shop.price", DefultValue_WB3_Chest.price);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Shop price §4was added to §9WonderBag Chest large.yml§4!");
        }

        // WonderBag

        if(yamlConfiguration_WB3_Chest.contains("WonderBag.DisplayName")){
            DefultValue_WB3_Chest.DisplayName = replace(yamlConfiguration_WB3_Chest.getString("WonderBag.DisplayName"));
        }else{
            yamlConfiguration_WB3_Chest.set("WonderBag.DisplayName", "&2Wonder&6Bag &9large");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6WonderBag DisplayName §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("WonderBag.Item_amount_(1-9)")){
            DefultValue_WB3_Chest.Item_anz = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("WonderBag.Item_amount_(1-9)"));
        }else{
            yamlConfiguration_WB3_Chest.set("WonderBag.Item_amount_(1-9)", DefultValue_WB3_Chest.Item_anz);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6WonderBag Item_amount_(1-9) §4was added to §9WonderBag Chest large.yml§4!");
        }

        // Items

        if(yamlConfiguration_WB3_Chest.contains("Item1.Item")){
            DefultValue_WB3_Chest.Item1_Item = (yamlConfiguration_WB3_Chest.getString("Item1.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item1.Item", DefultValue_WB3_Chest.Item1_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item1 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item1.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item1_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item1.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item1.StackSize_(1-64)", DefultValue_WB3_Chest.Item1_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item1 StackSize_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item2.Item")){
            DefultValue_WB3_Chest.Item2_Item = (yamlConfiguration_WB3_Chest.getString("Item2.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item2.Item", DefultValue_WB3_Chest.Item2_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item2 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item2.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item2_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item2.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item2.StackSize_(1-64)", DefultValue_WB3_Chest.Item2_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item2 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item3.Item")){
            DefultValue_WB3_Chest.Item3_Item = (yamlConfiguration_WB3_Chest.getString("Item3.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item3.Item", DefultValue_WB3_Chest.Item3_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item3 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item3.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item3_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item3.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item3.StackSize_(1-64)", DefultValue_WB3_Chest.Item3_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item3 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item4.Item")){
            DefultValue_WB3_Chest.Item4_Item = (yamlConfiguration_WB3_Chest.getString("Item4.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item4.Item", DefultValue_WB3_Chest.Item4_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item4 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item4.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item4_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item4.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item4.StackSize_(1-64)", DefultValue_WB3_Chest.Item4_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item4 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item5.Item")){
            DefultValue_WB3_Chest.Item5_Item = (yamlConfiguration_WB3_Chest.getString("Item5.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item5.Item", DefultValue_WB3_Chest.Item5_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item5 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item5.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item5_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item5.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item5.StackSize_(1-64)", DefultValue_WB3_Chest.Item5_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item5 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item6.Item")){
            DefultValue_WB3_Chest.Item6_Item = (yamlConfiguration_WB3_Chest.getString("Item6.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item6.Item", DefultValue_WB3_Chest.Item6_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item6 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item6.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item6_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item6.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item6.StackSize_(1-64)", DefultValue_WB3_Chest.Item6_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item6 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item7.Item")){
            DefultValue_WB3_Chest.Item7_Item = (yamlConfiguration_WB3_Chest.getString("Item7.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item7.Item", DefultValue_WB3_Chest.Item7_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item7 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item7.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item7_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item7.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item7.StackSize_(1-64)", DefultValue_WB3_Chest.Item7_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item7 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item8.Item")){
            DefultValue_WB3_Chest.Item8_Item = (yamlConfiguration_WB3_Chest.getString("Item8.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item8.Item", DefultValue_WB3_Chest.Item8_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item8 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item8.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item8_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item8.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item8.StackSize_(1-64)", DefultValue_WB3_Chest.Item8_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item8 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item9.Item")){
            DefultValue_WB3_Chest.Item9_Item = (yamlConfiguration_WB3_Chest.getString("Item9.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item9.Item", DefultValue_WB3_Chest.Item9_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item9 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item9.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item9_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item9.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item9.StackSize_(1-64)", DefultValue_WB3_Chest.Item9_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item9 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item10.Item")){
            DefultValue_WB3_Chest.Item10_Item = (yamlConfiguration_WB3_Chest.getString("Item10.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item10.Item", DefultValue_WB3_Chest.Item10_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item10 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item10.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item10_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item10.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item10.StackSize_(1-64)", DefultValue_WB3_Chest.Item10_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item10 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item11.Item")){
            DefultValue_WB3_Chest.Item11_Item = (yamlConfiguration_WB3_Chest.getString("Item11.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item11.Item", DefultValue_WB3_Chest.Item11_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item11 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item11.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item11_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item11.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item11.StackSize_(1-64)", DefultValue_WB3_Chest.Item11_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item11 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item12.Item")){
            DefultValue_WB3_Chest.Item12_Item = (yamlConfiguration_WB3_Chest.getString("Item12.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item12.Item", DefultValue_WB3_Chest.Item12_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item12 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item12.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item12_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item12.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item12.StackSize_(1-64)", DefultValue_WB3_Chest.Item12_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item12 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item13.Item")){
            DefultValue_WB3_Chest.Item13_Item = (yamlConfiguration_WB3_Chest.getString("Item13.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item13.Item", DefultValue_WB3_Chest.Item13_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item13 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item13.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item13_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item13.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item13.StackSize_(1-64)", DefultValue_WB3_Chest.Item13_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item13 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item14.Item")){
            DefultValue_WB3_Chest.Item14_Item = (yamlConfiguration_WB3_Chest.getString("Item14.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item14.Item", DefultValue_WB3_Chest.Item14_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item14 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item14.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item14_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item14.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item14.StackSize_(1-64)", DefultValue_WB3_Chest.Item14_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item14 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item15.Item")){
            DefultValue_WB3_Chest.Item15_Item = (yamlConfiguration_WB3_Chest.getString("Item15.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item15.Item", DefultValue_WB3_Chest.Item15_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item15 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item15.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item15_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item15.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item15.StackSize_(1-64)", DefultValue_WB3_Chest.Item15_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item15 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item16.Item")){
            DefultValue_WB3_Chest.Item16_Item = (yamlConfiguration_WB3_Chest.getString("Item16.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item16.Item", DefultValue_WB3_Chest.Item16_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item16 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item16.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item16_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item16.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item16.StackSize_(1-64)", DefultValue_WB3_Chest.Item16_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item16 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item17.Item")){
            DefultValue_WB3_Chest.Item17_Item = (yamlConfiguration_WB3_Chest.getString("Item17.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item17.Item", DefultValue_WB3_Chest.Item17_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item17 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item17.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item17_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item17.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item17.StackSize_(1-64)", DefultValue_WB3_Chest.Item17_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item17 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item18.Item")){
            DefultValue_WB3_Chest.Item18_Item = (yamlConfiguration_WB3_Chest.getString("Item18.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item18.Item", DefultValue_WB3_Chest.Item18_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item18 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item18.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item18_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item18.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item18.StackSize_(1-64)", DefultValue_WB3_Chest.Item18_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item18 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item19.Item")){
            DefultValue_WB3_Chest.Item19_Item = (yamlConfiguration_WB3_Chest.getString("Item19.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item19.Item", DefultValue_WB3_Chest.Item19_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item19 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item19.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item19_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item19.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item19.StackSize_(1-64)", DefultValue_WB3_Chest.Item19_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item19 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item20.Item")){
            DefultValue_WB3_Chest.Item20_Item = (yamlConfiguration_WB3_Chest.getString("Item20.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item20.Item", DefultValue_WB3_Chest.Item20_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item20 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item20.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item20_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item20.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item20.StackSize_(1-64)", DefultValue_WB3_Chest.Item20_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item20 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item21.Item")){
            DefultValue_WB3_Chest.Item21_Item = (yamlConfiguration_WB3_Chest.getString("Item21.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item21.Item", DefultValue_WB3_Chest.Item21_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item21 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item21.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item21_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item21.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item21.StackSize_(1-64)", DefultValue_WB3_Chest.Item21_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item21 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item22.Item")){
            DefultValue_WB3_Chest.Item22_Item = (yamlConfiguration_WB3_Chest.getString("Item22.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item22.Item", DefultValue_WB3_Chest.Item22_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item22 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item22.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item22_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item22.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item22.StackSize_(1-64)", DefultValue_WB3_Chest.Item22_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item22 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item23.Item")){
            DefultValue_WB3_Chest.Item23_Item = (yamlConfiguration_WB3_Chest.getString("Item23.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item23.Item", DefultValue_WB3_Chest.Item23_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item23 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item23.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item23_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item23.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item23.StackSize_(1-64)", DefultValue_WB3_Chest.Item23_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item23 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item24.Item")){
            DefultValue_WB3_Chest.Item24_Item = (yamlConfiguration_WB3_Chest.getString("Item24.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item24.Item", DefultValue_WB3_Chest.Item24_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item24 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item24.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item24_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item24.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item24.StackSize_(1-64)", DefultValue_WB3_Chest.Item24_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item24 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item25.Item")){
            DefultValue_WB3_Chest.Item25_Item = (yamlConfiguration_WB3_Chest.getString("Item25.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item25.Item", DefultValue_WB3_Chest.Item25_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item25 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item25.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item25_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item25.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item25.StackSize_(1-64)", DefultValue_WB3_Chest.Item25_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item25 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item26.Item")){
            DefultValue_WB3_Chest.Item26_Item = (yamlConfiguration_WB3_Chest.getString("Item26.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item26.Item", DefultValue_WB3_Chest.Item26_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item26 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item26.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item26_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item26.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item26.StackSize_(1-64)", DefultValue_WB3_Chest.Item26_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item26 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item27.Item")){
            DefultValue_WB3_Chest.Item27_Item = (yamlConfiguration_WB3_Chest.getString("Item27.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item27.Item", DefultValue_WB3_Chest.Item27_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item27 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item27.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item27_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item27.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item27.StackSize_(1-64)", DefultValue_WB3_Chest.Item27_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item27 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item28.Item")){
            DefultValue_WB3_Chest.Item28_Item = (yamlConfiguration_WB3_Chest.getString("Item28.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item28.Item", DefultValue_WB3_Chest.Item28_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item28 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item28.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item28_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item28.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item28.StackSize_(1-64)", DefultValue_WB3_Chest.Item28_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item28 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item29.Item")){
            DefultValue_WB3_Chest.Item29_Item = (yamlConfiguration_WB3_Chest.getString("Item29.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item29.Item", DefultValue_WB3_Chest.Item29_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item29 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item29.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item29_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item29.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item29.StackSize_(1-64)", DefultValue_WB3_Chest.Item29_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item29 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        if(yamlConfiguration_WB3_Chest.contains("Item30.Item")){
            DefultValue_WB3_Chest.Item30_Item = (yamlConfiguration_WB3_Chest.getString("Item30.Item"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item30.Item", DefultValue_WB3_Chest.Item30_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item30 Item §4was added to §9WonderBag Chest large.yml§4!");
        }
        if(yamlConfiguration_WB3_Chest.contains("Item30.StackSize_(1-64)")){
            DefultValue_WB3_Chest.Item30_StackSize = Integer.valueOf(yamlConfiguration_WB3_Chest.getString("Item30.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3_Chest.set("Item30.StackSize_(1-64)", DefultValue_WB3_Chest.Item30_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Setting §6Item30 Item_MaxStack_(1-64) §4was added to §9WonderBag Chest large.yml§4!");
        }

        try {
            yamlConfiguration_WB3_Chest.save(WB3ChestYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2WonderBag Chest large.yml loaded successfully.");
    }

    public static void WB3ChestDisable(){
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag Chest large.yml successfully deactivated.");
    }

    private static String replace(String Text) {

        File WB3YML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Chest/" + "large.yml");
        YamlConfiguration yamlConfiguration_WB3_Chest = YamlConfiguration.loadConfiguration(WB3YML);

        return Text.replace("[prefix]", DefultValue.Prefix).replace("&", "§").replace("[currency]", DefultValue.Currency)
                .replace("[ue]", "ü").replace("[UE]", "Ü").replace("[oe]", "Ö").replace("[OE]", "Ö")
                .replace("[ae]", "ä").replace("[AE]", "Ä").replace("[WB1Name]", DefultValue_WB3_Chest.Name)
                .replace("[WB3Price]", String.valueOf(yamlConfiguration_WB3_Chest.get("Shop.price")));
    }
}