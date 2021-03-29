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

import de.jatitv.wonderbagshop.config.wonderBags.item.WonderBagItem_2;
import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import de.jatitv.wonderbagshop.gui.settingsGUI.*;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.io.File;
import java.io.IOException;


public class GUI_Item2_Listener implements Listener {

    public GUI_Item2_Listener() {
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) throws InterruptedException {

        Player player = (Player) e.getWhoClicked();
        if (e.getInventory() != null && e.getCurrentItem() != null) {

            if (e.getWhoClicked().getOpenInventory().getTitle().equals(GUI_Item2.GUI_Item2_name)) {
                File WB2ItemYML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Item/" + "medium.yml");
                YamlConfiguration yamlConfiguration_WB2_Item = YamlConfiguration.loadConfiguration(WB2ItemYML);
                e.setCancelled(true);

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Shop Name") && e.getCurrentItem().getType() == Material.YELLOW_WOOL) {
                    GUI_Chat_Listener.EditChat.put(player,"Shop Name Item2");
                    player.sendMessage(DefaultValue.SettingsGUIchatSet.replace("[setting]", "Shop Name Item medium"));
                    player.sendMessage(DefaultValue.SettingsGUIchatCancel);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4Shop Name Item medium");
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Shop Price") && e.getCurrentItem().getType() == Material.BLUE_WOOL) {
                    int i = yamlConfiguration_WB2_Item.getInt("Shop.price");
                    if (e.isRightClick()){
                        yamlConfiguration_WB2_Item.set("Shop.price", i + 1);
                        try {
                            yamlConfiguration_WB2_Item.save(WB2ItemYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        WonderBagItem_2.WB2ItemCreate();
                        GUI_Item2.openConfigItem2(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Shop Price +1");
                        }
                    }
                    if (e.isLeftClick()){
                        yamlConfiguration_WB2_Item.set("Shop.price", i - 1 );
                        try {
                            yamlConfiguration_WB2_Item.save(WB2ItemYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        WonderBagItem_2.WB2ItemCreate();
                        GUI_Item2.openConfigItem2(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Shop Price -1");
                        }
                    }
                    if (e.isShiftClick() && e.isRightClick()){
                        yamlConfiguration_WB2_Item.set("Shop.price", i + 10);
                        try {
                            yamlConfiguration_WB2_Item.save(WB2ItemYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        WonderBagItem_2.WB2ItemCreate();
                        GUI_Item2.openConfigItem2(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Shop Price +10");
                        }
                    }
                    if (e.isShiftClick() && e.isLeftClick()){
                        yamlConfiguration_WB2_Item.set("Shop.price", i - 10 );
                        try {
                            yamlConfiguration_WB2_Item.save(WB2ItemYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        WonderBagItem_2.WB2ItemCreate();
                        GUI_Item2.openConfigItem2(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Shop Price -10");
                        }
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6WonderBag DisplayName") && e.getCurrentItem().getType() == Material.YELLOW_WOOL) {
                    GUI_Chat_Listener.EditChat.put(player,"WonderBag DisplayName Item2");
                    player.sendMessage(DefaultValue.SettingsGUIchatSet.replace("[setting]", "WonderBag DisplayName Item medium"));
                    player.sendMessage(DefaultValue.SettingsGUIchatCancel);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4WonderBag DisplayName Item medium");
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6WonderBag Item_amount") && e.getCurrentItem().getType() == Material.BLUE_WOOL) {
                    int i = yamlConfiguration_WB2_Item.getInt("WonderBag.Item_amount_(1-9)");
                    if (e.isRightClick()){
                        yamlConfiguration_WB2_Item.set("WonderBag.Item_amount_(1-9)", i + 1);
                        try {
                            yamlConfiguration_WB2_Item.save(WB2ItemYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        WonderBagItem_2.WB2ItemCreate();
                        GUI_Item2.openConfigItem2(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set WonderBag Item_amount +1");
                        }
                    }
                    if (e.isLeftClick()){
                        yamlConfiguration_WB2_Item.set("WonderBag.Item_amount_(1-9)", i - 1 );
                        try {
                            yamlConfiguration_WB2_Item.save(WB2ItemYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        WonderBagItem_2.WB2ItemCreate();
                        GUI_Item2.openConfigItem2(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set WonderBag Item_amount -1");
                        }
                    }
                }


                if (Main.minecraft1_13){
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Settings") && e.getCurrentItem().getType() == Material.JUKEBOX) {
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        // player.closeInventory();
                        GUI_Settings.openSettings(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4open Settings");
                        }
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Settings") && e.getCurrentItem().getType() == Material.valueOf("LOOM")) {
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        // player.closeInventory();
                        GUI_Settings.openSettings(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4open Settings");
                        }
                    }
                }
                if (e.getCurrentItem().getType() == Material.GRAY_WOOL || e.getCurrentItem().getType() == Material.BLACK_STAINED_GLASS_PANE) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 3, 1);
                }
            }
        }
    }
}


