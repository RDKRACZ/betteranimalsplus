package dev.itsmeow.betteranimalsplus.client.model.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.Entity;

/**
 * squid_giant - Batman, Cybercat5555
 * Created using Tabula 8.0.0
 */
public class ModelGiantSquid<T extends Entity> extends EntityModel<T> {
    public ModelPart head;
    public ModelPart mantle;
    public ModelPart lEye;
    public ModelPart rEye;
    public ModelPart tentacleLongL0;
    public ModelPart tentacleLT0;
    public ModelPart tentacleRT0;
    public ModelPart tentacleT0;
    public ModelPart tentacleRM0;
    public ModelPart tentacleRB0;
    public ModelPart tentacleLM0;
    public ModelPart tentacleLB0;
    public ModelPart tentacleB0;
    public ModelPart tentacleLongR0;
    public ModelPart siphon;
    public ModelPart beakTop;
    public ModelPart beakLow;
    public ModelPart mantleBack;
    public ModelPart mantleTop;
    public ModelPart mantleTipTop;
    public ModelPart mantleTipLow;
    public ModelPart fin0;
    public ModelPart fin1;
    public ModelPart tentacleLongL1;
    public ModelPart tentacleLongL2;
    public ModelPart tentacleLongL3;
    public ModelPart tentacleLongL4;
    public ModelPart tentacleLongL5;
    public ModelPart tentacleLongL6;
    public ModelPart tentacleLongL7;
    public ModelPart tentacleLongLHand;
    public ModelPart tentacleLT1;
    public ModelPart tentacleLT2;
    public ModelPart tentacleLT3;
    public ModelPart tentacleLT4;
    public ModelPart tentacleRT1;
    public ModelPart tentacleRT2;
    public ModelPart tentacleRT3;
    public ModelPart tentacleRT4;
    public ModelPart tentacleT1;
    public ModelPart tentacleT2;
    public ModelPart tentacleT3;
    public ModelPart tentacleT4;
    public ModelPart tentacleRM1;
    public ModelPart tentacleRM2;
    public ModelPart tentacleRM3;
    public ModelPart tentacleRM4;
    public ModelPart tentacleRB1;
    public ModelPart tentacleRB2;
    public ModelPart tentacleRB3;
    public ModelPart tentacleRB4;
    public ModelPart tentacleLM1;
    public ModelPart tentacleLM2;
    public ModelPart tentacleLM3;
    public ModelPart tentacleLM4;
    public ModelPart tentacleLB1;
    public ModelPart tentacleLB2;
    public ModelPart tentacleLB3;
    public ModelPart tentacleLB4;
    public ModelPart tentacleB1;
    public ModelPart tentacleB2;
    public ModelPart tentacleB3;
    public ModelPart tentacleB4;
    public ModelPart tentacleLongR1;
    public ModelPart tentacleLongR2;
    public ModelPart tentacleLongR3;
    public ModelPart tentacleLongR4;
    public ModelPart tentacleLongR5;
    public ModelPart tentacleLongR6;
    public ModelPart tentacleLongR7;
    public ModelPart tentacleLongRHand;
    protected ModelPart[] mainTentacles;

