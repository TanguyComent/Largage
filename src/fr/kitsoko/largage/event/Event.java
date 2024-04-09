package fr.kitsoko.largage.event;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Event {

	public static void largage(Location loc) {
		Chest chest = (Chest) loc.getBlock().getState();
		Inventory contain =  chest.getInventory();
		Random random =  new Random();
		
		for(int i=0; i<27; i++) {
			int lucky = random.nextInt(99);
			if(beetween(0, 4, lucky)) {
				contain.setItem(i, armure(random.nextInt(3)));
			}else if(beetween(5, 15, lucky)) {
				contain.setItem(i, new ItemStack(Material.OBSIDIAN, 16));
			}else if(beetween(16, 30, lucky)) {
				contain.setItem(i, new ItemStack(Material.ENDER_PEARL, 4));
			}else {
				contain.setItem(i, new ItemStack(Material.AIR));
			}
		}
	}
	
	public static ItemStack armure(int random) {
		ItemStack it = null;
		if(random == 0) {
			it = new ItemStack(Material.DIAMOND_HELMET);
		}
		if(random == 1) {
			it = new ItemStack(Material.DIAMOND_CHESTPLATE);
		}
		if(random == 2) {
			it = new ItemStack(Material.DIAMOND_LEGGINGS);
		}
		if(random == 3) {
			it = new ItemStack(Material.DIAMOND_BOOTS);
		}
		
		ItemMeta meta = it.getItemMeta();
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.setDisplayName("§4[§6Largage§4]");
		it.setItemMeta(meta);
		
		return it;
	}
	
	public static boolean beetween(int min, int max, int comp) {
		if(comp >= min && comp <= max) {
			return true;
		}
		return false;
	}
	
}
