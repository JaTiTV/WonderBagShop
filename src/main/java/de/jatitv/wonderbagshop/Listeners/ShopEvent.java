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
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB2;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB3;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;


public class ShopEvent implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {

        if (!(e.getWhoClicked() instanceof Player)) return;
        Player player = (Player) e.getWhoClicked();
        if(e.getInventory() !=null && e.getCurrentItem()!= null){
            if (e.getWhoClicked().getOpenInventory().getTitle().equals(DefultValue.GUI_Name)) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {
                    case CHEST:
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValue_WB1.Name)
                                || e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValue_WB2.Name)
                                || e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValue_WB3.Name)){
                            boolean empty = false;
                            for (int i = 0; i < player.getInventory().getSize() - 5; i++) {
                                if (player.getInventory().getItem(i) == null) {
                                    empty = true;

                                    break;
                                }
                            }
                            if (empty) {
                                switch (e.getCurrentItem().getAmount()) {
                                    case 1:
                                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValue_WB1.Name)){
                                            if (de.jatitv.wonderbagshop.commands.Shop.buy(player, DefultValue_WB1.price)) {
                                                player.closeInventory();

                                                ItemStack item = new ItemStack(Material.CHEST);
                                                ItemMeta itemMeta = item.getItemMeta();
                                                itemMeta.setDisplayName(DefultValue_WB1.ChestName);
                                                ArrayList<String> lore = new ArrayList<>();
                                                itemMeta.setLore(lore);
                                                item.setItemMeta(itemMeta);
                                                item.setAmount(1);
                                                NBTItem nbti = new NBTItem(item);
                                                nbti.setBoolean("loot_chest_1", true);
                                                player.getInventory().addItem(nbti.getItem());

                                                player.sendMessage(DefultValue.WB1buy_msg);

                                                if (DefultValue.Sound_Shop_Buy_Enable){
                                                    player.playSound(player.getLocation(),DefultValue.Sound_Shop_Buy,3,1);
                                                }

                                            } else {
                                                player.closeInventory();
                                                player.sendMessage(DefultValue.No_money);
                                                if (DefultValue.Sound_Shop_NoMoney_Enable){
                                                    player.playSound(player.getLocation(),DefultValue.Sound_Shop_NoMoney,3,1);
                                                }

                                            }
                                            break;
                                        }break;

                                    case 2:
                                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValue_WB2.Name)){
                                            if (de.jatitv.wonderbagshop.commands.Shop.buy(player, DefultValue_WB2.price)) {
                                                player.closeInventory();

                                                ItemStack item = new ItemStack(Material.CHEST);
                                                ItemMeta itemMeta = item.getItemMeta();
                                                itemMeta.setDisplayName(DefultValue_WB2.ChestName);
                                                ArrayList<String> lore = new ArrayList<>();
                                                itemMeta.setLore(lore);
                                                item.setItemMeta(itemMeta);
                                                item.setAmount(1);
                                                NBTItem nbti = new NBTItem(item);
                                                nbti.setBoolean("loot_chest_2", true);
                                                player.getInventory().addItem(nbti.getItem());

                                                player.sendMessage(DefultValue.WB2buy_msg);

                                                if (DefultValue.Sound_Shop_Buy_Enable){
                                                    player.playSound(player.getLocation(),DefultValue.Sound_Shop_Buy,3,1);
                                                }

                                            } else {
                                                player.closeInventory();
                                                player.sendMessage(DefultValue.No_money);
                                                if (DefultValue.Sound_Shop_NoMoney_Enable){
                                                    player.playSound(player.getLocation(),DefultValue.Sound_Shop_NoMoney,3,1);
                                                }

                                            }
                                            break;
                                        }break;

                                    case 3:
                                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValue_WB3.Name)){
                                            if (de.jatitv.wonderbagshop.commands.Shop.buy(player, DefultValue_WB3.price)) {
                                                player.closeInventory();

                                                ItemStack item = new ItemStack(Material.CHEST);
                                                ItemMeta itemMeta = item.getItemMeta();
                                                itemMeta.setDisplayName(DefultValue_WB3.ChestName);
                                                ArrayList<String> lore = new ArrayList<>();
                                                itemMeta.setLore(lore);
                                                item.setItemMeta(itemMeta);
                                                item.setAmount(1);
                                                NBTItem nbti = new NBTItem(item);
                                                nbti.setBoolean("loot_chest_3", true);
                                                player.getInventory().addItem(nbti.getItem());

                                                player.sendMessage(DefultValue.WB3buy_msg);

                                                if (DefultValue.Sound_Shop_Buy_Enable){
                                                    player.playSound(player.getLocation(),DefultValue.Sound_Shop_Buy,3,1);
                                                }
                                            } else {
                                                player.closeInventory();
                                                player.sendMessage(DefultValue.No_money);
                                                if (DefultValue.Sound_Shop_NoMoney_Enable){
                                                    player.playSound(player.getLocation(),DefultValue.Sound_Shop_NoMoney,3,1);
                                                }

                                            }
                                            break;
                                        }break;
                                }
                                break;

                            } else {
                                e.setCancelled(true);
                                player.closeInventory();
                                player.sendMessage(DefultValue.NoInventorySpace);

                                if (DefultValue.Sound_Shop_NoInventorySpace_Enable){
                                    player.playSound(player.getLocation(),DefultValue.Sound_Shop_NoInventorySpace,3,1);
                                }

                            }
                        }default:
                        break;
                }
            }else {
                return;
            }
        }
    }
}