package net.edancheese.cobblebox.item;

import net.edancheese.cobblebox.CobbleBox;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobbleBox.MOD_ID);

    public static final DeferredItem<Item> COBBLEBOX = ITEMS.register("test_cobblebox",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
