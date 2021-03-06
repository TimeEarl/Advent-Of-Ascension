package net.tslat.aoa3.client.model.entities.mobs.overworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelDeathHunter extends ModelBase {
	private ModelRenderer head;
	private ModelRenderer body;
	private ModelRenderer leg1;
	private ModelRenderer leg2;
	private ModelRenderer leg3;
	private ModelRenderer leg4;
	private ModelRenderer head2;
	private ModelRenderer leg2p2;
	private ModelRenderer leg1p2;
	private ModelRenderer leg4p2;
	private ModelRenderer leg3p2;
	private ModelRenderer shape1;
	private ModelRenderer shape2;
	private ModelRenderer shape3;
	private ModelRenderer shape4;
	private ModelRenderer shape5;
	private ModelRenderer shape6;
	private ModelRenderer shape7;
	private ModelRenderer shape8;
	private ModelRenderer shape9;
	private ModelRenderer shape10;
	private ModelRenderer l1;
	private ModelRenderer body2;
	private ModelRenderer body3;
	private ModelRenderer body4;
	private ModelRenderer body5;
	private ModelRenderer body6;
	private ModelRenderer l2;
	private ModelRenderer l3;
	private ModelRenderer l4;
	private ModelRenderer l5;
	private ModelRenderer l6;
	private ModelRenderer r1;
	private ModelRenderer r2;
	private ModelRenderer r3;
	private ModelRenderer r4;
	private ModelRenderer r5;
	private ModelRenderer r6;

	public ModelDeathHunter() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 33)).addBox(-3.0f, -4.0f, 0.0f, 6, 2, 3);
		head.setRotationPoint(0.0f, 3.0f, -8.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 0, 55)).addBox(-15.0f, -3.0f, -3.5f, 30, 6, 0);
		body.setRotationPoint(0.0f, 5.0f, 4.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 20, 33)).addBox(-2.5f, 10.0f, -1.5f, 3, 2, 3);
		leg1.setRotationPoint(-3.0f, 12.0f, 7.0f);
		leg1.setTextureSize(64, 64);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 20, 33)).addBox(-0.5f, 10.0f, -1.5f, 3, 2, 3);
		leg2.setRotationPoint(3.0f, 12.0f, 7.0f);
		leg2.setTextureSize(64, 64);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 20, 33)).addBox(-2.5f, 10.0f, -2.5f, 3, 2, 3);
		leg3.setRotationPoint(-3.0f, 12.0f, -5.0f);
		leg3.setTextureSize(64, 64);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 20, 33)).addBox(-0.5f, 10.0f, -2.5f, 3, 2, 3);
		leg4.setRotationPoint(3.0f, 12.0f, -5.0f);
		leg4.setTextureSize(64, 64);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -4.0f, -6.0f, 6, 8, 6);
		head2.setRotationPoint(0.0f, 3.0f, -8.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(leg2p2 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -2.0f, 4, 10, 4);
		leg2p2.setRotationPoint(3.0f, 12.0f, 7.0f);
		leg2p2.setTextureSize(64, 64);
		leg2p2.mirror = true;
		setRotation(leg2p2, 0.0f, 0.0f, 0.0f);
		(leg1p2 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -2.0f, 4, 10, 4);
		leg1p2.setRotationPoint(-3.0f, 12.0f, 7.0f);
		leg1p2.setTextureSize(64, 64);
		leg1p2.mirror = true;
		setRotation(leg1p2, 0.0f, 0.0f, 0.0f);
		(leg4p2 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -3.0f, 4, 10, 4);
		leg4p2.setRotationPoint(3.0f, 12.0f, -5.0f);
		leg4p2.setTextureSize(64, 64);
		leg4p2.mirror = true;
		setRotation(leg4p2, 0.0f, 0.0f, 0.0f);
		(leg3p2 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -3.0f, 4, 10, 4);
		leg3p2.setRotationPoint(-3.0f, 12.0f, -5.0f);
		leg3p2.setTextureSize(64, 64);
		leg3p2.mirror = true;
		setRotation(leg3p2, 0.0f, 0.0f, 0.0f);
		(shape1 = new ModelRenderer(this, 0, 42)).addBox(0.0f, 0.0f, -3.0f, 2, 1, 1);
		shape1.setRotationPoint(-8.0f, 9.0f, -13.0f);
		shape1.setTextureSize(64, 64);
		shape1.mirror = true;
		setRotation(shape1, 0.3490659f, 0.0f, 0.0f);
		(shape2 = new ModelRenderer(this, 0, 42)).addBox(-1.0f, 0.0f, -3.0f, 2, 1, 1);
		shape2.setRotationPoint(7.0f, 9.0f, -13.0f);
		shape2.setTextureSize(64, 64);
		shape2.mirror = true;
		setRotation(shape2, 0.3490659f, 0.0f, 0.0f);
		(shape3 = new ModelRenderer(this, 0, 42)).addBox(-1.0f, -2.0f, 0.0f, 3, 3, 10);
		shape3.setRotationPoint(-8.0f, 9.0f, -13.0f);
		shape3.setTextureSize(64, 64);
		shape3.mirror = true;
		setRotation(shape3, 0.3490659f, 0.0f, 0.0f);
		(shape4 = new ModelRenderer(this, 0, 42)).addBox(-1.0f, -2.0f, 0.0f, 3, 3, 10);
		shape4.setRotationPoint(7.0f, 9.0f, -13.0f);
		shape4.setTextureSize(64, 64);
		shape4.mirror = true;
		setRotation(shape4, 0.3490659f, 0.0f, 0.0f);
		(shape5 = new ModelRenderer(this, 0, 42)).addBox(0.0f, -2.0f, -3.0f, 2, 1, 1);
		shape5.setRotationPoint(-8.0f, 9.0f, -13.0f);
		shape5.setTextureSize(64, 64);
		shape5.mirror = true;
		setRotation(shape5, 0.3490659f, 0.0f, 0.0f);
		(shape6 = new ModelRenderer(this, 0, 42)).addBox(-1.0f, -2.0f, -3.0f, 2, 1, 1);
		shape6.setRotationPoint(7.0f, 9.0f, -13.0f);
		shape6.setTextureSize(64, 64);
		shape6.mirror = true;
		setRotation(shape6, 0.3490659f, 0.0f, 0.0f);
		(shape7 = new ModelRenderer(this, 0, 47)).addBox(-1.0f, 0.0f, -3.0f, 1, 1, 3);
		shape7.setRotationPoint(-8.0f, 9.0f, -13.0f);
		shape7.setTextureSize(64, 64);
		shape7.mirror = true;
		setRotation(shape7, 0.3490659f, 0.0f, 0.0f);
		(shape8 = new ModelRenderer(this, 0, 47)).addBox(1.0f, 0.0f, -3.0f, 1, 1, 3);
		shape8.setRotationPoint(7.0f, 9.0f, -13.0f);
		shape8.setTextureSize(64, 64);
		shape8.mirror = true;
		setRotation(shape8, 0.3490659f, 0.0f, 0.0f);
		(shape9 = new ModelRenderer(this, 0, 47)).addBox(1.0f, -2.0f, -3.0f, 1, 1, 3);
		shape9.setRotationPoint(7.0f, 9.0f, -13.0f);
		shape9.setTextureSize(64, 64);
		shape9.mirror = true;
		setRotation(shape9, 0.3490659f, 0.0f, 0.0f);
		(shape10 = new ModelRenderer(this, 0, 47)).addBox(-1.0f, -2.0f, -3.0f, 1, 1, 3);
		shape10.setRotationPoint(-8.0f, 9.0f, -13.0f);
		shape10.setTextureSize(64, 64);
		shape10.mirror = true;
		setRotation(shape10, 0.3490659f, 0.0f, 0.0f);
		(l1 = new ModelRenderer(this, 27, 40)).addBox(-5.5f, -1.0f, -6.5f, 1, 5, 1);
		l1.setRotationPoint(14.0f, 12.0f, 14.0f);
		l1.setTextureSize(64, 64);
		l1.mirror = true;
		setRotation(l1, 0.0f, 0.0f, -0.6108652f);
		(body2 = new ModelRenderer(this, 33, 33)).addBox(-5.0f, -6.0f, 3.0f, 10, 13, 3);
		body2.setRotationPoint(0.0f, 5.0f, 2.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 1.570796f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 0, 55)).addBox(-15.0f, -4.0f, 3.5f, 30, 6, 0);
		body3.setRotationPoint(0.0f, 5.0f, 4.0f);
		body3.setTextureSize(64, 64);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 0, 62)).addBox(-15.0f, -5.0f, 3.0f, 30, 1, 1);
		body4.setRotationPoint(0.0f, 5.0f, 4.0f);
		body4.setTextureSize(64, 64);
		body4.mirror = true;
		setRotation(body4, 0.0f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 0, 62)).addBox(-15.0f, -4.0f, -4.0f, 30, 1, 1);
		body5.setRotationPoint(0.0f, 5.0f, 4.0f);
		body5.setTextureSize(64, 64);
		body5.mirror = true;
		setRotation(body5, 0.0f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 18, 4)).addBox(-6.0f, -10.0f, -7.0f, 12, 18, 10);
		body6.setRotationPoint(0.0f, 5.0f, 2.0f);
		body6.setTextureSize(64, 64);
		body6.mirror = true;
		setRotation(body6, 1.570796f, 0.0f, 0.0f);
		(l2 = new ModelRenderer(this, 54, 2)).addBox(-6.0f, -9.0f, -7.0f, 2, 8, 2);
		l2.setRotationPoint(14.0f, 12.0f, 14.0f);
		l2.setTextureSize(64, 64);
		l2.mirror = true;
		setRotation(l2, 0.0f, 0.0f, -0.6108652f);
		(l3 = new ModelRenderer(this, 54, 2)).addBox(-6.0f, -9.0f, -7.0f, 2, 8, 2);
		l3.setRotationPoint(14.0f, 12.0f, 6.0f);
		l3.setTextureSize(64, 64);
		l3.mirror = true;
		setRotation(l3, 0.0f, 0.0f, -0.6108652f);
		(l4 = new ModelRenderer(this, 27, 40)).addBox(-5.5f, -1.0f, -6.5f, 1, 5, 1);
		l4.setRotationPoint(14.0f, 12.0f, 6.0f);
		l4.setTextureSize(64, 64);
		l4.mirror = true;
		setRotation(l4, -0.0174533f, 0.0f, -0.6108652f);
		(l5 = new ModelRenderer(this, 54, 2)).addBox(-6.0f, -9.0f, -7.0f, 2, 8, 2);
		l5.setRotationPoint(14.0f, 12.0f, 10.0f);
		l5.setTextureSize(64, 64);
		l5.mirror = true;
		setRotation(l5, 0.0f, 0.0f, -0.6108652f);
		(l6 = new ModelRenderer(this, 27, 40)).addBox(-5.5f, -1.0f, -6.5f, 1, 5, 1);
		l6.setRotationPoint(14.0f, 12.0f, 10.0f);
		l6.setTextureSize(64, 64);
		l6.mirror = true;
		setRotation(l6, -0.0174533f, 0.0f, -0.6108652f);
		(r1 = new ModelRenderer(this, 54, 2)).addBox(-6.0f, -9.0f, -7.0f, 2, 8, 2);
		r1.setRotationPoint(-6.0f, 17.0f, 6.0f);
		r1.setTextureSize(64, 64);
		r1.mirror = true;
		setRotation(r1, 0.0f, 0.0f, 0.6108652f);
		(r2 = new ModelRenderer(this, 27, 40)).addBox(-5.5f, -1.0f, -6.5f, 1, 5, 1);
		r2.setRotationPoint(-6.0f, 17.0f, 6.0f);
		r2.setTextureSize(64, 64);
		r2.mirror = true;
		setRotation(r2, -0.0174533f, 0.0f, 0.6108652f);
		(r3 = new ModelRenderer(this, 27, 40)).addBox(-5.5f, -1.0f, -6.5f, 1, 5, 1);
		r3.setRotationPoint(-6.0f, 17.0f, 10.0f);
		r3.setTextureSize(64, 64);
		r3.mirror = true;
		setRotation(r3, -0.0174533f, 0.0f, 0.6108652f);
		(r4 = new ModelRenderer(this, 54, 2)).addBox(-6.0f, -9.0f, -7.0f, 2, 8, 2);
		r4.setRotationPoint(-6.0f, 17.0f, 10.0f);
		r4.setTextureSize(64, 64);
		r4.mirror = true;
		setRotation(r4, 0.0f, 0.0f, 0.6108652f);
		(r5 = new ModelRenderer(this, 54, 2)).addBox(-6.0f, -9.0f, -7.0f, 2, 8, 2);
		r5.setRotationPoint(-6.0f, 17.0f, 14.0f);
		r5.setTextureSize(64, 64);
		r5.mirror = true;
		setRotation(r5, 0.0f, 0.0f, 0.6108652f);
		(r6 = new ModelRenderer(this, 27, 40)).addBox(-5.5f, -1.0f, -6.5f, 1, 5, 1);
		r6.setRotationPoint(-6.0f, 17.0f, 14.0f);
		r6.setTextureSize(64, 64);
		r6.mirror = true;
		setRotation(r6, -0.0174533f, 0.0f, 0.6108652f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		leg1.render(par7);
		leg2.render(par7);
		leg3.render(par7);
		leg4.render(par7);
		head2.render(par7);
		leg2p2.render(par7);
		leg1p2.render(par7);
		leg4p2.render(par7);
		leg3p2.render(par7);
		shape1.render(par7);
		shape2.render(par7);
		shape3.render(par7);
		shape4.render(par7);
		shape5.render(par7);
		shape6.render(par7);
		shape7.render(par7);
		shape8.render(par7);
		shape9.render(par7);
		shape10.render(par7);
		l1.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		body5.render(par7);
		body6.render(par7);
		l2.render(par7);
		l3.render(par7);
		l4.render(par7);
		l5.render(par7);
		l6.render(par7);
		r1.render(par7);
		r2.render(par7);
		r3.render(par7);
		r4.render(par7);
		r5.render(par7);
		r6.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg2p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg3p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		r1.rotateAngleZ = MathHelper.cos(par3 * 0.1f) * 3.1415927f * 0.025f + 0.61f;
		l1.rotateAngleZ = -r1.rotateAngleZ;
		r2.rotateAngleZ = MathHelper.cos(par3 * 0.1f) * 3.1415927f * 0.025f + 0.61f;
		l2.rotateAngleZ = -r2.rotateAngleZ;
		r3.rotateAngleZ = MathHelper.cos(par3 * 0.1f) * 3.1415927f * 0.025f + 0.61f;
		l3.rotateAngleZ = -r3.rotateAngleZ;
		r4.rotateAngleZ = MathHelper.cos(par3 * 0.1f) * 3.1415927f * 0.025f + 0.61f;
		l4.rotateAngleZ = -r4.rotateAngleZ;
		r5.rotateAngleZ = MathHelper.cos(par3 * 0.1f) * 3.1415927f * 0.025f + 0.61f;
		l5.rotateAngleZ = -r5.rotateAngleZ;
		r6.rotateAngleZ = MathHelper.cos(par3 * 0.1f) * 3.1415927f * 0.025f + 0.61f;
		l6.rotateAngleZ = -r6.rotateAngleZ;
	}
}
