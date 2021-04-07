package io.tomoto.carr.gui.page;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

/**
 * <p>
 * 箱子菜单
 * </p>
 *
 * @version 1.0
 * @author Tomoto
 * @since 1.0 2021/4/3 11:45
 */
public abstract class AbstractInventoryGui implements InventoryHolder {
    protected final Inventory inventory;

    /**
     * 创建箱子菜单
     *
     * @param inventoryName 菜单名
     */
    protected AbstractInventoryGui(String inventoryName) {
        this.inventory = Bukkit.createInventory(this, getRows() * 9, Component.text(inventoryName));
    }

    @Override
    public @NotNull Inventory getInventory() {
        return inventory;
    }

    /**
     * @return 菜单格子层数
     */
    protected abstract Integer getRows();
}
