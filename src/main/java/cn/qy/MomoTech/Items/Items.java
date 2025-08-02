package cn.qy.MomoTech.Items;

import cn.qy.MomoTech.Group.MultiGroup;
import cn.qy.MomoTech.Group.SubGroup;
import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.NullEnchantment.Register;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Items {
    interface string {
        String str();
    }
    public static String c(String s, String... s1) {
        StringBuilder ans = new StringBuilder();
        for (int x1 = 0; x1 < s1.length; x1++) {
            if (s1[x1].length() == 1) {
                ans.append("§");
                ans.append(s1[x1]);
                ans.append(s.charAt(x1));
                continue;
            }
            ans.append("§x");
            for (char i : s1[x1].toCharArray()) {
                ans.append("§").append(i);
            }
            ans.append(s.charAt(x1));
        }
        return ans.toString();
    }
    public static String c(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '#') {
                sb.append('x');
                i++;
                if (i >= s.length()) break;
                for (int count = 0; count < 6; i++, count++) {
                    sb.append('§').append(s.charAt(i));
                }
            }
            if (i >= s.length()) break;
            sb.append(s.charAt(i));

        }
        return sb.toString();
    }
    public static final ItemStack MOMOTECH_QUANTUM_SINGULARITY = new CustomItemStack(Material.PURPLE_DYE, MomoTech.languageManager.getItemName("quantum_singularity"), MomoTech.languageManager.getItemLore("quantum_singularity"));
    public static final ItemStack MOMOTECH_FROGLIGHT_GENERATOR = new CustomItemStack(Material.OCHRE_FROGLIGHT, MomoTech.languageManager.getItemName("froglight_generator"), MomoTech.languageManager.getItemLore("froglight_generator"));
    public static final ItemStack MOMOTECH_STONE_GENERATOR = new CustomItemStack(Material.STONE, MomoTech.languageManager.getItemName("stone_generator"), MomoTech.languageManager.getItemLore("stone_generator"));
    public static final ItemStack MOMOTECH_ORE_GENERATOR = new CustomItemStack(Material.DIAMOND_ORE, MomoTech.languageManager.getItemName("ore_generator"), MomoTech.languageManager.getItemLore("ore_generator"));
    public static final ItemStack MOMOTECH_SAND_GENERATOR = new CustomItemStack(Material.SANDSTONE, MomoTech.languageManager.getItemName("sand_generator"), MomoTech.languageManager.getItemLore("sand_generator"));
    public static final ItemStack MOMOTECH_COBBLESTONE_GENERATOR = new CustomItemStack(Material.COBBLESTONE, MomoTech.languageManager.getItemName("cobblestone_generator"), MomoTech.languageManager.getItemLore("cobblestone_generator"));
    public static final ItemStack MOMOTECH_GLASS_GENERATOR = new CustomItemStack(Material.GLASS, MomoTech.languageManager.getItemName("glass_generator"), MomoTech.languageManager.getItemLore("glass_generator"));
    public static final ItemStack MOMOTECH_TEMPLATE_GENERATOR = new CustomItemStack(Material.MELON, MomoTech.languageManager.getItemName("template_generator"), MomoTech.languageManager.getItemLore("template_generator"));
    public static final ItemStack MOMOTECH_FISH_GENERATOR = new CustomItemStack(Material.SEA_LANTERN, MomoTech.languageManager.getItemName("fish_generator"), MomoTech.languageManager.getItemLore("fish_generator"));
    public static final ItemStack MOMOTECH_DUST_GENERATOR = new CustomItemStack(Material.SAND, MomoTech.languageManager.getItemName("dust_generator"), MomoTech.languageManager.getItemLore("dust_generator"));
    public static final ItemStack MOMOTECH_STONE_CHUNK_GENERATOR = new CustomItemStack(Material.SNOW_BLOCK, MomoTech.languageManager.getItemName("stone_chunk_generator"), MomoTech.languageManager.getItemLore("stone_chunk_generator"));
    public static final ItemStack MOMOTECH_ICE_GENERATOR = new CustomItemStack(Material.BLUE_ICE, MomoTech.languageManager.getItemName("ice_generator"), MomoTech.languageManager.getItemLore("ice_generator"));
    public static final ItemStack MOMOTECH_BASIC_GENERATOR = new CustomItemStack(Material.ORANGE_CONCRETE_POWDER, MomoTech.languageManager.getItemName("basic_generator"), MomoTech.languageManager.getItemLore("basic_generator"));
    public static final ItemStack MOMOTECH_STRING_GENERATOR = new CustomItemStack(Material.GRAY_WOOL, MomoTech.languageManager.getItemName("string_generator"), MomoTech.languageManager.getItemLore("string_generator"));
    public static final ItemStack MOMOTECH_COMMAND_BLOCK_GENERATOR = new CustomItemStack(Material.POLISHED_BLACKSTONE, MomoTech.languageManager.getItemName("command_block_generator"), MomoTech.languageManager.getItemLore("command_block_generator"));
    public static final ItemStack MOMOTECH_CARBON_GENERATOR = new CustomItemStack(Material.COAL_BLOCK, MomoTech.languageManager.getItemName("carbon_generator"), MomoTech.languageManager.getItemLore("carbon_generator"));
    public static final ItemStack MOMOTECH_PURE_PRIMAL_MATTER = new CustomItemStack(Material.GLASS_PANE, MomoTech.languageManager.getItemName("pure_primal_matter"), MomoTech.languageManager.getItemLore("pure_primal_matter"));
    public static final ItemStack MOMOTECH_FAKE_COMMAND_BLOCK = new CustomItemStack(Material.COMMAND_BLOCK, MomoTech.languageManager.getItemName("fake_command_block"), MomoTech.languageManager.getItemLore("fake_command_block"));
    public static final ItemStack MOMOTECH_ADVANCED_COBBLESTONE_GENERATOR = new CustomItemStack(Material.SNOW_BLOCK, MomoTech.languageManager.getItemName("advanced_cobblestone_generator"), MomoTech.languageManager.getItemLore("advanced_cobblestone_generator"));
    public static final ItemStack MOMOTECH_DIGIT = new CustomItemStack(SlimefunUtils.getCustomHead("80c4528e622bd318720d38e0e4599e69bf23308f89693920e0e4ecb55d1c0bac"), MomoTech.languageManager.getItemName("digit"), MomoTech.languageManager.getItemLore("digit"));
    public static final ItemStack MOMOTECH_CHARACTER = new CustomItemStack(Material.SUGAR, MomoTech.languageManager.getItemName("character"), MomoTech.languageManager.getItemLore("character"));
    public static final ItemStack MOMOTECH_ID_CARD = new CustomItemStack(Material.PAPER, MomoTech.languageManager.getItemName("id_card"), MomoTech.languageManager.getItemLore("id_card"));
    public static final ItemStack MOMOTECH_ID_WRITER = new CustomItemStack(Material.BOOKSHELF, MomoTech.languageManager.getItemName("id_writer"), MomoTech.languageManager.getItemLore("id_writer"));
    public static final ItemStack MOMOTECH_CHARACTER_CONSTRUCTOR = new CustomItemStack(Material.BEEHIVE, MomoTech.languageManager.getItemName("character_constructor"), MomoTech.languageManager.getItemLore("character_constructor"));
    public static final ItemStack MOMOTECH_SUPREME_CORE = new CustomItemStack(Material.HONEYCOMB, MomoTech.languageManager.getItemName("supreme_core"), MomoTech.languageManager.getItemLore("supreme_core"));
    public static final ItemStack MOMOTECH_ITEM_CONSTRUCTOR = new CustomItemStack(Material.GLASS, MomoTech.languageManager.getItemName("item_constructor"), MomoTech.languageManager.getItemLore("item_constructor"));
    public static final ItemStack MOMOTECH_UNCONTROLLABLE_VOID_GENERATOR = new CustomItemStack(Material.DEEPSLATE_LAPIS_ORE, MomoTech.languageManager.getItemName("uncontrollable_void_generator"), MomoTech.languageManager.getItemLore("uncontrollable_void_generator"));
    public static final ItemStack MOMOTECH_RANDOM_COPIER = new CustomItemStack(Material.DEEPSLATE_EMERALD_ORE, MomoTech.languageManager.getItemName("random_copier"), MomoTech.languageManager.getItemLore("random_copier"));
    public static final ItemStack MOMOTECH_FINAL_COPIER = new CustomItemStack(Material.DEEPSLATE_GOLD_ORE, MomoTech.languageManager.getItemName("final_copier"), MomoTech.languageManager.getItemLore("final_copier"));
    public static final ItemStack MOMOTECH_EXP = new CustomItemStack(Material.EXPERIENCE_BOTTLE, MomoTech.languageManager.getItemName("exp"), MomoTech.languageManager.getItemLore("exp"));
    public static final ItemStack MOMOTECH_FINAL_CORE = new CustomItemStack(Material.FERN, MomoTech.languageManager.getItemName("final_core"), MomoTech.languageManager.getItemLore("final_core"));
    public static final ItemStack MOMOTECH_PRISMARINE_GENERATOR = new CustomItemStack(Material.PRISMARINE, MomoTech.languageManager.getItemName("prismarine_generator"), MomoTech.languageManager.getItemLore("prismarine_generator"));
    public static final ItemStack MOMOTECH_BEE_GENERATOR = new CustomItemStack(Material.BEE_NEST, MomoTech.languageManager.getItemName("bee_generator"), MomoTech.languageManager.getItemLore("bee_generator"));
    public static final ItemStack MOMOTECH_SPIDER_EYE_GENERATOR = new CustomItemStack(Material.SPAWNER, MomoTech.languageManager.getItemName("spider_eye_generator"), MomoTech.languageManager.getItemLore("spider_eye_generator"));
    public static final ItemStack MOMOTECH_COMPRESSED_MINERAL_QUARRY = new CustomItemStack(Material.DEEPSLATE_COAL_ORE, MomoTech.languageManager.getItemName("compressed_mineral_quarry"), MomoTech.languageManager.getItemLore("compressed_mineral_quarry"));
    public static final ItemStack MOMOTECH_NULL = new CustomItemStack(Material.STRUCTURE_VOID, MomoTech.languageManager.getItemName("null"), MomoTech.languageManager.getItemLore("null"));
    public static final ItemStack MOMOTECH_SYMBOL_ADDITION = new CustomItemStack(Material.BLAZE_POWDER, MomoTech.languageManager.getItemName("symbol_addition"), MomoTech.languageManager.getItemLore("symbol_addition"));
    public static final ItemStack MOMOTECH_SYMBOL_SUBTRACTION = new CustomItemStack(Material.BLAZE_POWDER, MomoTech.languageManager.getItemName("symbol_subtraction"), MomoTech.languageManager.getItemLore("symbol_subtraction"));
    public static final ItemStack MOMOTECH_SYMBOL_MULTIPLICATION = new CustomItemStack(Material.BLAZE_POWDER, MomoTech.languageManager.getItemName("symbol_multiplication"), MomoTech.languageManager.getItemLore("symbol_multiplication"));
    public static final ItemStack MOMOTECH_SYMBOL_DIVISION = new CustomItemStack(Material.BLAZE_POWDER, MomoTech.languageManager.getItemName("symbol_division"), MomoTech.languageManager.getItemLore("symbol_division"));
    public static final ItemStack MOMOTECH_NONE = new CustomItemStack(new ItemStack(Material.BLACK_WOOL), MomoTech.languageManager.getItemName("none"), MomoTech.languageManager.getItemLore("none"));
    public static final ItemStack MOMOTECH_BUG_FORMULA = new CustomItemStack(new ItemStack(Material.WHITE_STAINED_GLASS_PANE), MomoTech.languageManager.getItemName("bug.formula"), MomoTech.languageManager.getItemLore("bug.formula"));
    public static final ItemStack MOMOTECH_BUG_DECIMAL = new CustomItemStack(new ItemStack(Material.RED_STAINED_GLASS_PANE), MomoTech.languageManager.getItemName("bug.decimal"), MomoTech.languageManager.getItemLore("bug.decimal"));
    public static final ItemStack MOMOTECH_BUG_DATE = new CustomItemStack(new ItemStack(Material.ORANGE_STAINED_GLASS_PANE), MomoTech.languageManager.getItemName("bug.date"), MomoTech.languageManager.getItemLore("bug.date"));
    public static final ItemStack MOMOTECH_BUG_POSITIVE_OVERFLOW = new CustomItemStack(new ItemStack(Material.YELLOW_STAINED_GLASS_PANE), MomoTech.languageManager.getItemName("bug.positive_overflow"), MomoTech.languageManager.getItemLore("bug.positive_overflow"));
    public static final ItemStack MOMOTECH_BUG_NEGATIVE_OVERFLOW = new CustomItemStack(new ItemStack(Material.GREEN_STAINED_GLASS_PANE), MomoTech.languageManager.getItemName("bug.negative_overflow"), MomoTech.languageManager.getItemLore("bug.negative_overflow"));
    public static final ItemStack MOMOTECH_BUG_SYSTEM = new CustomItemStack(new ItemStack(Material.BLUE_STAINED_GLASS_PANE), MomoTech.languageManager.getItemName("bug.system"), MomoTech.languageManager.getItemLore("bug.system"));
    public static final ItemStack MOMOTECH_DIGIT_CONSTRUCTOR = new CustomItemStack(SlimefunUtils.getCustomHead("f26dad74b2bab105cb68c94eb3be32f5dbda42eab944b6ed9e803136f8f619bc"), MomoTech.languageManager.getItemName("digit_constructor"), MomoTech.languageManager.getItemLore("digit_constructor"));
    public static final ItemStack MOMOTECH_SYMBOL_CONSTRUCTOR = new CustomItemStack(SlimefunUtils.getCustomHead("f26dad74b2bab105cb68c94eb3be32f5dbda42eab944b6ed9e803136f8f619bc"), MomoTech.languageManager.getItemName("symbol_constructor"), MomoTech.languageManager.getItemLore("symbol_constructor"));
    public static final ItemStack MOMOTECH_INCREMENTER = new CustomItemStack(new ItemStack(Material.CREEPER_HEAD), MomoTech.languageManager.getItemName("incrementer"), MomoTech.languageManager.getItemLore("incrementer"));
    public static final ItemStack MOMOTECH_CALCULATOR = new CustomItemStack(Material.SKELETON_SKULL, MomoTech.languageManager.getItemName("calculator"), MomoTech.languageManager.getItemLore("calculator"));
    public static final ItemStack MOMOTECH_NULL_GENERATOR = new CustomItemStack(Material.BLACK_CONCRETE_POWDER, MomoTech.languageManager.getItemName("null_generator"), MomoTech.languageManager.getItemLore("null_generator"));
    public static final ItemStack MOMOTECH_ADVANCED_NULL_GENERATOR = new CustomItemStack(Material.WHITE_CONCRETE_POWDER, MomoTech.languageManager.getItemName("advanced_null_generator"), MomoTech.languageManager.getItemLore("advanced_null_generator"));
    public static final ItemStack MOMOTECH_PRIMAL_MATTER_A = new CustomItemStack(Material.END_CRYSTAL, MomoTech.languageManager.getItemName("primal_matter_a"), MomoTech.languageManager.getItemLore("primal_matter_a"));
    public static final ItemStack MOMOTECH_PRIMAL_MATTER_B = new CustomItemStack(Material.END_CRYSTAL, MomoTech.languageManager.getItemName("primal_matter_b"), MomoTech.languageManager.getItemLore("primal_matter_b"));
    public static final ItemStack MOMOTECH_PRIMAL_MATTER_CONSTRUCTOR = new CustomItemStack(Material.COBBLESTONE, MomoTech.languageManager.getItemName("primal_matter_constructor"), MomoTech.languageManager.getItemLore("primal_matter_constructor"));
    public static final ItemStack MOMOTECH_UNCONTROLLABLE_VOID = new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, MomoTech.languageManager.getItemName("uncontrollable_void"), MomoTech.languageManager.getItemLore("uncontrollable_void"));
    //
    public static final ItemStack MOMOTECH_INFINITY_GENERATOR = new CustomItemStack(new ItemStack(Material.BLACK_WOOL), MomoTech.languageManager.getItemName("infinity_generator"), MomoTech.languageManager.getItemLore("infinity_generator"));
    public static final ItemStack MOMOTECH_NONE_CONSTRUCTOR = new CustomItemStack(new ItemStack(Material.DIRT), MomoTech.languageManager.getItemName("none_constructor"), MomoTech.languageManager.getItemLore("none_constructor"));
    public static final ItemStack MOMOTECH_PRIMAL_MATTER_Y = new CustomItemStack(Material.END_CRYSTAL, MomoTech.languageManager.getItemName("primal_matter_y"), MomoTech.languageManager.getItemLore("primal_matter_y"));
    public static final ItemStack MOMOTECH_QUANTUM_CONSTRUCTOR = new CustomItemStack(Material.HONEY_BLOCK, MomoTech.languageManager.getItemName("quantum_constructor"), MomoTech.languageManager.getItemLore("quantum_constructor"));
    public static final ItemStack MOMOTECH_BUG_CRYSTAL = new CustomItemStack(Material.NETHER_STAR, MomoTech.languageManager.getItemName("bug_crystal"), MomoTech.languageManager.getItemLore("bug_crystal"));
    public static final ItemStack MOMOTECH_QYHB05 = new CustomItemStack(new ItemStack(Material.COMMAND_BLOCK), MomoTech.languageManager.getItemName("qyhb05"), MomoTech.languageManager.getItemLore("qyhb05"));
    public static final ItemStack MOMOTECH_CHENMOSE = new CustomItemStack(new ItemStack(Material.COMMAND_BLOCK), MomoTech.languageManager.getItemName("chenmose"), MomoTech.languageManager.getItemLore("chenmose"));
    public static final ItemStack MOMOTECH_SKYBULE = new CustomItemStack(new ItemStack(Material.COMMAND_BLOCK), MomoTech.languageManager.getItemName("skybule"), MomoTech.languageManager.getItemLore("skybule"));
    public static final ItemStack MOMOTECH_PLUGIN = new CustomItemStack(new ItemStack(Material.PAPER), MomoTech.languageManager.getItemName("plugin"), MomoTech.languageManager.getItemLore("plugin"));
    public static final ItemStack MOMOTECH_BUGGGGG = new CustomItemStack(new ItemStack(Material.ENDER_CHEST), MomoTech.languageManager.getItemName("buggggg"), MomoTech.languageManager.getItemLore("buggggg"));
    public static final ItemStack MOMOTECH_NOTICE_1 = new CustomItemStack(Material.PAPER, MomoTech.languageManager.getItemName("notice_1"), MomoTech.languageManager.getItemLore("notice_1"));
    public static final ItemStack MOMOTECH_NOTICE_2 = new CustomItemStack(Material.PAPER, MomoTech.languageManager.getItemName("notice_2"), MomoTech.languageManager.getItemLore("notice_2"));
    public static final ItemStack MOMOTECH_NOTICE_3 = new CustomItemStack(Material.PAPER, MomoTech.languageManager.getItemName("notice_3"), MomoTech.languageManager.getItemLore("notice_3"));
    public static final ItemStack MOMOTECH_SATURATION_CHARM = new CustomItemStack(new ItemStack(Material.EGG), MomoTech.languageManager.getItemName("saturation_charm"), MomoTech.languageManager.getItemLore("saturation_charm"));
    public static final ItemStack MOMOTECH_WEIRD_THING = new CustomItemStack(new ItemStack(Material.CHAIN_COMMAND_BLOCK), MomoTech.languageManager.getItemName("weird_thing"), MomoTech.languageManager.getItemLore("weird_thing"));

    public static final ItemStack[][] MOMOTECH_COMPRESSED_MINERALS = new ItemStack[9][5];

    public static final ItemStack MOMOTECH_INSTAKILL_SWORD = new CustomItemStack(Material.DIAMOND_SWORD, MomoTech.languageManager.getItemName("instakill_sword"), MomoTech.languageManager.getItemLore("instakill_sword"));
    public static final ItemStack MOMOTECH_50FOLD_COMPRESSED_COBBLESTONE_GENERATOR = new CustomItemStack(Material.COBBLESTONE, MomoTech.languageManager.getItemName("50fold_compressed_cobblestone_generator"), MomoTech.languageManager.getItemLore("50fold_compressed_cobblestone_generator"));
    public static final ItemStack MOMOTECH_WEIRD_ARMOR = new CustomItemStack(new ItemStack(Material.TURTLE_HELMET), MomoTech.languageManager.getItemName("weird_armor"), MomoTech.languageManager.getItemLore("weird_armor"));
    public static final ItemStack MOMOTECH_INTEGRATED_MACHINE_CORE = new CustomItemStack(Material.HEART_OF_THE_SEA, MomoTech.languageManager.getItemName("integrated_machine_core"), MomoTech.languageManager.getItemLore("integrated_machine_core"));
    public static final ItemStack MOMOTECH_STONE_STORAGE = new CustomItemStack(Material.GLASS, MomoTech.languageManager.getItemName("stone_storage"), MomoTech.languageManager.getItemLore("stone_storage"));
    public static final ItemStack MOMOTECH_INFINITY_COBBLESTONE_GENERATOR = new CustomItemStack(Material.SLIME_BLOCK, MomoTech.languageManager.getItemName("infinity_cobblestone_generator"), MomoTech.languageManager.getItemLore("infinity_cobblestone_generator"));
    public static final ItemStack MOMOTECH_QUANTUM = new CustomItemStack(Material.SNOWBALL, MomoTech.languageManager.getItemName("quantum"), MomoTech.languageManager.getItemLore("quantum"));
    public static final ItemStack MOMOTECH_ENTANGLED_QUANTUM = new CustomItemStack(Material.MAGMA_CREAM, MomoTech.languageManager.getItemName("entangled_quantum"), MomoTech.languageManager.getItemLore("entangled_quantum"));
    public static final ItemStack MOMOTECH_QUANTUM_BOX = new CustomItemStack(Material.CHEST, MomoTech.languageManager.getItemName("quantum_box"), MomoTech.languageManager.getItemLore("quantum_box"));
    public static final ItemStack MOMOTECH_ENTANGLED_QUANTUM_PICKAXE = new CustomItemStack(Material.NETHERITE_PICKAXE, MomoTech.languageManager.getItemName("entangled_quantum_pickaxe"), MomoTech.languageManager.getItemLore("entangled_quantum_pickaxe"));
    public static final ItemStack MOMOTECH_QUANTUM_PICKAXE = new CustomItemStack(Material.NETHERITE_PICKAXE, MomoTech.languageManager.getItemName("quantum_pickaxe"), MomoTech.languageManager.getItemLore("quantum_pickaxe"));
    public static final ItemStack MOMOTECH_PUMPKIN_CARVING_MACHINE = new CustomItemStack(Material.CARVED_PUMPKIN, MomoTech.languageManager.getItemName("pumpkin_carving_machine"), MomoTech.languageManager.getItemLore("pumpkin_carving_machine"));
    public static final ItemStack MOMOTECH_QUANTUM_DEBUFF_REMOVER = new CustomItemStack(Material.NETHERITE_INGOT, MomoTech.languageManager.getItemName("quantum_debuff_remover"), MomoTech.languageManager.getItemLore("quantum_debuff_remover"));
    public static final ItemStack MOMOTECH_EQUIPMENT_REPAIRING_MACHINE = new CustomItemStack(Material.IRON_BLOCK, MomoTech.languageManager.getItemName("equipment_repairing_machine"), MomoTech.languageManager.getItemLore("equipment_repairing_machine"));
    public static final ItemStack MOMOTECH_TELEPORTER = new CustomItemStack(Material.PISTON, MomoTech.languageManager.getItemName("teleporter"), MomoTech.languageManager.getItemLore("teleporter"));
    public static final ItemStack MOMOTECH_CHEST_GENERATOR = new CustomItemStack(Material.JUNGLE_LOG, MomoTech.languageManager.getItemName("chest_generator"), MomoTech.languageManager.getItemLore("chest_generator"));
    public static final ItemStack MOMOTECH_QUANTUM_BOX_OPENER = new CustomItemStack(Material.PURPLE_STAINED_GLASS, MomoTech.languageManager.getItemName("quantum_box_opener"), MomoTech.languageManager.getItemLore("quantum_box_opener"));
    public static final ItemStack MOMOTECH_LIGHT = new CustomItemStack(Material.GLOWSTONE_DUST, MomoTech.languageManager.getItemName("light"), MomoTech.languageManager.getItemLore("light"));
    public static final ItemStack MOMOTECH_DARK = new CustomItemStack(Material.GUNPOWDER, MomoTech.languageManager.getItemName("dark"), MomoTech.languageManager.getItemLore("dark"));
    public static final ItemStack MOMOTECH_LIGHT_AND_DARK_COLLECTOR = new CustomItemStack(Material.GLOWSTONE, MomoTech.languageManager.getItemName("light_and_dark_collector"), MomoTech.languageManager.getItemLore("light_and_dark_collector"));
    public static final ItemStack MOMOTECH_LIGHT_AND_DARK_GENERATOR = new CustomItemStack(Material.REDSTONE_LAMP, MomoTech.languageManager.getItemName("light_and_dark_generator"), MomoTech.languageManager.getItemLore("light_and_dark_generator"));
    public static final ItemStack MOMOTECH_LIGHT_ESSENCE = new CustomItemStack(Material.GLOWSTONE_DUST, MomoTech.languageManager.getItemName("light_essence"), MomoTech.languageManager.getItemLore("light_essence"));
    public static final ItemStack MOMOTECH_DARK_ESSENCE = new CustomItemStack(Material.GUNPOWDER, MomoTech.languageManager.getItemName("dark_essence"), MomoTech.languageManager.getItemLore("dark_essence"));
    public static final ItemStack MOMOTECH_NETHERITE_PICKAXE_FACTORY = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("netherite_pickaxe_factory"), MomoTech.languageManager.getItemLore("netherite_pickaxe_factory"));
    public static final ItemStack MOMOTECH_DIAMOND_PICKAXE_GENERATOR = new CustomItemStack(Material.DIAMOND_BLOCK, MomoTech.languageManager.getItemName("diamond_pickaxe_generator"), MomoTech.languageManager.getItemLore("diamond_pickaxe_generator"));
    public static final ItemStack MOMOTECH_RESOURCE_CONDENSER = new CustomItemStack(Material.CHISELED_POLISHED_BLACKSTONE, MomoTech.languageManager.getItemName("resource_condenser"), MomoTech.languageManager.getItemLore("resource_condenser"));
    public static final ItemStack MOMOTECH_MINERAL_ESSENCE_DIAMOND = new CustomItemStack(Material.DIAMOND, MomoTech.languageManager.getItemName("mineral_essence_diamond"), MomoTech.languageManager.getItemLore("mineral_essence_diamond"));
    public static final ItemStack MOMOTECH_MINERAL_ESSENCE_IRON = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("mineral_essence_iron"), MomoTech.languageManager.getItemLore("mineral_essence_iron"));
    public static final ItemStack MOMOTECH_MINERAL_ESSENCE_GOLD = new CustomItemStack(Material.GOLD_INGOT, MomoTech.languageManager.getItemName("mineral_essence_gold"), MomoTech.languageManager.getItemLore("mineral_essence_gold"));
    public static final ItemStack MOMOTECH_MINERAL_ESSENCE_QUARTZ = new CustomItemStack(Material.QUARTZ, MomoTech.languageManager.getItemName("mineral_essence_quartz"), MomoTech.languageManager.getItemLore("mineral_essence_quartz"));
    public static final ItemStack MOMOTECH_MINERAL_ESSENCE_EMERALD = new CustomItemStack(Material.EMERALD, MomoTech.languageManager.getItemName("mineral_essence_emerald"), MomoTech.languageManager.getItemLore("mineral_essence_emerald"));
    public static final ItemStack MOMOTECH_MINERAL_ESSENCE_REDSTONE = new CustomItemStack(Material.REDSTONE, MomoTech.languageManager.getItemName("mineral_essence_redstone"), MomoTech.languageManager.getItemLore("mineral_essence_redstone"));
    public static final ItemStack MOMOTECH_MINERAL_ESSENCE_LAPIS = new CustomItemStack(Material.LAPIS_LAZULI, MomoTech.languageManager.getItemName("mineral_essence_lapis"), MomoTech.languageManager.getItemLore("mineral_essence_lapis"));
    public static final ItemStack MOMOTECH_MINERAL_ESSENCE_COAL = new CustomItemStack(Material.COAL, MomoTech.languageManager.getItemName("mineral_essence_coal"), MomoTech.languageManager.getItemLore("mineral_essence_coal"));
    public static final ItemStack MOMOTECH_METAL_ESSENCE_COPPER = new CustomItemStack(Material.BRICK, MomoTech.languageManager.getItemName("metal_essence_copper"), MomoTech.languageManager.getItemLore("metal_essence_copper"));
    public static final ItemStack MOMOTECH_METAL_ESSENCE_LEAD = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("metal_essence_lead"), MomoTech.languageManager.getItemLore("metal_essence_lead"));
    public static final ItemStack MOMOTECH_METAL_ESSENCE_MAGNESIUM = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("metal_essence_magnesium"), MomoTech.languageManager.getItemLore("metal_essence_magnesium"));
    public static final ItemStack MOMOTECH_METAL_ESSENCE_GOLD = new CustomItemStack(Material.GOLD_INGOT, MomoTech.languageManager.getItemName("metal_essence_gold"), MomoTech.languageManager.getItemLore("metal_essence_gold"));
    public static final ItemStack MOMOTECH_METAL_ESSENCE_ALUMINUM = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("metal_essence_aluminum"), MomoTech.languageManager.getItemLore("metal_essence_aluminum"));
    public static final ItemStack MOMOTECH_METAL_ESSENCE_TIN = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("metal_essence_tin"), MomoTech.languageManager.getItemLore("metal_essence_tin"));
    public static final ItemStack MOMOTECH_METAL_ESSENCE_ZINC = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("metal_essence_zinc"), MomoTech.languageManager.getItemLore("metal_essence_zinc"));
    public static final ItemStack MOMOTECH_METAL_ESSENCE_SILVER = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("metal_essence_silver"), MomoTech.languageManager.getItemLore("metal_essence_silver"));
    public static final ItemStack MOMOTECH_MINERAL_SINGULARITY_DIAMOND = new CustomItemStack(Material.DIAMOND, MomoTech.languageManager.getItemName("mineral_singularity_diamond"), MomoTech.languageManager.getItemLore("mineral_singularity_diamond"));
    public static final ItemStack MOMOTECH_MINERAL_SINGULARITY_IRON = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("mineral_singularity_iron"), MomoTech.languageManager.getItemLore("mineral_singularity_iron"));
    public static final ItemStack MOMOTECH_MINERAL_SINGULARITY_GOLD = new CustomItemStack(Material.GOLD_INGOT, MomoTech.languageManager.getItemName("mineral_singularity_gold"), MomoTech.languageManager.getItemLore("mineral_singularity_gold"));
    public static final ItemStack MOMOTECH_MINERAL_SINGULARITY_QUARTZ = new CustomItemStack(Material.QUARTZ, MomoTech.languageManager.getItemName("mineral_singularity_quartz"), MomoTech.languageManager.getItemLore("mineral_singularity_quartz"));
    public static final ItemStack MOMOTECH_MINERAL_SINGULARITY_EMERALD = new CustomItemStack(Material.EMERALD, MomoTech.languageManager.getItemName("mineral_singularity_emerald"), MomoTech.languageManager.getItemLore("mineral_singularity_emerald"));
    public static final ItemStack MOMOTECH_MINERAL_SINGULARITY_REDSTONE = new CustomItemStack(Material.REDSTONE, MomoTech.languageManager.getItemName("mineral_singularity_redstone"), MomoTech.languageManager.getItemLore("mineral_singularity_redstone"));
    public static final ItemStack MOMOTECH_MINERAL_SINGULARITY_LAPIS = new CustomItemStack(Material.LAPIS_LAZULI, MomoTech.languageManager.getItemName("mineral_singularity_lapis"), MomoTech.languageManager.getItemLore("mineral_singularity_lapis"));
    public static final ItemStack MOMOTECH_MINERAL_SINGULARITY_COAL = new CustomItemStack(Material.COAL, MomoTech.languageManager.getItemName("mineral_singularity_coal"), MomoTech.languageManager.getItemLore("mineral_singularity_coal"));
    public static final ItemStack MOMOTECH_METAL_SINGULARITY_COPPER = new CustomItemStack(Material.BRICK, MomoTech.languageManager.getItemName("metal_singularity_copper"), MomoTech.languageManager.getItemLore("metal_singularity_copper"));
    public static final ItemStack MOMOTECH_METAL_SINGULARITY_LEAD = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("metal_singularity_lead"), MomoTech.languageManager.getItemLore("metal_singularity_lead"));
    public static final ItemStack MOMOTECH_METAL_SINGULARITY_MAGNESIUM = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("metal_singularity_magnesium"), MomoTech.languageManager.getItemLore("metal_singularity_magnesium"));
    public static final ItemStack MOMOTECH_METAL_SINGULARITY_GOLD = new CustomItemStack(Material.GOLD_INGOT, MomoTech.languageManager.getItemName("metal_singularity_gold"), MomoTech.languageManager.getItemLore("metal_singularity_gold"));
    public static final ItemStack MOMOTECH_METAL_SINGULARITY_ALUMINUM = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("metal_singularity_aluminum"), MomoTech.languageManager.getItemLore("metal_singularity_aluminum"));
    public static final ItemStack MOMOTECH_METAL_SINGULARITY_TIN = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("metal_singularity_tin"), MomoTech.languageManager.getItemLore("metal_singularity_tin"));
    public static final ItemStack MOMOTECH_METAL_SINGULARITY_ZINC = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("metal_singularity_zinc"), MomoTech.languageManager.getItemLore("metal_singularity_zinc"));
    public static final ItemStack MOMOTECH_METAL_SINGULARITY_SILVER = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("metal_singularity_silver"), MomoTech.languageManager.getItemLore("metal_singularity_silver"));
    public static final ItemStack MOMOTECH_MAGNET = new CustomItemStack(Material.IRON_BLOCK, MomoTech.languageManager.getItemName("magnet"), MomoTech.languageManager.getItemLore("magnet"));
    public static final ItemStack MOMOTECH_ELECTROMAGNET = new CustomItemStack(Material.GOLD_BLOCK, MomoTech.languageManager.getItemName("electromagnet"), MomoTech.languageManager.getItemLore("electromagnet"));
    public static final ItemStack MOMOTECH_IRON_CORE = new CustomItemStack(Material.GLASS_BOTTLE, MomoTech.languageManager.getItemName("iron_core"), MomoTech.languageManager.getItemLore("iron_core"));
    public static final ItemStack MOMOTECH_WIRE_COIL = new CustomItemStack(Material.STRING, MomoTech.languageManager.getItemName("wire_coil"), MomoTech.languageManager.getItemLore("wire_coil"));
    public static final ItemStack MOMOTECH_MAGNETIZER = new CustomItemStack(Material.IRON_BLOCK, MomoTech.languageManager.getItemName("magnetizer"), MomoTech.languageManager.getItemLore("magnetizer"));
    public static final ItemStack MOMOTECH_ELECTROMAGNET_FACTORY = new CustomItemStack(Material.WHITE_STAINED_GLASS, MomoTech.languageManager.getItemName("electromagnet_factory"), MomoTech.languageManager.getItemLore("electromagnet_factory"));
    public static final ItemStack MOMOTECH_INFINITY_INGOT = new CustomItemStack(Material.NETHERITE_SCRAP, MomoTech.languageManager.getItemName("infinity_ingot"), MomoTech.languageManager.getItemLore("infinity_ingot"));
    public static final ItemStack MOMOTECH_HIGHSPEED_GEO_MINER = new CustomItemStack(Material.NETHERITE_BLOCK, MomoTech.languageManager.getItemName("highspeed_geo_miner"), MomoTech.languageManager.getItemLore("highspeed_geo_miner"));
    public static final ItemStack MOMOTECH_STARTER_GENERATOR = new CustomItemStack(Material.GLASS, MomoTech.languageManager.getItemName("starter_generator"), MomoTech.languageManager.getItemLore("starter_generator"));
    public static final ItemStack MOMOTECH_MINERAL_SINGULARITY = new CustomItemStack(Material.NETHERITE_INGOT, MomoTech.languageManager.getItemName("mineral_singularity"), MomoTech.languageManager.getItemLore("mineral_singularity"));
    public static final ItemStack MOMOTECH_METAL_SINGULARITY = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("metal_singularity"), MomoTech.languageManager.getItemLore("metal_singularity"));
    public static final ItemStack MOMOTECH_FLINT_GENERATOR = new CustomItemStack(Material.DEEPSLATE_GOLD_ORE, MomoTech.languageManager.getItemName("flint_generator"), MomoTech.languageManager.getItemLore("flint_generator"));
    public static final ItemStack MOMOTECH_INFINITY_SINGULARITY = new CustomItemStack(Material.IRON_NUGGET, MomoTech.languageManager.getItemName("infinity_singularity"), MomoTech.languageManager.getItemLore("infinity_singularity"));
    public static final ItemStack MOMOTECH_CONCEPT = new CustomItemStack(Material.BONE_MEAL, MomoTech.languageManager.getItemName("concept"), MomoTech.languageManager.getItemLore("concept"));
    public static final ItemStack MOMOTECH_CHARGED_INGOT = new CustomItemStack(Material.NETHERITE_INGOT, MomoTech.languageManager.getItemName("charged_ingot"), MomoTech.languageManager.getItemLore("charged_ingot"));
    public static final ItemStack MOMOTECH_RESOURCE = new CustomItemStack(Material.COMMAND_BLOCK, MomoTech.languageManager.getItemName("resource"), MomoTech.languageManager.getItemLore("resource"));
    public static final ItemStack MOMOTECH_PRIMAL_COMMAND_BLOCK_IMPULSE = new CustomItemStack(Material.COMMAND_BLOCK, MomoTech.languageManager.getItemName("primal_command_block_impulse"), MomoTech.languageManager.getItemLore("primal_command_block_impulse"));
    public static final ItemStack MOMOTECH_PRIMAL_COMMAND_BLOCK_REPEATING = new CustomItemStack(Material.REPEATING_COMMAND_BLOCK, MomoTech.languageManager.getItemName("primal_command_block_repeating"), MomoTech.languageManager.getItemLore("primal_command_block_repeating"));
    public static final ItemStack MOMOTECH_PRIMAL_COMMAND_BLOCK_CHAIN = new CustomItemStack(Material.CHAIN_COMMAND_BLOCK, MomoTech.languageManager.getItemName("primal_command_block_chain"), MomoTech.languageManager.getItemLore("primal_command_block_chain"));
    public static final ItemStack MOMOTECH_INFINITY_GEAR = new CustomItemStack(Material.REDSTONE_TORCH, MomoTech.languageManager.getItemName("infinity_gear"), MomoTech.languageManager.getItemLore("infinity_gear"));
    public static final ItemStack MOMOTECH_EFFECT_REMOVER = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("effect_remover"), MomoTech.languageManager.getItemLore("effect_remover"));
    public static final ItemStack MOMOTECH_INVENTORY_THROWER = new CustomItemStack(Material.GOLD_INGOT, MomoTech.languageManager.getItemName("inventory_thrower"), MomoTech.languageManager.getItemLore("inventory_thrower"));
    public static final ItemStack MOMOTECH_INFINITY_LIGHT_AND_DARK_COLLECTOR = new CustomItemStack(Material.GLOWSTONE, MomoTech.languageManager.getItemName("infinity_light_and_dark_collector"), MomoTech.languageManager.getItemLore("infinity_light_and_dark_collector"));
    public static final ItemStack MOMOTECH_ENTROPY_RECONSTRUCTOR = new CustomItemStack(Material.BLACK_CONCRETE, MomoTech.languageManager.getItemName("entropy_reconstructor"), MomoTech.languageManager.getItemLore("entropy_reconstructor"));
    public static final ItemStack MOMOTECH_INFINITY_ENTROPY_RECONSTRUCTOR = new CustomItemStack(Material.BLACK_CONCRETE, MomoTech.languageManager.getItemName("infinity_entropy_reconstructor"), MomoTech.languageManager.getItemLore("infinity_entropy_reconstructor"));
    public static final ItemStack MOMOTECH_INFINITY_MACHINE_CORE = new CustomItemStack(Material.BLACK_CONCRETE, MomoTech.languageManager.getItemName("infinity_machine_core"), MomoTech.languageManager.getItemLore("infinity_machine_core"));
    public static final ItemStack MOMOTECH_LIGHT_AND_DARK_INGOT = new CustomItemStack(Material.FLINT, MomoTech.languageManager.getItemName("light_and_dark_ingot"), MomoTech.languageManager.getItemLore("light_and_dark_ingot"));
    public static final ItemStack MOMOTECH_INFINITY_DUST_EXTRACTOR = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("infinity_dust_extractor"), MomoTech.languageManager.getItemLore("infinity_dust_extractor"));
    public static final ItemStack MOMOTECH_INFINITY_DUST_EXTRACTOR_ALUMINUM = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("infinity_dust_extractor_aluminum"), MomoTech.languageManager.getItemLore("infinity_dust_extractor_aluminum"));
    public static final ItemStack MOMOTECH_INFINITY_DUST_EXTRACTOR_MAGNESIUM = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("infinity_dust_extractor_magnesium"), MomoTech.languageManager.getItemLore("infinity_dust_extractor_magnesium"));
    public static final ItemStack MOMOTECH_INFINITY_DUST_EXTRACTOR_COPPER = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("infinity_dust_extractor_copper"), MomoTech.languageManager.getItemLore("infinity_dust_extractor_copper"));
    public static final ItemStack MOMOTECH_INFINITY_DUST_EXTRACTOR_GOLD = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("infinity_dust_extractor_gold"), MomoTech.languageManager.getItemLore("infinity_dust_extractor_gold"));
    public static final ItemStack MOMOTECH_INFINITY_DUST_EXTRACTOR_SILVER = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("infinity_dust_extractor_silver"), MomoTech.languageManager.getItemLore("infinity_dust_extractor_silver"));
    public static final ItemStack MOMOTECH_INFINITY_DUST_EXTRACTOR_LEAD = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("infinity_dust_extractor_lead"), MomoTech.languageManager.getItemLore("infinity_dust_extractor_lead"));
    public static final ItemStack MOMOTECH_INFINITY_DUST_EXTRACTOR_TIN = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("infinity_dust_extractor_tin"), MomoTech.languageManager.getItemLore("infinity_dust_extractor_tin"));
    public static final ItemStack MOMOTECH_INFINITY_DUST_EXTRACTOR_ZINC = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("infinity_dust_extractor_zinc"), MomoTech.languageManager.getItemLore("infinity_dust_extractor_zinc"));
    public static final ItemStack MOMOTECH_INFINITY_DUST_EXTRACTOR_IRON = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("infinity_dust_extractor_iron"), MomoTech.languageManager.getItemLore("infinity_dust_extractor_iron"));
    public static final ItemStack MOMOTECH_INFINITY_URANIUM_EXTRACTOR = new CustomItemStack(Material.GREEN_CONCRETE_POWDER, MomoTech.languageManager.getItemName("infinity_uranium_extractor"), MomoTech.languageManager.getItemLore("infinity_uranium_extractor"));
    public static final ItemStack MOMOTECH_INFINITY_GEO_MINER = new CustomItemStack(Material.NETHERITE_BLOCK, MomoTech.languageManager.getItemName("infinity_geo_miner"), MomoTech.languageManager.getItemLore("infinity_geo_miner"));
    public static final ItemStack MOMOTECH_PRIMAL_MATTER_GENERATOR = new CustomItemStack(Material.BOOKSHELF, MomoTech.languageManager.getItemName("primal_matter_generator"), MomoTech.languageManager.getItemLore("primal_matter_generator"));
    public static final ItemStack MOMOTECH_INFINITY_NUCLEAR_REACTOR = new CustomItemStack(Material.DIAMOND_ORE, MomoTech.languageManager.getItemName("infinity_nuclear_reactor"), MomoTech.languageManager.getItemLore("infinity_nuclear_reactor"));
    public static final ItemStack MOMOTECH_VIRTUAL_SPAWNER_OVERWORLD_MOBS = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("virtual_spawner_overworld_mobs"), MomoTech.languageManager.getItemLore("virtual_spawner_overworld_mobs"));
    public static final ItemStack MOMOTECH_VIRTUAL_SPAWNER_AQUATIC_ANIMALS = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("virtual_spawner_aquatic_animals"), MomoTech.languageManager.getItemLore("virtual_spawner_aquatic_animals"));
    public static final ItemStack MOMOTECH_VIRTUAL_SPAWNER_ZOMBIFIED_PIGLIN = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("virtual_spawner_zombified_piglin"), MomoTech.languageManager.getItemLore("virtual_spawner_zombified_piglin"));
    public static final ItemStack MOMOTECH_VIRTUAL_SPAWNER_ENDERMAN = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("virtual_spawner_enderman"), MomoTech.languageManager.getItemLore("virtual_spawner_enderman"));
    public static final ItemStack MOMOTECH_VIRTUAL_SPAWNER_CREEPER = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("virtual_spawner_creeper"), MomoTech.languageManager.getItemLore("virtual_spawner_creeper"));
    public static final ItemStack MOMOTECH_VIRTUAL_SPAWNER_DROWNED = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("virtual_spawner_drowned"), MomoTech.languageManager.getItemLore("virtual_spawner_drowned"));
    public static final ItemStack MOMOTECH_VIRTUAL_SPAWNER_ANIMALS = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("virtual_spawner_animals"), MomoTech.languageManager.getItemLore("virtual_spawner_animals"));
    public static final ItemStack MOMOTECH_VIRTUAL_SPAWNER_SLIME = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("virtual_spawner_slime"), MomoTech.languageManager.getItemLore("virtual_spawner_slime"));
    public static final ItemStack MOMOTECH_VIRTUAL_SPAWNER_BLAZE = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("virtual_spawner_blaze"), MomoTech.languageManager.getItemLore("virtual_spawner_blaze"));
    public static final ItemStack MOMOTECH_VIRTUAL_SPAWNER_MAGMA_CUBE = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("virtual_spawner_magma_cube"), MomoTech.languageManager.getItemLore("virtual_spawner_magma_cube"));
    public static final ItemStack MOMOTECH_INFINITY_RESOURCE_CONDENSER = new CustomItemStack(Material.CHISELED_POLISHED_BLACKSTONE, MomoTech.languageManager.getItemName("infinity_resource_condenser"), MomoTech.languageManager.getItemLore("infinity_resource_condenser"));
    public static final ItemStack MOMOTECH_INFINITY_MINER = new CustomItemStack(Material.BLUE_CONCRETE_POWDER, MomoTech.languageManager.getItemName("infinity_miner"), MomoTech.languageManager.getItemLore("infinity_miner"));
    public static final ItemStack MOMOTECH_INFINITY_MINER_MINERAL_BLOCK = new CustomItemStack(Material.GILDED_BLACKSTONE, MomoTech.languageManager.getItemName("infinity_miner_mineral_block"), MomoTech.languageManager.getItemLore("infinity_miner_mineral_block"));
    public static final ItemStack MOMOTECH_INFINITY_PLANT_GROWTH_CHAMBER = new CustomItemStack(Material.CHISELED_DEEPSLATE, MomoTech.languageManager.getItemName("infinity_crop_growth_chamber"), MomoTech.languageManager.getItemLore("infinity_crop_growth_chamber"));
    public static final ItemStack MOMOTECH_INFINITY_TREE_GROWTH_CHAMBER = new CustomItemStack(Material.CHISELED_DEEPSLATE, MomoTech.languageManager.getItemName("infinity_tree_growth_chamber"), MomoTech.languageManager.getItemLore("infinity_tree_growth_chamber"));
    public static final ItemStack MOMOTECH_CHARGED_QUANTUM = new CustomItemStack(Material.SLIME_BALL, MomoTech.languageManager.getItemName("charged_quantum"), MomoTech.languageManager.getItemLore("charged_quantum"));
    public static final ItemStack MOMOTECH_RANDOM_QUANTUM = new CustomItemStack(Material.CLAY_BALL, MomoTech.languageManager.getItemName("random_quantum"), MomoTech.languageManager.getItemLore("random_quantum"));
    public static final ItemStack MOMOTECH_RANDOM_QUANTUM_GENERATOR = new CustomItemStack(Material.GRAY_WOOL, MomoTech.languageManager.getItemName("random_quantum_generator"), MomoTech.languageManager.getItemLore("random_quantum_generator"));
    public static final ItemStack MOMOTECH_QUANTUM_CHARGING_MACHINE = new CustomItemStack(Material.WHITE_WOOL, MomoTech.languageManager.getItemName("quantum_charging_machine"), MomoTech.languageManager.getItemLore("quantum_charging_machine"));
    public static final ItemStack MOMOTECH_INFINITY_INGOT_FORMER = new CustomItemStack(Material.GRAY_CONCRETE, MomoTech.languageManager.getItemName("infinity_ingot_former"), MomoTech.languageManager.getItemLore("infinity_ingot_former"));
    public static final ItemStack MOMOTECH_ENDGAME_GENERATOR = new CustomItemStack(Material.EMERALD_BLOCK, MomoTech.languageManager.getItemName("endgame_generator"), MomoTech.languageManager.getItemLore("endgame_generator"));
    public static final ItemStack MOMOTECH_ENDGAME_CAPACITOR = new CustomItemStack(Material.YELLOW_STAINED_GLASS, MomoTech.languageManager.getItemName("endgame_capacitor"), MomoTech.languageManager.getItemLore("endgame_capacitor"));
    public static final ItemStack MOMOTECH_ENERGY_DEVOURER = new CustomItemStack(Material.BLUE_STAINED_GLASS, MomoTech.languageManager.getItemName("energy_devourer"), MomoTech.languageManager.getItemLore("energy_devourer"));
    public static final ItemStack MOMOTECH_ITEM_RESETTER = new CustomItemStack(Material.ORANGE_CONCRETE_POWDER, MomoTech.languageManager.getItemName("item_resetter"), MomoTech.languageManager.getItemLore("item_resetter"));
    public static final ItemStack MOMOTECH_INFINITY_BOOTS = new CustomItemStack(Material.NETHERITE_BOOTS, MomoTech.languageManager.getItemName("infinity_boots"), MomoTech.languageManager.getItemLore("infinity_boots"));
    public static final ItemStack MOMOTECH_INFINITY_PICKAXE = new CustomItemStack(Material.DIAMOND_PICKAXE, MomoTech.languageManager.getItemName("infinity_pickaxe"), MomoTech.languageManager.getItemLore("infinity_pickaxe"));
    public static final ItemStack MOMOTECH_SEALED_EVOKER = new CustomItemStack(Material.GLASS_PANE, MomoTech.languageManager.getItemName("sealed_evoker"), MomoTech.languageManager.getItemLore("sealed_evoker"));
    public static final ItemStack MOMOTECH_ETERNAL_PARTICLE = new CustomItemStack(Material.BLUE_DYE, MomoTech.languageManager.getItemName("eternal_particle"), MomoTech.languageManager.getItemLore("eternal_particle"));
    public static final ItemStack MOMOTECH_ETERNAL_SINGULARITY = new CustomItemStack(Material.DIAMOND_BLOCK, MomoTech.languageManager.getItemName("eternal_singularity"), MomoTech.languageManager.getItemLore("eternal_singularity"));
    public static final ItemStack MOMOTECH_ETERNAL_PARTICLE_CONSTUCTOR = new CustomItemStack(Material.GRAY_CONCRETE_POWDER, MomoTech.languageManager.getItemName("eternal_particle_constructor"), MomoTech.languageManager.getItemLore("eternal_particle_constructor"));
    public static final ItemStack MOMOTECH_DIGITAL_CAPACITOR = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("digital_capacitor"), MomoTech.languageManager.getItemLore("digital_capacitor"));
    public static final ItemStack MOMOTECH_ID_DISPLAY = new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, MomoTech.languageManager.getItemName("id_display"), MomoTech.languageManager.getItemLore("id_display"));
    public static final ItemStack MOMOTECH_PROTON = new CustomItemStack(Material.TURTLE_EGG, MomoTech.languageManager.getItemName("proton"), MomoTech.languageManager.getItemLore("proton"));
    public static final ItemStack MOMOTECH_ZYGOTE = new CustomItemStack(Material.TURTLE_EGG, MomoTech.languageManager.getItemName("zygote"), MomoTech.languageManager.getItemLore("zygote"));
    public static final ItemStack MOMOTECH_PARTICLE_COLLECTOR = new CustomItemStack(Material.GREEN_STAINED_GLASS, MomoTech.languageManager.getItemName("particle_collector"), MomoTech.languageManager.getItemLore("particle_collector"));
    public static final ItemStack MOMOTECH_PROTON_INGOT = new CustomItemStack(Material.AMETHYST_SHARD, MomoTech.languageManager.getItemName("proton_ingot"), MomoTech.languageManager.getItemLore("proton_ingot"));
    public static final ItemStack MOMOTECH_ZYGOTE_INGOT = new CustomItemStack(Material.AMETHYST_SHARD, MomoTech.languageManager.getItemName("zygote_ingot"), MomoTech.languageManager.getItemLore("zygote_ingot"));
    public static final ItemStack MOMOTECH_SALT_QUARRY = new CustomItemStack(Material.WHITE_STAINED_GLASS, MomoTech.languageManager.getItemName("salt_quarry"), MomoTech.languageManager.getItemLore("salt_quarry"));
    public static final ItemStack MOMOTECH_ALLOY_FABRICATOR = new CustomItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS, MomoTech.languageManager.getItemName("alloy_fabricator"), MomoTech.languageManager.getItemLore("alloy_fabricator"));
    public static final ItemStack MOMOTECH_METAL_ESSENCE = new CustomItemStack(Material.GOLD_BLOCK, MomoTech.languageManager.getItemName("metal_essence"), MomoTech.languageManager.getItemLore("metal_essence"));
    public static final ItemStack MOMOTECH_COSMIC_SUPREME_BLABLA_GENERATOR = new CustomItemStack(Material.REDSTONE_LAMP, MomoTech.languageManager.getItemName("cosmic_supreme_blabla_generator"), MomoTech.languageManager.getItemLore("cosmic_supreme_blabla_generator"));
    public static final ItemStack MOMOTECH_HIGHPRESSURE_COMPRESSOR = new CustomItemStack(Material.GLASS, MomoTech.languageManager.getItemName("highpressure_compressor"), MomoTech.languageManager.getItemLore("highpressure_compressor"));
    public static final ItemGroup MOMOTECH;
    public static final ItemGroup MOMOTECH_NOTICE;
    public static final ItemGroup MOMOTECH_THANKS;
    public static final ItemGroup MOMOTECH_MATERIALS;
    public static final ItemGroup MOMOTECH_COMPRESSED_RESOURCES;
    public static final ItemGroup MOMOTECH_TOOLS;
    public static final ItemGroup MOMOTECH_RESOURCE_GENERATORS;
    public static final ItemGroup MOMOTECH_ELECTRICITY;
    public static final ItemGroup MOMOTECH_BASIC_MACHINES;
    public static final ItemGroup MOMOTECH_INFINITY_MACHINES;
    public static final ItemGroup MOMOTECH_ENDGAME_MACHINES;
    
    public static final ItemStack[] MOMOTECH_COMPRESSED_COBBLESTONE = new ItemStack[100];
    

    static {
        String[][] name = {
            {
                MomoTech.languageManager.getItemName("compressed_minerals.fold.1-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.netherite"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.2-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.netherite"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.3-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.netherite"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.4-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.netherite"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.5-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.netherite")
            },
            {
                MomoTech.languageManager.getItemName("compressed_minerals.fold.1-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.diamond"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.2-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.diamond"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.3-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.diamond"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.4-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.diamond"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.5-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.diamond")
            },
            {
                MomoTech.languageManager.getItemName("compressed_minerals.fold.1-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.emerald"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.2-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.emerald"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.3-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.emerald"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.4-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.emerald"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.5-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.emerald")
            },
            {
                MomoTech.languageManager.getItemName("compressed_minerals.fold.1-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.gold"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.2-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.gold"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.3-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.gold"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.4-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.gold"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.5-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.gold")
            },
            {
                MomoTech.languageManager.getItemName("compressed_minerals.fold.1-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.iron"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.2-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.iron"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.3-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.iron"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.4-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.iron"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.5-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.iron")
            },
            {
                MomoTech.languageManager.getItemName("compressed_minerals.fold.1-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.quartz"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.2-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.quartz"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.3-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.quartz"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.4-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.quartz"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.5-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.quartz")
            },
            {
                MomoTech.languageManager.getItemName("compressed_minerals.fold.1-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.redstone"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.2-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.redstone"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.3-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.redstone"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.4-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.redstone"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.5-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.redstone")
            },
            {
                MomoTech.languageManager.getItemName("compressed_minerals.fold.1-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.lapis"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.2-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.lapis"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.3-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.lapis"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.4-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.lapis"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.5-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.lapis")
            },
            {
                MomoTech.languageManager.getItemName("compressed_minerals.fold.1-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.coalEssence"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.2-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.coalEssence"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.3-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.coalEssence"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.4-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.coalEssence"),
                MomoTech.languageManager.getItemName("compressed_minerals.fold.5-fold") + MomoTech.languageManager.getItemName("compressed_minerals.minerals.coalEssence")
            }
        };
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 3; ++j) {
                MOMOTECH_COMPRESSED_MINERALS[i][j] = new CustomItemStack(Utils.compressedMineralMaterials[i], "&f" + name[i][j], MomoTech.languageManager.getItemLore("compressed_minerals"));
            }
        }
        for (int i = 0; i < 50; i++) {
            MOMOTECH_COMPRESSED_COBBLESTONE[i] = new CustomItemStack(Material.COBBLESTONE, "&f" + (i + 1) + MomoTech.languageManager.getItemName("compressed_cobblestone"), MomoTech.languageManager.getItemLore("compressed_cobblestone"));
        }
        ItemStack[] GROUP = {
                new CustomItemStack(Material.CHAIN_COMMAND_BLOCK, MomoTech.languageManager.getGeneric("group.momotechnology")),
                new CustomItemStack(Material.PAPER, MomoTech.languageManager.getGeneric("group.notice")),
                new CustomItemStack(Material.ENCHANTED_BOOK, MomoTech.languageManager.getGeneric("group.thanks_and_special_materials")),
                new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getGeneric("group.materials")),
                new CustomItemStack(Material.GOLD_BLOCK, MomoTech.languageManager.getGeneric("group.compressed_resources")),
                new CustomItemStack(Material.DIAMOND, MomoTech.languageManager.getGeneric("group.tools")),
                new CustomItemStack(Material.SOUL_CAMPFIRE, MomoTech.languageManager.getGeneric("group.resource_generators")),
                new CustomItemStack(Material.SEA_PICKLE, MomoTech.languageManager.getGeneric("group.electricity")),
                new CustomItemStack(Material.BLACK_CONCRETE_POWDER, MomoTech.languageManager.getGeneric("group.basic_machines")),
                new CustomItemStack(Material.PRISMARINE_CRYSTALS, MomoTech.languageManager.getGeneric("group.infinity_machines")),
                new CustomItemStack(Material.REPEATING_COMMAND_BLOCK, MomoTech.languageManager.getGeneric("group.endgame_machines"))};      
        Register.add(GROUP);
        MOMOTECH_NOTICE = new SubGroup("MOMOTECH_NOTICE", GROUP[1]);
        MOMOTECH_THANKS = new SubGroup("MOMOTECH_THANKS", GROUP[2]);
        MOMOTECH_MATERIALS = new SubGroup("MOMOTECH_MATERIALS", GROUP[3]);
        MOMOTECH_COMPRESSED_RESOURCES = new SubGroup("MOMOTECH_COMPRESSED_RESOURCES", GROUP[4]);
        MOMOTECH_TOOLS = new SubGroup("MOMOTECH_TOOLS", GROUP[5]);
        MOMOTECH_RESOURCE_GENERATORS = new SubGroup("MOMOTECH_RESOURCE_GENERATORS", GROUP[6]);
        MOMOTECH_ELECTRICITY = new SubGroup("MOMOTECH_ELECTRICITY", GROUP[7]);
        MOMOTECH_BASIC_MACHINES = new SubGroup("MOMOTECH_BASIC_MACHINES", GROUP[8]);
        MOMOTECH_INFINITY_MACHINES = new SubGroup("MOMOTECH_INFINITY_MACHINES", GROUP[9]);
        MOMOTECH_ENDGAME_MACHINES = new SubGroup("MOMOTECH_ENDGAME_MACHINES", GROUP[10]);

        MOMOTECH = new MultiGroup("MOMOTECH", GROUP[0], MOMOTECH_NOTICE, MOMOTECH_THANKS, MOMOTECH_MATERIALS, MOMOTECH_COMPRESSED_RESOURCES, MOMOTECH_TOOLS, MOMOTECH_RESOURCE_GENERATORS, MOMOTECH_ELECTRICITY, MOMOTECH_BASIC_MACHINES, MOMOTECH_INFINITY_MACHINES, MOMOTECH_ENDGAME_MACHINES);
        MOMOTECH.register(MomoTech.getInstance());
    }
}
