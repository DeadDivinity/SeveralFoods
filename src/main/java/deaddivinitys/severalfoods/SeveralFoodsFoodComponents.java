package deaddivinitys.severalfoods;

import net.minecraft.item.FoodComponent;

public class SeveralFoodsFoodComponents {

    // Meatballs FoodComponents
    public static final FoodComponent RAW_MEATBALL = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.2f).snack().build();
    public static final FoodComponent COOKED_MEATBALL = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.5f).snack().build();
    public static final FoodComponent COOKED_MEATBALLS = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.8f).build();

    public static final FoodComponent UPSIDE_DOWN_BREAD = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.5f).build();
    public static final FoodComponent MEATBALL_SANDWICH = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.8f).build();

}
