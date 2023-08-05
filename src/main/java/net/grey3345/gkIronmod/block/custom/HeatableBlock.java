package net.grey3345.gkIronmod.block.custom;

import com.mojang.logging.LogUtils;
import net.grey3345.gkIronmod.item.ModItems;
import net.grey3345.gkIronmod.item.custom.FirePokerItem;
import net.grey3345.gkIronmod.item.custom.TongsItem;
import net.grey3345.gkIronmod.util.HeatState;
import net.grey3345.gkIronmod.util.HeatStateMap;
import net.grey3345.gkIronmod.util.RustStateMap;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BubbleColumnBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.core.jmx.Server;
import org.jetbrains.annotations.Nullable;
import org.jline.utils.Log;

import java.util.Optional;
import java.util.Random;

public class HeatableBlock extends Block implements WeatheringCopper {
    private final WeatheringCopper.WeatherState weatherState;
    private HeatState heatState; // Always reference through getHeatState() !!

    /**
     * Not recommended, may cause errors , replace with the other init @TODO
     * @param properties
     * @param state
     */
    @Deprecated()
    public HeatableBlock(BlockBehaviour.Properties properties, WeatheringCopper.WeatherState state) {
        this(properties,state,null);
    }

    public HeatableBlock(BlockBehaviour.Properties properties, WeatheringCopper.WeatherState weatherState, @Nullable HeatState state) {
        super(properties.randomTicks());
        this.weatherState = weatherState;
        this.heatState = state;
    }

    public HeatState getHeatState() {
        if (this.heatState == null) {
            this.heatState = HeatStateMap.getStateFromBlockName(this);
            if (this.heatState == null) {
                throw new NullPointerException("getHeatState() FAILED!");
            }
        }
        return this.heatState;
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof LivingEntity) {
            entity.hurt(DamageSource.HOT_FLOOR,this.getHeatState().damage);
        }

        super.stepOn(level, pos, state, entity);
    }

    @Override
    public void attack(BlockState state, Level level, BlockPos pos, Player player) {
        if ((player.getItemInHand(InteractionHand.MAIN_HAND).getItem() instanceof TongsItem || player.getItemInHand(InteractionHand.OFF_HAND).getItem() instanceof TongsItem) && level instanceof ServerLevel serverLevel) {
            serverLevel.destroyBlock(pos,true,player);
        }
        if (player.getItemInHand(InteractionHand.MAIN_HAND).getItem() instanceof FirePokerItem || player.getItemInHand(InteractionHand.OFF_HAND).getItem() instanceof FirePokerItem) {
            FirePokerItem.moveHeatBlock(level,pos,player.getDirection());
        }

        super.attack(state, level, pos, player);
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

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (level.getBlockState(pos.below()).is(Blocks.LAVA)) {
            // Keep heating
            // Only if random chance happens
            if (random.nextFloat() < 0.05688889F) {
                level.setBlock(pos, HeatStateMap.getHeated(state.getBlock()).get().defaultBlockState(), 3);
            }
        } else {
            // No heat, cool
            // Only if random chance happens
            if (random.nextFloat() < 0.05688889F) {
                level.setBlock(pos, HeatStateMap.getCooled(state.getBlock()).get().defaultBlockState(), 3);
            }
        }
        this.onRandomTick(state, level, pos, random);
        this.tick(state,level,pos,random);
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

    @Override
    public void onPlace(BlockState p_60566_, Level p_60567_, BlockPos p_60568_, BlockState p_60569_, boolean p_60570_) {
        if (p_60567_ instanceof ServerLevel serverLevel) {
            this.tick(p_60566_, serverLevel, p_60568_, RandomSource.create());
        }

        super.onPlace(p_60566_, p_60567_, p_60568_, p_60569_, p_60570_);
    }

    public void tick(BlockState p_221415_, ServerLevel p_221416_, BlockPos p_221417_, RandomSource p_221418_) {
        CustomBubbleColumnBlock.updateColumn(p_221416_, p_221417_.above(), p_221415_);
    }
}