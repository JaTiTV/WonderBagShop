// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.Listeners;

import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB1;
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
import java.util.Random;

public class PlaceChestWB1 implements Listener {

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {

        File configYML = new File(Main.thisp().getDataFolder().getPath(), "config.yml");
        YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);

        File shopYML = new File(Main.thisp().getDataFolder().getPath(), "shop.yml");
        YamlConfiguration yamlConfiguration_shop = YamlConfiguration.loadConfiguration(shopYML);

        Inventory inventory = Bukkit.createInventory((InventoryHolder)null, 9*3, DefultValue.GUI_Name);
        Block block = event.getBlock();
        ItemStack item = event.getItemInHand();
        NBTItem nbti = new NBTItem(item);
        if (block.getType() == Material.CHEST) {
            if(nbti.hasKey("loot_chest_1")) {
                Chest chest = (Chest) block.getState();

                ItemStack Item1 = null;
                Random a = new Random();
                int zufallA = a.nextInt(4);
                switch (zufallA) {
                    case 0:
                        Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item1_Item), DefultValue_WB1.Item1_StackSize);
                        break;
                    case 1:
                        Item1 = new ItemStack(Material.GOLD_INGOT);
                        break;
                    case 2:
                        Item1 = new ItemStack(Material.DIAMOND);
                        break;
                    case 3:
                        Item1 = new ItemStack(Material.EMERALD);
                        break;
                }







                if (DefultValue_WB1.Item_anz == 1 || DefultValue_WB1.Item_anz > 1){
                    chest.getInventory().addItem(Item1);
                }
                /*
                if (DefultValue.WB1Item_anz == 2 || DefultValue.WB1Item_anz > 2) {
                    chest.getInventory().addItem(Item2);
                }
                if (DefultValue.WB1Item_anz == 3 || DefultValue.WB1Item_anz > 3) {
                    chest.getInventory().addItem(Item3);
                }
                if (DefultValue.WB1Item_anz == 4 || DefultValue.WB1Item_anz > 4) {
                    chest.getInventory().addItem(Item4);
                }
                if (DefultValue.WB1Item_anz == 5 || DefultValue.WB1Item_anz > 5) {
                    chest.getInventory().addItem(item5);
                }
                if (DefultValue.WB1Item_anz == 6 || DefultValue.WB1Item_anz > 6) {
                    chest.getInventory().addItem(item6);
                }
                if (DefultValue.WB1Item_anz == 7 || DefultValue.WB1Item_anz > 7) {
                    chest.getInventory().addItem(item7);
                }
                if (DefultValue.WB1Item_anz == 8 || DefultValue.WB1Item_anz > 8) {
                    chest.getInventory().addItem(item8);
                }
                if (DefultValue.WB1Item_anz == 9 || DefultValue.WB1Item_anz > 9) {
                    chest.getInventory().addItem(item9);
                }
                if (DefultValue.WB1Item_anz == 10 || DefultValue.WB1Item_anz > 10) {
                    chest.getInventory().addItem(item10);
                }
                if (DefultValue.WB1Item_anz == 11 || DefultValue.WB1Item_anz > 11) {
                    chest.getInventory().addItem(item11);
                }
                if (DefultValue.WB1Item_anz == 12 || DefultValue.WB1Item_anz > 12) {
                    chest.getInventory().addItem(item12);
                }
                if (DefultValue.WB1Item_anz == 13 || DefultValue.WB1Item_anz > 13) {
                    chest.getInventory().addItem(item13);
                }
                if (DefultValue.WB1Item_anz == 14 || DefultValue.WB1Item_anz > 14) {
                    chest.getInventory().addItem(item14);
                }
                if (DefultValue.WB1Item_anz == 15 || DefultValue.WB1Item_anz > 15) {
                    chest.getInventory().addItem(item15);
                }

                 */
            }
        }
    }
}
