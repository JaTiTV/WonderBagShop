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

package de.jatitv.wonderbagshop.gui;

import de.jatitv.wonderbagshop.defaultValue.*;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_1;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_2;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_3;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_1;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_2;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_3;
import de.jatitv.wonderbagshop.system.Main;
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
import java.util.HashMap;

public class ShopGive {

    public static String GiveName;

    public static void openShop(Player player) {
        if (Main.minecraft1_13){
            GiveName = DefaultValue.GUI_Name + " §8| §4give";
        } else GiveName = "§3§2§5§6§7§r" + DefaultValue.GUI_Name + " §8| §4give";


        if (DefaultValue.UseChest_and_Item) {
            Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9*4, GiveName);

            ItemStack glass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
            ItemMeta itemMetaglass = glass.getItemMeta();
            itemMetaglass.setDisplayName(" ");
            glass.setItemMeta(itemMetaglass);
            glass.setAmount(1);
            for(int i = 0; i<9*4;i++){inventory.setItem(i, glass);}

            ItemStack item = new ItemStack(Material.CHEST);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName(DefaultValueChest_1.Name);
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add(DefaultValueChest_1.price + " " + DefaultValue.Currency);
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            if (DefaultValue.ItemNumbers){
                item.setAmount(1);
            } else {
                item.setAmount(1);
            }
            inventory.setItem(11, item);

            ItemStack item2 = new ItemStack(Material.CHEST);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName(DefaultValueChest_2.Name);
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add(DefaultValueChest_2.price + " " + DefaultValue.Currency);
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            if (DefaultValue.ItemNumbers){
                item2.setAmount(2);
            } else {
                item2.setAmount(1);
            }
            inventory.setItem(13, item2);

            ItemStack item3 = new ItemStack(Material.CHEST);
            ItemMeta itemMeta3 = item3.getItemMeta();
            itemMeta3.setDisplayName(DefaultValueChest_3.Name);
            ArrayList<String> lore3 = new ArrayList<>();
            lore3.add("§8-------------");
            lore3.add(DefaultValueChest_3.price + " " + DefaultValue.Currency);
            itemMeta3.setLore(lore3);
            item3.setItemMeta(itemMeta3);
            if(DefaultValue.ItemNumbers){
                item3.setAmount(3);
            } else {
                item3.setAmount(1);
            }
            inventory.setItem(15, item3);

            ItemStack item4 = new ItemStack(Material.valueOf(DefaultValueItem_1.Item));
            ItemMeta itemMeta4 = item4.getItemMeta();
            itemMeta4.setDisplayName(DefaultValueChest_1.Name);
            ArrayList<String> lore4 = new ArrayList<>();
            lore4.add("§8-------------");
            lore4.add(DefaultValueChest_1.price + " " + DefaultValue.Currency);
            itemMeta4.setLore(lore4);
            item4.setItemMeta(itemMeta4);
            if(DefaultValue.ItemNumbers){
                item4.setAmount(1);
            } else {
                item4.setAmount(1);
            }
            inventory.setItem(20, item4);

            ItemStack item5 = new ItemStack(Material.valueOf(DefaultValueItem_2.Item));
            ItemMeta itemMeta5 = item5.getItemMeta();
            itemMeta5.setDisplayName(DefaultValueChest_2.Name);
            ArrayList<String> lore5 = new ArrayList<>();
            lore5.add("§8-------------");
            lore5.add(DefaultValueChest_2.price + " " + DefaultValue.Currency);
            itemMeta5.setLore(lore5);
            item5.setItemMeta(itemMeta5);
            if(DefaultValue.ItemNumbers){
                item5.setAmount(2);
            } else {
                item5.setAmount(1);
            }
            inventory.setItem(22, item5);

            ItemStack item6 = new ItemStack(Material.valueOf(DefaultValueItem_3.Item));
            ItemMeta itemMeta6 = item6.getItemMeta();
            itemMeta6.setDisplayName(DefaultValueChest_3.Name);
            ArrayList<String> lore6 = new ArrayList<>();
            lore6.add("§8-------------");
            lore6.add(DefaultValueChest_3.price + " " + DefaultValue.Currency);
            itemMeta6.setLore(lore6);
            item6.setItemMeta(itemMeta6);
            if(DefaultValue.ItemNumbers){
                item6.setAmount(3);
            } else {
                item6.setAmount(1);
            }
            inventory.setItem(24, item6);

            player.openInventory(inventory);

        } else {
            if (DefaultValue.UseChest){
                Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9 * 3, GiveName);

                ItemStack glass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
                ItemMeta itemMetaglass = glass.getItemMeta();
                itemMetaglass.setDisplayName(" ");
                glass.setItemMeta(itemMetaglass);
                glass.setAmount(1);
                for(int i = 0; i<9*3;i++){inventory.setItem(i, glass);}

                ItemStack item = new ItemStack(Material.CHEST);
                ItemMeta itemMeta = item.getItemMeta();
                itemMeta.setDisplayName(DefaultValueChest_1.Name);
                ArrayList<String> lore = new ArrayList<>();
                lore.add("§8-------------");
                lore.add(DefaultValueChest_1.price + " " + DefaultValue.Currency);
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                if (DefaultValue.ItemNumbers){
                    item.setAmount(1);
                } else {
                    item.setAmount(1);
                }
                inventory.setItem(11, item);

                ItemStack item2 = new ItemStack(Material.CHEST);
                ItemMeta itemMeta2 = item2.getItemMeta();
                itemMeta2.setDisplayName(DefaultValueChest_2.Name);
                ArrayList<String> lore2 = new ArrayList<>();
                lore2.add("§8-------------");
                lore2.add(DefaultValueChest_2.price + " " + DefaultValue.Currency);
                itemMeta2.setLore(lore2);
                item2.setItemMeta(itemMeta2);
                if (DefaultValue.ItemNumbers){
                    item2.setAmount(2);
                } else {
                    item2.setAmount(1);
                }
                inventory.setItem(13, item2);

                ItemStack item3 = new ItemStack(Material.CHEST);
                ItemMeta itemMeta3 = item3.getItemMeta();
                itemMeta3.setDisplayName(DefaultValueChest_3.Name);
                ArrayList<String> lore3 = new ArrayList<>();
                lore3.add("§8-------------");
                lore3.add(DefaultValueChest_3.price + " " + DefaultValue.Currency);
                itemMeta3.setLore(lore3);
                item3.setItemMeta(itemMeta3);
                if(DefaultValue.ItemNumbers){
                    item3.setAmount(3);
                } else {
                    item3.setAmount(1);
                }
                inventory.setItem(15, item3);
                player.openInventory(inventory);
            } else {
                Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9 * 3, GiveName);

