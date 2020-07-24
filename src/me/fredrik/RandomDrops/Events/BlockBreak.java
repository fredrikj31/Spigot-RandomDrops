package me.fredrik.RandomDrops.Events;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BlockBreak implements Listener {

	private Random randomGenerator = new Random();
	
	@EventHandler
	public void onBreak(BlockBreakEvent event) {
		event.setDropItems(false);
			
		ItemStack dropItem = new ItemStack(Material.values()[randomGenerator.nextInt(Material.values().length) + 1]);
		
		event.getPlayer().getWorld().dropItem(event.getBlock().getLocation().add(0, 0.1, 0), dropItem);
	}
	
}
