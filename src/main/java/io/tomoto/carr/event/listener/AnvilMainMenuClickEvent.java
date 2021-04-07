package io.tomoto.carr.event.listener;

import io.tomoto.carr.gui.page.impl.AnvilMainMenuUI;
import io.tomoto.carr.gui.page.impl.RecipeCreationUI;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import static io.tomoto.carr.util.Constant.PLUGIN_PREFIX;

/**
 * <p>
 * 插件主菜单界面 点击事件
 * </p>
 *
 * @author Tomoto
 * @version 1.0
 * @since 1.0 2021/4/3 15:43
 */
public class AnvilMainMenuClickEvent implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!(event.getInventory().getHolder() instanceof AnvilMainMenuUI)) { // 界面判断
            return;
        }

        HumanEntity player = event.getWhoClicked();
        switch (event.getSlot()) {
            case 0:
                player.closeInventory();
                player.openInventory(new RecipeCreationUI().getInventory());
                break;
            case 2:
                player.sendMessage(PLUGIN_PREFIX + " 配方列表界面未完成");
                player.closeInventory();
                break;
            case 8:
                player.closeInventory();
                break;
            default:
                break;
        }
    }
}
