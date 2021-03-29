// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.commands;

import de.jatitv.wonderbagshop.defaultValue.*;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_1;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_2;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.chest.DefaultValueChest_3;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_1;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_2;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_3;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ConsoleGive {

    public static void giveCommand(CommandSender sender, String reciver, String wb) {

        Player target = Bukkit.getPlayer(reciver);
        boolean empty = false;
        for (int i = 0; i < target.getInventory().getSize() - 5; i++) {
            if (target.getInventory().getItem(i) == null) {
                empty = true;
                break;
            }
        }
        if (empty) {
            if (wb.equals("ChestSmall")) {
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

                sender.sendMessage(DefaultValue.give.replace("[sender]", "Console").replace("[player]", target.getName())
                        .replace("[wonderbag]", DefaultValueChest_1.Name));

                if (DefaultValue.Title_GiveReceived_Enable && DefaultValue.Title_Enable) {
                    target.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_GiveReceived.replace("[sender]", "Console")
                            .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueChest_1.Name), 10, 70, 20);
                }
                target.sendMessage(DefaultValue.giveReceived.replace("[sender]", "Console").replace("[player]", target.getName())
                        .replace("[wonderbag]", DefaultValueChest_1.Name));
                if (DefaultValue.Sound_Give_Enable && DefaultValue.Sound_Enable) {
                    target.playSound(target.getLocation(), DefaultValue.Sound_Give, 3, 1);
                }

                if (DefaultValue.Debug){
                    Bukkit.getConsoleSender().sendMessage("§4 Onlineplayer: §6" + Bukkit.getPlayer(Bukkit.getName()));
                }
            } else {
                if (wb.equals("ChestMedium")) {
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

                    sender.sendMessage(DefaultValue.give.replace("[sender]", "Console").replace("[player]", target.getName())
                            .replace("[wonderbag]", DefaultValueChest_2.Name));

                    if (DefaultValue.Title_GiveReceived_Enable && DefaultValue.Title_Enable) {
                        target.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_GiveReceived.replace("[sender]", "Console")
                                .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueChest_2.Name), 10, 70, 20);
                    }
                    target.sendMessage(DefaultValue.giveReceived.replace("[sender]", "Console").replace("[player]", target.getName())
                            .replace("[wonderbag]", DefaultValueChest_2.Name));
                    if (DefaultValue.Sound_Give_Enable && DefaultValue.Sound_Enable) {
                        target.playSound(target.getLocation(), DefaultValue.Sound_Give, 3, 1);
                    }
                } else {
                    if (wb.equals("ChestLarge")) {
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

                        sender.sendMessage(DefaultValue.give.replace("[sender]", "Console").replace("[player]", target.getName())
                                .replace("[wonderbag]", DefaultValueChest_3.Name));

                        if (DefaultValue.Title_GiveReceived_Enable && DefaultValue.Title_Enable) {
                            target.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_GiveReceived.replace("[sender]", "Console")
                                    .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueChest_3.Name), 10, 70, 20);
                        }
                        target.sendMessage(DefaultValue.giveReceived.replace("[sender]", "Console").replace("[player]", target.getName())
                                .replace("[wonderbag]", DefaultValueChest_3.Name));
                        if (DefaultValue.Sound_Give_Enable && DefaultValue.Sound_Enable) {
                            target.playSound(target.getLocation(), DefaultValue.Sound_Give, 3, 1);
                        }
                    } else {
                        if (wb.equals("ItemSmall")) {
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

                            sender.sendMessage(DefaultValue.give.replace("[sender]", "Console").replace("[player]", target.getName())
                                    .replace("[wonderbag]", DefaultValueItem_1.Name));

                            if (DefaultValue.Title_GiveReceived_Enable && DefaultValue.Title_Enable) {
                                target.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_GiveReceived.replace("[sender]", "Console")
                                        .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueItem_1.Name), 10, 70, 20);
                            }
                            target.sendMessage(DefaultValue.giveReceived.replace("[sender]", "Console").replace("[player]", target.getName())
                                    .replace("[wonderbag]", DefaultValueChest_1.Name));
                            if (DefaultValue.Sound_Give_Enable && DefaultValue.Sound_Enable) {
                                target.playSound(target.getLocation(), DefaultValue.Sound_Give, 3, 1);
                            }
                        } else {
                            if (wb.equals("ItemMedium")) {
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

                                sender.sendMessage(DefaultValue.give.replace("[sender]", "Console").replace("[player]", target.getName())
                                        .replace("[wonderbag]", DefaultValueItem_2.Name));

                                if (DefaultValue.Title_GiveReceived_Enable && DefaultValue.Title_Enable) {
                                    target.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_GiveReceived.replace("[sender]", "Console")
                                            .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueItem_2.Name), 10, 70, 20);
                                }
                                target.sendMessage(DefaultValue.giveReceived.replace("[sender]", "Console").replace("[player]", target.getName())
                                        .replace("[wonderbag]", DefaultValueItem_2.Name));
                                if (DefaultValue.Sound_Give_Enable && DefaultValue.Sound_Enable) {
                                    target.playSound(target.getLocation(), DefaultValue.Sound_Give, 3, 1);
                                }
                            } else {
                                if (wb.equals("ItemLarge")) {
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

                                    sender.sendMessage(DefaultValue.give.replace("[sender]", "Console").replace("[player]", target.getName())
                                            .replace("[wonderbag]", DefaultValueItem_3.Name));

                                    if (DefaultValue.Title_GiveReceived_Enable && DefaultValue.Title_Enable) {
                                        target.sendTitle("§2Wonder§6Bag§9Shop", DefaultValue.Title_GiveReceived.replace("[sender]", "Console")
                                                .replace("[player]", target.getName()).replace("[wonderbag]", DefaultValueItem_3.Name), 10, 70, 20);
                                    }
                                    target.sendMessage(DefaultValue.giveReceived.replace("[sender]", "Console").replace("[player]", target.getName())
                                            .replace("[wonderbag]", DefaultValueItem_3.Name));
                                    if (DefaultValue.Sound_Give_Enable && DefaultValue.Sound_Enable) {
                                        target.playSound(target.getLocation(), DefaultValue.Sound_Give, 3, 1);
                                    }
                                } else Help.Help(sender);
                            }
                        }
                    }
                }
            }
        } else {
            sender.sendMessage(DefaultValue.PlayerNoInventorySpace.replace("[player]", target.getName()));
        }
    }

}
