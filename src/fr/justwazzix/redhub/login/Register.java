package fr.justwazzix.redhub.login;

import java.io.File;
import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class Register implements CommandExecutor {

	private static YamlConfiguration yc;
	private static File user;
	private File dossier;

	public Register() {
		dossier = new File("plugins/MyHub/logins");
		dossier.mkdirs();
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("register")) {
				if (args.length != 2) {
					player.sendMessage("§7[§6Redblock§7] §r/register [motdepasse] [motdepasse]");
					return false;
				}
				user = new File("plugins/MyHub/logins/" + player.getName() + ".yml");
				if (!LogUtils.isRegister(player)) {
					if (args[0].equals(args[1])) {
						try {
							user.createNewFile();
							yc = YamlConfiguration.loadConfiguration(user);
							yc.createSection("password");
							yc.set("password", args[0]);
							yc.save(user);
						} catch (IOException e) {
							e.printStackTrace();
						}
						player.sendMessage("§7[§6Redblock§7] §rVous êtes enregistré(e), maintenant connectez vous !");
						return true;
					} else {
						player.sendMessage("§7[§6Redblock§7] §rLes deux mots de passe ne correspondent pas !");
						return false;
					}
				}
			} else {
				player.sendMessage("§7[§6Redblock§7] §rVous êtes déjà enregister !");
				return false;
			}
		}
		return false;
	}

}
