package choupscyberdogs.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class CyberDogUpgrade3Item extends Item {
	public CyberDogUpgrade3Item() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal(""));
		list.add(Component.literal("\u00A77When right clicked on a tamed Cyber Dog while sneaking:"));
		list.add(Component.literal(" \u00A77Activate the \u00A79Lightning Module:"));
		list.add(Component.literal(" \u00A7925% chance of striking a lightning on hit"));
		list.add(Component.literal(""));
	}
}