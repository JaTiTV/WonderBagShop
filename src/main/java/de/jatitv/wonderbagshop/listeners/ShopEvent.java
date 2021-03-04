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

import de.jatitv.wonderbagshop.defultValue.*;
import de.jatitv.wonderbagshop.commands.Shop;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Material;
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
        if (e.getInventory() != null && e.getCurrentItem() != null) {
            if (e.getWhoClicked().getOpenInventory().getTitle().equals("§6§8§9§r" + DefultValue.GUI_Name)) {
                e.setCancelled(true);
                if (e.getCurrentItem().getType() == Material.CHEST) {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValueChest_1.Name)
                            || e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValueChest_2.Name)
                            || e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValueChest_3.Name)) {
                        boolean empty = false;
                        for (int i = 0; i < player.getInventory().getSize() - 5; i++) {
                            if (player.getInventory().getItem(i) == null) {
                                empty = true;

                                break;
                            }
                        }
                        if (empty) {

                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValueChest_1.Name)) {
                                if (de.jatitv.wonderbagshop.commands.Shop.buy(player, DefultValueChest_1.price)) {
                                    player.closeInventory();

                                    ItemStack item = new ItemStack(Material.CHEST);
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefultValueChest_1.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_chest_1", true);
                                    player.getInventory().addItem(nbti.getItem());
                                    if (DefultValue.Title_Buy_Enable && DefultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_Buy.replace("[wonderbag]", DefultValueChest_1.Name)
                                                .replace("[price]", String.valueOf(DefultValueChest_1.price))
                                                .replace("[currency]", DefultValue.Currency), 10, 70, 20);
                                    } else {
                                        player.sendMessage(DefultValue.Buy_msg.replace("[wonderbag]", DefultValueChest_1.Name)
                                                .replace("[price]", String.valueOf(DefultValueChest_1.price))
                                                .replace("[currency]", DefultValue.Currency));
                                    }
                                    if (DefultValue.Sound_Shop_Buy_Enable) {
                                        player.playSound(player.getLocation(), DefultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                } else {
                                    player.closeInventory();
                                    if (DefultValue.Title_No_money_Enable && DefultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_No_money, 10, 70, 20);
                                    } else player.sendMessage(DefultValue.No_money);
                                    if (DefultValue.Sound_Shop_NoMoney_Enable) {
                                        player.playSound(player.getLocation(), DefultValue.Sound_Shop_NoMoney, 3, 1);
                                    }
                                }
                            }
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValueChest_2.Name)) {
                                if (de.jatitv.wonderbagshop.commands.Shop.buy(player, DefultValueChest_2.price)) {
                                    player.closeInventory();

                                    ItemStack item = new ItemStack(Material.CHEST);
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefultValueChest_2.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_chest_2", true);
                                    player.getInventory().addItem(nbti.getItem());
                                    if (DefultValue.Title_Buy_Enable && DefultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_Buy.replace("[wonderbag]", DefultValueChest_2.Name)
                                                .replace("[price]", String.valueOf(DefultValueChest_2.price))
                                                .replace("[currency]", DefultValue.Currency), 10, 70, 20);
                                    } else {
                                        player.sendMessage(DefultValue.Buy_msg.replace("[wonderbag]", DefultValueChest_2.Name)
                                                .replace("[price]", String.valueOf(DefultValueChest_2.price))
                                                .replace("[currency]", DefultValue.Currency));
                                    }
                                    if (DefultValue.Sound_Shop_Buy_Enable) {
                                        player.playSound(player.getLocation(), DefultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                } else {
                                    player.closeInventory();
                                    if (DefultValue.Title_No_money_Enable && DefultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_No_money, 10, 70, 20);
                                    } else player.sendMessage(DefultValue.No_money);
                                    if (DefultValue.Sound_Shop_NoMoney_Enable) {
                                        player.playSound(player.getLocation(), DefultValue.Sound_Shop_NoMoney, 3, 1);
                                    }
                                }
                            }


                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValueChest_3.Name)) {
                                if (de.jatitv.wonderbagshop.commands.Shop.buy(player, DefultValueChest_3.price)) {
                                    player.closeInventory();

                                    ItemStack item = new ItemStack(Material.CHEST);
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefultValueChest_3.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_chest_3", true);
                                    player.getInventory().addItem(nbti.getItem());
                                    if (DefultValue.Title_Buy_Enable && DefultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_Buy.replace("[wonderbag]", DefultValueChest_3.Name)
                                                .replace("[price]", String.valueOf(DefultValueChest_3.price))
                                                .replace("[currency]", DefultValue.Currency), 10, 70, 20);
                                    } else {
                                        player.sendMessage(DefultValue.Buy_msg.replace("[wonderbag]", DefultValueChest_3.Name)
                                                .replace("[price]", String.valueOf(DefultValueChest_3.price))
                                                .replace("[currency]", DefultValue.Currency));
                                    }
                                    if (DefultValue.Sound_Shop_Buy_Enable) {
                                        player.playSound(player.getLocation(), DefultValue.Sound_Shop_Buy, 3, 1);
                                    }
                                } else {
                                    player.closeInventory();
                                    if (DefultValue.Title_No_money_Enable && DefultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_No_money, 10, 70, 20);
                                    } else player.sendMessage(DefultValue.No_money);
                                    if (DefultValue.Sound_Shop_NoMoney_Enable) {
                                        player.playSound(player.getLocation(), DefultValue.Sound_Shop_NoMoney, 3, 1);
                                    }
                                }
                            }
                        } else {
                            e.setCancelled(true);
                            player.closeInventory();
                            if (DefultValue.Title_NoInventorySpace_Enable && DefultValue.Title_Enable) {
                                player.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_NoInventorySpace, 10, 70, 20);
                            } else player.sendMessage(DefultValue.NoInventorySpace);

                            if (DefultValue.Sound_Shop_NoInventorySpace_Enable) {
                                player.playSound(player.getLocation(), DefultValue.Sound_Shop_NoInventorySpace, 3, 1);
                            }
                        }
                    }
                }

                if (e.getCurrentItem().getType() == Material.valueOf(DefultValueItem_1.Item)
                        || e.getCurrentItem().getType() == Material.valueOf(DefultValueItem_2.Item)
                        || e.getCurrentItem().getType() == Material.valueOf(DefultValueItem_3.Item)) {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValueItem_1.Name)
                            || e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValueItem_2.Name)
                            || e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValueItem_3.Name)) {
                        boolean empty = false;
                        for (int i = 0; i < player.getInventory().getSize() - 5; i++) {
                            if (player.getInventory().getItem(i) == null) {
                                empty = true;

                                break;
                            }
                        }
                        if (empty) {

                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValueItem_1.Name)) {
                                if (Shop.buy(player, DefultValueItem_1.price)) {
                                    player.closeInventory();

                                    ItemStack item = new ItemStack(Material.valueOf(DefultValueItem_1.Item));
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefultValueItem_1.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_item_1", true);
                                    player.getInventory().addItem(nbti.getItem());
                                    if (DefultValue.Title_Buy_Enable && DefultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_Buy.replace("[wonderbag]", DefultValueItem_1.Name)
                                                .replace("[price]", String.valueOf(DefultValueItem_2.price))
                                                .replace("[currency]", DefultValue.Currency), 10, 70, 20);
                                    } else {
                                        player.sendMessage(DefultValue.Buy_msg.replace("[wonderbag]", DefultValueItem_1.Name)
                                                .replace("[price]", String.valueOf(DefultValueItem_1.price))
                                                .replace("[currency]", DefultValue.Currency));
                                    }
                                    if (DefultValue.Sound_Shop_Buy_Enable) {
                                        player.playSound(player.getLocation(), DefultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                } else {
                                    player.closeInventory();
                                    if (DefultValue.Title_No_money_Enable && DefultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_No_money, 10, 70, 20);
                                    } else player.sendMessage(DefultValue.No_money);
                                    if (DefultValue.Sound_Shop_NoMoney_Enable) {
                                        player.playSound(player.getLocation(), DefultValue.Sound_Shop_NoMoney, 3, 1);
                                    }
                                }
                            }

                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValueItem_2.Name)) {
                                if (Shop.buy(player, DefultValueItem_2.price)) {
                                    player.closeInventory();

                                    ItemStack item = new ItemStack(Material.valueOf(DefultValueItem_2.Item));
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefultValueItem_2.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_item_2", true);
                                    player.getInventory().addItem(nbti.getItem());
                                    if (DefultValue.Title_Buy_Enable && DefultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_Buy.replace("[wonderbag]", DefultValueItem_2.Name)
                                                .replace("[price]", String.valueOf(DefultValueItem_2.price))
                                                .replace("[currency]", DefultValue.Currency), 10, 70, 20);
                                    } else {
                                        player.sendMessage(DefultValue.Buy_msg.replace("[wonderbag]", DefultValueItem_2.Name)
                                                .replace("[price]", String.valueOf(DefultValueItem_2.price))
                                                .replace("[currency]", DefultValue.Currency));
                                    }
                                    if (DefultValue.Sound_Shop_Buy_Enable) {
                                        player.playSound(player.getLocation(), DefultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                } else {
                                    player.closeInventory();
                                    if (DefultValue.Title_No_money_Enable && DefultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_No_money, 10, 70, 20);
                                    } else player.sendMessage(DefultValue.No_money);
                                    if (DefultValue.Sound_Shop_NoMoney_Enable) {
                                        player.playSound(player.getLocation(), DefultValue.Sound_Shop_NoMoney, 3, 1);
                                    }
                                }
                            }

                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefultValueItem_3.Name)) {
                                if (Shop.buy(player, DefultValueItem_3.price)) {
                                    player.closeInventory();

                                    ItemStack item = new ItemStack(Material.valueOf(DefultValueItem_3.Item));
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefultValueItem_3.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_item_3", true);
                                    player.getInventory().addItem(nbti.getItem());
                                    if (DefultValue.Title_Buy_Enable && DefultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_Buy.replace("[wonderbag]", DefultValueItem_3.Name)
                                                .replace("[price]", String.valueOf(DefultValueItem_3.price))
                                                .replace("[currency]", DefultValue.Currency), 10, 70, 20);
                                    } else {
                                        player.sendMessage(DefultValue.Buy_msg.replace("[wonderbag]", DefultValueItem_3.Name)
                                                .replace("[price]", String.valueOf(DefultValueItem_3.price))
                                                .replace("[currency]", DefultValue.Currency));
                                    }
                                    if (DefultValue.Sound_Shop_Buy_Enable) {
                                        player.playSound(player.getLocation(), DefultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                } else {
                                    player.closeInventory();
                                    if (DefultValue.Title_No_money_Enable && DefultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_No_money, 10, 70, 20);
                                    } else player.sendMessage(DefultValue.No_money);
                                    if (DefultValue.Sound_Shop_NoMoney_Enable) {
                                        player.playSound(player.getLocation(), DefultValue.Sound_Shop_NoMoney, 3, 1);
                                    }
                                }
                            }

                        } else {
                            e.setCancelled(true);
                            player.closeInventory();
                            if (DefultValue.Title_NoInventorySpace_Enable && DefultValue.Title_Enable) {
                                player.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_NoInventorySpace, 10, 70, 20);
                            } else player.sendMessage(DefultValue.NoInventorySpace);

                            if (DefultValue.Sound_Shop_NoInventorySpace_Enable) {
                                player.playSound(player.getLocation(), DefultValue.Sound_Shop_NoInventorySpace, 3, 1);
                            }
                        }
                    }
                }
            }
        }
    }
}