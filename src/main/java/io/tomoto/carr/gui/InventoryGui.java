package io.tomoto.carr.gui;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

/**
 * 背包GUI
 * <p>
 * Created time: 2021/4/3 11:45
 *
 * @author Tomoto
 */
public class InventoryGui implements InventoryHolder {
    protected final Inventory inventory;

    /**
     * 创建箱子菜单
     *
     * @param inventorySize 菜单尺寸, 9的倍数
     * @param inventoryName 菜单名
     */
    public InventoryGui(Integer inventorySize, String inventoryName) {
        this.inventory = Bukkit.createInventory(this, inventorySize, Component.text(inventoryName));
    }

    @Override
    public @NotNull Inventory getInventory() {
        return inventory;
    }
}
