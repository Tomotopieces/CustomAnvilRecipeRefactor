package io.tomoto.carr.command.listener;

import io.tomoto.carr.CustomAnvilRecipeRefactor;
import io.tomoto.carr.command.executor.AnvilCommandExecutor;

import java.util.function.Consumer;

/**
 * 铁砧指令监听类
 * <p>
 * Created time: 2021/4/3 11:49
 *
 * @author Tomoto
 */
public class CommandListener implements Consumer<CustomAnvilRecipeRefactor> {
    @Override
    public void accept(CustomAnvilRecipeRefactor plugin) {
        plugin.getCommand("anvil").setExecutor(new AnvilCommandExecutor());
    }
}
