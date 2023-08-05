package net.grey3345.gkIronmod.block.custom;

        import net.grey3345.gkIronmod.GkIronMod;
        import net.grey3345.gkIronmod.item.ModItems;
        import net.grey3345.gkIronmod.item.custom.ModBlockItem;
        import net.grey3345.gkIronmod.util.RustStateMap;
        import net.minecraft.advancements.CriteriaTriggers;
        import net.minecraft.core.BlockPos;
        import net.minecraft.server.level.ServerLevel;
        import net.minecraft.server.level.ServerPlayer;
        import net.minecraft.util.RandomSource;
        import net.minecraft.world.InteractionHand;
        import net.minecraft.world.InteractionResult;
        import net.minecraft.world.entity.player.Player;
        import net.minecraft.world.item.HoneycombItem;
        import net.minecraft.world.item.ItemStack;
        import net.minecraft.world.item.Items;
        import net.minecraft.world.level.Level;
        import net.minecraft.world.level.block.Block;
        import net.minecraft.world.level.block.Blocks;
        import net.minecraft.world.level.block.WeatheringCopper;
        import net.minecraft.world.level.block.state.BlockState;
        import net.minecraft.world.phys.BlockHitResult;
        import org.jetbrains.annotations.Nullable;

        import java.util.Optional;
        import java.util.Random;

public class RustableBlock extends Block implements WeatheringCopper {

    private final WeatheringCopper.WeatherState weatherState;

    public RustableBlock(Properties properties, WeatheringCopper.WeatherState weatherState) {
        super(properties);
        this.weatherState = weatherState;
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        ItemStack stack = player.getItemInHand(hand);
        if (stack.getItem() == Items.HONEYCOMB) {
            setWaxed(state,world,pos,player,hand);
        } else
        if (stack.getItem() == Items.FLINT_AND_STEEL){
            setUnwaxed(state,world,pos,player,hand);
        } else
        if (stack.getItem() == ModItems.SAND_PAPER.get()){
            decreaseStage(state,world,pos,player,hand);
        }
        return InteractionResult.PASS;
    }

    public static void decreaseStage(BlockState state, Level world, BlockPos pos, @Nullable Player player, @Nullable InteractionHand hand) {
        Optional<Block> block = RustStateMap.getDecrease(state.getBlock());
        if (block.isPresent()) {
            world.setBlock(pos, block.map(b -> b.withPropertiesOf(state)).get(), 11);
            world.levelEvent(player, 3003, pos, 0);
            if (player != null) {
                world.levelEvent(player, 3003, pos, 0);
                player.getItemInHand(hand != null ? hand : InteractionHand.MAIN_HAND).shrink(1);
            }
        }
    }

    public static void decreaseStage(BlockState state, Level world, BlockPos pos) {
        decreaseStage(state,world,pos,null,null);
    }

    public static void setWaxed(BlockState state, Level world, BlockPos pos, @Nullable Player player, @Nullable InteractionHand hand) {
        Optional<Block> block = RustStateMap.getWaxed(state.getBlock());
        if (block.isPresent()) {
            world.setBlock(pos, block.map(b -> b.withPropertiesOf(state)).get(), 11);
            if (player != null) {
                world.levelEvent(player, 3003, pos, 0);
                player.getItemInHand(hand != null ? hand : InteractionHand.MAIN_HAND).shrink(1);
            }
        }
    }

    public static void setWaxed(BlockState state, Level world, BlockPos pos) {
        setWaxed(state,world,pos,null,null);
    }

    public static void setUnwaxed(BlockState state, Level world, BlockPos pos, @Nullable Player player, @Nullable InteractionHand hand) {
        Optional<Block> block = RustStateMap.getUnwaxed(state.getBlock());
        if (block.isPresent()) {
            world.setBlock(pos, block.map(b -> b.withPropertiesOf(state)).get(), 11);
            if (player != null) {
                world.levelEvent(player, 3003, pos, 0);
                ItemStack stack = player.getItemInHand(hand != null ? hand : InteractionHand.MAIN_HAND);
                stack.setDamageValue(stack.getDamageValue() + 1);
            }
        }
    }

    public static void setUnwaxed(BlockState state, Level world, BlockPos pos) {
        setUnwaxed(state,world,pos,null,null);
    }

    @Override
    public Optional<BlockState> getNext(BlockState state) {
        return RustStateMap.getIncrease(state.getBlock()).map((block) -> block.withPropertiesOf(state));
    }

    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource p_222678_) {
        if (level.getBlockState(pos.below()).is(Blocks.LAVA)) {
            // Set to heated block if below is lava
            level.setBlock(pos,state,3); // Replace state parameter  with the heated blocks state when they are implemented.
            return;
        }
        this.onRandomTick(state, level, pos, p_222678_);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return RustStateMap.getIncrease(state.getBlock()).isPresent();
    }

    @Override
    public WeatherState getAge() {
        return this.weatherState;
    }
}