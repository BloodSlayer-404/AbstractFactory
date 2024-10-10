package org.example.factories;

import org.example.ToolFactory;
import org.example.tools.axes.Axe;
import org.example.tools.axes.IronAxe;
import org.example.tools.pickaxes.Pickaxe;
import org.example.tools.pickaxes.IronPickaxe;
import org.example.tools.hoes.Hoe;
import org.example.tools.hoes.IronHoe;
import org.example.tools.shovels.Shovel;
import org.example.tools.shovels.IronShovel;

public class IronToolsFactory implements ToolFactory {

    /**
     * Returns a new {@link IronAxe}
     * @return a new {@link IronAxe}
     */
    @Override
    public Axe createAxe() {
        return new IronAxe();
    }

    /**
     * Returns a new {@link IronPickaxe}
     * @return a new {@link IronPickaxe}
     */
    @Override
    public Pickaxe createPickaxe() {
        return new IronPickaxe();
    }

    /**
     * Returns a new {@link IronHoe}
     * @return a new {@link IronHoe}
     */
    @Override
    public Hoe createHoe() {
        return new IronHoe();
    }

    /**
     * Returns a new {@link IronShovel}
     * @return a new {@link IronShovel}
     */
    @Override
    public Shovel createShovel() {
        return new IronShovel();
    }
}
