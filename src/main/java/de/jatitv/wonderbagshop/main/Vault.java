// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.main;

import de.jatitv.wonderbagshop.config.Messages;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;

public class Vault {

    public static void loadVault(){
        if(Main.a.getServer().getPluginManager().getPlugin("Vault") != null){
            RegisteredServiceProvider<Economy> rsp = Main.a.getServer().getServicesManager().getRegistration(Economy.class);
            if(rsp != null){
                Main.eco = rsp.getProvider();
                if(Main.eco != null){
                    Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§r\n" + Messages.PrefixHC + "§2Vault / Economy successfully connected!");
                }else{
                    Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4\n" + Messages.PrefixHC + "§4Economy could not be connected / found!");
                }
            }else{
                Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4\n" + Messages.PrefixHC + "§4Economy could not be connected / found!");
            }
        }else{
            Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4\n" + Messages.PrefixHC + "§4Vault / Economy could not be connected / found!");
        }
    }

    public static void vaultDisable(){
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Vault / Economy successfully deactivated.");
    }

}
