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

package de.jatitv.wonderbagshop.main;

import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import de.jatitv.wonderbagshop.Listeners.*;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import org.bukkit.plugin.java.JavaPlugin;


import java.util.Iterator;
import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    public static Main plugin;
    public static Plugin a;
    public static Economy eco = null;
    public static String update_version = null;

    @Override
    public void onEnable() {
        // Plugin startup logic
        Logger logger = this.getLogger();

        plugin = this;
        getCommand("wonderbagshop").setExecutor(new CmdExecuter());
        getCommand("wbs").setExecutor(new CmdExecuter());
        getCommand("wonderbagshop").setTabCompleter(new TabComplete());
        getCommand("wbs").setTabCompleter(new TabComplete());
        getCommand("wbsrl").setExecutor(new CmdExecuter_wbsrl());

        a = this;
        Bukkit.getServer().getPluginManager().registerEvents(new ShopEvent(), this);

        Bukkit.getServer().getPluginManager().registerEvents(new PlaceChestWB1(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlaceChestWB2(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlaceChestWB3(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new JoinEvent(), this);

        Load.LoadSend(getDescription().getVersion());


        int pluginId = 10342; // <-- Replace with the id of your plugin!
        Metrics metrics = new Metrics(this, pluginId);

        // Optional: Add custom charts
        // metrics.addCustomChart(new Metrics.SimplePie("chart_id", () -> "My value"));


        (new UpdateChecker(this, 89234)).getVersion((version) -> {
            String currentVersion = this.getDescription().getVersion();
            if (!currentVersion.equalsIgnoreCase(version)) {
                update_version = version;
                String foundVersion = ("§6A new version of §8[§2Wonder§6Bag§9Shop§8]§6 was found!");
                String yourVersion = ("§6Your version §c" + currentVersion);
                String latestVersion = ("§6Current version: §a" + version);
                String downloadVersion = ("§6You can download it here: §ehttps://www.spigotmc.org/resources/wonderbagshop.89234/");
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + foundVersion);
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + latestVersion);
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + yourVersion);
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + downloadVersion);
                Iterator var7 = Bukkit.getOnlinePlayers().iterator();

                while(var7.hasNext()) {
                    Player player = (Player)var7.next();
                    if (player.hasPermission("wonderbagshop.admin")) {
                        player.sendMessage(DefultValue.PrefixHC + foundVersion);
                        player.sendMessage(DefultValue.PrefixHC + latestVersion);
                        player.sendMessage(DefultValue.PrefixHC + yourVersion);
                        player.sendMessage(DefultValue.PrefixHC + downloadVersion);
                    }
                }
            }
        });
    }
    public static Plugin thisp() {
        return plugin;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Disable.disableSend(getDescription().getVersion());
    }

    public static Main getPlugin() {return plugin;}
}