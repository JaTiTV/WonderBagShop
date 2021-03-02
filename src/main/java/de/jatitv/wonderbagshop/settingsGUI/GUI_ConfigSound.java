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
import de.jatitv.wonderbagshop.system.Main;
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

public class GUI_ConfigSound {

    public static void openSound(Player player) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9 * 5, "§2W§6B§9S §7| §4Settings §7| §9Config §7| §6Sound");

        ItemStack glass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta itemMetaglass = glass.getItemMeta();
        itemMetaglass.setDisplayName(" ");
        glass.setItemMeta(itemMetaglass);
        glass.setAmount(1);
        for(int i = 0; i<9*5;i++){inventory.setItem(i, glass);}


        if (DefultValue.Sound_Shop_Buy_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Sound Buy");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Sound Buy");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(10, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Buy Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Buy Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(19, item2);
        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Sound Buy");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Sound Buy");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(10, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Buy Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Buy Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(19, item2);
        }

        if (DefultValue.Sound_Shop_NoMoney_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Sound No Money");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Sound NoMoney");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(11, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound No Money Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound No Money Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(20, item2);
        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Sound No Money");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Sound NoMoney");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(11, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound No Money Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound No Money Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(20, item2);
        }

        if (DefultValue.Sound_Shop_NoInventorySpace_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Sound No Inventory Space");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Sound NoInventorySpace");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(12, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound No Inventory Space Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound No Inventory Space Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(21, item2);
        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Sound No Inventory Space");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Sound NoInventorySpace");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(12, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound No Inventory Space Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound No Inventory Space Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(21, item2);
        }

        if (DefultValue.Sound_Give_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Sound Give");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Sound Give");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(14, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Give Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Give Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(23, item2);
        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Sound Give");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Sound Give");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(14, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Give Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Give Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(23, item2);
        }

        if (DefultValue.Sound_Gift_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Sound Gift");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Sound Gift");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(15, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Gift Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Gift Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(24, item2);
        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Sound Gift");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Sound Gift");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(15, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Gift Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Gift Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(24, item2);
        }

        if (DefultValue.Sound_PlayerNotFound_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Sound Player Not Found");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Sound PlayerNotFound");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(16, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Player Not Found Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Player Not Found Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(25, item2);
        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Sound Player Not Found");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Sound PlayerNotFound");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(16, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Player Not Found Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Player Not Found Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(25, item2);


        }

        ItemStack config = new ItemStack(Material.CRAFTING_TABLE);
        ItemMeta itemMetaconfig = config.getItemMeta();
        itemMetaconfig.setDisplayName("§6Back to Config");
        ArrayList<String> loreconfig = new ArrayList<>();
        loreconfig.add("§8-------------");
        loreconfig.add("§7Back to Config");
        itemMetaconfig.setLore(loreconfig);
        config.setItemMeta(itemMetaconfig);
        config.setAmount(1);
        inventory.setItem(39, config);

        ItemStack itemsettings = new ItemStack(Material.LOOM);
        ItemMeta itemMetasettings = itemsettings.getItemMeta();
        itemMetasettings.setDisplayName("§6Settings");
        ArrayList<String> loresettings = new ArrayList<>();
        loresettings.add("§8-------------");
        loresettings.add("§7Back to §6Settings");
        itemMetasettings.setLore(loresettings);
        itemsettings.setItemMeta(itemMetasettings);
        itemsettings.setAmount(1);
        inventory.setItem(41, itemsettings);
        player.openInventory(inventory);
    }
}