package cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine;

import cn.qy.MomoTech.Items.MomotechItem;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class InfinityResourceCondenser extends AContainer implements RecipeDisplayItem {
    public InfinityResourceCondenser(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
        this.setProcessingSpeed(1);
    }

    @Override
    public @NotNull String getMachineIdentifier() {
        return "MOMOTECH_INFINITY_RESOURCE_CONDENSER";
    }

    @Override
    public int getEnergyConsumption() {
        return 15000;
    }

    @Override
    public int getCapacity() {
        return 150000;
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.NETHER_STAR);
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 4);
        displayRecipes.add(new SlimefunItemStack(MomotechItem.infinityIngot, 32));
        displayRecipes.add(MomotechItem.infinitySingularity.clone());
        displayRecipes.add(new SlimefunItemStack(MomotechItem.light, 64));
        displayRecipes.add(MomotechItem.lightEssence.clone());
        displayRecipes.add(new SlimefunItemStack(MomotechItem.dark, 64));
        displayRecipes.add(MomotechItem.darkEssence.clone());
        displayRecipes.add(new ItemStack(Material.DIAMOND, 64));
        displayRecipes.add(MomotechItem.diamondEssence.clone());
        displayRecipes.add(new ItemStack(Material.IRON_INGOT, 64));
        displayRecipes.add(MomotechItem.ironEssence.clone());
        displayRecipes.add(new ItemStack(Material.GOLD_INGOT, 64));
        displayRecipes.add(MomotechItem.goldEssence.clone());
        displayRecipes.add(new ItemStack(Material.REDSTONE, 64));
        displayRecipes.add(MomotechItem.redstoneEssence.clone());
        displayRecipes.add(new ItemStack(Material.LAPIS_LAZULI, 64));
        displayRecipes.add(MomotechItem.lapisEssence.clone());
        displayRecipes.add(new ItemStack(Material.QUARTZ, 64));
        displayRecipes.add(MomotechItem.quartzEssence.clone());
        displayRecipes.add(new ItemStack(Material.COAL, 64));
        displayRecipes.add(MomotechItem.coalEssence.clone());
        displayRecipes.add(new ItemStack(Material.EMERALD, 64));
        displayRecipes.add(MomotechItem.emeraldEssence.clone());
        displayRecipes.add(new SlimefunItemStack(MomotechItem.diamondEssence, 64));
        displayRecipes.add(MomotechItem.diamondSingularity.clone());
        displayRecipes.add(new SlimefunItemStack(MomotechItem.ironEssence, 64));
        displayRecipes.add(MomotechItem.ironSingularity.clone());
        displayRecipes.add(new SlimefunItemStack(MomotechItem.goldEssence, 64));
        displayRecipes.add(MomotechItem.goldSingularity.clone());
        displayRecipes.add(new SlimefunItemStack(MomotechItem.redstoneEssence, 64));
        displayRecipes.add(MomotechItem.redstoneSingularity.clone());
        displayRecipes.add(new SlimefunItemStack(MomotechItem.lapisEssence, 64));
        displayRecipes.add(MomotechItem.lapisSingularity.clone());
        displayRecipes.add(new SlimefunItemStack(MomotechItem.quartzEssence, 64));
        displayRecipes.add(MomotechItem.quartzSingularity.clone());
        displayRecipes.add(new SlimefunItemStack(MomotechItem.coalEssence, 64));
        displayRecipes.add(MomotechItem.coalSingularity.clone());
        displayRecipes.add(new SlimefunItemStack(MomotechItem.emeraldEssence, 64));
        displayRecipes.add(MomotechItem.emeraldSingularity.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 64));
        displayRecipes.add(MomotechItem.silverEssence.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 64));
        displayRecipes.add(MomotechItem.copperEssence.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.GOLD_4K, 64));
        displayRecipes.add(MomotechItem.goldSFEssence.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 64));
        displayRecipes.add(MomotechItem.leadEssence.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.TIN_INGOT, 64));
        displayRecipes.add(MomotechItem.tinEssence.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 64));
        displayRecipes.add(MomotechItem.zincEssence.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 64));
        displayRecipes.add(MomotechItem.magnesiumEssence.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 64));
        displayRecipes.add(MomotechItem.aluminumEssence.clone());

        return displayRecipes;
    }

    @Override
    protected void registerDefaultRecipes() {
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.infinityIngot, 32), MomotechItem.infinitySingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.light, 64), MomotechItem.lightEssence.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.dark, 64), MomotechItem.darkEssence.clone());
        this.registerRecipe(1, new ItemStack(Material.DIAMOND, 64), MomotechItem.diamondEssence.clone());
        this.registerRecipe(1, new ItemStack(Material.IRON_INGOT, 64), MomotechItem.ironEssence.clone());
        this.registerRecipe(1, new ItemStack(Material.GOLD_INGOT, 64), MomotechItem.goldEssence.clone());
        this.registerRecipe(1, new ItemStack(Material.REDSTONE, 64), MomotechItem.redstoneEssence.clone());
        this.registerRecipe(1, new ItemStack(Material.LAPIS_LAZULI, 64), MomotechItem.lapisEssence.clone());
        this.registerRecipe(1, new ItemStack(Material.QUARTZ, 64), MomotechItem.quartzEssence.clone());
        this.registerRecipe(1, new ItemStack(Material.COAL, 64), MomotechItem.coalEssence.clone());
        this.registerRecipe(1, new ItemStack(Material.EMERALD, 64), MomotechItem.emeraldEssence.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.diamondEssence, 64), MomotechItem.diamondSingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.ironEssence, 64), MomotechItem.ironSingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.goldEssence, 64), MomotechItem.goldSingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.redstoneEssence, 64), MomotechItem.redstoneSingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.lapisEssence, 64), MomotechItem.lapisSingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.quartzEssence, 64), MomotechItem.quartzSingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.coalEssence, 64), MomotechItem.coalSingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.emeraldEssence, 64), MomotechItem.emeraldSingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 64), MomotechItem.silverEssence.clone());
        this.registerRecipe(1, new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 64), MomotechItem.copperEssence.clone());
        this.registerRecipe(1, new SlimefunItemStack(SlimefunItems.GOLD_4K, 64), MomotechItem.goldSFEssence.clone());
        this.registerRecipe(1, new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 64), MomotechItem.leadEssence.clone());
        this.registerRecipe(1, new SlimefunItemStack(SlimefunItems.TIN_INGOT, 64), MomotechItem.tinEssence.clone());
        this.registerRecipe(1, new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 64), MomotechItem.zincEssence.clone());
        this.registerRecipe(1, new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 64), MomotechItem.magnesiumEssence.clone());
        this.registerRecipe(1, new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 64), MomotechItem.aluminumEssence.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.silverEssence, 64), MomotechItem.silverSingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.copperEssence, 64), MomotechItem.copperSingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.goldSFEssence, 64), MomotechItem.goldSFSingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.leadEssence, 64), MomotechItem.leadSingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.tinEssence, 64), MomotechItem.tinSingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.zincEssence, 64), MomotechItem.zincSingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.magnesiumEssence, 64), MomotechItem.magnesiumSingularity.clone());
        this.registerRecipe(1, new SlimefunItemStack(MomotechItem.aluminumEssence, 64), MomotechItem.aluminiumSingularity.clone());

    }
}
