// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.Listeners;

import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BreakChest implements Listener {

    public void onBlockBreak(BlockBreakEvent e) {
        Block block = e.getBlock();
        if (block.getType() == Material.CHEST) {
            block.setType(Material.AIR);
        } else {
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§5ERROR");
        }
    }
}
