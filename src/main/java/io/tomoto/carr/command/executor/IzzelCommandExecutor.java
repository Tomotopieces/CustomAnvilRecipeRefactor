package io.tomoto.carr.command.executor;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

/**
 * <p>
 * 测试指令, 发送消息 IzzelAliz!
 * </p>
 *
 * @author Tomoto
 * @version 1.0
 * @since 1.0 2021/4/3 14:16
 */
public class IzzelCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        sender.sendMessage(ChatColor.AQUA + "IzzelAliz!");
        return true;
    }

}
