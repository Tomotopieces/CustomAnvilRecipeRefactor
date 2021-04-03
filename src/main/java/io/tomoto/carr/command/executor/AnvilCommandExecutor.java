package io.tomoto.carr.command.executor;

import io.tomoto.carr.gui.AnvilMenu;
import io.tomoto.carr.gui.InventoryGui;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static io.tomoto.carr.util.Constant.*;

/**
 * 铁砧指令处理器
 * <p>
 * Created time: 2021/4/3 11:44
 *
 * @author Tomoto
 */
public class AnvilCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) { // 非玩家
            sender.sendMessage(MESSAGE_NOT_USER);
            return false;
        } else if (args.length > 0) { // 参数过多
            sender.sendMessage(MESSAGE_TOO_MANY_ARGUMENTS);
            return false;
        }

        InventoryGui inv = new AnvilMenu();
        ((Player) sender).openInventory(inv.getInventory());

        return true;
    }

}
