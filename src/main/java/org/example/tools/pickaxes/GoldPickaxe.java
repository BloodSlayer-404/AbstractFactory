package org.example.tools.pickaxes;

public class GoldPickaxe implements Pickaxe {

    /**
     * Returns the time that {@link GoldPickaxe} takes to plow the block
     * @return "The gold pickaxe takes 0.65 seconds breaking the block"
     */
    @Override
    public String mine() {
       return "The gold pickaxe takes 0.65 seconds breaking the block";
    }


    /**
     * Returns the extra items given by the {@link GoldPickaxe}
     * @return "The gold pickaxe gives you 1 extra minerals"
     */
    @Override
    public String dropMineral() {
        return "The gold pickaxe gives you 1 extra minerals";
    } 
}
