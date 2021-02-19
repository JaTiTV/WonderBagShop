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

import de.jatitv.wonderbagshop.commands.Reload;
import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdExecuter_wbsrl implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                if (sender.hasPermission("wonderbagshop.command.reload") || sender.hasPermission("wonderbagshop.admin") || sender.isOp()){
                    Reload.reloadConfirmPlayer((Player) sender);
                } else {
                    sender.sendMessage(DefultValue.NoPermission.replace("[cmd]", "/wonderbagshop reload")
                            .replace("[perm]", "wonderbagshop.command.reload"));
                }
            }
        } else {
            if (args.length == 0) {
                Reload.reloadConfirmConsole();
            }else {
                sender.sendMessage("§8[§2Wonder§6Bag§9Shop§8] §cThis command is only for players!");
            }
        }
        return false;
    }
}