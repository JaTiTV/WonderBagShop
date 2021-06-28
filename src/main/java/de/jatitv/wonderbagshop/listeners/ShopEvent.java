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

import de.jatitv.wonderbagshop.defaultValue.*;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_1;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_2;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_3;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_1;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_2;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_3;
import de.jatitv.wonderbagshop.gui.Shop;
import de.jatitv.wonderbagshop.system.Main;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;


public class ShopEvent implements Listener {


    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();
        if (e.getInventory() != null && e.getCurrentItem() != null) {
            if (Main.minecraft1_13 & e.getWhoClicked().getOpenInventory().getTitle().equals(DefaultValue.GUI_Name)
                    | e.getWhoClicked().getOpenInventory().getTitle().equals("§6§8§9§r" + DefaultValue.GUI_Name)) {
                e.setCancelled(true);
                if (e.getCurrentItem().getType() == Material.CHEST) {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueChest_1.Name)
                            || e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueChest_2.Name)
                            || e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueChest_3.Name)) {
                        boolean empty = false;
                        for (int i = 0; i < player.getInventory().getSize() - 5; i++) {
                            if (player.getInventory().getItem(i) == null) {
                                empty = true;

                                break;
                            }
                        }
                        if (empty) {

                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueChest_1.Name)) {
                                if (player.hasPermission("wonderbagshop.shop.bypass") || Shop.buy(player, DefaultValueChest_1.price)) {
                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            player.closeInventory();
                                        }
                                    }.runTaskLater(Main.plugin, 1L);

                                    ItemStack item = new ItemStack(Material.CHEST);
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefaultValueChest_1.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_chest_1", true);
                                    player.getInventory().addItem(nbti.getItem());
                                    if (DefaultValue.Title_Buy_Enable && DefaultValue.Title_Enable) {
                                        if (player.hasPermission("wonderbagshop.shop.bypass")) player.sendMessage(DefaultValue.Bypass);
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_Buy.replace("[wonderbag]", DefaultValueChest_1.Name)
                                                .replace("[price]", String.valueOf(DefaultValueChest_1.price))
                                                .replace("[currency]", DefaultValue.Currency), 10, 70, 20);
                                    } else {
                                        if (player.hasPermission("wonderbagshop.shop.bypass")) player.sendMessage(DefaultValue.Bypass);
                                        player.sendMessage(DefaultValue.Buy_msg.replace("[wonderbag]", DefaultValueChest_1.Name)
                                                .replace("[price]", String.valueOf(DefaultValueChest_1.price))
                                                .replace("[currency]", DefaultValue.Currency));
                                    }
                                    if (DefaultValue.Sound_Shop_Buy_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                } else {
                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            player.closeInventory();
                                        }
                                    }.runTaskLater(Main.plugin, 1L);
                                    if (DefaultValue.Title_No_money_Enable && DefaultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_No_money, 10, 70, 20);
                                    } else player.sendMessage(DefaultValue.No_money);
                                    if (DefaultValue.Sound_Shop_NoMoney_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_NoMoney, 3, 1);
                                    }
                                }
                            }
                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueChest_2.Name)) {
                                if (player.hasPermission("wonderbagshop.shop.bypass") || Shop.buy(player, DefaultValueChest_2.price)) {
                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            player.closeInventory();
                                        }
                                    }.runTaskLater(Main.plugin, 1L);

                                    ItemStack item = new ItemStack(Material.CHEST);
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefaultValueChest_2.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_chest_2", true);
                                    player.getInventory().addItem(nbti.getItem());
                                    if (DefaultValue.Title_Buy_Enable && DefaultValue.Title_Enable) {
                                        if (player.hasPermission("wonderbagshop.shop.bypass")) player.sendMessage(DefaultValue.Bypass);
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_Buy.replace("[wonderbag]", DefaultValueChest_2.Name)
                                                .replace("[price]", String.valueOf(DefaultValueChest_2.price))
                                                .replace("[currency]", DefaultValue.Currency), 10, 70, 20);
                                    } else {
                                        if (player.hasPermission("wonderbagshop.shop.bypass")) player.sendMessage(DefaultValue.Bypass);
                                        player.sendMessage(DefaultValue.Buy_msg.replace("[wonderbag]", DefaultValueChest_2.Name)
                                                .replace("[price]", String.valueOf(DefaultValueChest_2.price))
                                                .replace("[currency]", DefaultValue.Currency));
                                    }
                                    if (DefaultValue.Sound_Shop_Buy_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                } else {
                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            player.closeInventory();
                                        }
                                    }.runTaskLater(Main.plugin, 1L);
                                    if (DefaultValue.Title_No_money_Enable && DefaultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_No_money, 10, 70, 20);
                                    } else player.sendMessage(DefaultValue.No_money);
                                    if (DefaultValue.Sound_Shop_NoMoney_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_NoMoney, 3, 1);
                                    }
                                }
                            }


                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueChest_3.Name)) {
                                if (player.hasPermission("wonderbagshop.shop.bypass") || Shop.buy(player, DefaultValueChest_3.price)) {
                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            player.closeInventory();
                                        }
                                    }.runTaskLater(Main.plugin, 1L);

                                    ItemStack item = new ItemStack(Material.CHEST);
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefaultValueChest_3.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_chest_3", true);
                                    player.getInventory().addItem(nbti.getItem());
                                    if (DefaultValue.Title_Buy_Enable && DefaultValue.Title_Enable) {
                                        if (player.hasPermission("wonderbagshop.shop.bypass")) player.sendMessage(DefaultValue.Bypass);
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_Buy.replace("[wonderbag]", DefaultValueChest_3.Name)
                                                .replace("[price]", String.valueOf(DefaultValueChest_3.price))
                                                .replace("[currency]", DefaultValue.Currency), 10, 70, 20);
                                    } else {
                                        if (player.hasPermission("wonderbagshop.shop.bypass")) player.sendMessage(DefaultValue.Bypass);
                                        player.sendMessage(DefaultValue.Buy_msg.replace("[wonderbag]", DefaultValueChest_3.Name)
                                                .replace("[price]", String.valueOf(DefaultValueChest_3.price))
                                                .replace("[currency]", DefaultValue.Currency));
                                    }
                                    if (DefaultValue.Sound_Shop_Buy_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_Buy, 3, 1);
                                    }
                                } else {
                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            player.closeInventory();
                                        }
                                    }.runTaskLater(Main.plugin, 1L);
                                    if (DefaultValue.Title_No_money_Enable && DefaultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_No_money, 10, 70, 20);
                                    } else player.sendMessage(DefaultValue.No_money);
                                    if (DefaultValue.Sound_Shop_NoMoney_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_NoMoney, 3, 1);
                                    }
                                }
                            }
                        } else {
                            e.setCancelled(true);
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    player.closeInventory();
                                }
                            }.runTaskLater(Main.plugin, 1L);
                            if (DefaultValue.Title_NoInventorySpace_Enable && DefaultValue.Title_Enable) {
                                player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_NoInventorySpace, 10, 70, 20);
                            } else player.sendMessage(DefaultValue.NoInventorySpace);

                            if (DefaultValue.Sound_Shop_NoInventorySpace_Enable && DefaultValue.Sound_Enable) {
                                player.playSound(player.getLocation(), DefaultValue.Sound_Shop_NoInventorySpace, 3, 1);
                            }
                        }
                    }
                }

                if (e.getCurrentItem().getType() == Material.valueOf(DefaultValueItem_1.Item)
                        || e.getCurrentItem().getType() == Material.valueOf(DefaultValueItem_2.Item)
                        || e.getCurrentItem().getType() == Material.valueOf(DefaultValueItem_3.Item)) {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueItem_1.Name)
                            || e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueItem_2.Name)
                            || e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueItem_3.Name)) {
                        boolean empty = false;
                        for (int i = 0; i < player.getInventory().getSize() - 5; i++) {
                            if (player.getInventory().getItem(i) == null) {
                                empty = true;

                                break;
                            }
                        }
                        if (empty) {

                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueItem_1.Name)) {
                                if (player.hasPermission("wonderbagshop.shop.bypass") || Shop.buy(player, DefaultValueItem_1.price)) {


                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            player.closeInventory();
                                        }
                                    }.runTaskLater(Main.plugin, 1L);
                                    ItemStack item = new ItemStack(Material.valueOf(DefaultValueItem_1.Item));
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefaultValueItem_1.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_item_1", true);
                                    player.getInventory().addItem(nbti.getItem());

                                    if (DefaultValue.Title_Buy_Enable && DefaultValue.Title_Enable) {
                                        if (player.hasPermission("wonderbagshop.shop.bypass")) player.sendMessage(DefaultValue.Bypass);
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_Buy.replace("[wonderbag]", DefaultValueItem_1.Name)
                                                .replace("[price]", String.valueOf(DefaultValueItem_2.price))
                                                .replace("[currency]", DefaultValue.Currency), 10, 70, 20);
                                    } else {
                                        if (player.hasPermission("wonderbagshop.shop.bypass")) player.sendMessage(DefaultValue.Bypass);
                                        player.sendMessage(DefaultValue.Buy_msg.replace("[wonderbag]", DefaultValueItem_1.Name)
                                                .replace("[price]", String.valueOf(DefaultValueItem_1.price))
                                                .replace("[currency]", DefaultValue.Currency));
                                    }
                                    if (DefaultValue.Sound_Shop_Buy_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                } else {
                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            player.closeInventory();
                                        }
                                    }.runTaskLater(Main.plugin, 1L);
                                    if (DefaultValue.Title_No_money_Enable && DefaultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_No_money, 10, 70, 20);
                                    } else player.sendMessage(DefaultValue.No_money);
                                    if (DefaultValue.Sound_Shop_NoMoney_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_NoMoney, 3, 1);
                                    }
                                }
                            }

                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueItem_2.Name)) {
                                if (player.hasPermission("wonderbagshop.shop.bypass") || Shop.buy(player, DefaultValueItem_2.price)) {
                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            player.closeInventory();
                                        }
                                    }.runTaskLater(Main.plugin, 1L);
                                    ItemStack item = new ItemStack(Material.valueOf(DefaultValueItem_2.Item));
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefaultValueItem_2.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_item_2", true);
                                    player.getInventory().addItem(nbti.getItem());
                                    if (DefaultValue.Title_Buy_Enable && DefaultValue.Title_Enable) {
                                        if (player.hasPermission("wonderbagshop.shop.bypass")) player.sendMessage(DefaultValue.Bypass);
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_Buy.replace("[wonderbag]", DefaultValueItem_2.Name)
                                                .replace("[price]", String.valueOf(DefaultValueItem_2.price))
                                                .replace("[currency]", DefaultValue.Currency), 10, 70, 20);
                                    } else {
                                        if (player.hasPermission("wonderbagshop.shop.bypass")) player.sendMessage(DefaultValue.Bypass);
                                        player.sendMessage(DefaultValue.Buy_msg.replace("[wonderbag]", DefaultValueItem_2.Name)
                                                .replace("[price]", String.valueOf(DefaultValueItem_2.price))
                                                .replace("[currency]", DefaultValue.Currency));
                                    }
                                    if (DefaultValue.Sound_Shop_Buy_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                } else {
                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            player.closeInventory();
                                        }
                                    }.runTaskLater(Main.plugin, 1L);
                                    if (DefaultValue.Title_No_money_Enable && DefaultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_No_money, 10, 70, 20);
                                    } else player.sendMessage(DefaultValue.No_money);
                                    if (DefaultValue.Sound_Shop_NoMoney_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_NoMoney, 3, 1);
                                    }
                                }
                            }

                            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueItem_3.Name)) {
                                if (player.hasPermission("wonderbagshop.shop.bypass") || Shop.buy(player, DefaultValueItem_3.price)) {
                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            player.closeInventory();
                                        }
                                    }.runTaskLater(Main.plugin, 1L);

                                    ItemStack item = new ItemStack(Material.valueOf(DefaultValueItem_3.Item));
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefaultValueItem_3.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_item_3", true);
                                    player.getInventory().addItem(nbti.getItem());
                                    if (DefaultValue.Title_Buy_Enable && DefaultValue.Title_Enable) {
                                        if (player.hasPermission("wonderbagshop.shop.bypass")) player.sendMessage(DefaultValue.Bypass);
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_Buy.replace("[wonderbag]", DefaultValueItem_3.Name)
                                                .replace("[price]", String.valueOf(DefaultValueItem_3.price))
                                                .replace("[currency]", DefaultValue.Currency), 10, 70, 20);
                                    } else {
                                        if (player.hasPermission("wonderbagshop.shop.bypass")) player.sendMessage(DefaultValue.Bypass);
                                        player.sendMessage(DefaultValue.Buy_msg.replace("[wonderbag]", DefaultValueItem_3.Name)
                                                .replace("[price]", String.valueOf(DefaultValueItem_3.price))
                                                .replace("[currency]", DefaultValue.Currency));
                                    }
                                    if (DefaultValue.Sound_Shop_Buy_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                } else {
                                    new BukkitRunnable() {
                                        @Override
                                        public void run() {
                                            player.closeInventory();
                                        }
                                    }.runTaskLater(Main.plugin, 1L);
                                    if (DefaultValue.Title_No_money_Enable && DefaultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_No_money, 10, 70, 20);
                                    } else player.sendMessage(DefaultValue.No_money);
                                    if (DefaultValue.Sound_Shop_NoMoney_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_NoMoney, 3, 1);
                                    }
                                }
                            }

                        } else {
                            e.setCancelled(true);
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    player.closeInventory();
                                }
                            }.runTaskLater(Main.plugin, 1L);
                            if (DefaultValue.Title_NoInventorySpace_Enable && DefaultValue.Title_Enable) {
                                player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_NoInventorySpace, 10, 70, 20);
                            } else player.sendMessage(DefaultValue.NoInventorySpace);

                            if (DefaultValue.Sound_Shop_NoInventorySpace_Enable && DefaultValue.Sound_Enable) {
                                player.playSound(player.getLocation(), DefaultValue.Sound_Shop_NoInventorySpace, 3, 1);
                            }
                        }
                    }
                }
            }
        }
    }
}