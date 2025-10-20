package choupscyberdogs.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import javax.annotation.Nullable;

import choupscyberdogs.init.ChoupsCyberDogsModItems;
import choupscyberdogs.init.ChoupsCyberDogsModEntities;

import choupscyberdogs.configuration.ChoupsCyberDogConfiguration;

import choupscyberdogs.ChoupsCyberDogsMod;

@EventBusSubscriber
public class RightClickOnDogProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (ChoupsCyberDogConfiguration.IS_THE_CYBER_DOG_SPAWNABLE.get() == true) {
			if (entity instanceof Wolf) {
				if (!(entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
					if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ChoupsCyberDogsModItems.STRANGE_CIRCUIT.get()
							|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ChoupsCyberDogsModItems.STRANGE_CIRCUIT.get()) {
						if (Math.random() < (double) ChoupsCyberDogConfiguration.SPAWNING_CHANCE.get()) {
							if (sourceentity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ChoupsCyberDogsModItems.STRANGE_CIRCUIT.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
							if (sourceentity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							if (!entity.level().isClientSide())
								entity.discard();
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 15, 2, 2, 2, 0.25);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.anvil.use")), SoundSource.BLOCKS, 1, (float) 0.8);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.anvil.use")), SoundSource.BLOCKS, 1, (float) 0.8, false);
								}
							}
							ChoupsCyberDogsMod.queueServerWork(10, () -> {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wolf.growl")), SoundSource.MASTER, 1, (float) 0.7);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wolf.growl")), SoundSource.MASTER, 1, (float) 0.7, false);
									}
								}
							});
							ChoupsCyberDogsMod.queueServerWork(20, () -> {
								if (sourceentity instanceof ServerPlayer _player) {
									AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("choups_cyber_dogs:cyber_dog_advancement"));
									if (_adv != null) {
										AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
										if (!_ap.isDone()) {
											for (String criteria : _ap.getRemainingCriteria())
												_player.getAdvancements().award(_adv, criteria);
										}
									}
								}
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 15, 2, 2, 2, 0.25);
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = ChoupsCyberDogsModEntities.CYBER_DOG_01.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(entity.getYRot());
										entityToSpawn.setYBodyRot(entity.getYRot());
										entityToSpawn.setYHeadRot(entity.getYRot());
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
							});
						} else {
							if (sourceentity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 2, false, true));
							entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 5);
							if (sourceentity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ChoupsCyberDogsModItems.STRANGE_CIRCUIT.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
					}
				}
			}
		}
	}
}