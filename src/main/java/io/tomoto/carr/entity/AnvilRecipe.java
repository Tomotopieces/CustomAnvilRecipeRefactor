package io.tomoto.carr.entity;

import lombok.*;
import org.bukkit.inventory.ItemStack;

/**
 * <p>
 * 铁砧配方
 * </p>
 *
 * @author Tomoto
 * @version 1.0
 * @since 1.0 2021/4/3 11:52
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
