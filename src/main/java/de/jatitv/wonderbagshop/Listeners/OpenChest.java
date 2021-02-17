// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.Listeners;

import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class OpenChest implements Listener {

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder)null, 9*3, de.jatitv.wonderbagshop.config.Shop.ShopName_GUI);
        Block block = event.getBlock();
        ItemStack item = event.getItemInHand();
        NBTItem nbti1 = new NBTItem(item);
        if (block.getType() == Material.CHEST) {
            if(nbti1.hasKey("loot_chest_1")) {
                Chest chest = (Chest) block.getState();
                ItemStack example = new ItemStack(Material.DIAMOND, 64);
                inventory.setItem(13, example);
                chest.getInventory().addItem(example);
            }
        }
    }

}
