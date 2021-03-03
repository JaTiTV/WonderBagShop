// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.listeners;

import de.jatitv.wonderbagshop.config.Config;
import de.jatitv.wonderbagshop.defultValue.DefultValue;
import de.jatitv.wonderbagshop.settingsGUI.GUI_Config;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Sound;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class GUI_Chat_Listener implements Listener {

    public static HashMap<Player, String> EditChat = new HashMap<>();

    File configYML = new File(Main.thisp().getDataFolder().getPath(), "Config.yml");
    YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);

    @EventHandler
    public void onChat(PlayerChatEvent playerChatEvent) {
        Player player = playerChatEvent.getPlayer();
        if (EditChat.containsKey(player)) {
            if (playerChatEvent.getMessage().equals("cancel")) {
                player.sendMessage(DefultValue.SettingsGUIchatIsCanceled.replace("[setting]", EditChat.get(player)));
                playerChatEvent.setCancelled(true);
                EditChat.remove(player);
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        GUI_Config.openConfig(player);
                    }
                }.runTaskLater(Main.getPlugin(), 30L);
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
                    player.sendMessage(DefultValue.SettingsGUIchatSetTo.replace("[setting]", "Currency") + DefultValue.Currency);
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_HAT, 3, 1);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            GUI_Config.openConfig(player);
                        }
                    }.runTaskLater(Main.getPlugin(), 30L);
                    break;
            }
        }
    }
}
