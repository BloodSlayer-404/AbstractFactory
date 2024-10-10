package org.example.factories;

import org.example.Enemy;
import org.example.entities.Drowned;


/**
 *
 * @author Julian
 */
public class DrownedFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Drowned();
    }
}
