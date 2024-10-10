package org.example.factories;

import org.example.Enemy;
import org.example.entities.Zombie;

public class ZombieFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Zombie();
    }
}