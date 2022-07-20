package theonlynoob.teammanager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class TeamManager extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        Bukkit.getLogger().info(this.getName() + ": addon is enabled successfully!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info(this.getName() + ": addon has shut down!");
    }




}