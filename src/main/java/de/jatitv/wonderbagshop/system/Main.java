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

package de.jatitv.wonderbagshop.system;

import de.jatitv.wonderbagshop.commands.cmdManagement.TabComplete;
import de.jatitv.wonderbagshop.defultValue.DefultValue;
import de.jatitv.wonderbagshop.listeners.*;
import de.jatitv.wonderbagshop.commands.cmdManagement.CmdExecuter;
import de.jatitv.wonderbagshop.commands.cmdManagement.CmdExecuter_wbsrl;
import de.jatitv.wonderbagshop.settingsGUI.GUI_Config_Listener;
import de.jatitv.wonderbagshop.settingsGUI.GUI_Settings_Listener;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;


import java.util.Iterator;
import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    // Debug Settings
    public static Boolean Snapshot = true;
    public static Boolean Bstats = true;

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

        Bukkit.getServer().getPluginManager().registerEvents(new JoinEvent(), this);

        Bukkit.getServer().getPluginManager().registerEvents(new ShopEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new GiftEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new GiveEvent(), this);

        Bukkit.getServer().getPluginManager().registerEvents(new UseChestWB1(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new UseChestWB2(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new UseChestWB3(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new BreakChest(), this);

        Bukkit.getServer().getPluginManager().registerEvents(new UseItemWB1(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new UseItemWB2(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new UseItemWB3(), this);

        Bukkit.getServer().getPluginManager().registerEvents(new GUI_Settings_Listener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new GUI_Config_Listener(), this);


        try {
            Load.LoadSend(getDescription().getVersion());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        if (Main.Bstats) {
            int pluginId = 10342; // <-- Replace with the id of your plugin!
            Metrics metrics = new Metrics(this, pluginId);
        } else {
            new BukkitRunnable() {
                @Override
                public void run() {
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4Bstats is disabled!");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                }
            }.runTaskLater(Main.getPlugin(), 200L);
        }


        // Optional: Add custom charts
        // metrics.addCustomChart(new Metrics.SimplePie("chart_id", () -> "My value"));


        (new UpdateChecker(this, 89234)).getVersion((version) -> {
            String foundVersion = this.getDescription().getVersion();
            if (!foundVersion.equalsIgnoreCase(version)) {
                update_version = version;
                String updateFound = (DefultValue.PrefixHC + "§6A new version of §8[§2Wonder§6Bag§9Shop§8]§6 was found!");
                String yourVersion = (DefultValue.PrefixHC + "§6Your version §c" + foundVersion);
                String currentVersion = (DefultValue.PrefixHC + "§6Current version: §a" + version);
                String downloadVersion = (DefultValue.PrefixHC + "§6You can download it here: §ehttps://www.spigotmc.org/resources/wonderbagshop.89234/");
                String discord = (DefultValue.PrefixHC + "§6You can find more information about §8[§2Wonder§6Bag§9Shop§8]§6 on Discord: §ehttps://discord.com/invite/vRyXFFterJ");
                String SnapshotConsole = (DefultValue.PrefixHC + "§6" +
                        "\n" + DefultValue.PrefixHC + "§4Please note!§6" +
                        "\n" + DefultValue.PrefixHC + "§4You are using the §6" + foundVersion + " §4of WonderBagShop!§6" +
                        "\n" + DefultValue.PrefixHC + "§4There may be errors and it is possible that not all functions work as they should!§6" +
                        "\n" + DefultValue.PrefixHC + "§2If there are any bugs, please report them to me via Discord so I can fix them!§6" +
                        "\n" + DefultValue.PrefixHC + "§7https://discord.com/invite/vRyXFFterJ");
                String SnapshotPlayer = (DefultValue.PrefixHC + "§4Please note!" +
                        "\n" + DefultValue.PrefixHC + "§cYou are using the §6" + foundVersion + " §cof WonderBagShop!" +
                        "\n" + DefultValue.PrefixHC + "§cThere may be errors and it is possible that not all functions work as they should!" +
                        "\n" + DefultValue.PrefixHC + "§2If there are any bugs, please report them to me via Discord so I can fix them." +
                        "\n" + DefultValue.PrefixHC + "§7https://discord.com/invite/vRyXFFterJ");

                if (Main.Snapshot) {
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                            Bukkit.getConsoleSender().sendMessage(SnapshotConsole);
                            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                        }
                    }.runTaskLater(Main.getPlugin(), 300L);
                }

                new BukkitRunnable() {
                    @Override
                    public void run() {
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                        Bukkit.getConsoleSender().sendMessage(updateFound);
                        Bukkit.getConsoleSender().sendMessage(yourVersion);
                        Bukkit.getConsoleSender().sendMessage(currentVersion);
                        Bukkit.getConsoleSender().sendMessage(downloadVersion);
                        Bukkit.getConsoleSender().sendMessage(discord);
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + " ");
                    }
                }.runTaskLater(Main.getPlugin(), 600L);


                Iterator var7 = Bukkit.getOnlinePlayers().iterator();

                while (var7.hasNext()) {
                    Player player = (Player) var7.next();
                    if (player.hasPermission("wonderbagshop.admin") || player.isOp()) {
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

                        if (Main.Snapshot) {
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    player.sendMessage("\n \n \n \n \n \n" + SnapshotPlayer);
                                }
                            }.runTaskLater(Main.getPlugin(), 120L);
                        }

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

    public static Main getPlugin() {
        return plugin;
    }
}