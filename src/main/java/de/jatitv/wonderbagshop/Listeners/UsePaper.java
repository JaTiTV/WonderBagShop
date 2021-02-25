// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.Listeners;

import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB1;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB2;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB3;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Random;

public class UsePaper implements Listener {

    @EventHandler
    public void InventoryClose(InventoryCloseEvent ice) {
        if (ice.getView().getTitle().equals("§6§9§l§r" + DefultValue_WB1.ChestName)
                || (ice.getView().getTitle().equals("§6§9§l§r" + DefultValue_WB2.ChestName))
                || (ice.getView().getTitle().equals("§6§9§l§r" + DefultValue_WB3.ChestName))) {

            for (int i = 0; i < 8; i++) {
                if (ice.getInventory().getItem(i) != null) {
                    ice.getPlayer().getLocation().getWorld().dropItem(ice.getPlayer().getLocation(), ice.getInventory().getItem(i));
                }

            }
        }
    }

    @EventHandler
    public void onInteractWB1(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getItem() != null) {
            ItemStack item = player.getItemInHand();
            NBTItem nbti = new NBTItem(item);
            if (event.getItem().getType() == Material.valueOf(DefultValue.Item)) {
                if (nbti.hasKey("loot_chest_1")) {
                    Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9 * 1, "§6§9§l§r" + DefultValue_WB1.ChestName);

                    ItemStack Item1 = null;
                    Random a = new Random();
                    int zufallA = a.nextInt(30);
                    switch (zufallA) {
                        case 0:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item1_Item), DefultValue_WB1.Item1_StackSize);
                            break;
                        case 1:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item2_Item), DefultValue_WB1.Item2_StackSize);
                            break;
                        case 2:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item3_Item), DefultValue_WB1.Item3_StackSize);
                            break;
                        case 3:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item4_Item), DefultValue_WB1.Item4_StackSize);
                            break;
                        case 4:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item5_Item), DefultValue_WB1.Item5_StackSize);
                            break;
                        case 5:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item6_Item), DefultValue_WB1.Item6_StackSize);
                            break;
                        case 6:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item7_Item), DefultValue_WB1.Item7_StackSize);
                            break;
                        case 7:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item8_Item), DefultValue_WB1.Item8_StackSize);
                            break;
                        case 8:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item9_Item), DefultValue_WB1.Item9_StackSize);
                            break;
                        case 9:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item10_Item), DefultValue_WB1.Item10_StackSize);
                            break;
                        case 10:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item11_Item), DefultValue_WB1.Item11_StackSize);
                            break;
                        case 11:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item12_Item), DefultValue_WB1.Item12_StackSize);
                            break;
                        case 12:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item13_Item), DefultValue_WB1.Item13_StackSize);
                            break;
                        case 13:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item14_Item), DefultValue_WB1.Item14_StackSize);
                            break;
                        case 14:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item15_Item), DefultValue_WB1.Item15_StackSize);
                            break;
                        case 15:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item16_Item), DefultValue_WB1.Item16_StackSize);
                            break;
                        case 16:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item17_Item), DefultValue_WB1.Item17_StackSize);
                            break;
                        case 17:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item18_Item), DefultValue_WB1.Item18_StackSize);
                            break;
                        case 18:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item19_Item), DefultValue_WB1.Item19_StackSize);
                            break;
                        case 19:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
                            break;
                        case 20:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item21_Item), DefultValue_WB1.Item21_StackSize);
                            break;
                        case 21:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item22_Item), DefultValue_WB1.Item22_StackSize);
                            break;
                        case 22:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item23_Item), DefultValue_WB1.Item23_StackSize);
                            break;
                        case 23:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item24_Item), DefultValue_WB1.Item24_StackSize);
                            break;
                        case 24:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item25_Item), DefultValue_WB1.Item25_StackSize);
                            break;
                        case 25:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item26_Item), DefultValue_WB1.Item26_StackSize);
                            break;
                        case 26:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item27_Item), DefultValue_WB1.Item27_StackSize);
                            break;
                        case 27:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item28_Item), DefultValue_WB1.Item28_StackSize);
                            break;
                        case 28:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item29_Item), DefultValue_WB1.Item29_StackSize);
                            break;
                        case 29:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item30_Item), DefultValue_WB1.Item30_StackSize);
                            break;
                    }

                    ItemStack Item2 = null;
                    Random b = new Random();
                    int zufallB = b.nextInt(30);
                    switch (zufallB) {
                        case 0:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item1_Item), DefultValue_WB1.Item1_StackSize);
                            break;
                        case 1:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item2_Item), DefultValue_WB1.Item2_StackSize);
                            break;
                        case 2:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item3_Item), DefultValue_WB1.Item3_StackSize);
                            break;
                        case 3:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item4_Item), DefultValue_WB1.Item4_StackSize);
                            break;
                        case 4:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item5_Item), DefultValue_WB1.Item5_StackSize);
                            break;
                        case 5:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item6_Item), DefultValue_WB1.Item6_StackSize);
                            break;
                        case 6:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item7_Item), DefultValue_WB1.Item7_StackSize);
                            break;
                        case 7:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item8_Item), DefultValue_WB1.Item8_StackSize);
                            break;
                        case 8:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item9_Item), DefultValue_WB1.Item9_StackSize);
                            break;
                        case 9:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item10_Item), DefultValue_WB1.Item10_StackSize);
                            break;
                        case 10:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item11_Item), DefultValue_WB1.Item11_StackSize);
                            break;
                        case 11:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item12_Item), DefultValue_WB1.Item12_StackSize);
                            break;
                        case 12:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item13_Item), DefultValue_WB1.Item13_StackSize);
                            break;
                        case 13:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item14_Item), DefultValue_WB1.Item14_StackSize);
                            break;
                        case 14:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item15_Item), DefultValue_WB1.Item15_StackSize);
                            break;
                        case 15:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item16_Item), DefultValue_WB1.Item16_StackSize);
                            break;
                        case 16:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item17_Item), DefultValue_WB1.Item17_StackSize);
                            break;
                        case 17:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item18_Item), DefultValue_WB1.Item18_StackSize);
                            break;
                        case 18:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item19_Item), DefultValue_WB1.Item19_StackSize);
                            break;
                        case 19:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
                            break;
                        case 20:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item21_Item), DefultValue_WB1.Item21_StackSize);
                            break;
                        case 21:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item22_Item), DefultValue_WB1.Item22_StackSize);
                            break;
                        case 22:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item23_Item), DefultValue_WB1.Item23_StackSize);
                            break;
                        case 23:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item24_Item), DefultValue_WB1.Item24_StackSize);
                            break;
                        case 24:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item25_Item), DefultValue_WB1.Item25_StackSize);
                            break;
                        case 25:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item26_Item), DefultValue_WB1.Item26_StackSize);
                            break;
                        case 26:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item27_Item), DefultValue_WB1.Item27_StackSize);
                            break;
                        case 27:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item28_Item), DefultValue_WB1.Item28_StackSize);
                            break;
                        case 28:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item29_Item), DefultValue_WB1.Item29_StackSize);
                            break;
                        case 29:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item30_Item), DefultValue_WB1.Item30_StackSize);
                            break;
                    }

                    ItemStack Item3 = null;
                    Random c = new Random();
                    int zufallC = c.nextInt(30);
                    switch (zufallC) {
                        case 0:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item1_Item), DefultValue_WB1.Item1_StackSize);
                            break;
                        case 1:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item2_Item), DefultValue_WB1.Item2_StackSize);
                            break;
                        case 2:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item3_Item), DefultValue_WB1.Item3_StackSize);
                            break;
                        case 3:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item4_Item), DefultValue_WB1.Item4_StackSize);
                            break;
                        case 4:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item5_Item), DefultValue_WB1.Item5_StackSize);
                            break;
                        case 5:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item6_Item), DefultValue_WB1.Item6_StackSize);
                            break;
                        case 6:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item7_Item), DefultValue_WB1.Item7_StackSize);
                            break;
                        case 7:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item8_Item), DefultValue_WB1.Item8_StackSize);
                            break;
                        case 8:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item9_Item), DefultValue_WB1.Item9_StackSize);
                            break;
                        case 9:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item10_Item), DefultValue_WB1.Item10_StackSize);
                            break;
                        case 10:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item11_Item), DefultValue_WB1.Item11_StackSize);
                            break;
                        case 11:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item12_Item), DefultValue_WB1.Item12_StackSize);
                            break;
                        case 12:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item13_Item), DefultValue_WB1.Item13_StackSize);
                            break;
                        case 13:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item14_Item), DefultValue_WB1.Item14_StackSize);
                            break;
                        case 14:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item15_Item), DefultValue_WB1.Item15_StackSize);
                            break;
                        case 15:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item16_Item), DefultValue_WB1.Item16_StackSize);
                            break;
                        case 16:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item17_Item), DefultValue_WB1.Item17_StackSize);
                            break;
                        case 17:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item18_Item), DefultValue_WB1.Item18_StackSize);
                            break;
                        case 18:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item19_Item), DefultValue_WB1.Item19_StackSize);
                            break;
                        case 19:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
                            break;
                        case 20:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item21_Item), DefultValue_WB1.Item21_StackSize);
                            break;
                        case 21:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item22_Item), DefultValue_WB1.Item22_StackSize);
                            break;
                        case 22:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item23_Item), DefultValue_WB1.Item23_StackSize);
                            break;
                        case 23:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item24_Item), DefultValue_WB1.Item24_StackSize);
                            break;
                        case 24:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item25_Item), DefultValue_WB1.Item25_StackSize);
                            break;
                        case 25:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item26_Item), DefultValue_WB1.Item26_StackSize);
                            break;
                        case 26:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item27_Item), DefultValue_WB1.Item27_StackSize);
                            break;
                        case 27:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item28_Item), DefultValue_WB1.Item28_StackSize);
                            break;
                        case 28:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item29_Item), DefultValue_WB1.Item29_StackSize);
                            break;
                        case 29:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item30_Item), DefultValue_WB1.Item30_StackSize);
                            break;
                    }

                    ItemStack Item4 = null;
                    Random d = new Random();
                    int zufallD = d.nextInt(30);
                    switch (zufallD) {
                        case 0:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item1_Item), DefultValue_WB1.Item1_StackSize);
                            break;
                        case 1:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item2_Item), DefultValue_WB1.Item2_StackSize);
                            break;
                        case 2:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item3_Item), DefultValue_WB1.Item3_StackSize);
                            break;
                        case 3:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item4_Item), DefultValue_WB1.Item4_StackSize);
                            break;
                        case 4:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item5_Item), DefultValue_WB1.Item5_StackSize);
                            break;
                        case 5:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item6_Item), DefultValue_WB1.Item6_StackSize);
                            break;
                        case 6:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item7_Item), DefultValue_WB1.Item7_StackSize);
                            break;
                        case 7:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item8_Item), DefultValue_WB1.Item8_StackSize);
                            break;
                        case 8:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item9_Item), DefultValue_WB1.Item9_StackSize);
                            break;
                        case 9:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item10_Item), DefultValue_WB1.Item10_StackSize);
                            break;
                        case 10:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item11_Item), DefultValue_WB1.Item11_StackSize);
                            break;
                        case 11:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item12_Item), DefultValue_WB1.Item12_StackSize);
                            break;
                        case 12:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item13_Item), DefultValue_WB1.Item13_StackSize);
                            break;
                        case 13:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item14_Item), DefultValue_WB1.Item14_StackSize);
                            break;
                        case 14:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item15_Item), DefultValue_WB1.Item15_StackSize);
                            break;
                        case 15:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item16_Item), DefultValue_WB1.Item16_StackSize);
                            break;
                        case 16:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item17_Item), DefultValue_WB1.Item17_StackSize);
                            break;
                        case 17:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item18_Item), DefultValue_WB1.Item18_StackSize);
                            break;
                        case 18:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item19_Item), DefultValue_WB1.Item19_StackSize);
                            break;
                        case 19:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
                            break;
                        case 20:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item21_Item), DefultValue_WB1.Item21_StackSize);
                            break;
                        case 21:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item22_Item), DefultValue_WB1.Item22_StackSize);
                            break;
                        case 22:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item23_Item), DefultValue_WB1.Item23_StackSize);
                            break;
                        case 23:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item24_Item), DefultValue_WB1.Item24_StackSize);
                            break;
                        case 24:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item25_Item), DefultValue_WB1.Item25_StackSize);
                            break;
                        case 25:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item26_Item), DefultValue_WB1.Item26_StackSize);
                            break;
                        case 26:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item27_Item), DefultValue_WB1.Item27_StackSize);
                            break;
                        case 27:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item28_Item), DefultValue_WB1.Item28_StackSize);
                            break;
                        case 28:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item29_Item), DefultValue_WB1.Item29_StackSize);
                            break;
                        case 29:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item30_Item), DefultValue_WB1.Item30_StackSize);
                            break;
                    }

                    ItemStack Item5 = null;
                    Random e = new Random();
                    int zufallE = e.nextInt(30);
                    switch (zufallE) {
                        case 0:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item1_Item), DefultValue_WB1.Item1_StackSize);
                            break;
                        case 1:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item2_Item), DefultValue_WB1.Item2_StackSize);
                            break;
                        case 2:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item3_Item), DefultValue_WB1.Item3_StackSize);
                            break;
                        case 3:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item4_Item), DefultValue_WB1.Item4_StackSize);
                            break;
                        case 4:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item5_Item), DefultValue_WB1.Item5_StackSize);
                            break;
                        case 5:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item6_Item), DefultValue_WB1.Item6_StackSize);
                            break;
                        case 6:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item7_Item), DefultValue_WB1.Item7_StackSize);
                            break;
                        case 7:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item8_Item), DefultValue_WB1.Item8_StackSize);
                            break;
                        case 8:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item9_Item), DefultValue_WB1.Item9_StackSize);
                            break;
                        case 9:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item10_Item), DefultValue_WB1.Item10_StackSize);
                            break;
                        case 10:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item11_Item), DefultValue_WB1.Item11_StackSize);
                            break;
                        case 11:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item12_Item), DefultValue_WB1.Item12_StackSize);
                            break;
                        case 12:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item13_Item), DefultValue_WB1.Item13_StackSize);
                            break;
                        case 13:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item14_Item), DefultValue_WB1.Item14_StackSize);
                            break;
                        case 14:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item15_Item), DefultValue_WB1.Item15_StackSize);
                            break;
                        case 15:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item16_Item), DefultValue_WB1.Item16_StackSize);
                            break;
                        case 16:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item17_Item), DefultValue_WB1.Item17_StackSize);
                            break;
                        case 17:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item18_Item), DefultValue_WB1.Item18_StackSize);
                            break;
                        case 18:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item19_Item), DefultValue_WB1.Item19_StackSize);
                            break;
                        case 19:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
                            break;
                        case 20:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item21_Item), DefultValue_WB1.Item21_StackSize);
                            break;
                        case 21:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item22_Item), DefultValue_WB1.Item22_StackSize);
                            break;
                        case 22:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item23_Item), DefultValue_WB1.Item23_StackSize);
                            break;
                        case 23:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item24_Item), DefultValue_WB1.Item24_StackSize);
                            break;
                        case 24:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item25_Item), DefultValue_WB1.Item25_StackSize);
                            break;
                        case 25:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item26_Item), DefultValue_WB1.Item26_StackSize);
                            break;
                        case 26:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item27_Item), DefultValue_WB1.Item27_StackSize);
                            break;
                        case 27:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item28_Item), DefultValue_WB1.Item28_StackSize);
                            break;
                        case 28:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item29_Item), DefultValue_WB1.Item29_StackSize);
                            break;
                        case 29:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item30_Item), DefultValue_WB1.Item30_StackSize);
                            break;
                    }

                    ItemStack Item6 = null;
                    Random f = new Random();
                    int zufallF = f.nextInt(30);
                    switch (zufallF) {
                        case 0:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item1_Item), DefultValue_WB1.Item1_StackSize);
                            break;
                        case 1:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item2_Item), DefultValue_WB1.Item2_StackSize);
                            break;
                        case 2:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item3_Item), DefultValue_WB1.Item3_StackSize);
                            break;
                        case 3:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item4_Item), DefultValue_WB1.Item4_StackSize);
                            break;
                        case 4:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item5_Item), DefultValue_WB1.Item5_StackSize);
                            break;
                        case 5:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item6_Item), DefultValue_WB1.Item6_StackSize);
                            break;
                        case 6:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item7_Item), DefultValue_WB1.Item7_StackSize);
                            break;
                        case 7:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item8_Item), DefultValue_WB1.Item8_StackSize);
                            break;
                        case 8:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item9_Item), DefultValue_WB1.Item9_StackSize);
                            break;
                        case 9:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item10_Item), DefultValue_WB1.Item10_StackSize);
                            break;
                        case 10:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item11_Item), DefultValue_WB1.Item11_StackSize);
                            break;
                        case 11:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item12_Item), DefultValue_WB1.Item12_StackSize);
                            break;
                        case 12:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item13_Item), DefultValue_WB1.Item13_StackSize);
                            break;
                        case 13:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item14_Item), DefultValue_WB1.Item14_StackSize);
                            break;
                        case 14:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item15_Item), DefultValue_WB1.Item15_StackSize);
                            break;
                        case 15:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item16_Item), DefultValue_WB1.Item16_StackSize);
                            break;
                        case 16:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item17_Item), DefultValue_WB1.Item17_StackSize);
                            break;
                        case 17:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item18_Item), DefultValue_WB1.Item18_StackSize);
                            break;
                        case 18:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item19_Item), DefultValue_WB1.Item19_StackSize);
                            break;
                        case 19:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
                            break;
                        case 20:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item21_Item), DefultValue_WB1.Item21_StackSize);
                            break;
                        case 21:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item22_Item), DefultValue_WB1.Item22_StackSize);
                            break;
                        case 22:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item23_Item), DefultValue_WB1.Item23_StackSize);
                            break;
                        case 23:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item24_Item), DefultValue_WB1.Item24_StackSize);
                            break;
                        case 24:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item25_Item), DefultValue_WB1.Item25_StackSize);
                            break;
                        case 25:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item26_Item), DefultValue_WB1.Item26_StackSize);
                            break;
                        case 26:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item27_Item), DefultValue_WB1.Item27_StackSize);
                            break;
                        case 27:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item28_Item), DefultValue_WB1.Item28_StackSize);
                            break;
                        case 28:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item29_Item), DefultValue_WB1.Item29_StackSize);
                            break;
                        case 29:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item30_Item), DefultValue_WB1.Item30_StackSize);
                            break;
                    }

                    ItemStack Item7 = null;
                    Random g = new Random();
                    int zufallG = g.nextInt(30);
                    switch (zufallG) {
                        case 0:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item1_Item), DefultValue_WB1.Item1_StackSize);
                            break;
                        case 1:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item2_Item), DefultValue_WB1.Item2_StackSize);
                            break;
                        case 2:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item3_Item), DefultValue_WB1.Item3_StackSize);
                            break;
                        case 3:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item4_Item), DefultValue_WB1.Item4_StackSize);
                            break;
                        case 4:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item5_Item), DefultValue_WB1.Item5_StackSize);
                            break;
                        case 5:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item6_Item), DefultValue_WB1.Item6_StackSize);
                            break;
                        case 6:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item7_Item), DefultValue_WB1.Item7_StackSize);
                            break;
                        case 7:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item8_Item), DefultValue_WB1.Item8_StackSize);
                            break;
                        case 8:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item9_Item), DefultValue_WB1.Item9_StackSize);
                            break;
                        case 9:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item10_Item), DefultValue_WB1.Item10_StackSize);
                            break;
                        case 10:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item11_Item), DefultValue_WB1.Item11_StackSize);
                            break;
                        case 11:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item12_Item), DefultValue_WB1.Item12_StackSize);
                            break;
                        case 12:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item13_Item), DefultValue_WB1.Item13_StackSize);
                            break;
                        case 13:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item14_Item), DefultValue_WB1.Item14_StackSize);
                            break;
                        case 14:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item15_Item), DefultValue_WB1.Item15_StackSize);
                            break;
                        case 15:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item16_Item), DefultValue_WB1.Item16_StackSize);
                            break;
                        case 16:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item17_Item), DefultValue_WB1.Item17_StackSize);
                            break;
                        case 17:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item18_Item), DefultValue_WB1.Item18_StackSize);
                            break;
                        case 18:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item19_Item), DefultValue_WB1.Item19_StackSize);
                            break;
                        case 19:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
                            break;
                        case 20:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item21_Item), DefultValue_WB1.Item21_StackSize);
                            break;
                        case 21:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item22_Item), DefultValue_WB1.Item22_StackSize);
                            break;
                        case 22:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item23_Item), DefultValue_WB1.Item23_StackSize);
                            break;
                        case 23:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item24_Item), DefultValue_WB1.Item24_StackSize);
                            break;
                        case 24:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item25_Item), DefultValue_WB1.Item25_StackSize);
                            break;
                        case 25:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item26_Item), DefultValue_WB1.Item26_StackSize);
                            break;
                        case 26:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item27_Item), DefultValue_WB1.Item27_StackSize);
                            break;
                        case 27:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item28_Item), DefultValue_WB1.Item28_StackSize);
                            break;
                        case 28:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item29_Item), DefultValue_WB1.Item29_StackSize);
                            break;
                        case 29:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item30_Item), DefultValue_WB1.Item30_StackSize);
                            break;
                    }

                    ItemStack Item8 = null;
                    Random h = new Random();
                    int zufallH = h.nextInt(30);
                    switch (zufallH) {
                        case 0:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item1_Item), DefultValue_WB1.Item1_StackSize);
                            break;
                        case 1:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item2_Item), DefultValue_WB1.Item2_StackSize);
                            break;
                        case 2:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item3_Item), DefultValue_WB1.Item3_StackSize);
                            break;
                        case 3:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item4_Item), DefultValue_WB1.Item4_StackSize);
                            break;
                        case 4:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item5_Item), DefultValue_WB1.Item5_StackSize);
                            break;
                        case 5:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item6_Item), DefultValue_WB1.Item6_StackSize);
                            break;
                        case 6:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item7_Item), DefultValue_WB1.Item7_StackSize);
                            break;
                        case 7:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item8_Item), DefultValue_WB1.Item8_StackSize);
                            break;
                        case 8:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item9_Item), DefultValue_WB1.Item9_StackSize);
                            break;
                        case 9:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item10_Item), DefultValue_WB1.Item10_StackSize);
                            break;
                        case 10:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item11_Item), DefultValue_WB1.Item11_StackSize);
                            break;
                        case 11:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item12_Item), DefultValue_WB1.Item12_StackSize);
                            break;
                        case 12:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item13_Item), DefultValue_WB1.Item13_StackSize);
                            break;
                        case 13:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item14_Item), DefultValue_WB1.Item14_StackSize);
                            break;
                        case 14:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item15_Item), DefultValue_WB1.Item15_StackSize);
                            break;
                        case 15:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item16_Item), DefultValue_WB1.Item16_StackSize);
                            break;
                        case 16:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item17_Item), DefultValue_WB1.Item17_StackSize);
                            break;
                        case 17:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item18_Item), DefultValue_WB1.Item18_StackSize);
                            break;
                        case 18:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item19_Item), DefultValue_WB1.Item19_StackSize);
                            break;
                        case 19:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
                            break;
                        case 20:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item21_Item), DefultValue_WB1.Item21_StackSize);
                            break;
                        case 21:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item22_Item), DefultValue_WB1.Item22_StackSize);
                            break;
                        case 22:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item23_Item), DefultValue_WB1.Item23_StackSize);
                            break;
                        case 23:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item24_Item), DefultValue_WB1.Item24_StackSize);
                            break;
                        case 24:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item25_Item), DefultValue_WB1.Item25_StackSize);
                            break;
                        case 25:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item26_Item), DefultValue_WB1.Item26_StackSize);
                            break;
                        case 26:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item27_Item), DefultValue_WB1.Item27_StackSize);
                            break;
                        case 27:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item28_Item), DefultValue_WB1.Item28_StackSize);
                            break;
                        case 28:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item29_Item), DefultValue_WB1.Item29_StackSize);
                            break;
                        case 29:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item30_Item), DefultValue_WB1.Item30_StackSize);
                            break;
                    }

                    ItemStack Item9 = null;
                    Random i = new Random();
                    int zufallI = i.nextInt(30);
                    switch (zufallI) {
                        case 0:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item1_Item), DefultValue_WB1.Item1_StackSize);
                            break;
                        case 1:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item2_Item), DefultValue_WB1.Item2_StackSize);
                            break;
                        case 2:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item3_Item), DefultValue_WB1.Item3_StackSize);
                            break;
                        case 3:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item4_Item), DefultValue_WB1.Item4_StackSize);
                            break;
                        case 4:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item5_Item), DefultValue_WB1.Item5_StackSize);
                            break;
                        case 5:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item6_Item), DefultValue_WB1.Item6_StackSize);
                            break;
                        case 6:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item7_Item), DefultValue_WB1.Item7_StackSize);
                            break;
                        case 7:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item8_Item), DefultValue_WB1.Item8_StackSize);
                            break;
                        case 8:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item9_Item), DefultValue_WB1.Item9_StackSize);
                            break;
                        case 9:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item10_Item), DefultValue_WB1.Item10_StackSize);
                            break;
                        case 10:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item11_Item), DefultValue_WB1.Item11_StackSize);
                            break;
                        case 11:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item12_Item), DefultValue_WB1.Item12_StackSize);
                            break;
                        case 12:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item13_Item), DefultValue_WB1.Item13_StackSize);
                            break;
                        case 13:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item14_Item), DefultValue_WB1.Item14_StackSize);
                            break;
                        case 14:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item15_Item), DefultValue_WB1.Item15_StackSize);
                            break;
                        case 15:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item16_Item), DefultValue_WB1.Item16_StackSize);
                            break;
                        case 16:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item17_Item), DefultValue_WB1.Item17_StackSize);
                            break;
                        case 17:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item18_Item), DefultValue_WB1.Item18_StackSize);
                            break;
                        case 18:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item19_Item), DefultValue_WB1.Item19_StackSize);
                            break;
                        case 19:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
                            break;
                        case 20:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item21_Item), DefultValue_WB1.Item21_StackSize);
                            break;
                        case 21:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item22_Item), DefultValue_WB1.Item22_StackSize);
                            break;
                        case 22:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item23_Item), DefultValue_WB1.Item23_StackSize);
                            break;
                        case 23:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item24_Item), DefultValue_WB1.Item24_StackSize);
                            break;
                        case 24:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item25_Item), DefultValue_WB1.Item25_StackSize);
                            break;
                        case 25:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item26_Item), DefultValue_WB1.Item26_StackSize);
                            break;
                        case 26:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item27_Item), DefultValue_WB1.Item27_StackSize);
                            break;
                        case 27:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item28_Item), DefultValue_WB1.Item28_StackSize);
                            break;
                        case 28:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item29_Item), DefultValue_WB1.Item29_StackSize);
                            break;
                        case 29:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item30_Item), DefultValue_WB1.Item30_StackSize);
                            break;
                    }

                    if (DefultValue_WB1.Item_anz == 1 || DefultValue_WB1.Item_anz > 1 || DefultValue_WB1.Item_anz < 1) {
                        inventory.addItem(Item1);

                    }
                    if (DefultValue_WB1.Item_anz == 2 || DefultValue_WB1.Item_anz > 2) {
                        inventory.addItem(Item2);
                    }
                    if (DefultValue_WB1.Item_anz == 3 || DefultValue_WB1.Item_anz > 3) {
                        inventory.addItem(Item3);
                    }
                    if (DefultValue_WB1.Item_anz == 4 || DefultValue_WB1.Item_anz > 4) {
                        inventory.addItem(Item4);
                    }
                    if (DefultValue_WB1.Item_anz == 5 || DefultValue_WB1.Item_anz > 5) {
                        inventory.addItem(Item5);
                    }
                    if (DefultValue_WB1.Item_anz == 6 || DefultValue_WB1.Item_anz > 6) {
                        inventory.addItem(Item6);
                    }
                    if (DefultValue_WB1.Item_anz == 7 || DefultValue_WB1.Item_anz > 7) {
                        inventory.addItem(Item7);
                    }
                    if (DefultValue_WB1.Item_anz == 8 || DefultValue_WB1.Item_anz > 8) {
                        inventory.addItem(Item8);
                    }
                    if (DefultValue_WB1.Item_anz == 9 || DefultValue_WB1.Item_anz > 9) {
                        inventory.addItem(Item9);
                    }
                    player.openInventory(inventory);
                    player.getInventory().remove(Material.valueOf(DefultValue_WB1.ChestName));
                }
            }
        }
    }




