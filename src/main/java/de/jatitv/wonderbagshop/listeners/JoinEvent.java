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

import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import de.jatitv.wonderbagshop.system.Main;
import de.jatitv.wonderbagshop.system.TextBuilder;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoinEvent(PlayerLoginEvent event) {
        Player player = event.getPlayer();
        String foundVersion = Main.plugin.getDescription().getVersion();
        if (player.hasPermission("wonderbagshop.admin") || player.isOp()) {
            if (!foundVersion.equals(Main.update_version)) {
                if (DefaultValue.UpdateCheckOnJoin) {
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.sendMessage("§4============ §8[§2Wonder§6Bag§9Shop§8] §4============");
                            player.sendMessage("§6A new version was found!");
                            TextComponent comp = new TextBuilder("§6Your version: §c" + foundVersion + " §7- §6Current version: §a" + Main.update_version)
                                    .addHover("§6You can download it here: §e" + Main.Spigot).addClickEvent(ClickEvent.Action.OPEN_URL, Main.Spigot).build();
                            player.spigot().sendMessage(comp);
                            TextComponent comp2 = new TextBuilder("§6You can find more information on Discord.")
                                    .addHover("§e" + Main.Discord).addClickEvent(ClickEvent.Action.OPEN_URL, Main.Discord).build();
                            player.spigot().sendMessage(comp2);
                            player.sendMessage("§4============ §8[§2Wonder§6Bag§9Shop§8] §4============");
                        }
                    }.runTaskLater(Main.plugin, 200L);
                }
            }
        }
    }
}