package choupscyberdogs.procedures;

import net.minecraft.world.entity.Entity;

public class CyberDogTPConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("idle") == false) {
			return true;
		}
		return false;
	}
}