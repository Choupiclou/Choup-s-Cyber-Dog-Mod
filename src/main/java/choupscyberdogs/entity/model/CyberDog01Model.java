package choupscyberdogs.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import choupscyberdogs.entity.CyberDog01Entity;

public class CyberDog01Model extends GeoModel<CyberDog01Entity> {
	@Override
	public ResourceLocation getAnimationResource(CyberDog01Entity entity) {
		return ResourceLocation.parse("choups_cyber_dogs:animations/cyber_dog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CyberDog01Entity entity) {
		return ResourceLocation.parse("choups_cyber_dogs:geo/cyber_dog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CyberDog01Entity entity) {
		return ResourceLocation.parse("choups_cyber_dogs:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(CyberDog01Entity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}