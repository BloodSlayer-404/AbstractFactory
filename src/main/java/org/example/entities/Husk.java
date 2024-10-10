package org.example.entities;

import org.example.Enemy;

public class Husk implements Enemy{

    @Override
    public String attack() {
        return "The husk bites the player";
    }

    @Override
    public String jump() {
        return "The husk jumps half a block";
    }

    @Override
    public String move() {
        return "The husk limps towards the player";
    }

    @Override
    public String die() {
        return "The husk drops rotten flesh";
    }
    
}
