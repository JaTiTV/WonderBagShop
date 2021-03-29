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

package de.jatitv.wonderbagshop.listeners.settingsGUI;

import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_1;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_2;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_3;
import de.jatitv.wonderbagshop.gui.settingsGUI.*;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.scheduler.BukkitRunnable;


public class GUI_Settings_Listener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) throws InterruptedException {
        Player player = (Player) e.getWhoClicked();
        if (e.getInventory() != null && e.getCurrentItem() != null) {
            if (e.getWhoClicked().getOpenInventory().getTitle().equals("§2Wonder§6Bag§9Shop §7| §4Settings")) {

                e.setCancelled(true);

                // Settings

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Config") && e.getCurrentItem().getType() == Material.CRAFTING_TABLE) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    GUI_Config.openConfig(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4open Config");
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Wonderbag Chest small") && e.getCurrentItem().getType() == Material.CHEST) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    GUI_Chest1.openConfigChest1(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4open Wonderbag Chest small");
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Wonderbag Chest medium") && e.getCurrentItem().getType() == Material.CHEST) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    GUI_Chest2.openConfigChest2(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4open Wonderbag Chest medium");
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Wonderbag Chest large") && e.getCurrentItem().getType() == Material.CHEST) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    GUI_Chest3.openConfigChest3(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4open Wonderbag Chest large");
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Wonderbag Item small") && e.getCurrentItem().getType() == Material.valueOf(DefaultValueItem_1.Item)) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    GUI_Item1.openConfigItem1(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4open Wonderbag Item small");
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Wonderbag Item medium") && e.getCurrentItem().getType() == Material.valueOf(DefaultValueItem_2.Item)) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    GUI_Item2.openConfigItem2(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4open Wonderbag Item medium");
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Wonderbag Item large") && e.getCurrentItem().getType() == Material.valueOf(DefaultValueItem_3.Item)) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    GUI_Item3.openConfigItem3(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4open Wonderbag Item large");
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6WBS Reload") && e.getCurrentItem().getType() == Material.ANVIL) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    if (player instanceof Player) player.sendMessage(DefaultValue.PrefixHC + DefaultValue.ReloadStart);
                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");
                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§6Plugin reload...");
                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");

                    Bukkit.getServer().getPluginManager().getPlugin(Main.plugin.getName()).onEnable();

                    if (player instanceof Player) player.sendMessage(DefaultValue.PrefixHC + DefaultValue.ReloadEnd);
                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");
                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2Plugin successfully reloaded.");
                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");
                    if(DefaultValue.Title_Reload_Enable && DefaultValue.Title_Enable) {
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                GUI_Settings.openSettings(player);
                            }
                        }.runTaskLater(Main.getPlugin(), 100L);
                    } else GUI_Settings.openSettings(player);

                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4open Config");
                    }
                }

                if (e.getCurrentItem().getType() == Material.GRAY_WOOL || e.getCurrentItem().getType() == Material.BLACK_STAINED_GLASS_PANE) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 3, 1);
                }
            }
        }
    }
}