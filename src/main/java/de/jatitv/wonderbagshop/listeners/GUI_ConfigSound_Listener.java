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
import de.jatitv.wonderbagshop.settingsGUI.GUI_Config;
import de.jatitv.wonderbagshop.settingsGUI.GUI_ConfigSound;
import de.jatitv.wonderbagshop.settingsGUI.GUI_Settings;
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


public class GUI_ConfigSound_Listener implements Listener {

    public GUI_ConfigSound_Listener() {
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) throws InterruptedException {


        if (!(e.getWhoClicked() instanceof Player)) return;
        Player player = (Player) e.getWhoClicked();
        if (e.getInventory() != null && e.getCurrentItem() != null) {

            if (e.getWhoClicked().getOpenInventory().getTitle().equals("§2W§6B§9S §7| §4Settings §7| §9Config §7| §aSound")) {
                File configYML = new File(Main.thisp().getDataFolder().getPath(), "Config.yml");
                YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);
                e.setCancelled(true);


                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Sound") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Sound.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    Config.configCreate();
                    GUI_ConfigSound.openSound(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1){
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Sound to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Sound") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Sound.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        player.closeInventory();
                        Config.configCreate();
                        GUI_ConfigSound.openSound(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Sound to §6true");
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
                    GUI_ConfigSound.openSound(player);
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
                        GUI_ConfigSound.openSound(player);
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
                    GUI_ConfigSound.openSound(player);
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
                        GUI_ConfigSound.openSound(player);
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
                    GUI_ConfigSound.openSound(player);
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
                        GUI_ConfigSound.openSound(player);
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
                    GUI_ConfigSound.openSound(player);
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
                        GUI_ConfigSound.openSound(player);
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
                    GUI_ConfigSound.openSound(player);
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
                        GUI_ConfigSound.openSound(player);
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
                    GUI_ConfigSound.openSound(player);
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
                        GUI_ConfigSound.openSound(player);
                        if (DefultValue.Debug && DefultValue.DebugStage > 1){
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Sound Player Not Found to §6true");
                        }
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Back to Config") && e.getCurrentItem().getType() == Material.CRAFTING_TABLE) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    player.closeInventory();
                    GUI_Config.openConfig(player);
                    if (DefultValue.Debug && DefultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4Back to Config");
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
        }
    }
}


