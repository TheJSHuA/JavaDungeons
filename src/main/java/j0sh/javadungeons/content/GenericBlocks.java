package j0sh.javadungeons.content;

import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Blocks;

import j0sh.javadungeons.blocks.*;
import j0sh.javadungeons.JavaDungeons;

public class GenericBlocks {

    //A Block Used To Test (makes it easier to fine out wher errors come from)
    public static DebugBlock DEBUGGING_BLOCK;

    // generic blocks that aren't in mc
    public static DungeonsBlock FLOOR_TILE;
    public static DungeonsBlock DIRTY_FLOOR_TILE;
    public static DungeonsBlock CRATE;

    // food related
    public static DungeonsBlock BARREL_CLOSED;
    public static DungeonsBlock FISH_BARREL;
    public static DungeonsFoodBox APPLE_FOOD_BOX;
    public static DungeonsFoodBox ORANGE_FOOD_BOX;
    public static DungeonsFoodBox FISH_FOOD_BOX;
    public static DungeonsFoodBox CORN_FOOD_BOX;

    // ground related
    public static DungeonsBlock DIRT;
    public static DungeonsSlab DIRT_SLAB;
    public static DungeonsPath DIRT_PATH;
    public static DungeonsBlock ROCKY_DIRT;
    public static DungeonsBlock DENSE_GRASSY_DIRT;
    public static DungeonsBlock GRASSY_DIRT;
    public static DungeonsBlock GRASS_BLOCK;

    // wood related
    public static DungeonsBlock FLOORBOARDS;

    // stone-brick related
    public static DungeonsBlock DARK_STONE_BRICKS;
    public static DungeonsBlock DIRTY_DARK_STONE_BRICKS;
    public static DungeonsBlock CHISELED_DARK_STONE;
    public static DungeonsBlock STONE_TILES;
    public static DungeonsBlock DIRTY_STONE_TILES;
    public static DungeonsBlock DIRTY_STONE_TILES_1;

    // andesite related
    public static DungeonsBlock EMBLEMED_ANDESITE;
    public static DungeonsBlock CRACKED_ANDESITE;

    // generic plants
    public static DungeonsBlock BERRY_BUSH_BLOCK;
    public static DungeonsPlant GRASS;
    public static DungeonsPlant SHORT_GRASS;
    public static DungeonsPlant FERN;
    public static DungeonsPlant SHRUB;
    public static DungeonsBlock OAK_LEAVES;
    public static DungeonsWaterPlant WATER_PLANT;

    // sanded andesite
    public static DungeonsBlock SANDED_ANDESITE;
    public static DungeonsBlock SANDED_ANDESITE_TILES;
    public static DungeonsBlock MOSSY_SANDED_ANDESITE_TILES;
    public static DungeonsBlock SANDED_ANDESITE_BRICKS;
    public static DungeonsBlock CHISELED_SANDED_ANDESITE;

    // redstone related
    public static DungeonsPoweredEmissive LIGHTHOUSE_LAMP;

    // custom blocks not in MC: Dungeons
    public static DimensionalRectifier DIMENSIONAL_RECTIFIER;

