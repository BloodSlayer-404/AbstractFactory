package org.example.entities;

import org.example.Enemy;

public class Stray implements Enemy{

    @Override
    public String attack() {
        return "The stray shoots slowness arrows to the player";
    }

    @Override
    public String jump() {
        return "The stray jumps one and a quarter block";
    }

    @Override
    public String move() {
        return "The stray runs away from the player";
    }

    @Override
    public String die() {
        return "The stray drops bones and slowness arrows";
    }
    
}
