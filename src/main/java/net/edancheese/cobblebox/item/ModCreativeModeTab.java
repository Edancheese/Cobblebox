package net.edancheese.cobblebox.item;
import net.edancheese.cobblebox.CobbleBox;
import net.edancheese.cobblebox.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB,CobbleBox.MOD_ID);

    public static final Supplier<CreativeModeTab> COBBLEBOX_TAB = CREATIVE_MODE_TAB.register("cobblebox_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.COMMON_COBBLEBOX.get()))
                    .title(Component.translatable("creativetab.cobblebox.cobblebox_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.COMMON_COBBLEBOX);
                        output.accept(ModBlocks.RARE_COBBLEBOX);
                        output.accept(ModBlocks.ULTRARARE_COBBLEBOX);
                        output.accept(ModBlocks.SHINY_COBBLEBOX);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
