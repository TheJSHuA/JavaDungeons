package j0sh.javadungeons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.PlantBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import j0sh.javadungeons.JavaDungeons;

public class DungeonsPlant extends PlantBlock {

    // plant block

    public BlockItem blockItem;

    public DungeonsPlant(Block base, ItemGroup group, String id) {
        super(FabricBlockSettings.copy(base).build());
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));

        // set render layer to cutout
        BlockRenderLayerMap.INSTANCE.putBlock(this, RenderLayer.getCutout());
    }

}