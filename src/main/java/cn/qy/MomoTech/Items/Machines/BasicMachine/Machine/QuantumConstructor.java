package cn.qy.MomoTech.Items.Machines.BasicMachine.Machine;

import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.Items.Items;
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
import java.util.Random;


public class QuantumConstructor extends AbstractGUI implements RecipeDisplayItem {
    public QuantumConstructor(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_QUANTUM_CONSTRUCTOR";
    }

    @Override
    public int[] IN() {
        return new int[]{};
    }

    @Override
    public int[] OUT() {
        return new int[]{50, 48};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{53, 52, 51, 47, 46, 45};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8
                , 9, 10, 11, 12, 13, 14, 15, 16, 17
                , 18, 19, 20, 21, 22, 23, 24, 25, 26
                , 27, 28, 29, 30, 31, 32, 33, 34, 35
                , 36, 37, 38, 39, 40, 41, 42, 43, 44};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{49};
    }

    private boolean BUGChecker(BlockMenu inv) {
        boolean[] checker1 = {false, false, false, false, false, false};
        for (int i : getInputSlots()) {
            ItemStack checker = inv.getItemInSlot(i);
            if (!SlimefunUtils.isItemSimilar(checker, MomotechItem.bugFormula, true, false) && !SlimefunUtils.isItemSimilar(checker, MomotechItem.bugDecimal, true, false) && !SlimefunUtils.isItemSimilar(checker, MomotechItem.bugDate, true, false) && !SlimefunUtils.isItemSimilar(checker, MomotechItem.bugNegativeOverflow, true, false) && !SlimefunUtils.isItemSimilar(checker, MomotechItem.bugPositiveOverflow, true, false) && !SlimefunUtils.isItemSimilar(checker, MomotechItem.bugSystem, true, false))
                return false;
            if (inv.getItemInSlot(i).getAmount() != 64) return false;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), MomotechItem.bugFormula, true, false))
                checker1[0] = true;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), MomotechItem.bugDecimal, true, false))
                checker1[1] = true;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), MomotechItem.bugDate, true, false))
                checker1[2] = true;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), MomotechItem.bugNegativeOverflow, true, false))
                checker1[3] = true;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), MomotechItem.bugPositiveOverflow, true, false))
                checker1[4] = true;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), MomotechItem.bugSystem, true, false))
                checker1[5] = true;
        }
        return checker1[0] && checker1[1] && checker1[2] && checker1[3] && checker1[4] && checker1[5];
    }

    private boolean UncontrollableVoidChecker(BlockMenu inv) {
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i).getAmount() != 64) return false;
            if (!SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), MomotechItem.uncontrollableVoid, true, false))
                return false;
        }
        return true;
    }

    private boolean ImpulseCommandBlockChecker(BlockMenu inv) {
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i).getAmount() != 64) return false;
            ItemStack it = inv.getItemInSlot(i).clone();
            it.setAmount(1);
            if (!it.equals(new ItemStack(Material.COMMAND_BLOCK)))
                return false;
        }
        return true;
    }

    private boolean RepeatingCommandBlockChecker(BlockMenu inv) {
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i).getAmount() != 64) return false;
            ItemStack it = inv.getItemInSlot(i).clone();
            it.setAmount(1);
            if (!it.equals(new ItemStack(Material.REPEATING_COMMAND_BLOCK)))
                return false;
        }
        return true;
    }

    private boolean ChainCommandBlockChecker(BlockMenu inv) {
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i).getAmount() != 64) return false;
            ItemStack it = inv.getItemInSlot(i).clone();
            it.setAmount(1);
            if (!it.equals(new ItemStack(Material.CHAIN_COMMAND_BLOCK)))
                return false;
        }
        return true;
    }

    private boolean FinalCoreChecker(BlockMenu inv) {
        for (int i : getInputSlots()) {
            if (!SlimefunUtils.isItemSimilar(MomotechItem.supremeCore, inv.getItemInSlot(i), true, false))
                return false;
            if (inv.getItemInSlot(i).getAmount() != 64) return false;
        }
        return true;
    }

    private boolean ConceptChecker(BlockMenu inv) {
        for (int i : getInputSlots()) {
            if (!SlimefunUtils.isItemSimilar(MomotechItem.resource, inv.getItemInSlot(i), true, false))
                return false;
            if (inv.getItemInSlot(i).getAmount() != 64) return false;
        }
        return true;
    }

    private void ConsumeItems(BlockMenu inv) {
        for (int i : getInputSlots()) {
            inv.consumeItem(i, inv.getItemInSlot(i).getAmount());
        }
    }

    private boolean PrimalMatterChecker(BlockMenu inv) {
        boolean[] checker = {false, false};
        for (int i : getInputSlots()) {
            if (!SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), MomotechItem.primalMatterB, true, false) && !SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), MomotechItem.primalMatterA, true, false))
                return false;
            if (inv.getItemInSlot(i).getAmount() != 64) return false;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), MomotechItem.primalMatterB, true, false))
                checker[0] = true;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), MomotechItem.primalMatterA, true, false))
                checker[1] = true;
        }
        return checker[0] && checker[1];
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        if (Utils.checkOutput(inv, getOutputSlots())) return;
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i) == null) {
                return;
            }
        }
        if (Utils.checkOutput(inv, getOutputSlots())) return;
        if (BUGChecker(inv)) {
            ConsumeItems(inv);
            inv.pushItem(MomotechItem.bugCrystal.clone(), getOutputSlots());
            return;
        }
        if (PrimalMatterChecker(inv)) {
            ConsumeItems(inv);
            inv.pushItem(MomotechItem.purePrimalMatter.clone(), getOutputSlots());
            return;
        }
        if (UncontrollableVoidChecker(inv)) {
            ConsumeItems(inv);
            if (Math.abs(new Random().nextInt() % 2) == 0)
                inv.pushItem(MomotechItem.primalMatterY.clone(), getOutputSlots());
            return;
        }
        if (FinalCoreChecker(inv)) {
            ConsumeItems(inv);
            inv.pushItem(MomotechItem.finalCore.clone(), getOutputSlots());
            return;
        }
        if (ImpulseCommandBlockChecker(inv)) {
            ConsumeItems(inv);
            inv.pushItem(MomotechItem.primalImpulseCommandBlock.clone(), getOutputSlots());
            return;
        }
        if (RepeatingCommandBlockChecker(inv)) {
            ConsumeItems(inv);
            inv.pushItem(MomotechItem.primalRepeatingCommandBlock.clone(), getOutputSlots());
            return;
        }
        if (ChainCommandBlockChecker(inv)) {
            ConsumeItems(inv);
            inv.pushItem(MomotechItem.primalChainCommandBlock.clone(), getOutputSlots());
            return;
        }
        if (ConceptChecker(inv)) {
            ConsumeItems(inv);
            inv.pushItem(MomotechItem.concept.clone(), getOutputSlots());
            return;
        }
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i) == null) return;
            if (inv.getItemInSlot(i).getAmount() == 64) {
                ConsumeItems(inv);
                if (Maths.GetRandom(2000) == 0)
                    inv.pushItem(MomotechItem.quantumSingularity.clone(), getOutputSlots());
                return;
            }
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(36);
        it.add(new CustomItemStack(Material.BOOK,  MomoTech.languageManager.getRecipeDescriptionTitle("quantum_constructor.primal_matter_y"), MomoTech.languageManager.getRecipeDescriptionLore("quantum_constructor.primal_matter_y")));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.uncontrollableVoid.clone());
        it.add(MomotechItem.primalMatterY.clone());
        it.add(new CustomItemStack(Material.BOOK, MomoTech.languageManager.getRecipeDescriptionTitle("quantum_constructor.bug_crystal"), MomoTech.languageManager.getRecipeDescriptionLore("quantum_constructor.bug_crystal")));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.bugFormula.clone());
        it.add(MomotechItem.bugCrystal.clone());
        it.add(MomotechItem.bugDecimal.clone());
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.bugDate.clone());
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.bugNegativeOverflow.clone());
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.bugPositiveOverflow.clone());
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.bugSystem.clone());
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new CustomItemStack(Material.BOOK, MomoTech.languageManager.getRecipeDescriptionTitle("quantum_constructor.pure_primal_matter"), MomoTech.languageManager.getRecipeDescriptionLore("quantum_constructor.pure_primal_matter")));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.primalMatterB.clone());
        it.add(MomotechItem.purePrimalMatter.clone());
        it.add(MomotechItem.primalMatterA.clone());
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new CustomItemStack(Material.BOOK, MomoTech.languageManager.getRecipeDescriptionTitle("quantum_constructor.final_core"), MomoTech.languageManager.getRecipeDescriptionLore("quantum_constructor.final_core")));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.supremeCore.clone());
        it.add(MomotechItem.finalCore.clone());
        it.add(new CustomItemStack(Material.BOOK, MomoTech.languageManager.getRecipeDescriptionTitle("quantum_constructor.quantum_singularity"), MomoTech.languageManager.getRecipeDescriptionLore("quantum_constructor.quantum_singularity")));
        it.add(MomotechItem.quantumSingularity.clone());
        it.add(new CustomItemStack(Material.BOOK, MomoTech.languageManager.getRecipeDescriptionTitle("quantum_constructor.primal_command_block_impulse"), MomoTech.languageManager.getRecipeDescriptionLore("quantum_constructor.primal_command_block_impulse")));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new ItemStack(Material.COMMAND_BLOCK));
        it.add(MomotechItem.primalImpulseCommandBlock.clone());
        it.add(new CustomItemStack(Material.BOOK, MomoTech.languageManager.getRecipeDescriptionTitle("quantum_constructor.primal_command_block_repeating"), MomoTech.languageManager.getRecipeDescriptionLore("quantum_constructor.primal_command_block_repeating")));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new ItemStack(Material.REPEATING_COMMAND_BLOCK));
        it.add(MomotechItem.primalRepeatingCommandBlock.clone());
        it.add(new CustomItemStack(Material.BOOK, MomoTech.languageManager.getRecipeDescriptionTitle("quantum_constructor.primal_command_block_chain"), MomoTech.languageManager.getRecipeDescriptionLore("quantum_constructor.primal_command_block_chain")));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new ItemStack(Material.CHAIN_COMMAND_BLOCK));
        it.add(MomotechItem.primalChainCommandBlock.clone());
        it.add(new CustomItemStack(Material.BOOK, MomoTech.languageManager.getRecipeDescriptionTitle("quantum_constructor.concept"), MomoTech.languageManager.getRecipeDescriptionLore("quantum_constructor.concept")));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.resource.clone());
        it.add(MomotechItem.concept.clone());
        return it;
    }
}
