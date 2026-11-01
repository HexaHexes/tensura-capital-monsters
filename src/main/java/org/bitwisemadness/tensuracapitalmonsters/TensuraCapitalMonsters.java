package org.bitwisemadness.tensuracapitalmonsters;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

/**
 * The Monsters capital - the Black Keep in the dark forests and swamps.
 *
 * <p>The cities ship as bundled datapack content ({@code data/} in this jar)
 * and register themselves into the central capital tags owned by the
 * {@code tensura_faction_spawn} mod, which handles arrival and placement. This
 * mod adds no runtime behaviour of its own yet; it exists so the capitals
 * install like any mod and version with the rest of the ecosystem.</p>
 */
@Mod(TensuraCapitalMonsters.MOD_ID)
public final class TensuraCapitalMonsters {

    public static final String MOD_ID = "tensura_capital_monsters";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TensuraCapitalMonsters(IEventBus modBus) {
        LOGGER.info("Tensura Capital: Monsters initialized");
    }
}
