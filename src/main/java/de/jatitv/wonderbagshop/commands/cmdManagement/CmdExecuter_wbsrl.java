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

package de.jatitv.wonderbagshop.commands.cmdManagement;

import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdExecuter_wbsrl implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;
        if (args.length == 0) {
            if (sender.hasPermission("wonderbagshop.admin") || sender.isOp()) {
                if (sender instanceof Player) sender.sendMessage(DefaultValue.PrefixHC + DefaultValue.ReloadStart);
                Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");
                Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§6Plugin reload...");
                Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");

                Bukkit.getServer().getPluginManager().getPlugin(Main.plugin.getName()).onEnable();

                if (sender instanceof Player) sender.sendMessage(DefaultValue.PrefixHC + DefaultValue.ReloadEnd);
                Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");
                Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§2Plugin successfully reloaded.");
                Bukkit.getConsoleSender().sendMessage(DefaultValue.PrefixHC + "§8-------------------------------");
            } else {
                sender.sendMessage(DefaultValue.NoPermission.replace("[cmd]", "/wonderbagshop reload")
                        .replace("[perm]", "wonderbagshop.command.reload"));
            }
        }
        return false;
    }
}