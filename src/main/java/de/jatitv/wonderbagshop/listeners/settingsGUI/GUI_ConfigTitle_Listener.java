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

import de.jatitv.wonderbagshop.config.Config;
import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import de.jatitv.wonderbagshop.gui.settingsGUI.GUI_Config;
import de.jatitv.wonderbagshop.gui.settingsGUI.GUI_ConfigTitle;
import de.jatitv.wonderbagshop.gui.settingsGUI.GUI_Settings;
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


public class GUI_ConfigTitle_Listener implements Listener {

    public GUI_ConfigTitle_Listener() {
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) throws InterruptedException {

        Player player = (Player) e.getWhoClicked();
        if (e.getInventory() != null && e.getCurrentItem() != null) {

            if (e.getWhoClicked().getOpenInventory().getTitle().equals("§2W§6B§9S §7| §4Settings §7| §9Config §7| §aTitle")) {
                File configYML = new File(Main.thisp().getDataFolder().getPath(), "Config.yml");
                YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);
                e.setCancelled(true);


                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Title.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    Config.configCreate();
                    GUI_ConfigTitle.openTitel(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Title.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        // player.closeInventory();
                        Config.configCreate();
                        GUI_ConfigTitle.openTitel(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title to §6true");
                        }
                    }
                }


                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Reload") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Title.Reload.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    Config.configCreate();
                    GUI_ConfigTitle.openTitel(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Reload to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Reload") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Title.Reload.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        // player.closeInventory();
                        Config.configCreate();
                        GUI_ConfigTitle.openTitel(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Reload to §6true");
                        }
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Buy") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Title.Buy.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    Config.configCreate();
                    GUI_ConfigTitle.openTitel(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Buy to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Buy") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Title.Buy.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        // player.closeInventory();
                        Config.configCreate();
                        GUI_ConfigTitle.openTitel(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Buy to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title No money") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Title.NoMoney.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    Config.configCreate();
                    GUI_ConfigTitle.openTitel(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title No money to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title No money") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Title.NoMoney.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        // player.closeInventory();
                        Config.configCreate();
                        GUI_ConfigTitle.openTitel(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title No money to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title No Inventory Space") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Title.NoInventorySpace.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    Config.configCreate();
                    GUI_ConfigTitle.openTitel(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title No Inventory Space Space to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title No Inventory Space") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Title.NoInventorySpace.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        // player.closeInventory();
                        Config.configCreate();
                        GUI_ConfigTitle.openTitel(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title No Inventory Space to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Give") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Title.Give.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    Config.configCreate();
                    GUI_ConfigTitle.openTitel(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Give to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Give") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Title.Give.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        // player.closeInventory();
                        Config.configCreate();
                        GUI_ConfigTitle.openTitel(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Give to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Give Received") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Title.GiveReceived.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    Config.configCreate();
                    GUI_ConfigTitle.openTitel(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Give Received to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Give Received") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Title.GiveReceived.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        // player.closeInventory();
                        Config.configCreate();
                        GUI_ConfigTitle.openTitel(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Give Received to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Gift") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Title.Gift.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    Config.configCreate();
                    GUI_ConfigTitle.openTitel(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Gift to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Gift") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Title.Gift.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        // player.closeInventory();
                        Config.configCreate();
                        GUI_ConfigTitle.openTitel(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Gift to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Gift Received") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Title.GiftReceived.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    Config.configCreate();
                    GUI_ConfigTitle.openTitel(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Gift Received to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Gift Received") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Title.GiftReceived.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        // player.closeInventory();
                        Config.configCreate();
                        GUI_ConfigTitle.openTitel(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Gift Received to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Player No Inventory Space") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Title.PlayerNoInventorySpace.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    Config.configCreate();
                    GUI_ConfigTitle.openTitel(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Player No Inventory Space to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Player No Inventory Space") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Title.PlayerNoInventorySpace.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        // player.closeInventory();
                        Config.configCreate();
                        GUI_ConfigTitle.openTitel(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Player No Inventory Space to §6true");
                        }
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Player Not Found") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                    yamlConfiguration_config.set("Title.PlayerNotFound.Enable", false);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    Config.configCreate();
                    GUI_ConfigTitle.openTitel(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Player Not Found to §6false");
                    }
                } else {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Title Player Not Found") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                        yamlConfiguration_config.set("Title.PlayerNotFound.Enable", true);
                        try {
                            yamlConfiguration_config.save(configYML);
                        } catch (IOException tac) {
                            tac.printStackTrace();
                        }
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                        // player.closeInventory();
                        Config.configCreate();
                        GUI_ConfigTitle.openTitel(player);
                        if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                            Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4set Title Player Not Found to §6true");
                        }
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Back to Config") && e.getCurrentItem().getType() == Material.CRAFTING_TABLE) {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    // player.closeInventory();
                    GUI_Config.openConfig(player);
                    if (DefaultValue.Debug && DefaultValue.DebugStage > 1) {
                        Bukkit.getConsoleSender().sendMessage("§6" + player.getDisplayName() + " §4Back to Config");
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