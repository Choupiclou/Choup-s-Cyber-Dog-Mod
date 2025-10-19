package choupscyberdogs.procedures;

import net.minecraft.world.entity.Entity;

public class CyberDogOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("ModuleSlot", 1);
		entity.getPersistentData().putDouble("ModuleUsed", 0);
	}
}