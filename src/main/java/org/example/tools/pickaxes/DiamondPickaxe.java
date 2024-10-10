package org.example.tools.pickaxes;

public class DiamondPickaxe implements Pickaxe {

    /**
     * Returns the time that {@link DiamondPickaxe} takes to plow the block
     * @return "The diamond pickaxe takes 0.95 seconds breaking the block"
     */
    @Override
    public String mine() {
        return "The diamond pickaxe takes 0.95 seconds breaking the block";
    }

    /**
     * Returns the extra items given by the {@link DiamondPickaxe}
     * @return "The diamond pickaxe gives you 4 extra minerals"
     */
    @Override
    public String dropMineral() {
        return "The diamond pickaxe gives you 4 extra minerals";
    }
}
