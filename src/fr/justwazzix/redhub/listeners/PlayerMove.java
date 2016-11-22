package fr.justwazzix.redhub.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import fr.justwazzix.redhub.Core;
import fr.justwazzix.redhub.login.LogUtils;

public class PlayerMove implements Listener {
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event) {
		Player player = event.getPlayer();
		if (Core.getInstance().unloggedPlayer.contains(player)) {
			if (LogUtils.isRegister(player)) {
				player.sendMessage("§7[§6RedBlock§7] §r/login [motdepasse]");
			} else
				player.sendMessage("§7[§6Redblock§7] §r/register [motdepasse] [motdepasse]");
			event.setTo(event.getFrom());
		}
	}
	
}
