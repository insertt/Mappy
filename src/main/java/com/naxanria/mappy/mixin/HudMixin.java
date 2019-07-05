package com.naxanria.mappy.mixin;

import com.naxanria.mappy.map.MapGUI;
import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class HudMixin {
    @Inject(at = @At("RETURN"), method = "render(F)V")
    public void render(float delta, CallbackInfo info) {
        MapGUI map = MapGUI.instance;
        if (map != null) {
            map.draw();
        }
        //
        //    GlStateManager.disableDepthTest();
        //    WayPointRenderer.render(delta);
        //    GlStateManager.enableDepthTest();
    }
}
