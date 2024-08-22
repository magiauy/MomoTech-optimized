package cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine.MonsterItemGenerator;

import cn.qy.MomoTech.GUI.MonsterItemGenerator;
import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.utils.Maths;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class MonsterItemGenerator7 extends MonsterItemGenerator implements RecipeDisplayItem {
    private final Material[] it = {Material.SLIME_BALL, Material.SLIME_BLOCK};

    public MonsterItemGenerator7(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> item = new ArrayList<>(18);
        for (Material i : this.it) {
            item.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, MomoTech.languageManager.getRecipeDescription("possible_productions")));
            item.add(new ItemStack(i, 32));
        }
        return item;
    }

    @Override
    public @NotNull String getMachineIdentifier() {
        return "MOMOTECH_MONSTER_GENERATOR7";
    }

    @Override
    public Material getItems() {
        return this.it[Maths.GetRandom(1)];
    }
}
