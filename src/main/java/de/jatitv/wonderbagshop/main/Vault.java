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
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§r\n" + DefultValue.PrefixHC + "§2Vault / Economy successfully connected!");
                }else{
                    Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4Economy could not be connected / found!");
                }
            }else{
                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4Economy could not be connected / found!");
            }
        }else{
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4Vault / Economy could not be connected / found!");
        }
    }
    public static void vaultDisable(){
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4Vault / Economy successfully deactivated.");
    }
}