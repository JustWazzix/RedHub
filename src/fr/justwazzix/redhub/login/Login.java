package fr.justwazzix.redhub.login;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Login implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (LogUtils.isRegister(player)) {
				// check login
			} else {
				// erreur
			}
		}
		return false;
	}

}
