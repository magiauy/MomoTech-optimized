//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.qy.MomoTech.utils;

import cn.qy.MomoTech.Items.Items;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static final String[] compressedMineralID = {
        "NETHERITE", "DIAMOND", "EMERALD",
        "GOLD", "IRON", "QUARTZ",
        "REDSTONE", "LAPIS", "COAL"
    };
    public static final Material[] compressedMineralMaterials = {
        Material.NETHERITE_INGOT, Material.DIAMOND, Material.EMERALD, 
        Material.GOLD_INGOT, Material.IRON_INGOT, Material.QUARTZ,
        Material.REDSTONE, Material.LAPIS_LAZULI, Material.COAL
    };
    public static final String[] fold = {"1", "2", "3"};

    public static boolean checkOutput(BlockMenu inv, int[] output) {
        for (int i : output) {
            if (inv.getInventory().getItem(i) == null) return false;
        }
        return true;
    }

    public static List<String> getLore(ItemMeta meta) {
        List<String> lore = meta.getLore();
        return (lore == null ? new ArrayList<>() : lore);
    }

    public static boolean checkCombinator(ItemStack it) {
        if (SlimefunUtils.isItemSimilar(it, Items.MOMOTECH_SYMBOL_ADDITION, false, false)) return false;
        if (SlimefunUtils.isItemSimilar(it, Items.MOMOTECH_SYMBOL_DIVISION, false, false)) return false;
        if (SlimefunUtils.isItemSimilar(it, Items.MOMOTECH_SYMBOL_MULTIPLICATION, false, false)) return false;
        if (SlimefunUtils.isItemSimilar(it, Items.MOMOTECH_SYMBOL_SUBTRACTION, false, false)) return false;
        return !SlimefunUtils.isItemSimilar(it, Items.MOMOTECH_DIGIT, false, false);
    }

    public static List<SlimefunItem> getRecipeByRecipeType(@Nonnull RecipeType recipeType) {
        List<SlimefunItem> list = Slimefun.getRegistry().getEnabledSlimefunItems();
        List<SlimefunItem> ans = new ArrayList<>(list.size());
        for (SlimefunItem slimefunItem : list) {
            if (!slimefunItem.isDisabled() && recipeType.equals(slimefunItem.getRecipeType())) {
                ans.add(slimefunItem);
            }
        }
        return ans;
    }
}
