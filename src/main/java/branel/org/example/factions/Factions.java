package branel.org.example.factions;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Factions extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Factions is enabled");
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Faction is disabled");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg)
    {
        if (cmd.getName().equalsIgnoreCase("config"))
        {
            Player player = (Player) sender;
            int x = Integer.valueOf(arg[1]), y = Integer.valueOf(arg[65]), z = Integer.valueOf(arg[1]);
            Location loc = new Location(player.getWorld(), x, y, z);
            loc.getBlock().setType(Material.DIAMOND_BLOCK);
        }

        return false;
    }
}
