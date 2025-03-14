package dev.itsmeow.betteranimalsplus.client.model.entity;

import dev.itsmeow.betteranimalsplus.client.model.abstracts.ModelBear;
import dev.itsmeow.betteranimalsplus.common.entity.EntityBearNeutral;
import net.minecraft.client.model.geom.ModelPart;

public class ModelBlackBear<T extends EntityBearNeutral> extends ModelBear<T> {

    public ModelBlackBear() {
        texWidth = 128;
        texHeight = 64;

        chest = new ModelPart(this);
        chest.setPos(1.0F, 9.0F, 10.0F);
        chest.texOffs(0, 0).addBox(-7.0F, -6.0F, -23.0F, 12.0F, 12.0F, 13.0F, 0.0F, false);

        neck = new ModelPart(this);
        neck.setPos(-1.0F, -3.0F, -17.0F);
        chest.addChild(neck);
        neck.texOffs(61, 46).addBox(-4.5F, -1.75F, -9.0F, 9.0F, 10.0F, 5.0F, 0.0F, false);

        head = new ModelPart(this);
        head.setPos(0.0F, 5.0F, -6.0F);
        neck.addChild(head);
        head.texOffs(93, 37).addBox(-4.0F, -5.5F, -8.25F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        head.texOffs(0, 7).addBox(2.25F, -7.5F, -5.25F, 3.0F, 3.0F, 2.0F, 0.0F, false);
        head.texOffs(0, 7).addBox(-4.75F, -7.5F, -5.25F, 3.0F, 3.0F, 2.0F, 0.0F, true);

        nose_r1 = new ModelPart(this);
        nose_r1.setPos(0.0F, -5.0F, 0.75F);
        head.addChild(nose_r1);
        setRotationAngle(nose_r1, 0.2182F, 0.0F, 0.0F);
        nose_r1.texOffs(45, 0).addBox(-1.5F, -1.0F, -13.5F, 3.0F, 3.0F, 5.0F, 0.0F, false);

        lowerJaw = new ModelPart(this);
        lowerJaw.setPos(0.0F, 1.0F, -8.0F);
        head.addChild(lowerJaw);
        lowerJaw.texOffs(21, 55).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
        lowerJaw.texOffs(46, 27).addBox(-2.0F, -2.5F, -4.0F, 4.0F, 2.0F, 5.0F, -0.2F, false);

        snout = new ModelPart(this);
        snout.setPos(0.0F, 0.0F, 0.0F);
        head.addChild(snout);
        snout.texOffs(0, 54).addBox(-2.5F, -2.5F, -12.25F, 5.0F, 3.0F, 4.0F, 0.0F, false);

        upperTeeth = new ModelPart(this);
        upperTeeth.setPos(0.0F, -3.0F, -8.0F);
        snout.addChild(upperTeeth);
        upperTeeth.texOffs(50, 18).addBox(-2.5F, 3.25F, -4.25F, 5.0F, 2.0F, 4.0F, -0.2F, false);

        ass = new ModelPart(this);
        ass.setPos(0.0F, 0.0F, -10.0F);
        chest.addChild(ass);
        ass.texOffs(0, 26).addBox(-8.5F, -7.0F, 0.0F, 15.0F, 13.0F, 14.0F, 0.0F, false);

        lArm01 = new ModelPart(this);
        lArm01.setPos(2.0F, -0.75F, -16.0F);
        chest.addChild(lArm01);
        lArm01.texOffs(63, 0).addBox(-1.5F, -3.0F, -3.5F, 7.0F, 11.0F, 7.0F, 0.0F, false);

        lArm02 = new ModelPart(this);
        lArm02.setPos(-1.0F, 5.0F, 1.0F);
        lArm01.addChild(lArm02);
        setRotationAngle(lArm02, -0.0873F, 0.0F, 0.0F);
        lArm02.texOffs(64, 19).addBox(0.0F, 2.0F, -4.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);

        lPaw = new ModelPart(this);
        lPaw.setPos(3.25F, 9.0F, -2.0F);
        lArm02.addChild(lPaw);
        setRotationAngle(lPaw, 0.0873F, 0.0F, 0.0F);
        lPaw.texOffs(65, 34).addBox(-3.25F, 0.0F, -3.0F, 6.0F, 2.0F, 7.0F, 0.1F, false);

        lFClaw04_r1 = new ModelPart(this);
        lFClaw04_r1.setPos(-2.5F, 0.0F, -3.0F);
        lPaw.addChild(lFClaw04_r1);
        setRotationAngle(lFClaw04_r1, 0.2182F, -0.0436F, 0.0F);
        lFClaw04_r1.texOffs(1, 0).addBox(-0.5F, 0.0F, -1.75F, 1.0F, 2.0F, 3.0F, 0.0F, true);

        lFClaw03_r1 = new ModelPart(this);
        lFClaw03_r1.setPos(-1.0F, 0.0F, -3.0F);
        lPaw.addChild(lFClaw03_r1);
        setRotationAngle(lFClaw03_r1, 0.2182F, 0.0F, 0.0F);
        lFClaw03_r1.texOffs(1, 0).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, 0.0F, true);
        lFClaw03_r1.texOffs(1, 0).addBox(1.0F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        lFClaw02_r1 = new ModelPart(this);
        lFClaw02_r1.setPos(1.0F, 0.0F, -3.0F);
        lPaw.addChild(lFClaw02_r1);
        setRotationAngle(lFClaw02_r1, 0.2182F, -0.0436F, 0.0F);
        lFClaw02_r1.texOffs(1, 0).addBox(0.5F, 0.0F, -1.75F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        rArm01 = new ModelPart(this);
        rArm01.setPos(-4.0F, -0.75F, -16.0F);
        chest.addChild(rArm01);
        rArm01.texOffs(63, 0).addBox(-5.5F, -3.0F, -3.5F, 7.0F, 11.0F, 7.0F, 0.0F, true);

        rArm02 = new ModelPart(this);
        rArm02.setPos(1.0F, 5.0F, 1.0F);
        rArm01.addChild(rArm02);
        setRotationAngle(rArm02, -0.0873F, 0.0F, 0.0F);
        rArm02.texOffs(64, 19).addBox(-6.0F, 2.0F, -4.0F, 6.0F, 8.0F, 6.0F, 0.0F, true);

        rPaw = new ModelPart(this);
        rPaw.setPos(-3.25F, 9.0F, -2.0F);
        rArm02.addChild(rPaw);
        setRotationAngle(rPaw, 0.0873F, 0.0F, 0.0F);
        rPaw.texOffs(65, 34).addBox(-2.75F, 0.0F, -3.0F, 6.0F, 2.0F, 7.0F, 0.1F, true);

        rFClaw04_r1 = new ModelPart(this);
        rFClaw04_r1.setPos(2.5F, 0.0F, -3.0F);
        rPaw.addChild(rFClaw04_r1);
        setRotationAngle(rFClaw04_r1, 0.2182F, 0.0436F, 0.0F);
        rFClaw04_r1.texOffs(1, 0).addBox(-0.5F, 0.0F, -1.75F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        rFClaw03_r1 = new ModelPart(this);
        rFClaw03_r1.setPos(1.0F, 0.0F, -3.0F);
        rPaw.addChild(rFClaw03_r1);
        setRotationAngle(rFClaw03_r1, 0.2182F, 0.0F, 0.0F);
        rFClaw03_r1.texOffs(1, 0).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
        rFClaw03_r1.texOffs(1, 0).addBox(-2.0F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, 0.0F, true);

        rFClaw02_r1 = new ModelPart(this);
        rFClaw02_r1.setPos(-1.0F, 0.0F, -3.0F);
        rPaw.addChild(rFClaw02_r1);
        setRotationAngle(rFClaw02_r1, 0.2182F, 0.0436F, 0.0F);
        rFClaw02_r1.texOffs(1, 0).addBox(-1.5F, 0.0F, -1.75F, 1.0F, 2.0F, 3.0F, 0.0F, true);

        lLeg01 = new ModelPart(this);
        lLeg01.setPos(8.0F, 7.0F, 7.5F);
        lLeg01.texOffs(94, 0).addBox(-5.5F, -2.0F, -4.0F, 7.0F, 11.0F, 8.0F, 0.0F, false);

        lLeg02 = new ModelPart(this);
        lLeg02.setPos(-2.0F, 8.75F, -3.0F);
        lLeg01.addChild(lLeg02);
        setRotationAngle(lLeg02, 0.1309F, 0.0F, 0.0F);
        lLeg02.texOffs(96, 20).addBox(-2.75F, 0.0F, 0.0F, 6.0F, 8.0F, 7.0F, 0.0F, false);

        lFoot = new ModelPart(this);
        lFoot.setPos(0.25F, 6.5F, 1.5F);
        lLeg02.addChild(lFoot);
        setRotationAngle(lFoot, -0.1309F, 0.0F, 0.0F);
        lFoot.texOffs(65, 34).addBox(-3.25F, 0.0F, -3.0F, 6.0F, 2.0F, 7.0F, 0.1F, false);

        lHClaw04_r1 = new ModelPart(this);
        lHClaw04_r1.setPos(-2.5F, 0.0F, -3.0F);
        lFoot.addChild(lHClaw04_r1);
        setRotationAngle(lHClaw04_r1, 0.2182F, -0.0436F, 0.0F);
        lHClaw04_r1.texOffs(1, 0).addBox(-0.5F, 0.0F, -1.75F, 1.0F, 2.0F, 3.0F, 0.0F, true);

        lHClaw03_r1 = new ModelPart(this);
        lHClaw03_r1.setPos(-1.0F, 0.0F, -3.0F);
        lFoot.addChild(lHClaw03_r1);
        setRotationAngle(lHClaw03_r1, 0.2182F, 0.0F, 0.0F);
        lHClaw03_r1.texOffs(1, 0).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, 0.0F, true);
        lHClaw03_r1.texOffs(1, 0).addBox(1.0F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        lHClaw02_r1 = new ModelPart(this);
        lHClaw02_r1.setPos(1.0F, 0.0F, -3.0F);
        lFoot.addChild(lHClaw02_r1);
        setRotationAngle(lHClaw02_r1, 0.2182F, -0.0436F, 0.0F);
        lHClaw02_r1.texOffs(1, 0).addBox(0.5F, 0.0F, -1.75F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        rLeg01 = new ModelPart(this);
        rLeg01.setPos(-8.0F, 7.0F, 7.5F);
        rLeg01.texOffs(94, 0).addBox(-1.5F, -2.0F, -4.0F, 7.0F, 11.0F, 8.0F, 0.0F, true);

        rLeg02 = new ModelPart(this);
        rLeg02.setPos(2.0F, 8.75F, -3.0F);
        rLeg01.addChild(rLeg02);
        setRotationAngle(rLeg02, 0.1309F, 0.0F, 0.0F);
        rLeg02.texOffs(96, 20).addBox(-3.25F, 0.0F, 0.0F, 6.0F, 8.0F, 7.0F, 0.0F, true);

        rFoot = new ModelPart(this);
        rFoot.setPos(-0.25F, 6.5F, 1.5F);
        rLeg02.addChild(rFoot);
        setRotationAngle(rFoot, -0.1309F, 0.0F, 0.0F);
        rFoot.texOffs(65, 34).addBox(-2.75F, 0.0F, -3.0F, 6.0F, 2.0F, 7.0F, 0.1F, true);

        rHClaw04_r1 = new ModelPart(this);
        rHClaw04_r1.setPos(2.5F, 0.0F, -3.0F);
        rFoot.addChild(rHClaw04_r1);
        setRotationAngle(rHClaw04_r1, 0.2182F, 0.0436F, 0.0F);
        rHClaw04_r1.texOffs(1, 0).addBox(-0.5F, 0.0F, -1.75F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        rHClaw03_r1 = new ModelPart(this);
        rHClaw03_r1.setPos(1.0F, 0.0F, -3.0F);
        rFoot.addChild(rHClaw03_r1);
        setRotationAngle(rHClaw03_r1, 0.2182F, 0.0F, 0.0F);
        rHClaw03_r1.texOffs(1, 0).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
        rHClaw03_r1.texOffs(1, 0).addBox(-2.0F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, 0.0F, true);

        rHClaw02_r1 = new ModelPart(this);
        rHClaw02_r1.setPos(-1.0F, 0.0F, -3.0F);
        rFoot.addChild(rHClaw02_r1);
        setRotationAngle(rHClaw02_r1, 0.2182F, 0.0436F, 0.0F);
        rHClaw02_r1.texOffs(1, 0).addBox(-1.5F, 0.0F, -1.75F, 1.0F, 2.0F, 3.0F, 0.0F, true);
    }

}
