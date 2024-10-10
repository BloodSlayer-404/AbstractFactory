package org.example.factories;

import org.example.ToolFactory;
import org.example.tools.axes.Axe;
import org.example.tools.axes.StoneAxe;
import org.example.tools.pickaxes.Pickaxe;
import org.example.tools.pickaxes.StonePickaxe;
import org.example.tools.hoes.Hoe;
import org.example.tools.hoes.StoneHoe;
import org.example.tools.shovels.Shovel;
import org.example.tools.shovels.StoneShovel;

public class StoneToolsFactory implements ToolFactory {

    /**
     * Returns a new {@link StoneAxe}
     * @return a new {@link StoneAxe}
     */
    @Override
    public Axe createAxe() {
        return new StoneAxe();
    }

    /**
     * Returns a new {@link StonePickaxe}
     * @return a new {@link StonePickaxe}
     */
    @Override
    public Pickaxe createPickaxe() {
        return new StonePickaxe();
    }

    /**
     * Returns a new {@link StoneHoe}
     * @return a new {@link StoneHoe}
     */
    @Override
    public Hoe createHoe() {
        return new StoneHoe();
    }

    /**
     * Returns a new {@link StoneShovel}
     * @return a new {@link StoneShovel}
     */
    @Override
    public Shovel createShovel() {
        return new StoneShovel();
    }
}