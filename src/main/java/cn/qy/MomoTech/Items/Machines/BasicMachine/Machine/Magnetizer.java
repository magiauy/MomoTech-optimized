package cn.qy.MomoTech.Items.Machines.BasicMachine.Machine;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

import cn.qy.MomoTech.Items.MomotechItem;

public class Magnetizer extends AContainer implements RecipeDisplayItem {
    public Magnetizer(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
        this.setProcessingSpeed(1);
    }

    @Override
    public @NotNull String getMachineIdentifier() {
        return "MOMOTECH_MAGNETIZER";
    }

    @Override
    public int getEnergyConsumption() {
        return 200;
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.IRON_CHESTPLATE);
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public int getCapacity() {
        return 2000;
    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 4);
        displayRecipes.add(new ItemStack(Material.IRON_BLOCK));
        displayRecipes.add(MomotechItem.magnet.clone());
        return displayRecipes;
    }

    @Override
    protected void registerDefaultRecipes() {
        this.registerRecipe(3, new ItemStack(Material.IRON_BLOCK), MomotechItem.magnet.clone());
    }
}
