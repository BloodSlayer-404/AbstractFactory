package org.example.tools.pickaxes;

public class StonePickaxe implements Pickaxe {

    /**
     * Returns the time that {@link StonePickaxe} takes to plow the block
     * @return "The stone pickaxe takes 1.9 seconds breaking the block"
     */
    @Override
    public String mine() {
        return "The stone pickaxe takes 1.9 seconds breaking the block";
    }

    /**
     * Returns the extra items given by the {@link StonePickaxe}
     * @return "The stone pickaxe gives you 2 extra minerals"
     */
    @Override
    public String dropMineral() {
        return "The stone pickaxe gives you 2 extra minerals";
    }
}
