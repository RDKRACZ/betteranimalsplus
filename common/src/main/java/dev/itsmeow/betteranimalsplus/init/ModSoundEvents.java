package dev.itsmeow.betteranimalsplus.init;

import dev.itsmeow.betteranimalsplus.Ref;
import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class ModSoundEvents {

    private static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(Ref.MOD_ID, Registry.SOUND_EVENT_REGISTRY);

    public static final RegistrySupplier<SoundEvent> GOOSE_DEATH = r("entity_goose_death");
    public static final RegistrySupplier<SoundEvent> GOOSE_HURT = r("entity_goose_hurt");
    public static final RegistrySupplier<SoundEvent> GOOSE_AMBIENT = r("entity_goose_ambient");
    public static final RegistrySupplier<SoundEvent> WALRUS_TUNE = r("walrus_tune");

    private static RegistrySupplier<SoundEvent> r(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(Ref.MOD_ID, name.replaceAll("_", "."))));
    }

    public static void init() {
        SOUNDS.register();
    }
}
