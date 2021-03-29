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

import de.jatitv.wonderbagshop.defaultValue.DefaultValue;
import de.jatitv.wonderbagshop.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GUI_ConfigTitle {

    public static void openTitel(Player player) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9 * 6, "§2W§6B§9S §7| §4Settings §7| §9Config §7| §aTitle");

        ItemStack glass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta itemMetaglass = glass.getItemMeta();
        itemMetaglass.setDisplayName(" ");
        glass.setItemMeta(itemMetaglass);
        glass.setAmount(1);
        for(int i = 0; i<9*6;i++){inventory.setItem(i, glass);}


        if (DefaultValue.Title_Enable) {
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Title");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(4, item);
        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Title");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(4, item);
        }


        if (DefaultValue.Title_Reload_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Reload");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Reload");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(18, item);

        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Reload");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Reload");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(18, item);
        }

        if (DefaultValue.Title_Buy_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Buy");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Buy");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(19, item);

        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Buy");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Buy");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(19, item);
        }


        if (DefaultValue.Title_No_money_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title No money");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6NoMoney");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(20, item);

        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title No money");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6NoMoney");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(20, item);
        }

        if (DefaultValue.Title_NoInventorySpace_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title No Inventory Space");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6NoInventorySpace");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(21, item);

        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title No Inventory Space");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6NoInventorySpace");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(21, item);

        }

        if (DefaultValue.Title_Give_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Give");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Give");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(22, item);

        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Give");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Give");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(22, item);

        }

        if (DefaultValue.Title_GiveReceived_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Give Received");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6GiveReceived");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(23, item);

        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Give Received");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6GiveReceived");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(23, item);

        }

        if (DefaultValue.Title_Gift_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Gift");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Gift");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(24, item);

        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Gift");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Gift");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(24, item);

        }

        if (DefaultValue.Title_GiftReceived_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Gift Received");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6GiftReceived");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(25, item);

        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Gift Received");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6GiftReceived");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(25, item);

        }

        if (DefaultValue.Title_PlayerNoInventorySpace_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Player No Inventory Space");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6PlayerNoInventorySpace");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(26, item);

        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Player No Inventory Space");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6PlayerNoInventorySpace");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(26, item);

        }

        if (DefaultValue.Title_PlayerNotFound_Enable){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Player Not Found");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6PlayerNotFound");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(27, item);

        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Title Player Not Found");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6PlayerNotFound");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(7, item);

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

        if (Main.minecraft1_13) {
            ItemStack itemsettings = new ItemStack(Material.JUKEBOX);
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
        }else {
            ItemStack itemsettings = new ItemStack(Material.valueOf("LOOM"));
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
}