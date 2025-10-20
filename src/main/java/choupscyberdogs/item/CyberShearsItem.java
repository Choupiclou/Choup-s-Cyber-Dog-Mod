package choupscyberdogs.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class CyberShearsItem extends ShearsItem {
	public CyberShearsItem() {
		super(new Item.Properties().durability(350).fireResistant());
	}

	@Override
	public int getEnchantmentValue() {
		return 2;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 9f;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.choups_cyber_dogs.cyber_shears.description_0"));
		list.add(Component.translatable("item.choups_cyber_dogs.cyber_shears.description_1"));
		list.add(Component.translatable("item.choups_cyber_dogs.cyber_shears.description_2"));
		list.add(Component.translatable("item.choups_cyber_dogs.cyber_shears.description_3"));
		list.add(Component.translatable("item.choups_cyber_dogs.cyber_shears.description_4"));
	}
}