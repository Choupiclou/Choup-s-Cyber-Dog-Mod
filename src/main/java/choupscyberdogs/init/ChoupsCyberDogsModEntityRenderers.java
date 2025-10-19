/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package choupscyberdogs.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import choupscyberdogs.client.renderer.CyberDog01Renderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ChoupsCyberDogsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ChoupsCyberDogsModEntities.CYBER_DOG_01.get(), CyberDog01Renderer::new);
	}
}