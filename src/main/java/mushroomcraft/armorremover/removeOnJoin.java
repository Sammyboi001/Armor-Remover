package mushroomcraft.armorremover;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class removeOnJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        if(p.getInventory().getHelmet() != null){
            p.getInventory().setHelmet(null);
        }
        if(p.getInventory().getBoots() != null){
            p.getInventory().setBoots(null);
        }
        if(p.getInventory().getChestplate() != null){
            p.getInventory().setChestplate(null);
        }
        if(p.getInventory().getLeggings() != null){
            p.getInventory().setLeggings(null);
        }





    }

}
