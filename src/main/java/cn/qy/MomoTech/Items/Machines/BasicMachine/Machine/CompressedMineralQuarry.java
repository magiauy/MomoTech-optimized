package cn.qy.MomoTech.Items.Machines.BasicMachine.Machine;

import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.Items.RandomizedItemStack;
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
import java.util.Random;
import java.util.stream.IntStream;

public class CompressedMineralQuarry extends AbstractGUI implements RecipeDisplayItem {
    public CompressedMineralQuarry(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }


    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_COMPRESSED_MINERAL_QUARRY";
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
        return new int[]{27, 28, 29, 30, 31, 32, 33, 34, 35};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
    }
    Random r = new Random();
    RandomizedItemStack output=new RandomizedItemStack(4, IntStream.range(0,9).mapToObj(i->MomotechItem.compressedMinerals[i][2]).toArray(ItemStack[]::new));
    @Override
    protected void findNextRecipe(BlockMenu inv) {
        inv.pushItem(output.clone(), getOutputSlots());
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(12);
        it.add(new CustomItemStack(Material.BOOK, MomoTech.languageManager.getRecipeDescriptionTitle("compressed_mineral_quarry"), MomoTech.languageManager.getRecipeDescriptionLore("compressed_mineral_quarry")));
        it.add(new SlimefunItemStack(MomotechItem.compressedMinerals[0][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.compressedMinerals[1][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.compressedMinerals[2][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.compressedMinerals[3][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.compressedMinerals[4][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.compressedMinerals[5][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.compressedMinerals[6][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.compressedMinerals[7][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.compressedMinerals[8][2], 4));
        return it;
    }
}
