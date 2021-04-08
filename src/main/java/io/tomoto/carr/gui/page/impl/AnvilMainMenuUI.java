package io.tomoto.carr.gui.page.impl;

import io.tomoto.carr.gui.page.AbstractInventoryGui;
import org.bukkit.ChatColor;

import static io.tomoto.carr.util.Constant.PLUGIN_PREFIX;
import static io.tomoto.carr.util.PrefabButtons.*;

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
    /**
     * 界面行数
     */
    public static final int ROWS = 1;

    /**
     * 槽位  新建配方按钮
     */
    public static final int SLOT_CREATION_UI = 0;
    /**
     * 槽位  配方列表按钮
     */
    public static final int SLOT_RECIPE_LIST_UI = 2;
    /**
     * 槽位  退出按钮
     */
    public static final int SLOT_EXIT = 8;

    public static final String UI_NAME = "Custom Anvil Recipe";

    public AnvilMainMenuUI() {
        super(ChatColor.BLACK + PLUGIN_PREFIX + UI_NAME);
        setButtons();
    }

    public void setButtons() {
        this.inventory.setItem(SLOT_CREATION_UI, BUTTON_CREATION_UI);
        this.inventory.setItem(SLOT_RECIPE_LIST_UI, BUTTON_RECIPE_LIST_UI);
        this.inventory.setItem(SLOT_EXIT, BUTTON_EXIT);
    }

    @Override
    public Integer getRows() {
        return ROWS;
    }
}
