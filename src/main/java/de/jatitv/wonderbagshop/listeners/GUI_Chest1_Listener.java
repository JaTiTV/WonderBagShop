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

import de.jatitv.wonderbagshop.config.WonderBagChest_1;
import de.jatitv.wonderbagshop.defultValue.DefultValue;
import de.jatitv.wonderbagshop.settingsGUI.*;
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


public class GUI_Chest1_Listener implements Listener {

    public GUI_Chest1_Listener() {
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) throws InterruptedException {


        if (!(e.getWhoClicked() instanceof Player)) return;
        Player player = (Player) e.getWhoClicked();
        if (e.getInventory() != null && e.getCurrentItem() != null) {

            if (e.getWhoClicked().getOpenInventory().getTitle().equals("§2W§6B§9S §7| §4Settings §7| §2W§6B§7§9Chest: §9small")) {
                File WB1ChestYML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Chest/" + "small.yml");
                YamlConfiguration yamlConfiguration_WB1_Chest = YamlConfiguration.loadConfiguration(WB1ChestYML);
                e.setCancelled(true);

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Shop Name") && e.getCurrentItem().getType() == Material.YELLOW_WOOL) {
                    GUI_Chat_Listener.EditChat.put(player,"Shop Name Chest1");
                    player.sendMessage(DefultValue.SettingsGUIchatSet.replace("[setting]", "Shop Name Chest small"));
                    player.sendMessage(DefultValue.SettingsGUIchatCancel);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    if (DefultValue.Debug && DefultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4Shop Name Chest small");
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Shop Price") && e.getCurrentItem().getType() == Material.BLUE_WOOL) {
                    int i = yamlConfiguration_WB1_Chest.getInt("Shop.price");
                    if (e.isRightClick()){
                        yamlConfiguration_WB1_Chest.set("Shop.price", i + 1);
                        try {
                            yamlConfiguration_WB1_Chest.save(WB1ChestYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        WonderBagChest_1.WB1ChestCreate();
                        GUI_Chest1.openConfigChest1(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Shop Price +1");
                        }
                    }
                    if (e.isLeftClick()){
                        yamlConfiguration_WB1_Chest.set("Shop.price", i - 1 );
                        try {
                            yamlConfiguration_WB1_Chest.save(WB1ChestYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        WonderBagChest_1.WB1ChestCreate();
                        GUI_Chest1.openConfigChest1(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Shop Price -1");
                        }
                    }
                    if (e.isShiftClick() && e.isRightClick()){
                        yamlConfiguration_WB1_Chest.set("Shop.price", i + 10);
                        try {
                            yamlConfiguration_WB1_Chest.save(WB1ChestYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        WonderBagChest_1.WB1ChestCreate();
                        GUI_Chest1.openConfigChest1(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Shop Price +10");
                        }
                    }
                    if (e.isShiftClick() && e.isLeftClick()){
                        yamlConfiguration_WB1_Chest.set("Shop.price", i - 10 );
                        try {
                            yamlConfiguration_WB1_Chest.save(WB1ChestYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        WonderBagChest_1.WB1ChestCreate();
                        GUI_Chest1.openConfigChest1(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Shop Price -10");
                        }
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6WonderBag DisplayName") && e.getCurrentItem().getType() == Material.YELLOW_WOOL) {
                    GUI_Chat_Listener.EditChat.put(player,"WonderBag DisplayName Chest1");
                    player.sendMessage(DefultValue.SettingsGUIchatSet.replace("[setting]", "WonderBag DisplayName Chest small"));
                    player.sendMessage(DefultValue.SettingsGUIchatCancel);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    if (DefultValue.Debug && DefultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4WonderBag DisplayName Chest small");
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6WonderBag Item_amount") && e.getCurrentItem().getType() == Material.BLUE_WOOL) {
                    int i = yamlConfiguration_WB1_Chest.getInt("WonderBag.Item_amount_(1-9)");
                    if (e.isRightClick()){
                        yamlConfiguration_WB1_Chest.set("WonderBag.Item_amount_(1-9)", i + 1);
                        try {
                            yamlConfiguration_WB1_Chest.save(WB1ChestYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        WonderBagChest_1.WB1ChestCreate();
                        GUI_Chest1.openConfigChest1(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set WonderBag Item_amount +1");
                        }
                    }
                    if (e.isLeftClick()){
                        yamlConfiguration_WB1_Chest.set("WonderBag.Item_amount_(1-9)", i - 1 );
                        try {
                            yamlConfiguration_WB1_Chest.save(WB1ChestYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        WonderBagChest_1.WB1ChestCreate();
                        GUI_Chest1.openConfigChest1(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set WonderBag Item_amount -1");
                        }
                    }
                }


                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Settings") && e.getCurrentItem().getType() == Material.LOOM) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    GUI_Settings.openSettings(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4open Settings");
                    }
                }
                if (e.getCurrentItem().getType() == Material.GRAY_WOOL || e.getCurrentItem().getType() == Material.BLACK_STAINED_GLASS_PANE) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 3, 1);
                }
            }
        }
    }
}


