package deaddivinitys.severalfoods;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;


public class SeveralFoods implements ModInitializer {


	public static final Item COOKED_MEATBALL = new Item(new Item.Settings().group(ItemGroup.FOOD));
	public static final Item RAW_MEATBALL = new Item(new Item.Settings().group(ItemGroup.FOOD));

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("severalfoods", "raw_meatball"), RAW_MEATBALL);
		Registry.register(Registry.ITEM, new Identifier("severalfoods", "cooked_meatball"), COOKED_MEATBALL);

	}
}
