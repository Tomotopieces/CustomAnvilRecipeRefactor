package io.tomoto.carr.util;

import org.bukkit.ChatColor;

/**
 * <p>
 * 常量类
 * </p>
 *
 * @version 1.0
 * @author Tomoto
 * @since 1.0 2021/4/3 14:13
 */
public class Constant {

    public static final String PLUGIN_PREFIX = "[CARR]";

    public static final String COMMAND_ANVIL = "anvil";
    public static final String COMMAND_IZZEL = "izzel";

    public static final String MESSAGE_NOT_USER = ChatColor.RED + PLUGIN_PREFIX + " Only player can use this Command.";
    public static final String MESSAGE_TOO_MANY_ARGUMENTS = ChatColor.RED + PLUGIN_PREFIX + " Too many arguments.";

    private Constant() {
    }
}