    public ModelGiantSquid() {
        this.texWidth = 64;
        this.texHeight = 64;
        this.tentacleLongL5 = new ModelPart(this, 27, 0);
        this.tentacleLongL5.mirror = true;
        this.tentacleLongL5.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLongL5.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleRM2 = new ModelPart(this, 46, 0);
        this.tentacleRM2.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleRM2.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLB3 = new ModelPart(this, 46, 0);
        this.tentacleLB3.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLB3.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleRT3 = new ModelPart(this, 46, 0);
        this.tentacleRT3.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleRT3.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLongR6 = new ModelPart(this, 27, 0);
        this.tentacleLongR6.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLongR6.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tentacleLongR6, 0.0F, -0.136659280431156F, 0.0F);
        this.mantleBack = new ModelPart(this, 0, 34);
        this.mantleBack.setPos(0.0F, 1.1F, 10.0F);
        this.mantleBack.addBox(-3.0F, -1.0F, 0.0F, 6, 4, 12, 0.0F);
        this.setRotateAngle(mantleBack, 0.136659280431156F, 0.0F, 0.0F);
        this.tentacleLongLHand = new ModelPart(this, 35, 24);
        this.tentacleLongLHand.mirror = true;
        this.tentacleLongLHand.setPos(0.0F, 0.0F, -6.5F);
        this.tentacleLongLHand.addBox(-1.0F, -1.5F, -10.0F, 2, 3, 10, 0.0F);
        this.setRotateAngle(tentacleLongLHand, 0.0F, 0.22759093446006054F, 0.0F);
        this.tentacleB0 = new ModelPart(this, 46, 0);
        this.tentacleB0.setPos(0.0F, 2.5F, -6.7F);
        this.tentacleB0.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tentacleB0, -0.03490658503988659F, 0.0F, -3.141592653589793F);
        this.tentacleRB0 = new ModelPart(this, 46, 0);
        this.tentacleRB0.setPos(-2.3F, 2.5F, -6.7F);
        this.tentacleRB0.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tentacleRB0, 0.0F, 0.0F, -2.2689280275926285F);
        this.tentacleRB3 = new ModelPart(this, 46, 0);
        this.tentacleRB3.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleRB3.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.mantleTop = new ModelPart(this, 0, 19);
        this.mantleTop.setPos(0.0F, -4.5F, 1.5F);
        this.mantleTop.addBox(-3.5F, 0.0F, 0.0F, 7, 4, 11, 0.0F);
        this.setRotateAngle(mantleTop, -0.31869712141416456F, 0.0F, 0.0F);
        this.beakLow = new ModelPart(this, 0, 5);
        this.beakLow.setPos(0.0F, 2.0F, -8.8F);
        this.beakLow.addBox(-1.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(beakLow, -0.136659280431156F, 0.0F, 0.0F);
        this.tentacleLB1 = new ModelPart(this, 46, 0);
        this.tentacleLB1.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLB1.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLB0 = new ModelPart(this, 46, 0);
        this.tentacleLB0.setPos(2.3F, 2.5F, -6.7F);
        this.tentacleLB0.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tentacleLB0, 0.0F, 0.0F, 2.2689280275926285F);
        this.tentacleLongL2 = new ModelPart(this, 39, 10);
        this.tentacleLongL2.mirror = true;
        this.tentacleLongL2.setPos(0.0F, 0.0F, -9.7F);
        this.tentacleLongL2.addBox(-1.0F, -1.0F, -10.0F, 2, 2, 10, 0.0F);
        this.tentacleLongR0 = new ModelPart(this, 39, 10);
        this.tentacleLongR0.setPos(-2.5F, -1.0F, -6.4F);
        this.tentacleLongR0.addBox(-1.0F, -1.0F, -10.0F, 2, 2, 10, 0.0F);
        this.setRotateAngle(tentacleLongR0, 0.0F, 0.27314402793711257F, 0.0F);
        this.tentacleLongL0 = new ModelPart(this, 39, 10);
        this.tentacleLongL0.mirror = true;
        this.tentacleLongL0.setPos(2.5F, -1.0F, -6.4F);
        this.tentacleLongL0.addBox(-1.0F, -1.0F, -10.0F, 2, 2, 10, 0.0F);
        this.setRotateAngle(tentacleLongL0, 0.0F, -0.27314402793711257F, 0.0F);
        this.tentacleLT3 = new ModelPart(this, 46, 0);
        this.tentacleLT3.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLT3.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleRM3 = new ModelPart(this, 46, 0);
        this.tentacleRM3.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleRM3.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLB4 = new ModelPart(this, 46, 0);
        this.tentacleLB4.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLB4.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.mantleTipLow = new ModelPart(this, 21, 50);
        this.mantleTipLow.setPos(0.0F, 2.0F, 0.3F);
        this.mantleTipLow.addBox(-2.0F, 0.0F, 0.0F, 4, 2, 5, 0.0F);
        this.setRotateAngle(mantleTipLow, 0.36425021489121656F, 0.0F, 0.0F);
        this.tentacleLongR1 = new ModelPart(this, 39, 10);
        this.tentacleLongR1.setPos(0.0F, 0.0F, -9.7F);
        this.tentacleLongR1.addBox(-1.0F, -1.0F, -10.0F, 2, 2, 10, 0.0F);
        this.tentacleLM3 = new ModelPart(this, 46, 0);
        this.tentacleLM3.mirror = true;
        this.tentacleLM3.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLM3.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.siphon = new ModelPart(this, 0, 22);
        this.siphon.setPos(0.0F, 3.3F, -0.7F);
        this.siphon.addBox(-0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(siphon, 0.40980330836826856F, 0.0F, 0.0F);
        this.tentacleLongR4 = new ModelPart(this, 27, 0);
        this.tentacleLongR4.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLongR4.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.mantleTipTop = new ModelPart(this, 25, 22);
        this.mantleTipTop.setPos(0.0F, 0.0F, 11.0F);
        this.mantleTipTop.addBox(-2.5F, 0.0F, 0.0F, 5, 2, 5, 0.0F);
        this.tentacleLongR2 = new ModelPart(this, 39, 10);
        this.tentacleLongR2.setPos(0.0F, 0.0F, -9.7F);
        this.tentacleLongR2.addBox(-1.0F, -1.0F, -10.0F, 2, 2, 10, 0.0F);
        this.tentacleB4 = new ModelPart(this, 46, 0);
        this.tentacleB4.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleB4.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.beakTop = new ModelPart(this, 0, 0);
        this.beakTop.setPos(0.0F, -2.0F, -9.0F);
        this.beakTop.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(beakTop, 0.136659280431156F, 0.0F, 0.0F);
        this.lEye = new ModelPart(this, 0, 34);
        this.lEye.mirror = true;
        this.lEye.setPos(3.0F, 0.0F, -4.0F);
        this.lEye.addBox(0.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.tentacleT2 = new ModelPart(this, 46, 0);
        this.tentacleT2.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleT2.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleRM0 = new ModelPart(this, 46, 0);
        this.tentacleRM0.setPos(-2.3F, 0.2F, -6.7F);
        this.tentacleRM0.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tentacleRM0, 0.0F, 0.0F, -1.5707963267948966F);
        this.tentacleRT4 = new ModelPart(this, 46, 0);
        this.tentacleRT4.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleRT4.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleRT1 = new ModelPart(this, 46, 0);
        this.tentacleRT1.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleRT1.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleRM1 = new ModelPart(this, 46, 0);
        this.tentacleRM1.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleRM1.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLongR5 = new ModelPart(this, 27, 0);
        this.tentacleLongR5.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLongR5.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLT2 = new ModelPart(this, 46, 0);
        this.tentacleLT2.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLT2.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleT3 = new ModelPart(this, 46, 0);
        this.tentacleT3.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleT3.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleRB1 = new ModelPart(this, 46, 0);
        this.tentacleRB1.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleRB1.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLB2 = new ModelPart(this, 46, 0);
        this.tentacleLB2.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLB2.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLM2 = new ModelPart(this, 46, 0);
        this.tentacleLM2.mirror = true;
        this.tentacleLM2.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLM2.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.fin0 = new ModelPart(this, 32, 37);
        this.fin0.setPos(0.0F, 1.0F, 1.0F);
        this.fin0.addBox(-4.5F, 0.0F, 0.0F, 9, 1, 7, 0.0F);
        this.tentacleLongL6 = new ModelPart(this, 27, 0);
        this.tentacleLongL6.mirror = true;
        this.tentacleLongL6.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLongL6.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tentacleLongL6, 0.0F, 0.136659280431156F, 0.0F);
        this.tentacleB1 = new ModelPart(this, 46, 0);
        this.tentacleB1.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleB1.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLongRHand = new ModelPart(this, 35, 24);
        this.tentacleLongRHand.setPos(0.0F, 0.0F, -6.5F);
        this.tentacleLongRHand.addBox(-1.0F, -1.5F, -10.0F, 2, 3, 10, 0.0F);
        this.setRotateAngle(tentacleLongRHand, 0.0F, -0.22759093446006054F, 0.0F);
        this.tentacleLongL4 = new ModelPart(this, 27, 0);
        this.tentacleLongL4.mirror = true;
        this.tentacleLongL4.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLongL4.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLM1 = new ModelPart(this, 46, 0);
        this.tentacleLM1.mirror = true;
        this.tentacleLM1.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLM1.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.head = new ModelPart(this, 35, 50);
        this.head.setPos(0.0F, 15.0F, 3.0F);
        this.head.addBox(-3.5F, -3.5F, -7.0F, 7, 7, 7, 0.0F);
        this.tentacleT4 = new ModelPart(this, 46, 0);
        this.tentacleT4.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleT4.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleRM4 = new ModelPart(this, 46, 0);
        this.tentacleRM4.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleRM4.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleRB2 = new ModelPart(this, 46, 0);
        this.tentacleRB2.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleRB2.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.rEye = new ModelPart(this, 0, 34);
        this.rEye.setPos(-3.0F, 0.0F, -4.0F);
        this.rEye.addBox(-1.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.tentacleRT0 = new ModelPart(this, 46, 0);
        this.tentacleRT0.setPos(-2.3F, -2.2F, -6.7F);
        this.tentacleRT0.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tentacleRT0, 0.0F, 0.0F, -0.31869712141416456F);
        this.tentacleT1 = new ModelPart(this, 46, 0);
        this.tentacleT1.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleT1.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLongL7 = new ModelPart(this, 27, 0);
        this.tentacleLongL7.mirror = true;
        this.tentacleLongL7.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLongL7.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleRT2 = new ModelPart(this, 46, 0);
        this.tentacleRT2.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleRT2.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLongL1 = new ModelPart(this, 39, 10);
        this.tentacleLongL1.mirror = true;
        this.tentacleLongL1.setPos(0.0F, 0.0F, -9.7F);
        this.tentacleLongL1.addBox(-1.0F, -1.0F, -10.0F, 2, 2, 10, 0.0F);
        this.tentacleB2 = new ModelPart(this, 46, 0);
        this.tentacleB2.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleB2.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLM4 = new ModelPart(this, 46, 0);
        this.tentacleLM4.mirror = true;
        this.tentacleLM4.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLM4.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleRB4 = new ModelPart(this, 46, 0);
        this.tentacleRB4.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleRB4.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLongR7 = new ModelPart(this, 27, 0);
        this.tentacleLongR7.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLongR7.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLongL3 = new ModelPart(this, 27, 0);
        this.tentacleLongL3.mirror = true;
        this.tentacleLongL3.setPos(0.0F, 0.0F, -9.7F);
        this.tentacleLongL3.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tentacleLongL3, 0.0F, 0.22759093446006054F, 0.0F);
        this.tentacleLT0 = new ModelPart(this, 46, 0);
        this.tentacleLT0.setPos(2.3F, -2.2F, -6.7F);
        this.tentacleLT0.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tentacleLT0, 0.0F, 0.0F, 0.31869712141416456F);
        this.tentacleB3 = new ModelPart(this, 46, 0);
        this.tentacleB3.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleB3.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.fin1 = new ModelPart(this, 0, 56);
        this.fin1.setPos(0.0F, 0.1F, 2.0F);
        this.fin1.addBox(0.0F, 0.0F, 0.0F, 7, 1, 7, 0.0F);
        this.setRotateAngle(fin1, 0.0F, -0.7853981633974483F, 0.0F);
        this.tentacleLT1 = new ModelPart(this, 46, 0);
        this.tentacleLT1.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLT1.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLongR3 = new ModelPart(this, 27, 0);
        this.tentacleLongR3.setPos(0.0F, 0.0F, -9.7F);
        this.tentacleLongR3.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tentacleLongR3, 0.0F, -0.22759093446006054F, 0.0F);
        this.tentacleLT4 = new ModelPart(this, 46, 0);
        this.tentacleLT4.setPos(0.0F, 0.0F, -6.7F);
        this.tentacleLT4.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.mantle = new ModelPart(this, 0, 0);
        this.mantle.setPos(0.0F, 0.0F, -1.0F);
        this.mantle.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 11, 0.0F);
        this.setRotateAngle(mantle, -0.045553093477052F, 0.0F, 0.0F);
        this.tentacleT0 = new ModelPart(this, 46, 0);
        this.tentacleT0.setPos(0.0F, -2.4F, -6.7F);
        this.tentacleT0.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.tentacleLM0 = new ModelPart(this, 46, 0);
        this.tentacleLM0.mirror = true;
        this.tentacleLM0.setPos(2.3F, 0.2F, -6.7F);
        this.tentacleLM0.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tentacleLM0, 0.0F, 0.0F, 1.5707963267948966F);
        this.tentacleLongL4.addChild(this.tentacleLongL5);
        this.tentacleRM1.addChild(this.tentacleRM2);
        this.tentacleLB2.addChild(this.tentacleLB3);
        this.tentacleRT2.addChild(this.tentacleRT3);
        this.tentacleLongR5.addChild(this.tentacleLongR6);
        this.mantle.addChild(this.mantleBack);
        this.tentacleLongL7.addChild(this.tentacleLongLHand);
        this.head.addChild(this.tentacleB0);
        this.head.addChild(this.tentacleRB0);
        this.tentacleRB2.addChild(this.tentacleRB3);
        this.mantleBack.addChild(this.mantleTop);
        this.head.addChild(this.beakLow);
        this.tentacleLB0.addChild(this.tentacleLB1);
        this.head.addChild(this.tentacleLB0);
        this.tentacleLongL1.addChild(this.tentacleLongL2);
        this.head.addChild(this.tentacleLongR0);
        this.head.addChild(this.tentacleLongL0);
        this.tentacleLT2.addChild(this.tentacleLT3);
        this.tentacleRM2.addChild(this.tentacleRM3);
        this.tentacleLB3.addChild(this.tentacleLB4);
        this.mantleTipTop.addChild(this.mantleTipLow);
        this.tentacleLongR0.addChild(this.tentacleLongR1);
        this.tentacleLM2.addChild(this.tentacleLM3);
        this.head.addChild(this.siphon);
        this.tentacleLongR3.addChild(this.tentacleLongR4);
        this.mantleTop.addChild(this.mantleTipTop);
        this.tentacleLongR1.addChild(this.tentacleLongR2);
        this.tentacleB3.addChild(this.tentacleB4);
        this.head.addChild(this.beakTop);
        this.head.addChild(this.lEye);
        this.tentacleT1.addChild(this.tentacleT2);
        this.head.addChild(this.tentacleRM0);
        this.tentacleRT3.addChild(this.tentacleRT4);
        this.tentacleRT0.addChild(this.tentacleRT1);
        this.tentacleRM0.addChild(this.tentacleRM1);
        this.tentacleLongR4.addChild(this.tentacleLongR5);
        this.tentacleLT1.addChild(this.tentacleLT2);
        this.tentacleT2.addChild(this.tentacleT3);
        this.tentacleRB0.addChild(this.tentacleRB1);
        this.tentacleLB1.addChild(this.tentacleLB2);
        this.tentacleLM1.addChild(this.tentacleLM2);
        this.mantleTipTop.addChild(this.fin0);
        this.tentacleLongL5.addChild(this.tentacleLongL6);
        this.tentacleB0.addChild(this.tentacleB1);
        this.tentacleLongR7.addChild(this.tentacleLongRHand);
        this.tentacleLongL3.addChild(this.tentacleLongL4);
        this.tentacleLM0.addChild(this.tentacleLM1);
        this.tentacleT3.addChild(this.tentacleT4);
        this.tentacleRM3.addChild(this.tentacleRM4);
        this.tentacleRB1.addChild(this.tentacleRB2);
        this.head.addChild(this.rEye);
        this.head.addChild(this.tentacleRT0);
        this.tentacleT0.addChild(this.tentacleT1);
        this.tentacleLongL6.addChild(this.tentacleLongL7);
        this.tentacleRT1.addChild(this.tentacleRT2);
        this.tentacleLongL0.addChild(this.tentacleLongL1);
        this.tentacleB1.addChild(this.tentacleB2);
        this.tentacleLM3.addChild(this.tentacleLM4);
        this.tentacleRB3.addChild(this.tentacleRB4);
        this.tentacleLongR6.addChild(this.tentacleLongR7);
        this.tentacleLongL2.addChild(this.tentacleLongL3);
        this.head.addChild(this.tentacleLT0);
        this.tentacleB2.addChild(this.tentacleB3);
        this.fin0.addChild(this.fin1);
        this.tentacleLT0.addChild(this.tentacleLT1);
        this.tentacleLongR2.addChild(this.tentacleLongR3);
        this.tentacleLT3.addChild(this.tentacleLT4);
        this.head.addChild(this.mantle);
        this.head.addChild(this.tentacleT0);
        this.head.addChild(this.tentacleLM0);
        this.mainTentacles = new ModelPart[]{
                tentacleLT0,
                tentacleRT0,
                tentacleT0,
                tentacleRM0,
                tentacleRB0,
                tentacleLM0,
                tentacleLB0,
                tentacleB0
        };
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.head.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }

    @Override
    public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.xRot = (float) (Math.PI / 2F);
        for (ModelPart m : mainTentacles) {
            m.xRot = -ageInTicks / 2F;
        }
    }

    public void setRotateAngle(ModelPart ModelRenderer, float x, float y, float z) {
        ModelRenderer.xRot = x;
        ModelRenderer.yRot = y;
        ModelRenderer.zRot = z;
    }
}
