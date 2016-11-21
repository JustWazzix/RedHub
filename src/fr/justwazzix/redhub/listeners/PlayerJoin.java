package fr.justwazzix.redhub.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.justwazzix.redhub.Core;
import fr.justwazzix.redhub.login.LogUtils;

public class PlayerJoin implements Listener {
	
	Core c;
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		c = Core.getInstance();
		Player player = event.getPlayer();
		if (LogUtils.isRegister(player)) {
			
		}
	}

}
