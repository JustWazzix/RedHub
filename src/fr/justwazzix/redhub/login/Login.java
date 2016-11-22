package fr.justwazzix.redhub.login;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.justwazzix.redhub.Core;

public class Login implements CommandExecutor {
	
	Core c;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		c = Core.getInstance();
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("login")) {
				if (args.length != 1) {
					player.sendMessage("§7[§6RedBlock§7] §r/login [motdepasse]");
					return false;
				}
				String mdp = Register.getLoginFile(player).getString("password");
				if (mdp == null) {
					player.sendMessage("§7[§6RedBlock§7] §rVous  n'êtes pas register !");
					return false;
				}
				if (mdp.equals(args[0])) {
					c.unloggedPlayer.remove(player);
					player.sendMessage("§7[§6RedBlock§7] §rVous êtes bien connecté(e) !");
				} else {
					player.sendMessage("§7[§6RedBlock§7] §rMot de passe incorrect !");
				}
			}
		}
		return false;
	}

}
