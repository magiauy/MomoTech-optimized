package cn.qy.MomoTech.Items.Machines.ElectricMachine;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import cn.qy.MomoTech.MomoTech;

public class BasicGenerator extends AGenerator {
    public BasicGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @NotNull
    @Override
    public String getInventoryTitle() {
        return MomoTech.languageManager.getItemName("basic_generator");
    }

    @NotNull
    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.END_CRYSTAL);
    }

    @Override
    public int getEnergyProduction() {
        return 6000;
    }

    @Override
    public int getCapacity() {
        return 600000;
    }

    @Override
    protected void registerDefaultFuelTypes() {
        this.registerFuel(new MachineFuel(60, new ItemStack(Material.COAL)));
    }
}
