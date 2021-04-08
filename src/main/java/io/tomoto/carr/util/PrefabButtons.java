package io.tomoto.carr.util;

import io.tomoto.carr.gui.button.InventoryGuiButton;
import org.bukkit.ChatColor;
import org.bukkit.Material;

/**
 * <p>
 * 预制菜单按钮
 * </p>
 *
 * @author Tomoto
 * @version 1.0
 * @since 1.0 2021/4/7 16:42
 */
public class PrefabButtons {

    /**
     * 占位物品
     */
    public static final InventoryGuiButton BUTTON_NOTHING = new InventoryGuiButtonBuilder()
            .setMaterial(Material.BLACK_STAINED_GLASS_PANE)
            .setName("").toButton();

    /**
     * 新建配方界面按钮
     */
    public static final InventoryGuiButton BUTTON_CREATION_UI = new InventoryGuiButtonBuilder()
            .setMaterial(Material.ANVIL)
            .setName(ChatColor.YELLOW + "" + ChatColor.BOLD + "新建配方")
            .addLore(ChatColor.WHITE + "点击进入新建配方界面").toButton();

    /**
     * 配方列表按钮
     */
    public static final InventoryGuiButton BUTTON_RECIPE_LIST_UI = new InventoryGuiButtonBuilder()
            .setMaterial(Material.PAPER)
            .setName(ChatColor.YELLOW + "" + ChatColor.BOLD + "配方列表")
            .addLore(ChatColor.WHITE + "点击进入配方列表界面").toButton();

    /**
     * 退出按钮
     */
    public static final InventoryGuiButton BUTTON_EXIT = new InventoryGuiButtonBuilder()
            .setMaterial(Material.BARRIER)
            .setName(ChatColor.RED + "" + ChatColor.BOLD + "退出").toButton();

    /**
     * 左物品提示占位物品
     */
    public static final InventoryGuiButton BUTTON_LEFT_ITEM_HINT = new InventoryGuiButtonBuilder()
            .setMaterial(Material.LIGHT_GRAY_STAINED_GLASS_PANE)
            .setName(ChatColor.AQUA + "" + ChatColor.BOLD + "左物品")
            .addLore(ChatColor.WHITE + "在这里放置配方所需的左边物品").toButton();

    /**
     * 右物品提示占位物品
     */
    public static final InventoryGuiButton BUTTON_RIGHT_ITEM_HINT = new InventoryGuiButtonBuilder()
            .setMaterial(Material.LIGHT_GRAY_STAINED_GLASS_PANE)
            .setName(ChatColor.AQUA + "" + ChatColor.BOLD + "右物品")
            .addLore(ChatColor.WHITE + "在这里放置配方所需的右边物品").toButton();

    /**
     * 所需经验按钮
     */
    public static final InventoryGuiButton BUTTON_REQUIRED_LEVEL = new InventoryGuiButtonBuilder()
            .setMaterial(Material.EXPERIENCE_BOTTLE)
            .setName(ChatColor.YELLOW + "" + ChatColor.BOLD + "所需等级")
            .addLore(ChatColor.WHITE + "左键增加，右键减少")
            .addLore(ChatColor.WHITE + "按住shift，一次改变10级").toButton();

    /**
     * 结果物品提示占位物品
     */
    public static final InventoryGuiButton BUTTON_RESULT_ITEM_HINT = new InventoryGuiButtonBuilder()
            .setMaterial(Material.LIGHT_GRAY_STAINED_GLASS_PANE)
            .setName(ChatColor.AQUA + "" + ChatColor.BOLD + "结果物品")
            .addLore(ChatColor.WHITE + "在这里放置配方的结果物品").toButton();

    /**
     * 保存配方按钮
     */
    public static final InventoryGuiButton BUTTON_SAVE_RECIPE = new InventoryGuiButtonBuilder()
            .setMaterial(Material.MAP)
            .setName(ChatColor.GOLD + "" + ChatColor.BOLD + "保存配方").toButton();

    /**
     * 返回主菜单按钮
     */
    public static final InventoryGuiButton BUTTON_MAIN_MENU = new InventoryGuiButtonBuilder()
            .setMaterial(Material.BOOK)
            .setName(ChatColor.GREEN + "" + ChatColor.BOLD + "返回主菜单界面")
            .addLore(ChatColor.WHITE + "点击返回主菜单界面").toButton();

    private PrefabButtons() {
    }
}
