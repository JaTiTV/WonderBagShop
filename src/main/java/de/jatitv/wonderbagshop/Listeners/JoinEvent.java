// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.Listeners;

import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import de.jatitv.wonderbagshop.main.Main;
import de.jatitv.wonderbagshop.main.UpdateChecker;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent event){
        Player player =  event.getPlayer();
        if(player.hasPermission("wonderbagshop.admin") || player.isOp()) {
            (new UpdateChecker(Main.getPlugin(), 89234)).getVersion((version) -> {
                if(Main.update_version != null) {
                    String currentVersion = Main.getPlugin().getDescription().getVersion();
                    String foundVersion = ("§6A new version of §8[§2Wonder§6Bag§9Shop§8]§6 was found!");
                    String yourVersion = ("§6Your version §c" + currentVersion);
                    String latestVersion = ("§6Current version: §a" + version);
                    String downloadVersion = ("§6You can download it here: §ehttps://www.spigotmc.org/resources/wonderbagshop.89234/");
                    player.sendMessage(DefultValue.PrefixHC + foundVersion);
                    player.sendMessage(DefultValue.PrefixHC + latestVersion);
                    player.sendMessage(DefultValue.PrefixHC + yourVersion);
                    player.sendMessage(DefultValue.PrefixHC + downloadVersion);
                }
            });
        }
    }
}