package net.nevermine.mob.model.abyss;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelWebReaper extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leftarm1;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer leftarm2;
	ModelRenderer rightarm1;
	ModelRenderer rightarm2;
	ModelRenderer leftarm3;
	ModelRenderer rightarm3;
	ModelRenderer leftarm4;
	ModelRenderer rightarm4;
	ModelRenderer leftarm5;
	ModelRenderer body4;
	ModelRenderer body5;
	ModelRenderer body6;
	ModelRenderer body7;
	ModelRenderer body8;
	ModelRenderer body9;
	ModelRenderer body10;
	ModelRenderer body11;
	ModelRenderer body12;
	ModelRenderer body13;
	ModelRenderer body14;
	ModelRenderer body15;
	ModelRenderer body16;
	ModelRenderer body17;
	ModelRenderer body18;
	ModelRenderer body19;
	ModelRenderer body20;
	ModelRenderer body21;
	ModelRenderer body22;
	ModelRenderer rightarm5;
	ModelRenderer rightarm6;
	ModelRenderer rightarm7;
	ModelRenderer rightarm8;
	ModelRenderer rightarm9;
	ModelRenderer rightarm10;
	ModelRenderer leftarm6;
	ModelRenderer rightarm11;

	public modelWebReaper() {
		textureWidth = 256;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -14.0f, -4.0f, 8, 14, 8);
		head.setRotationPoint(0.0f, -19.0f, 0.0f);
		head.setTextureSize(256, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 84, 2)).addBox(-4.0f, 9.0f, -2.0f, 8, 1, 2);
		body.setRotationPoint(0.0f, -19.0f, -2.0f);
		body.setTextureSize(256, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(leftarm1 = new ModelRenderer(this, 51, 4)).addBox(1.0f, 30.0f, -2.0f, 1, 6, 1);
		leftarm1.setRotationPoint(7.0f, -15.0f, 0.0f);
		leftarm1.setTextureSize(256, 64);
		leftarm1.mirror = true;
		setRotation(leftarm1, 0.0f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 127, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 14, 4);
		rightleg.setRotationPoint(-3.0f, 10.0f, 0.0f);
		rightleg.setTextureSize(256, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 127, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 14, 4);
		leftleg.setRotationPoint(3.0f, 10.0f, 0.0f);
		leftleg.setTextureSize(256, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 91, 16)).addBox(-5.0f, 0.0f, -2.0f, 10, 8, 4);
		body2.setRotationPoint(0.0f, 2.0f, 0.0f);
		body2.setTextureSize(256, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 36, 47)).addBox(-5.0f, 1.0f, -2.0f, 8, 10, 4);
		body3.setRotationPoint(1.0f, -9.0f, 0.0f);
		body3.setTextureSize(256, 64);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(leftarm2 = new ModelRenderer(this, 167, 4)).addBox(3.0f, -2.0f, 0.0f, 4, 28, 0);
		leftarm2.setRotationPoint(7.0f, -15.0f, 0.0f);
		leftarm2.setTextureSize(256, 64);
		leftarm2.mirror = true;
		setRotation(leftarm2, 0.0f, 0.0f, 0.0f);
		(rightarm1 = new ModelRenderer(this, 116, 36)).addBox(-1.0f, -5.0f, -13.0f, 2, 3, 2);
		rightarm1.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightarm1.setTextureSize(256, 64);
		rightarm1.mirror = true;
		setRotation(rightarm1, 0.3490659f, 0.0f, 0.0f);
		(rightarm2 = new ModelRenderer(this, 40, 16)).addBox(-4.0f, 26.0f, -2.0f, 5, 4, 4);
		rightarm2.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightarm2.setTextureSize(256, 64);
		rightarm2.mirror = true;
		setRotation(rightarm2, 0.0f, 0.0f, 0.0f);
		(leftarm3 = new ModelRenderer(this, 40, 16)).addBox(-1.0f, 26.0f, -2.0f, 5, 4, 4);
		leftarm3.setRotationPoint(7.0f, -15.0f, 0.0f);
		leftarm3.setTextureSize(256, 64);
		leftarm3.mirror = true;
		setRotation(leftarm3, 0.0f, 0.0f, 0.0f);
		(rightarm3 = new ModelRenderer(this, 40, 4)).addBox(-4.0f, 30.0f, -2.0f, 1, 4, 1);
		rightarm3.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightarm3.setTextureSize(256, 64);
		rightarm3.mirror = true;
		setRotation(rightarm3, 0.0f, 0.0f, 0.0f);
		(leftarm4 = new ModelRenderer(this, 40, 4)).addBox(-1.0f, 30.0f, -2.0f, 1, 4, 1);
		leftarm4.setRotationPoint(7.0f, -15.0f, 0.0f);
		leftarm4.setTextureSize(256, 64);
		leftarm4.mirror = true;
		setRotation(leftarm4, 0.0f, 0.0f, 0.0f);
		(rightarm4 = new ModelRenderer(this, 40, 4)).addBox(0.0f, 30.0f, -2.0f, 1, 4, 1);
		rightarm4.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightarm4.setTextureSize(256, 64);
		rightarm4.mirror = true;
		setRotation(rightarm4, 0.0f, 0.0f, 0.0f);
		(leftarm5 = new ModelRenderer(this, 40, 4)).addBox(3.0f, 30.0f, -2.0f, 1, 4, 1);
		leftarm5.setRotationPoint(7.0f, -15.0f, 0.0f);
		leftarm5.setTextureSize(256, 64);
		leftarm5.mirror = true;
		setRotation(leftarm5, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 209, 31)).addBox(10.0f, -0.5f, -1.5f, 20, 1, 1);
		body4.setRotationPoint(-1.0f, -18.0f, 7.0f);
		body4.setTextureSize(256, 64);
		body4.mirror = true;
		setRotation(body4, 0.0f, 0.0f, -1.919862f);
		(body5 = new ModelRenderer(this, 67, 2)).addBox(-5.0f, 2.0f, -2.0f, 1, 9, 2);
		body5.setRotationPoint(0.0f, -20.0f, -2.0f);
		body5.setTextureSize(256, 64);
		body5.mirror = true;
		setRotation(body5, 0.0f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 67, 2)).addBox(4.0f, 2.0f, -2.0f, 1, 9, 2);
		body6.setRotationPoint(0.0f, -20.0f, -2.0f);
		body6.setTextureSize(256, 64);
		body6.mirror = true;
		setRotation(body6, 0.0f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 79, 7)).addBox(-4.0f, 3.0f, -1.0f, 8, 7, 1);
		body7.setRotationPoint(0.0f, -20.0f, -2.0f);
		body7.setTextureSize(256, 64);
		body7.mirror = true;
		setRotation(body7, 0.0f, 0.0f, 0.0f);
		(body8 = new ModelRenderer(this, 84, 2)).addBox(-4.0f, 2.0f, -2.0f, 8, 1, 2);
		body8.setRotationPoint(0.0f, -20.0f, -2.0f);
		body8.setTextureSize(256, 64);
		body8.mirror = true;
		setRotation(body8, 0.0f, 0.0f, 0.0f);
		(body9 = new ModelRenderer(this, 4, 24)).addBox(-6.0f, 0.0f, -2.0f, 8, 5, 6);
		body9.setRotationPoint(2.0f, -19.0f, 4.0f);
		body9.setTextureSize(256, 64);
		body9.mirror = true;
		setRotation(body9, 0.0f, 0.0f, 0.0f);
		(body10 = new ModelRenderer(this, 209, 31)).addBox(10.0f, -0.5f, -1.5f, 20, 1, 1);
		body10.setRotationPoint(-1.0f, -15.0f, 7.0f);
		body10.setTextureSize(256, 64);
		body10.mirror = true;
		setRotation(body10, 0.0f, 0.0f, -2.617994f);
		(body11 = new ModelRenderer(this, 208, 25)).addBox(0.0f, -1.0f, -2.0f, 20, 2, 2);
		body11.setRotationPoint(-1.0f, -15.0f, 7.0f);
		body11.setTextureSize(256, 64);
		body11.mirror = true;
		setRotation(body11, 0.0f, 0.0f, -2.617994f);
		(body12 = new ModelRenderer(this, 208, 25)).addBox(0.0f, -1.0f, -2.0f, 20, 2, 2);
		body12.setRotationPoint(-1.0f, -18.0f, 7.0f);
		body12.setTextureSize(256, 64);
		body12.mirror = true;
		setRotation(body12, 0.0f, 0.0f, -1.919862f);
		(body13 = new ModelRenderer(this, 152, 35)).addBox(-26.0f, -27.0f, -1.0f, 52, 27, 0);
		body13.setRotationPoint(0.0f, -15.0f, 7.0f);
		body13.setTextureSize(256, 64);
		body13.mirror = true;
		setRotation(body13, 0.0f, 0.0f, 0.0f);
		(body14 = new ModelRenderer(this, 208, 25)).addBox(0.0f, -1.0f, -2.0f, 20, 2, 2);
		body14.setRotationPoint(1.0f, -18.0f, 7.0f);
		body14.setTextureSize(256, 64);
		body14.mirror = true;
		setRotation(body14, 0.0f, 0.0f, -1.22173f);
		(body15 = new ModelRenderer(this, 209, 31)).addBox(10.0f, -0.5f, -1.5f, 20, 1, 1);
		body15.setRotationPoint(1.0f, -18.0f, 7.0f);
		body15.setTextureSize(256, 64);
		body15.mirror = true;
		setRotation(body15, 0.0f, 0.0f, -1.22173f);
		(body16 = new ModelRenderer(this, 1, 36)).addBox(-6.0f, 0.0f, -2.0f, 12, 12, 4);
		body16.setRotationPoint(0.0f, -20.0f, 0.0f);
		body16.setTextureSize(256, 64);
		body16.mirror = true;
		setRotation(body16, 0.0f, 0.0f, 0.0f);
		(body17 = new ModelRenderer(this, 208, 25)).addBox(0.0f, -1.0f, -2.0f, 20, 2, 2);
		body17.setRotationPoint(-4.0f, -19.0f, 7.0f);
		body17.setTextureSize(256, 64);
		body17.mirror = true;
		setRotation(body17, 0.0f, 0.0f, -2.268928f);
		(body18 = new ModelRenderer(this, 209, 31)).addBox(10.0f, -0.5f, -1.5f, 20, 1, 1);
		body18.setRotationPoint(-4.0f, -19.0f, 7.0f);
		body18.setTextureSize(256, 64);
		body18.mirror = true;
		setRotation(body18, 0.0f, 0.0f, -2.268928f);
		(body19 = new ModelRenderer(this, 208, 25)).addBox(0.0f, -1.0f, -2.0f, 20, 2, 2);
		body19.setRotationPoint(1.0f, -15.0f, 7.0f);
		body19.setTextureSize(256, 64);
		body19.mirror = true;
		setRotation(body19, 0.0f, 0.0f, -0.5235988f);
		(body20 = new ModelRenderer(this, 209, 31)).addBox(10.0f, -0.5f, -1.5f, 20, 1, 1);
		body20.setRotationPoint(1.0f, -15.0f, 7.0f);
		body20.setTextureSize(256, 64);
		body20.mirror = true;
		setRotation(body20, 0.0f, 0.0f, -0.5235988f);
		(body21 = new ModelRenderer(this, 208, 25)).addBox(0.0f, -1.0f, -2.0f, 20, 2, 2);
		body21.setRotationPoint(4.0f, -19.0f, 7.0f);
		body21.setTextureSize(256, 64);
		body21.mirror = true;
		setRotation(body21, 0.0f, 0.0f, -0.8726646f);
		(body22 = new ModelRenderer(this, 209, 31)).addBox(10.0f, -0.5f, -1.5f, 20, 1, 1);
		body22.setRotationPoint(4.0f, -19.0f, 7.0f);
		body22.setTextureSize(256, 64);
		body22.mirror = true;
		setRotation(body22, 0.0f, 0.0f, -0.8726646f);
		(rightarm5 = new ModelRenderer(this, 154, 4)).addBox(-7.0f, -2.0f, 0.0f, 4, 28, 0);
		rightarm5.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightarm5.setTextureSize(256, 64);
		rightarm5.mirror = true;
		setRotation(rightarm5, 0.0f, 0.0f, 0.0f);
		(rightarm6 = new ModelRenderer(this, 82, 28)).addBox(-3.0f, 1.0f, -15.0f, 3, 32, 3);
		rightarm6.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightarm6.setTextureSize(256, 64);
		rightarm6.mirror = true;
		setRotation(rightarm6, 0.3490659f, 0.0f, 0.0f);
		(rightarm7 = new ModelRenderer(this, 95, 40)).addBox(-4.0f, -2.0f, -16.0f, 5, 3, 5);
		rightarm7.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightarm7.setTextureSize(256, 64);
		rightarm7.mirror = true;
		setRotation(rightarm7, 0.3490659f, 0.0f, 0.0f);
		(rightarm8 = new ModelRenderer(this, 116, 36)).addBox(-4.0f, -5.0f, -13.0f, 2, 3, 2);
		rightarm8.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightarm8.setTextureSize(256, 64);
		rightarm8.mirror = true;
		setRotation(rightarm8, 0.3490659f, 0.0f, 0.0f);
		(rightarm9 = new ModelRenderer(this, 116, 36)).addBox(-1.0f, -5.0f, -16.0f, 2, 3, 2);
		rightarm9.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightarm9.setTextureSize(256, 64);
		rightarm9.mirror = true;
		setRotation(rightarm9, 0.3490659f, 0.0f, 0.0f);
		(rightarm10 = new ModelRenderer(this, 116, 36)).addBox(-4.0f, -5.0f, -16.0f, 2, 3, 2);
		rightarm10.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightarm10.setTextureSize(256, 64);
		rightarm10.mirror = true;
		setRotation(rightarm10, 0.3490659f, 0.0f, 0.0f);
		(leftarm6 = new ModelRenderer(this, 64, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 28, 4);
		leftarm6.setRotationPoint(7.0f, -15.0f, 0.0f);
		leftarm6.setTextureSize(256, 64);
		leftarm6.mirror = true;
		setRotation(leftarm6, 0.0f, 0.0f, 0.0f);
		(rightarm11 = new ModelRenderer(this, 64, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 28, 4);
		rightarm11.setRotationPoint(-7.0f, -15.0f, 0.0f);
		rightarm11.setTextureSize(256, 64);
		rightarm11.mirror = true;
		setRotation(rightarm11, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		leftarm1.render(par7);
		rightleg.render(par7);
		leftleg.render(par7);
		body2.render(par7);
		body3.render(par7);
		leftarm2.render(par7);
		rightarm1.render(par7);
		rightarm2.render(par7);
		leftarm3.render(par7);
		rightarm3.render(par7);
		leftarm4.render(par7);
		rightarm4.render(par7);
		leftarm5.render(par7);
		body4.render(par7);
		body5.render(par7);
		body6.render(par7);
		body7.render(par7);
		body8.render(par7);
		body9.render(par7);
		body10.render(par7);
		body11.render(par7);
		body12.render(par7);
		body13.render(par7);
		body14.render(par7);
		body15.render(par7);
		body16.render(par7);
		body17.render(par7);
		body18.render(par7);
		body19.render(par7);
		body20.render(par7);
		body21.render(par7);
		body22.render(par7);
		rightarm5.render(par7);
		rightarm6.render(par7);
		rightarm7.render(par7);
		rightarm8.render(par7);
		rightarm9.render(par7);
		rightarm10.render(par7);
		leftarm6.render(par7);
		rightarm11.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / 57.295776f;
		head.rotateAngleX = par5 / 54.11268f;
		rightarm1.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.349f;
		rightarm1.rotateAngleZ = 0.0f;
		rightarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm2.rotateAngleZ = 0.0f;
		rightarm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm3.rotateAngleZ = 0.0f;
		rightarm4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm4.rotateAngleZ = 0.0f;
		rightarm5.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm5.rotateAngleZ = 0.0f;
		rightarm6.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.349f;
		rightarm6.rotateAngleZ = 0.0f;
		rightarm7.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.349f;
		rightarm7.rotateAngleZ = 0.0f;
		rightarm8.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.349f;
		rightarm8.rotateAngleZ = 0.0f;
		rightarm9.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.349f;
		rightarm9.rotateAngleZ = 0.0f;
		rightarm10.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.349f;
		rightarm10.rotateAngleZ = 0.0f;
		rightarm11.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm11.rotateAngleZ = 0.0f;
		leftarm1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm1.rotateAngleZ = 0.0f;
		leftarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm2.rotateAngleZ = 0.0f;
		leftarm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm3.rotateAngleZ = 0.0f;
		leftarm4.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm4.rotateAngleZ = 0.0f;
		leftarm5.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm5.rotateAngleZ = 0.0f;
		leftarm6.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm6.rotateAngleZ = 0.0f;
		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg.rotateAngleY = 0.0f;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}