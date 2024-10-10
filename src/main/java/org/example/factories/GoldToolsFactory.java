package org.example.factories;

import org.example.ToolFactory;
import org.example.tools.axes.Axe;
import org.example.tools.axes.GoldAxe;
import org.example.tools.pickaxes.Pickaxe;
import org.example.tools.pickaxes.GoldPickaxe;
import org.example.tools.hoes.Hoe;
import org.example.tools.hoes.GoldHoe;
import org.example.tools.shovels.Shovel;
import org.example.tools.shovels.GoldShovel;

public class GoldToolsFactory implements ToolFactory {

    /**
     * Returns a new {@link GoldAxe}
     * @return a new {@link GoldAxe}
     */
    @Override
    public Axe createAxe() {
        return new GoldAxe();
    }

    /**
     * Returns a new {@link GoldPickaxe}
     * @return a new {@link GoldPickaxe}
     */
    @Override
    public Pickaxe createPickaxe() {
        return new GoldPickaxe();
    }

    /**
     * Returns a new {@link GoldHoe}
     * @return a new {@link GoldHoe}
     */
    @Override
    public Hoe createHoe() {
        return new GoldHoe();
    }

    /**
     * Returns a new {@link GoldShovel}
     * @return a new {@link GoldShovel}
     */
    @Override
    public Shovel createShovel() {
        return new GoldShovel();
    }
}
