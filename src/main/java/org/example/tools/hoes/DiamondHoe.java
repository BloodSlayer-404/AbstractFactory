package org.example.tools.hoes;

public class DiamondHoe implements Hoe {

    /**
     * Returns the time that {@link DiamondHoe} takes to plow the block
     * @return "The diamond hoe takes 0.5 seconds plowing the floor"
     */
    @Override
    public String plow() {
        return "The diamond hoe takes 0.5 seconds plowing the floor";
    }

    /**
     * Returns the extra items given by the {@link DiamondHoe}
     * @return "The diamond hoe gives you 4 extra items"
     */
    @Override
    public String harvest() {
        return "The diamond hoe gives you 4 extra items";
    }
}
