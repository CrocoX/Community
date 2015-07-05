package de.janhektor.community.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

import de.janhektor.community.utils.Validate;

public abstract class Argument<T extends Plugin> {
	
	private final T plugin;
	
	public Argument(T plugin) {
		Validate.notNull(plugin, "Plugin cannot be null!");
		this.plugin = plugin;
	}
	
	public abstract String getSyntax();
	
	public abstract String getPermission();
	
	public abstract boolean isOnlyForPlayer();
	
	public abstract boolean execute(CommandSender sender, Command cmd, String label, String[] args);
	
	protected final T getPlugin() {
		return this.plugin;
	}
}
