package io.tomoto.carr.command.completer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 铁砧指令自动补全
 * </p>
 *
 * @author Tomoto
 * @version 1.0
 * @since 1.0 2021/4/3 14:10
 */
public class AnvilCommandCompleter implements TabCompleter {

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args) {
        List<String> list = new ArrayList<>();
        if(args.length == 1){
            list.add("menu");
            list.add("create");
            list.add("list");
            list.add("help");
            list.add("?");
        }
        return list;
    }
}
