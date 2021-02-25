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
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ConfigGUI {

    public static void openConfig(Player player) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9*6, "§2W§6B§9S §7| §4Settings §7| §9Config");

        ItemStack glass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta itemMetaglass = glass.getItemMeta();
        itemMetaglass.setDisplayName(" ");
        glass.setItemMeta(itemMetaglass);
        glass.setAmount(1);
        for(int i = 0; i<9*6;i++){inventory.setItem(i, glass);}

        if (DefultValue.ItemNumbers) {
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName(" ");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6ItemNumbers");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(0, item);
        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Item Numbers");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6ItemNumbers");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(0, item);
        }

        if (DefultValue.UseChest){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Use Chest");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6UseChest");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(1, item);
        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Use Chest");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6UseChest");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(1, item);
        }

        if (DefultValue.ChestDrop){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Chest Drop");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6ChestDrop");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(2, item);
        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Chest Drop");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6ChestDrop");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(2, item);
        }

        ItemStack guiname = new ItemStack(Material.BLUE_WOOL);
        ItemMeta itemMetaguiname = guiname.getItemMeta();
        itemMetaguiname.setDisplayName("§6GUI_Name");
        ArrayList<String> loreguiname = new ArrayList<>();
        loreguiname.add("§8-------------");
        loreguiname.add("§7Set the §6GUI_Name");
        loreguiname.add("§4Comming Soon!");
        itemMetaguiname.setLore(loreguiname);
        guiname.setItemMeta(itemMetaguiname);
        guiname.setAmount(1);
        inventory.setItem(9, guiname);

        ItemStack currency = new ItemStack(Material.BLUE_WOOL);
        ItemMeta itemMetacurrency = currency.getItemMeta();
        itemMetacurrency.setDisplayName("§6Currency");
        ArrayList<String> lorecurrency = new ArrayList<>();
        lorecurrency.add("§8-------------");
        lorecurrency.add("§7Set the §6Currency");
        lorecurrency.add("§4Comming Soon!");
        itemMetacurrency.setLore(lorecurrency);
        currency.setItemMeta(itemMetacurrency);
        currency.setAmount(1);
        inventory.setItem(10, currency);

        ItemStack reset = new ItemStack(Material.ORANGE_WOOL);
        ItemMeta itemMetareset = reset.getItemMeta();
        itemMetareset.setDisplayName("§6Defult Config");
        ArrayList<String> lorereset = new ArrayList<>();
        lorereset.add("§8-------------");
        lorereset.add("§4Reset to the default §6Config.yml");
        itemMetareset.setLore(lorereset);
        reset.setItemMeta(itemMetareset);
        reset.setAmount(1);
        inventory.setItem(8, reset);


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
            inventory.setItem(27, item);

            ItemStack item2 = new ItemStack(Material.BLUE_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Buy Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Buy Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(36, item2);
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
            inventory.setItem(27, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Buy Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Buy Sound");
            lore2.add("§4Activate the sound to be able to change it");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(36, item2);
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
            inventory.setItem(28, item);

            ItemStack item2 = new ItemStack(Material.BLUE_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound No Money Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound No Money Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(37, item2);
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
            inventory.setItem(28, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound No Money Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound No Money Sound");
            lore2.add("§4Activate the sound to be able to change it");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(37, item2);
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
            inventory.setItem(29, item);

            ItemStack item2 = new ItemStack(Material.BLUE_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound No Inventory Space Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound No Inventory Space Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(38, item2);
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
            inventory.setItem(29, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound No Inventory Space Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound No Inventory Space Sound");
            lore2.add("§4Activate the sound to be able to change it");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(38, item2);
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
            inventory.setItem(30, item);

            ItemStack item2 = new ItemStack(Material.BLUE_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Give Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Give Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(39, item2);
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
            inventory.setItem(30, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Give Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Give Sound");
            lore2.add("§4Activate the sound to be able to change it");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(39, item2);
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
            inventory.setItem(31, item);

            ItemStack item2 = new ItemStack(Material.BLUE_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Gift Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Gift Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(40, item2);
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
            inventory.setItem(31, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Gift Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Gift Sound");
            lore2.add("§4Activate the sound to be able to change it");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(40, item2);
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
            inventory.setItem(32, item);

            ItemStack item2 = new ItemStack(Material.BLUE_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Player Not Found Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Player Not Found Sound");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(41, item2);
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
            inventory.setItem(32, item);

            ItemStack item2 = new ItemStack(Material.GRAY_WOOL);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Sound Player Not Found Sound");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Set the sound §6Sound Player Not Found Sound");
            lore2.add("§4Activate the sound to be able to change it");
            lore2.add("§4Comming Soon!");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(41, item2);
        }



        ItemStack item2 = new ItemStack(Material.YELLOW_WOOL);
        ItemMeta itemMeta2 = item2.getItemMeta();
        itemMeta2.setDisplayName("§6Settings");
        ArrayList<String> lore2 = new ArrayList<>();
        lore2.add("§8-------------");
        lore2.add("§7Back to §6Settings");
        itemMeta2.setLore(lore2);
        item2.setItemMeta(itemMeta2);
        item2.setAmount(1);
        inventory.setItem(53, item2);





        player.openInventory(inventory);
    }
    public static void resetConfig(Player player) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9 * 1, "§2W§6B§9S §7| §4RESET §7| §9Config");

        ItemStack glass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta itemMetaglass = glass.getItemMeta();
        itemMetaglass.setDisplayName(" ");
        glass.setItemMeta(itemMetaglass);
        glass.setAmount(1);
        for(int i = 0; i<9*1;i++){inventory.setItem(i, glass);}

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