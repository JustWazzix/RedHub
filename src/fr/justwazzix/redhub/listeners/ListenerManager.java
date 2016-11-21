package fr.justwazzix.redhub.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;

import fr.justwazzix.redhub.Core;

public class ListenerManager implements Listener{
	
	public static void registerEvents() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PlayerJoin(), Core.getInstance());
	}

}
