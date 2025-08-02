package cn.qy.MomoTech.Items.Machines.BasicMachine.Machine;

import cn.qy.MomoTech.Items.Items;
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

import static cn.qy.MomoTech.Items.MomotechItem.chargedIngot;

import java.util.ArrayList;
import java.util.List;

public class QuantumChargingMachine extends AContainer implements RecipeDisplayItem {
    public QuantumChargingMachine(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
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
        return "MOMOTECH_QUANTUM_CHARGING_MACHINE";
    }

    @Override
    public int getEnergyConsumption() {
        return 1000000;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public int getCapacity() {
        return 2000000;
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
        this.registerRecipe(3, MomotechItem.quantum.clone(), MomotechItem.chargedQuantum.clone());
        this.registerRecipe(120, MomotechItem.chargedIngot.clone(), MomotechItem.entangledQuantum.clone());
    }
}
