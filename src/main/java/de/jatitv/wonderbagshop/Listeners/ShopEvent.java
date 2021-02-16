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

import de.jatitv.wonderbagshop.config.Messages;
import de.jatitv.wonderbagshop.config.Shop;
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
        if(e.getInventory() !=null && e.getCurrentItem()!= null){
            if (e.getWhoClicked().getOpenInventory().getTitle().equals(Shop.ShopName_GUI)) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {
                    case CHEST:
                        switch (e.getCurrentItem().getAmount()) {
                            case 1:
                                player.closeInventory();
                                if (de.jatitv.wonderbagshop.commands.Shop.buy(player, Shop.WB1price)) {

                                    player.sendMessage(String.valueOf(Shop.WB1price));

                                    ItemStack item = new ItemStack(Material.CHEST);
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(Shop.WB1ChestName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    itemMeta.setUnbreakable(itemMeta.isUnbreakable());
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    NBTItem nbti1 = new NBTItem(item);
                                    nbti1.setBoolean("loot_chest_1", true);
                                    player.getInventory().addItem(nbti1.getItem());

                                    player.sendMessage(Messages.WB1buy_msg);

                                } else {
                                    player.sendMessage(Messages.No_money);
                                }
                                break;

                            case 2:
                                player.closeInventory();
                                if (de.jatitv.wonderbagshop.commands.Shop.buy(player, Shop.WB2price)) {

                                    ItemStack item = new ItemStack(Material.CHEST);
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(Shop.WB2ChestName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    player.getInventory().addItem(item);

                                    player.sendMessage(Messages.WB2buy_msg);

                                } else {
                                    player.sendMessage(Messages.No_money);
                                }
                                break;

                            case 3:
                                player.closeInventory();
                                if (de.jatitv.wonderbagshop.commands.Shop.buy(player, Shop.WB3price)) {

                                    ItemStack item = new ItemStack(Material.CHEST);
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(Shop.WB3ChestName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    itemMeta.setLore(lore);
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    player.getInventory().addItem(item);

                                    player.sendMessage(Messages.WB3buy_msg);
                                } else {
                                    player.sendMessage(Messages.No_money);
                                }
                                break;
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
