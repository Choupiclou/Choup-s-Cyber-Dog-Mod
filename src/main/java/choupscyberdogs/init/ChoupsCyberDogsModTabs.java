/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package choupscyberdogs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import choupscyberdogs.ChoupsCyberDogsMod;

public class ChoupsCyberDogsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChoupsCyberDogsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CYBER_DOG_CREATIVE_TAB = REGISTRY.register("cyber_dog_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.choups_cyber_dogs.cyber_dog_creative_tab")).icon(() -> new ItemStack(ChoupsCyberDogsModItems.CYBER_DOG_01_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChoupsCyberDogsModItems.CYBER_DOG_01_SPAWN_EGG.get());
				tabData.accept(ChoupsCyberDogsModItems.SHORT_CIRCUIT_SWORD.get());
				tabData.accept(ChoupsCyberDogsModItems.SHORT_CIRCUIT_PICKAXE.get());
				tabData.accept(ChoupsCyberDogsModItems.SHORT_CIRCUIT_AXE.get());
				tabData.accept(ChoupsCyberDogsModItems.SHORT_CIRCUIT_SHOVEL.get());
				tabData.accept(ChoupsCyberDogsModItems.SHORT_CIRCUIT_HOE.get());
				tabData.accept(ChoupsCyberDogsModItems.SCANNER.get());
				tabData.accept(ChoupsCyberDogsModItems.STRANGE_CIRCUIT.get());
				tabData.accept(ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE.get());
				tabData.accept(ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_2.get());
				tabData.accept(ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_3.get());
				tabData.accept(ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_4.get());
				tabData.accept(ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_5.get());
				tabData.accept(ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_6.get());
				tabData.accept(ChoupsCyberDogsModItems.CYBER_DOG_UPGRADE_7.get());
				tabData.accept(ChoupsCyberDogsModItems.CYBER_UPGRADE_8.get());
			}).build());
}