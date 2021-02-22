// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.Listeners;

import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import de.jatitv.wonderbagshop.main.Main;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Iterator;


public class BreakChest implements Listener {

    @EventHandler
    public void onBlockBreakWB1(BlockBreakEvent e) {
        Block block = e.getBlock();
        Player player = e.getPlayer();
        World world = player.getWorld();

        if (DefultValue.BlockChestDrop){
            if (block.getType() == Material.CHEST){
                if(block.hasMetadata("WB1")){
                    block.setType(Material.AIR);
                    block.removeMetadata("WB1", Main.getPlugin());
                }
            }
        } else
            System.out.println("HIIIIIIIIIIIIIIIII");
            if (block.getType() == Material.CHEST){
            if(block.hasMetadata("WB1")){
                block.setType(Material.AIR);
                ItemStack item = new ItemStack(Material.CHEST);
                player.getInventory().addItem(item);
                block.removeMetadata("WB1", Main.getPlugin());
            }
        }
    }
}
