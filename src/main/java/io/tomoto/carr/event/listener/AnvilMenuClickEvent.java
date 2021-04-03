package io.tomoto.carr.event.listener;

import io.tomoto.carr.gui.AnvilMenu;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * Description
 * <p>
 * Created time: 2021/4/3 15:43
 *
 * @author Tomoto
 */
public class AnvilMenuClickEvent implements Listener {
    
    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!(event.getInventory().getHolder() instanceof AnvilMenu)) {
            event.getWhoClicked().sendMessage("not a anvil menu click.");
        } else {
            event.getWhoClicked().sendMessage("anvil menu click");
        }
    }
}
