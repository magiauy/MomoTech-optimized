package cn.qy.MomoTech.tasks;

import cn.qy.MomoTech.Items.Armor.InfinityBoots;
import cn.qy.MomoTech.Items.IDDisplay;
import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.NullEnchantment.Register;
import cn.qy.MomoTech.utils.SfUtils;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

import static cn.qy.MomoTech.Items.MomotechItem.*;

public class ItemRegisterTask {
    public static void run(@NotNull Logger logger) {
        Register.run();
        RecipeType resourceCondenserRecipeType = new RecipeType(new NamespacedKey(MomoTech.getInstance(), "MOMOTECH_RESOURCE_CONDERSER_RT"), new SlimefunItemStack("MOMOTECH_RESOURCE_CONDENSER", Items.MOMOTECH_RESOURCE_CONDENSER));
        RecipeType magnetizerRecipeType = new RecipeType(new NamespacedKey(MomoTech.getInstance(), "MOMOTECH_MAGNETIZER_RT"), new SlimefunItemStack("MOMOTECH_MAGNETIZER", Items.MOMOTECH_MAGNETIZER));
        RecipeType quantumChargingMachinRecipeType = new RecipeType(new NamespacedKey(MomoTech.getInstance(), "MOMOTECH_QUANTUM_CHARGING_MACHINE_RT"), new SlimefunItemStack("MOMOTECH_QUANTUM_CHARGING_MACHINE", Items.MOMOTECH_QUANTUM_CHARGING_MACHINE));
        ItemStack[] empty = {null, null, null, null, null, null, null, null, null};
        ItemStack[] chargedQuantumRecipe = {quantum, null, null, null, null, null, null, null, null};
        ItemStack[] digitRecipe= {
                digitConstructor, incrementer, calculator,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("digit"), MomoTech.languageManager.getGuideLore("digit")), null,
                null, null, null
        };
        ItemStack[] symbolRecipe = {
                null, symbolConstructor, null, 
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("symbol"), MomoTech.languageManager.getGuideLore("symbol")), null,
                null, null, null
        };
        ItemStack[] nullRecipe = {
                null, null, null, 
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("null"), MomoTech.languageManager.getGuideLore("null")), null, 
                null, null, null
        };
        ItemStack[] bugFormulaRecipe = {
                incrementer, null, calculator,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("bug_formula"), MomoTech.languageManager.getGuideLore("bug_formula")), null,
                null, null, null
        };
        ItemStack[] bugDecimalRecipe = {
                incrementer, null, calculator,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("bug_decimal"), MomoTech.languageManager.getGuideLore("bug_decimal")), null,
                null, null, null
        };
        ItemStack[] bugPositiveOverloadRecipe = {
                incrementer, null, calculator, 
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("bug_positive_overflow"), MomoTech.languageManager.getGuideLore("bug_positive_overflow")), null,
                null, null, null
        };
        ItemStack[] bugNegativeOverloadRecipe = {
                incrementer, null, calculator,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("bug_negative_overflow"), MomoTech.languageManager.getGuideLore("bug_negative_overflow")), null,
                null, null, null
        };
        ItemStack[] bugDateRecipe = {
                incrementer, null, calculator,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("bug_date"), MomoTech.languageManager.getGuideLore("bug_date")), null,
                null, null, null
        };
        ItemStack[] bugSystemRecipe = {
                incrementer, null, calculator,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("bug_system"), MomoTech.languageManager.getGuideLore("bug_system")), null,
                null, null, null
        };
        ItemStack[] noneRecipe = {
                nullItem, nullItem, nullItem,
                nullItem, compressedCobblestone[2], nullItem,
                nullItem, nullItem, nullItem
        };
        ItemStack[] uncontrollableEmpty = {
                nullItem, none, nullItem,
                none, none, none,
                primalMatterA, none, primalMatterB
        };
        ItemStack[] qyhb05Recipe = {
                bugFormula, bugDecimal, bugDate,
                uncontrollableVoid, none, uncontrollableVoid,
                bugPositiveOverflow, bugNegativeOverflow, bugSystem
        };
        ItemStack[] chenmoseRecipe = {
                compressedMinerals[0][2], compressedMinerals[1][2], compressedMinerals[2][2],
                compressedMinerals[3][2], compressedMinerals[4][2], compressedMinerals[5][2],
                compressedMinerals[6][2], compressedMinerals[7][2], compressedMinerals[8][2]
        };
        ItemStack[] buggggRecipe = {
                chenmose, none, qyhb05,
                primalMatterA, nullItem, primalMatterB,
                SlimefunItems.MAGIC_SUGAR, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.MAGIC_SUGAR
        };
        ItemStack[] primalMatterRecipe = {
                null, primalMatterConstructor, null,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("primal_matter"), MomoTech.languageManager.getGuideLore("primal_matter")), null,
                null, null, null
        };
        ItemStack[] primalMatterYRecipe = {
                null, quantumConstructor, null,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("primal_matter_y"), MomoTech.languageManager.getGuideLore("primal_matter_y")),
                null, null, uncontrollableVoid, null
        };
        ItemStack[] bugCrystalRecipe = {
                bugFormula, quantumConstructor, bugDecimal,
                bugDate, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("bug_crystal"), MomoTech.languageManager.getGuideLore("bug_crystal")), bugPositiveOverflow,
                bugNegativeOverflow, null, bugSystem
        };
        ItemStack[] saturationCharmRecipe = {
                none, new ItemStack(Material.APPLE), none,
                primalMatterA, eternalParticle, primalMatterB,
                null, SlimefunItems.MAGIC_SUGAR, null
        };
        ItemStack[] weirdThingRecipe = {
                primalMatterY, primalMatterY, primalMatterY,
                supremeCore, finalCore, supremeCore,
                qyhb05, chenmose, qyhb05
        };
        ItemStack[] fakeCommandBlockRecipe = {
                eternalSingularity, quantumSingularity, eternalSingularity,
                chenmose, entangledQuantum, chenmose,
                qyhb05, bugCrystal, qyhb05
        };
        ItemStack[] quantumSingularityRecipe = {
                null, quantumConstructor, null, 
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("quantum_singularity"), MomoTech.languageManager.getGuideLore("quantum_singularity")), null, 
                null, null, null

        };
        ItemStack[] purePrimalMatterRecipe = {
                null, quantumConstructor, null, 
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("pure_primal_matter"), MomoTech.languageManager.getGuideLore("pure_primal_matter")), null,
                primalMatterA, null, primalMatterB
        };
        ItemStack[] instakillSwordRecipe = {
                null, compressedCobblestone[49], null,
                null, compressedCobblestone[49], null,
                null, quantumBox, null
        };
        ItemStack[] characterRecipe = {
                null, characterConstructor, null,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("character"), MomoTech.languageManager.getGuideLore("character")), null,
                null, null, null
        };
        ItemStack[] IDCardRecipe = {
                primalMatterB, primalMatterB, primalMatterB,
                eternalSingularity, null, eternalSingularity,
                primalMatterA, primalMatterA, primalMatterA
        };
        ItemStack[] supremeCoreRecipe = {
                darkEssence, primalMatterY, lightEssence,
                bugCrystal, quantumSingularity, bugggg,
                infinityGear, infinitySingularity, lightAndDarkIngot
        };
        ItemStack[] finalCoreRecipe = {
                null, quantumConstructor, null,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("final_core"), MomoTech.languageManager.getGuideLore("final_core")), null,
                null, supremeCore, null};
        ItemStack[] expRecipe = {
                null, null, null,
                primalMatterA, randomQuantum, primalMatterB,
                null, null, null
        };
        ItemStack[] weirdArmorRecipe = {
                supremeCore, finalCore, supremeCore,
                supremeCore, uncontrollableVoid, supremeCore,
                null, null, null
        };
        ItemStack[] integratedMachineCoreRecipe = {
                uncontrollableVoid, uncontrollableVoid, uncontrollableVoid,
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.REINFORCED_PLATE,
                SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.BASIC_CIRCUIT_BOARD
        };
        ItemStack[] quantumBoxRecipe = {
                entangledQuantum, quantum, entangledQuantum,
                quantum, new ItemStack(Material.ENDER_CHEST), quantum,
                entangledQuantum, quantum, entangledQuantum
        };
        ItemStack[] entangledQuantumPickaxeRecipe = {
                entangledQuantum, entangledQuantum, entangledQuantum,
                null, nullItem, null,
                null, nullItem, null
        };
        ItemStack[] quantumPickaxeRecipe = {
                quantum, quantum, quantum,
                null, nullItem, null,
                null, nullItem, null
        };
        ItemStack[] quantumDebuffRemoverRecipe = {
                nullItem, nullItem, nullItem,
                nullItem, new ItemStack(Material.MILK_BUCKET), nullItem,
                none, none, none
        };
        ItemStack[] quantumRecipe = {
                nullItem, nullItem, nullItem,
                primalMatterA, new ItemStack(Material.GOLD_INGOT), primalMatterB,
                nullItem, nullItem, nullItem
        };
        ItemStack[] entangledQuantumRecipe = {
                null, quantum, null,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("entangled_quantum"), MomoTech.languageManager.getGuideLore("entangled_quantum")), null,
                null, null, null
        };
        ItemStack[] lightRecipe = {
                null, lightAndDarkCollector, null,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("light"), MomoTech.languageManager.getGuideLore("light")), null,
                null, null, null
        };
        ItemStack[] darkRecipe = {
                null, lightAndDarkCollector, null,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("dark"), MomoTech.languageManager.getGuideLore("dark") ), null,
                null, null, null
        };
        ItemStack[] lightEssenceRecipe = {
                new SlimefunItemStack(light, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] darkEssenceRecipe = {
                new SlimefunItemStack(dark, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] diamondEssenceRecipe = {
                new ItemStack(Material.DIAMOND, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] ironEssenceRecipe = {
                new ItemStack(Material.IRON_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] quartzEssenceRecipe = {
                new ItemStack(Material.QUARTZ, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] emeraldEssenceRecipe = {
                new ItemStack(Material.EMERALD, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] redstoneEssenceRecipe = {
                new ItemStack(Material.REDSTONE, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] coalEssenceRecipe = {
                new ItemStack(Material.COAL, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] goldEssenceRecipe = {
                new ItemStack(Material.GOLD_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] lapisEssenceRecipe = {
                new ItemStack(Material.LAPIS_LAZULI, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] diamondSingularityRecipe = {
                new SlimefunItemStack(diamondEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] ironSingularityRecipe = {
                new SlimefunItemStack(ironEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] quartzSingularityRecipe = {
                new SlimefunItemStack(quartzEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] emeraldSingularityRecipe = {
                new SlimefunItemStack(emeraldEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] redstoneSingularityRecipe = {
                new SlimefunItemStack(redstoneEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] coalSingularityRecipe = {
                new SlimefunItemStack(coalEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] goldSingularityRecipe = {
                new SlimefunItemStack(goldEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] lapisSingularityRecipe = {
                new SlimefunItemStack(lapisEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] copperSingularityRecipe = {
                new SlimefunItemStack(copperEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] goldSFSingularityRecipe = {
                new SlimefunItemStack(goldSFEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] aluminumSingularityRecipe = {
                new SlimefunItemStack(aluminumEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] leadSingularityRecipe = {
                new SlimefunItemStack(leadEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] tinSingularityRecipe = {
                new SlimefunItemStack(tinEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] zincSingularityRecipe = {
                new SlimefunItemStack(zincEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] magnesiumSingularityRecipe = {
                new SlimefunItemStack(magnesiumEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] silverSingularityRecipe = {
                new SlimefunItemStack(silverEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] copperEssenceRecipe = {
                new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] goldSFEssenceRecipe = {
                new SlimefunItemStack(SlimefunItems.GOLD_4K, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] aluminumEssenceRecipe = {
                new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] leadEssenceRecipe = {
                new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] tinEssenceRecipe = {
                new SlimefunItemStack(SlimefunItems.TIN_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] zincEssenceRecipe = {
                new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] magnesiumEssenceRecipe = {
                new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] silverEssenceRecipe = {
                new SlimefunItemStack(silverEssence, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] electromagnetRecipe = {
                wireCoil, wireCoil, wireCoil,
                wireCoil, ironCore, wireCoil,
                wireCoil, wireCoil, wireCoil
        };
        ItemStack[] ironCoreRecipe = {
                new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK),
                new ItemStack(Material.IRON_BLOCK), SlimefunItems.STEEL_INGOT, new ItemStack(Material.IRON_BLOCK),
                new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK)
        };
        ItemStack[] magnetRecipe = {
                new ItemStack(Material.IRON_BLOCK), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] mineralSingularityRecipe = {
                diamondSingularity, ironSingularity, goldSingularity,
                coalSingularity, nullItem, lapisSingularity,
                redstoneSingularity, quartzSingularity, emeraldSingularity
        };
        ItemStack[] metalSingularityRecipe = {
                magnesiumSingularity, copperSingularity, aluminiumSingularity,
                silverSingularity, nullItem, leadSingularity,
                tinSingularity, zincSingularity, goldSFSingularity
        };
        ItemStack[] infinityIngotRecipe = {
                mineralSingularity, lightAndDarkIngot, metalSingularity,
                purePrimalMatter, zygoteIngot, protonIngot,
                null, null, null
        };
        ItemStack[] wireCoilRecipe = {
                SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT,
                SlimefunItems.COPPER_INGOT, nullItem, SlimefunItems.COPPER_INGOT,
                SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT,
        };
        ItemStack[] infinitySingularityRecipe = {
                new SlimefunItemStack(infinityIngot, 32), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] lightAndDarkIngotRecipe = {
                lightEssence, lightEssence, lightEssence,
                lightEssence, chargedIngot, darkEssence,
                darkEssence, darkEssence, darkEssence
        };
        ItemStack[] infinityMachineCoreRecipe = {
                lightAndDarkIngot, infinitySingularity, lightAndDarkIngot,
                integratedMachineCore, eternalSingularity, integratedMachineCore,
                lightAndDarkIngot, SlimefunItems.REINFORCED_PLATE, lightAndDarkIngot
        };
        ItemStack[] randomQuantum = {
                null, randomQuantumGenerator, null,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("random_quantum"), MomoTech.languageManager.getGuideLore("random_quantum")), null,
                null, null, null
        };
        ItemStack[] effectRemoverRecipe = {
                entangledQuantum, light, entangledQuantum,
                dark, uncontrollableVoid, dark,
                entangledQuantum, light, entangledQuantum
        };
        ItemStack[] primalRepeatingCommandBlockRecipe = {
                null, quantumConstructor, null,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("primal_command_block_repeating"), MomoTech.languageManager.getGuideLore("primal_command_block_repeating")), null,
                null, new ItemStack(Material.REPEATING_COMMAND_BLOCK), null
        };
        ItemStack[] primalChainCommandBlockRecipe = {
                null, quantumConstructor, null,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("primal_command_block_chain"), MomoTech.languageManager.getGuideLore("primal_command_block_chain")), null,
                null, new ItemStack(Material.CHAIN_COMMAND_BLOCK), null
        };
        ItemStack[] primalImpulseCommandBlockRecipe = {
                null, quantumConstructor, null,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("primal_command_block_impulse"), MomoTech.languageManager.getGuideLore("primal_command_block_impulse")), null,
                null, new ItemStack(Material.COMMAND_BLOCK), null
        };
        ItemStack[] infinityGearRecipe = {
                primalImpulseCommandBlock, primalImpulseCommandBlock, primalImpulseCommandBlock,
                primalRepeatingCommandBlock, primalRepeatingCommandBlock, primalRepeatingCommandBlock,
                primalChainCommandBlock, primalChainCommandBlock, primalChainCommandBlock,

        };
        ItemStack[] chargedIngotRecipe = {
                SlimefunItems.PLUTONIUM, chargedQuantum, SlimefunItems.PLUTONIUM,
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.PLUTONIUM, SlimefunItems.REINFORCED_PLATE,
                SlimefunItems.PLUTONIUM, chargedQuantum, SlimefunItems.PLUTONIUM
        };
        ItemStack[] resourceRecipe = {
                chargedIngot, infinitySingularity, chargedIngot,
                infinitySingularity, infinityGear, infinitySingularity,
                SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.BASIC_CIRCUIT_BOARD
        };
        ItemStack[] conceptRecipe = {
                null, quantumConstructor, null,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("concept"), MomoTech.languageManager.getGuideLore("concept")), null,
                null, resource, null
        };
        ItemStack[] inventoryThrowerRecipe = {
                uncontrollableVoid, null, uncontrollableVoid,
                null, null, null,
                nullItem, null, nullItem
        };
        ItemStack[] infinityBootsRecipe = {
                infinityIngot, null, MomotechItem.infinityIngot,
                infinityGear, null, bugCrystal,
                null, null, null
        };
        ItemStack[] infinityPickaxeRecipe = {
                infinityIngot, infinityIngot, infinityIngot,
                null, infinityGear, null,
                null, infinityGear, null
        };
        ItemStack[] sealedEvokerRecipe = {
                new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.EMERALD_BLOCK),
                new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.EGG), new ItemStack(Material.EMERALD_BLOCK),
                new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.EMERALD_BLOCK),
        };
        ItemStack[] eternalParticleRecipe = {
                null, eternalParticleConstructor, null,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("eternal_particle"), MomoTech.languageManager.getGuideLore("eternal_particle")), null,
                null, null, null
        };
        ItemStack[] eternalSingularityRecipe = {
                new SlimefunItemStack(eternalParticle, 12), null,
                null, null, null, null, null, null, null
        };
        ItemStack[] zygoteRecipe = {
                null, particleCollector, null,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("zygote"), MomoTech.languageManager.getGuideLore("zygote")), null,
                null, null, null
        };
        ItemStack[] protonRecipe = {
                null, particleCollector, null,
                null, new CustomItemStack(Material.BOOK, MomoTech.languageManager.getGuideName("proton"), MomoTech.languageManager.getGuideLore("proton")), null,
                null, null, null
        };
        ItemStack[] protonIngotRecipe = {
                new SlimefunItemStack(proton, 16), null, null, null,
                null, null, null,
                null, null
        };
        ItemStack[] zygoteIngotRecipe = {
                new SlimefunItemStack(zygote, 32), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] metalEssenceRecipe = {
                magnesiumEssence, copperEssence, silverEssence,
                zincEssence, null, leadEssence,
                goldSFEssence, aluminumEssence, tinEssence
        };
        ItemStack[][][] compressedMineralRecipe = new ItemStack[9][5][16];
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 3; ++j) {
                for (int k = 0; k < 9; ++k) {
                    if (j != 0) compressedMineralRecipe[i][j][k] = compressedMinerals[i][j - 1];
                    else {
                        compressedMineralRecipe[i][j] = new ItemStack[]{
                                new ItemStack(Utils.compressedMineralMaterials[i]), new ItemStack(Utils.compressedMineralMaterials[i]), new ItemStack(Utils.compressedMineralMaterials[i]),
                                new ItemStack(Utils.compressedMineralMaterials[i]), nullItem, new ItemStack(Utils.compressedMineralMaterials[i]),
                                new ItemStack(Utils.compressedMineralMaterials[i]), new ItemStack(Utils.compressedMineralMaterials[i]), new ItemStack(Utils.compressedMineralMaterials[i])
                        };
                        break;
                    }
                }
            }
        }
        addUnbreakable(Items.MOMOTECH_INSTAKILL_SWORD);
        Items.MOMOTECH_INSTAKILL_SWORD.addEnchantment(Enchantment.FIRE_ASPECT, 2);
        Items.MOMOTECH_QUANTUM_PICKAXE.addEnchantment(Enchantment.DIG_SPEED, 5);
        Items.MOMOTECH_QUANTUM_PICKAXE.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
        Items.MOMOTECH_ENTANGLED_QUANTUM_PICKAXE.addEnchantment(Enchantment.DIG_SPEED, 5);
        Items.MOMOTECH_ENTANGLED_QUANTUM_PICKAXE.addEnchantment(Enchantment.SILK_TOUCH, 1);
        addUnbreakable(Items.MOMOTECH_WEIRD_ARMOR);
        addUnbreakable(Items.MOMOTECH_INFINITY_BOOTS);
        Items.MOMOTECH_INFINITY_BOOTS.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
        Items.MOMOTECH_INFINITY_BOOTS.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 10);
        Items.MOMOTECH_INFINITY_BOOTS.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 10);
        Items.MOMOTECH_INFINITY_BOOTS.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 20);
        Items.MOMOTECH_INFINITY_BOOTS.addUnsafeEnchantment(Enchantment.SOUL_SPEED, 3);
        Items.MOMOTECH_INFINITY_BOOTS.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 5);
        Items.MOMOTECH_INFINITY_BOOTS.addUnsafeEnchantment(Enchantment.DURABILITY, 255);
        addUnbreakable(Items.MOMOTECH_INFINITY_PICKAXE);
        Items.MOMOTECH_INFINITY_PICKAXE.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 35);
        Items.MOMOTECH_INFINITY_PICKAXE.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);

        new IDDisplay(Items.MOMOTECH_ENDGAME_MACHINES, Items.MOMOTECH_ID_DISPLAY, "MOMOTECH_ID_DISPLAY", RecipeType.NULL, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(MomoTech.getInstance());
        new InfinityBoots(new SlimefunItemStack("MOMOTECH_INFINITY_BOOTS", Items.MOMOTECH_INFINITY_BOOTS), new PotionEffect[]{new PotionEffect(PotionEffectType.FAST_DIGGING, 600, 1, false, false, false), new PotionEffect(PotionEffectType.REGENERATION, 600, 0, false, false, false), new PotionEffect(PotionEffectType.SATURATION, 600, 0, false, false, false), new PotionEffect(PotionEffectType.SPEED, 600, 0, false, false, false), new PotionEffect(PotionEffectType.WATER_BREATHING, 600, 0, false, false, false), new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 0, false, false, false), new PotionEffect(PotionEffectType.JUMP, 600, 0, false, false, false)}, infinityBootsRecipe).register(MomoTech.getInstance());
        SfUtils.RegisterItem("MOMOTECH_PROTON", Items.MOMOTECH_PROTON, Items.MOMOTECH_MATERIALS, RecipeType.NULL, protonRecipe);
        SfUtils.RegisterItem("MOMOTECH_ZYGOTE", Items.MOMOTECH_ZYGOTE, Items.MOMOTECH_MATERIALS, RecipeType.NULL, zygoteRecipe);
        SfUtils.RegisterItem("MOMOTECH_PROTON_INGOT", Items.MOMOTECH_PROTON_INGOT, Items.MOMOTECH_MATERIALS, RecipeType.COMPRESSOR, protonIngotRecipe);
        SfUtils.RegisterItem("MOMOTECH_ZYGOTE_INGOT", Items.MOMOTECH_ZYGOTE_INGOT, Items.MOMOTECH_MATERIALS, RecipeType.COMPRESSOR, zygoteIngotRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_ESSENCE", Items.MOMOTECH_METAL_ESSENCE, Items.MOMOTECH_MATERIALS, RecipeType.ENHANCED_CRAFTING_TABLE, metalEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_SEALED_EVOKER", Items.MOMOTECH_SEALED_EVOKER, Items.MOMOTECH_TOOLS, RecipeType.ENHANCED_CRAFTING_TABLE, sealedEvokerRecipe, (ItemUseHandler) playerRightClickEvent -> {
            Location l = playerRightClickEvent.getPlayer().getEyeLocation();
            World w = l.getWorld();
            w.dropItem(l, new ItemStack(Material.EVOKER_SPAWN_EGG));
            playerRightClickEvent.cancel();
            if (SlimefunUtils.isItemSimilar(playerRightClickEvent.getPlayer().getInventory().getItemInMainHand(), new SlimefunItemStack("MOMOTECH_SEALED_EVOKER", Items.MOMOTECH_SEALED_EVOKER), false, false)) {
                ItemStack it = playerRightClickEvent.getPlayer().getInventory().getItemInMainHand().clone();
                it.setAmount(playerRightClickEvent.getPlayer().getInventory().getItemInMainHand().getAmount() - 1);
                playerRightClickEvent.getPlayer().getInventory().setItemInMainHand(it);
            } else if (SlimefunUtils.isItemSimilar(playerRightClickEvent.getPlayer().getInventory().getItemInOffHand(), new SlimefunItemStack("MOMOTECH_SEALED_EVOKER", Items.MOMOTECH_SEALED_EVOKER), false, false)) {
                ItemStack it = playerRightClickEvent.getPlayer().getInventory().getItemInOffHand().clone();
                it.setAmount(playerRightClickEvent.getPlayer().getInventory().getItemInOffHand().getAmount() - 1);
                playerRightClickEvent.getPlayer().getInventory().setItemInOffHand(it);
            }
        });
        SfUtils.RegisterItem("MOMOTECH_ETERNAL_PARTICLE", Items.MOMOTECH_ETERNAL_PARTICLE, Items.MOMOTECH_MATERIALS, RecipeType.NULL, eternalParticleRecipe);
        SfUtils.RegisterItem("MOMOTECH_ETERNAL_SINGULARITY", Items.MOMOTECH_ETERNAL_SINGULARITY, Items.MOMOTECH_MATERIALS, RecipeType.COMPRESSOR, eternalSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_INFINITY_PICKAXE", Items.MOMOTECH_INFINITY_PICKAXE, Items.MOMOTECH_TOOLS, RecipeType.ENHANCED_CRAFTING_TABLE, infinityPickaxeRecipe);
        SfUtils.RegisterItem("MOMOTECH_INFINITY_MACHINE_CORE", Items.MOMOTECH_INFINITY_MACHINE_CORE, Items.MOMOTECH_MATERIALS, RecipeType.ENHANCED_CRAFTING_TABLE, infinityMachineCoreRecipe);
        SfUtils.RegisterItem("MOMOTECH_LIGHT_AND_DARK_INGOT", Items.MOMOTECH_LIGHT_AND_DARK_INGOT, Items.MOMOTECH_MATERIALS, RecipeType.ENHANCED_CRAFTING_TABLE, lightAndDarkIngotRecipe);
        SfUtils.RegisterItem("MOMOTECH_INFINITY_SINGULARITY", Items.MOMOTECH_INFINITY_SINGULARITY, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, infinitySingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_QUANTUM_BOX", Items.MOMOTECH_QUANTUM_BOX, Items.MOMOTECH_TOOLS, RecipeType.ENHANCED_CRAFTING_TABLE, quantumBoxRecipe, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.getPlayer().setFreezeTicks(10);
            playerRightClickEvent.getPlayer().openInventory(playerRightClickEvent.getPlayer().getEnderChest());
            playerRightClickEvent.cancel();
        });
        SfUtils.RegisterItem("MOMOTECH_QUANTUM_PICKAXE", Items.MOMOTECH_QUANTUM_PICKAXE, Items.MOMOTECH_TOOLS, RecipeType.ENHANCED_CRAFTING_TABLE, quantumPickaxeRecipe, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.getPlayer().setWalkSpeed(1.0F);
            playerRightClickEvent.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 99999999, 3, true, false));
        });
        SfUtils.RegisterItem("MOMOTECH_ENTANGLED_QUANTUM_PICKAXE", Items.MOMOTECH_ENTANGLED_QUANTUM_PICKAXE, Items.MOMOTECH_TOOLS, RecipeType.ENHANCED_CRAFTING_TABLE, entangledQuantumPickaxeRecipe);
        SfUtils.RegisterItem("MOMOTECH_INSTAKILL_SWORD", Items.MOMOTECH_INSTAKILL_SWORD, Items.MOMOTECH_TOOLS, RecipeType.ENHANCED_CRAFTING_TABLE, instakillSwordRecipe);
        SfUtils.RegisterItem("MOMOTECH_QUANTUM", Items.MOMOTECH_QUANTUM, Items.MOMOTECH_MATERIALS, RecipeType.ENHANCED_CRAFTING_TABLE, quantumRecipe, (ItemUseHandler) playerRightClickEvent -> {
            Player p = playerRightClickEvent.getPlayer();
            Location l = p.getLocation();
            World w = p.getWorld();
            if (l.getBlockY() >= 520) {
                Random r = new Random();
                p.setLevel(0);
                w.dropItem(new Location(w, l.getX() + (r.nextInt() % 16), -64, l.getZ() + (r.nextInt() % 16)), entangledQuantum);
                p.sendRawMessage(MomoTech.languageManager.getGeneric("triggered_not_well"));
            }
            p.setHealth(0.0);
            p.setHealthScale(0.001);
            p.setFreezeTicks(100);
            p.setWalkSpeed(0.0F);
            p.setMaxHealth(1.0);
            p.addPotionEffect(new PotionEffect(PotionEffectType.DARKNESS, 10, 1, true, false));
            w.spawnParticle(Particle.FALLING_LAVA, l, 10, 3, 3, 3);
        });
        SfUtils.RegisterItem("MOMOTECH_CHARGED_QUANTUM", Items.MOMOTECH_CHARGED_QUANTUM, Items.MOMOTECH_MATERIALS, quantumChargingMachinRecipeType, chargedQuantumRecipe);
        SfUtils.RegisterItem("MOMOTECH_RANDOM_QUANTUM", Items.MOMOTECH_RANDOM_QUANTUM, Items.MOMOTECH_MATERIALS, RecipeType.NULL, randomQuantum, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.getPlayer().sendRawMessage(MomoTech.languageManager.getGeneric("died"));
            playerRightClickEvent.getPlayer().setHealth(0.0);
        });
        SfUtils.RegisterItem("MOMOTECH_QUANTUM_DEBUFF_REMOVER", Items.MOMOTECH_QUANTUM_DEBUFF_REMOVER, Items.MOMOTECH_TOOLS, RecipeType.ENHANCED_CRAFTING_TABLE, quantumDebuffRemoverRecipe, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.getPlayer().setMaxHealth(20);
            playerRightClickEvent.getPlayer().setWalkSpeed(0.2F);
            playerRightClickEvent.getPlayer().setHealthScale(20.0);
            playerRightClickEvent.getPlayer().getWorld().spawnParticle(Particle.FALLING_WATER, playerRightClickEvent.getPlayer().getLocation(), 30, 2, 2, 2);
        });
        SfUtils.RegisterItem("MOMOTECH_INVENTORY_THROWER", Items.MOMOTECH_INVENTORY_THROWER, Items.MOMOTECH_TOOLS, RecipeType.ANCIENT_ALTAR, inventoryThrowerRecipe, (ItemUseHandler) playerRightClickEvent -> {
            ArrayList<ItemStack> it = new ArrayList<>(49);
            for (int i = 0; i <= 41; ++i) {
                if (playerRightClickEvent.getPlayer().getInventory().getItem(i) != null) {
                    it.add(playerRightClickEvent.getPlayer().getInventory().getItem(i));
                }
            }
            playerRightClickEvent.getPlayer().getInventory().clear();
            World w = playerRightClickEvent.getPlayer().getWorld();
            Location loc = playerRightClickEvent.getPlayer().getLocation();
            for (ItemStack i : it) {
                w.dropItem(loc, i);
            }
            playerRightClickEvent.getPlayer().sendRawMessage("biu~");
        });
        SfUtils.RegisterItem("MOMOTECH_EFFECT_REMOVER", Items.MOMOTECH_EFFECT_REMOVER, Items.MOMOTECH_TOOLS, RecipeType.ANCIENT_ALTAR, effectRemoverRecipe, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.getPlayer().clearActivePotionEffects();
            playerRightClickEvent.getPlayer().sendRawMessage(MomoTech.languageManager.getGeneric("yay"));
        });
        SfUtils.RegisterItem("MOMOTECH_ENTANGLED_QUANTUM", Items.MOMOTECH_ENTANGLED_QUANTUM, Items.MOMOTECH_MATERIALS, RecipeType.NULL, entangledQuantumRecipe, (ItemUseHandler) playerRightClickEvent -> {
            Player p = playerRightClickEvent.getPlayer();
            Location l = p.getLocation();
            World w = p.getWorld();
            p.setMaxHealth(5.0);
            p.setLevel(0);
            p.setFreezeTicks(100);
            p.setWalkSpeed(1.0F);
            w.spawnParticle(Particle.FALLING_HONEY, l, 30, 3, 3, 3);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 60, 1, true, false));
            p.sendRawMessage(MomoTech.languageManager.getGeneric("triggered"));
        });
        SfUtils.RegisterItem("MOMOTECH_CONCEPT", Items.MOMOTECH_CONCEPT, Items.MOMOTECH_MATERIALS, RecipeType.NULL, conceptRecipe);
        SfUtils.RegisterItem("MOMOTECH_CHARGED_INGOT", Items.MOMOTECH_CHARGED_INGOT, Items.MOMOTECH_MATERIALS, RecipeType.ENHANCED_CRAFTING_TABLE, chargedIngotRecipe);
        SfUtils.RegisterItem("MOMOTECH_RESOURCE", Items.MOMOTECH_RESOURCE, Items.MOMOTECH_THANKS, RecipeType.ENHANCED_CRAFTING_TABLE, resourceRecipe);
        SfUtils.RegisterItem("MOMOTECH_INFINITY_GEAR", Items.MOMOTECH_INFINITY_GEAR, Items.MOMOTECH_MATERIALS, RecipeType.ENHANCED_CRAFTING_TABLE, infinityGearRecipe);
        SfUtils.RegisterItem("MOMOTECH_PRIMAL_COMMAND_BLOCK_IMPULSE", Items.MOMOTECH_PRIMAL_COMMAND_BLOCK_IMPULSE, Items.MOMOTECH_MATERIALS, RecipeType.NULL, primalImpulseCommandBlockRecipe);
        SfUtils.RegisterItem("MOMOTECH_PRIMAL_COMMAND_BLOCK_REPEATING", Items.MOMOTECH_PRIMAL_COMMAND_BLOCK_REPEATING, Items.MOMOTECH_MATERIALS, RecipeType.NULL, primalRepeatingCommandBlockRecipe);
        SfUtils.RegisterItem("MOMOTECH_PRIMAL_COMMAND_BLOCK_CHAIN", Items.MOMOTECH_PRIMAL_COMMAND_BLOCK_CHAIN, Items.MOMOTECH_MATERIALS, RecipeType.NULL, primalChainCommandBlockRecipe);
        SfUtils.RegisterItem("MOMOTECH_LIGHT", Items.MOMOTECH_LIGHT, Items.MOMOTECH_MATERIALS, RecipeType.NULL, lightRecipe);
        SfUtils.RegisterItem("MOMOTECH_DARK", Items.MOMOTECH_DARK, Items.MOMOTECH_MATERIALS, RecipeType.NULL, darkRecipe);
        SfUtils.RegisterItem("MOMOTECH_LIGHT_ESSENCE", Items.MOMOTECH_LIGHT_ESSENCE, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, lightEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_DARK_ESSENCE", Items.MOMOTECH_DARK_ESSENCE, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, darkEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_INFINITY_INGOT", Items.MOMOTECH_INFINITY_INGOT, Items.MOMOTECH_MATERIALS, RecipeType.SMELTERY, infinityIngotRecipe);
        SfUtils.RegisterItem("MOMOTECH_EXP", Items.MOMOTECH_EXP, Items.MOMOTECH_TOOLS, RecipeType.ENHANCED_CRAFTING_TABLE, expRecipe, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.cancel();
            if (SlimefunUtils.isItemSimilar(playerRightClickEvent.getPlayer().getInventory().getItemInMainHand(), new SlimefunItemStack("MOMOTECH_EXP", Items.MOMOTECH_EXP), false, false)) {
                ItemStack it = playerRightClickEvent.getPlayer().getInventory().getItemInMainHand().clone();
                it.setAmount(playerRightClickEvent.getPlayer().getInventory().getItemInMainHand().getAmount() - 1);
                playerRightClickEvent.getPlayer().getInventory().setItemInMainHand(it);
            } else if (SlimefunUtils.isItemSimilar(playerRightClickEvent.getPlayer().getInventory().getItemInOffHand(), new SlimefunItemStack("MOMOTECH_EXP", Items.MOMOTECH_EXP), false, false)) {
                ItemStack it = playerRightClickEvent.getPlayer().getInventory().getItemInOffHand().clone();
                it.setAmount(playerRightClickEvent.getPlayer().getInventory().getItemInOffHand().getAmount() - 1);
                playerRightClickEvent.getPlayer().getInventory().setItemInOffHand(it);
            }
            playerRightClickEvent.getPlayer().giveExpLevels(20);
        });
        SfUtils.RegisterItem("MOMOTECH_SATURATION_CHARM", Items.MOMOTECH_SATURATION_CHARM, Items.MOMOTECH_TOOLS, RecipeType.ENHANCED_CRAFTING_TABLE, saturationCharmRecipe, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.cancel();
            if (SlimefunUtils.isItemSimilar(playerRightClickEvent.getPlayer().getInventory().getItemInMainHand(), new SlimefunItemStack("MOMOTECH_SATURATION_CHARM", Items.MOMOTECH_SATURATION_CHARM), false, false)) {
                ItemStack it = playerRightClickEvent.getPlayer().getInventory().getItemInMainHand().clone();
                it.setAmount(playerRightClickEvent.getPlayer().getInventory().getItemInMainHand().getAmount() - 1);
                playerRightClickEvent.getPlayer().getInventory().setItemInMainHand(it);
            } else if (SlimefunUtils.isItemSimilar(playerRightClickEvent.getPlayer().getInventory().getItemInOffHand(), new SlimefunItemStack("MOMOTECH_SATURATION_CHARM", Items.MOMOTECH_SATURATION_CHARM), false, false)) {
                ItemStack it = playerRightClickEvent.getPlayer().getInventory().getItemInOffHand().clone();
                it.setAmount(playerRightClickEvent.getPlayer().getInventory().getItemInOffHand().getAmount() - 1);
                playerRightClickEvent.getPlayer().getInventory().setItemInOffHand(it);
            }
            playerRightClickEvent.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 99999999, 1, true, false));
        });
        SfUtils.RegisterItem("MOMOTECH_INTEGRATED_MACHINE_CORE", Items.MOMOTECH_INTEGRATED_MACHINE_CORE, Items.MOMOTECH_MATERIALS, RecipeType.ENHANCED_CRAFTING_TABLE, integratedMachineCoreRecipe);
        SfUtils.RegisterItem("MOMOTECH_FAKE_COMMAND_BLOCK", Items.MOMOTECH_FAKE_COMMAND_BLOCK, Items.MOMOTECH_MATERIALS, RecipeType.ANCIENT_ALTAR, fakeCommandBlockRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_WEIRD_ARMOR", Items.MOMOTECH_WEIRD_ARMOR, Items.MOMOTECH_TOOLS, RecipeType.ENHANCED_CRAFTING_TABLE, weirdArmorRecipe);
        SfUtils.RegisterItem("MOMOTECH_WEIRD_THING", Items.MOMOTECH_WEIRD_THING, Items.MOMOTECH_TOOLS, RecipeType.ENHANCED_CRAFTING_TABLE, weirdThingRecipe);
        SfUtils.RegisterDistinctiveItem("MOMOTECH_CHARACTER", Items.MOMOTECH_CHARACTER, Items.MOMOTECH_MATERIALS, RecipeType.NULL, characterRecipe);
        SfUtils.RegisterDistinctiveItem("MOMOTECH_ID_CARD", Items.MOMOTECH_ID_CARD, Items.MOMOTECH_MATERIALS, RecipeType.ENHANCED_CRAFTING_TABLE, IDCardRecipe);
        SfUtils.RegisterItem("MOMOTECH_SUPREME_CORE", Items.MOMOTECH_SUPREME_CORE, Items.MOMOTECH_MATERIALS, RecipeType.ENHANCED_CRAFTING_TABLE, supremeCoreRecipe);
        SfUtils.RegisterItem("MOMOTECH_FINAL_CORE", Items.MOMOTECH_FINAL_CORE, Items.MOMOTECH_MATERIALS, RecipeType.NULL, finalCoreRecipe);
        SfUtils.RegisterDistinctiveItem("MOMOTECH_DIGIT", Items.MOMOTECH_DIGIT, Items.MOMOTECH_MATERIALS, RecipeType.NULL, digitRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_SYMBOL_ADDITION", Items.MOMOTECH_SYMBOL_ADDITION, Items.MOMOTECH_MATERIALS, RecipeType.NULL, symbolRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_SYMBOL_SUBTRACTION", Items.MOMOTECH_SYMBOL_SUBTRACTION, Items.MOMOTECH_MATERIALS, RecipeType.NULL, symbolRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_SYMBOL_MULTIPLICATION", Items.MOMOTECH_SYMBOL_MULTIPLICATION, Items.MOMOTECH_MATERIALS, RecipeType.NULL, symbolRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_SYMBOL_DIVISION", Items.MOMOTECH_SYMBOL_DIVISION, Items.MOMOTECH_MATERIALS, RecipeType.NULL, symbolRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_NULL", Items.MOMOTECH_NULL, Items.MOMOTECH_MATERIALS, RecipeType.NULL, nullRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_NONE", Items.MOMOTECH_NONE, Items.MOMOTECH_MATERIALS, RecipeType.ANCIENT_ALTAR, noneRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_BUG_FORMULA", Items.MOMOTECH_BUG_FORMULA, Items.MOMOTECH_MATERIALS, RecipeType.NULL, bugFormulaRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_BUG_DECIMAL", Items.MOMOTECH_BUG_DECIMAL, Items.MOMOTECH_MATERIALS, RecipeType.NULL, bugDecimalRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_BUG_DATE", Items.MOMOTECH_BUG_DATE, Items.MOMOTECH_MATERIALS, RecipeType.NULL, bugDateRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_BUG_POSITIVE_OVERFLOW", Items.MOMOTECH_BUG_POSITIVE_OVERFLOW, Items.MOMOTECH_MATERIALS, RecipeType.NULL, bugPositiveOverloadRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_BUG_NEGATIVE_OVERFLOW", Items.MOMOTECH_BUG_NEGATIVE_OVERFLOW, Items.MOMOTECH_MATERIALS, RecipeType.NULL, bugNegativeOverloadRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_BUG_SYSTEM", Items.MOMOTECH_BUG_SYSTEM, Items.MOMOTECH_MATERIALS, RecipeType.NULL, bugSystemRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_UNCONTROLLABLE_VOID", Items.MOMOTECH_UNCONTROLLABLE_VOID, Items.MOMOTECH_MATERIALS, RecipeType.ENHANCED_CRAFTING_TABLE, uncontrollableEmpty);
        SfUtils.RegisterItem("MOMOTECH_QYHB05", Items.MOMOTECH_QYHB05, Items.MOMOTECH_THANKS, RecipeType.MAGIC_WORKBENCH, qyhb05Recipe);
        SfUtils.RegisterItem("MOMOTECH_CHENMOSE", Items.MOMOTECH_CHENMOSE, Items.MOMOTECH_THANKS, RecipeType.MAGIC_WORKBENCH, chenmoseRecipe);
        SfUtils.RegisterItem("MOMOTECH_SKYBULE", Items.MOMOTECH_SKYBULE, Items.MOMOTECH_THANKS, RecipeType.NULL, empty);
        SfUtils.RegisterItem("MOMOTECH_BUGGGG", Items.MOMOTECH_BUGGGGG, Items.MOMOTECH_THANKS, RecipeType.MAGIC_WORKBENCH, buggggRecipe);
        SfUtils.RegisterItem("MOMOTECH_PLUGIN", Items.MOMOTECH_PLUGIN, Items.MOMOTECH_NOTICE, RecipeType.NULL, empty);
        SfUtils.RegisterItem("MOMOTECH_NOTICE_1", Items.MOMOTECH_NOTICE_1, Items.MOMOTECH_NOTICE, RecipeType.NULL, empty);
        SfUtils.RegisterItem("MOMOTECH_NOTICE_2", Items.MOMOTECH_NOTICE_2, Items.MOMOTECH_NOTICE, RecipeType.NULL, empty);
        SfUtils.RegisterItem("MOMOTECH_NOTICE_3", Items.MOMOTECH_NOTICE_3, Items.MOMOTECH_NOTICE, RecipeType.NULL, empty);
        SfUtils.RegisterItem("MOMOTECH_PRIMAL_MATTER_A", Items.MOMOTECH_PRIMAL_MATTER_A, Items.MOMOTECH_MATERIALS, RecipeType.NULL, primalMatterRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_PRIMAL_MATTER_B", Items.MOMOTECH_PRIMAL_MATTER_B, Items.MOMOTECH_MATERIALS, RecipeType.NULL, primalMatterRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_PRIMAL_MATTER_Y", Items.MOMOTECH_PRIMAL_MATTER_Y, Items.MOMOTECH_MATERIALS, RecipeType.NULL, primalMatterYRecipe, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_PURE_PRIMAL_MATTER", Items.MOMOTECH_PURE_PRIMAL_MATTER, Items.MOMOTECH_MATERIALS, RecipeType.NULL, purePrimalMatterRecipe);
        SfUtils.RegisterItem("MOMOTECH_QUANTUM_SINGULARITY", Items.MOMOTECH_QUANTUM_SINGULARITY, Items.MOMOTECH_MATERIALS, RecipeType.NULL, quantumSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_BUG_CRYSTAL", Items.MOMOTECH_BUG_CRYSTAL, Items.MOMOTECH_MATERIALS, RecipeType.NULL, bugCrystalRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_ESSENCE_DIAMOND", Items.MOMOTECH_MINERAL_ESSENCE_DIAMOND, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, diamondEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_ESSENCE_IRON", Items.MOMOTECH_MINERAL_ESSENCE_IRON, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, ironEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_ESSENCE_GOLD", Items.MOMOTECH_MINERAL_ESSENCE_GOLD, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, goldEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_ESSENCE_LAPIS", Items.MOMOTECH_MINERAL_ESSENCE_LAPIS, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, lapisEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_ESSENCE_REDSTONE", Items.MOMOTECH_MINERAL_ESSENCE_REDSTONE, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, redstoneEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_ESSENCE_QUARTZ", Items.MOMOTECH_MINERAL_ESSENCE_QUARTZ, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, quartzEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_ESSENCE_EMERALD", Items.MOMOTECH_MINERAL_ESSENCE_EMERALD, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, emeraldEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_ESSENCE_COAL", Items.MOMOTECH_MINERAL_ESSENCE_COAL, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, coalEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_SINGULARITY_DIAMOND", Items.MOMOTECH_MINERAL_SINGULARITY_DIAMOND, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, diamondSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_SINGULARITY_IRON", Items.MOMOTECH_MINERAL_SINGULARITY_IRON, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, ironSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_SINGULARITY_GOLD", Items.MOMOTECH_MINERAL_SINGULARITY_GOLD, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, goldSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_SINGULARITY_LAPIS", Items.MOMOTECH_MINERAL_SINGULARITY_LAPIS, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, lapisSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_SINGULARITY_REDSTONE", Items.MOMOTECH_MINERAL_SINGULARITY_REDSTONE, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, redstoneSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_SINGULARITY_QUARTZ", Items.MOMOTECH_MINERAL_SINGULARITY_QUARTZ, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, quartzSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_SINGULARITY_EMERALD", Items.MOMOTECH_MINERAL_SINGULARITY_EMERALD, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, emeraldSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_SINGULARITY_COAL", Items.MOMOTECH_MINERAL_SINGULARITY_COAL, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, coalSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_ESSENCE_COPPER", Items.MOMOTECH_METAL_ESSENCE_COPPER, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, copperEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_ESSENCE_GOLD", Items.MOMOTECH_METAL_ESSENCE_GOLD, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, goldSFEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_ESSENCE_ALUMINUM", Items.MOMOTECH_METAL_ESSENCE_ALUMINUM, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, aluminumEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_ESSENCE_LEAD", Items.MOMOTECH_METAL_ESSENCE_LEAD, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, leadEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_ESSENCE_TIN", Items.MOMOTECH_METAL_ESSENCE_TIN, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, tinEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_ESSENCE_ZINC", Items.MOMOTECH_METAL_ESSENCE_ZINC, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, zincEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_ESSENCE_MAGNESIUM", Items.MOMOTECH_METAL_ESSENCE_MAGNESIUM, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, magnesiumEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_ESSENCE_SILVER", Items.MOMOTECH_METAL_ESSENCE_SILVER, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, silverEssenceRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_SINGULARITY_COPPER", Items.MOMOTECH_METAL_SINGULARITY_COPPER, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, copperSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_SINGULARITY_GOLD", Items.MOMOTECH_METAL_SINGULARITY_GOLD, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, goldSFSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_SINGULARITY_ALUMINUM", Items.MOMOTECH_METAL_SINGULARITY_ALUMINUM, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, aluminumSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_SINGULARITY_LEAD", Items.MOMOTECH_METAL_SINGULARITY_LEAD, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, leadSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_SINGULARITY_TIN", Items.MOMOTECH_METAL_SINGULARITY_TIN, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, tinSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_SINGULARITY_ZINC", Items.MOMOTECH_METAL_SINGULARITY_ZINC, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, zincSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_SINGULARITY_MAGNESIUM", Items.MOMOTECH_METAL_SINGULARITY_MAGNESIUM, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, magnesiumSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_SINGULARITY_SILVER", Items.MOMOTECH_METAL_SINGULARITY_SILVER, Items.MOMOTECH_MATERIALS, resourceCondenserRecipeType, silverSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_MAGNET", Items.MOMOTECH_MAGNET, Items.MOMOTECH_MATERIALS, magnetizerRecipeType, magnetRecipe);
        SfUtils.RegisterItem("MOMOTECH_WIRE_COIL", Items.MOMOTECH_WIRE_COIL, Items.MOMOTECH_MATERIALS, RecipeType.ENHANCED_CRAFTING_TABLE, wireCoilRecipe);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_SINGULARITY", Items.MOMOTECH_MINERAL_SINGULARITY, Items.MOMOTECH_MATERIALS, RecipeType.ENHANCED_CRAFTING_TABLE, mineralSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_METAL_SINGULARITY", Items.MOMOTECH_METAL_SINGULARITY, Items.MOMOTECH_MATERIALS, RecipeType.ENHANCED_CRAFTING_TABLE, metalSingularityRecipe);
        SfUtils.RegisterItem("MOMOTECH_ELECTROMAGNET", Items.MOMOTECH_ELECTROMAGNET, Items.MOMOTECH_MATERIALS, RecipeType.ENHANCED_CRAFTING_TABLE, electromagnetRecipe);
        SfUtils.RegisterItem("MOMOTECH_IRON_CORE", Items.MOMOTECH_IRON_CORE, Items.MOMOTECH_MATERIALS, RecipeType.ENHANCED_CRAFTING_TABLE, ironCoreRecipe);
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 3; j++) {
                SfUtils.RegisterItem("MOMOTECH_COMPRESSED_" + Utils.compressedMineralID[i] + "_" + Utils.fold[j], Items.MOMOTECH_COMPRESSED_MINERALS[i][j], Items.MOMOTECH_COMPRESSED_RESOURCES, RecipeType.ENHANCED_CRAFTING_TABLE, compressedMineralRecipe[i][j], (ItemUseHandler) PlayerRightClickEvent::cancel);
            }
        }
        ItemStack vanillaCobblestone = new ItemStack(Material.COBBLESTONE);
        ItemStack[] compressedCobblestone0Recipe = {
                vanillaCobblestone, vanillaCobblestone, vanillaCobblestone,
                vanillaCobblestone, nullItem, vanillaCobblestone,
                vanillaCobblestone, vanillaCobblestone, vanillaCobblestone
        };
        SfUtils.RegisterItem("MOMOTECH_COMPRESSED_COBBLESTONE_0", Items.MOMOTECH_COMPRESSED_COBBLESTONE[0], Items.MOMOTECH_COMPRESSED_RESOURCES, RecipeType.ENHANCED_CRAFTING_TABLE, compressedCobblestone0Recipe);
        for (int i = 1; i < 50; ++i) {
            SfUtils.RegisterItem("MOMOTECH_COMPRESSED_COBBLESTONE_" + i, Items.MOMOTECH_COMPRESSED_COBBLESTONE[i], Items.MOMOTECH_COMPRESSED_RESOURCES, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{compressedCobblestone[i - 1], compressedCobblestone[i - 1], compressedCobblestone[i - 1], compressedCobblestone[i - 1], compressedCobblestone[i - 1], compressedCobblestone[i - 1], compressedCobblestone[i - 1], compressedCobblestone[i - 1], compressedCobblestone[i - 1],null});
        }
        logger.info(MomoTech.languageManager.getInfo("items_registered_successfully"));
    }
    public static ItemStack addUnbreakable(ItemStack stack){
        ItemMeta meta=stack.getItemMeta();
        meta.setUnbreakable(true);
        stack.setItemMeta(meta);
        return stack;
    }
}
