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

    public static final ItemStack QUANTITY_ITEM = new CustomItemStack(Material.PURPLE_DYE, MomoTech.languageManager.getItemName("quantitative_plugin"), MomoTech.languageManager.getItemLore("quantitative_plugin"));
    public static final ItemStack FROG_LIGHT_GENERATOR = new CustomItemStack(Material.OCHRE_FROGLIGHT, MomoTech.languageManager.getItemName("frog_light_generator"), MomoTech.languageManager.getItemLore("frog_light_generator"));
    public static final ItemStack STONE_GENERATOR = new CustomItemStack(Material.STONE, MomoTech.languageManager.getItemName("stone_generator"), MomoTech.languageManager.getItemLore("stone_generator"));
    public static final ItemStack ORE_GENERATOR = new CustomItemStack(Material.DIAMOND_ORE, MomoTech.languageManager.getItemName("ore_generator"), MomoTech.languageManager.getItemLore("ore_generator"));
    public static final ItemStack SAND_GENERATOR = new CustomItemStack(Material.SANDSTONE, MomoTech.languageManager.getItemName("sand_generator"), MomoTech.languageManager.getItemLore("sand_generator"));
    public static final ItemStack STONE_GENERATOR_I = new CustomItemStack(Material.COBBLESTONE, MomoTech.languageManager.getItemName("stone_generator_i"), MomoTech.languageManager.getItemLore("stone_generator_i"));
    public static final ItemStack GLASS_GENERATOR = new CustomItemStack(Material.GLASS, MomoTech.languageManager.getItemName("glass_generator"), MomoTech.languageManager.getItemLore("glass_generator"));
    public static final ItemStack TEMPLATE_GENERATOR = new CustomItemStack(Material.MELON, MomoTech.languageManager.getItemName("template_generator"), MomoTech.languageManager.getItemLore("template_generator"));
    public static final ItemStack FISH_GENERATOR = new CustomItemStack(Material.SEA_LANTERN, MomoTech.languageManager.getItemName("fish_generator"), MomoTech.languageManager.getItemLore("fish_generator"));
    public static final ItemStack DUST_GENERATOR = new CustomItemStack(Material.SAND, MomoTech.languageManager.getItemName("dust_generator"), MomoTech.languageManager.getItemLore("dust_generator"));
    public static final ItemStack STONES_GENERATOR = new CustomItemStack(Material.SNOW_BLOCK, MomoTech.languageManager.getItemName("stones_generator"), MomoTech.languageManager.getItemLore("stones_generator"));
    public static final ItemStack ICE_GENERATOR = new CustomItemStack(Material.BLUE_ICE, MomoTech.languageManager.getItemName("ice_generator"), MomoTech.languageManager.getItemLore("ice_generator"));
    public static final ItemStack Generator = new CustomItemStack(Material.ORANGE_CONCRETE_POWDER, MomoTech.languageManager.getItemName("generator"), MomoTech.languageManager.getItemLore("generator"));
    public static final ItemStack LINE_GENERATOR = new CustomItemStack(Material.GRAY_WOOL, MomoTech.languageManager.getItemName("string_generator"), MomoTech.languageManager.getItemLore("string_generator"));
    public static final ItemStack COMMAND_BLOCK_GENERATOR = new CustomItemStack(Material.POLISHED_BLACKSTONE, MomoTech.languageManager.getItemName("command_block_generator"), MomoTech.languageManager.getItemLore("command_block_generator"));
    public static final ItemStack C_GENERATOR = new CustomItemStack(Material.COAL_BLOCK, MomoTech.languageManager.getItemName("c_generator"), MomoTech.languageManager.getItemLore("c_generator"));
    public static final ItemStack CREATIVE__ = new CustomItemStack(Material.GLASS_PANE, MomoTech.languageManager.getItemName("creative_generator"), MomoTech.languageManager.getItemLore("creative_generator"));
    public static final ItemStack COMMAND_BLOCK_GETTER = new CustomItemStack(Material.COMMAND_BLOCK, MomoTech.languageManager.getItemName("command_block_getter"), MomoTech.languageManager.getItemLore("command_block_getter"));
    public static final ItemStack COBBLE_STONE_GENERATOR_II = new CustomItemStack(Material.SNOW_BLOCK, MomoTech.languageManager.getItemName("cobble_stone_generator_ii"), MomoTech.languageManager.getItemLore("cobble_stone_generator_ii"));
    public static final ItemStack MOMOTECH_DIGITAL = new CustomItemStack(SlimefunUtils.getCustomHead("80c4528e622bd318720d38e0e4599e69bf23308f89693920e0e4ecb55d1c0bac"), MomoTech.languageManager.getItemName("digital_component"), "§f0.0");
    public static final ItemStack MOMOTECH_LETTER = new CustomItemStack(Material.SUGAR, MomoTech.languageManager.getItemName("letter"), MomoTech.languageManager.getItemLore("letter"));
    public static final ItemStack MOMOTECH_ID_CARD = new CustomItemStack(Material.PAPER, MomoTech.languageManager.getItemName("id_card"), MomoTech.languageManager.getItemLore("id_card"));
    public static final ItemStack MOMOTECH_ID_PUTTER = new CustomItemStack(Material.BOOKSHELF, MomoTech.languageManager.getItemName("id_putter"));
    public static final ItemStack MOMOTECH_LETTER_CONSTRUCTOR = new CustomItemStack(Material.BEEHIVE, MomoTech.languageManager.getItemName("letter_constructor"));
    public static final ItemStack MOMOTECH_FINAL_STAR = new CustomItemStack(Material.HONEYCOMB, MomoTech.languageManager.getItemName("final_star"), MomoTech.languageManager.getItemLore("final_star"));
    public static final ItemStack MOMOTECH_ID_CHANGER = new CustomItemStack(Material.GLASS, MomoTech.languageManager.getItemName("id_changer"), MomoTech.languageManager.getItemLore("id_changer"));
    public static final ItemStack MOMOTECH_UNCONTROLLABLE_EMPTY_GENERATOR = new CustomItemStack(Material.DEEPSLATE_LAPIS_ORE, MomoTech.languageManager.getItemName("uncontrollable_empty_generator"), MomoTech.languageManager.getItemLore("uncontrollable_empty_generator"));
    public static final ItemStack MOMOTECH_RANDOM_COPIER = new CustomItemStack(Material.DEEPSLATE_EMERALD_ORE, MomoTech.languageManager.getItemName("random_copier"), MomoTech.languageManager.getItemLore("random_copier"));
    public static final ItemStack MOMOTECH_FINAL_COPIER = new CustomItemStack(Material.DEEPSLATE_GOLD_ORE, MomoTech.languageManager.getItemName("final_copier"), MomoTech.languageManager.getItemLore("final_copier"));
    public static final ItemStack MOMOTECH_EXP = new CustomItemStack(Material.EXPERIENCE_BOTTLE, MomoTech.languageManager.getItemName("exp"), MomoTech.languageManager.getItemLore("exp"));
    public static final ItemStack MOMOTECH_FINAL_ITEM = new CustomItemStack(Material.FERN, MomoTech.languageManager.getItemName("final_item"), MomoTech.languageManager.getItemLore("final_item"));
    public static final ItemStack SEA_ITEM_GENERATOR = new CustomItemStack(Material.PRISMARINE, MomoTech.languageManager.getItemName("sea_item_generator"), MomoTech.languageManager.getItemLore("sea_item_generator"));
    public static final ItemStack BEE_GENERATOR = new CustomItemStack(Material.BEE_NEST, MomoTech.languageManager.getItemName("bee_generator"), MomoTech.languageManager.getItemLore("bee_generator"));
    public static final ItemStack SPIDER_EYE_GENERATOR = new CustomItemStack(Material.SPAWNER, MomoTech.languageManager.getItemName("spider_eye_generator"), MomoTech.languageManager.getItemLore("spider_eye_generator"));
    public static final ItemStack MOMOTECH_ORE_COLLECTOR = new CustomItemStack(Material.DEEPSLATE_COAL_ORE, MomoTech.languageManager.getItemName("ore_collector"), MomoTech.languageManager.getItemLore("ore_collector"));
    public static final ItemStack MOMOTECH_EMPTY_SHELL = new CustomItemStack(Material.STRUCTURE_VOID, "§7Null", MomoTech.languageManager.getItemLore("emptyShell"));
    public static final ItemStack MOMOTECH_SYMBOL_ADDITION = new CustomItemStack(Material.BLAZE_POWDER, MomoTech.languageManager.getItemName("symbol_addition"), MomoTech.languageManager.getItemLore("symbol_addition"));
    public static final ItemStack MOMOTECH_SYMBOL_SUBTRACTION = new CustomItemStack(Material.BLAZE_POWDER, MomoTech.languageManager.getItemName("symbol_subtraction"), MomoTech.languageManager.getItemLore("symbol_subtraction"));
    public static final ItemStack MOMOTECH_SYMBOL_MULTIPLICATION = new CustomItemStack(Material.BLAZE_POWDER, MomoTech.languageManager.getItemName("symbol_multiplication"), MomoTech.languageManager.getItemLore("symbol_multiplication"));
    public static final ItemStack MOMOTECH_SYMBOL_DIVISION = new CustomItemStack(Material.BLAZE_POWDER, MomoTech.languageManager.getItemName("symbol_division"), MomoTech.languageManager.getItemLore("symbol_division"));
    public static final ItemStack MOMOTECH_NONE = new CustomItemStack(new ItemStack(Material.BLACK_WOOL), MomoTech.languageManager.getItemName("none"), MomoTech.languageManager.getItemLore("none"));
    public static final ItemStack MOMOTECH_NUMBER_BUG = new CustomItemStack(new ItemStack(Material.WHITE_STAINED_GLASS_PANE), MomoTech.languageManager.getItemName("bug.operational_formula"));
    public static final ItemStack MOMOTECH_NUMBER_BUG_I = new CustomItemStack(new ItemStack(Material.RED_STAINED_GLASS_PANE), MomoTech.languageManager.getItemName("bug.decimal"));
    public static final ItemStack MOMOTECH_NUMBER_BUG_II = new CustomItemStack(new ItemStack(Material.ORANGE_STAINED_GLASS_PANE), MomoTech.languageManager.getItemName("bug.date"));
    public static final ItemStack MOMOTECH_NUMBER_BUG_III = new CustomItemStack(new ItemStack(Material.YELLOW_STAINED_GLASS_PANE), MomoTech.languageManager.getItemName("bug.positive_overload"));
    public static final ItemStack MOMOTECH_NUMBER_BUG_IV = new CustomItemStack(new ItemStack(Material.GREEN_STAINED_GLASS_PANE), MomoTech.languageManager.getItemName("bug.negative_overload"));
    public static final ItemStack MOMOTECH_NUMBER_BUG_V = new CustomItemStack(new ItemStack(Material.BLUE_STAINED_GLASS_PANE), MomoTech.languageManager.getItemName("bug.system"));
    public static final ItemStack MOMOTECH_DIGITAL_CONSTRUCTOR = new CustomItemStack(SlimefunUtils.getCustomHead("f26dad74b2bab105cb68c94eb3be32f5dbda42eab944b6ed9e803136f8f619bc"), MomoTech.languageManager.getItemName("digital_constructor"), MomoTech.languageManager.getItemLore("digital_constructor"));
    public static final ItemStack MOMOTECH_SYMBOL_GENERATOR = new CustomItemStack(SlimefunUtils.getCustomHead("f26dad74b2bab105cb68c94eb3be32f5dbda42eab944b6ed9e803136f8f619bc"), MomoTech.languageManager.getItemName("symbol_generator"), MomoTech.languageManager.getItemLore("symbol_generator"));
    public static final ItemStack MOMOTECH_INCREMENT = new CustomItemStack(new ItemStack(Material.CREEPER_HEAD), MomoTech.languageManager.getItemName("increment"), MomoTech.languageManager.getItemLore("increment"));
    public static final ItemStack MOMOTECH_ORDINARY_NUMBER_COMBINATOR = new CustomItemStack(Material.SKELETON_SKULL, MomoTech.languageManager.getItemName("ordinary_number_combinator"), MomoTech.languageManager.getItemLore("ordinary_number_combinator"));
    public static final ItemStack MOMOTECH_EMPTY_SHELL_GENERATOR = new CustomItemStack(Material.BLACK_CONCRETE_POWDER, MomoTech.languageManager.getItemName("empty_shell_generator"), MomoTech.languageManager.getItemLore("empty_shell_generator"));
    public static final ItemStack MOMOTECH_EMPTY_SHELL_GENERATOR_I = new CustomItemStack(Material.WHITE_CONCRETE_POWDER, MomoTech.languageManager.getItemName("empty_shell_generator_i"), MomoTech.languageManager.getItemLore("empty_shell_generator_i"));
    public static final ItemStack MOMOTECH_CREATIVE_ITEM = new CustomItemStack(Material.END_CRYSTAL, MomoTech.languageManager.getItemName("creative_item"));
    public static final ItemStack MOMOTECH_CREATIVE_ITEM_I = new CustomItemStack(Material.END_CRYSTAL, MomoTech.languageManager.getItemName("creative_item_i"));
    public static final ItemStack MOMOTECH_CREATIVE_ITEM_GENERATOR = new CustomItemStack(Material.COBBLESTONE, MomoTech.languageManager.getItemName("creative_item_generator"), MomoTech.languageManager.getItemLore("creative_item_generator"));
    public static final ItemStack MOMOTECH_UNCONTROLLABLE_EMPTY = new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, MomoTech.languageManager.getItemName("uncontrollable_empty"), MomoTech.languageManager.getItemLore("uncontrollable_empty"));
    public static final ItemStack CreativeGenerator = new CustomItemStack(new ItemStack(Material.BLACK_WOOL), MomoTech.languageManager.getItemName("creative_generator"), MomoTech.languageManager.getItemLore("creative_generator"));
    public static final ItemStack MOMOTECH_NONE_GENERATOR = new CustomItemStack(new ItemStack(Material.DIRT), MomoTech.languageManager.getItemName("none_generator"), MomoTech.languageManager.getItemLore("none_generator"));
    public static final ItemStack MOMOTECH_CREATIVE_ITEM_II = new CustomItemStack(Material.END_CRYSTAL, MomoTech.languageManager.getItemName("creative_item_ii"));
    public static final ItemStack MOMOTECH_QUANTITY_CONSTRUCTOR = new CustomItemStack(Material.HONEY_BLOCK, MomoTech.languageManager.getItemName("quantity_constructor"), MomoTech.languageManager.getItemLore("quantity_constructor"));
    public static final ItemStack MOMOTECH_BUG_CRYSTAL = new CustomItemStack(Material.NETHER_STAR, MomoTech.languageManager.getItemName("bug_crystal"), MomoTech.languageManager.getItemLore("bug_crystal"));
    public static final ItemStack QY = new CustomItemStack(new ItemStack(Material.COMMAND_BLOCK), MomoTech.languageManager.getItemName("qy"), MomoTech.languageManager.getItemLore("qy"));
    public static final ItemStack wbx = new CustomItemStack(new ItemStack(Material.COMMAND_BLOCK), MomoTech.languageManager.getItemName("wbx"), MomoTech.languageManager.getItemLore("wbx"));
    public static final ItemStack sky = new CustomItemStack(new ItemStack(Material.COMMAND_BLOCK), MomoTech.languageManager.getItemName("sky"), MomoTech.languageManager.getItemLore("sky"));
    public static final ItemStack plugin = new CustomItemStack(new ItemStack(Material.PAPER), MomoTech.languageManager.getItemName("plugin"), MomoTech.languageManager.getItemLore("plugin"));
    public static final ItemStack BUGGGGG = new CustomItemStack(new ItemStack(Material.ENDER_CHEST), MomoTech.languageManager.getItemName("buggggg"), MomoTech.languageManager.getItemLore("buggggg"));
    public static final ItemStack ELSE_1 = new CustomItemStack(Material.PAPER, MomoTech.languageManager.getItemName("else_1"));
    public static final ItemStack ELSE_2 = new CustomItemStack(Material.PAPER, MomoTech.languageManager.getItemName("else_2"));
    public static final ItemStack ELSE_3 = new CustomItemStack(Material.PAPER, MomoTech.languageManager.getItemName("else_3"));
    public static final ItemStack FULL = new CustomItemStack(new ItemStack(Material.EGG), MomoTech.languageManager.getItemName("full"), MomoTech.languageManager.getItemLore("full"));
    public static final ItemStack DAMAGE_ITEM = new CustomItemStack(new ItemStack(Material.CHAIN_COMMAND_BLOCK), MomoTech.languageManager.getItemName("damage_item"), MomoTech.languageManager.getItemLore("damage_item"));

    public static final ItemStack[][] Mineral = new ItemStack[9][5];

    public static final ItemStack STONE_SWORD = new CustomItemStack(Material.DIAMOND_SWORD, MomoTech.languageManager.getItemName("stone_sword"), MomoTech.languageManager.getItemLore("stone_sword"));
    public static final ItemStack FINAL_C_ = new CustomItemStack(Material.COBBLESTONE, MomoTech.languageManager.getItemName("final_c_"), MomoTech.languageManager.getItemLore("final_c_"));
    public static final ItemStack PROTECT_ITEM = new CustomItemStack(new ItemStack(Material.TURTLE_HELMET), MomoTech.languageManager.getItemName("protect_item"), MomoTech.languageManager.getItemLore("protect_item"));
    public static final ItemStack STAR_OF_ALL = new CustomItemStack(Material.HEART_OF_THE_SEA, MomoTech.languageManager.getItemName("star_of_all"), MomoTech.languageManager.getItemLore("star_of_all"));
    public static final ItemStack MOMOTECH_COBBLE_STONE_STORE = new CustomItemStack(Material.GLASS, MomoTech.languageManager.getItemName("cobble_stone_store"), MomoTech.languageManager.getItemLore("cobble_stone_store"));
    public static final ItemStack MOMOTECH_COBBLESTONE_GENERATOR_FINAL = new CustomItemStack(Material.SLIME_BLOCK, MomoTech.languageManager.getItemName("cobblestone_generator_final"), MomoTech.languageManager.getItemLore("cobblestone_generator_final"));
    public static final ItemStack MOMOTECH_QUANTUM = new CustomItemStack(Material.SNOWBALL, MomoTech.languageManager.getItemName("quantum"), MomoTech.languageManager.getItemLore("quantum"));
    public static final ItemStack MOMOTECH_QUANTUM1 = new CustomItemStack(Material.MAGMA_CREAM, MomoTech.languageManager.getItemName("quantum1"), MomoTech.languageManager.getItemLore("quantum1"));
    public static final ItemStack MOMOTECH_BOX_OF_QUANTUM = new CustomItemStack(Material.CHEST, MomoTech.languageManager.getItemName("box_of_quantum"), MomoTech.languageManager.getItemLore("box_of_quantum"));
    public static final ItemStack MOMOTECH_SILK_TOUCH_PICKAXE = new CustomItemStack(Material.NETHERITE_PICKAXE, MomoTech.languageManager.getItemName("silk_touch_pickaxe"), MomoTech.languageManager.getItemLore("silk_touch_pickaxe"));
    public static final ItemStack MOMOTECH_PICKAXE = new CustomItemStack(Material.NETHERITE_PICKAXE, MomoTech.languageManager.getItemName("pickaxe"), MomoTech.languageManager.getItemLore("pickaxe"));
    public static final ItemStack MOMOTECH_PUMPKIN_CARVER = new CustomItemStack(Material.CARVED_PUMPKIN, MomoTech.languageManager.getItemName("pumpkin_carver"), MomoTech.languageManager.getItemLore("pumpkin_carver"));
    public static final ItemStack MOMOTECH_CLEAR = new CustomItemStack(Material.NETHERITE_INGOT, MomoTech.languageManager.getItemName("clear"), MomoTech.languageManager.getItemLore("clear"));
    public static final ItemStack MOMOTECH_FIXER = new CustomItemStack(Material.IRON_BLOCK, MomoTech.languageManager.getItemName("fixer"));
    public static final ItemStack MOMOTECH_TRANSPORTER = new CustomItemStack(Material.PISTON, MomoTech.languageManager.getItemName("transporter"), MomoTech.languageManager.getItemLore("transporter"));
    public static final ItemStack CHEST_GENERATOR = new CustomItemStack(Material.JUNGLE_LOG, MomoTech.languageManager.getItemName("chest_generator"), MomoTech.languageManager.getItemLore("chest_generator"));
    public static final ItemStack MOMOTECH_OPEN_BOX_ITEM = new CustomItemStack(Material.PURPLE_STAINED_GLASS, MomoTech.languageManager.getItemName("open_box_item"), MomoTech.languageManager.getItemLore("open_box_item"));
    public static final ItemStack MOMOTECH_SHINE = new CustomItemStack(Material.GLOWSTONE_DUST, MomoTech.languageManager.getItemName("shine"));
    public static final ItemStack MOMOTECH_DARK = new CustomItemStack(Material.GUNPOWDER, MomoTech.languageManager.getItemName("dark"));
    public static final ItemStack MOMOTECH_SHINE_AND_DARK_CONSTRUCTOR = new CustomItemStack(Material.GLOWSTONE, MomoTech.languageManager.getItemName("shine_and_dark_constructor"), MomoTech.languageManager.getItemLore("shine_and_dark_constructor"));
    public static final ItemStack MOMOTECH_SHINE_AND_DARK_GENERATOR = new CustomItemStack(Material.REDSTONE_LAMP, MomoTech.languageManager.getItemName("shine_and_dark_generator"), MomoTech.languageManager.getItemLore("shine_and_dark_generator"));
    public static final ItemStack MOMOTECH_SHINE1 = new CustomItemStack(Material.GLOWSTONE_DUST, MomoTech.languageManager.getItemName("shine1"), MomoTech.languageManager.getItemLore("shine1"));
    public static final ItemStack MOMOTECH_DARK1 = new CustomItemStack(Material.GUNPOWDER, MomoTech.languageManager.getItemName("dark1"), MomoTech.languageManager.getItemLore("dark1"));
    public static final ItemStack MOMOTECH_NETHERITE_PICKAXE_CHANGER = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("netherite_pickaxe_changer"), MomoTech.languageManager.getItemLore("netherite_pickaxe_changer"));
    public static final ItemStack DIAMOND_PICKAXE_GENERATOR = new CustomItemStack(Material.DIAMOND_BLOCK, MomoTech.languageManager.getItemName("diamond_pickaxe_generator"), MomoTech.languageManager.getItemLore("diamond_pickaxe_generator"));
    public static final ItemStack MOMOTECH_CONSTRUCTOR = new CustomItemStack(Material.CHISELED_POLISHED_BLACKSTONE, MomoTech.languageManager.getItemName("constructor"), MomoTech.languageManager.getItemLore("constructor"));
    public static final ItemStack MOMOTECH_DIAMOND = new CustomItemStack(Material.DIAMOND, MomoTech.languageManager.getItemName("diamond"), MomoTech.languageManager.getItemLore("diamond"));
    public static final ItemStack MOMOTECH_IRON = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("iron"), MomoTech.languageManager.getItemLore("iron"));
    public static final ItemStack MOMOTECH_GOLD = new CustomItemStack(Material.GOLD_INGOT, MomoTech.languageManager.getItemName("gold"), MomoTech.languageManager.getItemLore("gold"));
    public static final ItemStack MOMOTECH_QUARTZ = new CustomItemStack(Material.QUARTZ, MomoTech.languageManager.getItemName("quartz"), MomoTech.languageManager.getItemLore("quartz"));
    public static final ItemStack MOMOTECH_EMERALD = new CustomItemStack(Material.EMERALD, MomoTech.languageManager.getItemName("emerald"), MomoTech.languageManager.getItemLore("emerald"));
    public static final ItemStack MOMOTECH_REDSTONE = new CustomItemStack(Material.REDSTONE, MomoTech.languageManager.getItemName("redstone"), MomoTech.languageManager.getItemLore("redstone"));
    public static final ItemStack MOMOTECH_LAPIS = new CustomItemStack(Material.LAPIS_LAZULI, MomoTech.languageManager.getItemName("lapis"), MomoTech.languageManager.getItemLore("lapis"));
    public static final ItemStack MOMOTECH_COAL = new CustomItemStack(Material.COAL, MomoTech.languageManager.getItemName("coal"), MomoTech.languageManager.getItemLore("coal"));
    public static final ItemStack MOMOTECH_Cu = new CustomItemStack(Material.BRICK, MomoTech.languageManager.getItemName("cu"), MomoTech.languageManager.getItemLore("cu"));
    public static final ItemStack MOMOTECH_Pb = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("pb"), MomoTech.languageManager.getItemLore("pb"));
    public static final ItemStack MOMOTECH_Mg = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("mg"), MomoTech.languageManager.getItemLore("mg"));
    public static final ItemStack MOMOTECH_Au = new CustomItemStack(Material.GOLD_INGOT, MomoTech.languageManager.getItemName("au"), MomoTech.languageManager.getItemLore("au"));
    public static final ItemStack MOMOTECH_Al = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("al"), MomoTech.languageManager.getItemLore("al"));
    public static final ItemStack MOMOTECH_Sn = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("sn"), MomoTech.languageManager.getItemLore("sn"));
    public static final ItemStack MOMOTECH_Zn = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("zn"), MomoTech.languageManager.getItemLore("zn"));
    public static final ItemStack MOMOTECH_Ag = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("ag"), MomoTech.languageManager.getItemLore("ag"));
    public static final ItemStack MOMOTECH_DIAMOND1 = new CustomItemStack(Material.DIAMOND, MomoTech.languageManager.getItemName("diamond1"), MomoTech.languageManager.getItemLore("diamond1"));
    public static final ItemStack MOMOTECH_IRON1 = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("iron1"), MomoTech.languageManager.getItemLore("iron1"));
    public static final ItemStack MOMOTECH_GOLD1 = new CustomItemStack(Material.GOLD_INGOT, MomoTech.languageManager.getItemName("gold1"), MomoTech.languageManager.getItemLore("gold1"));
    public static final ItemStack MOMOTECH_QUARTZ1 = new CustomItemStack(Material.QUARTZ, MomoTech.languageManager.getItemName("quartz1"), MomoTech.languageManager.getItemLore("quartz1"));
    public static final ItemStack MOMOTECH_EMERALD1 = new CustomItemStack(Material.EMERALD, MomoTech.languageManager.getItemName("emerald1"), MomoTech.languageManager.getItemLore("emerald1"));
    public static final ItemStack MOMOTECH_REDSTONE1 = new CustomItemStack(Material.REDSTONE, MomoTech.languageManager.getItemName("redstone1"), MomoTech.languageManager.getItemLore("redstone1"));
    public static final ItemStack MOMOTECH_LAPIS1 = new CustomItemStack(Material.LAPIS_LAZULI, MomoTech.languageManager.getItemName("lapis1"), MomoTech.languageManager.getItemLore("lapis1"));
    public static final ItemStack MOMOTECH_COAL1 = new CustomItemStack(Material.COAL, MomoTech.languageManager.getItemName("coal1"), MomoTech.languageManager.getItemLore("coal1"));
    public static final ItemStack MOMOTECH_Cu1 = new CustomItemStack(Material.BRICK, MomoTech.languageManager.getItemName("cu1"), MomoTech.languageManager.getItemLore("cu1"));
    public static final ItemStack MOMOTECH_Pb1 = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("pb1"), MomoTech.languageManager.getItemLore("pb1"));
    public static final ItemStack MOMOTECH_Mg1 = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("mg1"), MomoTech.languageManager.getItemLore("mg1"));
    public static final ItemStack MOMOTECH_Au1 = new CustomItemStack(Material.GOLD_INGOT, MomoTech.languageManager.getItemName("au1"), MomoTech.languageManager.getItemLore("au1"));
    public static final ItemStack MOMOTECH_Al1 = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("al1"), MomoTech.languageManager.getItemLore("al1"));
    public static final ItemStack MOMOTECH_Sn1 = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("sn1"), MomoTech.languageManager.getItemLore("sn1"));
    public static final ItemStack MOMOTECH_Zn1 = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("zn1"), MomoTech.languageManager.getItemLore("zn1"));
    public static final ItemStack MOMOTECH_Ag1 = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("ag1"), MomoTech.languageManager.getItemLore("ag1"));
    public static final ItemStack MOMOTECH_REAL_MAGNET = new CustomItemStack(Material.IRON_BLOCK, MomoTech.languageManager.getItemName("real_magnet"), MomoTech.languageManager.getItemLore("real_magnet"));
    public static final ItemStack MOMOTECH_ELECTRICITY_MAGNET = new CustomItemStack(Material.GOLD_BLOCK, MomoTech.languageManager.getItemName("electricity_magnet"), MomoTech.languageManager.getItemLore("electricity_magnet"));
    public static final ItemStack MOMOTECH_IRON_STAR = new CustomItemStack(Material.GLASS_BOTTLE, MomoTech.languageManager.getItemName("iron_star"), MomoTech.languageManager.getItemLore("iron_star"));
    public static final ItemStack MOMOTECH_COIL = new CustomItemStack(Material.STRING, MomoTech.languageManager.getItemName("coil"), MomoTech.languageManager.getItemLore("coil"));
    public static final ItemStack MOMOTECH_MAGNETIZE = new CustomItemStack(Material.IRON_BLOCK, MomoTech.languageManager.getItemName("magnetize"), MomoTech.languageManager.getItemLore("magnetize"));
    public static final ItemStack MOMOTECH_MAGNET_GENERATOR = new CustomItemStack(Material.WHITE_STAINED_GLASS, MomoTech.languageManager.getItemName("magnet_generator"), MomoTech.languageManager.getItemLore("magnet_generator"));
    public static final ItemStack MOMOTECH_INFINITY = new CustomItemStack(Material.NETHERITE_SCRAP, MomoTech.languageManager.getItemName("infinity"), MomoTech.languageManager.getItemLore("infinity"));
    public static final ItemStack MOMOTECH_FAST_GEO = new CustomItemStack(Material.NETHERITE_BLOCK, MomoTech.languageManager.getItemName("fast_geo"), MomoTech.languageManager.getItemLore("fast_geo"));
    public static final ItemStack MOMOTECH_ORDINARY_GENERATOR = new CustomItemStack(Material.GLASS, MomoTech.languageManager.getItemName("ordinary_generator"), MomoTech.languageManager.getItemLore("ordinary_generator"));
    public static final ItemStack MOMOTECH_MINERAL_ = new CustomItemStack(Material.NETHERITE_INGOT, MomoTech.languageManager.getItemName("mineral_"), MomoTech.languageManager.getItemLore("mineral_"));
    public static final ItemStack MOMOTECH_METAL_ = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("metal_"), MomoTech.languageManager.getItemLore("metal_"));
    public static final ItemStack FLINT_GENERATOR = new CustomItemStack(Material.DEEPSLATE_GOLD_ORE, MomoTech.languageManager.getItemName("flint_generator"), MomoTech.languageManager.getItemLore("flint_generator"));
    public static final ItemStack MOMOTECH_RULE_STAR = new CustomItemStack(Material.IRON_NUGGET, MomoTech.languageManager.getItemName("rule_star"), MomoTech.languageManager.getItemLore("rule_star"));
    public static final ItemStack MOMOTECH_FINAL_RULE = new CustomItemStack(Material.BONE_MEAL, MomoTech.languageManager.getItemName("final_rule"), MomoTech.languageManager.getItemLore("final_rule"));
    public static final ItemStack MOMOTECH_ENERGY_INGOT = new CustomItemStack(Material.NETHERITE_INGOT, MomoTech.languageManager.getItemName("energy_ingot"), MomoTech.languageManager.getItemLore("energy_ingot"));
    public static final ItemStack MOMOTECH_RESOURCE = new CustomItemStack(Material.COMMAND_BLOCK, MomoTech.languageManager.getItemName("resource"), MomoTech.languageManager.getItemLore("resource"));
    public static final ItemStack MOMOTECH_COMMAND_BLOCK1 = new CustomItemStack(Material.COMMAND_BLOCK, MomoTech.languageManager.getItemName("command_block1"), MomoTech.languageManager.getItemLore("command_block1"));
    public static final ItemStack MOMOTECH_COMMAND_BLOCK2 = new CustomItemStack(Material.REPEATING_COMMAND_BLOCK, MomoTech.languageManager.getItemName("command_block2"), MomoTech.languageManager.getItemLore("command_block2"));
    public static final ItemStack MOMOTECH_COMMAND_BLOCK3 = new CustomItemStack(Material.CHAIN_COMMAND_BLOCK, MomoTech.languageManager.getItemName("command_block3"), MomoTech.languageManager.getItemLore("command_block3"));
    public static final ItemStack MOMOTECH_RULE_ITEM = new CustomItemStack(Material.REDSTONE_TORCH, MomoTech.languageManager.getItemName("rule_item"), MomoTech.languageManager.getItemLore("rule_item"));
    public static final ItemStack MOMOTECH_EFFECT_DELETER = new CustomItemStack(Material.IRON_INGOT, MomoTech.languageManager.getItemName("effect_deleter"), MomoTech.languageManager.getItemLore("effect_deleter"));
    public static final ItemStack MOMOTECH_THROW = new CustomItemStack(Material.GOLD_INGOT, MomoTech.languageManager.getItemName("throw"), MomoTech.languageManager.getItemLore("throw"));
    public static final ItemStack MOMOTECH_RULE_SHINE_AND_DARK_CONSTRUCTOR = new CustomItemStack(Material.GLOWSTONE, MomoTech.languageManager.getItemName("rule_shine_and_dark_constructor"), MomoTech.languageManager.getItemLore("rule_shine_and_dark_constructor"));
    public static final ItemStack MOMOTECH_ENTROPY_RECONSTRUCT = new CustomItemStack(Material.BLACK_CONCRETE, MomoTech.languageManager.getItemName("entropy_reconstruct"), MomoTech.languageManager.getItemLore("entropy_reconstruct"));
    public static final ItemStack MOMOTECH_RULE_RECONSTRUCT = new CustomItemStack(Material.BLACK_CONCRETE, MomoTech.languageManager.getItemName("rule_reconstruct"), MomoTech.languageManager.getItemLore("rule_reconstruct"));
    public static final ItemStack MOMOTECH_RULE_MACHINE_STAR = new CustomItemStack(Material.BLACK_CONCRETE, MomoTech.languageManager.getItemName("rule_machine_star"), MomoTech.languageManager.getItemLore("rule_machine_star"));
    public static final ItemStack MOMOTECH_SHINE_AND_DARK_INGOT = new CustomItemStack(Material.FLINT, MomoTech.languageManager.getItemName("shine_and_dark_ingot"), MomoTech.languageManager.getItemLore("shine_and_dark_ingot"));
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("rule_dust_generator"), MomoTech.languageManager.getItemLore("rule_dust_generator"));
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR1 = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("rule_dust_generator1"), MomoTech.languageManager.getItemLore("rule_dust_generator1"));
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR2 = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("rule_dust_generator2"), MomoTech.languageManager.getItemLore("rule_dust_generator2"));
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR3 = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("rule_dust_generator3"), MomoTech.languageManager.getItemLore("rule_dust_generator3"));
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR4 = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("rule_dust_generator4"), MomoTech.languageManager.getItemLore("rule_dust_generator4"));
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR5 = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("rule_dust_generator5"), MomoTech.languageManager.getItemLore("rule_dust_generator5"));
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR6 = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("rule_dust_generator6"), MomoTech.languageManager.getItemLore("rule_dust_generator6"));
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR7 = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("rule_dust_generator7"), MomoTech.languageManager.getItemLore("rule_dust_generator7"));
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR8 = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("rule_dust_generator8"), MomoTech.languageManager.getItemLore("rule_dust_generator8"));
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR9 = new CustomItemStack(Material.POLISHED_DEEPSLATE, MomoTech.languageManager.getItemName("rule_dust_generator9"), MomoTech.languageManager.getItemLore("rule_dust_generator9"));
    public static final ItemStack MOMOTECH_RULE_U_GENERATOR = new CustomItemStack(Material.GREEN_CONCRETE_POWDER, MomoTech.languageManager.getItemName("rule_u_generator"), MomoTech.languageManager.getItemLore("rule_u_generator"));
    public static final ItemStack MOMOTECH_RULE_GEO = new CustomItemStack(Material.NETHERITE_BLOCK, MomoTech.languageManager.getItemName("rule_geo"), MomoTech.languageManager.getItemLore("rule_geo"));
    public static final ItemStack MOMOTECH_RULE_CREATIVE_GENERATOR = new CustomItemStack(Material.BOOKSHELF, MomoTech.languageManager.getItemName("rule_creative_generator"), MomoTech.languageManager.getItemLore("rule_creative_generator"));
    public static final ItemStack MOMOTECH_RULE_REACTOR = new CustomItemStack(Material.DIAMOND_ORE, MomoTech.languageManager.getItemName("rule_reactor"), MomoTech.languageManager.getItemLore("rule_reactor"));
    public static final ItemStack MOMOTECH_MONSTER_ITEM = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("monster_item"), MomoTech.languageManager.getItemLore("monster_item"));
    public static final ItemStack MOMOTECH_MONSTER_ITEM1 = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("monster_item1"), MomoTech.languageManager.getItemLore("monster_item1"));
    public static final ItemStack MOMOTECH_MONSTER_ITEM2 = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("monster_item2"), MomoTech.languageManager.getItemLore("monster_item2"));
    public static final ItemStack MOMOTECH_MONSTER_ITEM3 = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("monster_item3"), MomoTech.languageManager.getItemLore("monster_item3"));
    public static final ItemStack MOMOTECH_MONSTER_ITEM4 = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("monster_item4"), MomoTech.languageManager.getItemLore("monster_item4"));
    public static final ItemStack MOMOTECH_MONSTER_ITEM5 = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("monster_item5"), MomoTech.languageManager.getItemLore("monster_item5"));
    public static final ItemStack MOMOTECH_MONSTER_ITEM6 = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("monster_item6"), MomoTech.languageManager.getItemLore("monster_item6"));
    public static final ItemStack MOMOTECH_MONSTER_ITEM7 = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("monster_item7"), MomoTech.languageManager.getItemLore("monster_item7"));
    public static final ItemStack MOMOTECH_MONSTER_ITEM8 = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("monster_item8"), MomoTech.languageManager.getItemLore("monster_item8"));
    public static final ItemStack MOMOTECH_MONSTER_ITEM9 = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("monster_item9"), MomoTech.languageManager.getItemLore("monster_item9"));
    public static final ItemStack MOMOTECH_RULE_CONSTRUCTOR = new CustomItemStack(Material.CHISELED_POLISHED_BLACKSTONE, MomoTech.languageManager.getItemName("rule_constructor"), MomoTech.languageManager.getItemLore("rule_constructor"));
    public static final ItemStack MOMOTECH_MINERAL_GENERATOR = new CustomItemStack(Material.BLUE_CONCRETE_POWDER, MomoTech.languageManager.getItemName("mineral_generator"), MomoTech.languageManager.getItemLore("mineral_generator"));
    public static final ItemStack MOMOTECH_MINERAL_BLOCK_GENERATOR = new CustomItemStack(Material.GILDED_BLACKSTONE, MomoTech.languageManager.getItemName("mineral_block_generator"), MomoTech.languageManager.getItemLore("mineral_block_generator"));
    public static final ItemStack MOMOTECH_PLANT = new CustomItemStack(Material.CHISELED_DEEPSLATE, MomoTech.languageManager.getItemName("plant"), MomoTech.languageManager.getItemLore("plant"));
    public static final ItemStack MOMOTECH_WOOD = new CustomItemStack(Material.CHISELED_DEEPSLATE, MomoTech.languageManager.getItemName("wood"), MomoTech.languageManager.getItemLore("wood"));
    public static final ItemStack MOMOTECH_ENERGY_QUANTUM = new CustomItemStack(Material.SLIME_BALL, MomoTech.languageManager.getItemName("energy_quantum"), MomoTech.languageManager.getItemLore("energy_quantum"));
    public static final ItemStack MOMOTECH_RANDOM_QUANTUM = new CustomItemStack(Material.CLAY_BALL, MomoTech.languageManager.getItemName("random_quantum"), MomoTech.languageManager.getItemLore("random_quantum"));
    public static final ItemStack MOMOTECH_RANDOM_QUANTUM_GENERATOR = new CustomItemStack(Material.GRAY_WOOL, MomoTech.languageManager.getItemName("random_quantum_generator"), MomoTech.languageManager.getItemLore("random_quantum_generator"));
    public static final ItemStack MOMOTECH_ENERGY_QUANTUM_GENERATOR = new CustomItemStack(Material.WHITE_WOOL, MomoTech.languageManager.getItemName("energy_quantum_generator"), MomoTech.languageManager.getItemLore("energy_quantum_generator"));
    public static final ItemStack MOMOTECH_FINAL_INGOT_GENERATOR = new CustomItemStack(Material.GRAY_CONCRETE, MomoTech.languageManager.getItemName("final_ingot_generator"), MomoTech.languageManager.getItemLore("final_ingot_generator"));
    public static final ItemStack MOMOTECH_FINAL_GENERATOR = new CustomItemStack(Material.EMERALD_BLOCK, MomoTech.languageManager.getItemName("final_generator"), MomoTech.languageManager.getItemLore("final_generator"));
    public static final ItemStack MOMOTECH_FINAL_CAPITAL = new CustomItemStack(Material.YELLOW_STAINED_GLASS, MomoTech.languageManager.getItemName("final_capital"), MomoTech.languageManager.getItemLore("final_capital"));
    public static final ItemStack MOMOTECH_FINAL_ELECTRIC_EATER = new CustomItemStack(Material.BLUE_STAINED_GLASS, MomoTech.languageManager.getItemName("final_electric_eater"), MomoTech.languageManager.getItemLore("final_electric_eater"));
    public static final ItemStack MOMOTECH_ITEM_FIXER = new CustomItemStack(Material.ORANGE_CONCRETE_POWDER, MomoTech.languageManager.getItemName("item_fixer"), MomoTech.languageManager.getItemLore("item_fixer"));
    public static final ItemStack MOMOTECH_RULE_BOOTS = new CustomItemStack(Material.NETHERITE_BOOTS, MomoTech.languageManager.getItemName("rule_boots"), MomoTech.languageManager.getItemLore("rule_boots"));
    public static final ItemStack MOMOTECH_RULE_PICKAXE = new CustomItemStack(Material.DIAMOND_PICKAXE, MomoTech.languageManager.getItemName("rule_pickaxe"), MomoTech.languageManager.getItemLore("rule_pickaxe"));
    public static final ItemStack MOMOTECH_LOOTER = new CustomItemStack(Material.GLASS_PANE, MomoTech.languageManager.getItemName("looter"), MomoTech.languageManager.getItemLore("looter"));
    public static final ItemStack MOMOTECH_FOREVER = new CustomItemStack(Material.BLUE_DYE, MomoTech.languageManager.getItemName("forever"), MomoTech.languageManager.getItemLore("forever"));
    public static final ItemStack MOMOTECH_FOREVER_ = new CustomItemStack(Material.DIAMOND_BLOCK, MomoTech.languageManager.getItemName("forever_"), MomoTech.languageManager.getItemLore("forever_"));
    public static final ItemStack MOMOTECH_ETERNAL_MINING_MACHINE = new CustomItemStack(Material.GRAY_CONCRETE_POWDER, MomoTech.languageManager.getItemName("eternal_mining_machine"), MomoTech.languageManager.getItemLore("eternal_mining_machine"));
    public static final ItemStack MOMOTECH_DIGIT_GENERATOR = new CustomItemStack(Material.BLACK_STAINED_GLASS, MomoTech.languageManager.getItemName("digit_generator"), MomoTech.languageManager.getItemLore("digit_generator"));
    public static final ItemStack MOMOTECH_ID_DISPLAY = new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, MomoTech.languageManager.getItemName("id_display"), MomoTech.languageManager.getItemLore("id_display"));
    public static final ItemStack MOMOTECH_PROTON = new CustomItemStack(Material.TURTLE_EGG, MomoTech.languageManager.getItemName("proton"), MomoTech.languageManager.getItemLore("proton"));
    public static final ItemStack MOMOTECH_ZYGOTE = new CustomItemStack(Material.TURTLE_EGG, MomoTech.languageManager.getItemName("zygote"), MomoTech.languageManager.getItemLore("zygote"));
    public static final ItemStack MOMOTECH_PARTICLE_CONSTRUCTOR = new CustomItemStack(Material.GREEN_STAINED_GLASS, MomoTech.languageManager.getItemName("particle_constructor"), MomoTech.languageManager.getItemLore("particle_constructor"));
    public static final ItemStack MOMOTECH_PROTON_INGOT = new CustomItemStack(Material.AMETHYST_SHARD, MomoTech.languageManager.getItemName("proton_ingot"), MomoTech.languageManager.getItemLore("proton_ingot"));
    public static final ItemStack MOMOTECH_ZYGOTE_INGOT = new CustomItemStack(Material.AMETHYST_SHARD, MomoTech.languageManager.getItemName("zygote_ingot"), MomoTech.languageManager.getItemLore("zygote_ingot"));
    public static final ItemStack MOMOTECH_SALT_GENERATOR = new CustomItemStack(Material.WHITE_STAINED_GLASS, MomoTech.languageManager.getItemName("salt_generator"), MomoTech.languageManager.getItemLore("salt_generator"));
    public static final ItemStack MOMOTECH_INGOT_CONSTRUCTOR = new CustomItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS, MomoTech.languageManager.getItemName("ingot_constructor"), MomoTech.languageManager.getItemLore("ingot_constructor"));
    public static final ItemStack MOMOTECH_METAL_STAR = new CustomItemStack(Material.GOLD_BLOCK, MomoTech.languageManager.getItemName("metal_star"), MomoTech.languageManager.getItemLore("metal_star"));
    public static final ItemStack MOMOTECH_FINAL_ENERGY_GENERATOR = new CustomItemStack(Material.REDSTONE_LAMP, MomoTech.languageManager.getItemName("final_energy_generator"), MomoTech.languageManager.getItemLore("final_energy_generator"));
    public static final ItemStack MOMOTECH_SPECIAL_THINGS_CONSTRUCTOR = new CustomItemStack(Material.GLASS, MomoTech.languageManager.getItemName("special_things_constructor"), MomoTech.languageManager.getItemLore("special_things_constructor"));
    public static final ItemGroup MOMOTECH_ITEM;
    public static final ItemGroup MOMOTECH_FINAL;
    public static final ItemGroup MOMOTECH;
    public static final ItemGroup MOMOTECH_MACHINE;
    public static final ItemGroup MOMOTECH_MINERAL;
    public static final ItemGroup MOMOTECH_ORDINARY_MACHINE;
    public static final ItemGroup MOMOTECH_THANKING;
    public static final ItemGroup MOMOTECH_TOOL;
    public static final ItemGroup MOMOTECH__;
    public static final ItemGroup MOMOTECH_ELECTRICITY;
    public static final ItemGroup MOMOTECH_INF;
    public static final ItemStack[] Cobblestone = new ItemStack[100];
    public static final ItemGroup MOMOTECH_INF_MACHINE;

    static {

        String[][] name = {{"1-Compressed Diamond", "2-Compressed Diamond", "3-Compressed Diamond", "4-Compressed Diamond", "5-Compressed Diamond"},
                {"1-Compressed Netherite Ingot", "2-Compressed Netherite Ingot", "3-Compressed Netherite Ingot", "4-Compressed Netherite Ingot", "5-Compressed Netherite Ingot"},
                {"1-Compressed Coal", "2-Compressed Coal", "3-Compressed Coal", "4-Compressed Coal", "5-Compressed Coal"},
                {"1-Compressed Emerald", "2-Compressed Emerald", "3-Compressed Emerald", "4-Compressed Emerald", "5-Compressed Emerald"},
                {"1-Compressed Quartz", "2-Compressed Quartz", "3-Compressed Quartz", "4-Compressed Quartz", "5-Compressed Quartz"},
                {"1-Compressed Redstone", "2-Compressed Redstone", "3-Compressed Redstone", "4-Compressed Redstone", "5-Compressed Redstone"},
                {"1-Compressed Iron", "2-Compressed Iron", "3-Compressed Iron", "4-Compressed Iron", "5-Compressed Iron"},
                {"1-Compressed Gold", "2-Compressed Gold", "3-Compressed Gold", "4-Compressed Gold", "5-Compressed Gold"},
                {"1-Compressed Lapis", "2-Compressed Lapis", "3-Compressed Lapis", "4-Compressed Lapis", "5-Compressed Lapis"}};
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 3; ++j) {
                Mineral[i][j] = new CustomItemStack(Utils.it[i], "&f" + name[i][j], "§7挤压矿物产生的精华...");
            }
        }
        for (int i = 0; i < 50; i++) {
            Cobblestone[i] = new CustomItemStack(Material.COBBLESTONE, "&c> &f" + (i + 1) + "-Compressed Cobblestone", "&7Just a type of materials", "&7Just for fun;D");
        }
        ItemStack[] GROUP = {new CustomItemStack(Material.PAPER, "&c&lAttention"),
                new CustomItemStack(Material.SOUL_CAMPFIRE, c("§#efa3de&lBasic §#ec98ed&lMaterials §#f1a5c6&lGenerator")), new CustomItemStack(Material.IRON_INGOT, c("§#d9f995&lBasic §#b2e5af&lItems")),
                new CustomItemStack(Material.DIAMOND, c("§#8cd1c9&lTool")), new CustomItemStack(Material.REPEATING_COMMAND_BLOCK, c("§#b2eeaa&l&k… §#c2e9a3&lFinal §#e3df94&lItems §#fed48a&l&k…")),
                new CustomItemStack(Material.BLACK_CONCRETE_POWDER, c("§#f9b98c&lBasic §#fec666&lMachine")), new CustomItemStack(Material.GOLD_BLOCK, "§6§lCompressed Items"),
                new CustomItemStack(Material.ENCHANTED_BOOK, c("§#fad365&lThanks &7&l- §#f0e878&lSpecial §#eaf684&lMaterials")), new CustomItemStack(Material.CHAIN_COMMAND_BLOCK, c("§#85f8c3&l&kMomo §#91f7b9&lTechnology")),
                new CustomItemStack(Material.BLAZE_POWDER, c("§#8b9fca&lInfinity &7&l- §#fc7e7f&lOrdinary")), new CustomItemStack(Material.SEA_PICKLE, c("§#65bde4&lElectric")), new CustomItemStack(Material.PRISMARINE_CRYSTALS, c("§#ff8773&lInfinity§#ff9b5e &7&l- §#ffa058&lFinal"))};
        Register.add(GROUP);
        MOMOTECH__ = new SubGroup("MOMOTECH__", GROUP[0]);
        MOMOTECH_ORDINARY_MACHINE = new SubGroup("MOMOTECH_ORDINARY_MACHINE", GROUP[1]);
        MOMOTECH_ITEM = new SubGroup("MOMOTECH_ITEM", GROUP[2]);
        MOMOTECH_TOOL = new SubGroup("MOMOTECH_TOOL", GROUP[3]);
        MOMOTECH_FINAL = new SubGroup("MOMOTECH_FINAL", GROUP[4]);
        MOMOTECH_MACHINE = new SubGroup("MOMOTECH_MACHINE", GROUP[5]);
        MOMOTECH_MINERAL = new SubGroup("MOMOTECH_MINERAL", GROUP[6]);
        MOMOTECH_THANKING = new SubGroup("MOMOTECH_THANKING", GROUP[7]);
        MOMOTECH_INF = new SubGroup("MOMOTECH_INF", GROUP[9]);
        MOMOTECH_ELECTRICITY = new SubGroup("MOMOTECH_ELECTRICITY", GROUP[10]);
        MOMOTECH_INF_MACHINE = new SubGroup("MOMOTECH_INF_MACHINE", GROUP[11]);
        MOMOTECH = new MultiGroup("MOMOTECH", GROUP[8], MOMOTECH__, MOMOTECH_THANKING, MOMOTECH_ITEM, MOMOTECH_MINERAL, MOMOTECH_TOOL, MOMOTECH_ORDINARY_MACHINE, MOMOTECH_MACHINE, MOMOTECH_FINAL, MOMOTECH_ELECTRICITY, MOMOTECH_INF, MOMOTECH_INF_MACHINE);
        MOMOTECH.register(MomoTech.getInstance());
    }
}
