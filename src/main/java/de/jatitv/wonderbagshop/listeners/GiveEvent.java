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

import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_1;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_2;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_3;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_1;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_2;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_3;
import de.jatitv.wonderbagshop.gui.ShopGive;
import de.jatitv.wonderbagshop.defaultValue.*;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GiveEvent implements Listener {

    @EventHandler
    public static void onInventoryClickGive(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();
        if (player.hasPermission("wonderbagshop.command.give") || player.hasPermission("wonderbagshop.admin") || player.isOp()) {
            Player target = (ShopGive.ShopSendSender.get(player));
            if (e.getInventory() != null && e.getCurrentItem() != null) {
                if (e.getWhoClicked().getOpenInventory().getTitle().equals(ShopGive.GiveName)) {
                    e.setCancelled(true);
                    if (e.getCurrentItem().getType() == Material.CHEST) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueChest_1.Name)
                                || e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueChest_2.Name)
                                || e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueChest_3.Name)) {
                            boolean empty = false;
                            for (int i = 0; i < target.getInventory().getSize() - 5; i++) {
                                if (target.getInventory().getItem(i) == null) {
                                    empty = true;
                                    break;
                                }
                            }
                            if (empty) {
                                if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueChest_1.Name)) {

                                    player.closeInventory();

                                    ItemStack item = new ItemStack(Material.CHEST);
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefaultValueChest_1.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_chest_1", true);
                                    target.getInventory().addItem(nbti.getItem());

                                    if (DefaultValue.Title_Give_Enable && DefaultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_Give.replace("[sender]", player.getName())
                                                .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueChest_1.Name), 10, 70, 20);
                                    } else {
                                        player.sendMessage(DefaultValue.give.replace("[sender]", player.getName()).replace("[player]", target.getName())
                                                .replace("[wonderbag]", DefaultValueChest_1.Name));
                                    }
                                    if (DefaultValue.Sound_Shop_Buy_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                    if (DefaultValue.Title_GiveReceived_Enable && DefaultValue.Title_Enable) {
                                        target.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_GiveReceived.replace("[sender]", player.getName())
                                                .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueChest_1.Name), 10, 70, 20);
                                    }
                                    target.sendMessage(DefaultValue.giveReceived.replace("[sender]", player.getName()).replace("[player]", target.getName())
                                            .replace("[wonderbag]", DefaultValueChest_1.Name));
                                    if (DefaultValue.Sound_Give_Enable && DefaultValue.Sound_Enable) {
                                        target.playSound(target.getLocation(), DefaultValue.Sound_Give, 3, 1);
                                    }
                                }


                                if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueChest_2.Name)) {

                                    player.closeInventory();

                                    ItemStack item = new ItemStack(Material.CHEST);
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefaultValueChest_2.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_chest_2", true);
                                    target.getInventory().addItem(nbti.getItem());

                                    if (DefaultValue.Title_Give_Enable && DefaultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_Give.replace("[sender]", player.getName())
                                                .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueChest_2.Name), 10, 70, 20);
                                    } else {
                                        player.sendMessage(DefaultValue.give.replace("[sender]", player.getName()).replace("[player]", target.getName())
                                                .replace("[wonderbag]", DefaultValueChest_2.Name));
                                    }
                                    if (DefaultValue.Sound_Shop_Buy_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                    if (DefaultValue.Title_GiveReceived_Enable && DefaultValue.Title_Enable) {
                                        target.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_GiveReceived.replace("[sender]", player.getName())
                                                .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueChest_2.Name), 10, 70, 20);
                                    }
                                    target.sendMessage(DefaultValue.giveReceived.replace("[sender]", player.getName()).replace("[player]", target.getName())
                                            .replace("[wonderbag]", DefaultValueChest_2.Name));
                                    if (DefaultValue.Sound_Give_Enable && DefaultValue.Sound_Enable) {
                                        target.playSound(target.getLocation(), DefaultValue.Sound_Give, 3, 1);
                                    }
                                }


                                if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueChest_3.Name)) {

                                    player.closeInventory();

                                    ItemStack item = new ItemStack(Material.CHEST);
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefaultValueChest_3.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_chest_3", true);
                                    target.getInventory().addItem(nbti.getItem());

                                    if (DefaultValue.Title_Give_Enable && DefaultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_Give.replace("[sender]", player.getName())
                                                .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueChest_3.Name), 10, 70, 20);
                                    } else {
                                        player.sendMessage(DefaultValue.give.replace("[sender]", player.getName()).replace("[player]", target.getName())
                                                .replace("[wonderbag]", DefaultValueChest_3.Name));
                                    }
                                    if (DefaultValue.Sound_Shop_Buy_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                    if (DefaultValue.Title_GiveReceived_Enable && DefaultValue.Title_Enable) {
                                        target.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_GiveReceived.replace("[sender]", player.getName())
                                                .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueChest_3.Name), 10, 70, 20);
                                    }
                                    target.sendMessage(DefaultValue.giveReceived.replace("[sender]", player.getName()).replace("[player]", target.getName())
                                            .replace("[wonderbag]", DefaultValueChest_3.Name));
                                    if (DefaultValue.Sound_Give_Enable && DefaultValue.Sound_Enable) {
                                        target.playSound(target.getLocation(), DefaultValue.Sound_Give, 3, 1);
                                    }
                                }
                            } else {
                                e.setCancelled(true);
                                player.closeInventory();
                                if (DefaultValue.Title_PlayerNoInventorySpace_Enable && DefaultValue.Title_Enable) {
                                    player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_PlayerNoInventorySpace.replace("[player]", target.getName())
                                            , 10, 70, 20);
                                } else player.sendMessage(DefaultValue.PlayerNoInventorySpace.replace("[player]", target.getName()));

                                player.playSound(player.getLocation(), DefaultValue.Sound_Shop_NoInventorySpace, 3, 1);

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
                            for (int i = 0; i < target.getInventory().getSize() - 5; i++) {
                                if (target.getInventory().getItem(i) == null) {
                                    empty = true;

                                    break;
                                }
                            }
                            if (empty) {

                                if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueItem_1.Name)) {

                                    player.closeInventory();

                                    ItemStack item = new ItemStack(Material.valueOf(DefaultValueItem_1.Item));
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefaultValueItem_1.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_item_1", true);
                                    target.getInventory().addItem(nbti.getItem());

                                    if (DefaultValue.Title_Give_Enable && DefaultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_Give.replace("[sender]", player.getName())
                                                .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueItem_1.Name), 10, 70, 20);
                                    } else {
                                        player.sendMessage(DefaultValue.give.replace("[sender]", player.getName()).replace("[player]", target.getName())
                                                .replace("[wonderbag]", DefaultValueItem_1.Name));
                                    }
                                    if (DefaultValue.Sound_Shop_Buy_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                    if (DefaultValue.Title_GiveReceived_Enable && DefaultValue.Title_Enable) {
                                        target.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_GiveReceived.replace("[sender]", player.getName())
                                                .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueItem_1.Name), 10, 70, 20);
                                    }
                                    target.sendMessage(DefaultValue.giveReceived.replace("[sender]", player.getName()).replace("[player]", target.getName())
                                            .replace("[wonderbag]", DefaultValueItem_1.Name));
                                    if (DefaultValue.Sound_Give_Enable && DefaultValue.Sound_Enable) {
                                        target.playSound(target.getLocation(), DefaultValue.Sound_Give, 3, 1);
                                    }

                                    if (DefaultValue.Sound_Shop_Buy_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_Buy, 3, 1);
                                    }
                                }

                                if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueItem_2.Name)) {

                                    player.closeInventory();

                                    ItemStack item = new ItemStack(Material.valueOf(DefaultValueItem_2.Item));
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefaultValueItem_2.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_item_2", true);
                                    target.getInventory().addItem(nbti.getItem());

                                    if (DefaultValue.Title_Give_Enable && DefaultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_Give.replace("[sender]", player.getName())
                                                .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueItem_2.Name), 10, 70, 20);
                                    } else {
                                        player.sendMessage(DefaultValue.give.replace("[sender]", player.getName()).replace("[player]", target.getName())
                                                .replace("[wonderbag]", DefaultValueItem_2.Name));
                                    }
                                    if (DefaultValue.Sound_Shop_Buy_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                    if (DefaultValue.Title_GiveReceived_Enable && DefaultValue.Title_Enable) {
                                        target.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_GiveReceived.replace("[sender]", player.getName())
                                                .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueItem_2.Name), 10, 70, 20);
                                    }
                                    target.sendMessage(DefaultValue.giveReceived.replace("[sender]", player.getName()).replace("[player]", target.getName())
                                            .replace("[wonderbag]", DefaultValueItem_2.Name));
                                    if (DefaultValue.Sound_Give_Enable && DefaultValue.Sound_Enable) {
                                        target.playSound(target.getLocation(), DefaultValue.Sound_Give, 3, 1);
                                    }

                                    if (DefaultValue.Sound_Shop_Buy_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_Buy, 3, 1);
                                    }
                                }

                                if (e.getCurrentItem().getItemMeta().getDisplayName().equals(DefaultValueItem_3.Name)) {

                                    player.closeInventory();

                                    ItemStack item = new ItemStack(Material.valueOf(DefaultValueItem_3.Item));
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefaultValueItem_3.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_item_3", true);
                                    target.getInventory().addItem(nbti.getItem());

                                    if (DefaultValue.Title_Give_Enable && DefaultValue.Title_Enable) {
                                        player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_Give.replace("[sender]", player.getName())
                                                .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueItem_3.Name), 10, 70, 20);
                                    } else {
                                        player.sendMessage(DefaultValue.give.replace("[sender]", player.getName()).replace("[player]", target.getName())
                                                .replace("[wonderbag]", DefaultValueItem_3.Name));
                                    }
                                    if (DefaultValue.Sound_Shop_Buy_Enable && DefaultValue.Sound_Enable) {
                                        player.playSound(player.getLocation(), DefaultValue.Sound_Shop_Buy, 3, 1);
                                    }

                                    if (DefaultValue.Title_GiveReceived_Enable && DefaultValue.Title_Enable) {
                                        target.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_GiveReceived.replace("[sender]", player.getName())
                                                .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueItem_3.Name), 10, 70, 20);
                                    }
                                    target.sendMessage(DefaultValue.giveReceived.replace("[sender]", player.getName()).replace("[player]", target.getName())
                                            .replace("[wonderbag]", DefaultValueItem_3.Name));
                                    if (DefaultValue.Sound_Give_Enable && DefaultValue.Sound_Enable) {
                                        target.playSound(target.getLocation(), DefaultValue.Sound_Give, 3, 1);
                                    }
                                }
                            } else {
                                e.setCancelled(true);
                                player.closeInventory();
                                if (DefaultValue.Title_PlayerNoInventorySpace_Enable && DefaultValue.Title_Enable) {
                                    player.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_PlayerNoInventorySpace.replace("[player]", target.getName())
                                            , 10, 70, 20);
                                } else player.sendMessage(DefaultValue.PlayerNoInventorySpace.replace("[player]", target.getName()));

                                player.playSound(player.getLocation(), DefaultValue.Sound_Shop_NoInventorySpace, 3, 1);

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
}