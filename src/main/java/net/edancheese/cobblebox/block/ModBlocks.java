package net.edancheese.cobblebox.block;

import net.edancheese.cobblebox.CobbleBox;
import net.edancheese.cobblebox.block.custom.CobbleboxBlock;
import net.edancheese.cobblebox.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CobbleBox.MOD_ID);

    public static final DeferredBlock<Block> COMMON_COBBLEBOX = registerBlock("common_cobblebox",
            () -> new CobbleboxBlock(BlockBehaviour.Properties.of()
            .strength(0.7F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> RARE_COBBLEBOX = registerBlock("rare_cobblebox",
            () -> new CobbleboxBlock(BlockBehaviour.Properties.of()
                    .strength(0.7F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> ULTRARARE_COBBLEBOX = registerBlock("ultrarare_cobblebox",
            () -> new CobbleboxBlock(BlockBehaviour.Properties.of()
                    .strength(0.7F).sound(SoundType.POLISHED_DEEPSLATE)));

    public static final DeferredBlock<Block> SHINY_COBBLEBOX = registerBlock("shiny_cobblebox",
            () -> new CobbleboxBlock(BlockBehaviour.Properties.of()
                    .strength(0.7F).sound(SoundType.AMETHYST)));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));

    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
