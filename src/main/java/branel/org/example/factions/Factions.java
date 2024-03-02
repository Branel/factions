package branel.org.example.factions;

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
}
