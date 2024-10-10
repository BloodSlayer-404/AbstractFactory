package org.example.factories;

import org.example.ToolFactory;
import org.example.tools.axes.Axe;
import org.example.tools.axes.DiamondAxe;
import org.example.tools.pickaxes.Pickaxe;
import org.example.tools.pickaxes.DiamondPickaxe;
import org.example.tools.hoes.Hoe;
import org.example.tools.hoes.DiamondHoe;
import org.example.tools.shovels.Shovel;
import org.example.tools.shovels.DiamondShovel;

public class DiamondToolsFactory implements ToolFactory {

    /**
     * Returns a new {@link DiamondAxe}
     * @return a new {@link DiamondAxe}
     */
    @Override
    public Axe createAxe() {
        return new DiamondAxe();
    }

    /**
     * Returns a new {@link DiamondPickaxe}
     * @return a new {@link DiamondPickaxe}
     */
    @Override
    public Pickaxe createPickaxe() {
        return new DiamondPickaxe();
    }

    /**
     * Returns a new {@link DiamondHoe}
     * @return a new {@link DiamondHoe}
     */
    @Override
    public Hoe createHoe() {
        return new DiamondHoe();
    }

    /**
     * Returns a new {@link DiamondShovel}
     * @return a new {@link DiamondShovel}
     */
    @Override
    public Shovel createShovel() {
        return new DiamondShovel();
    }
}
