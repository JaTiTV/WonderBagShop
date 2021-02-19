// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.Listeners;

import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import de.jatitv.wonderbagshop.main.Main;
import de.jatitv.wonderbagshop.main.UpdateChecker;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoinEvent(JoinEvent){
        Player player = (Player) player.getPlayer();
        if(player.hasPermission("wonderbagshop.admin")) {
            if(Main.update_version != null) {
                String currentVersion = this.getDescription().getVersion();
                String foundVersion = ("§6A new version of §8[§2W§6B§9S§8]§6 was found!");
                String yourVersion = ("§6Your version §c" + currentVersion + "§b.");
                String latestVersion = ("§6Current version: §a" + version);
                String downloadVersion = ("§6You can download it here: §ehttps://www.spigotmc.org/resources/wonderbagshop.89234/");
                player.sendMessage(DefultValue.PrefixHC + foundVersion);
                player.sendMessage(DefultValue.PrefixHC + latestVersion);
                player.sendMessage(DefultValue.PrefixHC + yourVersion);
                player.sendMessage(DefultValue.PrefixHC + downloadVersion);
            }
        }
    }

    private UpdateChecker getDescription() {
    }

}
