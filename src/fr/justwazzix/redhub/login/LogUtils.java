package fr.justwazzix.redhub.login;

import java.io.File;

import org.bukkit.entity.Player;

public class LogUtils {

	public static boolean isRegister(Player player) {
		File user = new File("plugins/MyHub/logins/" + player.getName() + ".yml");
		if (!(user.exists())) {
			return false;
		} else {
			return true;
		}

	}

}
