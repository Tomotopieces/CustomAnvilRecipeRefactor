package io.tomoto.carr.command.executor;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

/**
 * 测试指令
 * <p>
 * 发送消息 IzzelAliz!
 * <p>
 * Created time: 2021/4/3 14:16
 *
 * @author Tomoto
 */
public class IzzelCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        sender.sendMessage(ChatColor.AQUA + "IzzelAliz!");
        return true;
    }

}
