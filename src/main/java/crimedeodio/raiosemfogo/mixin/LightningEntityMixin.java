package crimedeodio.raiosemfogo.mixin;

import net.minecraft.entity.LightningEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LightningEntity.class)
public class LightningEntityMixin {
	@Inject(method = "spawnFire", at = @At("HEAD"), cancellable = true)
	private void preventFire(int fireChance, CallbackInfo ci) {
		ci.cancel();
	}
}