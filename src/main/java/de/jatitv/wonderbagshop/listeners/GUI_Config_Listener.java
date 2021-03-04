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

import de.jatitv.wonderbagshop.config.Config;
import de.jatitv.wonderbagshop.defultValue.DefultValue;
import de.jatitv.wonderbagshop.settingsGUI.*;
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


public class GUI_Config_Listener implements Listener {

    public GUI_Config_Listener() {
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) throws InterruptedException {


        if (!(e.getWhoClicked() instanceof Player)) return;
        Player player = (Player) e.getWhoClicked();
        if (e.getInventory() != null && e.getCurrentItem() != null) {

            if (e.getWhoClicked().getOpenInventory().getTitle().equals("§2W§6B§9S §7| §4Settings §7| §9Config")) {
                File configYML = new File(Main.thisp().getDataFolder().getPath(), "Config.yml");
                YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);
                e.setCancelled(true);

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Update Check On Join") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Plugin.UpdateCheckOnJoin", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    Config.configCreate();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set UpdateCheckOnJoin to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Update Check On Join") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Plugin.UpdateCheckOnJoin", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_Config.openConfig(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set UpdateCheckOnJoin to §6true");
                        }
                    }
                }


                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Debug") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Plugin.Debug.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    Config.configCreate();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Debug to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Debug") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Plugin.Debug.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_Config.openConfig(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Debug to §6true");
                        }
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Debug Stage")) {
                    int i = yamlConfiguration_config.getInt("Plugin.Debug.DebugStage_(1-3)");
                    if (e.isRightClick()){
                        yamlConfiguration_config.set("Plugin.Debug.DebugStage_(1-3)", i + 1);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_Config.openConfig(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set DebugStage +1");
                        }
                    }
                    if (e.isLeftClick()){
                        yamlConfiguration_config.set("Plugin.Debug.DebugStage_(1-3)", i - 1 );
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_Config.openConfig(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set DebugStage +1");
                        }
                    }
                }


                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Item Numbers") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Shop.ItemNumbers", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    Config.configCreate();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Item Numbers to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Item Numbers") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Shop.ItemNumbers", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_Config.openConfig(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Item Numbers to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Use Chest") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("WonderBags.UseChest", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    Config.configCreate();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Use Chest to §6false");
                    }

                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Use Chest") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("WonderBags.UseChest", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_Config.openConfig(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Use Chest to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Use Chest and Item") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("WonderBags.UseChest_and_Item", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    Config.configCreate();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Use Chest and Item to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Use Chest and Item") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("WonderBags.UseChest_and_Item", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_Config.openConfig(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Use Chest and Item to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Chest Drop") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("WonderBags.ChestDrop", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    Config.configCreate();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Chest Drop to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Chest Drop") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("WonderBags.ChestDrop", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_Config.openConfig(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Chest Drop to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Remove Chest in creative mode") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("WonderBags.RemoveChestInCreativemode", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    Config.configCreate();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Remove Chest in creative mode to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Remove Chest in creative mode") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("WonderBags.RemoveChestInCreativemode", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_Config.openConfig(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Remove Chest in creative mode to §6true");
                        }
                    }
                }





                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Sound Buy") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Sound.Buy.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    Config.configCreate();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Sound Buy to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Sound Buy") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Sound.Buy.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_Config.openConfig(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Sound Buy to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Sound No Money") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Sound.NoMoney.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    Config.configCreate();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Sound No Money to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Sound No Money") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Sound.NoMoney.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_Config.openConfig(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Sound No Money to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Sound No Inventory Space") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Sound.NoInventorySpace.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    Config.configCreate();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Sound No Inventory Space to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Sound No Inventory Space") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Sound.NoInventorySpace.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_Config.openConfig(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Sound No Inventory Space to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Sound Give") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Sound.Give.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    Config.configCreate();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Sound Give to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Sound Give") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Sound.Give.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_Config.openConfig(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Sound Give to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Sound Gift") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Sound.Gift.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    Config.configCreate();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Sound Gift to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Sound Gift") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Sound.Gift.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_Config.openConfig(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Sound Gift to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Sound Player Not Found") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Sound.PlayerNotFound.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    Config.configCreate();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Sound Player Not Found to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Sound Player Not Found") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Sound.PlayerNotFound.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_Config.openConfig(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Sound Player Not Found to §6true");
                        }
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6GUI_Name") && e.getCurrentItem().getType() == Material.YELLOW_WOOL) {
                    GUI_Chat_Listener.EditChat.put(player,"GUI_Name");
                    player.sendMessage(DefultValue.SettingsGUIchatSet.replace("[setting]", "GUI_Name"));
                    player.sendMessage(DefultValue.SettingsGUIchatCancel);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    if (DefultValue.Debug && DefultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4click GUI_Name");
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Currency") && e.getCurrentItem().getType() == Material.YELLOW_WOOL) {
                    GUI_Chat_Listener.EditChat.put(player,"Currency");
                    player.sendMessage(DefultValue.SettingsGUIchatSet.replace("[setting]", "Currency"));
                    player.sendMessage(DefultValue.SettingsGUIchatCancel);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    if (DefultValue.Debug && DefultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4click Currency");
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Sound Config") && e.getCurrentItem().getType() == Material.ORANGE_WOOL) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    GUI_ConfigSound.openSound(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4open Sound Config");
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Config") && e.getCurrentItem().getType() == Material.ORANGE_WOOL) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    GUI_ConfigTitle.openTitel(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4open Title Config");
                    }
                }


                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Defult Config") && e.getCurrentItem().getType() == Material.ENCHANTING_TABLE) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_FLUTE, 3, 1);
                    player.closeInventory();
                    GUI_Config.resetConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4open Defult Config");
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Settings") && e.getCurrentItem().getType() == Material.LOOM) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    GUI_Settings.openSettings(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4open Settings");
                    }
                }
                if (e.getCurrentItem().getType() == Material.GRAY_WOOL || e.getCurrentItem().getType() == Material.BLACK_STAINED_GLASS_PANE) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 3, 1);
                }
            }
            if (e.getWhoClicked().getOpenInventory().getTitle().equals("§2W§6B§9S §7| §4RESET §7| §9Config")) {
                e.setCancelled(true);

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§2Yes §4Reset the Config") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_FLUTE, 3, 1);
                    ConfigDEFULT.configDEFULTCreate();
                    Config.configCreate();
                    player.closeInventory();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4RESET THE CONFIG");
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§cNO §4Do not reset Config") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4back to Config from reset");
                    }
                }

                if (e.getCurrentItem().getType() == Material.GRAY_WOOL || e.getCurrentItem().getType() == Material.BLACK_STAINED_GLASS_PANE) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 3, 1);
                }
            }
        }
    }
}


