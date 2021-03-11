// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.listeners;

import de.jatitv.wonderbagshop.config.*;
import de.jatitv.wonderbagshop.defultValue.*;
import de.jatitv.wonderbagshop.settingsGUI.*;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class GUI_Chat_Listener implements Listener {

    public static HashMap<Player, String> EditChat = new HashMap<>();

    File configYML = new File(Main.thisp().getDataFolder().getPath(), "Config.yml");
    YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);

    File WB1ChestYML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Chest/" + "small.yml");
    YamlConfiguration yamlConfiguration_WB1_Chest = YamlConfiguration.loadConfiguration(WB1ChestYML);

    File WB2ChestYML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Chest/" + "medium.yml");
    YamlConfiguration yamlConfiguration_WB2_Chest = YamlConfiguration.loadConfiguration(WB2ChestYML);

    File WB3ChestYML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Chest/" + "large.yml");
    YamlConfiguration yamlConfiguration_WB3_Chest = YamlConfiguration.loadConfiguration(WB3ChestYML);

    File WB1ItemYML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Item/" + "small.yml");
    YamlConfiguration yamlConfiguration_WB1_Item = YamlConfiguration.loadConfiguration(WB1ItemYML);

    File WB2ItemYML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Item/" + "medium.yml");
    YamlConfiguration yamlConfiguration_WB2_Item = YamlConfiguration.loadConfiguration(WB2ItemYML);

    File WB3ItemYML = new File(Bukkit.getServer().getPluginManager().getPlugin("WonderBagShop").getDataFolder() + "/WonderBags/Item/" + "large.yml");
    YamlConfiguration yamlConfiguration_WB3_Item = YamlConfiguration.loadConfiguration(WB3ItemYML);

    @EventHandler
    public void onChat(AsyncPlayerChatEvent playerChatEvent) {
        Player player = playerChatEvent.getPlayer();
        if (EditChat.containsKey(player)) {
            if (playerChatEvent.getMessage().equals("cancel")) {
                player.sendMessage(DefultValue.SettingsGUIchatIsCanceled.replace("[setting]", EditChat.get(player)));
                switch (EditChat.get(player)) {
                    case "GUI_Name":
                    case "Currency":
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                GUI_Config.openConfig(player);
                            }
                        }.runTaskLater(Main.getPlugin(), 30L);
                        break;
                    //Chest 1
                    case "Shop Name Chest1":
                    case "WonderBag DisplayName Chest1":
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                GUI_Chest1.openConfigChest1(player);
                            }
                        }.runTaskLater(Main.getPlugin(), 30L);
                        break;
                    //Chest 2
                    case "Shop Name Chest2":
                    case "WonderBag DisplayName Chest2":
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                GUI_Chest2.openConfigChest2(player);
                            }
                        }.runTaskLater(Main.getPlugin(), 30L);
                        break;
                    //Chest 3
                    case "Shop Name Chest3":
                    case "WonderBag DisplayName Chest3":
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                GUI_Chest3.openConfigChest3(player);
                            }
                        }.runTaskLater(Main.getPlugin(), 30L);
                        break;
                    //Item 1
                    case "Shop Name Item1":
                    case "WonderBag DisplayName Item1":
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                GUI_Item1.openConfigItem1(player);
                            }
                        }.runTaskLater(Main.getPlugin(), 30L);
                        break;
                    //Item 2
                    case "Shop Name Item2":
                    case "WonderBag DisplayName Item2":
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                GUI_Item2.openConfigItem2(player);
                            }
                        }.runTaskLater(Main.getPlugin(), 30L);
                        break;
                    //Item 3
                    case "Shop Name Item3":
                    case "WonderBag DisplayName Item3":
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                GUI_Item3.openConfigItem3(player);
                            }
                        }.runTaskLater(Main.getPlugin(), 30L);
                        break;
                }
                playerChatEvent.setCancelled(true);
                EditChat.remove(player);
                return;
            }
            switch (EditChat.get(player)) {
                case "GUI_Name":
                    yamlConfiguration_config.set("Shop.GUI_Name", playerChatEvent.getMessage());
                    playerChatEvent.setCancelled(true);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    try {
                        Config.configCreate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    EditChat.remove(player);
                    player.sendMessage(DefultValue.SettingsGUIchatSetTo.replace("[setting]", "GUI_Name") + DefultValue.GUI_Name);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);

                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            GUI_Config.openConfig(player);
                        }
                    }.runTaskLater(Main.getPlugin(), 30L);
                    break;
                case "Currency":
                    yamlConfiguration_config.set("Shop.Currency", playerChatEvent.getMessage());
                    playerChatEvent.setCancelled(true);
                    try {
                        yamlConfiguration_config.save(configYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    try {
                        Config.configCreate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    EditChat.remove(player);
                    player.sendMessage(DefultValue.SettingsGUIchatSetTo.replace("[setting]", "Currency") + DefultValue.Currency);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            GUI_Config.openConfig(player);
                        }
                    }.runTaskLater(Main.getPlugin(), 30L);
                    break;

                //Chest 1
                case "Shop Name Chest1":
                    yamlConfiguration_WB1_Chest.set("Shop.Name", playerChatEvent.getMessage());
                    playerChatEvent.setCancelled(true);
                    try {
                        yamlConfiguration_WB1_Chest.save(WB1ChestYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    try {
                        WonderBagChest_1.WB1ChestCreate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    EditChat.remove(player);
                    player.sendMessage(DefultValue.SettingsGUIchatSetTo.replace("[setting]", "Shop Name Chest small") + DefultValueChest_1.Name);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            GUI_Chest1.openConfigChest1(player);
                        }
                    }.runTaskLater(Main.getPlugin(), 30L);
                    break;

                case "WonderBag DisplayName Chest1":
                    yamlConfiguration_WB1_Chest.set("WonderBag.DisplayName", playerChatEvent.getMessage());
                    playerChatEvent.setCancelled(true);
                    try {
                        yamlConfiguration_WB1_Chest.save(WB1ChestYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    try {
                        WonderBagChest_1.WB1ChestCreate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    EditChat.remove(player);
                    player.sendMessage(DefultValue.SettingsGUIchatSetTo.replace("[setting]", "WonderBag DisplayName Chest small") + DefultValueChest_1.DisplayName);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            GUI_Chest1.openConfigChest1(player);
                        }
                    }.runTaskLater(Main.getPlugin(), 30L);
                    break;

                //Chest 2
                case "Shop Name Chest2":
                    yamlConfiguration_WB2_Chest.set("Shop.Name", playerChatEvent.getMessage());
                    playerChatEvent.setCancelled(true);
                    try {
                        yamlConfiguration_WB2_Chest.save(WB2ChestYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    try {
                        WonderBagChest_2.WB2ChestCreate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    EditChat.remove(player);
                    player.sendMessage(DefultValue.SettingsGUIchatSetTo.replace("[setting]", "Shop Name Chest medium") + DefultValueChest_2.Name);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            GUI_Chest2.openConfigChest2(player);
                        }
                    }.runTaskLater(Main.getPlugin(), 30L);
                    break;

                case "WonderBag DisplayName Chest2":
                    yamlConfiguration_WB2_Chest.set("WonderBag.DisplayName", playerChatEvent.getMessage());
                    playerChatEvent.setCancelled(true);
                    try {
                        yamlConfiguration_WB2_Chest.save(WB2ChestYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    try {
                        WonderBagChest_2.WB2ChestCreate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    EditChat.remove(player);
                    player.sendMessage(DefultValue.SettingsGUIchatSetTo.replace("[setting]", "WonderBag DisplayName Chest medium") + DefultValueChest_2.DisplayName);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            GUI_Chest2.openConfigChest2(player);
                        }
                    }.runTaskLater(Main.getPlugin(), 30L);
                    break;

                //Chest 3
                case "Shop Name Chest3":
                    yamlConfiguration_WB3_Chest.set("Shop.Name", playerChatEvent.getMessage());
                    playerChatEvent.setCancelled(true);
                    try {
                        yamlConfiguration_WB3_Chest.save(WB3ChestYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    try {
                        WonderBagChest_3.WB3ChestCreate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    EditChat.remove(player);
                    player.sendMessage(DefultValue.SettingsGUIchatSetTo.replace("[setting]", "Shop Name Chest large") + DefultValueChest_3.Name);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            GUI_Chest3.openConfigChest3(player);
                        }
                    }.runTaskLater(Main.getPlugin(), 30L);
                    break;

                case "WonderBag DisplayName Chest3":
                    yamlConfiguration_WB3_Chest.set("WonderBag.DisplayName", playerChatEvent.getMessage());
                    playerChatEvent.setCancelled(true);
                    try {
                        yamlConfiguration_WB3_Chest.save(WB3ChestYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    try {
                        WonderBagChest_3.WB3ChestCreate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    EditChat.remove(player);
                    player.sendMessage(DefultValue.SettingsGUIchatSetTo.replace("[setting]", "WonderBag DisplayName Chest large") + DefultValueChest_3.DisplayName);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            GUI_Chest3.openConfigChest3(player);
                        }
                    }.runTaskLater(Main.getPlugin(), 30L);
                    break;


                //Item 1
                case "Shop Name Item1":
                    yamlConfiguration_WB1_Item.set("Shop.Name", playerChatEvent.getMessage());
                    playerChatEvent.setCancelled(true);
                    try {
                        yamlConfiguration_WB1_Item.save(WB1ItemYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    try {
                        WonderBagItem_1.WB1ItemCreate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    EditChat.remove(player);
                    player.sendMessage(DefultValue.SettingsGUIchatSetTo.replace("[setting]", "Shop Name Item small") + DefultValueItem_1.Name);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            GUI_Item1.openConfigItem1(player);
                        }
                    }.runTaskLater(Main.getPlugin(), 30L);
                    break;

                case "WonderBag DisplayName Item1":
                    yamlConfiguration_WB1_Item.set("WonderBag.DisplayName", playerChatEvent.getMessage());
                    playerChatEvent.setCancelled(true);
                    try {
                        yamlConfiguration_WB1_Item.save(WB1ItemYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    try {
                        WonderBagItem_1.WB1ItemCreate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    EditChat.remove(player);
                    player.sendMessage(DefultValue.SettingsGUIchatSetTo.replace("[setting]", "WonderBag DisplayName Item small") + DefultValueItem_1.DisplayName);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            GUI_Item1.openConfigItem1(player);
                        }
                    }.runTaskLater(Main.getPlugin(), 30L);
                    break;

                //Item 2
                case "Shop Name Item2":
                    yamlConfiguration_WB2_Item.set("Shop.Name", playerChatEvent.getMessage());
                    playerChatEvent.setCancelled(true);
                    try {
                        yamlConfiguration_WB2_Item.save(WB2ItemYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    try {
                        WonderBagItem_2.WB2ItemCreate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    EditChat.remove(player);
                    player.sendMessage(DefultValue.SettingsGUIchatSetTo.replace("[setting]", "Shop Name Item medium") + DefultValueItem_2.Name);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            GUI_Item2.openConfigItem2(player);
                        }
                    }.runTaskLater(Main.getPlugin(), 30L);
                    break;

                case "WonderBag DisplayName Item2":
                    yamlConfiguration_WB2_Item.set("WonderBag.DisplayName", playerChatEvent.getMessage());
                    playerChatEvent.setCancelled(true);
                    try {
                        yamlConfiguration_WB2_Item.save(WB2ItemYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    try {
                        WonderBagItem_2.WB2ItemCreate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    EditChat.remove(player);
                    player.sendMessage(DefultValue.SettingsGUIchatSetTo.replace("[setting]", "WonderBag DisplayName Item medium") + DefultValueItem_2.DisplayName);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            GUI_Item2.openConfigItem2(player);
                        }
                    }.runTaskLater(Main.getPlugin(), 30L);
                    break;

                //Item 3
                case "Shop Name Item3":
                    yamlConfiguration_WB3_Item.set("Shop.Name", playerChatEvent.getMessage());
                    playerChatEvent.setCancelled(true);
                    try {
                        yamlConfiguration_WB3_Item.save(WB3ItemYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    try {
                        WonderBagItem_3.WB3ItemCreate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    EditChat.remove(player);
                    player.sendMessage(DefultValue.SettingsGUIchatSetTo.replace("[setting]", "Shop Name Item large") + DefultValueItem_3.Name);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            GUI_Item3.openConfigItem3(player);
                        }
                    }.runTaskLater(Main.getPlugin(), 30L);
                    break;

                case "WonderBag DisplayName Item3":
                    yamlConfiguration_WB3_Item.set("WonderBag.DisplayName", playerChatEvent.getMessage());
                    playerChatEvent.setCancelled(true);
                    try {
                        yamlConfiguration_WB3_Item.save(WB3ItemYML);
                    } catch (IOException tac) {
                        tac.printStackTrace();
                    }
                    try {
                        WonderBagItem_3.WB3ItemCreate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    EditChat.remove(player);
                    player.sendMessage(DefultValue.SettingsGUIchatSetTo.replace("[setting]", "WonderBag DisplayName Item large") + DefultValueItem_3.DisplayName);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            GUI_Item3.openConfigItem3(player);
                        }
                    }.runTaskLater(Main.getPlugin(), 30L);
                    break;
            }
        }
    }
}
