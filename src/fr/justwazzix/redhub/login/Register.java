package fr.justwazzix.redhub;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.justwazzix.redhub.login.LogUtils;

public class Register implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (LogUtils.isRegister(player)) {
				//erreur
			} else {
				//register
			}
		}
		return false;
	}

}