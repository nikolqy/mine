package nikolay.mine;

import net.minecraft.server.v1_16_R3.Tag;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;
import nikolay.mine.PlayerBPS;

public class main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);

    }

    @Override
    public void onDisable() {

    }



        @EventHandler
        public void onBlockBreak(BlockBreakEvent event) {
            Integer orig = 0;
            Player p = event.getPlayer();
            String name = p.getDisplayName();
//            Bukkit.broadcastMessage(net.md_5.bungee.api.ChatColor.of("#5578a3") + "§l1v1§r§lDuels§7§l» §r§lDuel starting in §a§l10 §r§lseconds!" + name);

//            if (event.getBlock().getType() == Material.STONE) {
//            Player p = event.getPlayer();
//            String uuid = p.getUniqueId()
//
                PlayerBPS myObj = new PlayerBPS();
                myObj.setPlayerName(name);
                myObj.setCount(orig++);
                Integer now = myObj.getCount();

            Bukkit.broadcastMessage(myObj.getPlayerName());
            if (now == 4) {
                Bukkit.broadcastMessage("its above 4!");
            }

            }

//    public void onBreak(BlockBreakEvent e) { //Block Break Event
//        Player p = e.getPlayer(); //Getting the player
//        if(e.getBlock().getType() == Material.STONE) { //Checking if the player doesn't have a pickaxe in hand
//            p.giveExp(123); //Cancelling the event so they can't break blocks.\\
//            e.setCancelled(true);
//        }
//    }
        }