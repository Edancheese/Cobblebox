package edancheese.cobblebox

import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.fml.common.Mod
import edancheese.cobblebox.config.ConfigBuilder
import edancheese.cobblebox.config.CobbleboxConfig

@Mod(CobbleboxMod.MOD_ID)
object CobbleboxMod {
    const val MOD_ID = "cobblebox"

    @Suppress("MemberVisibilityCanBePrivate")
    var config: CobbleboxConfig = ConfigBuilder.load(CobbleboxConfig::class.java, MOD_ID)

    @EventBusSubscriber()
    object Registration {
    }
}