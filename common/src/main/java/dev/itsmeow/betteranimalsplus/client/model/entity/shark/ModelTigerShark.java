package dev.itsmeow.betteranimalsplus.client.model.entity.shark;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.itsmeow.betteranimalsplus.common.entity.EntityShark;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;

/**
 * TigerShark - Batman
 * Created using Tabula 7.0.1
 */
public class ModelTigerShark extends EntityModel<EntityShark> {
    public ModelPart body;
    public ModelPart tail00;
    public ModelPart neck;
    public ModelPart dorsalFin00;
    public ModelPart lFin00;
    public ModelPart rFin00;
    public ModelPart tail01;
    public ModelPart tail02;
    public ModelPart lLowerTailFin;
    public ModelPart rLowerTailFin;
    public ModelPart tail03;
    public ModelPart tail04;
    public ModelPart upperTailFin;
    public ModelPart mLowerTailFin;
    public ModelPart tail05;
    public ModelPart tailFinUpper00;
    public ModelPart tailFinLower00;
    public ModelPart tailFinUpper01;
    public ModelPart tailFinUpper02;
    public ModelPart tailFinLower01;
    public ModelPart tailFinLower02;
    public ModelPart head;
    public ModelPart lowerJaw;
    public ModelPart snout;
    public ModelPart teethUpper;
    public ModelPart headUpper;
    public ModelPart teethLower;
    public ModelPart dorsalFin01;
    public ModelPart dorsalFin03;
    public ModelPart dorsalFin02;
    public ModelPart dorsalFin04;
    public ModelPart lFin01;
    public ModelPart lFin02;
    public ModelPart rFin01;
    public ModelPart rFin02;

