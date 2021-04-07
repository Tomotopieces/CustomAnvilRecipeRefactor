package io.tomoto.carr.gui.button;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * <p>
 * 箱子菜单 按钮
 * </p>
 * <p>
 * 使用 InventoryGuiButtonBuilder 来创建按钮
 * </p>
 *
 * @author Tomoto
 * @version 1.0
 * @see io.tomoto.carr.util.InventoryGuiButtonBuilder
 * @since 1.0 2021/4/7 15:09
 */
public class InventoryGuiButton extends ItemStack {
    public InventoryGuiButton() {
        super(Material.GRASS_BLOCK);
    }
}
