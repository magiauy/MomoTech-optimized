package cn.qy.MomoTech.Items.Machines.Other;

import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.GUI.AbstractGUI;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StoneStorage extends AbstractGUI implements RecipeDisplayItem {
    public StoneStorage(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{};
    }

    @Override
    public int[] OUT() {
        return new int[]{};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{};
    }

    int[] drops = IntStream.range(0,54).toArray();
    @Override
    public int[] MOREDROP() {
        return drops;
    }

    public int getMenuSize(){
        return 54;
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_STONE_STORAGE";
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(4);
        it.add(new CustomItemStack(Material.BOOK, MomoTech.languageManager.getRecipeDescriptionTitle("stone_storage"), MomoTech.languageManager.getRecipeDescriptionLore("stone_storage")));
        return it;
    }
}
