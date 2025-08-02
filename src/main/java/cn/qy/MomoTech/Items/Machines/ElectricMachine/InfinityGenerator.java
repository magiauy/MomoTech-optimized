package cn.qy.MomoTech.Items.Machines.ElectricMachine;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class InfinityGenerator extends AGenerator {
    public InfinityGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @NotNull
    @Override
    public String getInventoryTitle() {
        return "MOMOTECH_INFINITY_GENERATOR";
    }

    @NotNull
    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.EMERALD);
    }

    @Override
    public int getEnergyProduction() {
        return 99999999;
    }

    @Override
    public int getCapacity() {
        return 999999999;
    }

    @Override
    protected void registerDefaultFuelTypes() {
        this.registerFuel(new MachineFuel(600000, new ItemStack(Material.EMERALD)));
    }
}
