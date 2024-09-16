package net.OMiquelini.ligma.item;

import net.OMiquelini.ligma.Ligma;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Ligma.MOD_ID);

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> LIGMA_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("ligma_items_tab",
                    ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.BLUE_LIGMA.get()))
                            .title(Component.translatable("creativetab.ligma.ligma_items_tab"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.BLUE_LIGMA.get());
                                output.accept(ModItems.RED_LIGMA.get());
                                output.accept(ModItems.PURPLE_LIGMA.get());
                                output.accept(ModItems.BLUE_LIGMA_UPGRADE.get());
                                output.accept(ModItems.RED_LIGMA_UPGRADE.get());
                                output.accept(ModItems.PURPLE_LIGMA_UPGRADE.get());
                            })
                            .build());
}
