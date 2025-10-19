package choupscyberdogs.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.network.chat.Component;

import java.util.List;

import choupscyberdogs.procedures.ShortCircuitSwordRightclickedProcedure;
import choupscyberdogs.procedures.ShortCircuitSwordLivingEntityIsHitWithToolProcedure;

import choupscyberdogs.init.ChoupsCyberDogsModItems;

public class ShortCircuitHoeItem extends HoeItem {
	private static final Tier TOOL_TIER = new Tier() {
		@Override
		public int getUses() {
			return 1428;
		}

		@Override
		public float getSpeed() {
			return 8f;
		}

		@Override
		public float getAttackDamageBonus() {
			return 0;
		}

		@Override
		public TagKey<Block> getIncorrectBlocksForDrops() {
			return BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 2;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of(new ItemStack(ChoupsCyberDogsModItems.STRANGE_CIRCUIT.get()));
		}
	};

	public ShortCircuitHoeItem() {
		super(TOOL_TIER, new Item.Properties().attributes(DiggerItem.createAttributes(TOOL_TIER, 0f, 0f)).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ShortCircuitSwordLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity);
		return retval;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ShortCircuitSwordRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.choups_cyber_dogs.short_circuit_hoe.description_0"));
		list.add(Component.translatable("item.choups_cyber_dogs.short_circuit_hoe.description_1"));
		list.add(Component.translatable("item.choups_cyber_dogs.short_circuit_hoe.description_2"));
		list.add(Component.translatable("item.choups_cyber_dogs.short_circuit_hoe.description_3"));
		list.add(Component.translatable("item.choups_cyber_dogs.short_circuit_hoe.description_4"));
		list.add(Component.translatable("item.choups_cyber_dogs.short_circuit_hoe.description_5"));
		list.add(Component.translatable("item.choups_cyber_dogs.short_circuit_hoe.description_6"));
		list.add(Component.translatable("item.choups_cyber_dogs.short_circuit_hoe.description_7"));
		list.add(Component.translatable("item.choups_cyber_dogs.short_circuit_hoe.description_8"));
	}
}