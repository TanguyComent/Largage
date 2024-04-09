package fr.kitsoko.largage.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import fr.kitsoko.largage.Largage;
import fr.kitsoko.largage.event.Event;

public class Commands implements CommandExecutor{
	
	Largage main;
	public Commands(Largage main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] arg) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			if(cmd.getName().equalsIgnoreCase("start")) {
				//start event
				Bukkit.broadcastMessage("§4[§6Largage§4] §6: L'event largage commence dans 5 secondes");
				
				new BukkitRunnable() {
					
					@Override
					public void run() {
						Event.largage(new Location(Bukkit.getWorld("world"), -66, 64, 84));
						Event.largage(new Location(Bukkit.getWorld("world"), -67, 65, 84));
						Event.largage(new Location(Bukkit.getWorld("world"), -68, 66, 84));
						Event.largage(new Location(Bukkit.getWorld("world"), -69, 65, 84));
						Event.largage(new Location(Bukkit.getWorld("world"), -70, 64, 84));
						Event.largage(new Location(Bukkit.getWorld("world"), -68, 65, 85));
						Event.largage(new Location(Bukkit.getWorld("world"), -68, 64, 86));
						Event.largage(new Location(Bukkit.getWorld("world"), -68, 65, 83));
						Event.largage(new Location(Bukkit.getWorld("world"), -68, 64, 82));
						Bukkit.broadcastMessage("§4[§6Largage§4] §6: L'event commence");
					}
				}.runTaskLater(main, 20*5);
			}
		}
		return false;
	}

}
