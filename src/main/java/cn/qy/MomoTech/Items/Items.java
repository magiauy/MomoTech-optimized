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
    public static final ItemStack MOMOTECH_SHINE1 = new CustomItemStack(Material.GLOWSTONE_DUST, MomoTech.languageManager.getItemName("shine1"));
    public static final ItemStack MOMOTECH_DARK1 = new CustomItemStack(Material.GUNPOWDER, MomoTech.languageManager.getItemName("dark1"));
    public static final ItemStack MOMOTECH_NETHERITE_PICKAXE_CHANGER = new CustomItemStack(Material.BLACK_STAINED_GLASS, c("§#f5f5bc下§#f3f4b9界§#f0f3b6合§#edf1b3金§#ebf2b0镐§#e9f3ac转§#e7f3a9换§#e5f4a5器"), "§8⇨ §e⚡ §7100 J/t");
    public static final ItemStack DIAMOND_PICKAXE_GENERATOR = new CustomItemStack(Material.DIAMOND_BLOCK, "&b钻石镐&f生成器", "&7效率:8x");
    public static final ItemStack MOMOTECH_CONSTRUCTOR = new CustomItemStack(Material.CHISELED_POLISHED_BLACKSTONE, c("§#e3f5a2凝§#e1f69e聚§#dff79b者"), "&7凝聚精华于一体", "§8⇨ §e⚡ §7900 J/t");
    public static final ItemStack MOMOTECH_DIAMOND = new CustomItemStack(Material.DIAMOND, "&6矿物精华 &f- &b钻石");
    public static final ItemStack MOMOTECH_IRON = new CustomItemStack(Material.IRON_INGOT, "&6矿物精华 &f- &b铁");
    public static final ItemStack MOMOTECH_GOLD = new CustomItemStack(Material.GOLD_INGOT, "&6矿物精华 &f- &b金");
    public static final ItemStack MOMOTECH_QUARTZ = new CustomItemStack(Material.QUARTZ, "&6矿物精华 &f- &b石英");
    public static final ItemStack MOMOTECH_EMERALD = new CustomItemStack(Material.EMERALD, "&6矿物精华 &f- &b绿宝石");
    public static final ItemStack MOMOTECH_REDSTONE = new CustomItemStack(Material.REDSTONE, "&6矿物精华 &f- &b红石");
    public static final ItemStack MOMOTECH_LAPIS = new CustomItemStack(Material.LAPIS_LAZULI, "&6矿物精华 &f- &b青金石");
    public static final ItemStack MOMOTECH_COAL = new CustomItemStack(Material.COAL, "&6矿物精华 &f- &b煤炭");
    public static final ItemStack MOMOTECH_Cu = new CustomItemStack(Material.BRICK, "&6金属精华 &f- &b铜");
    public static final ItemStack MOMOTECH_Pb = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b铅");
    public static final ItemStack MOMOTECH_Mg = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b镁");
    public static final ItemStack MOMOTECH_Au = new CustomItemStack(Material.GOLD_INGOT, "&6金属精华 &f- &b金");
    public static final ItemStack MOMOTECH_Al = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b铝");
    public static final ItemStack MOMOTECH_Sn = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b锡");
    public static final ItemStack MOMOTECH_Zn = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b锌");
    public static final ItemStack MOMOTECH_Ag = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b银");
    public static final ItemStack MOMOTECH_DIAMOND1 = new CustomItemStack(Material.DIAMOND, "&6矿物核心 &f- &b钻石");
    public static final ItemStack MOMOTECH_IRON1 = new CustomItemStack(Material.IRON_INGOT, "&6矿物核心 &f- &b铁");
    public static final ItemStack MOMOTECH_GOLD1 = new CustomItemStack(Material.GOLD_INGOT, "&6矿物核心 &f- &b金");
    public static final ItemStack MOMOTECH_QUARTZ1 = new CustomItemStack(Material.QUARTZ, "&6矿物核心 &f- &b石英");
    public static final ItemStack MOMOTECH_EMERALD1 = new CustomItemStack(Material.EMERALD, "&6矿物核心 &f- &b绿宝石");
    public static final ItemStack MOMOTECH_REDSTONE1 = new CustomItemStack(Material.REDSTONE, "&6矿物核心 &f- &b红石");
    public static final ItemStack MOMOTECH_LAPIS1 = new CustomItemStack(Material.LAPIS_LAZULI, "&6矿物核心 &f- &b青金石");
    public static final ItemStack MOMOTECH_COAL1 = new CustomItemStack(Material.COAL, "&6矿物核心 &f- &b煤炭");
    public static final ItemStack MOMOTECH_Cu1 = new CustomItemStack(Material.BRICK, "&6金属核心 &f- &b铜");
    public static final ItemStack MOMOTECH_Pb1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b铅");
    public static final ItemStack MOMOTECH_Mg1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b镁");
    public static final ItemStack MOMOTECH_Au1 = new CustomItemStack(Material.GOLD_INGOT, "&6金属核心 &f- &b金");
    public static final ItemStack MOMOTECH_Al1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b铝");
    public static final ItemStack MOMOTECH_Sn1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b锡");
    public static final ItemStack MOMOTECH_Zn1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b锌");
    public static final ItemStack MOMOTECH_Ag1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b银");
    public static final ItemStack MOMOTECH_REAL_MAGNET = new CustomItemStack(Material.IRON_BLOCK, c("§#e2f096这§#e5ea92才§#e9e38d是§#ecdd89合§#efd784理§#f2d080的§#f5ca80磁§#f6c387铁§#f8bc8e!"));
    public static final ItemStack MOMOTECH_ELECTRICITY_MAGNET = new CustomItemStack(Material.GOLD_BLOCK, c("§#fab695这§#fbaf9d才§#fda8a4是§#ffa2ab合§#fa9fac理§#f39dab的§#ed9caa电§#e69aa9磁§#df98a8铁§#d897a7!"));
    public static final ItemStack MOMOTECH_IRON_STAR = new CustomItemStack(Material.GLASS_BOTTLE, "&f&l铁芯");
    public static final ItemStack MOMOTECH_COIL = new CustomItemStack(Material.STRING, c("§#d295a6线§#d59dae圈"));
    public static final ItemStack MOMOTECH_MAGNETIZE = new CustomItemStack(Material.IRON_BLOCK, c("§#d8a5b5磁§#dbadbc化§#deb5c3机"), "&7这才是更加合理的磁铁制作方式!", "§8⇨ §e⚡ §7200 J/t");
    public static final ItemStack MOMOTECH_MAGNET_GENERATOR = new CustomItemStack(Material.WHITE_STAINED_GLASS, c("§#e0bdca能§#e3c5d2源§#e4c9d8电§#e0c6de力§#ddc3e3电§#d9c0e8磁§#d6bdee铁§#d2bbf3一§#cfb8f9体§#c8b4f2机"), "§8⇨ §e⚡ §7500 J/t");
    public static final ItemStack MOMOTECH_INFINITY = new CustomItemStack(Material.NETHERITE_SCRAP, "&c规&e则&b锭");
    public static final ItemStack MOMOTECH_FAST_GEO = new CustomItemStack(Material.NETHERITE_BLOCK, c("§#c0afe6高§#b9abdb速§#b1a7d0化§#a9a2c5地§#a19eb9理§#9a9baf资§#9aa2ab源§#9aaaa8开§#9ab2a5采§#99baa1器"), "§8⇨ §e⚡ §710,000 J/t");
    public static final ItemStack MOMOTECH_ORDINARY_GENERATOR = new CustomItemStack(Material.GLASS, c("§#99c29e基§#99ca9b础§#9fce99发§#add099电§#bad19a机"), "§8⇨ §e⚡ §7500 J/t");
    public static final ItemStack MOMOTECH_MINERAL_ = new CustomItemStack(Material.NETHERITE_INGOT, "&6矿物核心");
    public static final ItemStack MOMOTECH_METAL_ = new CustomItemStack(Material.IRON_INGOT, "&e金属核心");
    public static final ItemStack FLINT_GENERATOR = new CustomItemStack(Material.DEEPSLATE_GOLD_ORE, "&6燧石&f生成器", "&7效率:4x");
    public static final ItemStack MOMOTECH_RULE_STAR = new CustomItemStack(Material.IRON_NUGGET, "&c时&6隙");
    public static final ItemStack MOMOTECH_FINAL_RULE = new CustomItemStack(Material.BONE_MEAL, "&3概&b念&a物");
    public static final ItemStack MOMOTECH_ENERGY_INGOT = new CustomItemStack(Material.NETHERITE_INGOT, c("§#c8d29a放§#d6d39a射§#e3d49b性§#f1d59b充§#e5d3a4能§#d2d1af锭"));
    public static final ItemStack MOMOTECH_RESOURCE = new CustomItemStack(Material.COMMAND_BLOCK, "&a&lResource", "&7大力支持本附属并且进行了大量宣传");
    public static final ItemStack MOMOTECH_COMMAND_BLOCK1 = new CustomItemStack(Material.COMMAND_BLOCK, "&6创世命令方块 - COMMON");
    public static final ItemStack MOMOTECH_COMMAND_BLOCK2 = new CustomItemStack(Material.REPEATING_COMMAND_BLOCK, "&6创世命令方块 - REPEATING");
    public static final ItemStack MOMOTECH_COMMAND_BLOCK3 = new CustomItemStack(Material.CHAIN_COMMAND_BLOCK, "&6创世命令方块 - CHAIN");
    public static final ItemStack MOMOTECH_RULE_ITEM = new CustomItemStack(Material.REDSTONE_TORCH, c("§#bfcebb创§#abccc6世§#98cad1齿§#85c7dd轮"));
    public static final ItemStack MOMOTECH_EFFECT_DELETER = new CustomItemStack(Material.IRON_INGOT, c("§#74c5e7状§#73c9e5态§#72cde4化§#71d0e2清§#70d4e1除§#6fd7df器"), "&7右键清除药水效果");
    public static final ItemStack MOMOTECH_THROW = new CustomItemStack(Material.GOLD_INGOT, c("§#6edbde背§#6bdddc包§#63dddb丢§#5cdeda出§#55ded9器"), "&7右键丢出所有物品", "&8包括盔甲");
    public static final ItemStack MOMOTECH_RULE_SHINE_AND_DARK_CONSTRUCTOR = new CustomItemStack(Material.GLOWSTONE, c("§#4eded8规§#47dfd6则§#3fdfd5光§#39dcbe暗§#34d8a2收§#2ed486集§#28d169器"), "&7大大提升了概率...", "§8⇨ §e⚡ §75,000 J/t");
    public static final ItemStack MOMOTECH_ENTROPY_RECONSTRUCT = new CustomItemStack(Material.BLACK_CONCRETE, c("§#23cd4d逆§#1dc930熵§#1dc71a重§#40d02c组§#62d83d器"), "&7说实话有点慢..", "§8⇨ §e⚡ §7500 J/t");
    public static final ItemStack MOMOTECH_RULE_RECONSTRUCT = new CustomItemStack(Material.BLACK_CONCRETE, c("§#85e14e规§#a8e960则§#caf271重§#edfb82组§#f9fc90器"), "&7这么快?", "§8⇨ §e⚡ §75,000 J/t");
    public static final ItemStack MOMOTECH_RULE_MACHINE_STAR = new CustomItemStack(Material.BLACK_CONCRETE, c("§#85e14e规§#8ede68则§#98dc82机§#a1d99b器§#abd7b5组§#b4d4cf件"));
    public static final ItemStack MOMOTECH_SHINE_AND_DARK_INGOT = new CustomItemStack(Material.FLINT, c("§#b9d2ce光§#c2d2ca暗§#cad1c7复§#d3d0c3合§#dbcfc0锭"));
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR1 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bAl", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR2 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bMg", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR3 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bCu", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR4 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bAu", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR5 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bAg", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR6 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bPb", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR7 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bSn", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR8 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bZn", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR9 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bFe", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_U_GENERATOR = new CustomItemStack(Material.GREEN_CONCRETE_POWDER, c("§#be63d9规§#cb6ad8则§#d871d8铀§#e577d7提§#f27ed7纯§#ff85d6器"), "&7效率:64x", "§8⇨ §e⚡ §75,000 J/t");
    public static final ItemStack MOMOTECH_RULE_GEO = new CustomItemStack(Material.NETHERITE_BLOCK, c("§#e4cfbc终§#eacdba焉§#e7c9c0地§#e4c5c5理§#e1c1cb资§#ddbcd0源§#dab8d6开§#d7b4db采§#cfafd7器"), "&7效率:16x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_CREATIVE_GENERATOR = new CustomItemStack(Material.BOOKSHELF, c("§#c4a9cb原§#b9a3be始§#ae9cb1物§#a396a4质§#999098生§#8e8a8b成§#9b9697器§#aca5a7α§#bdb5b7β§#cec4c8型"), "&7消耗大量电力自动生成", "&7每tick随机生成一个原始物质α或β", "&7他真的我哭死...", "§8⇨ §e⚡ §7100,000 J/t");
    public static final ItemStack MOMOTECH_RULE_REACTOR = new CustomItemStack(Material.DIAMOND_ORE, c("§#dfd3d8高§#f0e3e8速§#fdeff5裂§#faf2f2变§#f7f4f0器"), "&7效率:8x", "§8⇨ §e⚡ §75,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7主世界刷怪塔模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM1 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7鱼塔模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM2 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7猪人塔模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM3 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7末影人塔模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM4 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7苦力怕农场模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM5 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7溺尸塔模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM6 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7动物农场模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM7 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7史莱姆农场模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM8 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7烈焰人农场模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM9 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7岩浆怪农场模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_CONSTRUCTOR = new CustomItemStack(Material.CHISELED_POLISHED_BLACKSTONE, "&6规则 " + c("§#e3f5a2凝§#e1f69e聚§#dff79b者"), "&7效率:16x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MINERAL_GENERATOR = new CustomItemStack(Material.BLUE_CONCRETE_POWDER, c("§#f3f7ee规§#f0f9ec则§#edfbe9矿§#eafee7机"), "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MINERAL_BLOCK_GENERATOR = new CustomItemStack(Material.GILDED_BLACKSTONE, c("§#eafee6规§#edfde5则§#f1fce4矿§#f4fae3块§#f8f9e2收§#fbf8e1集§#fff6e0器"), "&7效率:16x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_PLANT = new CustomItemStack(Material.CHISELED_DEEPSLATE, c("§#ffefdc植§#ffe7d7物§#ffdfd2培§#ffd6cd养§#ffcec9器"), "&7插入植物种子或者是类似于睡莲, 藤蔓, 草等物品", "&7效率:32x", "§8⇨ §e⚡ §710,000 J/t");
    public static final ItemStack MOMOTECH_WOOD = new CustomItemStack(Material.CHISELED_DEEPSLATE, c("§#ffc6c4树§#fec2c1木§#f7cac4培§#f1d2c7养§#eadaca器"), "&7插入树苗或者下届菌类", "&7效率:32x", "§8⇨ §e⚡ §710,000 J/t");
    public static final ItemStack MOMOTECH_ENERGY_QUANTUM = new CustomItemStack(Material.SLIME_BALL, "&c高&e能&b量&a子", "&7危险, 高能!");
    public static final ItemStack MOMOTECH_RANDOM_QUANTUM = new CustomItemStack(Material.CLAY_BALL, "&e随&b机&a量&3子", "&7随机~", "&7右键会死掉");
    public static final ItemStack MOMOTECH_RANDOM_QUANTUM_GENERATOR = new CustomItemStack(Material.GRAY_WOOL, c("§#e4e2cd随§#ddead0机§#d7f3d3量§#d4f7d8子§#d5f8de发§#d6f9e5生§#d6fbeb器"));
    public static final ItemStack MOMOTECH_ENERGY_QUANTUM_GENERATOR = new CustomItemStack(Material.WHITE_WOOL, c("§#d7fcf2量§#d7fef8子§#d8fffe充§#ddffff能§#e3ffff器"), "§8⇨ §e⚡ &7500,000 J/t");
    public static final ItemStack MOMOTECH_FINAL_INGOT_GENERATOR = new CustomItemStack(Material.GRAY_CONCRETE, c("§#e9ffff终§#efffff焉§#f5ffff铸§#fbffff锭§#fffbfd机"), "&7效率:INFINITY");
    public static final ItemStack MOMOTECH_FINAL_GENERATOR = new CustomItemStack(Material.EMERALD_BLOCK, c("§#ffa7d8终§#ff97d0焉§#ff92bb发§#ff969c电§#ff9a7d机"), "§8⇨ §e⚡ &71,000,000,000 J/t");
    public static final ItemStack MOMOTECH_FINAL_CAPITAL = new CustomItemStack(Material.YELLOW_STAINED_GLASS, c("§#ffeaf6终§#ffd9ee焉§#ffc9e7电§#ffb8df容"), "&7不建议你在一个能源网络中同时使用两个", "&7可储存 §8⇨ §e⚡ &72,000,000,000 J");
    public static final ItemStack MOMOTECH_FINAL_ELECTRIC_EATER = new CustomItemStack(Material.BLUE_STAINED_GLASS, c("§#ff9e5e宇§#ffa23f宙§#ffa621吃§#ffaa02电§#f6b40a机"), "&7利用宇宙能量吃电...", "§8⇨ §e⚡ &72,000,000,000 J/t");
    public static final ItemStack MOMOTECH_ITEM_FIXER = new CustomItemStack(Material.ORANGE_CONCRETE_POWDER, c("§#ebbf15物§#e1ca1f品§#d7d52a重§#cddf35置§#c3ea3f器"), "&7重置粘液物品");
    public static final ItemStack MOMOTECH_RULE_BOOTS = new CustomItemStack(Material.NETHERITE_BOOTS, MomoTech.languageManager.getItemName("rule_boots"), MomoTech.languageManager.getItemLore("rule_boots"));
    public static final ItemStack MOMOTECH_RULE_PICKAXE = new CustomItemStack(Material.DIAMOND_PICKAXE, "&7终焉镐");
    public static final ItemStack MOMOTECH_LOOTER = new CustomItemStack(Material.GLASS_PANE, "&7&l封印 - 唤魔师", "&8右键打开");
    public static final ItemStack MOMOTECH_FOREVER = new CustomItemStack(Material.BLUE_DYE, c("§#b9f24e永§#b0f265恒§#a7f27c粒§#9ef293子"), "&7Forever...");
    public static final ItemStack MOMOTECH_FOREVER_ = new CustomItemStack(Material.DIAMOND_BLOCK, c("§#95f2aa永§#8cf2c1恒§#83f2d8奇§#81e9e2点"), "&7Forever...");
    public static final ItemStack MOMOTECH_ETERNAL_MINING_MACHINE = new CustomItemStack(Material.GRAY_CONCRETE_POWDER, c("§#83dbe4永§#86cce6恒§#88bee8矿§#8aafea机"), "&7缓慢挖掘...");
    public static final ItemStack MOMOTECH_DIGIT_GENERATOR = new CustomItemStack(Material.BLACK_STAINED_GLASS, c("§#8ca1ec数§#8e92ee字§#808dec发§#7288e9电§#6483e6式§#577ee4电§#4979e1容"), "&7可储存 §8⇨ §e⚡ &716,777,216 J");
    public static final ItemStack MOMOTECH_ID_DISPLAY = new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, "&7&l物品ID展示");
    public static final ItemStack MOMOTECH_PROTON = new CustomItemStack(Material.TURTLE_EGG, c("§#3b74df质§#376fdd子"));
    public static final ItemStack MOMOTECH_ZYGOTE = new CustomItemStack(Material.TURTLE_EGG, c("§#496bdc合§#5b68dc子"));
    public static final ItemStack MOMOTECH_PARTICLE_CONSTRUCTOR = new CustomItemStack(Material.GREEN_STAINED_GLASS, c("§#6d64dc质§#7f60db合§#915ddb子§#a359da电§#b15cda容"), "&7可储存 §8⇨ §e⚡ &75000 J");
    public static final ItemStack MOMOTECH_PROTON_INGOT = new CustomItemStack(Material.AMETHYST_SHARD, c("§#ffaa00质§#dbb538子§#b8c06f锭"));
    public static final ItemStack MOMOTECH_ZYGOTE_INGOT = new CustomItemStack(Material.AMETHYST_SHARD, c("§#94cba7合§#6ccab2子§#44cabe锭"));
    public static final ItemStack MOMOTECH_SALT_GENERATOR = new CustomItemStack(Material.WHITE_STAINED_GLASS, c("§#1cc9c9盐§#68b5c8矿§#b3a1c6井"));
    public static final ItemStack MOMOTECH_INGOT_CONSTRUCTOR = new CustomItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS, c("§#ff8dc5合§#f2a0d6金§#e6b3e6生§#d9c6f7成§#b1a0d8器"), "&7效率:32x");
    public static final ItemStack MOMOTECH_METAL_STAR = new CustomItemStack(Material.GOLD_BLOCK, "&6&l金属因子", "&7在合金生成器内使用");
   // public static final ItemStack MOMOTECH_SAND_CHANGER = new CustomItemStack(Material.RED_SANDSTONE, c("§#8a79ba光§#62539b速§#8a8bba打§#b3c4da磨§#dbfcf9器"), "&7效率:INFINITY");
    public static final ItemStack MOMOTECH_FINAL_ENERGY_GENERATOR = new CustomItemStack(Material.REDSTONE_LAMP, c("§#55ff55宇§#55ff6e宙§#55ff87超§#55ffa1级§#55ffba无§#55ffd3敌§#55ffec神§#5bfcf6秘§#74efd0史§#8ee3aa诗§#a7d684永§#c0c95e恒§#d9bd39无§#f2b013限§#ffa90c充§#ffa824能§#ffa73c循§#ffa654环§#ffa56c过§#ffa384载§#ffa29c能§#f7ac9f量§#ecb99b生§#e0c797成§#d5d494单§#cae190元§#bfef8cζ§#b4fc88型"), c("§#ffaa00§o无§#fca634§o穷§#f8a169§o无§#f59d9d§o尽§#f7bdac§o的§#fadcbb§o宇§#fcfcca§o宙§#d9ec92§o能§#b6db5b§o量§#93cb23§o…"), "§8⇨ §e⚡ &7999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999^0 J/t");
    public static final ItemStack MOMOTECH_SPECIAL_THINGS_CONSTRUCTOR = new CustomItemStack(Material.GLASS, "&f特制压缩机", "§8⇨ §e⚡ &7200 J/t");
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

        String[][] name = {{"壹重压缩钻石", "贰重压缩钻石", "叁重压缩钻石", "肆重压缩钻石", "伍重压缩钻石"},
                {"壹重压缩下届合金", "贰重压缩下届合金", "叁重压缩下届合金", "肆重压缩下届合金", "伍重压缩下届合金"},
                {"壹重压缩煤炭", "贰重压缩煤炭", "叁重压缩煤炭", "肆重压缩煤炭", "伍重压缩煤炭"},
                {"壹重压缩绿宝石", "贰重压缩绿宝石", "叁重压缩绿宝石", "肆重压缩绿宝石", "伍重压缩绿宝石"},
                {"壹重压缩钻石", "贰重压缩石英", "叁重压缩石英", "肆重压缩石英", "伍重压缩石英"},
                {"壹重压缩钻石", "贰重压缩红石", "叁重压缩红石", "肆重压缩红石", "伍重压缩红石"},
                {"壹重压缩铁", "贰重压缩铁", "叁重压缩铁", "肆重压缩铁", "伍重压缩铁"},
                {"壹重压缩金", "贰重压缩金", "叁重压缩金", "肆重压缩金", "伍重压缩金"},
                {"壹重压缩青金石", "贰重压缩青金石", "叁重压缩青金石", "肆重压缩青金石", "伍重压缩青金石"}};
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 3; ++j) {
                Mineral[i][j] = new CustomItemStack(Utils.it[i], "&f" + name[i][j], "§7挤压矿物产生的精华...");
            }
        }
        for (int i = 0; i < 50; i++) {
            Cobblestone[i] = new CustomItemStack(Material.COBBLESTONE, "&c> &f" + (i + 1) + "重压缩圆石", "&7不用怀疑, 材料而已", "&7实际上并不是所有的都用的上, 主要用于娱乐");
        }
        ItemStack[] GROUP = {new CustomItemStack(Material.PAPER, "&c&l注意", "&b&l附属机器非注明不需要电力", "&b&l所有机器只有在输出槽有空位的时候才会工作"),
                new CustomItemStack(Material.SOUL_CAMPFIRE, c("§#efa3de&l基§#ed9beb&l础§#ec98ed&l生§#ee9fd9&l产§#f1a5c6&l型§#f4acb3&l机§#f6b2a0&l器")), new CustomItemStack(Material.IRON_INGOT, c("§#d9f995&l基§#c6efa2&l础§#b2e5af&l物§#9fdbbc&l品")),
                new CustomItemStack(Material.DIAMOND, c("§#8cd1c9&l工§#78c7d7&l具")), new CustomItemStack(Material.REPEATING_COMMAND_BLOCK, c("§#b2eeaa&l&k… §#c2e9a3&l终§#d2e49b&l级§#e3df94&l物§#f3da8d&l品 §#fed48a&l&k…")),
                new CustomItemStack(Material.BLACK_CONCRETE_POWDER, c("§#f9b98c&l基§#fbbf79&l础§#fec666&l机§#fdcc5f&l器")), new CustomItemStack(Material.GOLD_BLOCK, "§6§l压缩材料"),
                new CustomItemStack(Material.ENCHANTED_BOOK, c("§#fad365&l鸣§#f7da6c&l谢§#f3e172 &l- §#f0e878&l特§#edef7e&l殊§#eaf684&l材§#e6fc8b&l料")), new CustomItemStack(Material.CHAIN_COMMAND_BLOCK, c("§#85f8c3&l&k陌§#81fcc0&l&k陌 §#91f7b9&l科§#a2f2b1&l技") + " §7(代码编写者:QYhB05)"),
                new CustomItemStack(Material.BLAZE_POWDER, c("§#8b9fca&l无§#a298bb&l限§#b892ac&l工§#cf8b9d&l程§#e6848e &l- §#fc7e7f&l初§#ff8178&l级")), new CustomItemStack(Material.SEA_PICKLE, c("§#65bde4&l电§#52b3f1&l力§#5eace9&l拓§#75a5da&l展")), new CustomItemStack(Material.PRISMARINE_CRYSTALS, c("§#ff8773&l无§#ff8c6e&l限§#ff9168&l工§#ff9663&l程§#ff9b5e &l- §#ffa058&l终§#ffa553&l焉"))};
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
