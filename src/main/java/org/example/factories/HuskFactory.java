package org.example.factories;

import org.example.Enemy;
import org.example.entities.Husk;

public class HuskFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Husk();
    }
}
