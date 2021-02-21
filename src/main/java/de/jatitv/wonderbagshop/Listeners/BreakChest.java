// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.Listeners;

import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB1;
import de.tr7zw.nbtapi.NBTBlock;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BreakChest implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Block block = e.getBlock();
        if (block.getType() == Material.CHEST){
            block.setType(Material.AIR);
        }
    }
}
