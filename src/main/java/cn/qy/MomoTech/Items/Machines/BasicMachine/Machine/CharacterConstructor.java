package cn.qy.MomoTech.Items.Machines.BasicMachine.Machine;

import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.utils.Maths;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CharacterConstructor extends AbstractGUI implements RecipeDisplayItem {

    public CharacterConstructor(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }


    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_CHARACTER_CONSTRUCTOR";
    }


    @Override
    public int[] IN() {
        return new int[]{0, 1, 2, 6, 7, 8, 9, 11, 15, 17};
    }

    @Override
    public int[] OUT() {
        return new int[]{18, 19, 20, 21, 22, 23, 24, 25, 26, 36, 37, 38, 39, 40, 41, 42, 43, 44};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{3, 4, 5, 12, 14};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{10, 13, 16};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{27, 28, 29, 30, 31, 32, 33, 34, 35};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i) == null) return;
            ItemStack it = inv.getItemInSlot(i);
            if (!SlimefunUtils.isItemSimilar(it, MomotechItem.nullItem, true, false) && !SlimefunUtils.isItemSimilar(it, MomotechItem.primalMatterB, true, false) && !SlimefunUtils.isItemSimilar(it, MomotechItem.primalMatterA, true, false))
                return;
        }
        if (Utils.checkOutput(inv, getOutputSlots())) return;
        if (!SlimefunUtils.isItemSimilar(inv.getItemInSlot(13), MomotechItem.nullItem, true, false)) return;
        if (!(SlimefunUtils.isItemSimilar(inv.getItemInSlot(10), MomotechItem.primalMatterB, true, false)
                && SlimefunUtils.isItemSimilar(inv.getItemInSlot(16), MomotechItem.primalMatterA, true, false))
                && (!(SlimefunUtils.isItemSimilar(inv.getItemInSlot(10), MomotechItem.primalMatterA, true, false)
                && SlimefunUtils.isItemSimilar(inv.getItemInSlot(16), MomotechItem.primalMatterB, true, false))))
            return;
        String list = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM123456789_";//62个
        char ans = list.charAt(Maths.GetRandom(61));
        String[] characterLore = MomoTech.languageManager.getItemLore("character");
        characterLore[0] = "&f" + String.valueOf(ans);

        ItemStack it = new CustomItemStack(Material.SUGAR, MomoTech.languageManager.getItemName("character"), characterLore);
        ItemStack sfit = new SlimefunItemStack("MOMOTECH_CHARACTER", it);
        for (int j : getOutputSlots()) {
            if (inv.getItemInSlot(j) == null) {
                inv.consumeItem(10, 1);
                inv.consumeItem(13, 1);
                inv.consumeItem(16, 1);
                inv.replaceExistingItem(j, sfit);
                return;
            }
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(12);
        it.add(new CustomItemStack(Material.BOOK, MomoTech.languageManager.getRecipeDescriptionTitle("character_constructor"), MomoTech.languageManager.getRecipeDescriptionLore("character_constructor")));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.primalMatterA.clone());
        it.add(MomotechItem.character.clone());
        it.add(MomotechItem.nullItem.clone());
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.primalMatterB.clone());
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        return it;

    }
}
