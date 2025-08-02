package cn.qy.MomoTech.Items.Machines.ElectricMachine;

import cn.qy.MomoTech.Items.MomotechItem;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class StarterGenerator extends AGenerator {
    public StarterGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @NotNull
    @Override
    public String getInventoryTitle() {
        return "MOMOTECH_STARTER_GENERATOR";
    }

    @NotNull
    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.END_CRYSTAL);
    }

    @Override
    public int getEnergyProduction() {
        return 500;
    }

    @Override
    public int getCapacity() {
        return 50000;
    }
//TODO wtf is this, need fixing
    @Override
    protected void registerDefaultFuelTypes() {
        this.registerFuel(new MachineFuel(6000, new SlimefunItemStack(MomotechItem.light, 1)));
        this.registerFuel(new MachineFuel(6000, new SlimefunItemStack(MomotechItem.dark, 1)));
        this.registerFuel(new MachineFuel(6000, new SlimefunItemStack(SlimefunItems.BUTTER, 1)));
    }
}
