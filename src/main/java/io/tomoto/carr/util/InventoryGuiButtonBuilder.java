package io.tomoto.carr.util;

import io.tomoto.carr.gui.button.InventoryGuiButton;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 箱子菜单按钮建造器
 * </p>
 *
 * @author Tomoto
 * @version 1.0
 * @see io.tomoto.carr.gui.button.InventoryGuiButton
 * @since 1.0 2021/4/7 15:09
 */
public class InventoryGuiButtonBuilder {

    private final InventoryGuiButton item = new InventoryGuiButton();
    private final ItemMeta meta = item.getItemMeta();
    private final List<Component> loreList = meta.hasLore() ? meta.lore() : new ArrayList<>();

    /**
     * 设置按钮材质
     *
     * @param material 材质
     * @return 建造器
     */
    public InventoryGuiButtonBuilder setMaterial(Material material) {
        item.setType(material);
        return this;
    }

    /**
     * 设置按钮名称
     *
     * @param name 名称
     * @return 建造器
     */
    public InventoryGuiButtonBuilder setName(String name) {
        meta.displayName(Component.text(name));
        return this;
    }

    /**
     * 添加lore信息
     *
     * @param lore lore信息
     * @return 建造器
     */
    public InventoryGuiButtonBuilder addLore(String lore) {
        loreList.add(Component.text(lore));
        return this;
    }

    /**
     * 创建按钮
     *
     * @return 按钮
     */
    public InventoryGuiButton toButton() {
        meta.lore(loreList);
        item.setItemMeta(meta);
        return item;
    }

}
