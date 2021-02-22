// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.commands;

import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB1;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Give {

    //TODO 1.5 oder 2.0

    public void giveCommand(Player player){
        ItemStack item = new ItemStack(Material.CHEST);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(DefultValue_WB1.ChestName);
        ArrayList<String> lore = new ArrayList<>();
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        item.setAmount(1);
        NBTItem nbti = new NBTItem(item);
        nbti.setBoolean("loot_chest_1", true);
        player.getInventory().addItem(nbti.getItem());
    }

}
