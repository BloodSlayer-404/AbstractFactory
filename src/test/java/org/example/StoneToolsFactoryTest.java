package org.example;

import org.example.factories.StoneToolsFactory;
import org.example.tools.axes.StoneAxe;
import org.example.tools.pickaxes.StonePickaxe;
import org.example.tools.hoes.StoneHoe;
import org.example.tools.shovels.StoneShovel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneToolsFactoryTest {

    private StoneToolsFactory stoneToolsFactory;

    @BeforeEach
    void setUp() {
        stoneToolsFactory = new StoneToolsFactory();
    }

    /**
     * Checks if the {@link StoneToolsFactory} returns a {@link StoneAxe}
     * and checks the values returned by the methods of the {@link StoneAxe}
     */
    @Test
    void createAxe() {
        assertEquals("The stone axe deals 5 points of damage", stoneToolsFactory.createAxe().attack());
        assertEquals("The stone axe cuts the block 0.95 seconds", stoneToolsFactory.createAxe().cut());
    }

    /**
     * Checks if the {@link StoneToolsFactory} returns a {@link StonePickaxe}
     * and checks the values returned by the methods of the {@link StonePickaxe}
     */
    @Test
    void createPickaxe() {
        assertEquals("The stone pickaxe gives you 2 extra minerals", stoneToolsFactory.createPickaxe().dropMineral());
        assertEquals("The stone pickaxe takes 1.9 seconds breaking the block", stoneToolsFactory.createPickaxe().mine());
    }

    /**
     * Checks if the {@link StoneToolsFactory} returns a {@link StoneHoe}
     * and checks the values returned by the methods of the {@link StoneHoe}
     */
    @Test
    void createHoe() {
        assertEquals("The stone hoe takes 2 seconds plowing the floor", stoneToolsFactory.createHoe().plow());
        assertEquals("The stone hoe gives you 1 extra items", stoneToolsFactory.createHoe().harvest());
    }

    /**
     * Checks if the {@link StoneToolsFactory} returns a {@link StoneShovel}
     * and checks the values returned by the methods of the {@link StoneShovel}
     */
    @Test
    void createShovel() {
        assertEquals("The stone shovel takes 0.2 seconds digging", stoneToolsFactory.createShovel().dig());
        assertEquals("The stone shovel makes a simple path", stoneToolsFactory.createShovel().makePath());
    }
}