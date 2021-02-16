// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.Listeners;

import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class OpenChest {

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        Block block = event.getBlock();
        ItemStack item = event.getItemInHand();
        NBTItem nbti1 = new NBTItem(item);
        if (block.getType() == Material.CHEST) {
            if(nbti1.hasKey("loot_chest_1")) {
                Chest chest = (Chest) block.getState();
                ItemStack example = new ItemStack(Material.DIAMOND, 64);
                chest.getInventory().addItem(example);
            }
        }
    }

}
