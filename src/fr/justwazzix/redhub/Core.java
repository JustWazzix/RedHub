package fr.justwazzix.redhub;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import fr.justwazzix.redhub.listeners.ListenerManager;
import fr.justwazzix.redhub.login.Login;

public class Core extends JavaPlugin{
	
	public static Core instance;
	
	public static Core getInstance() {
		return instance;
	}
	
	public ArrayList<Player> unloggedPlayer = new ArrayList<Player>();
	
	@Override
	public void onEnable() {
		super.onEnable();
		instance = this;
		ListenerManager.registerEvents();
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
	}
	
	private void registerCmd() {
		getCommand("login").setExecutor(new Login());
	}
	
}
