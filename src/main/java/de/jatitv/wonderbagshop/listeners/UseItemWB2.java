// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.listeners;

import de.jatitv.wonderbagshop.defultValue.*;
import de.jatitv.wonderbagshop.defultValue.DefultValueItem_2;
import de.jatitv.wonderbagshop.system.Main;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Random;

public class UseItemWB2 implements Listener {

    @EventHandler
    public void InventoryClose(InventoryCloseEvent ice) {
        if ((ice.getView().getTitle().equals("§6§9§l§r" + DefultValueItem_2.DisplayName))) {
            for (int i = 0; i < 9; i++) {
                if (ice.getInventory().getItem(i) != null) {
                    ice.getPlayer().getLocation().getWorld().dropItem(ice.getPlayer().getLocation(), ice.getInventory().getItem(i));
                    if (DefultValue.Debug && DefultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + ice.getPlayer().getLocation().getWorld().getName() + " §4closed GUI §6" + DefultValueItem_2.DisplayName);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onInteractWB2(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getItem() != null && !player.getItemInHand().equals(DefultValueItem_2.Item)) {
            ItemStack item = player.getItemInHand();
            NBTItem nbti = new NBTItem(item);
            if (event.getItem().getType() == Material.valueOf(DefultValueItem_2.Item)) {
                if (nbti.hasKey("loot_item_2")) {
                    Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9 * 1, "§6§9§l§r" + DefultValueItem_2.DisplayName);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + event.getPlayer().getDisplayName() + " §4used §6" + DefultValueItem_2.DisplayName);
                    }
                    ItemStack Item1 = null;
                    Random a = new Random();
                    int zufallA = a.nextInt(70);
                    switch (zufallA) {
                        case 0:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item1_Item), DefultValueItem_2.Item1_StackSize);
                            break;
                        case 1:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item2_Item), DefultValueItem_2.Item2_StackSize);
                            break;
                        case 2:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item3_Item), DefultValueItem_2.Item3_StackSize);
                            break;
                        case 3:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item4_Item), DefultValueItem_2.Item4_StackSize);
                            break;
                        case 4:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item5_Item), DefultValueItem_2.Item5_StackSize);
                            break;
                        case 5:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item6_Item), DefultValueItem_2.Item6_StackSize);
                            break;
                        case 6:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item7_Item), DefultValueItem_2.Item7_StackSize);
                            break;
                        case 7:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item8_Item), DefultValueItem_2.Item8_StackSize);
                            break;
                        case 8:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item9_Item), DefultValueItem_2.Item9_StackSize);
                            break;
                        case 9:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item10_Item), DefultValueItem_2.Item10_StackSize);
                            break;
                        case 10:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item11_Item), DefultValueItem_2.Item11_StackSize);
                            break;
                        case 11:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item12_Item), DefultValueItem_2.Item12_StackSize);
                            break;
                        case 12:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item13_Item), DefultValueItem_2.Item13_StackSize);
                            break;
                        case 13:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item14_Item), DefultValueItem_2.Item14_StackSize);
                            break;
                        case 14:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item15_Item), DefultValueItem_2.Item15_StackSize);
                            break;
                        case 15:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item16_Item), DefultValueItem_2.Item16_StackSize);
                            break;
                        case 16:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item17_Item), DefultValueItem_2.Item17_StackSize);
                            break;
                        case 17:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item18_Item), DefultValueItem_2.Item18_StackSize);
                            break;
                        case 18:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item19_Item), DefultValueItem_2.Item19_StackSize);
                            break;
                        case 19:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item20_Item), DefultValueItem_2.Item20_StackSize);
                            break;
                        case 20:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item21_Item), DefultValueItem_2.Item21_StackSize);
                            break;
                        case 21:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item22_Item), DefultValueItem_2.Item22_StackSize);
                            break;
                        case 22:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item23_Item), DefultValueItem_2.Item23_StackSize);
                            break;
                        case 23:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item24_Item), DefultValueItem_2.Item24_StackSize);
                            break;
                        case 24:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item25_Item), DefultValueItem_2.Item25_StackSize);
                            break;
                        case 25:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item26_Item), DefultValueItem_2.Item26_StackSize);
                            break;
                        case 26:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item27_Item), DefultValueItem_2.Item27_StackSize);
                            break;
                        case 27:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item28_Item), DefultValueItem_2.Item28_StackSize);
                            break;
                        case 28:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item29_Item), DefultValueItem_2.Item29_StackSize);
                            break;
                        case 29:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item30_Item), DefultValueItem_2.Item30_StackSize);
                            break;
                        case 30:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item31_Item), DefultValueItem_2.Item31_StackSize);
                            break;
                        case 31:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item32_Item), DefultValueItem_2.Item32_StackSize);
                            break;
                        case 32:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item33_Item), DefultValueItem_2.Item33_StackSize);
                            break;
                        case 33:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item34_Item), DefultValueItem_2.Item34_StackSize);
                            break;
                        case 34:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item35_Item), DefultValueItem_2.Item35_StackSize);
                            break;
                        case 35:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item36_Item), DefultValueItem_2.Item36_StackSize);
                            break;
                        case 36:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item37_Item), DefultValueItem_2.Item37_StackSize);
                            break;
                        case 37:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item38_Item), DefultValueItem_2.Item38_StackSize);
                            break;
                        case 38:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item39_Item), DefultValueItem_2.Item39_StackSize);
                            break;
                        case 39:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item40_Item), DefultValueItem_2.Item40_StackSize);
                            break;
                        case 40:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item41_Item), DefultValueItem_2.Item41_StackSize);
                            break;
                        case 41:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item42_Item), DefultValueItem_2.Item42_StackSize);
                            break;
                        case 42:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item43_Item), DefultValueItem_2.Item43_StackSize);
                            break;
                        case 43:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item44_Item), DefultValueItem_2.Item44_StackSize);
                            break;
                        case 44:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item45_Item), DefultValueItem_2.Item45_StackSize);
                            break;
                        case 45:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item46_Item), DefultValueItem_2.Item46_StackSize);
                            break;
                        case 46:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item47_Item), DefultValueItem_2.Item47_StackSize);
                            break;
                        case 47:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item48_Item), DefultValueItem_2.Item48_StackSize);
                            break;
                        case 48:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item49_Item), DefultValueItem_2.Item49_StackSize);
                            break;
                        case 49:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item50_Item), DefultValueItem_2.Item50_StackSize);
                            break;
                        case 50:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item51_Item), DefultValueItem_2.Item51_StackSize);
                            break;
                        case 51:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item52_Item), DefultValueItem_2.Item52_StackSize);
                            break;
                        case 52:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item53_Item), DefultValueItem_2.Item53_StackSize);
                            break;
                        case 53:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item54_Item), DefultValueItem_2.Item54_StackSize);
                            break;
                        case 54:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item55_Item), DefultValueItem_2.Item55_StackSize);
                            break;
                        case 55:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item56_Item), DefultValueItem_2.Item56_StackSize);
                            break;
                        case 56:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item57_Item), DefultValueItem_2.Item57_StackSize);
                            break;
                        case 57:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item58_Item), DefultValueItem_2.Item58_StackSize);
                            break;
                        case 58:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item59_Item), DefultValueItem_2.Item59_StackSize);
                            break;
                        case 59:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item60_Item), DefultValueItem_2.Item60_StackSize);
                            break;
                        case 60:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item61_Item), DefultValueItem_2.Item61_StackSize);
                            break;
                        case 61:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item62_Item), DefultValueItem_2.Item62_StackSize);
                            break;
                        case 62:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item63_Item), DefultValueItem_2.Item63_StackSize);
                            break;
                        case 63:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item64_Item), DefultValueItem_2.Item64_StackSize);
                            break;
                        case 64:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item65_Item), DefultValueItem_2.Item65_StackSize);
                            break;
                        case 65:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item66_Item), DefultValueItem_2.Item66_StackSize);
                            break;
                        case 66:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item67_Item), DefultValueItem_2.Item67_StackSize);
                            break;
                        case 67:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item68_Item), DefultValueItem_2.Item68_StackSize);
                            break;
                        case 68:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item69_Item), DefultValueItem_2.Item69_StackSize);
                            break;
                        case 69:
                            Item1 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item70_Item), DefultValueItem_2.Item70_StackSize);
                            break;

                    }

                    ItemStack Item2 = null;
                    Random b = new Random();
                    int zufallB = b.nextInt(70);
                    switch (zufallB) {
                        case 0:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item1_Item), DefultValueItem_2.Item1_StackSize);
                            break;
                        case 1:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item2_Item), DefultValueItem_2.Item2_StackSize);
                            break;
                        case 2:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item3_Item), DefultValueItem_2.Item3_StackSize);
                            break;
                        case 3:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item4_Item), DefultValueItem_2.Item4_StackSize);
                            break;
                        case 4:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item5_Item), DefultValueItem_2.Item5_StackSize);
                            break;
                        case 5:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item6_Item), DefultValueItem_2.Item6_StackSize);
                            break;
                        case 6:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item7_Item), DefultValueItem_2.Item7_StackSize);
                            break;
                        case 7:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item8_Item), DefultValueItem_2.Item8_StackSize);
                            break;
                        case 8:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item9_Item), DefultValueItem_2.Item9_StackSize);
                            break;
                        case 9:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item10_Item), DefultValueItem_2.Item10_StackSize);
                            break;
                        case 10:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item11_Item), DefultValueItem_2.Item11_StackSize);
                            break;
                        case 11:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item12_Item), DefultValueItem_2.Item12_StackSize);
                            break;
                        case 12:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item13_Item), DefultValueItem_2.Item13_StackSize);
                            break;
                        case 13:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item14_Item), DefultValueItem_2.Item14_StackSize);
                            break;
                        case 14:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item15_Item), DefultValueItem_2.Item15_StackSize);
                            break;
                        case 15:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item16_Item), DefultValueItem_2.Item16_StackSize);
                            break;
                        case 16:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item17_Item), DefultValueItem_2.Item17_StackSize);
                            break;
                        case 17:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item18_Item), DefultValueItem_2.Item18_StackSize);
                            break;
                        case 18:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item19_Item), DefultValueItem_2.Item19_StackSize);
                            break;
                        case 19:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item20_Item), DefultValueItem_2.Item20_StackSize);
                            break;
                        case 20:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item21_Item), DefultValueItem_2.Item21_StackSize);
                            break;
                        case 21:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item22_Item), DefultValueItem_2.Item22_StackSize);
                            break;
                        case 22:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item23_Item), DefultValueItem_2.Item23_StackSize);
                            break;
                        case 23:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item24_Item), DefultValueItem_2.Item24_StackSize);
                            break;
                        case 24:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item25_Item), DefultValueItem_2.Item25_StackSize);
                            break;
                        case 25:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item26_Item), DefultValueItem_2.Item26_StackSize);
                            break;
                        case 26:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item27_Item), DefultValueItem_2.Item27_StackSize);
                            break;
                        case 27:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item28_Item), DefultValueItem_2.Item28_StackSize);
                            break;
                        case 28:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item29_Item), DefultValueItem_2.Item29_StackSize);
                            break;
                        case 29:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item30_Item), DefultValueItem_2.Item30_StackSize);
                            break;
                        case 30:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item31_Item), DefultValueItem_2.Item31_StackSize);
                            break;
                        case 31:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item32_Item), DefultValueItem_2.Item32_StackSize);
                            break;
                        case 32:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item33_Item), DefultValueItem_2.Item33_StackSize);
                            break;
                        case 33:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item34_Item), DefultValueItem_2.Item34_StackSize);
                            break;
                        case 34:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item35_Item), DefultValueItem_2.Item35_StackSize);
                            break;
                        case 35:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item36_Item), DefultValueItem_2.Item36_StackSize);
                            break;
                        case 36:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item37_Item), DefultValueItem_2.Item37_StackSize);
                            break;
                        case 37:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item38_Item), DefultValueItem_2.Item38_StackSize);
                            break;
                        case 38:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item39_Item), DefultValueItem_2.Item39_StackSize);
                            break;
                        case 39:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item40_Item), DefultValueItem_2.Item40_StackSize);
                            break;
                        case 40:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item41_Item), DefultValueItem_2.Item41_StackSize);
                            break;
                        case 41:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item42_Item), DefultValueItem_2.Item42_StackSize);
                            break;
                        case 42:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item43_Item), DefultValueItem_2.Item43_StackSize);
                            break;
                        case 43:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item44_Item), DefultValueItem_2.Item44_StackSize);
                            break;
                        case 44:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item45_Item), DefultValueItem_2.Item45_StackSize);
                            break;
                        case 45:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item46_Item), DefultValueItem_2.Item46_StackSize);
                            break;
                        case 46:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item47_Item), DefultValueItem_2.Item47_StackSize);
                            break;
                        case 47:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item48_Item), DefultValueItem_2.Item48_StackSize);
                            break;
                        case 48:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item49_Item), DefultValueItem_2.Item49_StackSize);
                            break;
                        case 49:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item50_Item), DefultValueItem_2.Item50_StackSize);
                            break;
                        case 50:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item51_Item), DefultValueItem_2.Item51_StackSize);
                            break;
                        case 51:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item52_Item), DefultValueItem_2.Item52_StackSize);
                            break;
                        case 52:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item53_Item), DefultValueItem_2.Item53_StackSize);
                            break;
                        case 53:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item54_Item), DefultValueItem_2.Item54_StackSize);
                            break;
                        case 54:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item55_Item), DefultValueItem_2.Item55_StackSize);
                            break;
                        case 55:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item56_Item), DefultValueItem_2.Item56_StackSize);
                            break;
                        case 56:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item57_Item), DefultValueItem_2.Item57_StackSize);
                            break;
                        case 57:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item58_Item), DefultValueItem_2.Item58_StackSize);
                            break;
                        case 58:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item59_Item), DefultValueItem_2.Item59_StackSize);
                            break;
                        case 59:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item60_Item), DefultValueItem_2.Item60_StackSize);
                            break;
                        case 60:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item61_Item), DefultValueItem_2.Item61_StackSize);
                            break;
                        case 61:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item62_Item), DefultValueItem_2.Item62_StackSize);
                            break;
                        case 62:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item63_Item), DefultValueItem_2.Item63_StackSize);
                            break;
                        case 63:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item64_Item), DefultValueItem_2.Item64_StackSize);
                            break;
                        case 64:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item65_Item), DefultValueItem_2.Item65_StackSize);
                            break;
                        case 65:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item66_Item), DefultValueItem_2.Item66_StackSize);
                            break;
                        case 66:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item67_Item), DefultValueItem_2.Item67_StackSize);
                            break;
                        case 67:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item68_Item), DefultValueItem_2.Item68_StackSize);
                            break;
                        case 68:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item69_Item), DefultValueItem_2.Item69_StackSize);
                            break;
                        case 69:
                            Item2 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item70_Item), DefultValueItem_2.Item70_StackSize);
                            break;
                    }

                    ItemStack Item3 = null;
                    Random c = new Random();
                    int zufallC = c.nextInt(70);
                    switch (zufallC) {
                        case 0:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item1_Item), DefultValueItem_2.Item1_StackSize);
                            break;
                        case 1:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item2_Item), DefultValueItem_2.Item2_StackSize);
                            break;
                        case 2:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item3_Item), DefultValueItem_2.Item3_StackSize);
                            break;
                        case 3:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item4_Item), DefultValueItem_2.Item4_StackSize);
                            break;
                        case 4:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item5_Item), DefultValueItem_2.Item5_StackSize);
                            break;
                        case 5:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item6_Item), DefultValueItem_2.Item6_StackSize);
                            break;
                        case 6:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item7_Item), DefultValueItem_2.Item7_StackSize);
                            break;
                        case 7:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item8_Item), DefultValueItem_2.Item8_StackSize);
                            break;
                        case 8:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item9_Item), DefultValueItem_2.Item9_StackSize);
                            break;
                        case 9:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item10_Item), DefultValueItem_2.Item10_StackSize);
                            break;
                        case 10:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item11_Item), DefultValueItem_2.Item11_StackSize);
                            break;
                        case 11:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item12_Item), DefultValueItem_2.Item12_StackSize);
                            break;
                        case 12:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item13_Item), DefultValueItem_2.Item13_StackSize);
                            break;
                        case 13:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item14_Item), DefultValueItem_2.Item14_StackSize);
                            break;
                        case 14:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item15_Item), DefultValueItem_2.Item15_StackSize);
                            break;
                        case 15:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item16_Item), DefultValueItem_2.Item16_StackSize);
                            break;
                        case 16:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item17_Item), DefultValueItem_2.Item17_StackSize);
                            break;
                        case 17:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item18_Item), DefultValueItem_2.Item18_StackSize);
                            break;
                        case 18:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item19_Item), DefultValueItem_2.Item19_StackSize);
                            break;
                        case 19:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item20_Item), DefultValueItem_2.Item20_StackSize);
                            break;
                        case 20:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item21_Item), DefultValueItem_2.Item21_StackSize);
                            break;
                        case 21:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item22_Item), DefultValueItem_2.Item22_StackSize);
                            break;
                        case 22:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item23_Item), DefultValueItem_2.Item23_StackSize);
                            break;
                        case 23:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item24_Item), DefultValueItem_2.Item24_StackSize);
                            break;
                        case 24:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item25_Item), DefultValueItem_2.Item25_StackSize);
                            break;
                        case 25:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item26_Item), DefultValueItem_2.Item26_StackSize);
                            break;
                        case 26:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item27_Item), DefultValueItem_2.Item27_StackSize);
                            break;
                        case 27:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item28_Item), DefultValueItem_2.Item28_StackSize);
                            break;
                        case 28:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item29_Item), DefultValueItem_2.Item29_StackSize);
                            break;
                        case 29:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item30_Item), DefultValueItem_2.Item30_StackSize);
                            break;
                        case 30:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item31_Item), DefultValueItem_2.Item31_StackSize);
                            break;
                        case 31:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item32_Item), DefultValueItem_2.Item32_StackSize);
                            break;
                        case 32:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item33_Item), DefultValueItem_2.Item33_StackSize);
                            break;
                        case 33:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item34_Item), DefultValueItem_2.Item34_StackSize);
                            break;
                        case 34:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item35_Item), DefultValueItem_2.Item35_StackSize);
                            break;
                        case 35:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item36_Item), DefultValueItem_2.Item36_StackSize);
                            break;
                        case 36:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item37_Item), DefultValueItem_2.Item37_StackSize);
                            break;
                        case 37:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item38_Item), DefultValueItem_2.Item38_StackSize);
                            break;
                        case 38:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item39_Item), DefultValueItem_2.Item39_StackSize);
                            break;
                        case 39:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item40_Item), DefultValueItem_2.Item40_StackSize);
                            break;
                        case 40:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item41_Item), DefultValueItem_2.Item41_StackSize);
                            break;
                        case 41:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item42_Item), DefultValueItem_2.Item42_StackSize);
                            break;
                        case 42:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item43_Item), DefultValueItem_2.Item43_StackSize);
                            break;
                        case 43:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item44_Item), DefultValueItem_2.Item44_StackSize);
                            break;
                        case 44:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item45_Item), DefultValueItem_2.Item45_StackSize);
                            break;
                        case 45:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item46_Item), DefultValueItem_2.Item46_StackSize);
                            break;
                        case 46:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item47_Item), DefultValueItem_2.Item47_StackSize);
                            break;
                        case 47:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item48_Item), DefultValueItem_2.Item48_StackSize);
                            break;
                        case 48:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item49_Item), DefultValueItem_2.Item49_StackSize);
                            break;
                        case 49:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item50_Item), DefultValueItem_2.Item50_StackSize);
                            break;
                        case 50:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item51_Item), DefultValueItem_2.Item51_StackSize);
                            break;
                        case 51:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item52_Item), DefultValueItem_2.Item52_StackSize);
                            break;
                        case 52:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item53_Item), DefultValueItem_2.Item53_StackSize);
                            break;
                        case 53:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item54_Item), DefultValueItem_2.Item54_StackSize);
                            break;
                        case 54:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item55_Item), DefultValueItem_2.Item55_StackSize);
                            break;
                        case 55:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item56_Item), DefultValueItem_2.Item56_StackSize);
                            break;
                        case 56:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item57_Item), DefultValueItem_2.Item57_StackSize);
                            break;
                        case 57:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item58_Item), DefultValueItem_2.Item58_StackSize);
                            break;
                        case 58:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item59_Item), DefultValueItem_2.Item59_StackSize);
                            break;
                        case 59:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item60_Item), DefultValueItem_2.Item60_StackSize);
                            break;
                        case 60:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item61_Item), DefultValueItem_2.Item61_StackSize);
                            break;
                        case 61:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item62_Item), DefultValueItem_2.Item62_StackSize);
                            break;
                        case 62:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item63_Item), DefultValueItem_2.Item63_StackSize);
                            break;
                        case 63:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item64_Item), DefultValueItem_2.Item64_StackSize);
                            break;
                        case 64:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item65_Item), DefultValueItem_2.Item65_StackSize);
                            break;
                        case 65:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item66_Item), DefultValueItem_2.Item66_StackSize);
                            break;
                        case 66:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item67_Item), DefultValueItem_2.Item67_StackSize);
                            break;
                        case 67:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item68_Item), DefultValueItem_2.Item68_StackSize);
                            break;
                        case 68:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item69_Item), DefultValueItem_2.Item69_StackSize);
                            break;
                        case 69:
                            Item3 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item70_Item), DefultValueItem_2.Item70_StackSize);
                            break;
                    }

                    ItemStack Item4 = null;
                    Random d = new Random();
                    int zufallD = d.nextInt(70);
                    switch (zufallD) {
                        case 0:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item1_Item), DefultValueItem_2.Item1_StackSize);
                            break;
                        case 1:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item2_Item), DefultValueItem_2.Item2_StackSize);
                            break;
                        case 2:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item3_Item), DefultValueItem_2.Item3_StackSize);
                            break;
                        case 3:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item4_Item), DefultValueItem_2.Item4_StackSize);
                            break;
                        case 4:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item5_Item), DefultValueItem_2.Item5_StackSize);
                            break;
                        case 5:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item6_Item), DefultValueItem_2.Item6_StackSize);
                            break;
                        case 6:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item7_Item), DefultValueItem_2.Item7_StackSize);
                            break;
                        case 7:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item8_Item), DefultValueItem_2.Item8_StackSize);
                            break;
                        case 8:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item9_Item), DefultValueItem_2.Item9_StackSize);
                            break;
                        case 9:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item10_Item), DefultValueItem_2.Item10_StackSize);
                            break;
                        case 10:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item11_Item), DefultValueItem_2.Item11_StackSize);
                            break;
                        case 11:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item12_Item), DefultValueItem_2.Item12_StackSize);
                            break;
                        case 12:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item13_Item), DefultValueItem_2.Item13_StackSize);
                            break;
                        case 13:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item14_Item), DefultValueItem_2.Item14_StackSize);
                            break;
                        case 14:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item15_Item), DefultValueItem_2.Item15_StackSize);
                            break;
                        case 15:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item16_Item), DefultValueItem_2.Item16_StackSize);
                            break;
                        case 16:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item17_Item), DefultValueItem_2.Item17_StackSize);
                            break;
                        case 17:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item18_Item), DefultValueItem_2.Item18_StackSize);
                            break;
                        case 18:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item19_Item), DefultValueItem_2.Item19_StackSize);
                            break;
                        case 19:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item20_Item), DefultValueItem_2.Item20_StackSize);
                            break;
                        case 20:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item21_Item), DefultValueItem_2.Item21_StackSize);
                            break;
                        case 21:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item22_Item), DefultValueItem_2.Item22_StackSize);
                            break;
                        case 22:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item23_Item), DefultValueItem_2.Item23_StackSize);
                            break;
                        case 23:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item24_Item), DefultValueItem_2.Item24_StackSize);
                            break;
                        case 24:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item25_Item), DefultValueItem_2.Item25_StackSize);
                            break;
                        case 25:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item26_Item), DefultValueItem_2.Item26_StackSize);
                            break;
                        case 26:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item27_Item), DefultValueItem_2.Item27_StackSize);
                            break;
                        case 27:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item28_Item), DefultValueItem_2.Item28_StackSize);
                            break;
                        case 28:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item29_Item), DefultValueItem_2.Item29_StackSize);
                            break;
                        case 29:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item30_Item), DefultValueItem_2.Item30_StackSize);
                            break;
                        case 30:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item31_Item), DefultValueItem_2.Item31_StackSize);
                            break;
                        case 31:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item32_Item), DefultValueItem_2.Item32_StackSize);
                            break;
                        case 32:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item33_Item), DefultValueItem_2.Item33_StackSize);
                            break;
                        case 33:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item34_Item), DefultValueItem_2.Item34_StackSize);
                            break;
                        case 34:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item35_Item), DefultValueItem_2.Item35_StackSize);
                            break;
                        case 35:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item36_Item), DefultValueItem_2.Item36_StackSize);
                            break;
                        case 36:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item37_Item), DefultValueItem_2.Item37_StackSize);
                            break;
                        case 37:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item38_Item), DefultValueItem_2.Item38_StackSize);
                            break;
                        case 38:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item39_Item), DefultValueItem_2.Item39_StackSize);
                            break;
                        case 39:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item40_Item), DefultValueItem_2.Item40_StackSize);
                            break;
                        case 40:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item41_Item), DefultValueItem_2.Item41_StackSize);
                            break;
                        case 41:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item42_Item), DefultValueItem_2.Item42_StackSize);
                            break;
                        case 42:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item43_Item), DefultValueItem_2.Item43_StackSize);
                            break;
                        case 43:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item44_Item), DefultValueItem_2.Item44_StackSize);
                            break;
                        case 44:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item45_Item), DefultValueItem_2.Item45_StackSize);
                            break;
                        case 45:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item46_Item), DefultValueItem_2.Item46_StackSize);
                            break;
                        case 46:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item47_Item), DefultValueItem_2.Item47_StackSize);
                            break;
                        case 47:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item48_Item), DefultValueItem_2.Item48_StackSize);
                            break;
                        case 48:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item49_Item), DefultValueItem_2.Item49_StackSize);
                            break;
                        case 49:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item50_Item), DefultValueItem_2.Item50_StackSize);
                            break;
                        case 50:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item51_Item), DefultValueItem_2.Item51_StackSize);
                            break;
                        case 51:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item52_Item), DefultValueItem_2.Item52_StackSize);
                            break;
                        case 52:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item53_Item), DefultValueItem_2.Item53_StackSize);
                            break;
                        case 53:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item54_Item), DefultValueItem_2.Item54_StackSize);
                            break;
                        case 54:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item55_Item), DefultValueItem_2.Item55_StackSize);
                            break;
                        case 55:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item56_Item), DefultValueItem_2.Item56_StackSize);
                            break;
                        case 56:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item57_Item), DefultValueItem_2.Item57_StackSize);
                            break;
                        case 57:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item58_Item), DefultValueItem_2.Item58_StackSize);
                            break;
                        case 58:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item59_Item), DefultValueItem_2.Item59_StackSize);
                            break;
                        case 59:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item60_Item), DefultValueItem_2.Item60_StackSize);
                            break;
                        case 60:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item61_Item), DefultValueItem_2.Item61_StackSize);
                            break;
                        case 61:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item62_Item), DefultValueItem_2.Item62_StackSize);
                            break;
                        case 62:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item63_Item), DefultValueItem_2.Item63_StackSize);
                            break;
                        case 63:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item64_Item), DefultValueItem_2.Item64_StackSize);
                            break;
                        case 64:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item65_Item), DefultValueItem_2.Item65_StackSize);
                            break;
                        case 65:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item66_Item), DefultValueItem_2.Item66_StackSize);
                            break;
                        case 66:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item67_Item), DefultValueItem_2.Item67_StackSize);
                            break;
                        case 67:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item68_Item), DefultValueItem_2.Item68_StackSize);
                            break;
                        case 68:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item69_Item), DefultValueItem_2.Item69_StackSize);
                            break;
                        case 69:
                            Item4 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item70_Item), DefultValueItem_2.Item70_StackSize);
                            break;
                    }

                    ItemStack Item5 = null;
                    Random e = new Random();
                    int zufallE = e.nextInt(70);
                    switch (zufallE) {
                        case 0:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item1_Item), DefultValueItem_2.Item1_StackSize);
                            break;
                        case 1:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item2_Item), DefultValueItem_2.Item2_StackSize);
                            break;
                        case 2:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item3_Item), DefultValueItem_2.Item3_StackSize);
                            break;
                        case 3:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item4_Item), DefultValueItem_2.Item4_StackSize);
                            break;
                        case 4:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item5_Item), DefultValueItem_2.Item5_StackSize);
                            break;
                        case 5:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item6_Item), DefultValueItem_2.Item6_StackSize);
                            break;
                        case 6:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item7_Item), DefultValueItem_2.Item7_StackSize);
                            break;
                        case 7:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item8_Item), DefultValueItem_2.Item8_StackSize);
                            break;
                        case 8:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item9_Item), DefultValueItem_2.Item9_StackSize);
                            break;
                        case 9:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item10_Item), DefultValueItem_2.Item10_StackSize);
                            break;
                        case 10:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item11_Item), DefultValueItem_2.Item11_StackSize);
                            break;
                        case 11:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item12_Item), DefultValueItem_2.Item12_StackSize);
                            break;
                        case 12:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item13_Item), DefultValueItem_2.Item13_StackSize);
                            break;
                        case 13:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item14_Item), DefultValueItem_2.Item14_StackSize);
                            break;
                        case 14:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item15_Item), DefultValueItem_2.Item15_StackSize);
                            break;
                        case 15:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item16_Item), DefultValueItem_2.Item16_StackSize);
                            break;
                        case 16:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item17_Item), DefultValueItem_2.Item17_StackSize);
                            break;
                        case 17:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item18_Item), DefultValueItem_2.Item18_StackSize);
                            break;
                        case 18:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item19_Item), DefultValueItem_2.Item19_StackSize);
                            break;
                        case 19:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item20_Item), DefultValueItem_2.Item20_StackSize);
                            break;
                        case 20:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item21_Item), DefultValueItem_2.Item21_StackSize);
                            break;
                        case 21:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item22_Item), DefultValueItem_2.Item22_StackSize);
                            break;
                        case 22:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item23_Item), DefultValueItem_2.Item23_StackSize);
                            break;
                        case 23:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item24_Item), DefultValueItem_2.Item24_StackSize);
                            break;
                        case 24:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item25_Item), DefultValueItem_2.Item25_StackSize);
                            break;
                        case 25:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item26_Item), DefultValueItem_2.Item26_StackSize);
                            break;
                        case 26:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item27_Item), DefultValueItem_2.Item27_StackSize);
                            break;
                        case 27:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item28_Item), DefultValueItem_2.Item28_StackSize);
                            break;
                        case 28:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item29_Item), DefultValueItem_2.Item29_StackSize);
                            break;
                        case 29:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item30_Item), DefultValueItem_2.Item30_StackSize);
                            break;
                        case 30:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item31_Item), DefultValueItem_2.Item31_StackSize);
                            break;
                        case 31:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item32_Item), DefultValueItem_2.Item32_StackSize);
                            break;
                        case 32:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item33_Item), DefultValueItem_2.Item33_StackSize);
                            break;
                        case 33:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item34_Item), DefultValueItem_2.Item34_StackSize);
                            break;
                        case 34:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item35_Item), DefultValueItem_2.Item35_StackSize);
                            break;
                        case 35:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item36_Item), DefultValueItem_2.Item36_StackSize);
                            break;
                        case 36:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item37_Item), DefultValueItem_2.Item37_StackSize);
                            break;
                        case 37:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item38_Item), DefultValueItem_2.Item38_StackSize);
                            break;
                        case 38:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item39_Item), DefultValueItem_2.Item39_StackSize);
                            break;
                        case 39:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item40_Item), DefultValueItem_2.Item40_StackSize);
                            break;
                        case 40:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item41_Item), DefultValueItem_2.Item41_StackSize);
                            break;
                        case 41:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item42_Item), DefultValueItem_2.Item42_StackSize);
                            break;
                        case 42:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item43_Item), DefultValueItem_2.Item43_StackSize);
                            break;
                        case 43:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item44_Item), DefultValueItem_2.Item44_StackSize);
                            break;
                        case 44:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item45_Item), DefultValueItem_2.Item45_StackSize);
                            break;
                        case 45:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item46_Item), DefultValueItem_2.Item46_StackSize);
                            break;
                        case 46:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item47_Item), DefultValueItem_2.Item47_StackSize);
                            break;
                        case 47:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item48_Item), DefultValueItem_2.Item48_StackSize);
                            break;
                        case 48:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item49_Item), DefultValueItem_2.Item49_StackSize);
                            break;
                        case 49:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item50_Item), DefultValueItem_2.Item50_StackSize);
                            break;
                        case 50:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item51_Item), DefultValueItem_2.Item51_StackSize);
                            break;
                        case 51:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item52_Item), DefultValueItem_2.Item52_StackSize);
                            break;
                        case 52:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item53_Item), DefultValueItem_2.Item53_StackSize);
                            break;
                        case 53:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item54_Item), DefultValueItem_2.Item54_StackSize);
                            break;
                        case 54:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item55_Item), DefultValueItem_2.Item55_StackSize);
                            break;
                        case 55:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item56_Item), DefultValueItem_2.Item56_StackSize);
                            break;
                        case 56:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item57_Item), DefultValueItem_2.Item57_StackSize);
                            break;
                        case 57:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item58_Item), DefultValueItem_2.Item58_StackSize);
                            break;
                        case 58:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item59_Item), DefultValueItem_2.Item59_StackSize);
                            break;
                        case 59:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item60_Item), DefultValueItem_2.Item60_StackSize);
                            break;
                        case 60:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item61_Item), DefultValueItem_2.Item61_StackSize);
                            break;
                        case 61:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item62_Item), DefultValueItem_2.Item62_StackSize);
                            break;
                        case 62:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item63_Item), DefultValueItem_2.Item63_StackSize);
                            break;
                        case 63:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item64_Item), DefultValueItem_2.Item64_StackSize);
                            break;
                        case 64:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item65_Item), DefultValueItem_2.Item65_StackSize);
                            break;
                        case 65:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item66_Item), DefultValueItem_2.Item66_StackSize);
                            break;
                        case 66:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item67_Item), DefultValueItem_2.Item67_StackSize);
                            break;
                        case 67:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item68_Item), DefultValueItem_2.Item68_StackSize);
                            break;
                        case 68:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item69_Item), DefultValueItem_2.Item69_StackSize);
                            break;
                        case 69:
                            Item5 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item70_Item), DefultValueItem_2.Item70_StackSize);
                            break;
                    }

                    ItemStack Item6 = null;
                    Random f = new Random();
                    int zufallF = f.nextInt(70);
                    switch (zufallF) {
                        case 0:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item1_Item), DefultValueItem_2.Item1_StackSize);
                            break;
                        case 1:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item2_Item), DefultValueItem_2.Item2_StackSize);
                            break;
                        case 2:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item3_Item), DefultValueItem_2.Item3_StackSize);
                            break;
                        case 3:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item4_Item), DefultValueItem_2.Item4_StackSize);
                            break;
                        case 4:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item5_Item), DefultValueItem_2.Item5_StackSize);
                            break;
                        case 5:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item6_Item), DefultValueItem_2.Item6_StackSize);
                            break;
                        case 6:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item7_Item), DefultValueItem_2.Item7_StackSize);
                            break;
                        case 7:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item8_Item), DefultValueItem_2.Item8_StackSize);
                            break;
                        case 8:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item9_Item), DefultValueItem_2.Item9_StackSize);
                            break;
                        case 9:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item10_Item), DefultValueItem_2.Item10_StackSize);
                            break;
                        case 10:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item11_Item), DefultValueItem_2.Item11_StackSize);
                            break;
                        case 11:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item12_Item), DefultValueItem_2.Item12_StackSize);
                            break;
                        case 12:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item13_Item), DefultValueItem_2.Item13_StackSize);
                            break;
                        case 13:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item14_Item), DefultValueItem_2.Item14_StackSize);
                            break;
                        case 14:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item15_Item), DefultValueItem_2.Item15_StackSize);
                            break;
                        case 15:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item16_Item), DefultValueItem_2.Item16_StackSize);
                            break;
                        case 16:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item17_Item), DefultValueItem_2.Item17_StackSize);
                            break;
                        case 17:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item18_Item), DefultValueItem_2.Item18_StackSize);
                            break;
                        case 18:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item19_Item), DefultValueItem_2.Item19_StackSize);
                            break;
                        case 19:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item20_Item), DefultValueItem_2.Item20_StackSize);
                            break;
                        case 20:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item21_Item), DefultValueItem_2.Item21_StackSize);
                            break;
                        case 21:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item22_Item), DefultValueItem_2.Item22_StackSize);
                            break;
                        case 22:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item23_Item), DefultValueItem_2.Item23_StackSize);
                            break;
                        case 23:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item24_Item), DefultValueItem_2.Item24_StackSize);
                            break;
                        case 24:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item25_Item), DefultValueItem_2.Item25_StackSize);
                            break;
                        case 25:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item26_Item), DefultValueItem_2.Item26_StackSize);
                            break;
                        case 26:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item27_Item), DefultValueItem_2.Item27_StackSize);
                            break;
                        case 27:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item28_Item), DefultValueItem_2.Item28_StackSize);
                            break;
                        case 28:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item29_Item), DefultValueItem_2.Item29_StackSize);
                            break;
                        case 29:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item30_Item), DefultValueItem_2.Item30_StackSize);
                            break;
                        case 30:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item31_Item), DefultValueItem_2.Item31_StackSize);
                            break;
                        case 31:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item32_Item), DefultValueItem_2.Item32_StackSize);
                            break;
                        case 32:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item33_Item), DefultValueItem_2.Item33_StackSize);
                            break;
                        case 33:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item34_Item), DefultValueItem_2.Item34_StackSize);
                            break;
                        case 34:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item35_Item), DefultValueItem_2.Item35_StackSize);
                            break;
                        case 35:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item36_Item), DefultValueItem_2.Item36_StackSize);
                            break;
                        case 36:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item37_Item), DefultValueItem_2.Item37_StackSize);
                            break;
                        case 37:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item38_Item), DefultValueItem_2.Item38_StackSize);
                            break;
                        case 38:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item39_Item), DefultValueItem_2.Item39_StackSize);
                            break;
                        case 39:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item40_Item), DefultValueItem_2.Item40_StackSize);
                            break;
                        case 40:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item41_Item), DefultValueItem_2.Item41_StackSize);
                            break;
                        case 41:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item42_Item), DefultValueItem_2.Item42_StackSize);
                            break;
                        case 42:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item43_Item), DefultValueItem_2.Item43_StackSize);
                            break;
                        case 43:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item44_Item), DefultValueItem_2.Item44_StackSize);
                            break;
                        case 44:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item45_Item), DefultValueItem_2.Item45_StackSize);
                            break;
                        case 45:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item46_Item), DefultValueItem_2.Item46_StackSize);
                            break;
                        case 46:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item47_Item), DefultValueItem_2.Item47_StackSize);
                            break;
                        case 47:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item48_Item), DefultValueItem_2.Item48_StackSize);
                            break;
                        case 48:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item49_Item), DefultValueItem_2.Item49_StackSize);
                            break;
                        case 49:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item50_Item), DefultValueItem_2.Item50_StackSize);
                            break;
                        case 50:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item51_Item), DefultValueItem_2.Item51_StackSize);
                            break;
                        case 51:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item52_Item), DefultValueItem_2.Item52_StackSize);
                            break;
                        case 52:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item53_Item), DefultValueItem_2.Item53_StackSize);
                            break;
                        case 53:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item54_Item), DefultValueItem_2.Item54_StackSize);
                            break;
                        case 54:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item55_Item), DefultValueItem_2.Item55_StackSize);
                            break;
                        case 55:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item56_Item), DefultValueItem_2.Item56_StackSize);
                            break;
                        case 56:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item57_Item), DefultValueItem_2.Item57_StackSize);
                            break;
                        case 57:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item58_Item), DefultValueItem_2.Item58_StackSize);
                            break;
                        case 58:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item59_Item), DefultValueItem_2.Item59_StackSize);
                            break;
                        case 59:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item60_Item), DefultValueItem_2.Item60_StackSize);
                            break;
                        case 60:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item61_Item), DefultValueItem_2.Item61_StackSize);
                            break;
                        case 61:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item62_Item), DefultValueItem_2.Item62_StackSize);
                            break;
                        case 62:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item63_Item), DefultValueItem_2.Item63_StackSize);
                            break;
                        case 63:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item64_Item), DefultValueItem_2.Item64_StackSize);
                            break;
                        case 64:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item65_Item), DefultValueItem_2.Item65_StackSize);
                            break;
                        case 65:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item66_Item), DefultValueItem_2.Item66_StackSize);
                            break;
                        case 66:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item67_Item), DefultValueItem_2.Item67_StackSize);
                            break;
                        case 67:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item68_Item), DefultValueItem_2.Item68_StackSize);
                            break;
                        case 68:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item69_Item), DefultValueItem_2.Item69_StackSize);
                            break;
                        case 69:
                            Item6 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item70_Item), DefultValueItem_2.Item70_StackSize);
                            break;
                    }

                    ItemStack Item7 = null;
                    Random g = new Random();
                    int zufallG = g.nextInt(70);
                    switch (zufallG) {
                        case 0:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item1_Item), DefultValueItem_2.Item1_StackSize);
                            break;
                        case 1:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item2_Item), DefultValueItem_2.Item2_StackSize);
                            break;
                        case 2:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item3_Item), DefultValueItem_2.Item3_StackSize);
                            break;
                        case 3:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item4_Item), DefultValueItem_2.Item4_StackSize);
                            break;
                        case 4:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item5_Item), DefultValueItem_2.Item5_StackSize);
                            break;
                        case 5:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item6_Item), DefultValueItem_2.Item6_StackSize);
                            break;
                        case 6:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item7_Item), DefultValueItem_2.Item7_StackSize);
                            break;
                        case 7:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item8_Item), DefultValueItem_2.Item8_StackSize);
                            break;
                        case 8:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item9_Item), DefultValueItem_2.Item9_StackSize);
                            break;
                        case 9:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item10_Item), DefultValueItem_2.Item10_StackSize);
                            break;
                        case 10:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item11_Item), DefultValueItem_2.Item11_StackSize);
                            break;
                        case 11:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item12_Item), DefultValueItem_2.Item12_StackSize);
                            break;
                        case 12:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item13_Item), DefultValueItem_2.Item13_StackSize);
                            break;
                        case 13:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item14_Item), DefultValueItem_2.Item14_StackSize);
                            break;
                        case 14:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item15_Item), DefultValueItem_2.Item15_StackSize);
                            break;
                        case 15:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item16_Item), DefultValueItem_2.Item16_StackSize);
                            break;
                        case 16:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item17_Item), DefultValueItem_2.Item17_StackSize);
                            break;
                        case 17:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item18_Item), DefultValueItem_2.Item18_StackSize);
                            break;
                        case 18:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item19_Item), DefultValueItem_2.Item19_StackSize);
                            break;
                        case 19:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item20_Item), DefultValueItem_2.Item20_StackSize);
                            break;
                        case 20:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item21_Item), DefultValueItem_2.Item21_StackSize);
                            break;
                        case 21:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item22_Item), DefultValueItem_2.Item22_StackSize);
                            break;
                        case 22:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item23_Item), DefultValueItem_2.Item23_StackSize);
                            break;
                        case 23:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item24_Item), DefultValueItem_2.Item24_StackSize);
                            break;
                        case 24:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item25_Item), DefultValueItem_2.Item25_StackSize);
                            break;
                        case 25:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item26_Item), DefultValueItem_2.Item26_StackSize);
                            break;
                        case 26:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item27_Item), DefultValueItem_2.Item27_StackSize);
                            break;
                        case 27:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item28_Item), DefultValueItem_2.Item28_StackSize);
                            break;
                        case 28:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item29_Item), DefultValueItem_2.Item29_StackSize);
                            break;
                        case 29:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item30_Item), DefultValueItem_2.Item30_StackSize);
                            break;
                        case 30:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item31_Item), DefultValueItem_2.Item31_StackSize);
                            break;
                        case 31:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item32_Item), DefultValueItem_2.Item32_StackSize);
                            break;
                        case 32:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item33_Item), DefultValueItem_2.Item33_StackSize);
                            break;
                        case 33:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item34_Item), DefultValueItem_2.Item34_StackSize);
                            break;
                        case 34:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item35_Item), DefultValueItem_2.Item35_StackSize);
                            break;
                        case 35:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item36_Item), DefultValueItem_2.Item36_StackSize);
                            break;
                        case 36:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item37_Item), DefultValueItem_2.Item37_StackSize);
                            break;
                        case 37:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item38_Item), DefultValueItem_2.Item38_StackSize);
                            break;
                        case 38:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item39_Item), DefultValueItem_2.Item39_StackSize);
                            break;
                        case 39:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item40_Item), DefultValueItem_2.Item40_StackSize);
                            break;
                        case 40:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item41_Item), DefultValueItem_2.Item41_StackSize);
                            break;
                        case 41:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item42_Item), DefultValueItem_2.Item42_StackSize);
                            break;
                        case 42:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item43_Item), DefultValueItem_2.Item43_StackSize);
                            break;
                        case 43:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item44_Item), DefultValueItem_2.Item44_StackSize);
                            break;
                        case 44:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item45_Item), DefultValueItem_2.Item45_StackSize);
                            break;
                        case 45:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item46_Item), DefultValueItem_2.Item46_StackSize);
                            break;
                        case 46:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item47_Item), DefultValueItem_2.Item47_StackSize);
                            break;
                        case 47:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item48_Item), DefultValueItem_2.Item48_StackSize);
                            break;
                        case 48:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item49_Item), DefultValueItem_2.Item49_StackSize);
                            break;
                        case 49:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item50_Item), DefultValueItem_2.Item50_StackSize);
                            break;
                        case 50:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item51_Item), DefultValueItem_2.Item51_StackSize);
                            break;
                        case 51:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item52_Item), DefultValueItem_2.Item52_StackSize);
                            break;
                        case 52:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item53_Item), DefultValueItem_2.Item53_StackSize);
                            break;
                        case 53:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item54_Item), DefultValueItem_2.Item54_StackSize);
                            break;
                        case 54:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item55_Item), DefultValueItem_2.Item55_StackSize);
                            break;
                        case 55:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item56_Item), DefultValueItem_2.Item56_StackSize);
                            break;
                        case 56:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item57_Item), DefultValueItem_2.Item57_StackSize);
                            break;
                        case 57:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item58_Item), DefultValueItem_2.Item58_StackSize);
                            break;
                        case 58:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item59_Item), DefultValueItem_2.Item59_StackSize);
                            break;
                        case 59:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item60_Item), DefultValueItem_2.Item60_StackSize);
                            break;
                        case 60:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item61_Item), DefultValueItem_2.Item61_StackSize);
                            break;
                        case 61:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item62_Item), DefultValueItem_2.Item62_StackSize);
                            break;
                        case 62:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item63_Item), DefultValueItem_2.Item63_StackSize);
                            break;
                        case 63:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item64_Item), DefultValueItem_2.Item64_StackSize);
                            break;
                        case 64:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item65_Item), DefultValueItem_2.Item65_StackSize);
                            break;
                        case 65:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item66_Item), DefultValueItem_2.Item66_StackSize);
                            break;
                        case 66:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item67_Item), DefultValueItem_2.Item67_StackSize);
                            break;
                        case 67:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item68_Item), DefultValueItem_2.Item68_StackSize);
                            break;
                        case 68:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item69_Item), DefultValueItem_2.Item69_StackSize);
                            break;
                        case 69:
                            Item7 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item70_Item), DefultValueItem_2.Item70_StackSize);
                            break;
                    }

                    ItemStack Item8 = null;
                    Random h = new Random();
                    int zufallH = h.nextInt(70);
                    switch (zufallH) {
                        case 0:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item1_Item), DefultValueItem_2.Item1_StackSize);
                            break;
                        case 1:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item2_Item), DefultValueItem_2.Item2_StackSize);
                            break;
                        case 2:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item3_Item), DefultValueItem_2.Item3_StackSize);
                            break;
                        case 3:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item4_Item), DefultValueItem_2.Item4_StackSize);
                            break;
                        case 4:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item5_Item), DefultValueItem_2.Item5_StackSize);
                            break;
                        case 5:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item6_Item), DefultValueItem_2.Item6_StackSize);
                            break;
                        case 6:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item7_Item), DefultValueItem_2.Item7_StackSize);
                            break;
                        case 7:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item8_Item), DefultValueItem_2.Item8_StackSize);
                            break;
                        case 8:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item9_Item), DefultValueItem_2.Item9_StackSize);
                            break;
                        case 9:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item10_Item), DefultValueItem_2.Item10_StackSize);
                            break;
                        case 10:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item11_Item), DefultValueItem_2.Item11_StackSize);
                            break;
                        case 11:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item12_Item), DefultValueItem_2.Item12_StackSize);
                            break;
                        case 12:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item13_Item), DefultValueItem_2.Item13_StackSize);
                            break;
                        case 13:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item14_Item), DefultValueItem_2.Item14_StackSize);
                            break;
                        case 14:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item15_Item), DefultValueItem_2.Item15_StackSize);
                            break;
                        case 15:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item16_Item), DefultValueItem_2.Item16_StackSize);
                            break;
                        case 16:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item17_Item), DefultValueItem_2.Item17_StackSize);
                            break;
                        case 17:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item18_Item), DefultValueItem_2.Item18_StackSize);
                            break;
                        case 18:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item19_Item), DefultValueItem_2.Item19_StackSize);
                            break;
                        case 19:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item20_Item), DefultValueItem_2.Item20_StackSize);
                            break;
                        case 20:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item21_Item), DefultValueItem_2.Item21_StackSize);
                            break;
                        case 21:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item22_Item), DefultValueItem_2.Item22_StackSize);
                            break;
                        case 22:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item23_Item), DefultValueItem_2.Item23_StackSize);
                            break;
                        case 23:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item24_Item), DefultValueItem_2.Item24_StackSize);
                            break;
                        case 24:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item25_Item), DefultValueItem_2.Item25_StackSize);
                            break;
                        case 25:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item26_Item), DefultValueItem_2.Item26_StackSize);
                            break;
                        case 26:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item27_Item), DefultValueItem_2.Item27_StackSize);
                            break;
                        case 27:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item28_Item), DefultValueItem_2.Item28_StackSize);
                            break;
                        case 28:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item29_Item), DefultValueItem_2.Item29_StackSize);
                            break;
                        case 29:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item30_Item), DefultValueItem_2.Item30_StackSize);
                            break;
                        case 30:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item31_Item), DefultValueItem_2.Item31_StackSize);
                            break;
                        case 31:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item32_Item), DefultValueItem_2.Item32_StackSize);
                            break;
                        case 32:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item33_Item), DefultValueItem_2.Item33_StackSize);
                            break;
                        case 33:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item34_Item), DefultValueItem_2.Item34_StackSize);
                            break;
                        case 34:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item35_Item), DefultValueItem_2.Item35_StackSize);
                            break;
                        case 35:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item36_Item), DefultValueItem_2.Item36_StackSize);
                            break;
                        case 36:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item37_Item), DefultValueItem_2.Item37_StackSize);
                            break;
                        case 37:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item38_Item), DefultValueItem_2.Item38_StackSize);
                            break;
                        case 38:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item39_Item), DefultValueItem_2.Item39_StackSize);
                            break;
                        case 39:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item40_Item), DefultValueItem_2.Item40_StackSize);
                            break;
                        case 40:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item41_Item), DefultValueItem_2.Item41_StackSize);
                            break;
                        case 41:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item42_Item), DefultValueItem_2.Item42_StackSize);
                            break;
                        case 42:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item43_Item), DefultValueItem_2.Item43_StackSize);
                            break;
                        case 43:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item44_Item), DefultValueItem_2.Item44_StackSize);
                            break;
                        case 44:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item45_Item), DefultValueItem_2.Item45_StackSize);
                            break;
                        case 45:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item46_Item), DefultValueItem_2.Item46_StackSize);
                            break;
                        case 46:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item47_Item), DefultValueItem_2.Item47_StackSize);
                            break;
                        case 47:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item48_Item), DefultValueItem_2.Item48_StackSize);
                            break;
                        case 48:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item49_Item), DefultValueItem_2.Item49_StackSize);
                            break;
                        case 49:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item50_Item), DefultValueItem_2.Item50_StackSize);
                            break;
                        case 50:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item51_Item), DefultValueItem_2.Item51_StackSize);
                            break;
                        case 51:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item52_Item), DefultValueItem_2.Item52_StackSize);
                            break;
                        case 52:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item53_Item), DefultValueItem_2.Item53_StackSize);
                            break;
                        case 53:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item54_Item), DefultValueItem_2.Item54_StackSize);
                            break;
                        case 54:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item55_Item), DefultValueItem_2.Item55_StackSize);
                            break;
                        case 55:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item56_Item), DefultValueItem_2.Item56_StackSize);
                            break;
                        case 56:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item57_Item), DefultValueItem_2.Item57_StackSize);
                            break;
                        case 57:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item58_Item), DefultValueItem_2.Item58_StackSize);
                            break;
                        case 58:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item59_Item), DefultValueItem_2.Item59_StackSize);
                            break;
                        case 59:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item60_Item), DefultValueItem_2.Item60_StackSize);
                            break;
                        case 60:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item61_Item), DefultValueItem_2.Item61_StackSize);
                            break;
                        case 61:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item62_Item), DefultValueItem_2.Item62_StackSize);
                            break;
                        case 62:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item63_Item), DefultValueItem_2.Item63_StackSize);
                            break;
                        case 63:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item64_Item), DefultValueItem_2.Item64_StackSize);
                            break;
                        case 64:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item65_Item), DefultValueItem_2.Item65_StackSize);
                            break;
                        case 65:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item66_Item), DefultValueItem_2.Item66_StackSize);
                            break;
                        case 66:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item67_Item), DefultValueItem_2.Item67_StackSize);
                            break;
                        case 67:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item68_Item), DefultValueItem_2.Item68_StackSize);
                            break;
                        case 68:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item69_Item), DefultValueItem_2.Item69_StackSize);
                            break;
                        case 69:
                            Item8 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item70_Item), DefultValueItem_2.Item70_StackSize);
                            break;
                    }

                    ItemStack Item9 = null;
                    Random i = new Random();
                    int zufallI = i.nextInt(70);
                    switch (zufallI) {
                        case 0:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item1_Item), DefultValueItem_2.Item1_StackSize);
                            break;
                        case 1:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item2_Item), DefultValueItem_2.Item2_StackSize);
                            break;
                        case 2:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item3_Item), DefultValueItem_2.Item3_StackSize);
                            break;
                        case 3:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item4_Item), DefultValueItem_2.Item4_StackSize);
                            break;
                        case 4:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item5_Item), DefultValueItem_2.Item5_StackSize);
                            break;
                        case 5:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item6_Item), DefultValueItem_2.Item6_StackSize);
                            break;
                        case 6:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item7_Item), DefultValueItem_2.Item7_StackSize);
                            break;
                        case 7:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item8_Item), DefultValueItem_2.Item8_StackSize);
                            break;
                        case 8:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item9_Item), DefultValueItem_2.Item9_StackSize);
                            break;
                        case 9:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item10_Item), DefultValueItem_2.Item10_StackSize);
                            break;
                        case 10:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item11_Item), DefultValueItem_2.Item11_StackSize);
                            break;
                        case 11:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item12_Item), DefultValueItem_2.Item12_StackSize);
                            break;
                        case 12:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item13_Item), DefultValueItem_2.Item13_StackSize);
                            break;
                        case 13:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item14_Item), DefultValueItem_2.Item14_StackSize);
                            break;
                        case 14:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item15_Item), DefultValueItem_2.Item15_StackSize);
                            break;
                        case 15:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item16_Item), DefultValueItem_2.Item16_StackSize);
                            break;
                        case 16:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item17_Item), DefultValueItem_2.Item17_StackSize);
                            break;
                        case 17:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item18_Item), DefultValueItem_2.Item18_StackSize);
                            break;
                        case 18:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item19_Item), DefultValueItem_2.Item19_StackSize);
                            break;
                        case 19:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item20_Item), DefultValueItem_2.Item20_StackSize);
                            break;
                        case 20:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item21_Item), DefultValueItem_2.Item21_StackSize);
                            break;
                        case 21:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item22_Item), DefultValueItem_2.Item22_StackSize);
                            break;
                        case 22:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item23_Item), DefultValueItem_2.Item23_StackSize);
                            break;
                        case 23:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item24_Item), DefultValueItem_2.Item24_StackSize);
                            break;
                        case 24:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item25_Item), DefultValueItem_2.Item25_StackSize);
                            break;
                        case 25:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item26_Item), DefultValueItem_2.Item26_StackSize);
                            break;
                        case 26:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item27_Item), DefultValueItem_2.Item27_StackSize);
                            break;
                        case 27:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item28_Item), DefultValueItem_2.Item28_StackSize);
                            break;
                        case 28:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item29_Item), DefultValueItem_2.Item29_StackSize);
                            break;
                        case 29:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item30_Item), DefultValueItem_2.Item30_StackSize);
                            break;
                        case 30:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item31_Item), DefultValueItem_2.Item31_StackSize);
                            break;
                        case 31:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item32_Item), DefultValueItem_2.Item32_StackSize);
                            break;
                        case 32:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item33_Item), DefultValueItem_2.Item33_StackSize);
                            break;
                        case 33:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item34_Item), DefultValueItem_2.Item34_StackSize);
                            break;
                        case 34:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item35_Item), DefultValueItem_2.Item35_StackSize);
                            break;
                        case 35:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item36_Item), DefultValueItem_2.Item36_StackSize);
                            break;
                        case 36:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item37_Item), DefultValueItem_2.Item37_StackSize);
                            break;
                        case 37:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item38_Item), DefultValueItem_2.Item38_StackSize);
                            break;
                        case 38:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item39_Item), DefultValueItem_2.Item39_StackSize);
                            break;
                        case 39:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item40_Item), DefultValueItem_2.Item40_StackSize);
                            break;
                        case 40:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item41_Item), DefultValueItem_2.Item41_StackSize);
                            break;
                        case 41:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item42_Item), DefultValueItem_2.Item42_StackSize);
                            break;
                        case 42:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item43_Item), DefultValueItem_2.Item43_StackSize);
                            break;
                        case 43:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item44_Item), DefultValueItem_2.Item44_StackSize);
                            break;
                        case 44:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item45_Item), DefultValueItem_2.Item45_StackSize);
                            break;
                        case 45:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item46_Item), DefultValueItem_2.Item46_StackSize);
                            break;
                        case 46:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item47_Item), DefultValueItem_2.Item47_StackSize);
                            break;
                        case 47:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item48_Item), DefultValueItem_2.Item48_StackSize);
                            break;
                        case 48:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item49_Item), DefultValueItem_2.Item49_StackSize);
                            break;
                        case 49:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item50_Item), DefultValueItem_2.Item50_StackSize);
                            break;
                        case 50:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item51_Item), DefultValueItem_2.Item51_StackSize);
                            break;
                        case 51:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item52_Item), DefultValueItem_2.Item52_StackSize);
                            break;
                        case 52:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item53_Item), DefultValueItem_2.Item53_StackSize);
                            break;
                        case 53:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item54_Item), DefultValueItem_2.Item54_StackSize);
                            break;
                        case 54:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item55_Item), DefultValueItem_2.Item55_StackSize);
                            break;
                        case 55:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item56_Item), DefultValueItem_2.Item56_StackSize);
                            break;
                        case 56:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item57_Item), DefultValueItem_2.Item57_StackSize);
                            break;
                        case 57:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item58_Item), DefultValueItem_2.Item58_StackSize);
                            break;
                        case 58:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item59_Item), DefultValueItem_2.Item59_StackSize);
                            break;
                        case 59:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item60_Item), DefultValueItem_2.Item60_StackSize);
                            break;
                        case 60:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item61_Item), DefultValueItem_2.Item61_StackSize);
                            break;
                        case 61:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item62_Item), DefultValueItem_2.Item62_StackSize);
                            break;
                        case 62:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item63_Item), DefultValueItem_2.Item63_StackSize);
                            break;
                        case 63:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item64_Item), DefultValueItem_2.Item64_StackSize);
                            break;
                        case 64:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item65_Item), DefultValueItem_2.Item65_StackSize);
                            break;
                        case 65:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item66_Item), DefultValueItem_2.Item66_StackSize);
                            break;
                        case 66:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item67_Item), DefultValueItem_2.Item67_StackSize);
                            break;
                        case 67:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item68_Item), DefultValueItem_2.Item68_StackSize);
                            break;
                        case 68:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item69_Item), DefultValueItem_2.Item69_StackSize);
                            break;
                        case 69:
                            Item9 = new ItemStack(Material.getMaterial(DefultValueItem_2.Item70_Item), DefultValueItem_2.Item70_StackSize);
                            break;
                    }

                    if (DefultValueItem_2.Item_anz == 1 || DefultValueItem_2.Item_anz > 1 || DefultValueItem_2.Item_anz < 1) {
                        inventory.addItem(Item1);
                    }
                    if (DefultValueItem_2.Item_anz == 2 || DefultValueItem_2.Item_anz > 2) {
                        inventory.addItem(Item2);
                    }
                    if (DefultValueItem_2.Item_anz == 3 || DefultValueItem_2.Item_anz > 3) {
                        inventory.addItem(Item3);
                    }
                    if (DefultValueItem_2.Item_anz == 4 || DefultValueItem_2.Item_anz > 4) {
                        inventory.addItem(Item4);
                    }
                    if (DefultValueItem_2.Item_anz == 5 || DefultValueItem_2.Item_anz > 5) {
                        inventory.addItem(Item5);
                    }
                    if (DefultValueItem_2.Item_anz == 6 || DefultValueItem_2.Item_anz > 6) {
                        inventory.addItem(Item6);
                    }
                    if (DefultValueItem_2.Item_anz == 7 || DefultValueItem_2.Item_anz > 7) {
                        inventory.addItem(Item7);
                    }
                    if (DefultValueItem_2.Item_anz == 8 || DefultValueItem_2.Item_anz > 8) {
                        inventory.addItem(Item8);
                    }
                    if (DefultValueItem_2.Item_anz == 9 || DefultValueItem_2.Item_anz > 9) {
                        inventory.addItem(Item9);
                    }
                    player.openInventory(inventory);
                    event.setCancelled(true);


                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            for (int iam = 0; iam < 9; iam++) {
                                ItemStack itm = player.getInventory().getItem(iam);
                                if (itm != null) {
                                NBTItem nbti2 = new NBTItem(itm);
                                    if (nbti2.hasKey("loot_item_2")) {
                                        int amt = itm.getAmount() - 1;
                                        itm.setAmount(amt);
                                        player.getInventory().setItem(iam, amt > 0 ? itm : null);
                                        if (DefultValue.Debug && DefultValue.DebugStage > 1) {
                                            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§6" + player.getDisplayName() + " §4set WB2 Item -1");
                                        }
                                        player.updateInventory();
                                        break;
                                    }
                                }
                            }
                        }
                    }.runTaskLater(Main.getPlugin(), 5L);
                }
            }
        }
    }
}

