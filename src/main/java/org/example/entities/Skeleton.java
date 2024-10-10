package org.example.entities;

import org.example.Enemy;

public class Skeleton implements Enemy{

    @Override
    public String attack() {
        return "The skeleton shoots arrows to the player";
    }

    @Override
    public String jump() {
        return "The skeleton jumps a block";
    }

    @Override
    public String move() {
        return "The skeleton moves away from the player";
    }

    @Override
    public String die() {
        return "The skeleton drops bones and arrows";
    }
    
}
