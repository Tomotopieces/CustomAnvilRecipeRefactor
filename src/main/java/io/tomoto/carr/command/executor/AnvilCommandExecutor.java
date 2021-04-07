package io.tomoto.carr.command.executor;

import io.tomoto.carr.gui.page.AbstractInventoryGui;
import io.tomoto.carr.gui.page.impl.AnvilMainMenuUI;
import io.tomoto.carr.gui.page.impl.RecipeCreationUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static io.tomoto.carr.util.Constant.MESSAGE_NOT_USER;
import static io.tomoto.carr.util.Constant.MESSAGE_TOO_MANY_ARGUMENTS;

/**
 * <p>
 * 铁砧指令处理器
 * </p>
 *
 * @author Tomoto
 * @version 1.0
 * @since 1.0 2021/4/3 11:44
 */
public class AnvilCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) { // 非玩家
            sender.sendMessage(MESSAGE_NOT_USER);
            return false;
        } else if (args.length > 1) { // 参数过多
            sender.sendMessage(MESSAGE_TOO_MANY_ARGUMENTS);
            return false;
        }

        AbstractInventoryGui ui;
        switch (args.length) {
            case 0:
                ui = new AnvilMainMenuUI();
                break;
            case 1:
                ui = new RecipeCreationUI();
                break;
            default:
                return false;
        }

        openUI((Player) sender, ui);

        return true;
    }

    public void openUI(Player player, AbstractInventoryGui ui) {
        player.closeInventory();
        player.openInventory(ui.getInventory());
    }

}
