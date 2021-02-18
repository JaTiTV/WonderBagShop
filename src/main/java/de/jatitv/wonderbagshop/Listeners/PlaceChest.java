// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.Listeners;

import de.jatitv.wonderbagshop.main.Main;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.io.File;

public class PlaceChest implements Listener {

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {

        File configYML = new File(Main.thisp().getDataFolder().getPath(), "config.yml");
        YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);

        Inventory inventory = Bukkit.createInventory((InventoryHolder)null, 9*3, de.jatitv.wonderbagshop.config.DefultValue.ShopName_GUI);
        Block block = event.getBlock();
        ItemStack item = event.getItemInHand();
        NBTItem nbti = new NBTItem(item);
        if (block.getType() == Material.CHEST) {
            if(nbti.hasKey("loot_chest_1")) {
                Chest chest = (Chest) block.getState();
                ItemStack example = new ItemStack(Material.DIAMOND_SWORD);
                chest.getInventory().addItem(example);
            }
        }

        if (block.getType() == Material.CHEST) {
            if(nbti.hasKey("loot_chest_2")) {
                Chest chest = (Chest) block.getState();
                ItemStack example = new ItemStack(Material.EMERALD);
                chest.getInventory().addItem(example);
            }
        }

        if (block.getType() == Material.CHEST) {
            if(nbti.hasKey("loot_chest_3")) {
                Chest chest = (Chest) block.getState();
                ItemStack example = new ItemStack(Material.STONE);
                chest.getInventory().addItem(example);
            }
        }
    }
}
