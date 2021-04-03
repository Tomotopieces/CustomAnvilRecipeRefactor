package io.tomoto.carr.command.registrar;

import io.tomoto.carr.command.completer.AnvilCommandCompleter;
import io.tomoto.carr.command.executor.AnvilCommandExecutor;
import io.tomoto.carr.command.executor.IzzelCommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.function.Consumer;

import static io.tomoto.carr.util.Constant.COMMAND_ANVIL;
import static io.tomoto.carr.util.Constant.COMMAND_IZZEL;

/**
 * 指令监听类
 * <p>
 * Created time: 2021/4/3 11:49
 *
 * @author Tomoto
 */
public class CommandExecutorRegistrar implements Consumer<JavaPlugin> {

    @Override
    public void accept(JavaPlugin plugin) {
        // 监听器
        plugin.getCommand(COMMAND_IZZEL).setExecutor(new IzzelCommandExecutor());
        plugin.getCommand(COMMAND_ANVIL).setExecutor(new AnvilCommandExecutor());

        // 自动补全
        plugin.getCommand(COMMAND_ANVIL).setTabCompleter(new AnvilCommandCompleter());
    }

}
