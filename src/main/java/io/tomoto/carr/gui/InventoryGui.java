package io.tomoto.carr.gui;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

/**
 * 背包GUI
 * <p>
 * Created time: 2021/4/3 11:45
 *
 * @author Tomoto
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryGui implements InventoryHolder {
    private Inventory inventory;
    private Integer inventorySize;
    private String inventoryName;

    /**
     * 创建箱子菜单
     *
     * @param inventorySize 菜单尺寸, 9的倍数
     * @param inventoryName 菜单名
     */
    public InventoryGui(Integer inventorySize, String inventoryName) {
        this.inventorySize = inventorySize;
        this.inventoryName = inventoryName;
        this.inventory = Bukkit.createInventory(null, inventorySize, Component.text(inventoryName));
    }
}
