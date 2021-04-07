package io.tomoto.carr.event.listener;

import io.tomoto.carr.gui.page.impl.RecipeCreationUI;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import static io.tomoto.carr.util.Constant.PLUGIN_PREFIX;

/**
 * <p>
 * 新建配方界面 点击事件
 * </p>
 *
 * @author Tomoto
 * @version 1.0
 * @since 1.0 2021/4/7 19:44
 */
public class RecipeCreationUIClickEvent implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!(event.getInventory().getHolder() instanceof RecipeCreationUI)) { // 界面判断
            return;
        }

        if (event.getRawSlot() > 8) {
            return;
        }

        HumanEntity player = event.getWhoClicked();
        Inventory inventory = event.getInventory();
        player.sendMessage(PLUGIN_PREFIX + event.getSlot());
        switch (event.getRawSlot()) {
            case 0:
            case 2:
            case 6:
                ItemStack cursorItem = event.getCursor();
                if (!cursorItem.getType().equals(Material.AIR)) {
                    inventory.setItem(event.getSlot(), cursorItem);
                    event.setCurrentItem(new ItemStack(Material.AIR));
                } else {
                    event.setCancelled(true);
                }
                break;
            case 4:
                player.closeInventory();
                player.sendMessage(PLUGIN_PREFIX + " 所需经验修改功能未完成");
                break;
            case 8:
                player.closeInventory();
                player.sendMessage(PLUGIN_PREFIX + " 配方保存功能未完成");
                break;
            default:
                event.setCancelled(true);
                break;
        }
    }
}
