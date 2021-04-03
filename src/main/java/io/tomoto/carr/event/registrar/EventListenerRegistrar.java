package io.tomoto.carr.event.registrar;

import io.tomoto.carr.event.listener.AnvilMenuClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.function.Consumer;

/**
 * Description
 * <p>
 * Created time: 2021/4/3 15:57
 *
 * @author Tomoto
 */
public class EventListenerRegistrar implements Consumer<JavaPlugin> {

    @Override
    public void accept(JavaPlugin plugin) {
        Bukkit.getPluginManager().registerEvents(new AnvilMenuClickEvent(), plugin);
    }
}
