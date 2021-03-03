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

import de.jatitv.wonderbagshop.defultValue.DefultValue;
import de.jatitv.wonderbagshop.defultValue.DefultValueChest_1;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.io.File;
import java.util.ArrayList;

public class GUI_Chest1 {

    public static void openConfigChest1(Player player) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9 * 3, "§2W§6B§9S §7| §4Settings §7| " + DefultValueChest_1.Name);
        File configYML = new File(Main.thisp().getDataFolder().getPath(), "Config.yml");
        YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);

        ItemStack glass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta itemMetaglass = glass.getItemMeta();
        itemMetaglass.setDisplayName(" ");
        glass.setItemMeta(itemMetaglass);
        glass.setAmount(1);
        for (int i = 0; i < 9 * 3; i++) {
            inventory.setItem(i, glass);
        }


        ItemStack item = new ItemStack(Material.GREEN_WOOL);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("§6Update Check On Join");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§8-------------");
        lore.add("§7Set the Config §6UpdateCheckOnJoin");
        lore.add("§7to §cfalse");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        item.setAmount(1);
        inventory.setItem(3, item);


        ItemStack reset = new ItemStack(Material.ENCHANTING_TABLE);
        ItemMeta itemMetareset = reset.getItemMeta();
        itemMetareset.setDisplayName("§6Defult Config");
        ArrayList<String> lorereset = new ArrayList<>();
        lorereset.add("§8-------------");
        lorereset.add("§4Reset to the default §6Config.yml");
        itemMetareset.setLore(lorereset);
        reset.setItemMeta(itemMetareset);
        reset.setAmount(1);
        inventory.setItem(31, reset);

        ItemStack item2 = new ItemStack(Material.LOOM);
        ItemMeta itemMeta2 = item2.getItemMeta();
        itemMeta2.setDisplayName("§6Settings");
        ArrayList<String> lore2 = new ArrayList<>();
        lore2.add("§8-------------");
        lore2.add("§7Back to §6Settings");
        itemMeta2.setLore(lore2);
        item2.setItemMeta(itemMeta2);
        item2.setAmount(1);
        inventory.setItem(49, item2);

        ItemStack back = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta itemMetaback = (SkullMeta) back.getItemMeta();
        itemMetaback.setDisplayName("§6Back");
        ArrayList<String> loreback = new ArrayList<>();
        loreback.add("§8-------------");
        loreback.add("§4Switch to the back");
        itemMetaback.setLore(loreback);
        itemMetaback.setOwner("MHF_ArrowLeft");
        back.setItemMeta(itemMetaback);
        back.setAmount(1);
        inventory.setItem(45, back);

        ItemStack next = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta itemMetanext = (SkullMeta) next.getItemMeta();
        itemMetanext.setDisplayName("§6Next");
        ArrayList<String> lorenext = new ArrayList<>();
        lorenext.add("§8-------------");
        lorenext.add("§4Switch to the next");
        itemMetanext.setLore(lorenext);
        itemMetanext.setOwner("MHF_ArrowRight");
        next.setItemMeta(itemMetanext);
        next.setAmount(1);
        inventory.setItem(53, next);

        player.openInventory(inventory);
    }

    public static void resetConfig(Player player) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9 * 1, "§2W§6B§9S §7| §4RESET §7| §9Config");

        ItemStack glass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta itemMetaglass = glass.getItemMeta();
        itemMetaglass.setDisplayName(" ");
        glass.setItemMeta(itemMetaglass);
        glass.setAmount(1);
        for (int i = 0; i < 9 * 1; i++) {
            inventory.setItem(i, glass);
        }

        ItemStack item = new ItemStack(Material.GREEN_WOOL);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("§2Yes §4Reset the Config");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§8-------------");
        lore.add("§4Reset to the default §6Config.yml");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        item.setAmount(1);
        inventory.setItem(3, item);

        ItemStack item2 = new ItemStack(Material.RED_WOOL);
        ItemMeta itemMeta2 = item2.getItemMeta();
        itemMeta2.setDisplayName("§cNO §4Do not reset Config");
        ArrayList<String> lore2 = new ArrayList<>();
        lore2.add("§8-------------");
        lore2.add("§4Go back to §2W§6B§9S §7| §4Settings §7| §9Config");
        itemMeta2.setLore(lore2);
        item2.setItemMeta(itemMeta2);
        item2.setAmount(1);
        inventory.setItem(5, item2);


        player.openInventory(inventory);
    }
}