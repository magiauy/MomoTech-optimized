package cn.qy.MomoTech.Items.Machines.BasicMachine.Machine;

import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.GUI.AbstractProcessMachine;
import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.utils.MachineUtils;
import cn.qy.MomoTech.utils.SimpleOperation;
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

public class EternalParticleConstructor extends AbstractProcessMachine implements RecipeDisplayItem {
    public EternalParticleConstructor(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{0, 1, 2, 9, 11, 18, 19, 20};
    }

    @Override
    public int[] OUT() {
        return new int[]{6, 7, 8, 15, 17, 24, 25, 26};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{3, 4, 5, 12, 14, 21, 22, 23};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_ETERNAL_PARTICLE_CONSTUCTOR";
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{10};
    }

    @Override
    public int getProcessBarSlots() {
        return 13;
    }

    @Override
    public int getDefaultMaxProcess() {
        return 150;
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{16};
    }
    @Override
    protected void findNextRecipe(BlockMenu inv) {
        if(MachineUtils.simpleProcessor(inv,getInputSlots(),getOutputSlots(),MomotechItem.nullItem,null)){
            SimpleOperation operation=this.getMachineProcessor().getOperation(inv.getLocation());
            if(operation==null){
                operation=new SimpleOperation(this.getDefaultMaxProcess());
                this.getMachineProcessor().startOperation(inv.getLocation(),operation);
            }
            operation.addRealProgress(1);
            if(inv.hasViewer()){
                inv.replaceExistingItem(this.getProcessBarSlots(),new CustomItemStack(Material.GREEN_STAINED_GLASS_PANE, MomoTech.languageManager.getGeneric("progress"), "&f"+operation.getProgress()+"/" + operation.getTotalTicks()));
            }
            if(operation.isFinished()){
                this.getMachineProcessor().endOperation(inv.getLocation());
                operation=new SimpleOperation((int)((float)(operation.getTotalTicks())*1.1f));
                this.getMachineProcessor().startOperation(inv.getLocation(),operation);
                inv.pushItem(MomotechItem.eternalParticle.clone(),getOutputSlots());
            }
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(18);
        it.add(new CustomItemStack(Material.BOOK, MomoTech.languageManager.getRecipeDescriptionTitle("eternal_particle_constructor"), MomoTech.languageManager.getRecipeDescriptionLore("eternal_particle_constructor")));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.nullItem.clone());
        it.add(MomotechItem.eternalParticle.clone());
        return it;
    }
}
