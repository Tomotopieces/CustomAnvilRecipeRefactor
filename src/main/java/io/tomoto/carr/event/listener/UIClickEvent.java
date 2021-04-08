package io.tomoto.carr.event.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * <p>
 * 自定义界面点击事件接口
 * </p>
 * <p>
 * 默认实现了EventHandler, 子类只需要实现触发条件与按钮方法绑定
 * </p>
 *
 * @author Tomoto
 * @version 1.0
 * @since 1.0 2021/4/8 16:43
 */
public interface UIClickEvent extends Listener {
    /**
     * 事件匹配判断
     *
     * @param event 背包点击事件
     * @return 事件是否受理
     */
    boolean isEventMatch(InventoryClickEvent event);

    /**
     * <p>
     * 按钮匹配
     * </p>
     * <p>
     * 匹配并进入按钮点击处理方法
     * </p>
     *
     * @param event 背包点击事件
     */
    void buttonMatch(InventoryClickEvent event);

    /**
     * 基础逻辑, 事件匹配时进行按钮匹配
     *
     * @param event 背包点击事件
     */
    @EventHandler
    default void onClick(InventoryClickEvent event) {
        if (isEventMatch(event)) {
            buttonMatch(event);
        }
    }
}
