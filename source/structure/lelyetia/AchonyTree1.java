package net.tslat.aoa3.structure.lelyetia;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class AchonyTree1 extends AoAStructure { //StructureSize: 7x27x7
	private static final IBlockState achonyLeaves = BlockRegister.leavesAchony.getDefaultState();
	private static final IBlockState achonyLog = BlockRegister.logAchony.getDefaultState();
	private static final IBlockState lelyetianLeaves = BlockRegister.leavesLelyetian.getDefaultState();

	public AchonyTree1() {
		super("AchonyTree1");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 3, 0, 3, achonyLog);
		addBlock(world, basePos, 3, 1, 3, achonyLog);
		addBlock(world, basePos, 3, 2, 3, achonyLog);
		addBlock(world, basePos, 3, 3, 3, achonyLog);
		addBlock(world, basePos, 2, 4, 2, achonyLeaves);
		addBlock(world, basePos, 2, 4, 3, achonyLeaves);
		addBlock(world, basePos, 2, 4, 4, achonyLeaves);
		addBlock(world, basePos, 3, 4, 2, achonyLeaves);
		addBlock(world, basePos, 3, 4, 3, achonyLog);
		addBlock(world, basePos, 3, 4, 4, achonyLeaves);
		addBlock(world, basePos, 4, 4, 2, achonyLeaves);
		addBlock(world, basePos, 4, 4, 3, achonyLeaves);
		addBlock(world, basePos, 4, 4, 4, achonyLeaves);
		addBlock(world, basePos, 3, 5, 3, achonyLog);
		addBlock(world, basePos, 3, 6, 3, achonyLog);
		addBlock(world, basePos, 3, 7, 3, achonyLog);
		addBlock(world, basePos, 3, 8, 3, achonyLog);
		addBlock(world, basePos, 2, 9, 2, achonyLeaves);
		addBlock(world, basePos, 2, 9, 3, achonyLeaves);
		addBlock(world, basePos, 2, 9, 4, achonyLeaves);
		addBlock(world, basePos, 3, 9, 2, achonyLeaves);
		addBlock(world, basePos, 3, 9, 3, achonyLog);
		addBlock(world, basePos, 3, 9, 4, achonyLeaves);
		addBlock(world, basePos, 4, 9, 2, achonyLeaves);
		addBlock(world, basePos, 4, 9, 3, achonyLeaves);
		addBlock(world, basePos, 4, 9, 4, achonyLeaves);
		addBlock(world, basePos, 3, 10, 3, achonyLog);
		addBlock(world, basePos, 3, 11, 3, achonyLog);
		addBlock(world, basePos, 3, 12, 3, achonyLog);
		addBlock(world, basePos, 2, 13, 2, achonyLeaves);
		addBlock(world, basePos, 2, 13, 3, achonyLeaves);
		addBlock(world, basePos, 2, 13, 4, achonyLeaves);
		addBlock(world, basePos, 3, 13, 2, achonyLeaves);
		addBlock(world, basePos, 3, 13, 3, achonyLog);
		addBlock(world, basePos, 3, 13, 4, achonyLeaves);
		addBlock(world, basePos, 4, 13, 2, achonyLeaves);
		addBlock(world, basePos, 4, 13, 3, achonyLeaves);
		addBlock(world, basePos, 4, 13, 4, achonyLeaves);
		addBlock(world, basePos, 3, 14, 3, achonyLog);
		addBlock(world, basePos, 3, 15, 3, achonyLog);
		addBlock(world, basePos, 2, 16, 2, achonyLeaves);
		addBlock(world, basePos, 2, 16, 3, achonyLeaves);
		addBlock(world, basePos, 2, 16, 4, achonyLeaves);
		addBlock(world, basePos, 3, 16, 2, achonyLeaves);
		addBlock(world, basePos, 3, 16, 3, achonyLog);
		addBlock(world, basePos, 3, 16, 4, achonyLeaves);
		addBlock(world, basePos, 4, 16, 2, achonyLeaves);
		addBlock(world, basePos, 4, 16, 3, achonyLeaves);
		addBlock(world, basePos, 4, 16, 4, achonyLeaves);
		addBlock(world, basePos, 1, 17, 1, achonyLeaves);
		addBlock(world, basePos, 1, 17, 2, achonyLeaves);
		addBlock(world, basePos, 1, 17, 3, achonyLeaves);
		addBlock(world, basePos, 1, 17, 4, achonyLeaves);
		addBlock(world, basePos, 1, 17, 5, achonyLeaves);
		addBlock(world, basePos, 2, 17, 1, achonyLeaves);
		addBlock(world, basePos, 2, 17, 2, achonyLeaves);
		addBlock(world, basePos, 2, 17, 3, achonyLeaves);
		addBlock(world, basePos, 2, 17, 4, achonyLeaves);
		addBlock(world, basePos, 2, 17, 5, achonyLeaves);
		addBlock(world, basePos, 3, 17, 1, achonyLeaves);
		addBlock(world, basePos, 3, 17, 2, achonyLeaves);
		addBlock(world, basePos, 3, 17, 3, achonyLeaves);
		addBlock(world, basePos, 3, 17, 4, achonyLeaves);
		addBlock(world, basePos, 3, 17, 5, achonyLeaves);
		addBlock(world, basePos, 4, 17, 1, achonyLeaves);
		addBlock(world, basePos, 4, 17, 2, achonyLeaves);
		addBlock(world, basePos, 4, 17, 3, achonyLeaves);
		addBlock(world, basePos, 4, 17, 4, achonyLeaves);
		addBlock(world, basePos, 4, 17, 5, achonyLeaves);
		addBlock(world, basePos, 5, 17, 1, achonyLeaves);
		addBlock(world, basePos, 5, 17, 2, achonyLeaves);
		addBlock(world, basePos, 5, 17, 3, achonyLeaves);
		addBlock(world, basePos, 5, 17, 4, achonyLeaves);
		addBlock(world, basePos, 5, 17, 5, achonyLeaves);
		addBlock(world, basePos, 0, 18, 0, achonyLeaves);
		addBlock(world, basePos, 0, 18, 1, achonyLeaves);
		addBlock(world, basePos, 0, 18, 2, achonyLeaves);
		addBlock(world, basePos, 0, 18, 3, achonyLeaves);
		addBlock(world, basePos, 0, 18, 4, achonyLeaves);
		addBlock(world, basePos, 0, 18, 5, achonyLeaves);
		addBlock(world, basePos, 0, 18, 6, achonyLeaves);
		addBlock(world, basePos, 1, 18, 0, achonyLeaves);
		addBlock(world, basePos, 1, 18, 6, achonyLeaves);
		addBlock(world, basePos, 2, 18, 0, achonyLeaves);
		addBlock(world, basePos, 2, 18, 2, lelyetianLeaves);
		addBlock(world, basePos, 2, 18, 3, lelyetianLeaves);
		addBlock(world, basePos, 2, 18, 4, lelyetianLeaves);
		addBlock(world, basePos, 2, 18, 6, achonyLeaves);
		addBlock(world, basePos, 3, 18, 0, achonyLeaves);
		addBlock(world, basePos, 3, 18, 2, lelyetianLeaves);
		addBlock(world, basePos, 3, 18, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 18, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 18, 6, achonyLeaves);
		addBlock(world, basePos, 4, 18, 0, achonyLeaves);
		addBlock(world, basePos, 4, 18, 2, lelyetianLeaves);
		addBlock(world, basePos, 4, 18, 3, lelyetianLeaves);
		addBlock(world, basePos, 4, 18, 4, lelyetianLeaves);
		addBlock(world, basePos, 4, 18, 6, achonyLeaves);
		addBlock(world, basePos, 5, 18, 0, achonyLeaves);
		addBlock(world, basePos, 5, 18, 6, achonyLeaves);
		addBlock(world, basePos, 6, 18, 0, achonyLeaves);
		addBlock(world, basePos, 6, 18, 1, achonyLeaves);
		addBlock(world, basePos, 6, 18, 2, achonyLeaves);
		addBlock(world, basePos, 6, 18, 3, achonyLeaves);
		addBlock(world, basePos, 6, 18, 4, achonyLeaves);
		addBlock(world, basePos, 6, 18, 5, achonyLeaves);
		addBlock(world, basePos, 6, 18, 6, achonyLeaves);
		addBlock(world, basePos, 0, 19, 0, achonyLeaves);
		addBlock(world, basePos, 0, 19, 1, achonyLeaves);
		addBlock(world, basePos, 0, 19, 5, achonyLeaves);
		addBlock(world, basePos, 0, 19, 6, achonyLeaves);
		addBlock(world, basePos, 1, 19, 0, achonyLeaves);
		addBlock(world, basePos, 1, 19, 6, achonyLeaves);
		addBlock(world, basePos, 2, 19, 2, lelyetianLeaves);
		addBlock(world, basePos, 2, 19, 3, lelyetianLeaves);
		addBlock(world, basePos, 2, 19, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 19, 2, lelyetianLeaves);
		addBlock(world, basePos, 3, 19, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 19, 4, lelyetianLeaves);
		addBlock(world, basePos, 4, 19, 2, lelyetianLeaves);
		addBlock(world, basePos, 4, 19, 3, lelyetianLeaves);
		addBlock(world, basePos, 4, 19, 4, lelyetianLeaves);
		addBlock(world, basePos, 5, 19, 0, achonyLeaves);
		addBlock(world, basePos, 5, 19, 6, achonyLeaves);
		addBlock(world, basePos, 6, 19, 0, achonyLeaves);
		addBlock(world, basePos, 6, 19, 1, achonyLeaves);
		addBlock(world, basePos, 6, 19, 5, achonyLeaves);
		addBlock(world, basePos, 6, 19, 6, achonyLeaves);
		addBlock(world, basePos, 0, 20, 0, achonyLeaves);
		addBlock(world, basePos, 0, 20, 6, achonyLeaves);
		addBlock(world, basePos, 2, 20, 2, lelyetianLeaves);
		addBlock(world, basePos, 2, 20, 3, lelyetianLeaves);
		addBlock(world, basePos, 2, 20, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 20, 2, lelyetianLeaves);
		addBlock(world, basePos, 3, 20, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 20, 4, lelyetianLeaves);
		addBlock(world, basePos, 4, 20, 2, lelyetianLeaves);
		addBlock(world, basePos, 4, 20, 3, lelyetianLeaves);
		addBlock(world, basePos, 4, 20, 4, lelyetianLeaves);
		addBlock(world, basePos, 6, 20, 0, achonyLeaves);
		addBlock(world, basePos, 6, 20, 6, achonyLeaves);
		addBlock(world, basePos, 2, 21, 2, lelyetianLeaves);
		addBlock(world, basePos, 2, 21, 3, lelyetianLeaves);
		addBlock(world, basePos, 2, 21, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 21, 2, lelyetianLeaves);
		addBlock(world, basePos, 3, 21, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 21, 4, lelyetianLeaves);
		addBlock(world, basePos, 4, 21, 2, lelyetianLeaves);
		addBlock(world, basePos, 4, 21, 3, lelyetianLeaves);
		addBlock(world, basePos, 4, 21, 4, lelyetianLeaves);
		addBlock(world, basePos, 2, 22, 2, lelyetianLeaves);
		addBlock(world, basePos, 2, 22, 3, lelyetianLeaves);
		addBlock(world, basePos, 2, 22, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 22, 2, lelyetianLeaves);
		addBlock(world, basePos, 3, 22, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 22, 4, lelyetianLeaves);
		addBlock(world, basePos, 4, 22, 2, lelyetianLeaves);
		addBlock(world, basePos, 4, 22, 3, lelyetianLeaves);
		addBlock(world, basePos, 4, 22, 4, lelyetianLeaves);
		addBlock(world, basePos, 2, 23, 2, lelyetianLeaves);
		addBlock(world, basePos, 2, 23, 3, lelyetianLeaves);
		addBlock(world, basePos, 2, 23, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 23, 2, lelyetianLeaves);
		addBlock(world, basePos, 3, 23, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 23, 4, lelyetianLeaves);
		addBlock(world, basePos, 4, 23, 2, lelyetianLeaves);
		addBlock(world, basePos, 4, 23, 3, lelyetianLeaves);
		addBlock(world, basePos, 4, 23, 4, lelyetianLeaves);
		addBlock(world, basePos, 3, 24, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 25, 3, lelyetianLeaves);
		addBlock(world, basePos, 3, 26, 3, lelyetianLeaves);
	}
}