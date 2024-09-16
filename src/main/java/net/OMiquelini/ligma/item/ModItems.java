package net.OMiquelini.ligma.item;

import net.OMiquelini.ligma.Ligma;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ligma.MOD_ID);

    //overworld variation + ore
    public static final RegistryObject<Item> BLUE_LIGMA = ITEMS.register("blue_ligma",
            ()->new Item(new Item.Properties()));

    //nether variation
    public static final RegistryObject<Item> RED_LIGMA = ITEMS.register("red_ligma",
            ()->new Item(new Item.Properties()));
    //end variation
    public static final RegistryObject<Item> PURPLE_LIGMA = ITEMS.register("purple_ligma",
            ()->new Item(new Item.Properties()));
    //blue ligma upgrade item
    public static final RegistryObject<Item> BLUE_LIGMA_UPGRADE = ITEMS.register("blue_ligma_upgrade",
            ()->new Item(new Item.Properties()));
    //red ligma upgrade item
    public static final RegistryObject<Item> RED_LIGMA_UPGRADE = ITEMS.register("red_ligma_upgrade",
            ()->new Item(new Item.Properties()));
    //purple ligma upgrade item
    public static final RegistryObject<Item> PURPLE_LIGMA_UPGRADE = ITEMS.register("purple_ligma_upgrade",
            ()->new Item(new Item.Properties()));

    //TODO: add tools, armours, ores, seeds, ligma fruit, ligma box

    //armours: blue: gives speed I, red: gives speed I + fire resistance, purple: gives both plus resistance I
    //purple armour: can be combined with elytra + mold to create a ligma elytra
    //tools: blue: insta-mine but less durability than diamond, red: insta-mine more durable than blue and less than diamond, purple: insta-mine more durabiliy than netherite
    //ores: blue: spawns in the overworld, red: spawns in the nether, purple: spawns in the end
    //seeds: blue: grows in the overworld, red: grows in the nether, purple: grows in the end
    //seeds 2: produces a ligma fruit from the respective colour that can be eaten for a buff
    //ligma fruit: used to craft ligma saplings
    //ligma box: can store 54 stacks of items, made with 1 shulker box + 4 crying obsidian + 4 purple ligma


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
