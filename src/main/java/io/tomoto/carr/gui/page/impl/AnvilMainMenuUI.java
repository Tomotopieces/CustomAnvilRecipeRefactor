package io.tomoto.carr.gui.page.impl;

import io.tomoto.carr.gui.page.AbstractInventoryGui;
import org.bukkit.ChatColor;

import static io.tomoto.carr.util.Constant.PLUGIN_PREFIX;
import static io.tomoto.carr.util.PrefabButton.*;

/**
 * <p>
 * 插件主菜单
 * </p>
 *
 * @version 1.0
 * @author Tomoto
 * @since 1.0 2021/4/3 15:28
 */
public class AnvilMainMenuUI extends AbstractInventoryGui {

    public AnvilMainMenuUI() {
        super(ChatColor.BLACK + PLUGIN_PREFIX);

        this.inventory.setItem(0, BUTTON_CREATION_MENU);
        this.inventory.setItem(2, BUTTON_RECIPE_LIST_MENU);
        this.inventory.setItem(8, BUTTON_EXIT);
    }

    @Override
    protected Integer getRows() {
        return 1;
    }
}
