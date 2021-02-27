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

package de.jatitv.wonderbagshop.settingsGUI;

import de.jatitv.wonderbagshop.config.Config;
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

        File configYML = new File(Main.thisp().getDataFolder().getPath(), "Config.yml");
        YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);

        File WB1YML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/" + "WonderBag_1.yml");
        YamlConfiguration yamlConfiguration_WB1 = YamlConfiguration.loadConfiguration(WB1YML);

        File WB2YML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/" + "WonderBag_2.yml");
        YamlConfiguration yamlConfiguration_WB2 = YamlConfiguration.loadConfiguration(WB2YML);

        File WB3YML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/" + "WonderBag_3.yml");
        YamlConfiguration yamlConfiguration_WB3 = YamlConfiguration.loadConfiguration(WB3YML);

        if (!(e.getWhoClicked() instanceof Player)) return;
        Player player = (Player) e.getWhoClicked();
        if (e.getInventory() != null && e.getCurrentItem() != null) {

            if (e.getWhoClicked().getOpenInventory().getTitle().equals("§2W§6B§9S §7| §4Settings §7| §9Config")) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getAmount()) {
                    case 1:
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
                            }
                        }

                    case 2:
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
                            }
                        }

                    case 3:
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
                            }
                        }


                    case 4:
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
                            }
                        }

                    case 5:
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
                            }
                        }

                    case 6:
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
                            }
                        }

                    case 7:
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
                            }
                        }

                    case 8:
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
                            }
                        }

                    case 9:
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
                            }
                        }

                    case 10:
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
                            }
                        }


                    case 52:
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Defult Config") && e.getCurrentItem().getType() == Material.ENCHANTING_TABLE) {
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_FLUTE, 3, 1);
                            player.closeInventory();
                            GUI_Config.resetConfig(player);
                        }

                    case 53:
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Settings") && e.getCurrentItem().getType() == Material.CRAFTING_TABLE) {
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                            player.closeInventory();
                            GUI_Settings.openSettings(player);
                        }


                    case 500:
                        if (e.getCurrentItem().getType() == Material.GRAY_WOOL || e.getCurrentItem().getType() == Material.BLACK_STAINED_GLASS_PANE) {
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 3, 1);
                        }
                        break;
                }

            }

            if (e.getWhoClicked().getOpenInventory().getTitle().equals("§2W§6B§9S §7| §4RESET §7| §9Config")) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getAmount()) {
                    case 1:
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§2Yes §4Reset the Config") && e.getCurrentItem().getType() == Material.GREEN_WOOL) {
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_FLUTE, 3, 1);
                            ConfigDEFULT.configDEFULTCreate();
                            Config.configCreate();
                            player.closeInventory();
                            GUI_Config.openConfig(player);
                        }
                    case 2:
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§cNO §4Do not reset Config") && e.getCurrentItem().getType() == Material.RED_WOOL) {
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                            player.closeInventory();
                            GUI_Config.openConfig(player);
                        }
                    case 500:
                        if (e.getCurrentItem().getType() == Material.GRAY_WOOL || e.getCurrentItem().getType() == Material.BLACK_STAINED_GLASS_PANE) {
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 3, 1);
                        }
                        break;
                }
            }
        }
    }
}


