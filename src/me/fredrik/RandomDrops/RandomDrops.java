package me.fredrik.RandomDrops;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import me.fredrik.RandomDrops.Events.BlockBreak;

public class RandomDrops extends JavaPlugin {
	
	// Starting & Ending Events
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "RandomDrops has been Enabled!");
		
		// Register new events
		getServer().getPluginManager().registerEvents(new BlockBreak(), this);
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "RandomDrops has been Disabled!");
	}
}
