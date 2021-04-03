package io.tomoto.carr.gui;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static io.tomoto.carr.util.Constant.PLUGIN_PREFIX;

/**
 * 插件主菜单GUI
 * <p>
 * Created time: 2021/4/3 15:28
 *
 * @author Tomoto
 */
public class AnvilMenu extends InventoryGui {
    private static final Integer SIZE = 9;

    public AnvilMenu() {
        super(SIZE, PLUGIN_PREFIX);
        this.inventory.setItem(0, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
    }
}
