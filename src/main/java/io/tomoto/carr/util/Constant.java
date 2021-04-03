package io.tomoto.carr.util;

import org.bukkit.ChatColor;

/**
 * 常量类
 * <p>
 * Created time: 2021/4/3 14:13
 *
 * @author Tomoto
 */
public class Constant {
    public static final String PLUGIN_PREFIX = ChatColor.BLACK + "[CARR]";

    public static final String COMMAND_ANVIL = "anvil";
    public static final String COMMAND_IZZEL = "izzel";

    public static final String MESSAGE_NOT_USER = ChatColor.RED + "[CARR] Only player can use this Command.";
    public static final String MESSAGE_TOO_MANY_ARGUMENTS = ChatColor.RED + "[CARR] Too many arguments.";

    private Constant() {
    }
}
