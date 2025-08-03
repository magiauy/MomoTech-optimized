package cn.qy.MomoTech.Items.Machines.FinalMachine;

import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ItemConstructor extends AbstractGUI implements RecipeDisplayItem {

    public ItemConstructor(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_ITEM_CONSTRUCTOR";
    }

    @Override
    public int[] IN() {
        return new int[]{0, 2};
    }

    @Override
    public int[] OUT() {
        return new int[]{6, 8};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{3, 4, 5};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{1};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{7};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        if (inv.getInventory().getItem(1) == null) return;
        if (inv.getInventory().getItem(7) != null) return;
        if (!"MOMOTECH_ID_CARD".equals(Slimefun.getItemDataService().getItemData(inv.getInventory().getItem(1)).orElseGet(()->"")) ) return;
        String lore;
        try{
            lore= Utils.getLore(inv.getInventory().getItem(1).getItemMeta()).get(0).substring(5);
        }catch(Exception e){
            lore="";
            e.printStackTrace();
        }
        if (lore.equals("")) {
            inv.pushItem(new CustomItemStack(Material.PAPER, MomoTech.languageManager.getGeneric("input_invalid")), 1);
            return;
        }
        try {
            SlimefunItem it = SlimefunItem.getById(lore);
            if (it != null) {
                if (!it.isDisabled()) {
                    inv.pushItem(it.getItem().clone(), getOutputSlots());
                } else {
                    inv.pushItem(new CustomItemStack(Material.PAPER, MomoTech.languageManager.getGeneric("item_banned")));
                }
                inv.consumeItem(1, 1);
            }
        } catch (NullPointerException e) {
            inv.pushItem(new CustomItemStack(Material.PAPER, MomoTech.languageManager.getGeneric("input_invalid")), 1);
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(4);
        it.add(new SlimefunItemStack("MOMOTECH_ID_CARD", Items.MOMOTECH_ID_CARD));
        it.add(new CustomItemStack(Material.BOOK, MomoTech.languageManager.getRecipeDescriptionTitle("item_constructor"), MomoTech.languageManager.getRecipeDescriptionLore("item_constructor")));
        return it;
    }
}
