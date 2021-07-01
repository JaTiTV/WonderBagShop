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

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
import java.util.function.Consumer;

public class UpdateChecker {

    public static void onUpdateCheck() {
        int taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable() {
            public void run() {
                (new UpdateChecker(Main.plugin, Main.SpigotID)).getVersion((update_version) -> {
                    String foundVersion = Main.plugin.getDescription().getVersion();
                    Main.update_version = update_version;
                    if (!foundVersion.equalsIgnoreCase(update_version)) {
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                Bukkit.getConsoleSender().sendMessage("§4=========== §8[§2Wonder§6Bag§9Shop§8] §4===========");
                                Bukkit.getConsoleSender().sendMessage("§6A new version was found!");
                                Bukkit.getConsoleSender().sendMessage("§6Your version: §c" + foundVersion + " §7- §6Current version: §a" + update_version);
                                Bukkit.getConsoleSender().sendMessage("§6You can download it here: §e" + Main.Spigot);
                                Bukkit.getConsoleSender().sendMessage("§6You can find more information on Discord: §e" + Main.Discord);
                                Bukkit.getConsoleSender().sendMessage("§4=========== §8[§2Wonder§6Bag§9Shop§8] §4===========");
                            }
                        }.runTaskLater(Main.plugin, 600L);
                    } else {
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                Bukkit.getConsoleSender().sendMessage(Main.Prefix + " §2No update found");
                            }
                        }.runTaskLater(Main.plugin, 120L);
                    }
                });
            }
        }, 0L, 20 * 60 * 60L);
    }

    private JavaPlugin plugin;
    private int resourceId;

    public UpdateChecker(JavaPlugin plugin, int resourceId) {
        this.plugin = plugin;
        this.resourceId = resourceId;
    }

    public void getVersion(Consumer<String> consumer) {
        Bukkit.getScheduler().runTaskAsynchronously(this.plugin, () -> {
            try {
                InputStream inputStream = (new URL("https://api.spigotmc.org/legacy/update.php?resource=" + this.resourceId)).openStream();
                try {
                    Scanner scanner = new Scanner(inputStream);

                    try {
                        if (scanner.hasNext()) {
                            consumer.accept(scanner.next());
                        }
                    } catch (Throwable var8) {
                        try {
                            scanner.close();
                        } catch (Throwable var7) {
                            var8.addSuppressed(var7);
                        }
                        throw var8;
                    }
                    scanner.close();
                } catch (Throwable var9) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable var6) {
                            var9.addSuppressed(var6);
                        }
                    }
                    throw var9;
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException var10) {
                this.plugin.getLogger().severe("§8[§2W§6B§9S§8]§4 Cannot look for updates: " + var10.getMessage());
            }
        });
    }
}