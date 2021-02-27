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
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent event){
        Player player =  event.getPlayer();
        if(player.hasPermission("wonderbagshop.admin") || player.isOp()) {
            if(Main.update_version != null) {
                String foundVersion = Main.getPlugin().getDescription().getVersion();
                String updateFound = (DefultValue.PrefixHC + "§6A new version of §8[§2Wonder§6Bag§9Shop§8]§6 was found!");
                String yourVersion = (DefultValue.PrefixHC + "§6Your version §c" + foundVersion);
                String currentVersion = (DefultValue.PrefixHC + "§6Current version: §a" + Main.update_version);
                String downloadVersion = (DefultValue.PrefixHC + "§6You can download it here: §ehttps://www.spigotmc.org/resources/wonderbagshop.89234/");
                String discord = (DefultValue.PrefixHC + "§6You can find more information about §8[§2Wonder§6Bag§9Shop§8]§6 on Discord: §ehttps://discord.com/invite/vRyXFFterJ");
                String Snapshot = (DefultValue.PrefixHC + "§4Please note!" +
                        "\n" + DefultValue.PrefixHC + "§cYou are using the §6" + foundVersion + " §cof WonderBagShop!" +
                        "\n" + DefultValue.PrefixHC + "§cThere may be errors and it is possible that not all functions work as they should!" +
                        "\n" + DefultValue.PrefixHC + "§2If there are any bugs, please report them to me via Discord so I can fix them." +
                        "\n" + DefultValue.PrefixHC + "§7https://discord.com/invite/vRyXFFterJ");
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        player.sendMessage(updateFound);
                        player.sendMessage(yourVersion);
                        player.sendMessage(currentVersion);
                        player.sendMessage(downloadVersion);
                        player.sendMessage(discord);
                    }
                }.runTaskLater(Main.getPlugin(), 80L);

                if(Main.Snapshot){
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.sendMessage("\n \n \n \n \n \n" + Snapshot);
                        }
                    }.runTaskLater(Main.getPlugin(), 120L);
                }


            }
        }
    }
}