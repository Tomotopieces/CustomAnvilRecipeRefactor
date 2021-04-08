package io.tomoto.carr.gui.page.impl;

import io.tomoto.carr.gui.page.AbstractInventoryGui;
import org.bukkit.ChatColor;

import static io.tomoto.carr.util.Constant.PLUGIN_PREFIX;
import static io.tomoto.carr.util.PrefabButtons.*;

/**
 * <p>
 * 新建配方界面
 * </p>
 *
 * @author Tomoto
 * @version 1.0
 * @since 1.0 2021/4/7 17:09
 */
public class RecipeCreationUI extends AbstractInventoryGui {
    /**
     * 界面行数
     */
    public static final int ROWS = 1;

    /**
     * 槽位  左物品
     */
    public static final int SLOT_LEFT_ITEM = 0;
    /**
     * 槽位 右物品
     */
    public static final int SLOT_RIGHT_ITEM = 2;
    /**
     * 槽位 所需经验按钮
     */
    public static final int SLOT_REQUIRED_LEVEL = 3;
    /**
     * 槽位 结果物品
     */
    public static final int SLOT_RESULT_ITEM = 4;
    /**
     * 槽位 保存物品按钮
     */
    public static final int SLOT_SAVE_BUTTON = 6;
    /**
     * 槽位 返回菜单按钮
     */
    public static final int SLOT_MAIN_MENU = 8;

    /**
     * 界面名称
     */
    public static final String UI_NAME = "新建配方";

    public RecipeCreationUI() {
        super(ChatColor.BLACK + PLUGIN_PREFIX + UI_NAME);
        fillWithNothing();
        setButtons();
    }

    /**
     * 填充占位物品
     */
    public void fillWithNothing() {
        for (int i = 0; i < this.inventory.getSize(); i++) {
            this.inventory.setItem(i, BUTTON_NOTHING);
        }
    }

    /**
     * 放置特殊按钮
     */
    public void setButtons() {
        this.inventory.setItem(SLOT_LEFT_ITEM, BUTTON_LEFT_ITEM_HINT);
        this.inventory.setItem(SLOT_RIGHT_ITEM, BUTTON_RIGHT_ITEM_HINT);
        this.inventory.setItem(SLOT_REQUIRED_LEVEL, BUTTON_REQUIRED_LEVEL);
        this.inventory.setItem(SLOT_RESULT_ITEM, BUTTON_RESULT_ITEM_HINT);
        this.inventory.setItem(SLOT_SAVE_BUTTON, BUTTON_SAVE_RECIPE);
        this.inventory.setItem(SLOT_MAIN_MENU, BUTTON_MAIN_MENU);
    }

    @Override
    public Integer getRows() {
        return ROWS;
    }
}
