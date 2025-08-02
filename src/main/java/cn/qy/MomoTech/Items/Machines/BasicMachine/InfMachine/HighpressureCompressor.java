package cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine;

import cn.qy.MomoTech.Items.MomotechItem;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class HighpressureCompressor  extends AContainer implements RecipeDisplayItem {
    public HighpressureCompressor(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
        this.setProcessingSpeed(1);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.SEA_LANTERN);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_HIGHPRESSURE_COMPRESSOR";
    }

    @Override
    public int getEnergyConsumption() {
        return 200;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public int getCapacity() {
        return 2000;
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(this.recipes.size() * 2);
        for (MachineRecipe i : this.recipes) {
            it.add(i.getInput()[0].clone());
            it.add(i.getOutput()[0].clone());
        }
        return it;
    }

    @Override
    protected void registerDefaultRecipes() {
        this.registerRecipe(5, new SlimefunItemStack(MomotechItem.eternalParticle, 12), MomotechItem.eternalSingularity.clone());

        this.registerRecipe(5, new SlimefunItemStack(MomotechItem.proton, 16), MomotechItem.protonIngot.clone());

        this.registerRecipe(5, new SlimefunItemStack(MomotechItem.zygote, 32), MomotechItem.zygoteIngot.clone());

    }
}
