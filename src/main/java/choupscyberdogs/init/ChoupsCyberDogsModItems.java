/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package choupscyberdogs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.item.Item;

import choupscyberdogs.item.StrangeCircuitItem;
import choupscyberdogs.item.ShortCircuitSwordItem;
import choupscyberdogs.item.ShortCircuitShovelItem;
import choupscyberdogs.item.ShortCircuitPickaxeItem;
import choupscyberdogs.item.ShortCircuitHoeItem;
import choupscyberdogs.item.ShortCircuitAxeItem;
import choupscyberdogs.item.ScannerItem;
import choupscyberdogs.item.CyberUpgrade8Item;
import choupscyberdogs.item.CyberDogUpgradeItem;
import choupscyberdogs.item.CyberDogUpgrade7Item;
import choupscyberdogs.item.CyberDogUpgrade6Item;
import choupscyberdogs.item.CyberDogUpgrade5Item;
import choupscyberdogs.item.CyberDogUpgrade4Item;
import choupscyberdogs.item.CyberDogUpgrade3Item;
import choupscyberdogs.item.CyberDogUpgrade2Item;

import choupscyberdogs.ChoupsCyberDogsMod;

public class ChoupsCyberDogsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ChoupsCyberDogsMod.MODID);
	public static final DeferredItem<Item> STRANGE_CIRCUIT = REGISTRY.register("strange_circuit", StrangeCircuitItem::new);
	public static final DeferredItem<Item> CYBER_DOG_UPGRADE = REGISTRY.register("cyber_dog_upgrade", CyberDogUpgradeItem::new);
	public static final DeferredItem<Item> CYBER_DOG_01_SPAWN_EGG = REGISTRY.register("cyber_dog_01_spawn_egg", () -> new DeferredSpawnEggItem(ChoupsCyberDogsModEntities.CYBER_DOG_01, -13421773, -6750208, new Item.Properties()));
	public static final DeferredItem<Item> CYBER_DOG_UPGRADE_2 = REGISTRY.register("cyber_dog_upgrade_2", CyberDogUpgrade2Item::new);
	public static final DeferredItem<Item> CYBER_DOG_UPGRADE_3 = REGISTRY.register("cyber_dog_upgrade_3", CyberDogUpgrade3Item::new);
	public static final DeferredItem<Item> CYBER_DOG_UPGRADE_4 = REGISTRY.register("cyber_dog_upgrade_4", CyberDogUpgrade4Item::new);
	public static final DeferredItem<Item> CYBER_DOG_UPGRADE_5 = REGISTRY.register("cyber_dog_upgrade_5", CyberDogUpgrade5Item::new);
	public static final DeferredItem<Item> CYBER_DOG_UPGRADE_6 = REGISTRY.register("cyber_dog_upgrade_6", CyberDogUpgrade6Item::new);
	public static final DeferredItem<Item> CYBER_DOG_UPGRADE_7 = REGISTRY.register("cyber_dog_upgrade_7", CyberDogUpgrade7Item::new);
	public static final DeferredItem<Item> CYBER_UPGRADE_8 = REGISTRY.register("cyber_upgrade_8", CyberUpgrade8Item::new);
	public static final DeferredItem<Item> SCANNER = REGISTRY.register("scanner", ScannerItem::new);
	public static final DeferredItem<Item> SHORT_CIRCUIT_SWORD = REGISTRY.register("short_circuit_sword", ShortCircuitSwordItem::new);
	public static final DeferredItem<Item> SHORT_CIRCUIT_PICKAXE = REGISTRY.register("short_circuit_pickaxe", ShortCircuitPickaxeItem::new);
	public static final DeferredItem<Item> SHORT_CIRCUIT_AXE = REGISTRY.register("short_circuit_axe", ShortCircuitAxeItem::new);
	public static final DeferredItem<Item> SHORT_CIRCUIT_SHOVEL = REGISTRY.register("short_circuit_shovel", ShortCircuitShovelItem::new);
	public static final DeferredItem<Item> SHORT_CIRCUIT_HOE = REGISTRY.register("short_circuit_hoe", ShortCircuitHoeItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}