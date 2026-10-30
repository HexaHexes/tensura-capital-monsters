package org.bitwisemadness.tensuracapitalmonsters.gametest;

import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.neoforged.neoforge.gametest.GameTestHolder;
import net.neoforged.neoforge.gametest.PrefixGameTestTemplate;
import org.bitwisemadness.tensuracapitalmonsters.TensuraCapitalMonsters;

/** Smoke test: the mod loads and the gametest harness runs. */
@GameTestHolder(TensuraCapitalMonsters.MOD_ID)
@PrefixGameTestTemplate(false)
public final class TensuraCapitalMonstersGameTests {

    private TensuraCapitalMonstersGameTests() {
    }

    @GameTest(template = "empty")
    public static void mod_loads(GameTestHelper helper) {
        helper.succeed();
    }
}