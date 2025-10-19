package choupscyberdogs.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import choupscyberdogs.entity.CyberDog01Entity;

public class CyberDogOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("idle") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 255, false, false));
			if (entity instanceof CyberDog01Entity) {
				((CyberDog01Entity) entity).setAnimation("animation.cyber_dog.sleep");
			}
		} else {
			if (entity instanceof CyberDog01Entity) {
				((CyberDog01Entity) entity).setAnimation("empty");
			}
		}
		if (entity.getPersistentData().getBoolean("SpeedModule") == true && entity.getPersistentData().getBoolean("SpeedModuleEffect") == false) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
					.setBaseValue((((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).getBaseValue() + 0.15));
			entity.getPersistentData().putBoolean("SpeedModuleEffect", true);
		} else if (entity.getPersistentData().getBoolean("SpeedModule") == false && entity.getPersistentData().getBoolean("SpeedModuleEffect") == true) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
					.setBaseValue((((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).getBaseValue() - 0.15));
			entity.getPersistentData().putBoolean("SpeedModuleEffect", false);
		}
		if (entity.getPersistentData().getBoolean("ArmadilloArmor") == true && entity.getPersistentData().getBoolean("ArmadilloArmorEffect") == false) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue((((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).getBaseValue() + 11));
			entity.getPersistentData().putBoolean("ArmadilloArmorEffect", true);
		} else if (entity.getPersistentData().getBoolean("ArmadilloArmor") == false && entity.getPersistentData().getBoolean("ArmadilloArmorEffect") == true) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue((((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).getBaseValue() - 11));
			entity.getPersistentData().putBoolean("ArmadilloArmorEffect", false);
		}
		if (entity.getPersistentData().getBoolean("HealthModule") == true && entity.getPersistentData().getBoolean("HealthModuleEffect") == false) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).setBaseValue((((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).getBaseValue() + 10));
			entity.getPersistentData().putBoolean("HealthModuleEffect", true);
		} else if (entity.getPersistentData().getBoolean("HealthModule") == false && entity.getPersistentData().getBoolean("HealthModuleEffect") == true) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).setBaseValue((((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).getBaseValue() - 10));
			entity.getPersistentData().putBoolean("HealthModuleEffect", false);
		}
		if (entity.getPersistentData().getBoolean("StrenghtModule") == true && entity.getPersistentData().getBoolean("StrenghtModuleEffect") == false) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
					.setBaseValue((((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).getBaseValue() + 4));
			entity.getPersistentData().putBoolean("StrenghtModuleEffect", true);
		} else if (entity.getPersistentData().getBoolean("StrenghtModule") == false && entity.getPersistentData().getBoolean("StrenghtModuleEffect") == true) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
					.setBaseValue((((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).getBaseValue() - 4));
			entity.getPersistentData().putBoolean("StrenghtModuleEffect", false);
		}
	}
}