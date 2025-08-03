package cn.qy.MomoTech.Items.Machines.BasicMachine.Machine;

import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.GUI.AbstractGUI;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class EquipmentRepairingMachine extends AbstractGUI implements RecipeDisplayItem {
    public EquipmentRepairingMachine(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
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
        return new int[]{0, 1, 2, 3, 5, 6, 7, 8};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_EQUIPMENT_REPAIRING_MACHINE";
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{4};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        ItemStack itemStack = inv.getInventory().getItem(4);
        if (itemStack != null && itemStack.hasItemMeta()) {
            ItemMeta itemMeta = itemStack.getItemMeta();
            if (itemMeta instanceof Damageable) {
                Damageable damageable = (Damageable) itemMeta;
                damageable.setDamage(Math.max(0, damageable.getDamage() - 1));
            }
            itemStack.setItemMeta(itemMeta);
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(4);
        it.add(new CustomItemStack(Material.IRON_PICKAXE, MomoTech.languageManager.getRecipeDescriptionTitle("equipment_repairing_machine"), MomoTech.languageManager.getRecipeDescriptionLore("equipment_repairing_machine")));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        return it;
    }
}
