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

package de.jatitv.wonderbagshop.gui.settingsGUI;

import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_1;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_2;
import de.jatitv.wonderbagshop.defaultValue.wonderBags.item.DefaultValueItem_3;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GUI_Settings {

    public static void openSettings(Player player) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9*6, "§2Wonder§6Bag§9Shop §7| §4Settings");
        ItemStack glass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta itemMetaglass = glass.getItemMeta();
        itemMetaglass.setDisplayName(" ");
        glass.setItemMeta(itemMetaglass);
        glass.setAmount(1);
        for(int i = 0; i<9*6;i++){inventory.setItem(i, glass);}

        ItemStack config = new ItemStack(Material.CRAFTING_TABLE);
        ItemMeta itemMeta = config.getItemMeta();
        itemMeta.setDisplayName("§6Config");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§8-------------");
        lore.add("§7Edit the §6Config.yml");
        itemMeta.setLore(lore);
        config.setItemMeta(itemMeta);
        config.setAmount(1);
        inventory.setItem(12, config);

        ItemStack msg = new ItemStack(Material.FEATHER);
        ItemMeta itemMetamsg = msg.getItemMeta();
        itemMetamsg.setDisplayName("§6Messages");
        ArrayList<String> loremsg = new ArrayList<>();
        loremsg.add("§8-------------");
        loremsg.add("§4The Messages.yml is");
        loremsg.add("§4NOT customizable ingame!");
        itemMetamsg.setLore(loremsg);
        msg.setItemMeta(itemMetamsg);
        msg.setAmount(1);
        inventory.setItem(14, msg);

        ItemStack wb1chest = new ItemStack(Material.CHEST);
        ItemMeta itemMetawb1chest = wb1chest.getItemMeta();
        itemMetawb1chest.setDisplayName("§6Wonderbag Chest small");
        ArrayList<String> lorewb1chest = new ArrayList<>();
        lorewb1chest.add("§8-------------");
        lorewb1chest.add("§7Edit the §6Chest small.yml");
        itemMetawb1chest.setLore(lorewb1chest);
        wb1chest.setItemMeta(itemMetawb1chest);
        wb1chest.setAmount(1);
        inventory.setItem(29, wb1chest);

        ItemStack wb2chest = new ItemStack(Material.CHEST);
        ItemMeta itemMetawb2chest = wb2chest.getItemMeta();
        itemMetawb2chest.setDisplayName("§6Wonderbag Chest medium");
        ArrayList<String> lorewb2chest = new ArrayList<>();
        lorewb2chest.add("§8-------------");
        lorewb2chest.add("§7Edit the §6Chest medium.yml");
        itemMetawb2chest.setLore(lorewb2chest);
        wb2chest.setItemMeta(itemMetawb2chest);
        wb2chest.setAmount(1);
        inventory.setItem(31, wb2chest);

        ItemStack wb3chest = new ItemStack(Material.CHEST);
        ItemMeta itemMetawb3chest = wb3chest.getItemMeta();
        itemMetawb3chest.setDisplayName("§6Wonderbag Chest large");
        ArrayList<String> lorewb3chest = new ArrayList<>();
        lorewb3chest.add("§8-------------");
        lorewb3chest.add("§7Edit the §6Chest large.yml");
        itemMetawb3chest.setLore(lorewb3chest);
        wb3chest.setItemMeta(itemMetawb3chest);
        wb3chest.setAmount(1);
        inventory.setItem(33, wb3chest);

        ItemStack wb1item = new ItemStack(Material.valueOf(DefaultValueItem_1.Item));
        ItemMeta itemMetawb1item = wb1item.getItemMeta();
        itemMetawb1item.setDisplayName("§6Wonderbag Item small");
        ArrayList<String> lorewb1item = new ArrayList<>();
        lorewb1item.add("§8-------------");
        lorewb1item.add("§7Edit the §6Item small.yml");
        itemMetawb1item.setLore(lorewb1item);
        wb1item.setItemMeta(itemMetawb1item);
        wb1item.setAmount(1);
        inventory.setItem(38, wb1item);

        ItemStack wb2item = new ItemStack(Material.valueOf(DefaultValueItem_2.Item));
        ItemMeta itemMetawb2item = wb2item.getItemMeta();
        itemMetawb2item.setDisplayName("§6Wonderbag Item medium");
        ArrayList<String> lorewb2item = new ArrayList<>();
        lorewb2item.add("§8-------------");
        lorewb2item.add("§7Edit the §6Item medium.yml");
        itemMetawb2item.setLore(lorewb2item);
        wb2item.setItemMeta(itemMetawb2item);
        wb2item.setAmount(1);
        inventory.setItem(40, wb2item);

        ItemStack wb3item = new ItemStack(Material.valueOf(DefaultValueItem_3.Item));
        ItemMeta itemMetawb3item = wb3item.getItemMeta();
        itemMetawb3item.setDisplayName("§6Wonderbag Item large");
        ArrayList<String> lorewb3item = new ArrayList<>();
        lorewb3item.add("§8-------------");
        lorewb3item.add("§7Edit the §6Item large.yml");
        itemMetawb3item.setLore(lorewb3item);
        wb3item.setItemMeta(itemMetawb3item);
        wb3item.setAmount(1);
        inventory.setItem(42, wb3item);

        ItemStack rl = new ItemStack(Material.ANVIL);
        ItemMeta itemMetarl = rl.getItemMeta();
        itemMetarl.setDisplayName("§6WBS Reload");
        ArrayList<String> lorerl = new ArrayList<>();
        lorerl.add("§8-------------");
        lorerl.add("§7Reload the Plugin");
        itemMetarl.setLore(lorerl);
        rl.setItemMeta(itemMetarl);
        rl.setAmount(1);
        inventory.setItem(4, rl);

        player.openInventory(inventory);

    }
}