package cn.qy.MomoTech.Items.Machines.Other;

import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.handlers.SimpleBlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Directional;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

import static cn.qy.MomoTech.Items.MomotechItem.bugDate;

import java.util.ArrayList;
import java.util.List;

public class Teleporter extends AbstractGUI implements RecipeDisplayItem {

    public Teleporter(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
        
        // Add right-click handler for teleport and GUI opening
        addItemHandler(new BlockUseHandler() {
            @Override
            public void onRightClick(PlayerRightClickEvent e) {
                Player p = e.getPlayer();
                Block block = e.getClickedBlock().orElse(null);
                if (block == null) return;
                
                BlockMenu inv = Slimefun.getDatabaseManager().getBlockDataController().getBlockData(block.getLocation()).getBlockMenu();
                if (inv == null) return;
                e.cancel();
                
                if (p.isSneaking()) {
                    // Shift + Right click: Open GUI
                    inv.open(p);
                } else {
                    // Right click: Teleport
                    ItemStack digitItem = inv.getInventory().getItem(4);
                    if (digitItem == null || !isValidDigit(digitItem)) {
                        // No digit or invalid digit: Send error message
                        p.sendMessage(MomoTech.languageManager.getGeneric("teleporter_not_configured_correctly"));
                        return;
                    }
                    
                    // Perform teleport
                    performTeleport(p, block, digitItem);
                }
            }
        });
    }
    
    private boolean isValidDigit(ItemStack item) {
        return "MOMOTECH_DIGIT".equals(Slimefun.getItemDataService().getItemData(item).orElse(null));
    }
    
    private void performTeleport(Player player, Block block, ItemStack digitItem) {
        try {
            String str = Utils.getLore(digitItem.getItemMeta()).get(0);
            int distance = ((int) (Double.parseDouble(str.substring(str.indexOf('f') + 1)))) % 320;
            
            if (distance == 0) {
                player.sendMessage(MomoTech.languageManager.getGeneric("teleporter_not_configured_correctly"));
                return;
            }
            
            Location blockLocation = block.getLocation();
            BlockData blockData = block.getBlockData();
            
            if (blockData instanceof Directional) {
                BlockFace blockFace = ((Directional) blockData).getFacing();
                Location teleportLocation = calculateTeleportLocation(blockLocation, blockFace, distance);
                if (teleportLocation != null) {
                    teleportLocation.setYaw(player.getLocation().getYaw());
                    teleportLocation.setPitch(player.getLocation().getPitch());
                    player.teleport(teleportLocation);
                } else {
                    player.sendMessage(MomoTech.languageManager.getGeneric("teleporter_not_configured_correctly"));
                }
            }
        } catch (Exception e) {
            player.sendMessage(MomoTech.languageManager.getGeneric("teleporter_not_configured_correctly"));
        }
    }
    
    private Location calculateTeleportLocation(Location origin, BlockFace facing, int distance) {
        double centerX = origin.getBlockX() + 0.5;
        double centerY = origin.getBlockY() + 0.5;
        double centerZ = origin.getBlockZ() + 0.5;
        switch (facing) {
            case DOWN:
                return new Location(origin.getWorld(), centerX, centerY - distance - 0.5, centerZ);
            case UP:
                return new Location(origin.getWorld(), centerX, centerY + distance +0.5, centerZ);
            case EAST:
                return new Location(origin.getWorld(), centerX + distance, origin.getBlockY(), centerZ);
            case WEST:
                return new Location(origin.getWorld(), centerX - distance, origin.getBlockY(), centerZ);
            case NORTH:
                return new Location(origin.getWorld(), centerX, origin.getBlockY(), centerZ - distance);
            case SOUTH:
                return new Location(origin.getWorld(), centerX, origin.getBlockY(), centerZ + distance);
            default:
                return null;
        }
    }

    @Override
    @Nonnull
    protected BlockBreakHandler onBlockBreak() {
        return new SimpleBlockBreakHandler() {
            public void onBlockBreak(@NotNull Block b) {
                BlockMenu inv = Slimefun.getDatabaseManager().getBlockDataController().getBlockData(b.getLocation()).getBlockMenu();
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