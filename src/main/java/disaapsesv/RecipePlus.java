package disaapsesv;

import org.bukkit.plugin.java.JavaPlugin;

public class RecipePlus extends JavaPlugin {

	@Override
	public void onDisable() {
		getLogger().info("Disabled RecipePlus");
		super.onDisable();
	}

	@Override
	public void onEnable() {
		getLogger().info("Enabled RecipePlus");
		getCommand("recipes").setExecutor(new Commands ());
		super.onEnable();
	}


}
