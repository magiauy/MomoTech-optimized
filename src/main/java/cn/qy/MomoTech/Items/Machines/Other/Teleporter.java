package cn.qy.MomoTech.Items.Machines.Other;

import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.handlers.SimpleBlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Directional;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
//TODO Open GUI with shift right click, teleport with right click, if digit is null or invalid send message MomoTech.languageManager.getGeneric("teleporter_not_configured_correctly") to player
public class Teleporter extends AbstractGUI implements RecipeDisplayItem {

    public Teleporter(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @Override
    @Nonnull
    protected BlockBreakHandler onBlockBreak() {
        return new SimpleBlockBreakHandler() {
            public void onBlockBreak(@NotNull Block b) {
                BlockMenu inv = BlockStorage.getInventory(b);
                if (inv != null) {
                    inv.dropItems(b.getLocation(), getInputSlots());
                    inv.dropItems(b.getLocation(), getOutputSlots());
                }
            }
        };
    }


    @Override
    public int[] IN() {
        return new int[]{3, 5};
    }

    @Override
    public int[] OUT() {
        return new int[]{};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{0, 1, 2, 6, 7, 8};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_TELEPORTER";
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
        if (inv.getItemInSlot(4) == null) return;
        //SlimefunUtils.isItemSimilar(inv.getItemInSlot(4), new SlimefunItemStack("MOMOTECH_DIGITAL", Items.MOMOTECH_DIGITAL), false, false)
        if (
                "MOMOTECH_DIGIT".equals(  Slimefun.getItemDataService().getItemData(inv.getItemInSlot(4)).orElse(null) )
        ) {
            String str = Utils.getLore(inv.getItemInSlot(4).getItemMeta()).get(0);
            int i = ((int) (Double.parseDouble(str.substring(str.indexOf('f') + 1)))) % 320;
            if (i != 0) {
                inv.addMenuOpeningHandler((p) -> {
                    Location location = inv.getLocation();
                    if (p != null) {
                        p.closeInventory();
                        BlockData blockData = inv.getBlock().getBlockData();
                        if (blockData instanceof Directional) {
                            BlockFace blockFace = ((Directional) blockData).getFacing();
                            switch (blockFace) {
                                case DOWN:
                                    p.teleport(new Location(location.getWorld(), location.getBlockX(), location.getBlockY() - i, location.getBlockZ()));
                                    break;
                                case UP:
                                    p.teleport(new Location(location.getWorld(), location.getBlockX(), location.getBlockY() + i, location.getBlockZ()));
                                    break;
                                case EAST:
                                    p.teleport(new Location(location.getWorld(), location.getBlockX() + i, location.getBlockY(), location.getBlockZ()));
                                    break;
                                case WEST:
                                    p.teleport(new Location(location.getWorld(), location.getBlockX() - i, location.getBlockY(), location.getBlockZ()));
                                    break;
                                case NORTH:
                                    p.teleport(new Location(location.getWorld(), location.getBlockX(), location.getBlockY(), location.getBlockZ() - i));
                                    break;
                                case SOUTH:
                                    p.teleport(new Location(location.getWorld(), location.getBlockX(), location.getBlockY(), location.getBlockZ() + i));
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                });
            }
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(4);
        it.add(new CustomItemStack(Material.BOOK, MomoTech.languageManager.getRecipeDescriptionTitle("teleporter"), MomoTech.languageManager.getRecipeDescriptionLore("teleporter")));
        it.add(MomotechItem.digit(1.0));
        return it;
    }
}