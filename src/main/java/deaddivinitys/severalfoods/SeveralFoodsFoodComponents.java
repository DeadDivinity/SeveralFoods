package deaddivinitys.severalfoods;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class SeveralFoodsFoodComponents {

    // Meatballs FoodComponents
    public static final FoodComponent RAW_MEATBALL = (new FoodComponent.Builder())
            .hunger(1)
            .saturationModifier(0.2f)
            .snack()
            .build();

    public static final FoodComponent COOKED_MEATBALL = (new FoodComponent.Builder())
            .hunger(5)
            .saturationModifier(0.5f)
            .snack()
            .build();

    public static final FoodComponent UPSIDE_DOWN_BREAD = (new FoodComponent.Builder())
            .hunger(6)
            .saturationModifier(0.5f)
            .build();

    public static final FoodComponent MEATBALL_SANDWICH = (new FoodComponent.Builder())
            .hunger(8)
            .saturationModifier(0.8f)
            .build();

    // Notch Apple
    public static final FoodComponent ACTUAL_NOTCH_APPLE = (new FoodComponent.Builder())
            .hunger(20)
            .saturationModifier(2.0f)
            .alwaysEdible()
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 800, 4), 100f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 800, 4), 100f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 800, 4), 100f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800, 4), 100f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 800, 1), 100f)
            .build();

    // Emerald Apple
    public static final FoodComponent EMERALD_APPLE = (new FoodComponent.Builder())
            .hunger(15)
            .saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 2), 100f)
            .build();


}
