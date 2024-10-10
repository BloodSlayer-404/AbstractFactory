package org.example.entities;

import org.example.Enemy;

public class Zombie implements Enemy{

    @Override
    public String attack() {
        return "The zombie scratches the player";
    }

    @Override
    public String jump() {
        return "The zombie jumps a block";
    }

    @Override
    public String move() {
        return "The zombie walks towards the player";
    }

    @Override
    public String die() {
        return "The zombie drops rotten flesh";
    }
    
}
