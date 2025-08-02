package cn.qy.MomoTech.Items;

import org.bukkit.entity.Slime;

import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;

public class MomotechItem {
    public static final SlimefunItemStack[] compressedCobblestone = new SlimefunItemStack[100];
    public static final SlimefunItemStack infinitySingularity = new SlimefunItemStack("MOMOTECH_INFINITY_SINGULARITY", Items.MOMOTECH_INFINITY_SINGULARITY);
    public static final SlimefunItemStack lightAndDarkIngot = new SlimefunItemStack("MOMOTECH_LIGHT_AND_DARK_INGOT", Items.MOMOTECH_LIGHT_AND_DARK_INGOT);
    public static final SlimefunItemStack infinityMachineCore = new SlimefunItemStack("MOMOTECH_INFINITY_MACHINE_CORE", Items.MOMOTECH_INFINITY_MACHINE_CORE);
    public static final SlimefunItemStack integratedMachineCore = new SlimefunItemStack("MOMOTECH_INTEGRATED_MACHINE_CORE", Items.MOMOTECH_INTEGRATED_MACHINE_CORE);
    public static final SlimefunItemStack quantum = new SlimefunItemStack("MOMOTECH_QUANTUM", Items.MOMOTECH_QUANTUM);
    public static final SlimefunItemStack entangledQuantum = new SlimefunItemStack("MOMOTECH_ENTANGLED_QUANTUM", Items.MOMOTECH_ENTANGLED_QUANTUM);
    public static final SlimefunItemStack fakeCommandBlock = new SlimefunItemStack("MOMOTECH_FAKE_COMMAND_BLOCK", Items.MOMOTECH_FAKE_COMMAND_BLOCK);
    public static final SlimefunItemStack purePrimalMatter = new SlimefunItemStack("MOMOTECH_PURE_PRIMAL_MATTER", Items.MOMOTECH_PURE_PRIMAL_MATTER);
    public static final SlimefunItemStack cobblestoneGenerator = new SlimefunItemStack("MOMOTECH_COBBLESTONE_GENERATOR", Items.MOMOTECH_COBBLESTONE_GENERATOR);
    public static final SlimefunItemStack quantumSingularity = new SlimefunItemStack("MOMOTECH_QUANTUM_SINGULARITY", Items.MOMOTECH_QUANTUM_SINGULARITY);
    public static final SlimefunItemStack[][] compressedMinerals = new SlimefunItemStack[9][5];
    public static final SlimefunItemStack none = new SlimefunItemStack("MOMOTECH_NONE", Items.MOMOTECH_NONE);
    public static final SlimefunItemStack nullItem = new SlimefunItemStack("MOMOTECH_NULL", Items.MOMOTECH_NULL);
    public static final SlimefunItemStack digitConstructor = new SlimefunItemStack("MOMOTECH_DIGIT_CONSTRUCTOR", Items.MOMOTECH_DIGIT_CONSTRUCTOR);
    public static final SlimefunItemStack symbolAddition = new SlimefunItemStack("MOMOTECH_SYMBOL_ADDITION", Items.MOMOTECH_SYMBOL_ADDITION);
    public static final SlimefunItemStack symbolDivision = new SlimefunItemStack("MOMOTECH_SYMBOL_DIVISION", Items.MOMOTECH_SYMBOL_DIVISION);
    public static final SlimefunItemStack symbolSubtraction = new SlimefunItemStack("MOMOTECH_SYMBOL_SUBTRACTION", Items.MOMOTECH_SYMBOL_SUBTRACTION);
    public static final SlimefunItemStack symbolMultiplication = new SlimefunItemStack("MOMOTECH_SYMBOL_MULTIPLICATION", Items.MOMOTECH_SYMBOL_MULTIPLICATION);
    public static final SlimefunItemStack bugFormula = new SlimefunItemStack("MOMOTECH_BUG_FORMULA", Items.MOMOTECH_BUG_FORMULA);
    public static final SlimefunItemStack bugDecimal = new SlimefunItemStack("MOMOTECH_BUG_DECIMAL", Items.MOMOTECH_BUG_DECIMAL);
    public static final SlimefunItemStack bugDate = new SlimefunItemStack("MOMOTECH_BUG_DATE", Items.MOMOTECH_BUG_DATE);
    public static final SlimefunItemStack bugNegativeOverflow = new SlimefunItemStack("MOMOTECH_BUG_POSITIVE_OVERFLOW", Items.MOMOTECH_BUG_POSITIVE_OVERFLOW);
    public static final SlimefunItemStack bugPositiveOverflow = new SlimefunItemStack("MOMOTECH_BUG_NEGATIVE_OVERFLOW", Items.MOMOTECH_BUG_NEGATIVE_OVERFLOW);
    public static final SlimefunItemStack bugSystem = new SlimefunItemStack("MOMOTECH_BUG_SYSTEM", Items.MOMOTECH_BUG_SYSTEM);
    public static final SlimefunItemStack incrementer = new SlimefunItemStack("MOMOTECH_INCREMENTER", Items.MOMOTECH_INCREMENTER);
    public static final SlimefunItemStack symbolConstructor = new SlimefunItemStack("MOMOTECH_SYMBOL_CONSTRUCTOR", Items.MOMOTECH_SYMBOL_CONSTRUCTOR);
    public static final SlimefunItemStack nullGenerator = new SlimefunItemStack("MOMOTECH_NULL_GENERATOR", Items.MOMOTECH_NULL_GENERATOR);
    public static final SlimefunItemStack calculator = new SlimefunItemStack("MOMOTECH_CALCULATOR", Items.MOMOTECH_CALCULATOR);
    public static final SlimefunItemStack qyhb05 = new SlimefunItemStack("MOMOTECH_QYHB05", Items.MOMOTECH_QYHB05);
    public static final SlimefunItemStack chenmose = new SlimefunItemStack("MOMOTECH_CHENMOSE", Items.MOMOTECH_CHENMOSE);
    public static final SlimefunItemStack bugggg = new SlimefunItemStack("MOMOTECH_BUGGGG", Items.MOMOTECH_BUGGGGG);
    public static final SlimefunItemStack primalMatterConstructor = new SlimefunItemStack("MOMOTECH_PRIMAL_MATTER_CONSTRUCTOR", Items.MOMOTECH_PRIMAL_MATTER_CONSTRUCTOR);
    public static final SlimefunItemStack primalMatterA = new SlimefunItemStack("MOMOTECH_PRIMAL_MATTER_A", Items.MOMOTECH_PRIMAL_MATTER_A);
    public static final SlimefunItemStack primalMatterB = new SlimefunItemStack("MOMOTECH_PRIMAL_MATTER_B", Items.MOMOTECH_PRIMAL_MATTER_B);
    public static final SlimefunItemStack primalMatterY = new SlimefunItemStack("MOMOTECH_PRIMAL_MATTER_Y", Items.MOMOTECH_PRIMAL_MATTER_Y);
    public static final SlimefunItemStack quantumConstructor = new SlimefunItemStack("MOMOTECH_QUANTUM_CONSTRUCTOR", Items.MOMOTECH_QUANTUM_CONSTRUCTOR);
    public static final SlimefunItemStack bugCrystal = new SlimefunItemStack("MOMOTECH_BUG_CRYSTAL", Items.MOMOTECH_BUG_CRYSTAL);
    public static final SlimefunItemStack noneConstructor = new SlimefunItemStack("MOMOTECH_NONE_CONSTRUCTOR", Items.MOMOTECH_NONE_CONSTRUCTOR);
    public static final SlimefunItemStack uncontrollableVoid = new SlimefunItemStack("MOMOTECH_UNCONTROLLABLE_VOID", Items.MOMOTECH_UNCONTROLLABLE_VOID);
    public static final SlimefunItemStack quantumBox = new SlimefunItemStack("MOMOTECH_QUANTUM_BOX", Items.MOMOTECH_QUANTUM_BOX);
    public static final SlimefunItemStack randomCopier = new SlimefunItemStack("MOMOTECH_RANDOM_COPIER", Items.MOMOTECH_RANDOM_COPIER);
    public static final SlimefunItemStack characterConstructor = new SlimefunItemStack("MOMOTECH_CHARACTER_CONSTRUCTOR", Items.MOMOTECH_CHARACTER_CONSTRUCTOR);
    public static final SlimefunItemStack character = new SlimefunItemStack("MOMOTECH_CHARACTER", Items.MOMOTECH_CHARACTER);
    public static final SlimefunItemStack IDCard = new SlimefunItemStack("MOMOTECH_ID_CARD", Items.MOMOTECH_ID_CARD);
    public static final SlimefunItemStack supremeCore = new SlimefunItemStack("MOMOTECH_SUPREME_CORE", Items.MOMOTECH_SUPREME_CORE);
    public static final SlimefunItemStack finalCore = new SlimefunItemStack("MOMOTECH_FINAL_CORE", Items.MOMOTECH_FINAL_CORE);
    public static final SlimefunItemStack light = new SlimefunItemStack("MOMOTECH_LIGHT", Items.MOMOTECH_LIGHT);
    public static final SlimefunItemStack dark = new SlimefunItemStack("MOMOTECH_DARK", Items.MOMOTECH_DARK);
    public static final SlimefunItemStack lightEssence = new SlimefunItemStack("MOMOTECH_LIGHT_ESSENCE", Items.MOMOTECH_LIGHT_ESSENCE);
    public static final SlimefunItemStack darkEssence = new SlimefunItemStack("MOMOTECH_DARK_ESSENCE", Items.MOMOTECH_DARK_ESSENCE);
    public static final SlimefunItemStack lightAndDarkCollector = new SlimefunItemStack("MOMOTECH_LIGHT_AND_DARK_COLLECTOR", Items.MOMOTECH_LIGHT_AND_DARK_COLLECTOR);
    public static final SlimefunItemStack ironCore = new SlimefunItemStack("MOMOTECH_IRON_CORE", Items.MOMOTECH_IRON_CORE);
    public static final SlimefunItemStack resourceCondenser = new SlimefunItemStack("MOMOTECH_RESOURCE_CONDENSER", Items.MOMOTECH_RESOURCE_CONDENSER);
    public static final SlimefunItemStack diamondEssence = new SlimefunItemStack("MOMOTECH_MINERAL_ESSENCE_DIAMOND", Items.MOMOTECH_MINERAL_ESSENCE_DIAMOND);
    public static final SlimefunItemStack quartzEssence = new SlimefunItemStack("MOMOTECH_MINERAL_ESSENCE_QUARTZ", Items.MOMOTECH_MINERAL_ESSENCE_QUARTZ);
    public static final SlimefunItemStack ironEssence = new SlimefunItemStack("MOMOTECH_MINERAL_ESSENCE_IRON", Items.MOMOTECH_MINERAL_ESSENCE_IRON);
    public static final SlimefunItemStack goldEssence = new SlimefunItemStack("MOMOTECH_MINERAL_ESSENCE_GOLD", Items.MOMOTECH_MINERAL_ESSENCE_GOLD);
    public static final SlimefunItemStack lapisEssence = new SlimefunItemStack("MOMOTECH_MINERAL_ESSENCE_LAPIS", Items.MOMOTECH_MINERAL_ESSENCE_LAPIS);
    public static final SlimefunItemStack redstoneEssence = new SlimefunItemStack("MOMOTECH_MINERAL_ESSENCE_REDSTONE", Items.MOMOTECH_MINERAL_ESSENCE_REDSTONE);
    public static final SlimefunItemStack emeraldEssence = new SlimefunItemStack("MOMOTECH_MINERAL_ESSENCE_EMERALD", Items.MOMOTECH_MINERAL_ESSENCE_EMERALD);
    public static final SlimefunItemStack coalEssence = new SlimefunItemStack("MOMOTECH_MINERAL_ESSENCE_COAL", Items.MOMOTECH_MINERAL_ESSENCE_COAL);
    public static final SlimefunItemStack copperEssence = new SlimefunItemStack("MOMOTECH_METAL_ESSENCE_COPPER", Items.MOMOTECH_METAL_ESSENCE_COPPER);
    public static final SlimefunItemStack leadEssence = new SlimefunItemStack("MOMOTECH_METAL_ESSENCE_LEAD", Items.MOMOTECH_METAL_ESSENCE_LEAD);
    public static final SlimefunItemStack magnesiumEssence = new SlimefunItemStack("MOMOTECH_METAL_ESSENCE_MAGNESIUM", Items.MOMOTECH_METAL_ESSENCE_MAGNESIUM);
    public static final SlimefunItemStack goldSFEssence = new SlimefunItemStack("MOMOTECH_METAL_ESSENCE_GOLD", Items.MOMOTECH_METAL_ESSENCE_GOLD);
    public static final SlimefunItemStack aluminumEssence = new SlimefunItemStack("MOMOTECH_METAL_ESSENCE_ALUMINUM", Items.MOMOTECH_METAL_ESSENCE_ALUMINUM);
    public static final SlimefunItemStack tinEssence = new SlimefunItemStack("MOMOTECH_METAL_ESSENCE_TIN", Items.MOMOTECH_METAL_ESSENCE_TIN);
    public static final SlimefunItemStack zincEssence = new SlimefunItemStack("MOMOTECH_METAL_ESSENCE_ZINC", Items.MOMOTECH_METAL_ESSENCE_ZINC);
    public static final SlimefunItemStack silverEssence = new SlimefunItemStack("MOMOTECH_METAL_ESSENCE_SILVER", Items.MOMOTECH_METAL_ESSENCE_SILVER);
    public static final SlimefunItemStack diamondSingularity = new SlimefunItemStack("MOMOTECH_MINERAL_SINGULARITY_DIAMOND", Items.MOMOTECH_MINERAL_SINGULARITY_DIAMOND);
    public static final SlimefunItemStack quartzSingularity = new SlimefunItemStack("MOMOTECH_MINERAL_SINGULARITY_QUARTZ", Items.MOMOTECH_MINERAL_SINGULARITY_QUARTZ);
    public static final SlimefunItemStack ironSingularity = new SlimefunItemStack("MOMOTECH_MINERAL_SINGULARITY_IRON", Items.MOMOTECH_MINERAL_SINGULARITY_IRON);
    public static final SlimefunItemStack goldSingularity = new SlimefunItemStack("MOMOTECH_MINERAL_SINGULARITY_GOLD", Items.MOMOTECH_MINERAL_SINGULARITY_GOLD);
    public static final SlimefunItemStack lapisSingularity = new SlimefunItemStack("MOMOTECH_MINERAL_SINGULARITY_LAPIS", Items.MOMOTECH_MINERAL_SINGULARITY_LAPIS);
    public static final SlimefunItemStack redstoneSingularity = new SlimefunItemStack("MOMOTECH_MINERAL_SINGULARITY_REDSTONE", Items.MOMOTECH_MINERAL_SINGULARITY_REDSTONE);
    public static final SlimefunItemStack emeraldSingularity = new SlimefunItemStack("MOMOTECH_MINERAL_SINGULARITY_EMERALD", Items.MOMOTECH_MINERAL_SINGULARITY_EMERALD);
    public static final SlimefunItemStack coalSingularity = new SlimefunItemStack("MOMOTECH_MINERAL_SINGULARITY_COAL", Items.MOMOTECH_MINERAL_SINGULARITY_COAL);
    public static final SlimefunItemStack copperSingularity = new SlimefunItemStack("MOMOTECH_METAL_SINGULARITY_COPPER", Items.MOMOTECH_METAL_SINGULARITY_COPPER);
    public static final SlimefunItemStack leadSingularity = new SlimefunItemStack("MOMOTECH_METAL_SINGULARITY_LEAD", Items.MOMOTECH_METAL_SINGULARITY_LEAD); 
    public static final SlimefunItemStack magnesiumSingularity = new SlimefunItemStack("MOMOTECH_METAL_SINGULARITY_MAGNESIUM", Items.MOMOTECH_METAL_SINGULARITY_MAGNESIUM);
    public static final SlimefunItemStack goldSFSingularity = new SlimefunItemStack("MOMOTECH_METAL_SINGULARITY_GOLD", Items.MOMOTECH_METAL_SINGULARITY_GOLD);
    public static final SlimefunItemStack aluminiumSingularity = new SlimefunItemStack("MOMOTECH_METAL_SINGULARITY_ALUMINUM", Items.MOMOTECH_METAL_SINGULARITY_ALUMINUM);
    public static final SlimefunItemStack tinSingularity = new SlimefunItemStack("MOMOTECH_METAL_SINGULARITY_TIN", Items.MOMOTECH_METAL_SINGULARITY_TIN);
    public static final SlimefunItemStack zincSingularity = new SlimefunItemStack("MOMOTECH_METAL_SINGULARITY_ZINC", Items.MOMOTECH_METAL_SINGULARITY_ZINC);
    public static final SlimefunItemStack silverSingularity = new SlimefunItemStack("MOMOTECH_METAL_SINGULARITY_SILVER", Items.MOMOTECH_METAL_SINGULARITY_SILVER);
    public static final SlimefunItemStack magnet = new SlimefunItemStack("MOMOTECH_MAGNET", Items.MOMOTECH_MAGNET);
    public static final SlimefunItemStack wireCoil = new SlimefunItemStack("MOMOTECH_WIRE_COIL", Items.MOMOTECH_WIRE_COIL);
    public static final SlimefunItemStack electromagnet = new SlimefunItemStack("MOMOTECH_ELECTROMAGNET", Items.MOMOTECH_ELECTROMAGNET);
    public static final SlimefunItemStack infinityIngot = new SlimefunItemStack("MOMOTECH_INFINITY_INGOT", Items.MOMOTECH_INFINITY_INGOT);
    public static final SlimefunItemStack mineralSingularity = new SlimefunItemStack("MOMOTECH_MINERAL_SINGULARITY", Items.MOMOTECH_MINERAL_SINGULARITY);
    public static final SlimefunItemStack metalSingularity = new SlimefunItemStack("MOMOTECH_METAL_SINGULARITY", Items.MOMOTECH_METAL_SINGULARITY);
    public static final SlimefunItemStack chargedIngot = new SlimefunItemStack("MOMOTECH_CHARGED_INGOT", Items.MOMOTECH_CHARGED_INGOT);
    public static final SlimefunItemStack eternalParticle = new SlimefunItemStack("MOMOTECH_ETERNAL_PARTICLE", Items.MOMOTECH_ETERNAL_PARTICLE);
    public static final SlimefunItemStack eternalSingularity = new SlimefunItemStack("MOMOTECH_ETERNAL_SINGULARITY", Items.MOMOTECH_ETERNAL_SINGULARITY);
    public static final SlimefunItemStack randomQuantum = new SlimefunItemStack("MOMOTECH_RANDOM_QUANTUM", Items.MOMOTECH_RANDOM_QUANTUM);
    public static final SlimefunItemStack infinityGear = new SlimefunItemStack("MOMOTECH_INFINITY_GEAR", Items.MOMOTECH_INFINITY_GEAR);
    public static final SlimefunItemStack zygote = new SlimefunItemStack("MOMOTECH_ZYGOTE", Items.MOMOTECH_ZYGOTE);
    public static final SlimefunItemStack proton = new SlimefunItemStack("MOMOTECH_PROTON", Items.MOMOTECH_PROTON);
    public static final SlimefunItemStack zygoteIngot = new SlimefunItemStack("MOMOTECH_ZYGOTE_INGOT", Items.MOMOTECH_ZYGOTE_INGOT);
    public static final SlimefunItemStack protonIngot = new SlimefunItemStack("MOMOTECH_PROTON_INGOT", Items.MOMOTECH_PROTON_INGOT);
    public static final SlimefunItemStack randomQuantumGenerator = new SlimefunItemStack("MOMOTECH_RANDOM_QUANTUM_GENERATOR", Items.MOMOTECH_RANDOM_QUANTUM_GENERATOR);
    public static final SlimefunItemStack primalImpulseCommandBlock = new SlimefunItemStack("MOMOTECH_PRIMAL_COMMAND_BLOCK_IMPULSE", Items.MOMOTECH_PRIMAL_COMMAND_BLOCK_IMPULSE);
    public static final SlimefunItemStack primalRepeatingCommandBlock = new SlimefunItemStack("MOMOTECH_PRIMAL_COMMAND_BLOCK_REPEATING", Items.MOMOTECH_PRIMAL_COMMAND_BLOCK_REPEATING);
    public static final SlimefunItemStack primalChainCommandBlock = new SlimefunItemStack("MOMOTECH_PRIMAL_COMMAND_BLOCK_CHAIN", Items.MOMOTECH_PRIMAL_COMMAND_BLOCK_CHAIN);
    public static final SlimefunItemStack chargedQuantum = new SlimefunItemStack("MOMOTECH_CHARGED_QUANTUM", Items.MOMOTECH_CHARGED_QUANTUM);
    public static final SlimefunItemStack resource = new SlimefunItemStack("MOMOTECH_RESOURCE", Items.MOMOTECH_RESOURCE);
    public static final SlimefunItemStack eternalParticleConstructor = new SlimefunItemStack("MOMOTECH_ETERNAL_PARTICLE_CONSTUCTOR", Items.MOMOTECH_ETERNAL_PARTICLE_CONSTUCTOR);
    public static final SlimefunItemStack particleCollector = new SlimefunItemStack("MOMOTECH_PARTICLE_COLLECTOR", Items.MOMOTECH_PARTICLE_COLLECTOR);
    public static final SlimefunItemStack concept = new SlimefunItemStack("MOMOTECH_CONCEPT", Items.MOMOTECH_CONCEPT);
    public static final SlimefunItemStack entropyReconstructor = new SlimefunItemStack("MOMOTECH_ENTROPY_RECONSTRUCTOR", Items.MOMOTECH_ENTROPY_RECONSTRUCTOR);
    public static final SlimefunItemStack dustGenerator = new SlimefunItemStack("MOMOTECH_DUST_GENERATOR", Items.MOMOTECH_DUST_GENERATOR);
    public static final SlimefunItemStack infinityDustExtractor = new SlimefunItemStack("MOMOTECH_INFINITY_DUST_EXTRACTOR", Items.MOMOTECH_INFINITY_DUST_EXTRACTOR);
    public static final SlimefunItemStack infinityMiner = new SlimefunItemStack("MOMOTECH_INFINITY_MINER", Items.MOMOTECH_INFINITY_MINER);
    public static final SlimefunItemStack highspeedGeoMiner = new SlimefunItemStack("MOMOTECH_HIGHSPEED_GEO_MINER", Items.MOMOTECH_HIGHSPEED_GEO_MINER);
    public static final SlimefunItemStack metalEssence = new SlimefunItemStack("MOMOTECH_METAL_ESSENCE", Items.MOMOTECH_METAL_ESSENCE);
    static {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 3; ++j) {
                compressedMinerals[i][j] = new SlimefunItemStack("MOMOTECH_MINERAL_" + Utils.compressedMineralID[i] + "_" + Utils.fold[j], Items.MOMOTECH_COMPRESSED_MINERALS[i][j]);
            }
        }
        for (int i = 0; i < 50; ++i) {
            compressedCobblestone[i] = new SlimefunItemStack("MOMOTECH_COMPRESSED_COBBLESTONE_" + i, Items.MOMOTECH_COMPRESSED_COBBLESTONE[i]);
        }
    }

    public static SlimefunItemStack digit(double i) {
        return new SlimefunItemStack("MOMOTECH_DIGIT", Items.MOMOTECH_DIGIT, MomoTech.languageManager.getItemName("digit"), "§f" + i);
    }

}
