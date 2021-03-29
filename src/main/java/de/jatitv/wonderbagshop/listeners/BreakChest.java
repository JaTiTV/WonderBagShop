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

package de.jatitv.wonderbagshop.listeners;

import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BreakChest implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Block block = e.getBlock();

        if (DefaultValue.ChestDrop){
            if (block.getType() == Material.CHEST){
                if(block.hasMetadata("WB1MD58625")){
                    block.setType(Material.AIR);
                    e.getBlock().getLocation().getWorld().dropItem(e.getBlock().getLocation(), new ItemStack(Material.CHEST));
                    block.removeMetadata("WB1MD58625", Main.getPlugin());
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + e.getPlayer().getDisplayName() + " §4break WonderBag and drop 1 Chest");
                    }
                }
            }
        } else {
            if (block.getType() == Material.CHEST){
                if(block.hasMetadata("WB1MD58625")){
                    block.setType(Material.AIR);
                    block.removeMetadata("WB1MD58625", Main.getPlugin());
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + e.getPlayer().getDisplayName() + " §4break WonderBag");
                    }
                }
            }
        }
    }
}
