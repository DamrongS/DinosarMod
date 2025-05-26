package net.damrongmc.dinosaurmod.item;

import net.damrongmc.dinosaurmod.DinosaurMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item VELOCIRAPTOR_CLAW = registerItem("velociraptor_claw", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DinosaurMod.MOD_ID,"velociraptor_claw")))));
    public static final Item FOSSILIZEDVELOCIRAPTOR_CLAW = registerItem("fossilized_velociraptor_claw", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DinosaurMod.MOD_ID,"fossilized_velociraptor_claw")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DinosaurMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DinosaurMod.LOGGER.info("Registering Mod Items for " + DinosaurMod.MOD_ID);

        //Ingredients item group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(VELOCIRAPTOR_CLAW);
            entries.add(FOSSILIZEDVELOCIRAPTOR_CLAW);
        });
    }
}
