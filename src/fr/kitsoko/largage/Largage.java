package fr.kitsoko.largage;

import org.bukkit.plugin.java.JavaPlugin;

import fr.kitsoko.largage.commands.Commands;

public class Largage extends JavaPlugin{
	
	@Override
	public void onEnable() {
		getCommand("start").setExecutor(new Commands(this));
		System.out.println("Le plugin demare");
	}
}
