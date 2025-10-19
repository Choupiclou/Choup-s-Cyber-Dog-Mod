package choupscyberdogs.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import choupscyberdogs.configuration.ChoupsCyberDogConfiguration;

import choupscyberdogs.ChoupsCyberDogsMod;

public class CyberDogEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("NukeModule") == true) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.tnt.primed")), SoundSource.MASTER, 1, 2);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.tnt.primed")), SoundSource.MASTER, 1, 2, false);
				}
			}
			ChoupsCyberDogsMod.queueServerWork(60, () -> {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, (float) (double) ChoupsCyberDogConfiguration.NUKE_FORCE.get(), Level.ExplosionInteraction.BLOCK);
			});
		} else {
			ChoupsCyberDogsMod.queueServerWork(40, () -> {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.TNT);
			});
		}
	}
}