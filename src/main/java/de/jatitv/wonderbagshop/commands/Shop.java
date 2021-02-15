// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.commands;

import de.jatitv.wonderbagshop.config.Config;
import de.jatitv.wonderbagshop.config.Messages;
import de.jatitv.wonderbagshop.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Shop {

    public static void openShop(Player player){
        Inventory inventory = Bukkit.createInventory((InventoryHolder)null, 9*3, de.jatitv.wonderbagshop.config.Shop.ShopName_GUI);

        ItemStack item = new ItemStack(Material.CHEST);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(de.jatitv.wonderbagshop.config.Shop.WB1Name);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§8-------------");
        lore.add(de.jatitv.wonderbagshop.config.Shop.WB1price + " " + Config.Currency);
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        item.setAmount(1);
        inventory.setItem(11, item);

        ItemStack item2 = new ItemStack(Material.CHEST);
        ItemMeta itemMeta2 = item2.getItemMeta();
        itemMeta2.setDisplayName(de.jatitv.wonderbagshop.config.Shop.WB2Name);
        ArrayList<String> lore2 = new ArrayList<>();
        lore2.add("§8-------------");
        lore2.add(de.jatitv.wonderbagshop.config.Shop.WB2price + " " + Config.Currency);
        itemMeta2.setLore(lore2);
        item2.setItemMeta(itemMeta2);
        item2.setAmount(2);
        inventory.setItem(13, item2);

        ItemStack item3 = new ItemStack(Material.CHEST);
        ItemMeta itemMeta3 = item3.getItemMeta();
        itemMeta3.setDisplayName(de.jatitv.wonderbagshop.config.Shop.WB3Name);
        ArrayList<String> lore3 = new ArrayList<>();
        lore3.add("§8-------------");
        lore3.add(de.jatitv.wonderbagshop.config.Shop.WB3price + " " + Config.Currency);
        itemMeta3.setLore(lore3);
        item3.setItemMeta(itemMeta3);
        item3.setAmount(3);
        inventory.setItem(15, item3);

        player.openInventory(inventory);
    }
    public static boolean buy(Player p, Integer preis){
        if(Main.eco == null ){
            p.sendMessage(Messages.Prefix + Messages.VaultNotSetUp);
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
