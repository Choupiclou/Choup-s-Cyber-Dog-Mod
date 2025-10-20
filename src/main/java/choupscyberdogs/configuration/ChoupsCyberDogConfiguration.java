package choupscyberdogs.configuration;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ChoupsCyberDogConfiguration {
	public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
	public static final ModConfigSpec SPEC;

	public static final ModConfigSpec.ConfigValue<Boolean> IS_THE_CYBER_DOG_SPAWNABLE;
	public static final ModConfigSpec.ConfigValue<Double> SPAWNING_CHANCE;
	public static final ModConfigSpec.ConfigValue<Double> NUKE_FORCE;
	public static final ModConfigSpec.ConfigValue<Double> UPGRADE_SLOT_NUMBER;
	static {
		BUILDER.push("Is the Cyber Dog Spawnable");
		IS_THE_CYBER_DOG_SPAWNABLE = BUILDER.comment("This logic activate or not the possibility to use Strange Circuits on a Dog to make it a Cyber Dog. Its used if you dont find the Forbidden Lab structure. Default = false")
				.define("is_the_cyber_dog_spawnable", false);
		BUILDER.pop();
		BUILDER.push("Cyber Dog Spawn Chance");
		SPAWNING_CHANCE = BUILDER.comment("You can enter here a number between 0 and 1 that represents the percentage chance for the Cyber Dog of spawning. Default = 0.2").define("spawning_chance", (double) 0.2);
		BUILDER.pop();
		BUILDER.push("Cyber Dog Nuke Module");
		NUKE_FORCE = BUILDER.comment("At your own risks. Define the power of the Nuke module for the Cyber Dog. Default = 1000.0").define("nuke_force", (double) 1000);
		BUILDER.pop();
		BUILDER.push("Cyber Dog Upgrade Slot");
		UPGRADE_SLOT_NUMBER = BUILDER.comment("The number of upgrade slot you can put in your cyber dog. Default = 5").define("upgrade_slot_number", (double) 5);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}