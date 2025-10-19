/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package choupscyberdogs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import choupscyberdogs.ChoupsCyberDogsMod;

public class ChoupsCyberDogsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, ChoupsCyberDogsMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> CYBERDOGAMBIENT = REGISTRY.register("cyberdogambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("choups_cyber_dogs", "cyberdogambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CYBERDOGDEATH = REGISTRY.register("cyberdogdeath", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("choups_cyber_dogs", "cyberdogdeath")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CYBERDOGHURT = REGISTRY.register("cyberdoghurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("choups_cyber_dogs", "cyberdoghurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ELECTRIC_SHOCK = REGISTRY.register("electric_shock", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("choups_cyber_dogs", "electric_shock")));
}