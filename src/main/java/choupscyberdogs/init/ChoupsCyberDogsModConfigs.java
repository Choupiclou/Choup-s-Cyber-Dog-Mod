package choupscyberdogs.init;

import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.bus.api.SubscribeEvent;

import choupscyberdogs.configuration.ChoupsCyberDogConfiguration;

import choupscyberdogs.ChoupsCyberDogsMod;

@EventBusSubscriber(modid = ChoupsCyberDogsMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ChoupsCyberDogsModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModList.get().getModContainerById("choups_cyber_dogs").get().registerConfig(ModConfig.Type.COMMON, ChoupsCyberDogConfiguration.SPEC, "choups_cyber_dog.toml");
		});
	}
}