package org.example;

import org.example.factories.IronToolsFactory;
import org.example.tools.axes.IronAxe;
import org.example.tools.pickaxes.IronPickaxe;
import org.example.tools.hoes.IronHoe;
import org.example.tools.shovels.IronShovel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IronToolsFactoryTest {

    private IronToolsFactory ironToolsFactory;

    @BeforeEach
    void setUp() {
        ironToolsFactory = new IronToolsFactory();
    }

    /**
     * Checks if the {@link IronToolsFactory} returns a {@link IronAxe}
     * and checks the values returned by the methods of the {@link IronAxe}
     */
    @Test
    void createAxe() {
        assertEquals("The iron axe deals 6 points of damage", ironToolsFactory.createAxe().attack());
        assertEquals("The iron axe cuts the block 0.65 seconds", ironToolsFactory.createAxe().cut());
    }

    /**
     * Checks if the {@link IronToolsFactory} returns a {@link IronPickaxe}
     * and checks the values returned by the methods of the {@link IronPickaxe}
     */
    @Test
    void createPickaxe() {
        assertEquals("The iron pickaxe gives you 3 extra minerals", ironToolsFactory.createPickaxe().dropMineral());
        assertEquals("The iron pickaxe takes 1.25 seconds breaking the block", ironToolsFactory.createPickaxe().mine());
    }

    /**
     * Checks if the {@link IronToolsFactory} returns a {@link IronHoe}
     * and checks the values returned by the methods of the {@link IronHoe}
     */
    @Test
    void createHoe() {
        assertEquals("The iron hoe takes 1 seconds plowing the floor", ironToolsFactory.createHoe().plow());
        assertEquals("The iron hoe gives you 3 extra items", ironToolsFactory.createHoe().harvest());
    }

    /**
     * Checks if the {@link IronToolsFactory} returns a {@link IronShovel}
     * and checks the values returned by the methods of the {@link IronShovel}
     */
    @Test
    void createShovel() {
        assertEquals("The iron shovel takes 0.15 seconds digging", ironToolsFactory.createShovel().dig());
        assertEquals("The iron shovel makes a nice path", ironToolsFactory.createShovel().makePath());
    }
}