package io.tomoto.carr.gui.page.impl;

import io.tomoto.carr.gui.page.AbstractInventoryGui;
import org.bukkit.ChatColor;

import static io.tomoto.carr.util.Constant.PLUGIN_PREFIX;
import static io.tomoto.carr.util.PrefabButton.*;

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

    public RecipeCreationUI() {
        super(ChatColor.BLACK + PLUGIN_PREFIX + " Create recipe");

        for (int i = 0; i < this.inventory.getSize(); i++) {
            this.inventory.setItem(i, BUTTON_NOTHING);
        }
        this.inventory.setItem(0, BUTTON_LEFT_ITEM_HINT);
        this.inventory.setItem(2, BUTTON_RIGHT_ITEM_HINT);
        this.inventory.setItem(4, BUTTON_REQUIRED_LEVEL);
        this.inventory.setItem(6, BUTTON_RESULT_ITEM_HINT);
        this.inventory.setItem(8, BUTTON_SAVE_RECIPE);
    }

    @Override
    protected Integer getRows() {
        return 1;
    }
}
