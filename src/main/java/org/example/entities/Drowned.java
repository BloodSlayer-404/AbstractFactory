package org.example.entities;

import org.example.Enemy;

public class Drowned implements Enemy{

    @Override
    public String attack() {
        return "The drowned hits the player with a trident";
    }

    @Override
    public String jump() {
        return "The drowned swims to the surface";
    }

    @Override
    public String move() {
        return "The drowned swims towards the player";
    }

    @Override
    public String die() {
        return "The drowned drops copper ingots";
    }
    
}
