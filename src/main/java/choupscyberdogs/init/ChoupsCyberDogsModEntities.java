/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package choupscyberdogs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import choupscyberdogs.entity.CyberDog01Entity;

import choupscyberdogs.ChoupsCyberDogsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ChoupsCyberDogsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, ChoupsCyberDogsMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<CyberDog01Entity>> CYBER_DOG_01 = register("cyber_dog_01",
			EntityType.Builder.<CyberDog01Entity>of(CyberDog01Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.7f, 1f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		CyberDog01Entity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CYBER_DOG_01.get(), CyberDog01Entity.createAttributes().build());
	}
}