package org.example.tools.pickaxes;

public class IronPickaxe implements Pickaxe {

    /**
     * Returns the time that {@link IronPickaxe} takes to plow the block
     * @return "The iron pickaxe takes 1.25 seconds breaking the block"
     */
    @Override
    public String mine() {
        return "The iron pickaxe takes 1.25 seconds breaking the block";
    }

    /**
     * Returns the extra items given by the {@link IronPickaxe}
     * @return "The iron pickaxe gives you 3 extra minerals"
     */
    @Override
    public String dropMineral() {
        return "The iron pickaxe gives you 3 extra minerals";
    }
}