/*
    @EventHandler
    public void onInteractWB3(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getItem() != null) {
            ItemStack item = player.getItemInHand();
            NBTItem nbti = new NBTItem(item);
            if (event.getItem().getType() == Material.valueOf(DefultValue.Item)) {
                if (nbti.hasKey("loot_chest_2")) {
                    Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9 * 1, "§6§9§l§r" + DefultValue_WB3.ChestName);

                    ItemStack Item1 = null;
                    Random a = new Random();
                    int zufallA = a.nextInt(30);
                    switch (zufallA) {
                        case 0:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item1_Item), DefultValue_WB2.Item1_StackSize);
                            break;
                        case 1:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item2_Item), DefultValue_WB2.Item2_StackSize);
                            break;
                        case 2:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item3_Item), DefultValue_WB2.Item3_StackSize);
                            break;
                        case 3:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item4_Item), DefultValue_WB2.Item4_StackSize);
                            break;
                        case 4:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item5_Item), DefultValue_WB2.Item5_StackSize);
                            break;
                        case 5:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item6_Item), DefultValue_WB2.Item6_StackSize);
                            break;
                        case 6:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item7_Item), DefultValue_WB2.Item7_StackSize);
                            break;
                        case 7:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item8_Item), DefultValue_WB2.Item8_StackSize);
                            break;
                        case 8:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item9_Item), DefultValue_WB2.Item9_StackSize);
                            break;
                        case 9:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item10_Item), DefultValue_WB2.Item10_StackSize);
                            break;
                        case 10:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item11_Item), DefultValue_WB2.Item11_StackSize);
                            break;
                        case 11:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item12_Item), DefultValue_WB2.Item12_StackSize);
                            break;
                        case 12:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item13_Item), DefultValue_WB2.Item13_StackSize);
                            break;
                        case 13:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item14_Item), DefultValue_WB2.Item14_StackSize);
                            break;
                        case 14:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item15_Item), DefultValue_WB2.Item15_StackSize);
                            break;
                        case 15:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item16_Item), DefultValue_WB2.Item16_StackSize);
                            break;
                        case 16:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item17_Item), DefultValue_WB2.Item17_StackSize);
                            break;
                        case 17:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item18_Item), DefultValue_WB2.Item18_StackSize);
                            break;
                        case 18:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item19_Item), DefultValue_WB2.Item19_StackSize);
                            break;
                        case 19:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item20_Item), DefultValue_WB2.Item20_StackSize);
                            break;
                        case 20:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item21_Item), DefultValue_WB2.Item21_StackSize);
                            break;
                        case 21:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item22_Item), DefultValue_WB2.Item22_StackSize);
                            break;
                        case 22:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item23_Item), DefultValue_WB2.Item23_StackSize);
                            break;
                        case 23:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item24_Item), DefultValue_WB2.Item24_StackSize);
                            break;
                        case 24:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item25_Item), DefultValue_WB2.Item25_StackSize);
                            break;
                        case 25:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item26_Item), DefultValue_WB2.Item26_StackSize);
                            break;
                        case 26:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item27_Item), DefultValue_WB2.Item27_StackSize);
                            break;
                        case 27:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item28_Item), DefultValue_WB2.Item28_StackSize);
                            break;
                        case 28:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item29_Item), DefultValue_WB2.Item29_StackSize);
                            break;
                        case 29:
                            Item1 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item30_Item), DefultValue_WB2.Item30_StackSize);
                            break;
                    }

                    ItemStack Item2 = null;
                    Random b = new Random();
                    int zufallB = b.nextInt(30);
                    switch (zufallB) {
                        case 0:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item1_Item), DefultValue_WB2.Item1_StackSize);
                            break;
                        case 1:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item2_Item), DefultValue_WB2.Item2_StackSize);
                            break;
                        case 2:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item3_Item), DefultValue_WB2.Item3_StackSize);
                            break;
                        case 3:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item4_Item), DefultValue_WB2.Item4_StackSize);
                            break;
                        case 4:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item5_Item), DefultValue_WB2.Item5_StackSize);
                            break;
                        case 5:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item6_Item), DefultValue_WB2.Item6_StackSize);
                            break;
                        case 6:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item7_Item), DefultValue_WB2.Item7_StackSize);
                            break;
                        case 7:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item8_Item), DefultValue_WB2.Item8_StackSize);
                            break;
                        case 8:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item9_Item), DefultValue_WB2.Item9_StackSize);
                            break;
                        case 9:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item10_Item), DefultValue_WB2.Item10_StackSize);
                            break;
                        case 10:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item11_Item), DefultValue_WB2.Item11_StackSize);
                            break;
                        case 11:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item12_Item), DefultValue_WB2.Item12_StackSize);
                            break;
                        case 12:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item13_Item), DefultValue_WB2.Item13_StackSize);
                            break;
                        case 13:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item14_Item), DefultValue_WB2.Item14_StackSize);
                            break;
                        case 14:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item15_Item), DefultValue_WB2.Item15_StackSize);
                            break;
                        case 15:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item16_Item), DefultValue_WB2.Item16_StackSize);
                            break;
                        case 16:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item17_Item), DefultValue_WB2.Item17_StackSize);
                            break;
                        case 17:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item18_Item), DefultValue_WB2.Item18_StackSize);
                            break;
                        case 18:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item19_Item), DefultValue_WB2.Item19_StackSize);
                            break;
                        case 19:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item20_Item), DefultValue_WB2.Item20_StackSize);
                            break;
                        case 20:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item21_Item), DefultValue_WB2.Item21_StackSize);
                            break;
                        case 21:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item22_Item), DefultValue_WB2.Item22_StackSize);
                            break;
                        case 22:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item23_Item), DefultValue_WB2.Item23_StackSize);
                            break;
                        case 23:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item24_Item), DefultValue_WB2.Item24_StackSize);
                            break;
                        case 24:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item25_Item), DefultValue_WB2.Item25_StackSize);
                            break;
                        case 25:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item26_Item), DefultValue_WB2.Item26_StackSize);
                            break;
                        case 26:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item27_Item), DefultValue_WB2.Item27_StackSize);
                            break;
                        case 27:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item28_Item), DefultValue_WB2.Item28_StackSize);
                            break;
                        case 28:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item29_Item), DefultValue_WB2.Item29_StackSize);
                            break;
                        case 29:
                            Item2 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item30_Item), DefultValue_WB2.Item30_StackSize);
                            break;
                    }

                    ItemStack Item3 = null;
                    Random c = new Random();
                    int zufallC = c.nextInt(30);
                    switch (zufallC) {
                        case 0:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item1_Item), DefultValue_WB2.Item1_StackSize);
                            break;
                        case 1:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item2_Item), DefultValue_WB2.Item2_StackSize);
                            break;
                        case 2:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item3_Item), DefultValue_WB2.Item3_StackSize);
                            break;
                        case 3:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item4_Item), DefultValue_WB2.Item4_StackSize);
                            break;
                        case 4:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item5_Item), DefultValue_WB2.Item5_StackSize);
                            break;
                        case 5:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item6_Item), DefultValue_WB2.Item6_StackSize);
                            break;
                        case 6:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item7_Item), DefultValue_WB2.Item7_StackSize);
                            break;
                        case 7:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item8_Item), DefultValue_WB2.Item8_StackSize);
                            break;
                        case 8:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item9_Item), DefultValue_WB2.Item9_StackSize);
                            break;
                        case 9:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item10_Item), DefultValue_WB2.Item10_StackSize);
                            break;
                        case 10:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item11_Item), DefultValue_WB2.Item11_StackSize);
                            break;
                        case 11:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item12_Item), DefultValue_WB2.Item12_StackSize);
                            break;
                        case 12:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item13_Item), DefultValue_WB2.Item13_StackSize);
                            break;
                        case 13:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item14_Item), DefultValue_WB2.Item14_StackSize);
                            break;
                        case 14:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item15_Item), DefultValue_WB2.Item15_StackSize);
                            break;
                        case 15:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item16_Item), DefultValue_WB2.Item16_StackSize);
                            break;
                        case 16:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item17_Item), DefultValue_WB2.Item17_StackSize);
                            break;
                        case 17:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item18_Item), DefultValue_WB2.Item18_StackSize);
                            break;
                        case 18:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item19_Item), DefultValue_WB2.Item19_StackSize);
                            break;
                        case 19:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item20_Item), DefultValue_WB2.Item20_StackSize);
                            break;
                        case 20:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item21_Item), DefultValue_WB2.Item21_StackSize);
                            break;
                        case 21:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item22_Item), DefultValue_WB2.Item22_StackSize);
                            break;
                        case 22:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item23_Item), DefultValue_WB2.Item23_StackSize);
                            break;
                        case 23:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item24_Item), DefultValue_WB2.Item24_StackSize);
                            break;
                        case 24:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item25_Item), DefultValue_WB2.Item25_StackSize);
                            break;
                        case 25:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item26_Item), DefultValue_WB2.Item26_StackSize);
                            break;
                        case 26:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item27_Item), DefultValue_WB2.Item27_StackSize);
                            break;
                        case 27:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item28_Item), DefultValue_WB2.Item28_StackSize);
                            break;
                        case 28:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item29_Item), DefultValue_WB2.Item29_StackSize);
                            break;
                        case 29:
                            Item3 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item30_Item), DefultValue_WB2.Item30_StackSize);
                            break;
                    }

                    ItemStack Item4 = null;
                    Random d = new Random();
                    int zufallD = d.nextInt(30);
                    switch (zufallD) {
                        case 0:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item1_Item), DefultValue_WB2.Item1_StackSize);
                            break;
                        case 1:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item2_Item), DefultValue_WB2.Item2_StackSize);
                            break;
                        case 2:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item3_Item), DefultValue_WB2.Item3_StackSize);
                            break;
                        case 3:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item4_Item), DefultValue_WB2.Item4_StackSize);
                            break;
                        case 4:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item5_Item), DefultValue_WB2.Item5_StackSize);
                            break;
                        case 5:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item6_Item), DefultValue_WB2.Item6_StackSize);
                            break;
                        case 6:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item7_Item), DefultValue_WB2.Item7_StackSize);
                            break;
                        case 7:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item8_Item), DefultValue_WB2.Item8_StackSize);
                            break;
                        case 8:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item9_Item), DefultValue_WB2.Item9_StackSize);
                            break;
                        case 9:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item10_Item), DefultValue_WB2.Item10_StackSize);
                            break;
                        case 10:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item11_Item), DefultValue_WB2.Item11_StackSize);
                            break;
                        case 11:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item12_Item), DefultValue_WB2.Item12_StackSize);
                            break;
                        case 12:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item13_Item), DefultValue_WB2.Item13_StackSize);
                            break;
                        case 13:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item14_Item), DefultValue_WB2.Item14_StackSize);
                            break;
                        case 14:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item15_Item), DefultValue_WB2.Item15_StackSize);
                            break;
                        case 15:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item16_Item), DefultValue_WB2.Item16_StackSize);
                            break;
                        case 16:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item17_Item), DefultValue_WB2.Item17_StackSize);
                            break;
                        case 17:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item18_Item), DefultValue_WB2.Item18_StackSize);
                            break;
                        case 18:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item19_Item), DefultValue_WB2.Item19_StackSize);
                            break;
                        case 19:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item20_Item), DefultValue_WB2.Item20_StackSize);
                            break;
                        case 20:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item21_Item), DefultValue_WB2.Item21_StackSize);
                            break;
                        case 21:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item22_Item), DefultValue_WB2.Item22_StackSize);
                            break;
                        case 22:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item23_Item), DefultValue_WB2.Item23_StackSize);
                            break;
                        case 23:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item24_Item), DefultValue_WB2.Item24_StackSize);
                            break;
                        case 24:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item25_Item), DefultValue_WB2.Item25_StackSize);
                            break;
                        case 25:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item26_Item), DefultValue_WB2.Item26_StackSize);
                            break;
                        case 26:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item27_Item), DefultValue_WB2.Item27_StackSize);
                            break;
                        case 27:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item28_Item), DefultValue_WB2.Item28_StackSize);
                            break;
                        case 28:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item29_Item), DefultValue_WB2.Item29_StackSize);
                            break;
                        case 29:
                            Item4 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item30_Item), DefultValue_WB2.Item30_StackSize);
                            break;
                    }

                    ItemStack Item5 = null;
                    Random e = new Random();
                    int zufallE = e.nextInt(30);
                    switch (zufallE) {
                        case 0:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item1_Item), DefultValue_WB2.Item1_StackSize);
                            break;
                        case 1:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item2_Item), DefultValue_WB2.Item2_StackSize);
                            break;
                        case 2:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item3_Item), DefultValue_WB2.Item3_StackSize);
                            break;
                        case 3:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item4_Item), DefultValue_WB2.Item4_StackSize);
                            break;
                        case 4:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item5_Item), DefultValue_WB2.Item5_StackSize);
                            break;
                        case 5:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item6_Item), DefultValue_WB2.Item6_StackSize);
                            break;
                        case 6:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item7_Item), DefultValue_WB2.Item7_StackSize);
                            break;
                        case 7:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item8_Item), DefultValue_WB2.Item8_StackSize);
                            break;
                        case 8:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item9_Item), DefultValue_WB2.Item9_StackSize);
                            break;
                        case 9:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item10_Item), DefultValue_WB2.Item10_StackSize);
                            break;
                        case 10:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item11_Item), DefultValue_WB2.Item11_StackSize);
                            break;
                        case 11:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item12_Item), DefultValue_WB2.Item12_StackSize);
                            break;
                        case 12:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item13_Item), DefultValue_WB2.Item13_StackSize);
                            break;
                        case 13:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item14_Item), DefultValue_WB2.Item14_StackSize);
                            break;
                        case 14:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item15_Item), DefultValue_WB2.Item15_StackSize);
                            break;
                        case 15:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item16_Item), DefultValue_WB2.Item16_StackSize);
                            break;
                        case 16:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item17_Item), DefultValue_WB2.Item17_StackSize);
                            break;
                        case 17:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item18_Item), DefultValue_WB2.Item18_StackSize);
                            break;
                        case 18:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item19_Item), DefultValue_WB2.Item19_StackSize);
                            break;
                        case 19:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item20_Item), DefultValue_WB2.Item20_StackSize);
                            break;
                        case 20:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item21_Item), DefultValue_WB2.Item21_StackSize);
                            break;
                        case 21:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item22_Item), DefultValue_WB2.Item22_StackSize);
                            break;
                        case 22:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item23_Item), DefultValue_WB2.Item23_StackSize);
                            break;
                        case 23:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item24_Item), DefultValue_WB2.Item24_StackSize);
                            break;
                        case 24:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item25_Item), DefultValue_WB2.Item25_StackSize);
                            break;
                        case 25:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item26_Item), DefultValue_WB2.Item26_StackSize);
                            break;
                        case 26:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item27_Item), DefultValue_WB2.Item27_StackSize);
                            break;
                        case 27:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item28_Item), DefultValue_WB2.Item28_StackSize);
                            break;
                        case 28:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item29_Item), DefultValue_WB2.Item29_StackSize);
                            break;
                        case 29:
                            Item5 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item30_Item), DefultValue_WB2.Item30_StackSize);
                            break;
                    }

                    ItemStack Item6 = null;
                    Random f = new Random();
                    int zufallF = f.nextInt(30);
                    switch (zufallF) {
                        case 0:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item1_Item), DefultValue_WB2.Item1_StackSize);
                            break;
                        case 1:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item2_Item), DefultValue_WB2.Item2_StackSize);
                            break;
                        case 2:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item3_Item), DefultValue_WB2.Item3_StackSize);
                            break;
                        case 3:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item4_Item), DefultValue_WB2.Item4_StackSize);
                            break;
                        case 4:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item5_Item), DefultValue_WB2.Item5_StackSize);
                            break;
                        case 5:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item6_Item), DefultValue_WB2.Item6_StackSize);
                            break;
                        case 6:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item7_Item), DefultValue_WB2.Item7_StackSize);
                            break;
                        case 7:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item8_Item), DefultValue_WB2.Item8_StackSize);
                            break;
                        case 8:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item9_Item), DefultValue_WB2.Item9_StackSize);
                            break;
                        case 9:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item10_Item), DefultValue_WB2.Item10_StackSize);
                            break;
                        case 10:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item11_Item), DefultValue_WB2.Item11_StackSize);
                            break;
                        case 11:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item12_Item), DefultValue_WB2.Item12_StackSize);
                            break;
                        case 12:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item13_Item), DefultValue_WB2.Item13_StackSize);
                            break;
                        case 13:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item14_Item), DefultValue_WB2.Item14_StackSize);
                            break;
                        case 14:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item15_Item), DefultValue_WB2.Item15_StackSize);
                            break;
                        case 15:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item16_Item), DefultValue_WB2.Item16_StackSize);
                            break;
                        case 16:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item17_Item), DefultValue_WB2.Item17_StackSize);
                            break;
                        case 17:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item18_Item), DefultValue_WB2.Item18_StackSize);
                            break;
                        case 18:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item19_Item), DefultValue_WB2.Item19_StackSize);
                            break;
                        case 19:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item20_Item), DefultValue_WB2.Item20_StackSize);
                            break;
                        case 20:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item21_Item), DefultValue_WB2.Item21_StackSize);
                            break;
                        case 21:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item22_Item), DefultValue_WB2.Item22_StackSize);
                            break;
                        case 22:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item23_Item), DefultValue_WB2.Item23_StackSize);
                            break;
                        case 23:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item24_Item), DefultValue_WB2.Item24_StackSize);
                            break;
                        case 24:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item25_Item), DefultValue_WB2.Item25_StackSize);
                            break;
                        case 25:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item26_Item), DefultValue_WB2.Item26_StackSize);
                            break;
                        case 26:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item27_Item), DefultValue_WB2.Item27_StackSize);
                            break;
                        case 27:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item28_Item), DefultValue_WB2.Item28_StackSize);
                            break;
                        case 28:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item29_Item), DefultValue_WB2.Item29_StackSize);
                            break;
                        case 29:
                            Item6 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item30_Item), DefultValue_WB2.Item30_StackSize);
                            break;
                    }

                    ItemStack Item7 = null;
                    Random g = new Random();
                    int zufallG = g.nextInt(30);
                    switch (zufallG) {
                        case 0:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item1_Item), DefultValue_WB2.Item1_StackSize);
                            break;
                        case 1:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item2_Item), DefultValue_WB2.Item2_StackSize);
                            break;
                        case 2:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item3_Item), DefultValue_WB2.Item3_StackSize);
                            break;
                        case 3:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item4_Item), DefultValue_WB2.Item4_StackSize);
                            break;
                        case 4:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item5_Item), DefultValue_WB2.Item5_StackSize);
                            break;
                        case 5:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item6_Item), DefultValue_WB2.Item6_StackSize);
                            break;
                        case 6:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item7_Item), DefultValue_WB2.Item7_StackSize);
                            break;
                        case 7:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item8_Item), DefultValue_WB2.Item8_StackSize);
                            break;
                        case 8:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item9_Item), DefultValue_WB2.Item9_StackSize);
                            break;
                        case 9:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item10_Item), DefultValue_WB2.Item10_StackSize);
                            break;
                        case 10:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item11_Item), DefultValue_WB2.Item11_StackSize);
                            break;
                        case 11:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item12_Item), DefultValue_WB2.Item12_StackSize);
                            break;
                        case 12:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item13_Item), DefultValue_WB2.Item13_StackSize);
                            break;
                        case 13:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item14_Item), DefultValue_WB2.Item14_StackSize);
                            break;
                        case 14:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item15_Item), DefultValue_WB2.Item15_StackSize);
                            break;
                        case 15:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item16_Item), DefultValue_WB2.Item16_StackSize);
                            break;
                        case 16:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item17_Item), DefultValue_WB2.Item17_StackSize);
                            break;
                        case 17:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item18_Item), DefultValue_WB2.Item18_StackSize);
                            break;
                        case 18:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item19_Item), DefultValue_WB2.Item19_StackSize);
                            break;
                        case 19:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item20_Item), DefultValue_WB2.Item20_StackSize);
                            break;
                        case 20:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item21_Item), DefultValue_WB2.Item21_StackSize);
                            break;
                        case 21:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item22_Item), DefultValue_WB2.Item22_StackSize);
                            break;
                        case 22:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item23_Item), DefultValue_WB2.Item23_StackSize);
                            break;
                        case 23:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item24_Item), DefultValue_WB2.Item24_StackSize);
                            break;
                        case 24:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item25_Item), DefultValue_WB2.Item25_StackSize);
                            break;
                        case 25:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item26_Item), DefultValue_WB2.Item26_StackSize);
                            break;
                        case 26:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item27_Item), DefultValue_WB2.Item27_StackSize);
                            break;
                        case 27:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item28_Item), DefultValue_WB2.Item28_StackSize);
                            break;
                        case 28:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item29_Item), DefultValue_WB2.Item29_StackSize);
                            break;
                        case 29:
                            Item7 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item30_Item), DefultValue_WB2.Item30_StackSize);
                            break;
                    }

                    ItemStack Item8 = null;
                    Random h = new Random();
                    int zufallH = h.nextInt(30);
                    switch (zufallH) {
                        case 0:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item1_Item), DefultValue_WB2.Item1_StackSize);
                            break;
                        case 1:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item2_Item), DefultValue_WB2.Item2_StackSize);
                            break;
                        case 2:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item3_Item), DefultValue_WB2.Item3_StackSize);
                            break;
                        case 3:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item4_Item), DefultValue_WB2.Item4_StackSize);
                            break;
                        case 4:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item5_Item), DefultValue_WB2.Item5_StackSize);
                            break;
                        case 5:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item6_Item), DefultValue_WB2.Item6_StackSize);
                            break;
                        case 6:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item7_Item), DefultValue_WB2.Item7_StackSize);
                            break;
                        case 7:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item8_Item), DefultValue_WB2.Item8_StackSize);
                            break;
                        case 8:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item9_Item), DefultValue_WB2.Item9_StackSize);
                            break;
                        case 9:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item10_Item), DefultValue_WB2.Item10_StackSize);
                            break;
                        case 10:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item11_Item), DefultValue_WB2.Item11_StackSize);
                            break;
                        case 11:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item12_Item), DefultValue_WB2.Item12_StackSize);
                            break;
                        case 12:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item13_Item), DefultValue_WB2.Item13_StackSize);
                            break;
                        case 13:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item14_Item), DefultValue_WB2.Item14_StackSize);
                            break;
                        case 14:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item15_Item), DefultValue_WB2.Item15_StackSize);
                            break;
                        case 15:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item16_Item), DefultValue_WB2.Item16_StackSize);
                            break;
                        case 16:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item17_Item), DefultValue_WB2.Item17_StackSize);
                            break;
                        case 17:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item18_Item), DefultValue_WB2.Item18_StackSize);
                            break;
                        case 18:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item19_Item), DefultValue_WB2.Item19_StackSize);
                            break;
                        case 19:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item20_Item), DefultValue_WB2.Item20_StackSize);
                            break;
                        case 20:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item21_Item), DefultValue_WB2.Item21_StackSize);
                            break;
                        case 21:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item22_Item), DefultValue_WB2.Item22_StackSize);
                            break;
                        case 22:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item23_Item), DefultValue_WB2.Item23_StackSize);
                            break;
                        case 23:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item24_Item), DefultValue_WB2.Item24_StackSize);
                            break;
                        case 24:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item25_Item), DefultValue_WB2.Item25_StackSize);
                            break;
                        case 25:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item26_Item), DefultValue_WB2.Item26_StackSize);
                            break;
                        case 26:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item27_Item), DefultValue_WB2.Item27_StackSize);
                            break;
                        case 27:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item28_Item), DefultValue_WB2.Item28_StackSize);
                            break;
                        case 28:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item29_Item), DefultValue_WB2.Item29_StackSize);
                            break;
                        case 29:
                            Item8 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item30_Item), DefultValue_WB2.Item30_StackSize);
                            break;
                    }

                    ItemStack Item9 = null;
                    Random i = new Random();
                    int zufallI = i.nextInt(30);
                    switch (zufallI) {
                        case 0:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item1_Item), DefultValue_WB2.Item1_StackSize);
                            break;
                        case 1:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item2_Item), DefultValue_WB2.Item2_StackSize);
                            break;
                        case 2:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item3_Item), DefultValue_WB2.Item3_StackSize);
                            break;
                        case 3:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item4_Item), DefultValue_WB2.Item4_StackSize);
                            break;
                        case 4:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item5_Item), DefultValue_WB2.Item5_StackSize);
                            break;
                        case 5:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item6_Item), DefultValue_WB2.Item6_StackSize);
                            break;
                        case 6:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item7_Item), DefultValue_WB2.Item7_StackSize);
                            break;
                        case 7:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item8_Item), DefultValue_WB2.Item8_StackSize);
                            break;
                        case 8:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item9_Item), DefultValue_WB2.Item9_StackSize);
                            break;
                        case 9:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item10_Item), DefultValue_WB2.Item10_StackSize);
                            break;
                        case 10:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item11_Item), DefultValue_WB2.Item11_StackSize);
                            break;
                        case 11:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item12_Item), DefultValue_WB2.Item12_StackSize);
                            break;
                        case 12:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item13_Item), DefultValue_WB2.Item13_StackSize);
                            break;
                        case 13:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item14_Item), DefultValue_WB2.Item14_StackSize);
                            break;
                        case 14:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item15_Item), DefultValue_WB2.Item15_StackSize);
                            break;
                        case 15:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item16_Item), DefultValue_WB2.Item16_StackSize);
                            break;
                        case 16:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item17_Item), DefultValue_WB2.Item17_StackSize);
                            break;
                        case 17:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item18_Item), DefultValue_WB2.Item18_StackSize);
                            break;
                        case 18:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item19_Item), DefultValue_WB2.Item19_StackSize);
                            break;
                        case 19:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item20_Item), DefultValue_WB2.Item20_StackSize);
                            break;
                        case 20:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item21_Item), DefultValue_WB2.Item21_StackSize);
                            break;
                        case 21:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item22_Item), DefultValue_WB2.Item22_StackSize);
                            break;
                        case 22:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item23_Item), DefultValue_WB2.Item23_StackSize);
                            break;
                        case 23:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item24_Item), DefultValue_WB2.Item24_StackSize);
                            break;
                        case 24:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item25_Item), DefultValue_WB2.Item25_StackSize);
                            break;
                        case 25:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item26_Item), DefultValue_WB2.Item26_StackSize);
                            break;
                        case 26:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item27_Item), DefultValue_WB2.Item27_StackSize);
                            break;
                        case 27:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item28_Item), DefultValue_WB2.Item28_StackSize);
                            break;
                        case 28:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item29_Item), DefultValue_WB2.Item29_StackSize);
                            break;
                        case 29:
                            Item9 = new ItemStack(Material.getMaterial(DefultValue_WB2.Item30_Item), DefultValue_WB2.Item30_StackSize);
                            break;
                    }

                    if (DefultValue_WB2.Item_anz == 1 || DefultValue_WB2.Item_anz > 1 || DefultValue_WB2.Item_anz < 1) {
                        inventory.addItem(Item1);
                    }
                    if (DefultValue_WB2.Item_anz == 2 || DefultValue_WB2.Item_anz > 2) {
                        inventory.addItem(Item2);
                    }
                    if (DefultValue_WB2.Item_anz == 3 || DefultValue_WB2.Item_anz > 3) {
                        inventory.addItem(Item3);
                    }
                    if (DefultValue_WB2.Item_anz == 4 || DefultValue_WB2.Item_anz > 4) {
                        inventory.addItem(Item4);
                    }
                    if (DefultValue_WB2.Item_anz == 5 || DefultValue_WB2.Item_anz > 5) {
                        inventory.addItem(Item5);
                    }
                    if (DefultValue_WB2.Item_anz == 6 || DefultValue_WB2.Item_anz > 6) {
                        inventory.addItem(Item6);
                    }
                    if (DefultValue_WB2.Item_anz == 7 || DefultValue_WB2.Item_anz > 7) {
                        inventory.addItem(Item7);
                    }
                    if (DefultValue_WB2.Item_anz == 8 || DefultValue_WB2.Item_anz > 8) {
                        inventory.addItem(Item8);
                    }
                    if (DefultValue_WB2.Item_anz == 9 || DefultValue_WB2.Item_anz > 9) {
                        inventory.addItem(Item9);
                    }
                    player.openInventory(inventory);

                }
            }
        }
    }


    @EventHandler
    public void onInteractWB2(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getItem() != null) {
            ItemStack item = player.getItemInHand();
            if (player.getItemInHand() != null) {
                NBTItem nbti = new NBTItem(item);
                if (event.getItem().getType() == Material.valueOf(DefultValue.Item)) {
                    if (nbti.hasKey("loot_chest_3")) {
                        Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9 * 1, "§6§9§l§r" + DefultValue_WB3.ChestName);

                        ItemStack Item1 = null;
                        Random a = new Random();
                        int zufallA = a.nextInt(30);
                        switch (zufallA) {
                            case 0:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item1_Item), DefultValue_WB3.Item1_StackSize);
                                break;
                            case 1:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item2_Item), DefultValue_WB3.Item2_StackSize);
                                break;
                            case 2:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item3_Item), DefultValue_WB3.Item3_StackSize);
                                break;
                            case 3:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item4_Item), DefultValue_WB3.Item4_StackSize);
                                break;
                            case 4:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item5_Item), DefultValue_WB3.Item5_StackSize);
                                break;
                            case 5:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item6_Item), DefultValue_WB3.Item6_StackSize);
                                break;
                            case 6:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item7_Item), DefultValue_WB3.Item7_StackSize);
                                break;
                            case 7:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item8_Item), DefultValue_WB3.Item8_StackSize);
                                break;
                            case 8:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item9_Item), DefultValue_WB3.Item9_StackSize);
                                break;
                            case 9:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item10_Item), DefultValue_WB3.Item10_StackSize);
                                break;
                            case 10:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item11_Item), DefultValue_WB3.Item11_StackSize);
                                break;
                            case 11:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item12_Item), DefultValue_WB3.Item12_StackSize);
                                break;
                            case 12:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item13_Item), DefultValue_WB3.Item13_StackSize);
                                break;
                            case 13:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item14_Item), DefultValue_WB3.Item14_StackSize);
                                break;
                            case 14:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item15_Item), DefultValue_WB3.Item15_StackSize);
                                break;
                            case 15:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item16_Item), DefultValue_WB3.Item16_StackSize);
                                break;
                            case 16:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item17_Item), DefultValue_WB3.Item17_StackSize);
                                break;
                            case 17:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item18_Item), DefultValue_WB3.Item18_StackSize);
                                break;
                            case 18:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item19_Item), DefultValue_WB3.Item19_StackSize);
                                break;
                            case 19:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item20_Item), DefultValue_WB3.Item20_StackSize);
                                break;
                            case 20:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item21_Item), DefultValue_WB3.Item21_StackSize);
                                break;
                            case 21:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item22_Item), DefultValue_WB3.Item22_StackSize);
                                break;
                            case 22:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item23_Item), DefultValue_WB3.Item23_StackSize);
                                break;
                            case 23:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item24_Item), DefultValue_WB3.Item24_StackSize);
                                break;
                            case 24:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item25_Item), DefultValue_WB3.Item25_StackSize);
                                break;
                            case 25:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item26_Item), DefultValue_WB3.Item26_StackSize);
                                break;
                            case 26:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item27_Item), DefultValue_WB3.Item27_StackSize);
                                break;
                            case 27:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item28_Item), DefultValue_WB3.Item28_StackSize);
                                break;
                            case 28:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item29_Item), DefultValue_WB3.Item29_StackSize);
                                break;
                            case 29:
                                Item1 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item30_Item), DefultValue_WB3.Item30_StackSize);
                                break;
                        }

                        ItemStack Item2 = null;
                        Random b = new Random();
                        int zufallB = b.nextInt(30);
                        switch (zufallB) {
                            case 0:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item1_Item), DefultValue_WB3.Item1_StackSize);
                                break;
                            case 1:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item2_Item), DefultValue_WB3.Item2_StackSize);
                                break;
                            case 2:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item3_Item), DefultValue_WB3.Item3_StackSize);
                                break;
                            case 3:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item4_Item), DefultValue_WB3.Item4_StackSize);
                                break;
                            case 4:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item5_Item), DefultValue_WB3.Item5_StackSize);
                                break;
                            case 5:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item6_Item), DefultValue_WB3.Item6_StackSize);
                                break;
                            case 6:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item7_Item), DefultValue_WB3.Item7_StackSize);
                                break;
                            case 7:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item8_Item), DefultValue_WB3.Item8_StackSize);
                                break;
                            case 8:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item9_Item), DefultValue_WB3.Item9_StackSize);
                                break;
                            case 9:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item10_Item), DefultValue_WB3.Item10_StackSize);
                                break;
                            case 10:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item11_Item), DefultValue_WB3.Item11_StackSize);
                                break;
                            case 11:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item12_Item), DefultValue_WB3.Item12_StackSize);
                                break;
                            case 12:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item13_Item), DefultValue_WB3.Item13_StackSize);
                                break;
                            case 13:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item14_Item), DefultValue_WB3.Item14_StackSize);
                                break;
                            case 14:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item15_Item), DefultValue_WB3.Item15_StackSize);
                                break;
                            case 15:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item16_Item), DefultValue_WB3.Item16_StackSize);
                                break;
                            case 16:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item17_Item), DefultValue_WB3.Item17_StackSize);
                                break;
                            case 17:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item18_Item), DefultValue_WB3.Item18_StackSize);
                                break;
                            case 18:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item19_Item), DefultValue_WB3.Item19_StackSize);
                                break;
                            case 19:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item20_Item), DefultValue_WB3.Item20_StackSize);
                                break;
                            case 20:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item21_Item), DefultValue_WB3.Item21_StackSize);
                                break;
                            case 21:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item22_Item), DefultValue_WB3.Item22_StackSize);
                                break;
                            case 22:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item23_Item), DefultValue_WB3.Item23_StackSize);
                                break;
                            case 23:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item24_Item), DefultValue_WB3.Item24_StackSize);
                                break;
                            case 24:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item25_Item), DefultValue_WB3.Item25_StackSize);
                                break;
                            case 25:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item26_Item), DefultValue_WB3.Item26_StackSize);
                                break;
                            case 26:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item27_Item), DefultValue_WB3.Item27_StackSize);
                                break;
                            case 27:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item28_Item), DefultValue_WB3.Item28_StackSize);
                                break;
                            case 28:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item29_Item), DefultValue_WB3.Item29_StackSize);
                                break;
                            case 29:
                                Item2 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item30_Item), DefultValue_WB3.Item30_StackSize);
                                break;
                        }

                        ItemStack Item3 = null;
                        Random c = new Random();
                        int zufallC = c.nextInt(30);
                        switch (zufallC) {
                            case 0:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item1_Item), DefultValue_WB3.Item1_StackSize);
                                break;
                            case 1:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item2_Item), DefultValue_WB3.Item2_StackSize);
                                break;
                            case 2:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item3_Item), DefultValue_WB3.Item3_StackSize);
                                break;
                            case 3:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item4_Item), DefultValue_WB3.Item4_StackSize);
                                break;
                            case 4:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item5_Item), DefultValue_WB3.Item5_StackSize);
                                break;
                            case 5:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item6_Item), DefultValue_WB3.Item6_StackSize);
                                break;
                            case 6:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item7_Item), DefultValue_WB3.Item7_StackSize);
                                break;
                            case 7:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item8_Item), DefultValue_WB3.Item8_StackSize);
                                break;
                            case 8:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item9_Item), DefultValue_WB3.Item9_StackSize);
                                break;
                            case 9:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item10_Item), DefultValue_WB3.Item10_StackSize);
                                break;
                            case 10:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item11_Item), DefultValue_WB3.Item11_StackSize);
                                break;
                            case 11:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item12_Item), DefultValue_WB3.Item12_StackSize);
                                break;
                            case 12:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item13_Item), DefultValue_WB3.Item13_StackSize);
                                break;
                            case 13:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item14_Item), DefultValue_WB3.Item14_StackSize);
                                break;
                            case 14:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item15_Item), DefultValue_WB3.Item15_StackSize);
                                break;
                            case 15:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item16_Item), DefultValue_WB3.Item16_StackSize);
                                break;
                            case 16:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item17_Item), DefultValue_WB3.Item17_StackSize);
                                break;
                            case 17:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item18_Item), DefultValue_WB3.Item18_StackSize);
                                break;
                            case 18:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item19_Item), DefultValue_WB3.Item19_StackSize);
                                break;
                            case 19:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item20_Item), DefultValue_WB3.Item20_StackSize);
                                break;
                            case 20:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item21_Item), DefultValue_WB3.Item21_StackSize);
                                break;
                            case 21:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item22_Item), DefultValue_WB3.Item22_StackSize);
                                break;
                            case 22:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item23_Item), DefultValue_WB3.Item23_StackSize);
                                break;
                            case 23:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item24_Item), DefultValue_WB3.Item24_StackSize);
                                break;
                            case 24:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item25_Item), DefultValue_WB3.Item25_StackSize);
                                break;
                            case 25:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item26_Item), DefultValue_WB3.Item26_StackSize);
                                break;
                            case 26:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item27_Item), DefultValue_WB3.Item27_StackSize);
                                break;
                            case 27:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item28_Item), DefultValue_WB3.Item28_StackSize);
                                break;
                            case 28:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item29_Item), DefultValue_WB3.Item29_StackSize);
                                break;
                            case 29:
                                Item3 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item30_Item), DefultValue_WB3.Item30_StackSize);
                                break;
                        }

                        ItemStack Item4 = null;
                        Random d = new Random();
                        int zufallD = d.nextInt(30);
                        switch (zufallD) {
                            case 0:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item1_Item), DefultValue_WB3.Item1_StackSize);
                                break;
                            case 1:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item2_Item), DefultValue_WB3.Item2_StackSize);
                                break;
                            case 2:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item3_Item), DefultValue_WB3.Item3_StackSize);
                                break;
                            case 3:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item4_Item), DefultValue_WB3.Item4_StackSize);
                                break;
                            case 4:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item5_Item), DefultValue_WB3.Item5_StackSize);
                                break;
                            case 5:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item6_Item), DefultValue_WB3.Item6_StackSize);
                                break;
                            case 6:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item7_Item), DefultValue_WB3.Item7_StackSize);
                                break;
                            case 7:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item8_Item), DefultValue_WB3.Item8_StackSize);
                                break;
                            case 8:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item9_Item), DefultValue_WB3.Item9_StackSize);
                                break;
                            case 9:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item10_Item), DefultValue_WB3.Item10_StackSize);
                                break;
                            case 10:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item11_Item), DefultValue_WB3.Item11_StackSize);
                                break;
                            case 11:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item12_Item), DefultValue_WB3.Item12_StackSize);
                                break;
                            case 12:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item13_Item), DefultValue_WB3.Item13_StackSize);
                                break;
                            case 13:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item14_Item), DefultValue_WB3.Item14_StackSize);
                                break;
                            case 14:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item15_Item), DefultValue_WB3.Item15_StackSize);
                                break;
                            case 15:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item16_Item), DefultValue_WB3.Item16_StackSize);
                                break;
                            case 16:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item17_Item), DefultValue_WB3.Item17_StackSize);
                                break;
                            case 17:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item18_Item), DefultValue_WB3.Item18_StackSize);
                                break;
                            case 18:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item19_Item), DefultValue_WB3.Item19_StackSize);
                                break;
                            case 19:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item20_Item), DefultValue_WB3.Item20_StackSize);
                                break;
                            case 20:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item21_Item), DefultValue_WB3.Item21_StackSize);
                                break;
                            case 21:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item22_Item), DefultValue_WB3.Item22_StackSize);
                                break;
                            case 22:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item23_Item), DefultValue_WB3.Item23_StackSize);
                                break;
                            case 23:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item24_Item), DefultValue_WB3.Item24_StackSize);
                                break;
                            case 24:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item25_Item), DefultValue_WB3.Item25_StackSize);
                                break;
                            case 25:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item26_Item), DefultValue_WB3.Item26_StackSize);
                                break;
                            case 26:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item27_Item), DefultValue_WB3.Item27_StackSize);
                                break;
                            case 27:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item28_Item), DefultValue_WB3.Item28_StackSize);
                                break;
                            case 28:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item29_Item), DefultValue_WB3.Item29_StackSize);
                                break;
                            case 29:
                                Item4 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item30_Item), DefultValue_WB3.Item30_StackSize);
                                break;
                        }

                        ItemStack Item5 = null;
                        Random e = new Random();
                        int zufallE = e.nextInt(30);
                        switch (zufallE) {
                            case 0:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item1_Item), DefultValue_WB3.Item1_StackSize);
                                break;
                            case 1:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item2_Item), DefultValue_WB3.Item2_StackSize);
                                break;
                            case 2:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item3_Item), DefultValue_WB3.Item3_StackSize);
                                break;
                            case 3:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item4_Item), DefultValue_WB3.Item4_StackSize);
                                break;
                            case 4:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item5_Item), DefultValue_WB3.Item5_StackSize);
                                break;
                            case 5:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item6_Item), DefultValue_WB3.Item6_StackSize);
                                break;
                            case 6:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item7_Item), DefultValue_WB3.Item7_StackSize);
                                break;
                            case 7:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item8_Item), DefultValue_WB3.Item8_StackSize);
                                break;
                            case 8:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item9_Item), DefultValue_WB3.Item9_StackSize);
                                break;
                            case 9:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item10_Item), DefultValue_WB3.Item10_StackSize);
                                break;
                            case 10:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item11_Item), DefultValue_WB3.Item11_StackSize);
                                break;
                            case 11:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item12_Item), DefultValue_WB3.Item12_StackSize);
                                break;
                            case 12:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item13_Item), DefultValue_WB3.Item13_StackSize);
                                break;
                            case 13:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item14_Item), DefultValue_WB3.Item14_StackSize);
                                break;
                            case 14:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item15_Item), DefultValue_WB3.Item15_StackSize);
                                break;
                            case 15:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item16_Item), DefultValue_WB3.Item16_StackSize);
                                break;
                            case 16:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item17_Item), DefultValue_WB3.Item17_StackSize);
                                break;
                            case 17:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item18_Item), DefultValue_WB3.Item18_StackSize);
                                break;
                            case 18:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item19_Item), DefultValue_WB3.Item19_StackSize);
                                break;
                            case 19:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item20_Item), DefultValue_WB3.Item20_StackSize);
                                break;
                            case 20:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item21_Item), DefultValue_WB3.Item21_StackSize);
                                break;
                            case 21:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item22_Item), DefultValue_WB3.Item22_StackSize);
                                break;
                            case 22:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item23_Item), DefultValue_WB3.Item23_StackSize);
                                break;
                            case 23:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item24_Item), DefultValue_WB3.Item24_StackSize);
                                break;
                            case 24:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item25_Item), DefultValue_WB3.Item25_StackSize);
                                break;
                            case 25:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item26_Item), DefultValue_WB3.Item26_StackSize);
                                break;
                            case 26:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item27_Item), DefultValue_WB3.Item27_StackSize);
                                break;
                            case 27:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item28_Item), DefultValue_WB3.Item28_StackSize);
                                break;
                            case 28:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item29_Item), DefultValue_WB3.Item29_StackSize);
                                break;
                            case 29:
                                Item5 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item30_Item), DefultValue_WB3.Item30_StackSize);
                                break;
                        }

                        ItemStack Item6 = null;
                        Random f = new Random();
                        int zufallF = f.nextInt(30);
                        switch (zufallF) {
                            case 0:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item1_Item), DefultValue_WB3.Item1_StackSize);
                                break;
                            case 1:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item2_Item), DefultValue_WB3.Item2_StackSize);
                                break;
                            case 2:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item3_Item), DefultValue_WB3.Item3_StackSize);
                                break;
                            case 3:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item4_Item), DefultValue_WB3.Item4_StackSize);
                                break;
                            case 4:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item5_Item), DefultValue_WB3.Item5_StackSize);
                                break;
                            case 5:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item6_Item), DefultValue_WB3.Item6_StackSize);
                                break;
                            case 6:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item7_Item), DefultValue_WB3.Item7_StackSize);
                                break;
                            case 7:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item8_Item), DefultValue_WB3.Item8_StackSize);
                                break;
                            case 8:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item9_Item), DefultValue_WB3.Item9_StackSize);
                                break;
                            case 9:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item10_Item), DefultValue_WB3.Item10_StackSize);
                                break;
                            case 10:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item11_Item), DefultValue_WB3.Item11_StackSize);
                                break;
                            case 11:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item12_Item), DefultValue_WB3.Item12_StackSize);
                                break;
                            case 12:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item13_Item), DefultValue_WB3.Item13_StackSize);
                                break;
                            case 13:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item14_Item), DefultValue_WB3.Item14_StackSize);
                                break;
                            case 14:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item15_Item), DefultValue_WB3.Item15_StackSize);
                                break;
                            case 15:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item16_Item), DefultValue_WB3.Item16_StackSize);
                                break;
                            case 16:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item17_Item), DefultValue_WB3.Item17_StackSize);
                                break;
                            case 17:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item18_Item), DefultValue_WB3.Item18_StackSize);
                                break;
                            case 18:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item19_Item), DefultValue_WB3.Item19_StackSize);
                                break;
                            case 19:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item20_Item), DefultValue_WB3.Item20_StackSize);
                                break;
                            case 20:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item21_Item), DefultValue_WB3.Item21_StackSize);
                                break;
                            case 21:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item22_Item), DefultValue_WB3.Item22_StackSize);
                                break;
                            case 22:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item23_Item), DefultValue_WB3.Item23_StackSize);
                                break;
                            case 23:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item24_Item), DefultValue_WB3.Item24_StackSize);
                                break;
                            case 24:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item25_Item), DefultValue_WB3.Item25_StackSize);
                                break;
                            case 25:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item26_Item), DefultValue_WB3.Item26_StackSize);
                                break;
                            case 26:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item27_Item), DefultValue_WB3.Item27_StackSize);
                                break;
                            case 27:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item28_Item), DefultValue_WB3.Item28_StackSize);
                                break;
                            case 28:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item29_Item), DefultValue_WB3.Item29_StackSize);
                                break;
                            case 29:
                                Item6 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item30_Item), DefultValue_WB3.Item30_StackSize);
                                break;
                        }

                        ItemStack Item7 = null;
                        Random g = new Random();
                        int zufallG = g.nextInt(30);
                        switch (zufallG) {
                            case 0:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item1_Item), DefultValue_WB3.Item1_StackSize);
                                break;
                            case 1:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item2_Item), DefultValue_WB3.Item2_StackSize);
                                break;
                            case 2:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item3_Item), DefultValue_WB3.Item3_StackSize);
                                break;
                            case 3:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item4_Item), DefultValue_WB3.Item4_StackSize);
                                break;
                            case 4:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item5_Item), DefultValue_WB3.Item5_StackSize);
                                break;
                            case 5:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item6_Item), DefultValue_WB3.Item6_StackSize);
                                break;
                            case 6:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item7_Item), DefultValue_WB3.Item7_StackSize);
                                break;
                            case 7:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item8_Item), DefultValue_WB3.Item8_StackSize);
                                break;
                            case 8:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item9_Item), DefultValue_WB3.Item9_StackSize);
                                break;
                            case 9:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item10_Item), DefultValue_WB3.Item10_StackSize);
                                break;
                            case 10:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item11_Item), DefultValue_WB3.Item11_StackSize);
                                break;
                            case 11:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item12_Item), DefultValue_WB3.Item12_StackSize);
                                break;
                            case 12:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item13_Item), DefultValue_WB3.Item13_StackSize);
                                break;
                            case 13:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item14_Item), DefultValue_WB3.Item14_StackSize);
                                break;
                            case 14:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item15_Item), DefultValue_WB3.Item15_StackSize);
                                break;
                            case 15:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item16_Item), DefultValue_WB3.Item16_StackSize);
                                break;
                            case 16:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item17_Item), DefultValue_WB3.Item17_StackSize);
                                break;
                            case 17:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item18_Item), DefultValue_WB3.Item18_StackSize);
                                break;
                            case 18:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item19_Item), DefultValue_WB3.Item19_StackSize);
                                break;
                            case 19:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item20_Item), DefultValue_WB3.Item20_StackSize);
                                break;
                            case 20:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item21_Item), DefultValue_WB3.Item21_StackSize);
                                break;
                            case 21:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item22_Item), DefultValue_WB3.Item22_StackSize);
                                break;
                            case 22:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item23_Item), DefultValue_WB3.Item23_StackSize);
                                break;
                            case 23:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item24_Item), DefultValue_WB3.Item24_StackSize);
                                break;
                            case 24:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item25_Item), DefultValue_WB3.Item25_StackSize);
                                break;
                            case 25:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item26_Item), DefultValue_WB3.Item26_StackSize);
                                break;
                            case 26:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item27_Item), DefultValue_WB3.Item27_StackSize);
                                break;
                            case 27:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item28_Item), DefultValue_WB3.Item28_StackSize);
                                break;
                            case 28:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item29_Item), DefultValue_WB3.Item29_StackSize);
                                break;
                            case 29:
                                Item7 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item30_Item), DefultValue_WB3.Item30_StackSize);
                                break;
                        }

                        ItemStack Item8 = null;
                        Random h = new Random();
                        int zufallH = h.nextInt(30);
                        switch (zufallH) {
                            case 0:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item1_Item), DefultValue_WB3.Item1_StackSize);
                                break;
                            case 1:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item2_Item), DefultValue_WB3.Item2_StackSize);
                                break;
                            case 2:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item3_Item), DefultValue_WB3.Item3_StackSize);
                                break;
                            case 3:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item4_Item), DefultValue_WB3.Item4_StackSize);
                                break;
                            case 4:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item5_Item), DefultValue_WB3.Item5_StackSize);
                                break;
                            case 5:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item6_Item), DefultValue_WB3.Item6_StackSize);
                                break;
                            case 6:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item7_Item), DefultValue_WB3.Item7_StackSize);
                                break;
                            case 7:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item8_Item), DefultValue_WB3.Item8_StackSize);
                                break;
                            case 8:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item9_Item), DefultValue_WB3.Item9_StackSize);
                                break;
                            case 9:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item10_Item), DefultValue_WB3.Item10_StackSize);
                                break;
                            case 10:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item11_Item), DefultValue_WB3.Item11_StackSize);
                                break;
                            case 11:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item12_Item), DefultValue_WB3.Item12_StackSize);
                                break;
                            case 12:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item13_Item), DefultValue_WB3.Item13_StackSize);
                                break;
                            case 13:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item14_Item), DefultValue_WB3.Item14_StackSize);
                                break;
                            case 14:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item15_Item), DefultValue_WB3.Item15_StackSize);
                                break;
                            case 15:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item16_Item), DefultValue_WB3.Item16_StackSize);
                                break;
                            case 16:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item17_Item), DefultValue_WB3.Item17_StackSize);
                                break;
                            case 17:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item18_Item), DefultValue_WB3.Item18_StackSize);
                                break;
                            case 18:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item19_Item), DefultValue_WB3.Item19_StackSize);
                                break;
                            case 19:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item20_Item), DefultValue_WB3.Item20_StackSize);
                                break;
                            case 20:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item21_Item), DefultValue_WB3.Item21_StackSize);
                                break;
                            case 21:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item22_Item), DefultValue_WB3.Item22_StackSize);
                                break;
                            case 22:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item23_Item), DefultValue_WB3.Item23_StackSize);
                                break;
                            case 23:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item24_Item), DefultValue_WB3.Item24_StackSize);
                                break;
                            case 24:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item25_Item), DefultValue_WB3.Item25_StackSize);
                                break;
                            case 25:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item26_Item), DefultValue_WB3.Item26_StackSize);
                                break;
                            case 26:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item27_Item), DefultValue_WB3.Item27_StackSize);
                                break;
                            case 27:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item28_Item), DefultValue_WB3.Item28_StackSize);
                                break;
                            case 28:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item29_Item), DefultValue_WB3.Item29_StackSize);
                                break;
                            case 29:
                                Item8 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item30_Item), DefultValue_WB3.Item30_StackSize);
                                break;
                        }

                        ItemStack Item9 = null;
                        Random i = new Random();
                        int zufallI = i.nextInt(30);
                        switch (zufallI) {
                            case 0:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item1_Item), DefultValue_WB3.Item1_StackSize);
                                break;
                            case 1:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item2_Item), DefultValue_WB3.Item2_StackSize);
                                break;
                            case 2:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item3_Item), DefultValue_WB3.Item3_StackSize);
                                break;
                            case 3:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item4_Item), DefultValue_WB3.Item4_StackSize);
                                break;
                            case 4:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item5_Item), DefultValue_WB3.Item5_StackSize);
                                break;
                            case 5:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item6_Item), DefultValue_WB3.Item6_StackSize);
                                break;
                            case 6:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item7_Item), DefultValue_WB3.Item7_StackSize);
                                break;
                            case 7:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item8_Item), DefultValue_WB3.Item8_StackSize);
                                break;
                            case 8:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item9_Item), DefultValue_WB3.Item9_StackSize);
                                break;
                            case 9:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item10_Item), DefultValue_WB3.Item10_StackSize);
                                break;
                            case 10:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item11_Item), DefultValue_WB3.Item11_StackSize);
                                break;
                            case 11:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item12_Item), DefultValue_WB3.Item12_StackSize);
                                break;
                            case 12:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item13_Item), DefultValue_WB3.Item13_StackSize);
                                break;
                            case 13:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item14_Item), DefultValue_WB3.Item14_StackSize);
                                break;
                            case 14:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item15_Item), DefultValue_WB3.Item15_StackSize);
                                break;
                            case 15:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item16_Item), DefultValue_WB3.Item16_StackSize);
                                break;
                            case 16:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item17_Item), DefultValue_WB3.Item17_StackSize);
                                break;
                            case 17:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item18_Item), DefultValue_WB3.Item18_StackSize);
                                break;
                            case 18:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item19_Item), DefultValue_WB3.Item19_StackSize);
                                break;
                            case 19:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item20_Item), DefultValue_WB3.Item20_StackSize);
                                break;
                            case 20:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item21_Item), DefultValue_WB3.Item21_StackSize);
                                break;
                            case 21:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item22_Item), DefultValue_WB3.Item22_StackSize);
                                break;
                            case 22:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item23_Item), DefultValue_WB3.Item23_StackSize);
                                break;
                            case 23:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item24_Item), DefultValue_WB3.Item24_StackSize);
                                break;
                            case 24:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item25_Item), DefultValue_WB3.Item25_StackSize);
                                break;
                            case 25:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item26_Item), DefultValue_WB3.Item26_StackSize);
                                break;
                            case 26:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item27_Item), DefultValue_WB3.Item27_StackSize);
                                break;
                            case 27:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item28_Item), DefultValue_WB3.Item28_StackSize);
                                break;
                            case 28:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item29_Item), DefultValue_WB3.Item29_StackSize);
                                break;
                            case 29:
                                Item9 = new ItemStack(Material.getMaterial(DefultValue_WB3.Item30_Item), DefultValue_WB3.Item30_StackSize);
                                break;
                        }

                        if (DefultValue_WB3.Item_anz == 1 || DefultValue_WB3.Item_anz > 1 || DefultValue_WB3.Item_anz < 1) {
                            inventory.addItem(Item1);
                        }
                        if (DefultValue_WB3.Item_anz == 2 || DefultValue_WB3.Item_anz > 2) {
                            inventory.addItem(Item2);
                        }
                        if (DefultValue_WB3.Item_anz == 3 || DefultValue_WB3.Item_anz > 3) {
                            inventory.addItem(Item3);
                        }
                        if (DefultValue_WB3.Item_anz == 4 || DefultValue_WB3.Item_anz > 4) {
                            inventory.addItem(Item4);
                        }
                        if (DefultValue_WB3.Item_anz == 5 || DefultValue_WB3.Item_anz > 5) {
                            inventory.addItem(Item5);
                        }
                        if (DefultValue_WB3.Item_anz == 6 || DefultValue_WB3.Item_anz > 6) {
                            inventory.addItem(Item6);
                        }
                        if (DefultValue_WB3.Item_anz == 7 || DefultValue_WB3.Item_anz > 7) {
                            inventory.addItem(Item7);
                        }
                        if (DefultValue_WB3.Item_anz == 8 || DefultValue_WB3.Item_anz > 8) {
                            inventory.addItem(Item8);
                        }
                        if (DefultValue_WB3.Item_anz == 9 || DefultValue_WB3.Item_anz > 9) {
                            inventory.addItem(Item9);
                        }
                        player.openInventory(inventory);
                    }
                }
            }
        }
    }

 */

}

