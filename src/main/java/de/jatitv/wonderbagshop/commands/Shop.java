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

package de.jatitv.wonderbagshop.commands;

import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB1;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB2;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB3;
import de.jatitv.wonderbagshop.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.io.File;
import java.util.ArrayList;

public class Shop {

    public static void openShop(Player player){

        File configYML = new File(Main.thisp().getDataFolder().getPath(), "Config.yml");
        YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);

        if (DefultValue.UseChest_and_Item){

            Inventory inventory = Bukkit.createInventory((InventoryHolder)null, 9*4, DefultValue.GUI_Name);

            ItemStack item = new ItemStack(Material.CHEST);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName(DefultValue_WB1.Name);
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add(DefultValue_WB1.price + " " + DefultValue.Currency);
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            if(DefultValue.ItemNumbers){
                item.setAmount(1);
            } else {
                item.setAmount(1);
            }
            inventory.setItem(11, item);

            ItemStack item2 = new ItemStack(Material.CHEST);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName(DefultValue_WB2.Name);
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add(DefultValue_WB2.price + " " + DefultValue.Currency);
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            if(DefultValue.ItemNumbers){
                item2.setAmount(2);
            } else {
                item2.setAmount(1);
            }
            inventory.setItem(13, item2);

            ItemStack item3 = new ItemStack(Material.CHEST);
            ItemMeta itemMeta3 = item3.getItemMeta();
            itemMeta3.setDisplayName(DefultValue_WB3.Name);
            ArrayList<String> lore3 = new ArrayList<>();
            lore3.add("§8-------------");
            lore3.add(DefultValue_WB3.price + " " + DefultValue.Currency);
            itemMeta3.setLore(lore3);
            item3.setItemMeta(itemMeta3);
            if(DefultValue.ItemNumbers){
                item3.setAmount(3);
            } else {
                item3.setAmount(1);
            }
            inventory.setItem(15, item3);

            ItemStack item4 = new ItemStack(Material.valueOf(DefultValue.Item));
            ItemMeta itemMeta4 = item4.getItemMeta();
            itemMeta4.setDisplayName(DefultValue_WB1.Name);
            ArrayList<String> lore4 = new ArrayList<>();
            lore4.add("§8-------------");
            lore4.add(DefultValue_WB1.price + " " + DefultValue.Currency);
            itemMeta4.setLore(lore4);
            item4.setItemMeta(itemMeta4);
            if(DefultValue.ItemNumbers){
                item4.setAmount(1);
            } else {
                item4.setAmount(1);
            }
            inventory.setItem(20, item4);

            ItemStack item5 = new ItemStack(Material.valueOf(DefultValue.Item));
            ItemMeta itemMeta5 = item5.getItemMeta();
            itemMeta5.setDisplayName(DefultValue_WB2.Name);
            ArrayList<String> lore5 = new ArrayList<>();
            lore5.add("§8-------------");
            lore5.add(DefultValue_WB2.price + " " + DefultValue.Currency);
            itemMeta2.setLore(lore5);
            item5.setItemMeta(itemMeta5);
            if(DefultValue.ItemNumbers){
                item5.setAmount(2);
            } else {
                item5.setAmount(1);
            }
            inventory.setItem(22, item5);

            ItemStack item6 = new ItemStack(Material.valueOf(DefultValue.Item));
            ItemMeta itemMeta6 = item6.getItemMeta();
            itemMeta6.setDisplayName(DefultValue_WB3.Name);
            ArrayList<String> lore6 = new ArrayList<>();
            lore6.add("§8-------------");
            lore6.add(DefultValue_WB3.price + " " + DefultValue.Currency);
            itemMeta6.setLore(lore6);
            item6.setItemMeta(itemMeta6);
            if(DefultValue.ItemNumbers){
                item6.setAmount(3);
            } else {
                item6.setAmount(1);
            }
            inventory.setItem(24, item6);


            player.openInventory(inventory);

        } else {
            if (DefultValue.UseChest){
                Inventory inventory = Bukkit.createInventory((InventoryHolder)null, 9*3, DefultValue.GUI_Name);

                ItemStack item = new ItemStack(Material.CHEST);
                ItemMeta itemMeta = item.getItemMeta();
                itemMeta.setDisplayName(DefultValue_WB1.Name);
                ArrayList<String> lore = new ArrayList<>();
                lore.add("§8-------------");
                lore.add(DefultValue_WB1.price + " " + DefultValue.Currency);
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                if(DefultValue.ItemNumbers){
                    item.setAmount(1);
                } else {
                    item.setAmount(1);
                }
                inventory.setItem(11, item);

                ItemStack item2 = new ItemStack(Material.CHEST);
                ItemMeta itemMeta2 = item2.getItemMeta();
                itemMeta2.setDisplayName(DefultValue_WB2.Name);
                ArrayList<String> lore2 = new ArrayList<>();
                lore2.add("§8-------------");
                lore2.add(DefultValue_WB2.price + " " + DefultValue.Currency);
                itemMeta2.setLore(lore2);
                item2.setItemMeta(itemMeta2);
                if(DefultValue.ItemNumbers){
                    item2.setAmount(2);
                } else {
                    item2.setAmount(1);
                }
                inventory.setItem(13, item2);

                ItemStack item3 = new ItemStack(Material.CHEST);
                ItemMeta itemMeta3 = item3.getItemMeta();
                itemMeta3.setDisplayName(DefultValue_WB3.Name);
                ArrayList<String> lore3 = new ArrayList<>();
                lore3.add("§8-------------");
                lore3.add(DefultValue_WB3.price + " " + DefultValue.Currency);
                itemMeta3.setLore(lore3);
                item3.setItemMeta(itemMeta3);
                if(DefultValue.ItemNumbers){
                    item3.setAmount(3);
                } else {
                    item3.setAmount(1);
                }
                inventory.setItem(15, item3);
                player.openInventory(inventory);

            } else {
                Inventory inventory = Bukkit.createInventory((InventoryHolder)null, 9*3, DefultValue.GUI_Name);

                ItemStack item = new ItemStack(Material.valueOf(DefultValue.Item));
                ItemMeta itemMeta = item.getItemMeta();
                itemMeta.setDisplayName(DefultValue_WB1.Name);
                ArrayList<String> lore = new ArrayList<>();
                lore.add("§8-------------");
                lore.add(DefultValue_WB1.price + " " + DefultValue.Currency);
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                if(DefultValue.ItemNumbers){
                    item.setAmount(1);
                } else {
                    item.setAmount(1);
                }
                inventory.setItem(11, item);

                ItemStack item2 = new ItemStack(Material.valueOf(DefultValue.Item));
                ItemMeta itemMeta2 = item2.getItemMeta();
                itemMeta2.setDisplayName(DefultValue_WB2.Name);
                ArrayList<String> lore2 = new ArrayList<>();
                lore2.add("§8-------------");
                lore2.add(DefultValue_WB2.price + " " + DefultValue.Currency);
                itemMeta2.setLore(lore2);
                item2.setItemMeta(itemMeta2);
                if(DefultValue.ItemNumbers){
                    item2.setAmount(2);
                } else {
                    item2.setAmount(1);
                }
                inventory.setItem(13, item2);

                ItemStack item3 = new ItemStack(Material.valueOf(DefultValue.Item));
                ItemMeta itemMeta3 = item3.getItemMeta();
                itemMeta3.setDisplayName(DefultValue_WB3.Name);
                ArrayList<String> lore3 = new ArrayList<>();
                lore3.add("§8-------------");
                lore3.add(DefultValue_WB3.price + " " + DefultValue.Currency);
                itemMeta3.setLore(lore3);
                item3.setItemMeta(itemMeta3);
                if(DefultValue.ItemNumbers){
                    item3.setAmount(3);
                } else {
                    item3.setAmount(1);
                }
                inventory.setItem(15, item3);

                player.openInventory(inventory);
            }
        }




    }
    public static boolean buy(Player p, Integer preis){
        if(Main.eco == null ){
            p.sendMessage(DefultValue.Prefix+ "\n" + DefultValue.VaultNotSetUp + "\n" + DefultValue.Prefix);
        }else {
            if (Main.eco.getBalance(p) < preis) {
                return false;
            } else {
                Main.eco.withdrawPlayer(p, preis);
                return true;
            }
        }
        return false;
    }
}