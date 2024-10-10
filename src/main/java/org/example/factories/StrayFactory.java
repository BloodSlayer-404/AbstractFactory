package org.example.factories;

import org.example.Enemy;
import org.example.entities.Stray;

public class StrayFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Stray();
    }
}
