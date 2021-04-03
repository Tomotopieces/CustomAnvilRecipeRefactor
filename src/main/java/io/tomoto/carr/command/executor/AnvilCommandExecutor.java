package io.tomoto.carr.command.executor;

import io.tomoto.carr.gui.InventoryGui;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

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
        if (!(sender instanceof Player)) { // not a player
            sender.sendMessage("[CAR2] Only Player can use this Command.");
            return false;
        }

        if (args.length > 0) {
            sender.sendMessage("Too many arguments!");
            return false;
        }

        InventoryGui inv = new InventoryGui(6 * 9, "Test GUI");
        ((Player) sender).openInventory(inv.getInventory());

        return false;
    }
}
