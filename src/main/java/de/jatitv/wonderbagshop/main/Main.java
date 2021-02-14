package de.jatitv.wonderbagshop.main;

import de.jatitv.wonderbagshop.Listeners.ShopEvent;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main plugin;
    public static Plugin a;
    public static Economy eco = null;

    @Override
    public void onEnable() {
        // Plugin startup logic

        plugin = this;
        getCommand("wonderbagshop").setExecutor(new CmdExecuter());
        getCommand("wbs").setExecutor(new CmdExecuter());
        getCommand("wonderbagshop").setTabCompleter(new TabComplete());
        getCommand("wbs").setTabCompleter(new TabComplete());
        getCommand("wbsrl").setExecutor(new CmdExecuter_wbsrl());
        a = this;
        Bukkit.getServer().getPluginManager().registerEvents(new ShopEvent(), this);
        Load.LoadSend(getDescription().getVersion());
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
