package org.example.factories;

import org.example.Enemy;
import org.example.entities.Bogged;

public class BoggedFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Bogged();
    }
}
