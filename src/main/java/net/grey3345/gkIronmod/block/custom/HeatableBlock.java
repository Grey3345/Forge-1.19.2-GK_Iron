package net.grey3345.gkIronmod.block.custom;

import net.grey3345.gkIronmod.item.ModItems;
import net.grey3345.gkIronmod.util.HeatStateMap;
import net.grey3345.gkIronmod.util.RustStateMap;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.fml.common.Mod;

import java.util.Optional;
import java.util.Random;

public class HeatableBlock extends Block implements WeatheringCopper {
    private final WeatheringCopper.WeatherState weatherState;

    public HeatableBlock(BlockBehaviour.Properties properties, WeatheringCopper.WeatherState weatherState) {
        super(properties);
        this.weatherState = weatherState;
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        var stack = player.getItemInHand(hand);
        if (stack.getItem() == Items.SAND) {
            var block = HeatStateMap.getTreated(state.getBlock());
            if (block.isPresent()) {
                world.setBlock(pos, block.map(b -> b.withPropertiesOf(state)).get(), 11);
                world.levelEvent(player, 3003, pos, 0);
                stack.shrink(1);
                return InteractionResult.SUCCESS;
            }
        } else
        if (stack.getItem() == ModItems.SAND_PAPER.get()){
            var block = HeatStateMap.getUntreated(state.getBlock());
            var damage = player.getItemInHand(hand);
            if (block.isPresent()) {
                world.setBlock(pos, block.map(b -> b.withPropertiesOf(state)).get(), 11);
                world.levelEvent(player, 3003, pos, 0);
                stack.setDamageValue(damage.getDamageValue() +1);
                //stack.shrink(1);
                return InteractionResult.SUCCESS;
            }
        } else
        if (stack.getItem() == Items.WATER_BUCKET){
            var block = HeatStateMap.getCooled(state.getBlock());
            //var damage = player.getItemInHand(hand);
            if (block.isPresent()) {
                world.setBlock(pos, block.map(b -> b.withPropertiesOf(state)).get(), 11);
                world.levelEvent(player, 3003, pos, 0);
                //stack.setDamageValue(damage.getDamageValue() +1);
                stack.shrink(1);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }

    @Override
    public Optional<BlockState> getNext(BlockState state) {
        return HeatStateMap.getHeated(state.getBlock()).map((block) -> block.withPropertiesOf(state));
    }

    //@Override
    public void randomTick(BlockState state, ServerLevel serverWorld, BlockPos pos, Random random) {
        this.onRandomTick(state, serverWorld, pos, (RandomSource) random);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        // if lava is under getHeated
        // if no lava getCooled
        // if cooling to no heat at all, return to rustable block
        return HeatStateMap.getHeated(state.getBlock()).isPresent();
    }

    @Override
    public WeatheringCopper.WeatherState getAge() {
        return this.weatherState;
    }
}