    public static void init() {
        //Debug
        DEBUGGING_BLOCK = new DebugBlock(Blocks.DRAGON_EGG, false, FabricToolTags.SWORDS, JavaDungeons.CUSTOM_VARIANTS, "0null");

        // dungeons blocks that aren't in mc
        FLOOR_TILE = new DungeonsBlock(Blocks.ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "floor_tile");
        DIRTY_FLOOR_TILE = new DungeonsBlock(Blocks.ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "dirty_floor_tile");
        CRATE = new DungeonsBlock(Blocks.OAK_PLANKS, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "crate");

        // food related items
        BARREL_CLOSED = new DungeonsBlock(Blocks.BARREL, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "barrel_closed");
        FISH_BARREL = new DungeonsBlock(Blocks.BARREL, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "fish_barrel");
        APPLE_FOOD_BOX = new DungeonsFoodBox(Blocks.SPRUCE_PLANKS, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "apple_food_box");
        ORANGE_FOOD_BOX = new DungeonsFoodBox(Blocks.SPRUCE_PLANKS, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "orange_food_box");
        FISH_FOOD_BOX = new DungeonsFoodBox(Blocks.SPRUCE_PLANKS, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "fish_food_box");
        CORN_FOOD_BOX = new DungeonsFoodBox(Blocks.SPRUCE_PLANKS, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "corn_food_box");

        // ground related
        DIRT = new DungeonsBlock(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "dirt");
        DIRT_SLAB = new DungeonsSlab(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "dirt_slab");
        DIRT_PATH = new DungeonsPath(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "dirt_path");
        ROCKY_DIRT = new DungeonsBlock(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "rocky_dirt");
        DENSE_GRASSY_DIRT = new DungeonsBlock(Blocks.GRASS_BLOCK, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "dense_grassy_dirt");
        GRASSY_DIRT = new DungeonsBlock(Blocks.DIRT, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "grassy_dirt");
        GRASS_BLOCK = new DungeonsBlock(Blocks.GRASS_BLOCK, true, FabricToolTags.SHOVELS, JavaDungeons.GENERIC, "grass_block");

        // wood related
        FLOORBOARDS = new DungeonsBlock(Blocks.OAK_PLANKS, true, FabricToolTags.AXES, JavaDungeons.GENERIC, "floorboards");

        // stone brick related
        DARK_STONE_BRICKS = new DungeonsBlock(Blocks.STONE_BRICKS, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "dark_stone_bricks");
        DIRTY_DARK_STONE_BRICKS = new DungeonsBlock(Blocks.STONE_BRICKS, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "dirty_dark_stone_bricks");
        CHISELED_DARK_STONE = new DungeonsBlock(Blocks.CHISELED_STONE_BRICKS, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "chiseled_dark_stone");
        STONE_TILES = new DungeonsBlock(Blocks.STONE_BRICKS, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "stone_tiles");
        DIRTY_STONE_TILES = new DungeonsBlock(Blocks.STONE_BRICKS, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "dirty_stone_tiles");
        DIRTY_STONE_TILES_1 = new DungeonsBlock(Blocks.STONE_BRICKS, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "dirty_stone_tiles_1");

        // andesite related
        EMBLEMED_ANDESITE = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "emblemed_andesite");
        CRACKED_ANDESITE = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "cracked_andesite");

        // plants
        BERRY_BUSH_BLOCK = new DungeonsBlock(Blocks.OAK_LEAVES, true, FabricToolTags.SWORDS, JavaDungeons.GENERIC, "berry_bush_block");
        GRASS = new DungeonsPlant(Blocks.GRASS, true, FabricToolTags.SWORDS, JavaDungeons.GENERIC, "grass");
        SHORT_GRASS = new DungeonsPlant(Blocks.GRASS, true, FabricToolTags.SWORDS, JavaDungeons.GENERIC, "short_grass");
        FERN = new DungeonsPlant(Blocks.GRASS, true, FabricToolTags.SWORDS, JavaDungeons.GENERIC, "fern");
        SHRUB = new DungeonsPlant(Blocks.GRASS, true, FabricToolTags.SWORDS, JavaDungeons.GENERIC, "shrub");
        WATER_PLANT = new DungeonsWaterPlant(Blocks.SEAGRASS, true, FabricToolTags.SWORDS, JavaDungeons.GENERIC, "water_plant");
        OAK_LEAVES = new DungeonsBlock(Blocks.OAK_LEAVES, true, FabricToolTags.HOES, JavaDungeons.CREEPER_WOODS, "oak_leaves");

        // sanded andesite
        SANDED_ANDESITE = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "sanded_andesite");
        SANDED_ANDESITE_TILES = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "sanded_andesite_tiles");
        MOSSY_SANDED_ANDESITE_TILES = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "mossy_sanded_andesite_tiles");
        SANDED_ANDESITE_BRICKS = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "sanded_andesite_bricks");
        CHISELED_SANDED_ANDESITE = new DungeonsBlock(Blocks.POLISHED_ANDESITE, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "chiseled_sanded_andesite");
      
        // redstone related
        LIGHTHOUSE_LAMP = new DungeonsPoweredEmissive(Blocks.REDSTONE_LAMP, false, FabricToolTags.PICKAXES, JavaDungeons.GENERIC, "lighthouse_lamp");
      
        // custom blocks not in mc: dungeons
        DIMENSIONAL_RECTIFIER = new DimensionalRectifier();
    }
}