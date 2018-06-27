package disaapsesv;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import disaapsesv.recipes.TestRecipe;

public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if ( args[0] == "test"){
			Player p = (Player) sender;
			TestRecipe.testrecipegui(p);
			sender.sendMessage("Opened about TestRecipe.");
		}

		else{
			sender.sendMessage("正しくない記述です。");
			return false;
		}
		return false;
	}

}
