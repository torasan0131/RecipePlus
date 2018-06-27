package disaapsesv.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class TestRecipe {

	public static Player p;
	public static Inventory inv;

	public static void testrecipegui(Player p) {
		ItemStack diamond = new ItemStack(Material.DIAMOND);
		ItemStack gold = new ItemStack(Material.GOLD_INGOT);
		ItemStack lava = new ItemStack(Material.LAVA_BUCKET);
		inv.setItem(1, diamond);
		inv.setItem(2, gold);
		inv.setItem(3, diamond);
		inv.setItem(4, gold);
		inv.setItem(5, lava);
		inv.setItem(6, gold);
		inv.setItem(7, diamond);
		inv.setItem(8, gold);
		inv.setItem(9, diamond);
		inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, "TestRecipe");
		p.openInventory(inv);

	}


}
