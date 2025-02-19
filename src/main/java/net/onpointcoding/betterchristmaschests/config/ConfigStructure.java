package net.onpointcoding.betterchristmaschests.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import net.onpointcoding.betterchristmaschests.enums.ChristmasChestsEnabled;

@SuppressWarnings("unused")
@Config(name = "betterchristmaschests")
@Config.Gui.Background("minecraft:textures/block/oak_planks.png")
public
class ConfigStructure implements ConfigData {
    @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
    public ChristmasChestsEnabled christmasModeEnabled = ChristmasChestsEnabled.AT_CHRISTMAS;

    // Enable charm integration
    public boolean charmPresentsEnabled = true;

    // Enable horse types separately
    // The normal, zombie and skeleton variants of the Christmas horse chests can't be seen in vanilla
    public boolean christmasHorseEnabled = true;
    public boolean christmasZombieHorseEnabled = true;
    public boolean christmasDonkeyEnabled = true;

    // Enable chest types separately
    public boolean christmasChestEnabled = true;
    public boolean christmasTrappedChestEnabled = true;
    public boolean christmasEnderChestEnabled = true;

    // Enable minecart with chest type separately
    public boolean christmasMinecartWithChestEnabled = true;
}