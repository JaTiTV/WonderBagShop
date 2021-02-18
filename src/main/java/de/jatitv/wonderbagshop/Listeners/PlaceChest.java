// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.Listeners;

import de.jatitv.wonderbagshop.config.DefultValue;
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

        File shopYML = new File(Main.thisp().getDataFolder().getPath(), "shop.yml");
        YamlConfiguration yamlConfiguration_shop = YamlConfiguration.loadConfiguration(shopYML);

        Inventory inventory = Bukkit.createInventory((InventoryHolder)null, 9*3, de.jatitv.wonderbagshop.config.DefultValue.ShopName_GUI);
        Block block = event.getBlock();
        ItemStack item = event.getItemInHand();
        NBTItem nbti = new NBTItem(item);
        if (block.getType() == Material.CHEST) {
            if(nbti.hasKey("loot_chest_1")) {
                Chest chest = (Chest) block.getState();
                Bukkit.broadcastMessage(DefultValue.WB1Items);
                if (DefultValue.WB1Item_anz == 1 || DefultValue.WB1Item_anz > 1){
                    ItemStack item1 = new ItemStack(Material.DIAMOND);
                    chest.getInventory().addItem(item1);
                }
                if (DefultValue.WB1Item_anz == 2 || DefultValue.WB1Item_anz > 2) {
                    ItemStack item2 = new ItemStack(Material.DIAMOND_AXE, 2);
                    chest.getInventory().addItem(item2);
                }
                if (DefultValue.WB1Item_anz == 3 || DefultValue.WB1Item_anz > 3) {
                    ItemStack item3 = new ItemStack(Material.IRON_SWORD, 2);
                    chest.getInventory().addItem(item3);
                }
                if (DefultValue.WB1Item_anz == 4 || DefultValue.WB1Item_anz > 4) {
                    ItemStack item4 = new ItemStack(Material.DIAMOND_SWORD, 5);
                    chest.getInventory().addItem(item4);
                }
                if (DefultValue.WB1Item_anz == 5 || DefultValue.WB1Item_anz > 5) {
                    ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD, 5);
                    chest.getInventory().addItem(item5);
                }
                if (DefultValue.WB1Item_anz == 6 || DefultValue.WB1Item_anz > 6) {
                    ItemStack item6 = new ItemStack(Material.DIAMOND_SWORD, 5);
                    chest.getInventory().addItem(item6);
                }
                if (DefultValue.WB1Item_anz == 7 || DefultValue.WB1Item_anz > 7) {
                    ItemStack item7 = new ItemStack(Material.DIAMOND_SWORD, 5);
                    chest.getInventory().addItem(item7);
                }
                if (DefultValue.WB1Item_anz == 8 || DefultValue.WB1Item_anz > 8) {
                    ItemStack item8 = new ItemStack(Material.DIAMOND_SWORD, 5);
                    chest.getInventory().addItem(item8);
                }
                if (DefultValue.WB1Item_anz == 9 || DefultValue.WB1Item_anz > 9) {
                    ItemStack item9 = new ItemStack(Material.DIAMOND_SWORD, 5);
                    chest.getInventory().addItem(item9);
                }
                if (DefultValue.WB1Item_anz == 10 || DefultValue.WB1Item_anz > 10) {
                    ItemStack item10 = new ItemStack(Material.DIAMOND_SWORD, 5);
                    chest.getInventory().addItem(item10);
                }
                if (DefultValue.WB1Item_anz == 11 || DefultValue.WB1Item_anz > 11) {
                    ItemStack item11 = new ItemStack(Material.DIAMOND_SWORD, 5);
                    chest.getInventory().addItem(item11);
                }
                if (DefultValue.WB1Item_anz == 12 || DefultValue.WB1Item_anz > 12) {
                    ItemStack item12 = new ItemStack(Material.DIAMOND_SWORD, 5);
                    chest.getInventory().addItem(item12);
                }
                if (DefultValue.WB1Item_anz == 13 || DefultValue.WB1Item_anz > 13) {
                    ItemStack item13 = new ItemStack(Material.DIAMOND_SWORD, 5);
                    chest.getInventory().addItem(item13);
                }
                if (DefultValue.WB1Item_anz == 14 || DefultValue.WB1Item_anz > 14) {
                    ItemStack item14 = new ItemStack(Material.DIAMOND_SWORD, 5);
                    chest.getInventory().addItem(item14);
                }
                if (DefultValue.WB1Item_anz == 15 || DefultValue.WB1Item_anz > 15) {
                    ItemStack item15 = new ItemStack(Material.DIAMOND_SWORD, 5);
                    chest.getInventory().addItem(item15);
                }
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