    public ModelTigerShark() {
        this.texWidth = 80;
        this.texHeight = 200;
        this.dorsalFin00 = new ModelPart(this, 26, 124);
        this.dorsalFin00.setPos(0.5F, -6.6F, -7.7F);
        this.dorsalFin00.addBox(-1.5F, -0.4F, 0.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(dorsalFin00, -0.40980330836826856F, 0.0F, 0.0F);
        this.tail05 = new ModelPart(this, 25, 50);
        this.tail05.setPos(0.0F, 0.0F, 3.4F);
        this.tail05.addBox(-0.5F, -1.5F, 0.0F, 1, 3, 4, 0.0F);
        this.dorsalFin04 = new ModelPart(this, 26, 152);
        this.dorsalFin04.setPos(0.0F, -3.7F, 1.6F);
        this.dorsalFin04.addBox(0.0F, 0.0F, -0.6F, 1, 7, 2, 0.0F);
        this.setRotateAngle(dorsalFin04, 0.4553564018453205F, 0.0F, 0.0F);
        this.lowerJaw = new ModelPart(this, 0, 156);
        this.lowerJaw.setPos(0.0F, 0.9F, -8.4F);
        this.lowerJaw.addBox(-3.0F, -1.0F, -4.0F, 6, 2, 4, 0.0F);
        this.setRotateAngle(lowerJaw, -0.22759093446006054F, 0.0F, 0.0F);
        this.tailFinLower00 = new ModelPart(this, 25, 91);
        this.tailFinLower00.setPos(0.0F, 0.9F, 2.0F);
        this.tailFinLower00.addBox(-0.49F, 0.0F, -1.5F, 1, 3, 3, 0.0F);
        this.setRotateAngle(tailFinLower00, 0.4553564018453205F, 0.0F, 0.0F);
        this.neck = new ModelPart(this, 0, 103);
        this.neck.setPos(0.0F, 0.0F, -13.6F);
        this.neck.addBox(-4.0F, -5.5F, -9.0F, 8, 8, 9, 0.0F);
        this.setRotateAngle(neck, 0.045553093477052F, 0.0F, 0.0F);
        this.head = new ModelPart(this, 0, 124);
        this.head.setPos(0.0F, -0.6F, -8.6F);
        this.head.addBox(-3.5F, -2.7F, -4.2F, 7, 3, 4, 0.0F);
        this.setRotateAngle(head, -0.136659280431156F, 0.0F, 0.0F);
        this.upperTailFin = new ModelPart(this, 19, 189);
        this.upperTailFin.setPos(-0.5F, -1.4F, 0.8F);
        this.upperTailFin.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(upperTailFin, 1.4570008595648662F, 0.0F, 0.0F);
        this.teethUpper = new ModelPart(this, 0, 164);
        this.teethUpper.setPos(-2.5F, -0.2F, -3.4F);
        this.teethUpper.addBox(0.0F, 0.0F, 0.0F, 5, 1, 4, 0.0F);
        this.rFin02 = new ModelPart(this, 0, 189);
        this.rFin02.setPos(0.0F, 3.7F, 1.0F);
        this.rFin02.addBox(0.0F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(rFin02, 0.136659280431156F, 0.0F, 0.0F);
        this.dorsalFin01 = new ModelPart(this, 26, 133);
        this.dorsalFin01.setPos(0.0F, -3.3F, 0.4F);
        this.dorsalFin01.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 7, 0.0F);
        this.setRotateAngle(dorsalFin01, -0.136659280431156F, 0.0F, 0.0F);
        this.tail00 = new ModelPart(this, 0, 27);
        this.tail00.setPos(0.0F, -1.0F, -0.7F);
        this.tail00.addBox(-3.5F, -4.5F, 0.0F, 7, 8, 11, 0.0F);
        this.setRotateAngle(tail00, -0.05969026041820607F, 0.0F, 0.0F);
        this.mLowerTailFin = new ModelPart(this, 22, 179);
        this.mLowerTailFin.setPos(-0.5F, 1.6F, 0.4F);
        this.mLowerTailFin.addBox(0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(mLowerTailFin, 0.22759093446006054F, 0.0F, 0.0F);
        this.tailFinLower01 = new ModelPart(this, 15, 88);
        this.tailFinLower01.setPos(0.0F, 2.6F, -0.5F);
        this.tailFinLower01.addBox(-0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(tailFinLower01, 0.22759093446006054F, 0.0F, 0.0F);
        this.body = new ModelPart(this, 0, 0);
        this.body.setPos(0.0F, 13.0F, 3.0F);
        this.body.addBox(-4.5F, -5.5F, -14.0F, 9, 9, 14, 0.0F);
        this.setRotateAngle(body, 0.022863813201125717F, 0.0F, 0.0F);
        this.tail01 = new ModelPart(this, 0, 50);
        this.tail01.setPos(0.0F, -1.4F, 10.4F);
        this.tail01.addBox(-2.5F, -3.0F, 0.0F, 5, 7, 6, 0.0F);
        this.setRotateAngle(tail01, -0.04363323129985824F, 0.0F, 0.0F);
        this.headUpper = new ModelPart(this, 0, 146);
        this.headUpper.setPos(0.0F, 0.0F, 2.2F);
        this.headUpper.addBox(-3.0F, 0.0F, 0.0F, 6, 3, 5, 0.0F);
        this.setRotateAngle(headUpper, -0.6829473363053812F, 0.0F, 0.0F);
        this.tail03 = new ModelPart(this, 0, 78);
        this.tail03.setPos(0.0F, -1.0F, 5.7F);
        this.tail03.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 5, 0.0F);
        this.dorsalFin03 = new ModelPart(this, 26, 163);
        this.dorsalFin03.setPos(-1.0F, -5.6F, 2.1F);
        this.dorsalFin03.addBox(0.0F, -3.1F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(dorsalFin03, -0.5235987755982988F, 0.0F, 0.0F);
        this.lFin00 = new ModelPart(this, 0, 178);
        this.lFin00.mirror = true;
        this.lFin00.setPos(3.6F, 2.0F, -13.9F);
        this.lFin00.addBox(-0.5F, 0.0F, 0.0F, 1, 5, 5, 0.0F);
        this.setRotateAngle(lFin00, 0.18203784098300857F, 0.0F, -0.7740535232594852F);
        this.rFin00 = new ModelPart(this, 0, 178);
        this.rFin00.setPos(-3.6F, 2.0F, -13.9F);
        this.rFin00.addBox(-0.5F, 0.0F, 0.0F, 1, 5, 5, 0.0F);
        this.setRotateAngle(rFin00, 0.18203784098300857F, 0.0F, 0.7740535232594852F);
        this.rFin01 = new ModelPart(this, 12, 178);
        this.rFin01.setPos(-0.5F, 4.9F, 0.0F);
        this.rFin01.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(rFin01, 0.22759093446006054F, 0.0F, 0.0F);
        this.tail02 = new ModelPart(this, 0, 65);
        this.tail02.setPos(0.0F, 0.1F, 5.3F);
        this.tail02.addBox(-2.0F, -3.0F, 0.0F, 4, 5, 6, 0.0F);
        this.setRotateAngle(tail02, -1.7453292519943296E-4F, 0.0F, 0.0F);
        this.snout = new ModelPart(this, 0, 135);
        this.snout.setPos(0.0F, -1.1F, -6.8F);
        this.snout.addBox(-2.5F, 0.0F, 0.2F, 5, 3, 2, 0.0F);
        this.setRotateAngle(snout, 1.0471975511965976F, 0.0F, 0.0F);
        this.tailFinUpper00 = new ModelPart(this, 25, 61);
        this.tailFinUpper00.setPos(0.0F, -0.5F, 1.5F);
        this.tailFinUpper00.addBox(-0.51F, -6.0F, -1.5F, 1, 6, 4, 0.0F);
        this.setRotateAngle(tailFinUpper00, -0.9560913642424937F, 0.0F, 0.0F);
        this.teethLower = new ModelPart(this, 0, 171);
        this.teethLower.setPos(-2.0F, -1.8F, -3.0F);
        this.teethLower.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
        this.tail04 = new ModelPart(this, 0, 89);
        this.tail04.setPos(0.0F, -0.4F, 4.9F);
        this.tail04.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 4, 0.0F);
        this.tailFinUpper02 = new ModelPart(this, 25, 84);
        this.tailFinUpper02.setPos(0.0F, -5.8F, -0.5F);
        this.tailFinUpper02.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 2, 0.0F);
        this.setRotateAngle(tailFinUpper02, -0.045553093477052F, 0.0F, 0.0F);
        this.tailFinLower02 = new ModelPart(this, 15, 97);
        this.tailFinLower02.setPos(0.0F, 3.0F, -1.0F);
        this.tailFinLower02.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(tailFinLower02, 0.31869712141416456F, 0.0F, 0.0F);
        this.lLowerTailFin = new ModelPart(this, 8, 189);
        this.lLowerTailFin.mirror = true;
        this.lLowerTailFin.setPos(2.2F, 4.0F, 1.5F);
        this.lLowerTailFin.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(lLowerTailFin, 0.36425021489121656F, 0.0F, -0.5462880558742251F);
        this.lFin01 = new ModelPart(this, 12, 178);
        this.lFin01.mirror = true;
        this.lFin01.setPos(-0.5F, 4.9F, 0.0F);
        this.lFin01.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(lFin01, 0.22759093446006054F, 0.0F, 0.0F);
        this.rLowerTailFin = new ModelPart(this, 8, 189);
        this.rLowerTailFin.setPos(-2.2F, 4.0F, 1.5F);
        this.rLowerTailFin.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(rLowerTailFin, 0.36425021489121656F, 0.0F, 0.5462880558742251F);
        this.tailFinUpper01 = new ModelPart(this, 25, 73);
        this.tailFinUpper01.setPos(0.0F, -5.8F, -0.5F);
        this.tailFinUpper01.addBox(-0.5F, -6.0F, -1.0F, 1, 6, 3, 0.0F);
        this.setRotateAngle(tailFinUpper01, -0.091106186954104F, 0.0F, 0.0F);
        this.lFin02 = new ModelPart(this, 0, 189);
        this.lFin02.mirror = true;
        this.lFin02.setPos(0.0F, 3.7F, 1.0F);
        this.lFin02.addBox(0.0F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(lFin02, 0.136659280431156F, 0.0F, 0.0F);
        this.dorsalFin02 = new ModelPart(this, 26, 144);
        this.dorsalFin02.setPos(-1.0F, -0.8F, 0.1F);
        this.dorsalFin02.addBox(0.0F, -2.2F, 0.1F, 1, 3, 4, 0.0F);
        this.setRotateAngle(dorsalFin02, -0.08726646259971647F, 0.0F, 0.0F);
        this.body.addChild(this.dorsalFin00);
        this.tail04.addChild(this.tail05);
        this.dorsalFin02.addChild(this.dorsalFin04);
        this.neck.addChild(this.lowerJaw);
        this.tail05.addChild(this.tailFinLower00);
        this.body.addChild(this.neck);
        this.neck.addChild(this.head);
        this.tail03.addChild(this.upperTailFin);
        this.head.addChild(this.teethUpper);
        this.rFin01.addChild(this.rFin02);
        this.dorsalFin00.addChild(this.dorsalFin01);
        this.body.addChild(this.tail00);
        this.tail03.addChild(this.mLowerTailFin);
        this.tailFinLower00.addChild(this.tailFinLower01);
        this.tail00.addChild(this.tail01);
        this.snout.addChild(this.headUpper);
        this.tail02.addChild(this.tail03);
        this.dorsalFin00.addChild(this.dorsalFin03);
        this.body.addChild(this.lFin00);
        this.body.addChild(this.rFin00);
        this.rFin00.addChild(this.rFin01);
        this.tail01.addChild(this.tail02);
        this.head.addChild(this.snout);
        this.tail05.addChild(this.tailFinUpper00);
        this.lowerJaw.addChild(this.teethLower);
        this.tail03.addChild(this.tail04);
        this.tailFinUpper01.addChild(this.tailFinUpper02);
        this.tailFinLower01.addChild(this.tailFinLower02);
        this.tail01.addChild(this.lLowerTailFin);
        this.lFin00.addChild(this.lFin01);
        this.tail01.addChild(this.rLowerTailFin);
        this.tailFinUpper00.addChild(this.tailFinUpper01);
        this.lFin01.addChild(this.lFin02);
        this.dorsalFin01.addChild(this.dorsalFin02);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }

    @Override
    public void setupAnim(EntityShark entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        ModelBullShark.animate(entity, ageInTicks, body, tail00, tail01, tail02, lowerJaw);
    }

    public void setRotateAngle(ModelPart ModelRenderer, float x, float y, float z) {
        ModelRenderer.xRot = x;
        ModelRenderer.yRot = y;
        ModelRenderer.zRot = z;
    }
}
