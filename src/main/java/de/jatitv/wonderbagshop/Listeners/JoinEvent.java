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

package de.jatitv.wonderbagshop.Listeners;

import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import de.jatitv.wonderbagshop.main.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent event){
        Player player =  event.getPlayer();
        if(player.hasPermission("wonderbagshop.admin") || player.isOp()) {
            if(Main.update_version != null) {
                String currentVersion = Main.getPlugin().getDescription().getVersion();
                String foundVersion = ("§6A new version of §8[§2Wonder§6Bag§9Shop§8]§6 was found!");
                String yourVersion = ("§6Your version §c" + currentVersion);
                String latestVersion = ("§6Current version: §a" + Main.update_version);
                String downloadVersion = ("§6You can download it here: §ehttps://www.spigotmc.org/resources/wonderbagshop.89234/");
                player.sendMessage(DefultValue.PrefixHC + foundVersion);
                player.sendMessage(DefultValue.PrefixHC + latestVersion);
                player.sendMessage(DefultValue.PrefixHC + yourVersion);
                player.sendMessage(DefultValue.PrefixHC + downloadVersion);
            }
        }
    }
}