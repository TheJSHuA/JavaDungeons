package juniebyte.javadungeons.mixin;

import net.fabricmc.fabric.api.FabricBiomesInternal;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.VanillaLayeredBiomeSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

import java.util.function.Supplier;
import java.util.stream.Stream;

@Mixin(VanillaLayeredBiomeSource.class)
public class VanillaLayeredBiomeSourceMixin {
	@ModifyArgs(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/biome/source/BiomeSource;<init>(Ljava/util/stream/Stream;)V"))
	private static void appendOverworldBiomes(Args args, long seed, boolean legacyBiomeInitLayer, boolean largeBiomes, Registry<Biome> biomeRegistry) {
		Stream<Supplier<Biome>> vanillaBiomes = args.get(0);
		Stream<Supplier<Biome>> addedBiomes = FabricBiomesInternal.getOverworldBiomes().stream().map(biomeRegistryKey -> () -> biomeRegistry.get(biomeRegistryKey));
		args.set(0, Stream.concat(vanillaBiomes, addedBiomes));

		// Saved for resolving rawIDs in BiomeLayers.
		FabricBiomesInternal.lastBiomeRegistry = biomeRegistry;
	}
}