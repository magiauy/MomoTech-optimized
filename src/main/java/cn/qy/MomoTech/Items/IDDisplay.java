package cn.qy.MomoTech.Items;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import cn.qy.MomoTech.MomoTech;

import java.util.ArrayList;
import java.util.List;

public class IDDisplay extends SlimefunItem implements RecipeDisplayItem {
    List<ItemStack> ans = new ArrayList<>();
    public IDDisplay(ItemGroup itemGroup, ItemStack item, String id, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, id, recipeType, recipe);
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        if(ans.isEmpty()){
            List<SlimefunItem> list=Slimefun.getRegistry().getEnabledSlimefunItems();
            for (SlimefunItem slimefunItem : list) {
                ans.add(new CustomItemStack(slimefunItem.getItem(), slimefunItem.getItemName(), MomoTech.languageManager.getGeneric("id_display") + slimefunItem.getId()));
            }
        }
        return ans;
    }
}
