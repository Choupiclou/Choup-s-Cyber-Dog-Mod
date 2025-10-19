package choupscyberdogs.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class CyberDogUpgrade6Item extends Item {
	public CyberDogUpgrade6Item() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal(""));
		list.add(Component.literal("\u00A77When right cliked on a tamed Cyber Dog while sneaking:"));
		list.add(Component.literal(" \u00A77Activate the \u00A79Toxic Module"));
		list.add(Component.literal(" \u00A79Inflicts Poison on hit"));
		list.add(Component.literal(""));
	}
}