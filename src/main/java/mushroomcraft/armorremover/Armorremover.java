package mushroomcraft.armorremover;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Armorremover extends JavaPlugin {

    @Override
    public void onEnable() {
       System.out.println("[ArmorRemover] has been enabled.");
       listeners();
    }

    private void listeners() {
        PluginManager sm = getServer().getPluginManager();
        sm.registerEvents(new removeOnJoin(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("[ArmorRemover] has been disabled.");
    }
}
