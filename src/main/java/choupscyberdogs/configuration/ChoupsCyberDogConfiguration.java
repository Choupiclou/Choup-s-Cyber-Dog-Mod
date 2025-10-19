package choupscyberdogs.configuration;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ChoupsCyberDogConfiguration {
	public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
	public static final ModConfigSpec SPEC;

	public static final ModConfigSpec.ConfigValue<Double> SPAWNING_CHANCE;
	public static final ModConfigSpec.ConfigValue<Double> NUKE_FORCE;
	static {
		BUILDER.push("Cyber Dog Spawn Chance");
		SPAWNING_CHANCE = BUILDER.comment("You can enter here a number between 0 and 1 that represents the percentage chance for the Cyber Dog of spawning. Default = 0.2").define("spawning_chance", (double) 0.2);
		BUILDER.pop();
		BUILDER.push("Cyber Dog Nuke Module");
		NUKE_FORCE = BUILDER.comment("At your own risks. Define the power of the Nuke module for the Cyber Dog. Default = 1000.0").define("nuke_force", (double) 1000);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}