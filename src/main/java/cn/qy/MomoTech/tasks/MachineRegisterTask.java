package cn.qy.MomoTech.tasks;

import cn.qy.MomoTech.GUI.AbstractResourceGeneratorGUI;
import cn.qy.MomoTech.GUI.InfinityDustExtractor;
import cn.qy.MomoTech.GUI.VirtualSpawner;
import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine.*;
import cn.qy.MomoTech.Items.Machines.BasicMachine.Machine.*;
import cn.qy.MomoTech.Items.Machines.ElectricMachine.*;
import cn.qy.MomoTech.Items.Machines.EndgameMachine.FinalCopier;
import cn.qy.MomoTech.Items.Machines.EndgameMachine.ItemConstructor;
import cn.qy.MomoTech.Items.Machines.EndgameMachine.RandomCopier;
import cn.qy.MomoTech.Items.Machines.EndgameMachine.UncontrollableVoidGenerator;
import cn.qy.MomoTech.Items.Machines.Other.*;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.Items.RandomizedItemStack;
import cn.qy.MomoTech.MomoTech;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

import static cn.qy.MomoTech.Items.MomotechItem.*;

public class MachineRegisterTask {
    public static void run(@NotNull Logger logger) {
        ItemStack[] digitConstructorRecipe = {
                nullItem, uncontrollableVoid, nullItem,
                quantum, primalMatterA, quantum,
                nullItem, eternalParticle, nullItem
        };
        ItemStack[] calculatorRecipe = {
                quantum,  protonIngot, entangledQuantum,
                SlimefunItems.BIG_CAPACITOR, eternalSingularity, SlimefunItems.BIG_CAPACITOR,
                incrementer, digitConstructor, incrementer
        };
        ItemStack[] symbolConstructorRecipe = {
                none, uncontrollableVoid, none,
                eternalSingularity, primalMatterA, eternalSingularity,
                none, quantum, none,
        };
        ItemStack[] incrementerRecipe = {
                none, symbolAddition, none,
                SlimefunItems.MAGIC_SUGAR, primalMatterA, SlimefunItems.MAGIC_SUGAR,
                uncontrollableVoid, uncontrollableVoid, uncontrollableVoid
        };
        ItemStack[] advancedNullGeneratorRecipe = {
                nullGenerator, eternalParticle, nullGenerator,
                nullGenerator, none, nullGenerator,
                none, none, none
        };
        ItemStack[] noneGeneratorRecipe = {
                new ItemStack(Material.DIRT), new ItemStack(Material.DIRT), new ItemStack(Material.DIRT),
                new ItemStack(Material.GLASS), none, new ItemStack(Material.GLASS),
                nullItem, nullItem, nullItem

        };
        ItemStack[] primalMatterConstructorRecipe = {
                new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE),
                new ItemStack(Material.GLASS), none, new ItemStack(Material.GLASS),
                nullItem, nullItem, nullItem

        };
        ItemStack[] quantumConstructorRecipe = {
                primalMatterA, entangledQuantum, primalMatterB,
                qyhb05, eternalSingularity, chenmose,
                primalMatterConstructor, uncontrollableVoid, noneConstructor
        };
        ItemStack[] nullGeneratorRecipe = {
                none, uncontrollableVoid, none,
                none, uncontrollableVoid, none,
                none, none, none
        };
        ItemStack[] infinityGeneratorRecipe = {
                quantumBox, compressedCobblestone[3], quantumSingularity,
                none, randomQuantum, none,
                infinitySingularity, infinityMachineCore, infinitySingularity
        };
        ItemStack[] finalCopierRecipe = {
                finalCore, supremeCore, finalCore,
                concept, randomCopier, concept,
                finalCore, quantumSingularity, finalCore
        };
        ItemStack[] uncontrollableVoidGeneratorRecipe = {
                quantumBox, quantumSingularity, quantumBox,
                bugCrystal, concept, bugCrystal,
                nullGenerator, primalMatterY, nullGenerator
        };
        ItemStack[] compressedMineralQuarryRecipe = {
                chenmose, supremeCore, chenmose,
                integratedMachineCore, quantumBox, integratedMachineCore,
                chenmose, quantumSingularity, chenmose
        };
        ItemStack[] randomCopierRecipe = {
                bugCrystal, concept, bugCrystal,
                supremeCore, quantumSingularity, supremeCore,
                finalCore, finalCore, finalCore
        };
        ItemStack[] advancedCobblestoneGeneratorRecipe = {
                cobblestoneGenerator, cobblestoneGenerator, cobblestoneGenerator,
                cobblestoneGenerator, null, cobblestoneGenerator,
                cobblestoneGenerator, cobblestoneGenerator, cobblestoneGenerator
        };
        ItemStack[] stoneGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                uncontrollableVoid, new ItemStack(Material.STONE), uncontrollableVoid,
                primalMatterA, uncontrollableVoid, primalMatterB,
        };
        ItemStack[] cobblestoneGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                uncontrollableVoid, new ItemStack(Material.COBBLESTONE), uncontrollableVoid,
                primalMatterA, new ItemStack(Material.IRON_PICKAXE), primalMatterB,
        };
        ItemStack[] fishGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                uncontrollableVoid, new ItemStack(Material.FISHING_ROD), uncontrollableVoid,
                primalMatterA, uncontrollableVoid, primalMatterB,
        };
        ItemStack[] sandGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                uncontrollableVoid, new ItemStack(Material.SAND), uncontrollableVoid,
                primalMatterA, uncontrollableVoid, primalMatterB,
        };
        ItemStack[] templateGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                uncontrollableVoid, new ItemStack(Material.DIAMOND), uncontrollableVoid,
                primalMatterA, uncontrollableVoid, primalMatterB,
        };
        ItemStack[] oreGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                lightAndDarkIngot, new ItemStack(Material.DIAMOND_BLOCK), lightAndDarkIngot,
                primalMatterA, integratedMachineCore, primalMatterB,
        };
        ItemStack[] glassGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                uncontrollableVoid, new ItemStack(Material.GLASS), uncontrollableVoid,
                primalMatterA, uncontrollableVoid, primalMatterB,
        };
        ItemStack[] froglightGeneratorRecipe = {
                primalMatterB, none, primalMatterA,
                uncontrollableVoid, new ItemStack(Material.DIAMOND_SWORD), uncontrollableVoid,
                primalMatterA, uncontrollableVoid, primalMatterB,
        };
        ItemStack[] dustGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                SlimefunItems.CARBONADO_EDGED_CAPACITOR, new ItemStack(Material.GRAVEL), SlimefunItems.CARBONADO_EDGED_CAPACITOR,
                primalMatterA, uncontrollableVoid, primalMatterB,
        };
        ItemStack[] stringGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                uncontrollableVoid, new ItemStack(Material.STRING), uncontrollableVoid,
                primalMatterA, uncontrollableVoid, primalMatterB,
        };
        ItemStack[] stoneChunkGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                uncontrollableVoid, SlimefunItems.STONE_CHUNK, uncontrollableVoid,
                primalMatterA, integratedMachineCore, primalMatterB,
        };
        ItemStack[] iceGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                uncontrollableVoid, new ItemStack(Material.WATER_BUCKET), uncontrollableVoid,
                primalMatterA, nullItem, primalMatterB,
        };
        ItemStack[] carbonGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                uncontrollableVoid, SlimefunItems.CARBON, uncontrollableVoid,
                primalMatterA, uncontrollableVoid, primalMatterB,
        };
        ItemStack[] commandBlockGeneratorRecipe = {
                primalMatterY, quantumBox, primalMatterY,
                infinityMachineCore, fakeCommandBlock, infinityMachineCore,
                primalMatterY, integratedMachineCore, primalMatterY,
        };
        ItemStack[] basicGeneratorRecipe = {
                primalMatterB, eternalParticle, primalMatterA,
                entangledQuantum, nullItem, entangledQuantum,
                qyhb05, SlimefunItems.MAGIC_SUGAR, qyhb05
        };
        ItemStack[] spiderEyeGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                uncontrollableVoid, new ItemStack(Material.SPIDER_EYE), uncontrollableVoid,
                primalMatterA, uncontrollableVoid, primalMatterB,
        };
        ItemStack[] beeGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                uncontrollableVoid, SlimefunItems.MAGIC_SUGAR, uncontrollableVoid,
                primalMatterA, uncontrollableVoid, primalMatterB,
        };
        ItemStack[] prismarineGeneratorRecipe = {
                primalMatterB, SlimefunItems.LARGE_CAPACITOR, primalMatterA,
                uncontrollableVoid, new ItemStack(Material.DIAMOND_SHOVEL), uncontrollableVoid,
                primalMatterA, uncontrollableVoid, primalMatterB,
        };
        ItemStack[] chestGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                uncontrollableVoid, new ItemStack(Material.ENDER_CHEST), uncontrollableVoid,
                primalMatterA, uncontrollableVoid, primalMatterB,
        };
        ItemStack[] diamondPickaxeGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                uncontrollableVoid, new ItemStack(Material.NETHERITE_PICKAXE), uncontrollableVoid,
                primalMatterA, uncontrollableVoid, primalMatterB,
        };
        ItemStack[] lightAndDarkCollectorRecipe = {
                purePrimalMatter, integratedMachineCore, purePrimalMatter,
                magnet, magnet, magnet,
                nullItem, new ItemStack(Material.NETHERITE_PICKAXE), nullItem
        };
        ItemStack[] highspeedGeoMinerRecipe = {
                infinityIngot, infinityMachineCore, infinityIngot,
                qyhb05, entangledQuantum, chenmose,
                infinityIngot, SlimefunItems.GEO_MINER, infinityIngot
        };
        ItemStack[] teleporterRecipe = {
                uncontrollableVoid, null, uncontrollableVoid,
                null, new ItemStack(Material.PISTON), null,
                uncontrollableVoid, null, uncontrollableVoid
        };
        ItemStack[] quantumBoxOpenerRecipe = {
                entangledQuantum, nullItem, entangledQuantum,
                nullItem, nullItem, nullItem,
                none, none, none
        };
        ItemStack[] resourceCondenserRecipe = {
                uncontrollableVoid, magnet, uncontrollableVoid,
                qyhb05,  protonIngot, chenmose,
                electromagnet, electromagnet, electromagnet
        };
        ItemStack[] magnetizerRecipe = {
                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.ELECTRIC_MOTOR,
                electromagnet, electromagnet, electromagnet,
                none, uncontrollableVoid, none
        };
        ItemStack[] electromagnetFactoryRecipe = {
                lightEssence,  protonIngot, darkEssence,
                eternalSingularity, quantumBox, eternalSingularity,
                uncontrollableVoid, lightAndDarkIngot, uncontrollableVoid
        };
        ItemStack[] lightAndDarkGeneratorRecipe = {
                lightAndDarkIngot, infinityIngot, lightAndDarkIngot,
                lightAndDarkIngot, SlimefunItems.SOLAR_GENERATOR_4, lightAndDarkIngot,
                qyhb05, quantumSingularity, chenmose
        };
        ItemStack[] starterGeneratorRecipe = {
                uncontrollableVoid, qyhb05, uncontrollableVoid,
                uncontrollableVoid, magnet, uncontrollableVoid,
                none, none, none
        };
        ItemStack[] netheritePickaxeFactoryRecipe = {
                new ItemStack(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE), magnet, new ItemStack(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                electromagnet, null, electromagnet,
                uncontrollableVoid, uncontrollableVoid, uncontrollableVoid
        };
        ItemStack[] characterConstructorRecipe = {
                primalMatterY, entangledQuantum, primalMatterY,
                new ItemStack(Material.REPEATING_COMMAND_BLOCK), quantumSingularity, new ItemStack(Material.CHAIN_COMMAND_BLOCK),
                uncontrollableVoid, eternalSingularity, uncontrollableVoid
        };
        ItemStack[] IDWriterRecipe = {
                quantumSingularity, eternalSingularity, quantumSingularity,
                entangledQuantum, new ItemStack(Material.COMMAND_BLOCK), entangledQuantum,
                primalMatterA, primalMatterB, primalMatterY
        };
        ItemStack[] ItemConstructorRecipe = {
                concept, finalCore, concept,
                finalCore, finalCore, finalCore,
                concept, finalCore, concept
        };
        ItemStack[] stoneStorageRecipe = {
                new ItemStack(Material.COBBLESTONE), nullItem, new ItemStack(Material.COBBLESTONE),
                nullItem, null, nullItem,
                new ItemStack(Material.COBBLESTONE), nullItem, new ItemStack(Material.COBBLESTONE)
        };
        ItemStack[] infinityCobblestoneGeneratorRecipe = {
                infinityIngot, eternalSingularity, infinityIngot,
                chenmose, compressedCobblestone[4], chenmose,
                eternalParticle, bugggg, eternalParticle
        };
        ItemStack[] fiftyfoldCompressedCobblestoneGeneratorRecipe = {
                quantumBox, quantumBox, quantumBox,
                compressedCobblestone[9], compressedCobblestone[19], compressedCobblestone[9],
                none, resource, none
        };
        ItemStack[] pumpkinCarvingMachineRecipe = {
                uncontrollableVoid, uncontrollableVoid, uncontrollableVoid,
                SlimefunItems.ELECTRIC_MOTOR, null, SlimefunItems.ELECTRIC_MOTOR,
                nullItem, none, nullItem
        };
        ItemStack[] equipmentRepairingMachineRecipe = {
                quantum, integratedMachineCore, quantum,
                uncontrollableVoid, new ItemStack(Material.IRON_BLOCK), uncontrollableVoid,
                bugggg, quantumSingularity, bugggg
        };
        ItemStack[] flintGeneratorRecipe = {
                primalMatterB, integratedMachineCore, primalMatterA,
                uncontrollableVoid, new ItemStack(Material.FLINT_AND_STEEL), uncontrollableVoid,
                primalMatterA, uncontrollableVoid, primalMatterB,
        };
        ItemStack[] infinityLightAndDarkCollectorRecipe = {
                lightAndDarkCollector, infinityMachineCore, lightAndDarkCollector,
                qyhb05, quantumSingularity, chenmose,
                eternalSingularity, bugggg, eternalParticle,
        };
        ItemStack[] entropyReconstructorRecipe = {
                uncontrollableVoid, uncontrollableVoid, uncontrollableVoid,
                entangledQuantum, bugggg, entangledQuantum,
                lightEssence, integratedMachineCore, darkEssence
        };
        ItemStack[] infinityEntropyReconstructorRecipe = {
                lightAndDarkIngot, infinityMachineCore, lightAndDarkIngot,
                bugggg, entropyReconstructor, bugggg,
                primalMatterY, quantumSingularity, eternalParticle
        };
        ItemStack[] infinityDustExtractorRecipe = {
                dustGenerator, dustGenerator, dustGenerator,
                infinityIngot, uncontrollableVoid, infinityIngot,
                lightAndDarkIngot, infinityMachineCore, lightAndDarkIngot
        };
        ItemStack[] infinityAluminumDustExtractorRecipe = {
                SlimefunItems.ALUMINUM_DUST, infinityIngot, SlimefunItems.ALUMINUM_DUST,
                nullItem, infinityDustExtractor, nullItem,
                none, none, none
        };
        ItemStack[] infinityMagnesiumDustExtractorRecipe = {
                SlimefunItems.MAGNESIUM_DUST, infinityIngot, SlimefunItems.MAGNESIUM_DUST,
                nullItem, infinityDustExtractor, nullItem,
                none, none, none
        };
        ItemStack[] infinityCopperDustExtractorRecipe = {
                SlimefunItems.COPPER_DUST, infinityIngot, SlimefunItems.COPPER_DUST,
                nullItem, infinityDustExtractor, nullItem,
                none, none, none
        };
        ItemStack[] infinityGoldDustExtractorRecipe = {
                SlimefunItems.GOLD_DUST, infinityIngot, SlimefunItems.GOLD_DUST,
                nullItem, infinityDustExtractor, nullItem,
                none, none, none
        };
        ItemStack[] infinitySilverDustExtractorRecipe = {
                SlimefunItems.SILVER_DUST, infinityIngot, SlimefunItems.SILVER_DUST,
                nullItem, infinityDustExtractor, nullItem,
                none, none, none
        };
        ItemStack[] infinityLeadDustExtractorRecipe = {
                SlimefunItems.LEAD_DUST, infinityIngot, SlimefunItems.LEAD_DUST,
                nullItem, infinityDustExtractor, nullItem,
                none, none, none
        };
        ItemStack[] infinityTinDustExtractorRecipe = {
                SlimefunItems.TIN_DUST, infinityIngot, SlimefunItems.TIN_DUST,
                nullItem, infinityDustExtractor, nullItem,
                none, none, none
        };
        ItemStack[] infinityZincDustExtractorRecipe = {
                SlimefunItems.ZINC_DUST, infinityIngot, SlimefunItems.ZINC_DUST,
                nullItem, infinityDustExtractor, nullItem,
                none, none, none
        };
        ItemStack[] infinityIronDustExtractorRecipe = {
                SlimefunItems.IRON_DUST, infinityIngot, SlimefunItems.IRON_DUST,
                nullItem, infinityDustExtractor, nullItem,
                none, none, none
        };
        ItemStack[] infinityUraniumExtractorRecipe = {
                lightAndDarkIngot, infinityMachineCore, lightAndDarkIngot,
                purePrimalMatter, quantumSingularity, purePrimalMatter,
                SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.ELECTRIC_ORE_GRINDER_3
        };
        ItemStack[] primalMatterGeneratorRecipe = {
                entangledQuantum, quantumSingularity, entangledQuantum,
                mineralSingularity, lightAndDarkIngot, metalSingularity,
                eternalParticle, compressedCobblestone[2], eternalParticle
        };
        ItemStack[] infinityNuclearReactor = {
                SlimefunItems.NETHER_STAR_REACTOR, SlimefunItems.NUCLEAR_REACTOR, SlimefunItems.NETHER_STAR_REACTOR,
                lightAndDarkIngot, infinityMachineCore, lightAndDarkIngot,
                purePrimalMatter, quantumSingularity, purePrimalMatter
        };
        ItemStack[] virtualSpawnerOverworldMobsRecipe = {
                infinitySingularity, infinityMachineCore, infinitySingularity,
                lightAndDarkIngot, infinityIngot, lightAndDarkIngot,
                compressedCobblestone[3], new ItemStack(Material.ROTTEN_FLESH), compressedCobblestone[3]
        };
        ItemStack[] virtualSpawnerAquaticAnimalsRecipe = {
                infinitySingularity, infinityMachineCore, infinitySingularity,
                lightAndDarkIngot, infinityIngot, lightAndDarkIngot,
                compressedCobblestone[3], new ItemStack(Material.FISHING_ROD), compressedCobblestone[3]
        };
        ItemStack[] virtualSpawnerZombifiedPiglinRecipe = {
                infinitySingularity, infinityMachineCore, infinitySingularity,
                lightAndDarkIngot, infinityIngot, lightAndDarkIngot,
                compressedCobblestone[3], new ItemStack(Material.GOLD_BLOCK), compressedCobblestone[3]
        };
        ItemStack[] virtualSpawnerEndermanRecipe = {
                infinitySingularity, infinityMachineCore, infinitySingularity,
                lightAndDarkIngot, infinityIngot, lightAndDarkIngot,
                compressedCobblestone[3], new ItemStack(Material.ENDER_CHEST), compressedCobblestone[3]
        };
        ItemStack[] virtualSpawnerCreeperRecipe = {
                infinitySingularity, infinityMachineCore, infinitySingularity,
                lightAndDarkIngot, infinityIngot, lightAndDarkIngot,
                compressedCobblestone[3], new ItemStack(Material.GUNPOWDER), compressedCobblestone[3]
        };
        ItemStack[] virtualSpawnerDrownedRecipe = {
                infinitySingularity, infinityMachineCore, infinitySingularity,
                lightAndDarkIngot, infinityIngot, lightAndDarkIngot,
                compressedCobblestone[3], new ItemStack(Material.COPPER_BLOCK), compressedCobblestone[3]
        };
        ItemStack[] virtualSpawnerAnimalsRecipe = {
                infinitySingularity, infinityMachineCore, infinitySingularity,
                lightAndDarkIngot, infinityIngot, lightAndDarkIngot,
                compressedCobblestone[3], new ItemStack(Material.EGG), compressedCobblestone[3]
        };
        ItemStack[] virtualSpawnerSlimeRecipe = {
                infinitySingularity, infinityMachineCore, infinitySingularity,
                lightAndDarkIngot, infinityIngot, lightAndDarkIngot,
                compressedCobblestone[3], new ItemStack(Material.SLIME_BLOCK), compressedCobblestone[3]
        };
        ItemStack[] virtualSpawnerBlazeRecipe = {
                infinitySingularity, infinityMachineCore, infinitySingularity,
                lightAndDarkIngot, infinityIngot, lightAndDarkIngot,
                compressedCobblestone[3], new ItemStack(Material.BLAZE_ROD), compressedCobblestone[3]
        };
        ItemStack[] virtualSpawnerMagmaCubeRecipe = {
                infinitySingularity, infinityMachineCore, infinitySingularity,
                lightAndDarkIngot, infinityIngot, lightAndDarkIngot,
                compressedCobblestone[3], new ItemStack(Material.MAGMA_CREAM), compressedCobblestone[3]
        };
        ItemStack[] infinityResourceCondenserRecipe = {
                infinityIngot, MomotechItem.resourceCondenser, infinityIngot,
                uncontrollableVoid, infinityMachineCore, uncontrollableVoid,
                chenmose, infinitySingularity, qyhb05
        };
        ItemStack[] infinityMinerRecipe = {
                infinityIngot, infinityIngot, infinityIngot,
                infinitySingularity, mineralSingularity, infinitySingularity,
                lightAndDarkIngot, lightAndDarkIngot, lightAndDarkIngot
        };
        ItemStack[] infinityMinerMineralBlockRecipe = {
                infinityIngot, infinityIngot, infinityIngot,
                infinitySingularity, infinityMiner, infinitySingularity,
                lightAndDarkIngot, lightAndDarkIngot, lightAndDarkIngot
        };
        ItemStack[] infinityGeoMinerRecipe = {
                infinityMachineCore, infinityIngot, infinityMachineCore,
                highspeedGeoMiner, highspeedGeoMiner, highspeedGeoMiner,
                lightAndDarkIngot, lightAndDarkIngot, lightAndDarkIngot
        };
        ItemStack[] infinityTreeGrowthChamberRecipe = {
                infinityIngot, SlimefunItems.TREE_GROWTH_ACCELERATOR, infinityIngot,
                infinitySingularity, lightAndDarkIngot, infinitySingularity,
                uncontrollableVoid, uncontrollableVoid, uncontrollableVoid
        };
        ItemStack[] infinityPlantGrowthChamberRecipe = {
                infinityIngot, SlimefunItems.CROP_GROWTH_ACCELERATOR, infinityIngot,
                infinitySingularity, lightAndDarkIngot, infinitySingularity,
                uncontrollableVoid, uncontrollableVoid, uncontrollableVoid
        };
        ItemStack[] randomQuantumGeneratorRecipe = {
                uncontrollableVoid, uncontrollableVoid, uncontrollableVoid,
                SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.REINFORCED_PLATE, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                quantum, quantum, quantum
        };
        ItemStack[] quantumChargingMachineRecipe = {
                entangledQuantum, eternalSingularity, entangledQuantum,
                uncontrollableVoid, quantumSingularity, uncontrollableVoid,
                SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.ENERGIZED_CAPACITOR
        };
        ItemStack[] endgameGeneratorRecipe = {
                infinityMachineCore, resource, infinityMachineCore,
                quantumSingularity, primalMatterY, quantumSingularity,
                randomQuantum, randomQuantum, randomQuantum
        };
        ItemStack[] infinityIngotFormerRecipe = {
                infinityIngot, infinityIngot, infinityIngot,
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
                infinityIngot, infinityMachineCore, infinityIngot
        };
        ItemStack[] endgameCapacitorRecipe = {
                infinityIngot, infinityIngot, infinityIngot,
                infinityIngot, qyhb05, infinityIngot,
                infinityIngot, infinityIngot, infinityIngot
        };
        ItemStack[] energyDevourerRecipe = {
                null, nullItem, null,
                nullItem, new ItemStack(Material.COBBLESTONE, 64), nullItem,
                null, nullItem, null
        };
        ItemStack[] itemResetterRecipe = {
                nullItem, nullItem, nullItem,
                null, null, null,
                null, null, null
        };
        ItemStack[] eternalParticleConstructorRecipe = {
                entangledQuantum, entangledQuantum, entangledQuantum,
                entangledQuantum, SlimefunItems.GPS_TRANSMITTER_3, randomQuantum,
                randomQuantum, randomQuantum, randomQuantum
        };
        ItemStack[] particleCollectorRecipe = {
                integratedMachineCore, entangledQuantum, integratedMachineCore,
                quantum, uncontrollableVoid, quantum,
                integratedMachineCore, quantum, integratedMachineCore
        };
        ItemStack[] digitalGeneratorRecipe = {
                eternalSingularity, eternalParticle, eternalSingularity,
                eternalSingularity, bugCrystal, eternalSingularity,
                eternalSingularity, eternalParticle, eternalSingularity
        };
        ItemStack[] highpressureCompressorRecipe = {
                eternalSingularity, entangledQuantum, eternalSingularity,
                uncontrollableVoid, SlimefunItems.CARBON_PRESS_3, uncontrollableVoid,
                randomQuantum, electromagnet, chargedQuantum
        };
        ItemStack[] cosmicSupremeBlablaGeneratorRecipe = {
                nullItem, new ItemStack(Material.COBBLESTONE), nullItem,
                null, null, null,
                nullItem, nullItem, nullItem
        };
        ItemStack[] saltQuarryRecipe = {
                nullItem, lightAndDarkIngot, nullItem,
                lightAndDarkIngot, null, lightAndDarkIngot,
                none, none, none
        };
        ItemStack[] alloyFabricatorRecipe = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_SMELTERY_2, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
                SlimefunItems.ELECTRIC_SMELTERY_2, quantumBox, SlimefunItems.ELECTRIC_SMELTERY_2,
                integratedMachineCore, lightAndDarkIngot, integratedMachineCore
        };
        new AlloyFabricator(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_ALLOY_FABRICATOR", Items.MOMOTECH_ALLOY_FABRICATOR, RecipeType.ANCIENT_ALTAR, alloyFabricatorRecipe).register(MomoTech.getInstance());
        new CosmicSupremeBlablaGenerator(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_COSMIC_SUPREME_BLABLA_GENERATOR", Items.MOMOTECH_COSMIC_SUPREME_BLABLA_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, cosmicSupremeBlablaGeneratorRecipe).register(MomoTech.getInstance());
        new ParticleCollector(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_PARTICLE_COLLECTOR", Items.MOMOTECH_PARTICLE_COLLECTOR, RecipeType.ENHANCED_CRAFTING_TABLE, particleCollectorRecipe).register(MomoTech.getInstance());
        new DigitalCapacitor(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_DIGITAL_CAPACITOR", Items.MOMOTECH_DIGITAL_CAPACITOR, RecipeType.ENHANCED_CRAFTING_TABLE, digitalGeneratorRecipe).register(MomoTech.getInstance());
        new EternalParticleConstructor(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_ETERNAL_PARTICLE_CONSTUCTOR", Items.MOMOTECH_ETERNAL_PARTICLE_CONSTUCTOR, RecipeType.ANCIENT_ALTAR, eternalParticleConstructorRecipe).register(MomoTech.getInstance());
        new ItemResetter(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_ITEM_RESETTER", Items.MOMOTECH_ITEM_RESETTER, RecipeType.ENHANCED_CRAFTING_TABLE, itemResetterRecipe).register(MomoTech.getInstance());
        new HighpressureCompressor(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_HIGHPRESSURE_COMPRESSOR", Items.MOMOTECH_HIGHPRESSURE_COMPRESSOR, RecipeType.ANCIENT_ALTAR, highpressureCompressorRecipe).register(MomoTech.getInstance());
        new EnergyDevourer(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_ENERGY_DEVOURER", Items.MOMOTECH_ENERGY_DEVOURER, RecipeType.ENHANCED_CRAFTING_TABLE, energyDevourerRecipe).register(MomoTech.getInstance());
        new InfinityIngotFormer(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_INGOT_FORMER", Items.MOMOTECH_INFINITY_INGOT_FORMER, RecipeType.ANCIENT_ALTAR, infinityIngotFormerRecipe).register(MomoTech.getInstance());
        new EndgameCapacitor(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_ENDGAME_CAPACITOR", Items.MOMOTECH_ENDGAME_CAPACITOR, RecipeType.ANCIENT_ALTAR, endgameCapacitorRecipe).register(MomoTech.getInstance());
        new EndgameGenerator(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_ENDGAME_GENERATOR", Items.MOMOTECH_ENDGAME_GENERATOR, RecipeType.ANCIENT_ALTAR, endgameGeneratorRecipe).register(MomoTech.getInstance());
        new SaltQuarry(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_SALT_QUARRY", Items.MOMOTECH_SALT_QUARRY, RecipeType.ANCIENT_ALTAR, saltQuarryRecipe).register(MomoTech.getInstance());
        new InfinityResourceCondenser(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_RESOURCE_CONDENSER", Items.MOMOTECH_INFINITY_RESOURCE_CONDENSER, RecipeType.ENHANCED_CRAFTING_TABLE, infinityResourceCondenserRecipe).register(MomoTech.getInstance());
        new VirtualSpawner(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_VIRTUAL_SPAWNER_OVERWORLD_MOBS", Items.MOMOTECH_VIRTUAL_SPAWNER_OVERWORLD_MOBS, RecipeType.ANCIENT_ALTAR, virtualSpawnerOverworldMobsRecipe, new Material[]{Material.BONE, Material.CARROT, Material.POTATO, Material.STRING, Material.IRON_INGOT,
                Material.GUNPOWDER, Material.ROTTEN_FLESH, Material.SPIDER_EYE, Material.GLOWSTONE_DUST, Material.REDSTONE,
                Material.STICK, Material.GLASS_BOTTLE}).register(MomoTech.getInstance());
        new VirtualSpawner(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_VIRTUAL_SPAWNER_AQUATIC_ANIMALS", Items.MOMOTECH_VIRTUAL_SPAWNER_AQUATIC_ANIMALS, RecipeType.ANCIENT_ALTAR, virtualSpawnerAquaticAnimalsRecipe,new Material[] {Material.COD, Material.SALMON, Material.PUFFERFISH, Material.TROPICAL_FISH, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD, Material.INK_SAC, Material.GLOW_INK_SAC}).register(MomoTech.getInstance());
        new VirtualSpawner(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_VIRTUAL_SPAWNER_ZOMBIFIED_PIGLIN", Items.MOMOTECH_VIRTUAL_SPAWNER_ZOMBIFIED_PIGLIN, RecipeType.ANCIENT_ALTAR, virtualSpawnerZombifiedPiglinRecipe,new Material[] {Material.ROTTEN_FLESH, Material.GOLD_INGOT, Material.GOLD_NUGGET}).register(MomoTech.getInstance());
        new VirtualSpawner(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_VIRTUAL_SPAWNER_ENDERMAN", Items.MOMOTECH_VIRTUAL_SPAWNER_ENDERMAN, RecipeType.ANCIENT_ALTAR, virtualSpawnerEndermanRecipe,new Material[] {Material.ENDER_EYE, Material.ENDER_PEARL}).register(MomoTech.getInstance());
        new VirtualSpawner(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_VIRTUAL_SPAWNER_CREEPER", Items.MOMOTECH_VIRTUAL_SPAWNER_CREEPER, RecipeType.ANCIENT_ALTAR, virtualSpawnerCreeperRecipe,new Material[] {Material.GUNPOWDER}).register(MomoTech.getInstance());
        new VirtualSpawner(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_VIRTUAL_SPAWNER_DROWNED", Items.MOMOTECH_VIRTUAL_SPAWNER_DROWNED, RecipeType.ANCIENT_ALTAR, virtualSpawnerDrownedRecipe,new Material[] {Material.ROTTEN_FLESH, Material.COPPER_INGOT, Material.NAUTILUS_SHELL}).register(MomoTech.getInstance());
        new VirtualSpawner(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_VIRTUAL_SPAWNER_ANIMALS", Items.MOMOTECH_VIRTUAL_SPAWNER_ANIMALS, RecipeType.ANCIENT_ALTAR, virtualSpawnerAnimalsRecipe,new Material[] {Material.BEEF, Material.CHICKEN, Material.MUTTON, Material.LEATHER, Material.FEATHER, Material.WHITE_WOOL, Material.PORKCHOP, Material.EGG}).register(MomoTech.getInstance());
        new VirtualSpawner(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_VIRTUAL_SPAWNER_SLIME", Items.MOMOTECH_VIRTUAL_SPAWNER_SLIME, RecipeType.ANCIENT_ALTAR, virtualSpawnerSlimeRecipe,new Material[] {Material.SLIME_BALL, Material.SLIME_BLOCK}).register(MomoTech.getInstance());
        new VirtualSpawner(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_VIRTUAL_SPAWNER_BLAZE", Items.MOMOTECH_VIRTUAL_SPAWNER_BLAZE, RecipeType.ANCIENT_ALTAR, virtualSpawnerBlazeRecipe,new Material[] {Material.BLAZE_POWDER, Material.BLAZE_ROD}).register(MomoTech.getInstance());
        new VirtualSpawner(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_VIRTUAL_SPAWNER_MAGMA_CUBE", Items.MOMOTECH_VIRTUAL_SPAWNER_MAGMA_CUBE, RecipeType.ANCIENT_ALTAR, virtualSpawnerMagmaCubeRecipe,new Material[] {Material.MAGMA_CREAM}).register(MomoTech.getInstance());
        new InfinityDustExtractor(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_DUST_EXTRACTOR", Items.MOMOTECH_INFINITY_DUST_EXTRACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, infinityDustExtractorRecipe,new RandomizedItemStack(64,SlimefunItems.ALUMINUM_DUST, SlimefunItems.COPPER_DUST, SlimefunItems.GOLD_DUST, SlimefunItems.LEAD_DUST, SlimefunItems.IRON_DUST, SlimefunItems.SILVER_DUST, SlimefunItems.TIN_DUST, SlimefunItems.ZINC_DUST, SlimefunItems.MAGNESIUM_DUST)).register(MomoTech.getInstance());
        new InfinityDustExtractor(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_DUST_EXTRACTOR_ALUMINUM", Items.MOMOTECH_INFINITY_DUST_EXTRACTOR_ALUMINUM, RecipeType.ENHANCED_CRAFTING_TABLE, infinityAluminumDustExtractorRecipe,new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 64)).register(MomoTech.getInstance());
        new InfinityDustExtractor(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_DUST_EXTRACTOR_MAGNESIUM", Items.MOMOTECH_INFINITY_DUST_EXTRACTOR_MAGNESIUM, RecipeType.ENHANCED_CRAFTING_TABLE, infinityMagnesiumDustExtractorRecipe,new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 64)).register(MomoTech.getInstance());
        new InfinityDustExtractor(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_DUST_EXTRACTOR_COPPER", Items.MOMOTECH_INFINITY_DUST_EXTRACTOR_COPPER, RecipeType.ENHANCED_CRAFTING_TABLE, infinityCopperDustExtractorRecipe,new SlimefunItemStack(SlimefunItems.COPPER_DUST ,64)).register(MomoTech.getInstance());
        new InfinityDustExtractor(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_DUST_EXTRACTOR_GOLD", Items.MOMOTECH_INFINITY_DUST_EXTRACTOR_GOLD, RecipeType.ENHANCED_CRAFTING_TABLE, infinityGoldDustExtractorRecipe,new SlimefunItemStack(SlimefunItems .GOLD_DUST,64)).register(MomoTech.getInstance());
        new InfinityDustExtractor(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_DUST_EXTRACTOR_SILVER", Items.MOMOTECH_INFINITY_DUST_EXTRACTOR_SILVER, RecipeType.ENHANCED_CRAFTING_TABLE, infinitySilverDustExtractorRecipe,new SlimefunItemStack(SlimefunItems.SILVER_DUST ,64)).register(MomoTech.getInstance());
        new InfinityDustExtractor(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_DUST_EXTRACTOR_LEAD", Items.MOMOTECH_INFINITY_DUST_EXTRACTOR_LEAD, RecipeType.ENHANCED_CRAFTING_TABLE, infinityLeadDustExtractorRecipe,new SlimefunItemStack(SlimefunItems.LEAD_DUST ,64)).register(MomoTech.getInstance());
        new InfinityDustExtractor(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_DUST_EXTRACTOR_TIN", Items.MOMOTECH_INFINITY_DUST_EXTRACTOR_TIN, RecipeType.ENHANCED_CRAFTING_TABLE, infinityTinDustExtractorRecipe,new SlimefunItemStack(SlimefunItems.TIN_DUST ,64)).register(MomoTech.getInstance());
        new InfinityDustExtractor(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_DUST_EXTRACTOR_ZINC", Items.MOMOTECH_INFINITY_DUST_EXTRACTOR_ZINC, RecipeType.ENHANCED_CRAFTING_TABLE, infinityZincDustExtractorRecipe,new SlimefunItemStack(SlimefunItems.ZINC_DUST ,64)).register(MomoTech.getInstance());
        new InfinityDustExtractor(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_DUST_EXTRACTOR_IRON", Items.MOMOTECH_INFINITY_DUST_EXTRACTOR_IRON, RecipeType.ENHANCED_CRAFTING_TABLE, infinityIronDustExtractorRecipe,new SlimefunItemStack(SlimefunItems.IRON_DUST ,64)).register(MomoTech.getInstance());
        new InfinityMiner(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_MINER", Items.MOMOTECH_INFINITY_MINER, RecipeType.ANCIENT_ALTAR, infinityMinerRecipe).register(MomoTech.getInstance());
        new InfinityMinerMineralBlock(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_MINER_MINERAL_BLOCK", Items.MOMOTECH_INFINITY_MINER_MINERAL_BLOCK, RecipeType.ANCIENT_ALTAR, infinityMinerMineralBlockRecipe).register(MomoTech.getInstance());
        new InfinityTreeGrowthChamber(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_TREE_GROWTH_CHAMBER", Items.MOMOTECH_INFINITY_TREE_GROWTH_CHAMBER, RecipeType.ENHANCED_CRAFTING_TABLE, infinityTreeGrowthChamberRecipe).register(MomoTech.getInstance());
        new InfinityPlantGrowthChamber(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_PLANT_GROWTH_CHAMBER", Items.MOMOTECH_INFINITY_PLANT_GROWTH_CHAMBER, RecipeType.ENHANCED_CRAFTING_TABLE, infinityPlantGrowthChamberRecipe).register(MomoTech.getInstance());
        new InfinityNuclearReactor(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_NUCLEAR_REACTOR", Items.MOMOTECH_INFINITY_NUCLEAR_REACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, infinityNuclearReactor).register(MomoTech.getInstance());
        new InfinityUraniumExtractor(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_URANIUM_EXTRACTOR", Items.MOMOTECH_INFINITY_URANIUM_EXTRACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, infinityUraniumExtractorRecipe).register(MomoTech.getInstance());
        new PrimalMatterGenerator(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_PRIMAL_MATTER_GENERATOR", Items.MOMOTECH_PRIMAL_MATTER_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, primalMatterGeneratorRecipe).register(MomoTech.getInstance());
        new InfinityEntropyReconstructor(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_ENTROPY_RECONSTRUCTOR", Items.MOMOTECH_INFINITY_ENTROPY_RECONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, infinityEntropyReconstructorRecipe).register(MomoTech.getInstance());
        new EntropyReconstructor(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_ENTROPY_RECONSTRUCTOR", Items.MOMOTECH_ENTROPY_RECONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, entropyReconstructorRecipe).register(MomoTech.getInstance());
        new InfinityLightAndDarkCollector(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_LIGHT_AND_DARK_COLLECTOR", Items.MOMOTECH_INFINITY_LIGHT_AND_DARK_COLLECTOR, RecipeType.ENHANCED_CRAFTING_TABLE, infinityLightAndDarkCollectorRecipe).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_FLINT_GENERATOR", Items.MOMOTECH_FLINT_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, flintGeneratorRecipe,"ABSTRACT_GENERATOR",new ItemStack(Material.FLINT, 4)).register(MomoTech.getInstance());
        new StarterGenerator(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_STARTER_GENERATOR", Items.MOMOTECH_STARTER_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, starterGeneratorRecipe).register(MomoTech.getInstance());
        new LightAndDarkCollector(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_LIGHT_AND_DARK_GENERATOR", Items.MOMOTECH_LIGHT_AND_DARK_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, lightAndDarkGeneratorRecipe).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_CHEST_GENERATOR", Items.MOMOTECH_CHEST_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, chestGeneratorRecipe,"ABSTRACT_GENERATOR",new ItemStack(Material.CHEST)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_DIAMOND_PICKAXE_GENERATOR", Items.MOMOTECH_DIAMOND_PICKAXE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, diamondPickaxeGeneratorRecipe,"ABSTRACT_GENERATOR",new ItemStack(Material.DIAMOND_PICKAXE, 8)).register(MomoTech.getInstance());
        new LightAndDarkCollector(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_LIGHT_AND_DARK_COLLECTOR", Items.MOMOTECH_LIGHT_AND_DARK_COLLECTOR, RecipeType.ENHANCED_CRAFTING_TABLE, lightAndDarkCollectorRecipe).register(MomoTech.getInstance());
        new Teleporter(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_TELEPORTER", Items.MOMOTECH_TELEPORTER, RecipeType.ENHANCED_CRAFTING_TABLE, teleporterRecipe).register(MomoTech.getInstance());
        new QuantumBoxOpener(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_QUANTUM_BOX_OPENER", Items.MOMOTECH_QUANTUM_BOX_OPENER, RecipeType.ENHANCED_CRAFTING_TABLE, quantumBoxOpenerRecipe).register(MomoTech.getInstance());
        new HighspeedGeoMiner(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_HIGHSPEED_GEO_MINER", Items.MOMOTECH_HIGHSPEED_GEO_MINER, RecipeType.ENHANCED_CRAFTING_TABLE, highspeedGeoMinerRecipe).register(MomoTech.getInstance());
        new InfinityGeoMiner(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_GEO_MINER", Items.MOMOTECH_INFINITY_GEO_MINER, RecipeType.ENHANCED_CRAFTING_TABLE, infinityGeoMinerRecipe).register(MomoTech.getInstance());
        new Magnetizer(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_MAGNETIZER", Items.MOMOTECH_MAGNETIZER, RecipeType.ENHANCED_CRAFTING_TABLE, magnetizerRecipe).register(MomoTech.getInstance());
        new NetheritePickaxeFactory(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_NETHERITE_PICKAXE_FACTORY", Items.MOMOTECH_NETHERITE_PICKAXE_FACTORY, RecipeType.ENHANCED_CRAFTING_TABLE, netheritePickaxeFactoryRecipe).register(MomoTech.getInstance());
        new ResourceCondenser(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_RESOURCE_CONDENSER", Items.MOMOTECH_RESOURCE_CONDENSER, RecipeType.ENHANCED_CRAFTING_TABLE, resourceCondenserRecipe).register(MomoTech.getInstance());
        new ElectromagnetFactory(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_ELECTROMAGNET_FACTORY", Items.MOMOTECH_ELECTROMAGNET_FACTORY, RecipeType.ENHANCED_CRAFTING_TABLE, electromagnetFactoryRecipe).register(MomoTech.getInstance());
        new EquipmentRepairingMachine(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_EQUIPMENT_REPAIRING_MACHINE", Items.MOMOTECH_EQUIPMENT_REPAIRING_MACHINE, RecipeType.ANCIENT_ALTAR, equipmentRepairingMachineRecipe).register(MomoTech.getInstance());
        new PumpkinCarvingMachine(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_PUMPKIN_CARVING_MACHINE", Items.MOMOTECH_PUMPKIN_CARVING_MACHINE, RecipeType.ENHANCED_CRAFTING_TABLE, pumpkinCarvingMachineRecipe).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_ADVANCED_COBBLESTONE_GENERATOR", Items.MOMOTECH_ADVANCED_COBBLESTONE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, advancedCobblestoneGeneratorRecipe,"ABSTRACT_GENERATOR",new ItemStack(Material.COBBLESTONE, 64)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_ENDGAME_MACHINES, "MOMOTECH_50FOLD_COMPRESSED_COBBLESTONE_GENERATOR", Items.MOMOTECH_50FOLD_COMPRESSED_COBBLESTONE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, fiftyfoldCompressedCobblestoneGeneratorRecipe,"ABSTRACT_GENERATOR",new CustomItemStack(MomotechItem.compressedCobblestone[49],8)).register(MomoTech.getInstance());
        new RandomQuantumGenerator(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_RANDOM_QUANTUM_GENERATOR", Items.MOMOTECH_RANDOM_QUANTUM_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, randomQuantumGeneratorRecipe).register(MomoTech.getInstance());
        new QuantumChargingMachine(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_QUANTUM_CHARGING_MACHINE", Items.MOMOTECH_QUANTUM_CHARGING_MACHINE, RecipeType.ENHANCED_CRAFTING_TABLE, quantumChargingMachineRecipe).register(MomoTech.getInstance());
        new InfinityCobblestoneGenerator(Items.MOMOTECH_INFINITY_MACHINES, "MOMOTECH_INFINITY_COBBLESTONE_GENERATOR", Items.MOMOTECH_INFINITY_COBBLESTONE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, infinityCobblestoneGeneratorRecipe).register(MomoTech.getInstance());
        new StoneStorage(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_STONE_STORAGE", Items.MOMOTECH_STONE_STORAGE, RecipeType.ENHANCED_CRAFTING_TABLE, stoneStorageRecipe).register(MomoTech.getInstance());
        new IDWriter(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_ID_WRITER", Items.MOMOTECH_ID_WRITER, RecipeType.ENHANCED_CRAFTING_TABLE, IDWriterRecipe).register(MomoTech.getInstance());
        new ItemConstructor(Items.MOMOTECH_ENDGAME_MACHINES, "MOMOTECH_ITEM_CONSTRUCTOR", Items.MOMOTECH_ITEM_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, ItemConstructorRecipe).register(MomoTech.getInstance());
        new CharacterConstructor(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_CHARACTER_CONSTRUCTOR", Items.MOMOTECH_CHARACTER_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, characterConstructorRecipe).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_COMMAND_BLOCK_GENERATOR", Items.MOMOTECH_COMMAND_BLOCK_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, commandBlockGeneratorRecipe,"ABSTRACT_GENERATOR", RandomizedItemStack.fromMaterial(Material.COMMAND_BLOCK, Material.CHAIN_COMMAND_BLOCK, Material.REPEATING_COMMAND_BLOCK)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_CARBON_GENERATOR", Items.MOMOTECH_CARBON_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, carbonGeneratorRecipe,"ABSTRACT_GENERATOR",new CustomItemStack(SlimefunItems.CARBON, 1)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_BEE_GENERATOR", Items.MOMOTECH_BEE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, beeGeneratorRecipe,"ABSTRACT_GENERATOR",RandomizedItemStack.fromMaterial(Material.BEE_SPAWN_EGG, Material.BEEHIVE,Material.HONEYCOMB,
                Material.HONEY_BOTTLE, Material.HONEYCOMB_BLOCK, Material.HONEY_BLOCK)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_SPIDER_EYE_GENERATOR", Items.MOMOTECH_SPIDER_EYE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, spiderEyeGeneratorRecipe,"ABSTRACT_GENERATOR",new ItemStack(Material.SPIDER_EYE, 2)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_ICE_GENERATOR", Items.MOMOTECH_ICE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, iceGeneratorRecipe,"ABSTRACT_GENERATOR",new ItemStack(Material.ICE, 1)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_STONE_CHUNK_GENERATOR", Items.MOMOTECH_STONE_CHUNK_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, stoneChunkGeneratorRecipe,"ABSTRACT_GENERATOR",new CustomItemStack(SlimefunItems.STONE_CHUNK, 8)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_STRING_GENERATOR", Items.MOMOTECH_STRING_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, stringGeneratorRecipe,"ABSTRACT_GENERATOR",new ItemStack(Material.STRING, 3)).register(MomoTech.getInstance());
        new BasicGenerator(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_BASIC_GENERATOR", Items.MOMOTECH_BASIC_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, basicGeneratorRecipe).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_DUST_GENERATOR", Items.MOMOTECH_DUST_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, dustGeneratorRecipe,"ABSTRACT_GENERATOR",new RandomizedItemStack(6,SlimefunItems.ALUMINUM_DUST, SlimefunItems.COPPER_DUST,
                SlimefunItems.GOLD_DUST, SlimefunItems.LEAD_DUST, SlimefunItems.IRON_DUST, SlimefunItems.SILVER_DUST,
                SlimefunItems.TIN_DUST, SlimefunItems.ZINC_DUST, SlimefunItems.MAGNESIUM_DUST)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_STONE_GENERATOR", Items.MOMOTECH_STONE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, stoneGeneratorRecipe,"ABSTRACT_GENERATOR",RandomizedItemStack.fromMaterial(8,Material.STONE, Material.COBBLESTONE, Material.GRANITE, Material.DIORITE, Material.COBBLED_DEEPSLATE, Material.ANDESITE)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_COBBLESTONE_GENERATOR", Items.MOMOTECH_COBBLESTONE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, cobblestoneGeneratorRecipe,"ABSTRACT_GENERATOR", new ItemStack(Material.COBBLESTONE, 8)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_FISH_GENERATOR", Items.MOMOTECH_FISH_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, fishGeneratorRecipe,"ABSTRACT_GENERATOR",RandomizedItemStack.fromMaterial(Material.COD, Material.SALMON, Material.PUFFERFISH, Material.TROPICAL_FISH)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_SAND_GENERATOR", Items.MOMOTECH_SAND_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, sandGeneratorRecipe,"ABSTRACT_GENERATOR",RandomizedItemStack.fromMaterial(8,Material.SAND, Material.RED_SAND, Material.GRAVEL, Material.SOUL_SAND)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_FROGLIGHT_GENERATOR", Items.MOMOTECH_FROGLIGHT_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, froglightGeneratorRecipe,"ABSTRACT_GENERATOR",RandomizedItemStack.fromMaterial(4,Material.OCHRE_FROGLIGHT, Material.PEARLESCENT_FROGLIGHT, Material.VERDANT_FROGLIGHT)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_GLASS_GENERATOR", Items.MOMOTECH_GLASS_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, glassGeneratorRecipe,"ABSTRACT_GENERATOR",new ItemStack(Material.GLASS, 8)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_ORE_GENERATOR", Items.MOMOTECH_ORE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, oreGeneratorRecipe,"ABSTRACT_GENERATOR",RandomizedItemStack.fromMaterial(Material.DIAMOND_ORE, Material.GOLD_ORE, Material.IRON_ORE, Material.COAL_ORE, Material.COPPER_ORE,
                Material.EMERALD_ORE, Material.REDSTONE_ORE, Material.NETHER_QUARTZ_ORE, Material.NETHER_GOLD_ORE,
                Material.LAPIS_ORE, Material.DEEPSLATE_REDSTONE_ORE, Material.DEEPSLATE_LAPIS_ORE, Material.DEEPSLATE_IRON_ORE,
                Material.DEEPSLATE_GOLD_ORE, Material.DEEPSLATE_COAL_ORE, Material.DEEPSLATE_COPPER_ORE, Material.DEEPSLATE_DIAMOND_ORE,
                Material.DEEPSLATE_EMERALD_ORE, Material.COPPER_ORE)).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_TEMPLATE_GENERATOR", Items.MOMOTECH_TEMPLATE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, templateGeneratorRecipe,"ABSTRACT_GENERATOR",RandomizedItemStack.fromMaterial(
                Material.COAST_ARMOR_TRIM_SMITHING_TEMPLATE, Material.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE,
                Material.EYE_ARMOR_TRIM_SMITHING_TEMPLATE, Material.HOST_ARMOR_TRIM_SMITHING_TEMPLATE,
                Material.RIB_ARMOR_TRIM_SMITHING_TEMPLATE, Material.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE,
                Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Material.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE,
                Material.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE, Material.WILD_ARMOR_TRIM_SMITHING_TEMPLATE,
                Material.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE, Material.VEX_ARMOR_TRIM_SMITHING_TEMPLATE,
                Material.WARD_ARMOR_TRIM_SMITHING_TEMPLATE, Material.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE,
                Material.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE, Material.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE,
                Material.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE)).register(MomoTech.getInstance());
        new InfinityGenerator(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_INFINITY_GENERATOR", Items.MOMOTECH_INFINITY_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, infinityGeneratorRecipe).register(MomoTech.getInstance());
        new DigitConstructor(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_DIGIT_CONSTRUCTOR", Items.MOMOTECH_DIGIT_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, digitConstructorRecipe).register(MomoTech.getInstance());
        new SymbolConstructor(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_SYMBOL_CONSTRUCTOR", Items.MOMOTECH_SYMBOL_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, symbolConstructorRecipe).register(MomoTech.getInstance());
        new Incrementer(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_INCREMENTER", Items.MOMOTECH_INCREMENTER, RecipeType.ANCIENT_ALTAR, incrementerRecipe).register(MomoTech.getInstance());
        new Calculator(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_CALCULATOR", Items.MOMOTECH_CALCULATOR, RecipeType.ENHANCED_CRAFTING_TABLE, calculatorRecipe).register(MomoTech.getInstance());
        new NullGenerator(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_NULL_GENERATOR", Items.MOMOTECH_NULL_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, nullGeneratorRecipe).register(MomoTech.getInstance());
        new AdvancedNullGenerator(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_ADVANCED_NULL_GENERATOR", Items.MOMOTECH_ADVANCED_NULL_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, advancedNullGeneratorRecipe).register(MomoTech.getInstance());
        new PrimalMatterConstructor(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_PRIMAL_MATTER_CONSTRUCTOR", Items.MOMOTECH_PRIMAL_MATTER_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, primalMatterConstructorRecipe).register(MomoTech.getInstance());
        new NoneConstructor(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_NONE_CONSTRUCTOR", Items.MOMOTECH_NONE_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, noneGeneratorRecipe).register(MomoTech.getInstance());
        new QuantumConstructor(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_QUANTUM_CONSTRUCTOR", Items.MOMOTECH_QUANTUM_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, quantumConstructorRecipe).register(MomoTech.getInstance());
        new FinalCopier(Items.MOMOTECH_ENDGAME_MACHINES, "MOMOTECH_FINAL_COPIER", Items.MOMOTECH_FINAL_COPIER, RecipeType.ENHANCED_CRAFTING_TABLE, finalCopierRecipe).register(MomoTech.getInstance());
        new UncontrollableVoidGenerator(Items.MOMOTECH_ENDGAME_MACHINES, "MOMOTECH_UNCONTROLLABLE_VOID_GENERATOR", Items.MOMOTECH_UNCONTROLLABLE_VOID_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, uncontrollableVoidGeneratorRecipe).register(MomoTech.getInstance());
        new CompressedMineralQuarry(Items.MOMOTECH_BASIC_MACHINES, "MOMOTECH_COMPRESSED_MINERAL_QUARRY", Items.MOMOTECH_COMPRESSED_MINERAL_QUARRY, RecipeType.MAGIC_WORKBENCH, compressedMineralQuarryRecipe).register(MomoTech.getInstance());
        new RandomCopier(Items.MOMOTECH_ENDGAME_MACHINES, "MOMOTECH_RANDOM_COPIER", Items.MOMOTECH_RANDOM_COPIER, RecipeType.ENHANCED_CRAFTING_TABLE, randomCopierRecipe).register(MomoTech.getInstance());
        new AbstractResourceGeneratorGUI(Items.MOMOTECH_RESOURCE_GENERATORS, "MOMOTECH_PRISMARINE_GENERATOR", Items.MOMOTECH_PRISMARINE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, prismarineGeneratorRecipe,"ABSTRACT_GENERATOR",RandomizedItemStack.fromMaterial(8,Material.SEA_LANTERN, Material.DARK_PRISMARINE, Material.PRISMARINE, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD)).register(MomoTech.getInstance());

        logger.info(MomoTech.languageManager.getInfo("machines_registered_successfully"));
    }
}
