package io.tomoto.carr.event.listener.impl;

import io.tomoto.carr.event.listener.UIClickEvent;
import io.tomoto.carr.gui.page.impl.AnvilMainMenuUI;
import io.tomoto.carr.gui.page.impl.RecipeCreationUI;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import static io.tomoto.carr.gui.page.impl.RecipeCreationUI.*;
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
public class RecipeCreationUIClickEvent implements UIClickEvent {

    @Override
    public boolean isEventMatch(InventoryClickEvent event) {
        return event.getInventory().getHolder() instanceof RecipeCreationUI &&
                event.getRawSlot() < ROWS * 9;
    }

    @Override
    public void buttonMatch(InventoryClickEvent event) {
        switch (event.getRawSlot()) {
            case SLOT_LEFT_ITEM:
            case SLOT_RIGHT_ITEM:
            case SLOT_RESULT_ITEM:
                setItem(event);
                break;
            case SLOT_REQUIRED_LEVEL:
                changeRequiredLevel(event);
                break;
            case SLOT_SAVE_BUTTON:
                saveRecipe(event);
                break;
            case SLOT_MAIN_MENU:
                backToMainMenu(event);
                break;
            default: // 非UI界面内的槽位
                event.setCancelled(true);
                break;
        }
    }

    /**
     * 物品放置
     *
     * @param event 新建配方界面 背包点击事件
     */
    public void setItem(InventoryClickEvent event) {
        ItemStack cursorItem = event.getCursor();
        if (!cursorItem.getType().equals(Material.AIR)) {
            event.getInventory().setItem(event.getSlot(), cursorItem);
            event.setCurrentItem(new ItemStack(Material.AIR));
        } else {
            event.setCancelled(true);
        }
    }

    /**
     * 修改所需经验
     *
     * @param event 新建配方界面 背包点击事件
     */
    public void changeRequiredLevel(InventoryClickEvent event) {
        HumanEntity player = event.getWhoClicked();
        player.closeInventory();
        player.sendMessage(PLUGIN_PREFIX + " 所需经验修改功能未完成");
    }


    /**
     * 保存配方
     *
     * @param event 新建配方界面 背包点击事件
     */
    public void saveRecipe(InventoryClickEvent event) {
        HumanEntity player = event.getWhoClicked();
        player.closeInventory();
        player.sendMessage(PLUGIN_PREFIX + " 配方保存功能未完成");
    }

    /**
     * 返回主菜单界面
     *
     * @param event 新建配方界面 背包点击事件
     */
    public void backToMainMenu(InventoryClickEvent event) {
        HumanEntity player = event.getWhoClicked();
        player.closeInventory();
        player.openInventory(new AnvilMainMenuUI().getInventory());
    }
}
