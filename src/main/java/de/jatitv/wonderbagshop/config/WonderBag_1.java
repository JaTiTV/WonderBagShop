// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.config;

import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB1;
import de.jatitv.wonderbagshop.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class WonderBag_1 {

    public static void WB1Create(){

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_1-Config load...");

        File shopYML = new File(Main.thisp().getDataFolder().getPath(), "WonderBag_1.yml");
        YamlConfiguration yamlConfiguration_shop = YamlConfiguration.loadConfiguration(shopYML);


        // Shop

        if(yamlConfiguration_shop.contains("Shop.Name")){
            DefultValue_WB1.Name = (yamlConfiguration_shop.getString("Shop.Name"));
        }else{
            yamlConfiguration_shop.set("Shop.Name", "&2Wonder&6Bag &91");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_1 Name §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("Shop.price")){
            DefultValue_WB1.price = Integer.valueOf(yamlConfiguration_shop.getString("Shop.price"));
        }else{
            yamlConfiguration_shop.set("Shop.price", "1000");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_1 price §4was added to §9shop.yml§4!");
        }

        // WonderBag

        if(yamlConfiguration_shop.contains("WonderBag.ChestName")){
            DefultValue_WB1.ChestName = (yamlConfiguration_shop.getString("WonderBag.ChestName"));
        }else{
            yamlConfiguration_shop.set("WonderBag.ChestName", "&2Wonder&6Bag &91");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag/WonderBag_1/ChestName §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("WonderBag.Item_amount_(1-15)")){
            DefultValue_WB1.Item_anz = Integer.valueOf(yamlConfiguration_shop.getString("WonderBag.Item_amount_(1-15)"));
        }else{
            yamlConfiguration_shop.set("WonderBag.Item_amount_(1-15)", "5");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_1 Item_amount_(1-15) §4was added to §9shop.yml§4!");
        }

        // Items

        if(yamlConfiguration_shop.contains("Item1.Item")){
            DefultValue_WB1.Item1_Item = (yamlConfiguration_shop.getString("Item1.Item"));
        }else{
            yamlConfiguration_shop.set("Item1.Item", DefultValue_WB1.Item1_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_1 Item_MaxStack_(1-64) §4was added to §9shop.yml§4!");
        }

        if(yamlConfiguration_shop.contains("Item1.StackSize_(1-64)")){
            DefultValue_WB1.Item1_StackSize = Integer.valueOf(yamlConfiguration_shop.getString("Item1.StackSize_(1-64)"));
        }else{
            yamlConfiguration_shop.set("Item1.StackSize_(1-64)", DefultValue_WB1.Item1_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Shop Setting §6WonderBag Item_1 Item_MaxStack_(1-64) §4was added to §9shop.yml§4!");
        }

        try {
            yamlConfiguration_shop.save(shopYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2Shop-Config loaded successfully.");
    }

    public static void WB1Disable(){
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4shop.yml successfully deactivated.");
    }



}
