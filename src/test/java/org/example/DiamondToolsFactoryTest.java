package org.example;

import org.example.factories.DiamondToolsFactory;
import org.example.tools.axes.DiamondAxe;
import org.example.tools.pickaxes.DiamondPickaxe;
import org.example.tools.hoes.DiamondHoe;
import org.example.tools.shovels.DiamondShovel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiamondToolsFactoryTest {

    private DiamondToolsFactory diamondToolsFactory;

    @BeforeEach
    void setUp() {
        diamondToolsFactory = new DiamondToolsFactory();
    }

    /**
     * Checks if the {@link DiamondToolsFactory} returns a {@link DiamondAxe}
     * and checks the values returned by the methods of the {@link DiamondAxe}
     */
    @Test
    void createAxe() {
        assertEquals("The diamond axe deals 7 points of damage", diamondToolsFactory.createAxe().attack());
        assertEquals("The diamond axe cuts the block 0.5 seconds", diamondToolsFactory.createAxe().cut());
    }

    /**
     * Checks if the {@link DiamondToolsFactory} returns a {@link DiamondPickaxe}
     * and checks the values returned by the methods of the {@link DiamondPickaxe}
     */
    @Test
    void createPickaxe() {
        assertEquals("The diamond pickaxe gives you 4 extra minerals", diamondToolsFactory.createPickaxe().dropMineral());
        assertEquals("The diamond pickaxe takes 0.95 seconds breaking the block", diamondToolsFactory.createPickaxe().mine());
    }

    /**
     * Checks if the {@link DiamondToolsFactory} returns a {@link DiamondHoe}
     * and checks the values returned by the methods of the {@link DiamondHoe}
     */
    @Test
    void createHoe() {
        assertEquals("The diamond hoe takes 0.5 seconds plowing the floor", diamondToolsFactory.createHoe().plow());
        assertEquals("The diamond hoe gives you 4 extra items", diamondToolsFactory.createHoe().harvest());
    }

    /**
     * Checks if the {@link DiamondToolsFactory} returns a {@link DiamondShovel}
     * and checks the values returned by the methods of the {@link DiamondShovel}
     */
    @Test
    void createShovel() {
        assertEquals("The diamond shovel takes 0.1 seconds digging", diamondToolsFactory.createShovel().dig());
        assertEquals("The diamond shovel makes an exceptional path", diamondToolsFactory.createShovel().makePath());
    }
}