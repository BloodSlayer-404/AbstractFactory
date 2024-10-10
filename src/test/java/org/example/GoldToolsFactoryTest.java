package org.example;

import org.example.factories.GoldToolsFactory;
import org.example.tools.axes.GoldAxe;
import org.example.tools.pickaxes.GoldPickaxe;
import org.example.tools.hoes.GoldHoe;
import org.example.tools.shovels.GoldShovel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldToolsFactoryTest {

    private GoldToolsFactory goldToolsFactory;

    @BeforeEach
    void setUp() {
        goldToolsFactory = new GoldToolsFactory();
    }

    /**
     * Checks if the {@link GoldToolsFactory} returns a {@link GoldAxe}
     * and checks the values returned by the methods of the {@link GoldAxe}
     */
    @Test
    void createAxe() {
        assertEquals("The gold axe deals 4 points of damage", goldToolsFactory.createAxe().attack());
        assertEquals("The gold axe cuts the block 0.35 seconds", goldToolsFactory.createAxe().cut());
    }

    /**
     * Checks if the {@link GoldToolsFactory} returns a {@link GoldPickaxe}
     * and checks the values returned by the methods of the {@link GoldPickaxe}
     */
    @Test
    void createPickaxe() {
        assertEquals("The gold pickaxe gives you 1 extra minerals", goldToolsFactory.createPickaxe().dropMineral());
        assertEquals("The gold pickaxe takes 0.65 seconds breaking the block", goldToolsFactory.createPickaxe().mine());
    }

    /**
     * Checks if the {@link GoldToolsFactory} returns a {@link GoldHoe}
     * and checks the values returned by the methods of the {@link GoldHoe}
     */
    @Test
    void createHoe() {
        assertEquals("The gold hoe takes 0.3 seconds plowing the floor", goldToolsFactory.createHoe().plow());
        assertEquals("The gold hoe don't give you extra items", goldToolsFactory.createHoe().harvest());
    }

    /**
     * Checks if the {@link GoldToolsFactory} returns a {@link GoldShovel}
     * and checks the values returned by the methods of the {@link GoldShovel}
     */
    @Test
    void createShovel() {
        assertEquals("The gold shovel takes 0.1 seconds digging", goldToolsFactory.createShovel().dig());
        assertEquals("The gold shovel makes a mediocre path", goldToolsFactory.createShovel().makePath());
    }
}