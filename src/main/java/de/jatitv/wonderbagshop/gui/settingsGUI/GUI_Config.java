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
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.io.File;
import java.util.ArrayList;

public class GUI_Config {

    public static void openConfig(Player player) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder) null, 9*5, "§2W§6B§9S §7| §4Settings §7| §9Config");
        File configYML = new File(Main.thisp().getDataFolder().getPath(), "Config.yml");
        YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);

        ItemStack glass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta itemMetaglass = glass.getItemMeta();
        itemMetaglass.setDisplayName(" ");
        glass.setItemMeta(itemMetaglass);
        glass.setAmount(1);
        for(int i = 0; i<9*5;i++){inventory.setItem(i, glass);}

        if (DefaultValue.UpdateCheckOnJoin) {
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
            inventory.setItem(21, item);
        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Update Check On Join");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6UpdateCheckOnJoin");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(21, item);
        }

        if (DefaultValue.Debug) {
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Debug");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Debug");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(22, item);
        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Debug");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6Debug");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(22, item);
        }

        if (DefaultValue.Debug) {
            ItemStack item = new ItemStack(Material.BLUE_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Debug Stage");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6DebugStage");
            lore.add("§71 - 3");
            lore.add("§2Right click to increase");
            lore.add("§2Left click to decrease");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(yamlConfiguration_config.getInt("Plugin.Debug.DebugStage_(1-3)"));
            inventory.setItem(23, item);
        } else {
            ItemStack item = new ItemStack(Material.BLUE_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Debug Stage");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6DebugStage");
            lore.add("§71 - 3");
            lore.add("§2Right click to increase");
            lore.add("§2Left click to decrease");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(yamlConfiguration_config.getInt("Plugin.Debug.DebugStage_(1-3)"));
            inventory.setItem(23, item);
        }


        if (DefaultValue.ItemNumbers) {
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Item Numbers");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6ItemNumbers");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(2, item);
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
            inventory.setItem(2, item);
        }

        if (DefaultValue.UseChest){
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
            inventory.setItem(3, item);
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
            inventory.setItem(3, item);
        }

        if (DefaultValue.UseChest_and_Item){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Use Chest and Item");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6UseChest_and_Item");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(4, item);
        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Use Chest and Item");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6UseChest_and_Item");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(4, item);
        }

        if (DefaultValue.ChestDrop){
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
            inventory.setItem(5, item);
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
            inventory.setItem(5, item);
        }

        if (DefaultValue.RemoveChestInCreativemode){
            ItemStack item = new ItemStack(Material.GREEN_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Remove Chest in creative mode");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6RemoveChestInCreativemode");
            lore.add("§7to §cfalse");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(6, item);
        } else {
            ItemStack item = new ItemStack(Material.RED_WOOL);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName("§6Remove Chest in creative mode");
            ArrayList<String> lore = new ArrayList<>();
            lore.add("§8-------------");
            lore.add("§7Set the Config §6RemoveChestInCreativemode");
            lore.add("§7to §2true");
            itemMeta.setLore(lore);
            item.setItemMeta(itemMeta);
            item.setAmount(1);
            inventory.setItem(6, item);
        }

        ItemStack guiname = new ItemStack(Material.YELLOW_WOOL);
        ItemMeta itemMetaguiname = guiname.getItemMeta();
        itemMetaguiname.setDisplayName("§6GUI_Name");
        ArrayList<String> loreguiname = new ArrayList<>();
        loreguiname.add("§8-------------");
        loreguiname.add("§7Set the §6GUI_Name");
        loreguiname.add("§8-------------");
        loreguiname.add("§2Current:");
        loreguiname.add(DefaultValue.GUI_Name);
        itemMetaguiname.setLore(loreguiname);
        guiname.setItemMeta(itemMetaguiname);
        guiname.setAmount(1);
        inventory.setItem(10, guiname);

        ItemStack currency = new ItemStack(Material.YELLOW_WOOL);
        ItemMeta itemMetacurrency = currency.getItemMeta();
        itemMetacurrency.setDisplayName("§6Currency");
        ArrayList<String> lorecurrency = new ArrayList<>();
        lorecurrency.add("§8-------------");
        lorecurrency.add("§7Set the §6Currency");
        lorecurrency.add("§8-------------");
        lorecurrency.add("§2Current:");
        lorecurrency.add(DefaultValue.Currency);
        itemMetacurrency.setLore(lorecurrency);
        currency.setItemMeta(itemMetacurrency);
        currency.setAmount(1);
        inventory.setItem(16, currency);

        ItemStack sound = new ItemStack(Material.ORANGE_WOOL);
        ItemMeta itemMetasound = sound.getItemMeta();
        itemMetasound.setDisplayName("§6Sound Config");
        ArrayList<String> loresound = new ArrayList<>();
        loresound.add("§8-------------");
        loresound.add("§4Open the Sound Config");
        itemMetasound.setLore(loresound);
        sound.setItemMeta(itemMetasound);
        sound.setAmount(1);
        inventory.setItem(18, sound);

        ItemStack titel = new ItemStack(Material.ORANGE_WOOL);
        ItemMeta itemMetatitel = titel.getItemMeta();
        itemMetatitel.setDisplayName("§6Title Config");
        ArrayList<String> loretitel = new ArrayList<>();
        loretitel.add("§8-------------");
        loretitel.add("§4Open the Title Config");
        itemMetatitel.setLore(loretitel);
        titel.setItemMeta(itemMetatitel);
        titel.setAmount(1);
        inventory.setItem(26, titel);

        if (Main.minecraft1_13) {
            ItemStack item2 = new ItemStack(Material.JUKEBOX);
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Settings");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Back to §6Settings");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(40, item2);
        }else {
            ItemStack item2 = new ItemStack(Material.valueOf("LOOM"));
            ItemMeta itemMeta2 = item2.getItemMeta();
            itemMeta2.setDisplayName("§6Settings");
            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("§8-------------");
            lore2.add("§7Back to §6Settings");
            itemMeta2.setLore(lore2);
            item2.setItemMeta(itemMeta2);
            item2.setAmount(1);
            inventory.setItem(40, item2);
        }

/*
        ItemStack back = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta itemMetaback = (SkullMeta) back.getItemMeta();
        itemMetaback.setDisplayName("§6Back");
        ArrayList<String> loreback = new ArrayList<>();
        loreback.add("§8-------------");
        loreback.add("§4Switch to the back");
        loreback.add("§4Comming version 2.4!");
        itemMetaback.setLore(loreback);
        itemMetaback.setOwner("MHF_ArrowLeft");
        back.setItemMeta(itemMetaback);
        back.setAmount(1);
        inventory.setItem(36, back);

        ItemStack next = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta itemMetanext = (SkullMeta) next.getItemMeta();
        itemMetanext.setDisplayName("§6Next");
        ArrayList<String> lorenext = new ArrayList<>();
        lorenext.add("§8-------------");
        lorenext.add("§4Switch to the next");
        lorenext.add("§4Comming version 2.4!");
        itemMetanext.setLore(lorenext);
        itemMetanext.setOwner("MHF_ArrowRight");
        next.setItemMeta(itemMetanext);
        next.setAmount(1);
        inventory.setItem(44, next);

 */

        player.openInventory(inventory);
    }
}