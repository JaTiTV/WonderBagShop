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

package de.jatitv.wonderbagshop.settingsGUI;

import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB1;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB2;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB3;
import de.jatitv.wonderbagshop.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.io.File;
import java.util.ArrayList;

public class SettingsGUI {

    public static void openSettings(Player player) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9*1, "§2Wonder§6Bag§9Shop §7| §4Settings");

        ItemStack glass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta itemMetaglass = glass.getItemMeta();
        itemMetaglass.setDisplayName(" ");
        glass.setItemMeta(itemMetaglass);
        glass.setAmount(1);
        for(int i = 0; i<9*1;i++){inventory.setItem(i, glass);}

        ItemStack config = new ItemStack(Material.PAPER);
        ItemMeta itemMeta = config.getItemMeta();
        itemMeta.setDisplayName("§6Config");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§8-------------");
        lore.add("§7Edit the §6Config.yml");
        itemMeta.setLore(lore);
        config.setItemMeta(itemMeta);
        config.setAmount(1);
        inventory.setItem(0, config);

        ItemStack wb1 = new ItemStack(Material.PAPER);
        ItemMeta itemMetawb1 = wb1.getItemMeta();
        itemMetawb1.setDisplayName("§6Wonderbag_1");
        ArrayList<String> lorewb1 = new ArrayList<>();
        lorewb1.add("§8-------------");
        lorewb1.add("§7Edit the §6Wonderbag_1.yml");
        lorewb1.add("§4Comming Soon!");
        itemMetawb1.setLore(lorewb1);
        wb1.setItemMeta(itemMetawb1);
        wb1.setAmount(1);
        inventory.setItem(4, wb1);

        ItemStack wb2 = new ItemStack(Material.PAPER);
        ItemMeta itemMetawb2 = wb2.getItemMeta();
        itemMetawb2.setDisplayName("§6Wonderbag_2");
        ArrayList<String> lorewb2 = new ArrayList<>();
        lorewb2.add("§8-------------");
        lorewb2.add("§7Edit the §6Wonderbag_2.yml");
        lorewb2.add("§4Comming Soon!");
        itemMetawb2.setLore(lorewb2);
        wb2.setItemMeta(itemMetawb2);
        wb2.setAmount(1);
        inventory.setItem(6, wb2);

        ItemStack wb3 = new ItemStack(Material.PAPER);
        ItemMeta itemMetawb3 = wb3.getItemMeta();
        itemMetawb3.setDisplayName("§6Wonderbag_3");
        ArrayList<String> lorewb3 = new ArrayList<>();
        lorewb3.add("§8-------------");
        lorewb3.add("§7Edit the §6Wonderbag_3.yml");
        lorewb3.add("§4Comming Soon!");
        itemMetawb3.setLore(lorewb3);
        wb3.setItemMeta(itemMetawb3);
        wb3.setAmount(1);
        inventory.setItem(8, wb3);

        player.openInventory(inventory);

    }

}