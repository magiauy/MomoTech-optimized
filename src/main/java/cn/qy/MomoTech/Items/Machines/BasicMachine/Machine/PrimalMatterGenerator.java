package cn.qy.MomoTech.Items.Machines.BasicMachine.Machine;

import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.GUI.AbstractElectricGUI;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.Items.RandomizedItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class PrimalMatterGenerator extends AbstractElectricGUI implements RecipeDisplayItem {
    public PrimalMatterGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @Override
    public @NotNull List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(4);
        it.add(new CustomItemStack(Material.BOOK, MomoTech.languageManager.getRecipeDescriptionTitle("primal_matter_generator"), MomoTech.languageManager.getRecipeDescriptionLore("primal_matter_generator")));
        it.add(MomotechItem.primalMatterA.clone());
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.primalMatterB.clone());
        return it;
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
        return new int[]{8};
    }

    @Override
    public ItemStack getProgressBar() {
        return null;
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    @Override
    protected boolean findNextRecipe(BlockMenu inv) {
        inv.pushItem(getOut().clone(), getOutputSlots());
        return true;
    }
    ItemStack output=new RandomizedItemStack(MomotechItem.primalMatterA, MomotechItem.primalMatterB);
    public ItemStack getOut() {
        return output;
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_PRIMAL_MATTER_GENERATOR";
    }

    @Override
    public int getCapacity() {
        return 1000000;
    }

    @Override
    public int getEnergyConsumption() {
        return 100000;
    }
}
