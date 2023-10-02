package de.hugobugomugo.kauflandhotdawg.item;

import de.hugobugomugo.kauflandhotdawg.main;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemInit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, main.MODID);


    public static final RegistryObject<Item> kaufland_hotdog = ITEMS.register("kaufland_hotdog",
            () -> new Item(new Item.Properties().food(Foods.kaufland_hotdog)));

    public static class Foods
    {
        public static final FoodProperties kaufland_hotdog = new FoodProperties.Builder()
                .nutrition(8)
                .saturationMod(0.6f)
                .meat()
                .build();
    }

    public static void register(IEventBus eventBus)
        {
            ITEMS.register(eventBus);
        }
}
