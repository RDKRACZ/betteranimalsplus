package dev.itsmeow.betteranimalsplus.compat.curios;

import dev.itsmeow.betteranimalsplus.common.item.ItemBearCape;
import dev.itsmeow.betteranimalsplus.common.item.ItemCape;
import dev.itsmeow.betteranimalsplus.common.item.ItemWolfCape;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.CuriosCapability;
import top.theillusivec4.curios.api.SlotTypeMessage;
import top.theillusivec4.curios.api.SlotTypePreset;
import top.theillusivec4.curios.api.type.capability.ICurio;

public class CuriosModCompat {

    public static void subscribe(IEventBus modBus) {
        modBus.addListener(CuriosModCompat::interModEnqueue);
        MinecraftForge.EVENT_BUS.register(CuriosModCompat.class);
        ItemCape.can_equip = (stack, armorType, entity) -> !CuriosApi.getCuriosHelper().findEquippedCurio(s -> s.getItem() instanceof ItemCape, (Player) entity).isPresent();
    }

    public static void interModEnqueue(final InterModEnqueueEvent event) {
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () -> SlotTypePreset.BACK.getMessageBuilder().build());
    }

    @SubscribeEvent
    public static void attachCapabilities(AttachCapabilitiesEvent<ItemStack> event) {
        ItemStack stack = event.getObject();
        Item item = stack.getItem();
        if (item instanceof ItemWolfCape || item instanceof ItemBearCape) {
            event.addCapability(CuriosCapability.ID_ITEM, new ICapabilityProvider() {
                final LazyOptional<ICurio> curio = LazyOptional.of(() -> new CurioCape(item instanceof ItemWolfCape ? "wolf" : "bear", stack));

                @Override
                public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction direction) {
                    return CuriosCapability.ITEM.orEmpty(cap, curio);
                }
            });
        }
    }

}
