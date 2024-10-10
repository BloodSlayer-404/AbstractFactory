package org.example.entities;

import org.example.Enemy;

public class Bogged implements Enemy{

    @Override
    public String attack() {
        return "The bogged shoots poison arrows to the player";
    }

    @Override
    public String jump() {
        return "The bogged jumps half a block";
    }

    @Override
    public String move() {
        return "The bogged walks away from the player";
    }

    @Override
    public String die() {
        return "The bogged drops mushrooms and poison arrows";
    }

}
