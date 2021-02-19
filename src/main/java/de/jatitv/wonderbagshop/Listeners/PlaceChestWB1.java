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

package de.jatitv.wonderbagshop.Listeners;

import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB1;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class PlaceChestWB1 implements Listener {

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder)null, 9*3, DefultValue.GUI_Name);
        Block block = event.getBlock();
        ItemStack item = event.getItemInHand();
        NBTItem nbti = new NBTItem(item);
        if (block.getType() == Material.CHEST) {
            if(nbti.hasKey("loot_chest_1")) {
                Chest chest = (Chest) block.getState();

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
                        Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
                        break;
                    case 10:
                        Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item21_Item), DefultValue_WB1.Item21_StackSize);
                        break;
                    case 11:
                        Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item22_Item), DefultValue_WB1.Item22_StackSize);
                        break;
                    case 12:
                        Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item23_Item), DefultValue_WB1.Item23_StackSize);
                        break;
                    case 13:
                        Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item24_Item), DefultValue_WB1.Item24_StackSize);
                        break;
                    case 14:
                        Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item25_Item), DefultValue_WB1.Item25_StackSize);
                        break;
                    case 15:
                        Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item26_Item), DefultValue_WB1.Item26_StackSize);
                        break;
                    case 16:
                        Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item27_Item), DefultValue_WB1.Item27_StackSize);
                        break;
                    case 17:
                        Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item28_Item), DefultValue_WB1.Item28_StackSize);
                        break;
                    case 18:
                        Item2 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item29_Item), DefultValue_WB1.Item29_StackSize);
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
                        Item4 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
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
                        Item5 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
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
                        Item6 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
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
                        Item7 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
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
                        Item8 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
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
                        Item9 = new ItemStack(Material.getMaterial(DefultValue_WB1.Item20_Item), DefultValue_WB1.Item20_StackSize);
                        break;
                }

                if (DefultValue_WB1.Item_anz == 1 || DefultValue_WB1.Item_anz > 1 || DefultValue_WB1.Item_anz < 1){
                    chest.getInventory().addItem(Item1);
                }
                if (DefultValue_WB1.Item_anz == 2 || DefultValue_WB1.Item_anz > 2) {
                    chest.getInventory().addItem(Item2);
                }
                if (DefultValue_WB1.Item_anz == 3 || DefultValue_WB1.Item_anz > 3) {
                    chest.getInventory().addItem(Item3);
                }
                if (DefultValue_WB1.Item_anz == 4 || DefultValue_WB1.Item_anz > 4) {
                    chest.getInventory().addItem(Item4);
                }
                if (DefultValue_WB1.Item_anz == 5 || DefultValue_WB1.Item_anz > 5) {
                    chest.getInventory().addItem(Item5);
                }
                if (DefultValue_WB1.Item_anz == 6 || DefultValue_WB1.Item_anz > 6) {
                    chest.getInventory().addItem(Item6);
                }
                if (DefultValue_WB1.Item_anz == 7 || DefultValue_WB1.Item_anz > 7) {
                    chest.getInventory().addItem(Item7);
                }
                if (DefultValue_WB1.Item_anz == 8 || DefultValue_WB1.Item_anz > 8) {
                    chest.getInventory().addItem(Item8);
                }
                if (DefultValue_WB1.Item_anz == 9 || DefultValue_WB1.Item_anz > 9) {
                    chest.getInventory().addItem(Item9);
                }
            }
        }
    }
}
