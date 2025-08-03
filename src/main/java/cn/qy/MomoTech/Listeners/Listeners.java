package cn.qy.MomoTech.Listeners;

import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.utils.Maths;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import org.bukkit.*;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public final class Listeners implements Listener {

    @EventHandler(priority = EventPriority.MONITOR,ignoreCancelled = true)
    public void blockBreakEvent(BlockBreakEvent e) {
        Player p = e.getPlayer();
        if (p.getInventory().getItemInMainHand().getType() != Material.WOODEN_PICKAXE) return ;
        int i = Maths.GetRandom(100);
        if (i <= 8) {
            World w = e.getBlock().getWorld();
            Location l = e.getBlock().getLocation();
            w.dropItem(l, MomotechItem.nullItem.clone());
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST,ignoreCancelled = true)
    public void entityDamageByEntityEvent(EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof Player){
            ItemStack helmet=((Player) e.getEntity()).getInventory().getHelmet();
            if(helmet!=null&&!helmet.getType().isAir()){
                if(helmet.getType()==Material.TURTLE_HELMET){
                    SlimefunItem item=SlimefunItem.getByItem(helmet);

                    if (item!=null&&"MOMOTECH_WEIRD_ARMOR".equals(item.getId())) {
                        if(item.isDisabled()){
                            ((Player)e.getEntity()).sendMessage(MomoTech.languageManager.getInfo("disabled_item"));
                        }else {
                            e.setDamage(0);
                            e.setCancelled(true);
                        }
                    }
                }
            }
        }
        if (e.getDamager() instanceof Player){
            ItemStack hand=((Player) e.getDamager()).getInventory().getItemInMainHand();
            if(!hand.getType().isAir()){
                SlimefunItem item=SlimefunItem.getByItem(hand);
                if(item!=null){
                    if ( "MOMOTECH_WEIRD_THING".equals(item.getId())) {
                        if (e.getEntity() instanceof Damageable) {
                            if(item.isDisabled()){
                                ((Player)e.getDamager()).sendMessage(MomoTech.languageManager.getInfo("disabled_item"));
                            }else{
                                ((Damageable)e.getEntity()).setHealth(0.0);
                                return;
                            }
                        }
                    }else if("MOMOTECH_INSTAKILL_SWORD".equals(item.getId())) {
                        if(item.isDisabled()){
                            ((Player)e.getDamager()).sendMessage(MomoTech.languageManager.getInfo("disabled_item"));
                        }
                        else{
                            e.setDamage(999999999999.99);
                            e.getEntity().setGlowing(true);
                            e.getEntity().setFreezeTicks(1000);
                            e.getEntity().setFireTicks(1000);
                        }
                    }
                }
            }
        }
    }
}
