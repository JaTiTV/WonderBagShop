// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.Listeners;

import de.jatitv.wonderbagshop.config.Messages;
import de.jatitv.wonderbagshop.config.Shop;
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
            if (e.getWhoClicked().getOpenInventory().getTitle().equals(Shop.ShopName)) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {
                    case CHEST:
                        switch (e.getCurrentItem().getAmount()) {
                            case 1:
                                player.closeInventory();
                                if (de.jatitv.wonderbagshop.commands.Shop.buy(player, Shop.WB1price)) {

                                    ItemStack item = new ItemStack(Material.CHEST);
                                    ItemMeta itemMeta = item.getItemMeta();
                                    itemMeta.setDisplayName(Shop.WB1ChestName);
                                    ArrayList<String> lore = new ArrayList<>();
                                    lore.add("§klsif3153s1fSEsfsS");
                                    lore.add("§k42se2f1s2e4fs21fe");
                                    itemMeta.setLore(lore);
                                    itemMeta.setUnbreakable(itemMeta.isUnbreakable());
                                    item.setItemMeta(itemMeta);
                                    item.setAmount(1);
                                    player.getInventory().addItem(item);

                                    player.sendMessage(Shop.WB1buy_msg);

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

                                    player.sendMessage(Shop.WB2buy_msg);

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

                                    player.sendMessage(Shop.WB3buy_msg);
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
