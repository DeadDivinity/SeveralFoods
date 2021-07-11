package deaddivinitys.severalfoods;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;


public class SeveralFoods implements ModInitializer {


    //	All meatball-related items.
    public static final Item COOKED_MEATBALL = new Item(new Item.Settings().group(ItemGroup.FOOD).food(SeveralFoodsFoodComponents.COOKED_MEATBALL));
    public static final Item RAW_MEATBALL = new Item(new Item.Settings().group(ItemGroup.FOOD).food(SeveralFoodsFoodComponents.RAW_MEATBALL));
    public static final Item UPSIDE_DOWN_BREAD = new Item(new Item.Settings().group(ItemGroup.FOOD).food(SeveralFoodsFoodComponents.UPSIDE_DOWN_BREAD));
    public static final Item MEATBALL_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD).food(SeveralFoodsFoodComponents.MEATBALL_SANDWICH));


    @Override
    public void onInitialize() {

        Registry.register(Registry.ITEM, new Identifier("severalfoods", "raw_meatball"), RAW_MEATBALL);
        Registry.register(Registry.ITEM, new Identifier("severalfoods", "cooked_meatball"), COOKED_MEATBALL);
        Registry.register(Registry.ITEM, new Identifier("severalfoods", "cooked_meatballs"), COOKED_MEATBALLS);
        Registry.register(Registry.ITEM, new Identifier("severalfoods", "upside_down_bread"), UPSIDE_DOWN_BREAD);
        Registry.register(Registry.ITEM, new Identifier("severalfoods", "meatball_sandwich"), MEATBALL_SANDWICH);

    }
}
