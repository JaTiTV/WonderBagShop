// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.commands;

import de.jatitv.wonderbagshop.defultValue.*;
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
                itemMeta.setDisplayName(DefultValueChest_1.DisplayName);
                ArrayList<String> lore = new ArrayList<>();
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                item.setAmount(1);
                NBTItem nbti = new NBTItem(item);
                nbti.setBoolean("loot_chest_1", true);
                target.getInventory().addItem(nbti.getItem());

                sender.sendMessage(DefultValue.give.replace("[sender]", "Console").replace("[player]", target.getName())
                        .replace("[wonderbag]", DefultValueChest_1.Name));

                if (DefultValue.Title_GiveReceived_Enable && DefultValue.Title_Enable) {
                    target.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_GiveReceived.replace("[sender]", "Console")
                            .replace("[player]", target.getName()).replace("[wonderbag]", DefultValueChest_1.Name), 10, 70, 20);
                }
                target.sendMessage(DefultValue.giveReceived.replace("[sender]", "Console").replace("[player]", target.getName())
                        .replace("[wonderbag]", DefultValueChest_1.Name));
                if (DefultValue.Sound_Give_Enable && DefultValue.Sound_Enable) {
                    target.playSound(target.getLocation(), DefultValue.Sound_Give, 3, 1);
                }

                if (DefultValue.Debug){
                    Bukkit.getConsoleSender().sendMessage("§4 Onlineplayer: §6" + Bukkit.getPlayer(Bukkit.getName()));
                }
            } else {
                if (wb.equals("ChestMedium")) {
                    ItemStack item = new ItemStack(Material.CHEST);
                    ItemMeta itemMeta = item.getItemMeta();
                    itemMeta.setDisplayName(DefultValueChest_2.DisplayName);
                    ArrayList<String> lore = new ArrayList<>();
                    itemMeta.setLore(lore);
                    item.setItemMeta(itemMeta);
                    item.setAmount(1);
                    NBTItem nbti = new NBTItem(item);
                    nbti.setBoolean("loot_chest_2", true);
                    target.getInventory().addItem(nbti.getItem());

                    sender.sendMessage(DefultValue.give.replace("[sender]", "Console").replace("[player]", target.getName())
                            .replace("[wonderbag]", DefultValueChest_2.Name));

                    if (DefultValue.Title_GiveReceived_Enable && DefultValue.Title_Enable) {
                        target.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_GiveReceived.replace("[sender]", "Console")
                                .replace("[player]", target.getName()).replace("[wonderbag]", DefultValueChest_2.Name), 10, 70, 20);
                    }
                    target.sendMessage(DefultValue.giveReceived.replace("[sender]", "Console").replace("[player]", target.getName())
                            .replace("[wonderbag]", DefultValueChest_2.Name));
                    if (DefultValue.Sound_Give_Enable && DefultValue.Sound_Enable) {
                        target.playSound(target.getLocation(), DefultValue.Sound_Give, 3, 1);
                    }
                } else {
                    if (wb.equals("ChestLarge")) {
                        ItemStack item = new ItemStack(Material.CHEST);
                        ItemMeta itemMeta = item.getItemMeta();
                        itemMeta.setDisplayName(DefultValueChest_3.DisplayName);
                        ArrayList<String> lore = new ArrayList<>();
                        itemMeta.setLore(lore);
                        item.setItemMeta(itemMeta);
                        item.setAmount(1);
                        NBTItem nbti = new NBTItem(item);
                        nbti.setBoolean("loot_chest_3", true);
                        target.getInventory().addItem(nbti.getItem());

                        sender.sendMessage(DefultValue.give.replace("[sender]", "Console").replace("[player]", target.getName())
                                .replace("[wonderbag]", DefultValueChest_3.Name));

                        if (DefultValue.Title_GiveReceived_Enable && DefultValue.Title_Enable) {
                            target.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_GiveReceived.replace("[sender]", "Console")
                                    .replace("[player]", target.getName()).replace("[wonderbag]", DefultValueChest_3.Name), 10, 70, 20);
                        }
                        target.sendMessage(DefultValue.giveReceived.replace("[sender]", "Console").replace("[player]", target.getName())
                                .replace("[wonderbag]", DefultValueChest_3.Name));
                        if (DefultValue.Sound_Give_Enable && DefultValue.Sound_Enable) {
                            target.playSound(target.getLocation(), DefultValue.Sound_Give, 3, 1);
                        }
                    } else {
                        if (wb.equals("ItemSmall")) {
                            ItemStack item = new ItemStack(Material.valueOf(DefultValueItem_1.Item));
                            ItemMeta itemMeta = item.getItemMeta();
                            itemMeta.setDisplayName(DefultValueItem_1.DisplayName);
                            ArrayList<String> lore = new ArrayList<>();
                            itemMeta.setLore(lore);
                            item.setItemMeta(itemMeta);
                            item.setAmount(1);
                            NBTItem nbti = new NBTItem(item);
                            nbti.setBoolean("loot_item_1", true);
                            target.getInventory().addItem(nbti.getItem());

                            sender.sendMessage(DefultValue.give.replace("[sender]", "Console").replace("[player]", target.getName())
                                    .replace("[wonderbag]", DefultValueItem_1.Name));

                            if (DefultValue.Title_GiveReceived_Enable && DefultValue.Title_Enable) {
                                target.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_GiveReceived.replace("[sender]", "Console")
                                        .replace("[player]", target.getName()).replace("[wonderbag]", DefultValueItem_1.Name), 10, 70, 20);
                            }
                            target.sendMessage(DefultValue.giveReceived.replace("[sender]", "Console").replace("[player]", target.getName())
                                    .replace("[wonderbag]", DefultValueChest_1.Name));
                            if (DefultValue.Sound_Give_Enable && DefultValue.Sound_Enable) {
                                target.playSound(target.getLocation(), DefultValue.Sound_Give, 3, 1);
                            }
                        } else {
                            if (wb.equals("ItemMedium")) {
                                ItemStack item = new ItemStack(Material.valueOf(DefultValueItem_2.Item));
                                ItemMeta itemMeta = item.getItemMeta();
                                itemMeta.setDisplayName(DefultValueItem_2.DisplayName);
                                ArrayList<String> lore = new ArrayList<>();
                                itemMeta.setLore(lore);
                                item.setItemMeta(itemMeta);
                                item.setAmount(1);
                                NBTItem nbti = new NBTItem(item);
                                nbti.setBoolean("loot_item_2", true);
                                target.getInventory().addItem(nbti.getItem());

                                sender.sendMessage(DefultValue.give.replace("[sender]", "Console").replace("[player]", target.getName())
                                        .replace("[wonderbag]", DefultValueItem_2.Name));

                                if (DefultValue.Title_GiveReceived_Enable && DefultValue.Title_Enable) {
                                    target.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_GiveReceived.replace("[sender]", "Console")
                                            .replace("[player]", target.getName()).replace("[wonderbag]", DefultValueItem_2.Name), 10, 70, 20);
                                }
                                target.sendMessage(DefultValue.giveReceived.replace("[sender]", "Console").replace("[player]", target.getName())
                                        .replace("[wonderbag]", DefultValueItem_2.Name));
                                if (DefultValue.Sound_Give_Enable && DefultValue.Sound_Enable) {
                                    target.playSound(target.getLocation(), DefultValue.Sound_Give, 3, 1);
                                }
                            } else {
                                if (wb.equals("ItemLarge")) {
                                    ItemStack item = new ItemStack(Material.valueOf(DefultValueItem_3.Item));
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(DefultValueItem_3.DisplayName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti = new NBTItem(item);
                                    nbti.setBoolean("loot_item_3", true);
                                    target.getInventory().addItem(nbti.getItem());

                                    sender.sendMessage(DefultValue.give.replace("[sender]", "Console").replace("[player]", target.getName())
                                            .replace("[wonderbag]", DefultValueItem_3.Name));

                                    if (DefultValue.Title_GiveReceived_Enable && DefultValue.Title_Enable) {
                                        target.sendTitle("§2Wonder§6Bag§9Shop", DefultValue.Title_GiveReceived.replace("[sender]", "Console")
                                                .replace("[player]", target.getName()).replace("[wonderbag]", DefultValueItem_3.Name), 10, 70, 20);
                                    }
                                    target.sendMessage(DefultValue.giveReceived.replace("[sender]", "Console").replace("[player]", target.getName())
                                            .replace("[wonderbag]", DefultValueItem_3.Name));
                                    if (DefultValue.Sound_Give_Enable && DefultValue.Sound_Enable) {
                                        target.playSound(target.getLocation(), DefultValue.Sound_Give, 3, 1);
                                    }
                                } else DefultValue.Help(sender);
                            }
                        }
                    }
                }
            }
        } else {
            sender.sendMessage(DefultValue.PlayerNoInventorySpace.replace("[player]", target.getName()));
        }
    }

}
