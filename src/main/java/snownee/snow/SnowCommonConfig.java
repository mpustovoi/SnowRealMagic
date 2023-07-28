package snownee.snow;

import snownee.kiwi.config.KiwiConfig;
import snownee.kiwi.config.KiwiConfig.Comment;
import snownee.kiwi.config.KiwiConfig.Path;
import snownee.kiwi.config.KiwiConfig.Range;
import snownee.kiwi.loader.Platform;

@KiwiConfig
public final class SnowCommonConfig {

	public static boolean placeSnowInBlock = true;
	public static boolean placeSnowInBlockNaturally = true;
	public static boolean snowGravity = true;
	public static boolean snowAlwaysReplaceable = true;
	@Comment("Unavailable if TerraForged mod installed")
	public static boolean snowAccumulationDuringSnowstorm = true;
	@Comment("Unavailable if TerraForged mod installed")
	public static boolean snowAccumulationDuringSnowfall = false;
	@Range(min = 1, max = 9)
	@Comment("9 = Unlimited")
	public static int snowAccumulationMaxLayers = 8;
	@Comment("Unavailable if TerraForged mod installed")
	public static boolean thinnerBoundingBox = true;
	public static boolean snowMakingIce = true;
	public static boolean snowNeverMelt = false;
	public static boolean snowAndIceMeltInWarmBiomes = false;
	@Comment("Should snow melt if layers are more than 1")
	public static boolean snowNaturalMelt = !Platform.isModLoaded("terraforged");
	public static boolean snowReduceFallDamage = true;
	@Comment("block like grass will be generated with snow")
	public static boolean replaceWorldFeature = true;
	public static boolean sustainGrassIfLayerMoreThanOne = true;
	@Comment(
		"If you want to uninstall this mod, you probably want to make snow-covered blocks back to normal via random tick."
	)
	public static boolean retainOriginalBlocks = false;
	@Comment("Sneak+rightclicking to make snowball")
	public static boolean sneakSnowball = true;
	public static int mobSpawningMaxLayers = 8;

	@Path("integration.accumulationWinterOnly")
	public static boolean accumulationWinterOnly = false;
	@Path("debug.mobSpawningCommand")
	public static boolean debugSpawningCommand = false;
	@Path("debug.weatherTickSlowness")
	@Range(min = 1)
	public static int weatherTickSlowness = 16;

	public static boolean canPlaceSnowInBlock() {
		return placeSnowInBlock && !retainOriginalBlocks;
	}

}
