package gay.lemmaeof.mycoturgy.init;

import gay.lemmaeof.mycoturgy.Mycoturgy;
import gay.lemmaeof.mycoturgy.effect.GriefStatusEffect;
import gay.lemmaeof.mycoturgy.effect.RelaxationStatusEffect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MycoturgyEffects {
	public static final StatusEffect GRIEF = register("grief", new GriefStatusEffect(StatusEffectType.HARMFUL, 0x25C6CD));
	public static final StatusEffect RELAXATION = register("relaxation", new RelaxationStatusEffect(StatusEffectType.BENEFICIAL, 0x409909));

	public static void init() {

	}

	private static StatusEffect register(String name, StatusEffect effect) {
		return Registry.register(Registry.STATUS_EFFECT, new Identifier(Mycoturgy.MODID, name), effect);
	}
}
