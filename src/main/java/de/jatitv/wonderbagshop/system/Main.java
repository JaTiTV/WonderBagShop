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
import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import de.jatitv.wonderbagshop.listeners.*;
import de.jatitv.wonderbagshop.commands.cmdManagement.CmdExecuter;
import de.jatitv.wonderbagshop.commands.cmdManagement.CmdExecuter_wbsrl;
import de.jatitv.wonderbagshop.listeners.settingsGUI.*;
import de.jatitv.wonderbagshop.listeners.useWonderBag.chest.UseChestWB1;
import de.jatitv.wonderbagshop.listeners.useWonderBag.chest.UseChestWB2;
import de.jatitv.wonderbagshop.listeners.useWonderBag.chest.UseChestWB3;
import de.jatitv.wonderbagshop.listeners.useWonderBag.item.UseItemWB1;
import de.jatitv.wonderbagshop.listeners.useWonderBag.item.UseItemWB2;
import de.jatitv.wonderbagshop.listeners.useWonderBag.item.UseItemWB3;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;


import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    // Debug Settings

    public static Boolean Bstats = true;

    public static Boolean Snapshot = false;

    public static Boolean UpdateMSG = true;
    public static String UpdateInfo = DefaultValue.PrefixHC + "§4You have just updated WonderBagShop! §6Here is some important information:" +
            "§4\n" + DefaultValue.PrefixHC +
            "§4\n" + DefaultValue.PrefixHC + "§4In the version 2.3.0, a critical bug was fixed that was responsible for the config not being created correctly." +
            "§4\n" + DefaultValue.PrefixHC + "§4Therefore, you must urgently recreate it!" +
            "§4\n" + DefaultValue.PrefixHC + "§4Otherwise I can not guarantee that the plugin will work properly." +
            "§4\n" + DefaultValue.PrefixHC + "§4If you encounter any errors please contact me via Discord: §6https://discord.com/invite/vRyXFFterJ" +
            "§4\n" + DefaultValue.PrefixHC +
            "§4\n" + DefaultValue.PrefixHC + "§2Sincerely JaTiTV";

    public static String Autor = "JaTiTV";
    public static String Spigot = "https://www.spigotmc.org/resources/wonderbagshop.89234/";
    public static String Discord = "You want to discuss and decide about current bugs, planned updates, new features?\n" +
            "Then come to our Discord. https://discord.gg/vRyXFFterJ";
    public static String DiscordLoad = "https://discord.gg/vRyXFFterJ";

    // ---------------------------------------------

    public static Main plugin;
    public static Plugin a;
    public static Economy eco = null;
    public static String update_version = null;
    public static boolean minecraft1_8;
    public static boolean minecraft1_9;
    public static boolean minecraft1_10;
    public static boolean minecraft1_11;
    public static boolean minecraft1_12;
    public static boolean minecraft1_13;
    public static boolean minecraft1_14;
    public static boolean minecraft1_15;
    public static boolean minecraft1_16;

    public static Main getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        Logger logger = this.getLogger();

        plugin = this;
        a = this;

        minecraft1_8 = Bukkit.getServer().getClass().getPackage().getName().contains("1_8");
        minecraft1_9 = Bukkit.getServer().getClass().getPackage().getName().contains("1_9");
        minecraft1_10 = Bukkit.getServer().getClass().getPackage().getName().contains("1_10");
        minecraft1_11 = Bukkit.getServer().getClass().getPackage().getName().contains("1_11");
        minecraft1_12 = Bukkit.getServer().getClass().getPackage().getName().contains("1_12");
        minecraft1_13 = Bukkit.getServer().getClass().getPackage().getName().contains("1_13");
        minecraft1_14 = Bukkit.getServer().getClass().getPackage().getName().contains("1_14");
        minecraft1_15 = Bukkit.getServer().getClass().getPackage().getName().contains("1_15");
        minecraft1_16 = Bukkit.getServer().getClass().getPackage().getName().contains("1_16");

        if (minecraft1_8 | minecraft1_9 | minecraft1_10 | minecraft1_11 | minecraft1_12) {
            NotSupportedVersion.notSupportedVersion(getDescription().getVersion());
            Bukkit.getServer().getPluginManager().disablePlugin(this);
            return;
        }
        try {
            Load.LoadSend(getDescription().getVersion());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getCommand("wonderbagshop").setExecutor(new CmdExecuter());
        getCommand("wonderbagshop").setTabCompleter(new TabComplete());


        Bukkit.getServer().getPluginManager().registerEvents(new JoinEvent(), this);

        Bukkit.getServer().getPluginManager().registerEvents(new ShopEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new GiftEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new GiveEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new GiveAllEvent(), this);

        Bukkit.getServer().getPluginManager().registerEvents(new UseChestWB1(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new UseChestWB2(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new UseChestWB3(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new BreakChest(), this);

        Bukkit.getServer().getPluginManager().registerEvents(new UseItemWB1(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new UseItemWB2(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new UseItemWB3(), this);

        Bukkit.getServer().getPluginManager().registerEvents(new GUI_Settings_Listener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new GUI_Config_Listener(), this);

        Bukkit.getServer().getPluginManager().registerEvents(new GUI_Chest1_Listener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new GUI_Chest2_Listener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new GUI_Chest3_Listener(), this);

        Bukkit.getServer().getPluginManager().registerEvents(new GUI_Item1_Listener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new GUI_Item2_Listener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new GUI_Item3_Listener(), this);

        Bukkit.getServer().getPluginManager().registerEvents(new GUI_ConfigSound_Listener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new GUI_ConfigTitle_Listener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new GUI_Chat_Listener(), this);


        if (Main.Bstats) {
            int pluginId = 10342; // <-- Replace with the id of your plugin!
            Metrics metrics = new Metrics(this, pluginId);
            metrics.addCustomChart(new Metrics.SimplePie("updatecheckonjoin", () -> String.valueOf(DefaultValue.UpdateCheckOnJoin)));
            metrics.addCustomChart(new Metrics.SimplePie("itemnumbers", () -> String.valueOf(DefaultValue.ItemNumbers)));
            metrics.addCustomChart(new Metrics.SimplePie("usechest", () -> String.valueOf(DefaultValue.UseChest)));
            metrics.addCustomChart(new Metrics.SimplePie("usechest_and_item", () -> String.valueOf(DefaultValue.UseChest_and_Item)));
            metrics.addCustomChart(new Metrics.SimplePie("chestdrop", () -> String.valueOf(DefaultValue.ChestDrop)));
            metrics.addCustomChart(new Metrics.SimplePie("sound_shop_buy_enable", () -> String.valueOf(DefaultValue.Sound_Shop_Buy_Enable)));
            metrics.addCustomChart(new Metrics.SimplePie("sound_shop_nomoney_enable", () -> String.valueOf(DefaultValue.Sound_Shop_NoMoney_Enable)));
            metrics.addCustomChart(new Metrics.SimplePie("sound_shop_noinventoryspace_enable", () -> String.valueOf(DefaultValue.Sound_Shop_NoInventorySpace_Enable)));
            metrics.addCustomChart(new Metrics.SimplePie("sound_give_enable", () -> String.valueOf(DefaultValue.Sound_Give_Enable)));
            metrics.addCustomChart(new Metrics.SimplePie("sound_gift_enable", () -> String.valueOf(DefaultValue.Sound_Gift_Enable)));
            metrics.addCustomChart(new Metrics.SimplePie("sound_playernotfound_enable", () -> String.valueOf(DefaultValue.Sound_PlayerNotFound_Enable)));
        } else {
            new BukkitRunnable() {
                @Override
                public void run() {
                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + " ");
                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + " ");
                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + " ");
                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + " ");
                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§4\n" + DefaultValue.PrefixHC + "§4Bstats is disabled!");
                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + " ");
                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + " ");
                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + " ");
                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + " ");
                }
            }.runTaskLater(Main.getPlugin(), 200L);
        }


        // Optional: Add custom charts
        // metrics.addCustomChart(new Metrics.SimplePie("chart_id", () -> "My value"));

        int taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {


            public void run() {

                (new UpdateChecker((JavaPlugin) Main.thisp(), 89234)).getVersion((version) -> {
                    String foundVersion = Main.thisp().getDescription().getVersion();
                    update_version = version;
                    if (!foundVersion.equalsIgnoreCase(version)) {
                        String updateFound = (DefaultValue.PrefixHC + "§6A new version of §8[§2Wonder§6Bag§9Shop§8]§6 was found!");
                        String yourVersion = (DefaultValue.PrefixHC + "§6Your version §c" + foundVersion);
                        String currentVersion = (DefaultValue.PrefixHC + "§6Current version: §a" + version);
                        String downloadVersion = (DefaultValue.PrefixHC + "§6You can download it here: §ehttps://www.spigotmc.org/resources/wonderbagshop.89234/");
                        String discord = (DefaultValue.PrefixHC + "§6You can find more information about §8[§2Wonder§6Bag§9Shop§8]§6 on Discord: §ehttps://discord.com/invite/vRyXFFterJ");
                        String SnapshotConsole = (DefaultValue.PrefixHC + "§6" +
                                "\n" + DefaultValue.PrefixHC + "§4Please note!§6" +
                                "\n" + DefaultValue.PrefixHC + "§4You are using the §6" + foundVersion + " §4of WonderBagShop!§6" +
                                "\n" + DefaultValue.PrefixHC + "§4There may be errors and it is possible that not all functions work as they should!§6" +
                                "\n" + DefaultValue.PrefixHC + "§2If there are any bugs, please report them to me via Discord so I can fix them!§6" +
                                "\n" + DefaultValue.PrefixHC + "§7https://discord.gg/vRyXFFterJ");

                        if (Main.Snapshot) {
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + " ");
                                    Bukkit.getConsoleSender().sendMessage(SnapshotConsole);
                                    Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + " ");
                                }
                            }.runTaskLater(Main.getPlugin(), 300L);
                        }

                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + " ");
                                Bukkit.getConsoleSender().sendMessage(updateFound);
                                Bukkit.getConsoleSender().sendMessage(yourVersion);
                                Bukkit.getConsoleSender().sendMessage(currentVersion);
                                Bukkit.getConsoleSender().sendMessage(downloadVersion);
                                Bukkit.getConsoleSender().sendMessage(discord);
                                Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + " ");
                            }
                        }.runTaskLater(Main.getPlugin(), 600L);
                    } else {
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2No update found");
                            }
                        }.runTaskLater(Main.getPlugin(), 120L);
                    }
                });
            }
        }, 0L, 20 * 60 * 60L);
    }

    public static Plugin thisp() {
        return plugin;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        if (minecraft1_8 | minecraft1_9 | minecraft1_10 | minecraft1_11 | minecraft1_12) return;
        Disable.disableSend(getDescription().getVersion());
    }
}