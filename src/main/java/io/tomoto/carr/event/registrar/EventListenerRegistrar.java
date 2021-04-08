package io.tomoto.carr.event.registrar;

import io.tomoto.carr.event.listener.impl.AnvilMainMenuUIClickEvent;
import io.tomoto.carr.event.listener.impl.RecipeCreationUIClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.function.Consumer;

/**
 * <p>
 * 事件监听/处理器
 * </p>
 *
 * @author Tomoto
 * @version 1.0
 * @since 1.0 2021/4/3 15:57
 */
public class EventListenerRegistrar implements Consumer<JavaPlugin> {

    @Override
    public void accept(JavaPlugin plugin) {
        Bukkit.getPluginManager().registerEvents(new AnvilMainMenuUIClickEvent(), plugin);
        Bukkit.getPluginManager().registerEvents(new RecipeCreationUIClickEvent(), plugin);
    }
}
