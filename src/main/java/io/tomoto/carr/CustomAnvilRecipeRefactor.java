package io.tomoto.carr;

import io.tomoto.carr.command.listener.CommandListener;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * 自定义铁砧配方插件 主类
 */
public final class CustomAnvilRecipeRefactor extends JavaPlugin {

    @Override
    public void onEnable() {
        // 注册指令监听
        new CommandListener().accept(this);

        // 发送信息至后台
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[CARR] CustomAnvilRecipeRefactor loaded.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
