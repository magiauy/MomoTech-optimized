package cn.qy.MomoTech.GUI;

import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.utils.Utils;
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

public class InfinityDustExtractor extends AbstractElectricGUI implements  RecipeDisplayItem {
    protected InfinityDustExtractor(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }
    public InfinityDustExtractor(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe,ItemStack output) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
        this.output=output;
    }

    @Override
    public int[] IN() {
        return new int[]{0, 8};
    }

    @Override
    public int[] OUT() {
        return new int[]{18, 26};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{9, 10, 11, 12, 13, 14, 15, 16, 17};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_INFINITY_DUST_EXTRACTOR";
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{1, 2, 3, 4, 5, 6, 7};
    }

    @Override
    public int getCapacity() {
        return 100000;
    }

    @Override
    public int getEnergyConsumption() {
        return 15000;
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{19, 20, 21, 22, 23, 24, 25};
    }
    @Override
    protected boolean findNextRecipe(BlockMenu inv) {
        if (Utils.checkOutput(inv, getOutputSlots())) return false;
        for (int i : getInputSlots()) {
            if (inv.getInventory().getItem(i) == null) continue;
            ItemStack it = inv.getInventory().getItem(i).clone();
            if (it.getAmount() != 64) continue;
            it.setAmount(1);
            if (it.equals(new ItemStack(Material.COBBLESTONE))) {
                inv.toInventory().setItem(i, null);
                inv.pushItem(this.getItems().clone(), getOutputSlots());
                return true;
            }
        }
        return false;
    }
    ItemStack output;
    protected ItemStack getItems(){
        return output;
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(18);
        it.add(new CustomItemStack(Material.COBBLESTONE, MomoTech.languageManager.getRecipeDescriptionTitle("infinity_dust_generator"), MomoTech.languageManager.getRecipeDescriptionLore("infinity_dust_generator")));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        return it;
    }
}

