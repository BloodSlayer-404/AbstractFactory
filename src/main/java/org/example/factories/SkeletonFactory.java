package org.example.factories;

import org.example.Enemy;
import org.example.entities.Skeleton;

public class SkeletonFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Skeleton();
    }
}
