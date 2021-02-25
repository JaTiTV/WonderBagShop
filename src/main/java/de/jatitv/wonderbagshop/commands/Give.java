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

package de.jatitv.wonderbagshop.commands;

import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB1;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB2;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB3;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Give {

    public static void giveCommand(CommandSender sender, String reciver, String wb) {

        Player playerSender = null;

        if (sender instanceof Player){
            playerSender = (Player) sender;
        }

        Player target = Bukkit.getPlayer(reciver);
        boolean empty = false;
        for (int i = 0; i < target.getInventory().getSize() - 5; i++) {
            if (target.getInventory().getItem(i) == null) {
                empty = true;

                break;
            }
        }
        if (empty) {
            if (wb.equals("small")) {
                ItemStack item = new ItemStack(Material.CHEST);
                ItemMeta itemMeta = item.getItemMeta();
                itemMeta.setDisplayName(DefultValue_WB1.ChestName);
                ArrayList<String> lore = new ArrayList<>();
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                item.setAmount(1);
                NBTItem nbti = new NBTItem(item);
                nbti.setBoolean("loot_chest_1", true);
                target.getInventory().addItem(nbti.getItem());

                sender.sendMessage(DefultValue.give.replace("[sender]", sender.getName()).replace("[player]", target.getName())
                        .replace("[wonderbag]", DefultValue_WB1.Name));
                if (DefultValue.Sound_Give_Enable){
                    playerSender.playSound(playerSender.getLocation(),DefultValue.Sound_Give,3,1);
                }

                target.sendMessage(DefultValue.received.replace("[sender]", sender.getName()).replace("[player]", target.getName())
                        .replace("[wonderbag]", DefultValue_WB1.Name));
                if (DefultValue.Sound_Give_Enable){
                    target.playSound(target.getLocation(),DefultValue.Sound_Give,3,1);
                }
            }

            if (wb.equals("medium")) {
                ItemStack item = new ItemStack(Material.CHEST);
                ItemMeta itemMeta = item.getItemMeta();
                itemMeta.setDisplayName(DefultValue_WB2.ChestName);
                ArrayList<String> lore = new ArrayList<>();
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                item.setAmount(1);
                NBTItem nbti = new NBTItem(item);
                nbti.setBoolean("loot_chest_2", true);
                target.getInventory().addItem(nbti.getItem());

                sender.sendMessage(DefultValue.give.replace("[sender]", sender.getName()).replace("[player]", target.getName())
                        .replace("[wonderbag]", DefultValue_WB2.Name));
                if (DefultValue.Sound_Give_Enable){
                    playerSender.playSound(playerSender.getLocation(),DefultValue.Sound_Give,3,1);
                }

                target.sendMessage(DefultValue.received.replace("[sender]", sender.getName()).replace("[player]", target.getName())
                        .replace("[wonderbag]", DefultValue_WB2.Name));
                if (DefultValue.Sound_Give_Enable){
                    target.playSound(target.getLocation(),DefultValue.Sound_Give,3,1);
                }
            }

            if (wb.equals("large")) {
                ItemStack item = new ItemStack(Material.CHEST);
                ItemMeta itemMeta = item.getItemMeta();
                itemMeta.setDisplayName(DefultValue_WB3.ChestName);
                ArrayList<String> lore = new ArrayList<>();
                itemMeta.setLore(lore);
                item.setItemMeta(itemMeta);
                item.setAmount(1);
                NBTItem nbti = new NBTItem(item);
                nbti.setBoolean("loot_chest_3", true);
                target.getInventory().addItem(nbti.getItem());

                sender.sendMessage(DefultValue.give.replace("[sender]", sender.getName()).replace("[player]", target.getName())
                        .replace("[wonderbag]", DefultValue_WB3.Name));
                if (DefultValue.Sound_Give_Enable){
                    playerSender.playSound(playerSender.getLocation(),DefultValue.Sound_Give,3,1);
                }

                target.sendMessage(DefultValue.received.replace("[sender]", sender.getName()).replace("[player]", target.getName())
                        .replace("[wonderbag]", DefultValue_WB3.Name));
                if (DefultValue.Sound_Give_Enable){
                    target.playSound(target.getLocation(),DefultValue.Sound_Give,3,1);
                }
            }
        } else {
            sender.sendMessage(DefultValue.PlayerNoInventorySpace.replace("[player]", target.getName()));
            playerSender.playSound(playerSender.getLocation(),DefultValue.Sound_Shop_NoInventorySpace,3,1);

            if (DefultValue.Sound_Shop_NoInventorySpace_Enable) {
                if (sender instanceof Player){
                    Player player = (Player) sender;
                    player.playSound(player.getLocation(), DefultValue.Sound_Shop_NoInventorySpace, 3, 1);
                }

            }
        }
    }
}
