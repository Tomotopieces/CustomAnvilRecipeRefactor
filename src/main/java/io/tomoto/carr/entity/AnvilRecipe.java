package io.tomoto.carr.entity;

import lombok.*;
import org.bukkit.inventory.ItemStack;

/**
 * 铁砧配方
 * <p>
 * Created time: 2021/4/3 11:52
 *
 * @author Tomoto
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class AnvilRecipe {
    private ItemStack leftItem;
    private ItemStack rightItem;
    private ItemStack resultItem;
    private Integer requiredLevel;
}