                ItemStack glass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
                ItemMeta itemMetaglass = glass.getItemMeta();
                itemMetaglass.setDisplayName(" ");
                glass.setItemMeta(itemMetaglass);
                glass.setAmount(1);
                for(int i = 0; i<9*3;i++){inventory.setItem(i, glass);}

                ItemStack item = new ItemStack(Material.valueOf(DefaultValueItem_1.Item));
                ItemMeta itemMeta = item.getItemMeta();
                itemMeta.setDisplayName(DefaultValueChest_1.Name);
                ArrayList<String> lore = new ArrayList<>();
                lore.add("§8-------------");
                lore.add(DefaultValueChest_1.price + " " + DefaultValue.Currency);
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                if(DefaultValue.ItemNumbers){
                    item.setAmount(1);
                } else {
                    item.setAmount(1);
                }
                inventory.setItem(11, item);

                ItemStack item2 = new ItemStack(Material.valueOf(DefaultValueItem_2.Item));
                ItemMeta itemMeta2 = item2.getItemMeta();
                itemMeta2.setDisplayName(DefaultValueChest_2.Name);
                ArrayList<String> lore2 = new ArrayList<>();
                lore2.add("§8-------------");
                lore2.add(DefaultValueChest_2.price + " " + DefaultValue.Currency);
                itemMeta2.setLore(lore2);
                item2.setItemMeta(itemMeta2);
                if(DefaultValue.ItemNumbers){
                    item2.setAmount(2);
                } else {
                    item2.setAmount(1);
                }
                inventory.setItem(13, item2);

                ItemStack item3 = new ItemStack(Material.valueOf(DefaultValueItem_3.Item));
                ItemMeta itemMeta3 = item3.getItemMeta();
                itemMeta3.setDisplayName(DefaultValueChest_3.Name);
                ArrayList<String> lore3 = new ArrayList<>();
                lore3.add("§8-------------");
                lore3.add(DefaultValueChest_3.price + " " + DefaultValue.Currency);
                itemMeta3.setLore(lore3);
                item3.setItemMeta(itemMeta3);
                if(DefaultValue.ItemNumbers){
                    item3.setAmount(3);
                } else {
                    item3.setAmount(1);
                }
                inventory.setItem(15, item3);

                player.openInventory(inventory);
            }
        }
    }

    public static boolean buy(Player p, Integer preis) {
        if (Main.eco == null) {
            p.sendMessage(DefaultValue.Prefix + "\n" + DefaultValue.VaultNotSetUp + "\n" + DefaultValue.Prefix);
        } else {
            if (Main.eco.getBalance(p) < preis) {
                return false;
            } else {
                Main.eco.withdrawPlayer(p, preis);
                return true;
            }
        }
        return false;
    }
    public static HashMap<Player, Player> ShopSendSender = new HashMap<>();
}