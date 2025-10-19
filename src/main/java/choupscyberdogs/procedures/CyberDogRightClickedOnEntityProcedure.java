package choupscyberdogs.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import choupscyberdogs.init.ChoupsCyberDogsModItems;

import choupscyberdogs.entity.CyberDog01Entity;

public class CyberDogRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
			if (sourceentity.isShiftKeyDown()) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE.get()) {
					if (entity.getPersistentData().getBoolean("FieryAttacks") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Your Cyber Dog already has this upgrade."), true);
					} else {
						if (sourceentity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						entity.getPersistentData().putBoolean("FieryAttacks", true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.blaze.burn")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.blaze.burn")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.FLAME, x, y, z, 15, 2, 1, 2, 0.25);
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ChoupsCyberDogsModItems.CYBER_UPGRADE_9.get()) {
					if (entity.getPersistentData().getBoolean("SlownessModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Your Cyber Dog already has this upgrade."), true);
					} else {
						if (sourceentity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						entity.getPersistentData().putBoolean("SlownessModule", true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.witch.throw")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.witch.throw")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 15, 2, 1, 2, 0.25);
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ChoupsCyberDogsModItems.CYBER_UPGRADE_9.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ChoupsCyberDogsModItems.CYBER_UPGRADE_8.get()) {
					if (entity.getPersistentData().getBoolean("VampireModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Your Cyber Dog already has this upgrade."), true);
					} else {
						if (sourceentity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						entity.getPersistentData().putBoolean("VampireModule", true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wandering_trader.drink_milk")), SoundSource.NEUTRAL, 1, (float) 0.5);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wandering_trader.drink_milk")), SoundSource.NEUTRAL, 1, (float) 0.5, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CRIMSON_SPORE, x, y, z, 15, 2, 1, 2, 0.25);
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ChoupsCyberDogsModItems.CYBER_UPGRADE_8.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_7.get()) {
					if (entity.getPersistentData().getBoolean("WitherModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Your Cyber Dog already has this upgrade."), true);
					} else {
						if (sourceentity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						entity.getPersistentData().putBoolean("WitherModule", true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wither.spawn")), SoundSource.NEUTRAL, 1, (float) 1.2);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wither.spawn")), SoundSource.NEUTRAL, 1, (float) 1.2, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SMOKE, x, y, z, 15, 2, 1, 2, 0.25);
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_7.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_2.get()) {
					if (entity.getPersistentData().getBoolean("SpeedModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Your Cyber Dog already has this upgrade."), true);
					} else {
						if (sourceentity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						entity.getPersistentData().putBoolean("SpeedModule", true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.enchantment_table.use")), SoundSource.NEUTRAL, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.enchantment_table.use")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 15, 2, 1, 2, 0.25);
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_2.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_5.get()) {
					if (entity.getPersistentData().getBoolean("NukeModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Your Cyber Dog already has this upgrade."), true);
					} else {
						if (sourceentity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						entity.getPersistentData().putBoolean("NukeModule", true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.tnt.primed")), SoundSource.NEUTRAL, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.tnt.primed")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.FALLING_SPORE_BLOSSOM, x, y, z, 15, 2, 1, 2, 0.25);
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_5.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_4.get()) {
					if (entity.getPersistentData().getBoolean("HealthModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Your Cyber Dog already has this upgrade."), true);
					} else {
						if (sourceentity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						entity.getPersistentData().putBoolean("HealthModule", true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.evoker.cast_spell")), SoundSource.NEUTRAL, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.evoker.cast_spell")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.ENCHANTED_HIT, x, y, z, 15, 2, 1, 2, 0.25);
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_4.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_3.get()) {
					if (entity.getPersistentData().getBoolean("LighningModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Your Cyber Dog already has this upgrade."), true);
					} else {
						if (sourceentity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						entity.getPersistentData().putBoolean("LighningModule", true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, y, z, 15, 2, 1, 2, 0.25);
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_3.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_6.get()) {
					if (entity.getPersistentData().getBoolean("ToxicModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Your Cyber Dog already has this upgrade."), true);
					} else {
						if (sourceentity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						entity.getPersistentData().putBoolean("ToxicModule", true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.burp")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.witch.ambient")), SoundSource.NEUTRAL, 1, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.witch.ambient")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.MYCELIUM, x, y, z, 15, 2, 1, 2, 0.25);
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_6.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				}
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.WOLF_ARMOR && entity.getPersistentData().getBoolean("ArmorEquipped") == false) {
					entity.getPersistentData().putBoolean("ArmadilloArmor", true);
					entity.getPersistentData().putBoolean("ArmorEquipped", true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("choups_cyber_dogs:electric_shock")), SoundSource.NEUTRAL, (float) 1.5, (float) 1.2, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_iron")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_iron")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.WOLF_ARMOR);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof CyberDog01Entity animatable)
						animatable.setTexture("cyberdogtexture_armadillo_armor");
				} else if (sourceentity.isShiftKeyDown() && entity.getPersistentData().getBoolean("ArmadilloArmor") == true
						&& !((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("choups_cyber_dogs:modules"))))) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_iron")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_iron")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.WOLF_ARMOR));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (entity instanceof CyberDog01Entity animatable)
						animatable.setTexture("cyberdogtexturenew");
					entity.getPersistentData().putBoolean("ArmadilloArmor", false);
					entity.getPersistentData().putBoolean("ArmorEquipped", false);
				}
			}
			if (!sourceentity.isShiftKeyDown()) {
				entity.getPersistentData().putBoolean("idle", (!entity.getPersistentData().getBoolean("idle")));
				if (entity.getPersistentData().getBoolean("idle") == false) {
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Your Cyber Dog his following you."), true);
				}
				if (entity.getPersistentData().getBoolean("idle") == true) {
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Your Cyber Dog is staying here."), true);
				}
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ChoupsCyberDogsModItems.SCANNER.get()) {
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7eCyber dog's installed modules:"), false);
					if (entity.getPersistentData().getBoolean("FieryAttacks") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Fiery Module"), false);
					}
					if (entity.getPersistentData().getBoolean("ToxicModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Toxic Module"), false);
					}
					if (entity.getPersistentData().getBoolean("LighningModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Lightning Module"), false);
					}
					if (entity.getPersistentData().getBoolean("HealthModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Health Module"), false);
					}
					if (entity.getPersistentData().getBoolean("NukeModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Nuke Module"), false);
					}
					if (entity.getPersistentData().getBoolean("SpeedModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Speed Module"), false);
					}
					if (entity.getPersistentData().getBoolean("VampireModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Vampire Module"), false);
					}
					if (entity.getPersistentData().getBoolean("WitherModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Wither Module"), false);
					}
					if (entity.getPersistentData().getBoolean("SlownessModule") == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Slowness Module"), false);
					}
				}
			}
		}
	}
}