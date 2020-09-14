package juniebyte.javadungeons.mixin;

import com.mojang.datafixers.util.Pair;
import net.fabricmc.fabric.api.FabricBiomesInternal;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.MultiNoiseBiomeSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

@Mixin(MultiNoiseBiomeSource.Preset.class)
public class MultiNoiseBiomeSourcePresetMixin {
	@ModifyArgs(method = "getBiomeSource", at = @At(value = "INVOKE", target = "net/minecraft/world/biome/source/MultiNoiseBiomeSource.<init> (JLjava/util/List;Ljava/util/Optional;Lnet/minecraft/world/biome/source/MultiNoiseBiomeSource$1;)V"))
	private static void appendNetherBiomes(Args args, MultiNoiseBiomeSource.Preset preset, Registry<Biome> registry, Long seed) {
		List<Pair<Biome.MixedNoisePoint, Supplier<Biome>>> biomes = new LinkedList<>(args.get(1));

		for (Map.Entry<RegistryKey<Biome>, Biome.MixedNoisePoint> entry : FabricBiomesInternal.getNetherBiomes().entrySet()) {
			biomes.add(new Pair<>(entry.getValue(), () -> registry.get(entry.getKey())));
		}

		args.set(1, biomes);
	}
}