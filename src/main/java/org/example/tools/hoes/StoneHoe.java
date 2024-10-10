package org.example.tools.hoes;

public class StoneHoe implements Hoe {

    /**
     * Returns the time that {@link StoneHoe} takes to plow the block
     * @return "The stone hoe takes 2 seconds plowing the floor"
     */
    @Override
    public String plow() {
        return "The stone hoe takes 2 seconds plowing the floor";
    }

    /**
     * Returns the extra items given by the {@link StoneHoe}
     * @return "The stone hoe gives you 1 extra items"
     */
    @Override
    public String harvest() {
        return "The stone hoe gives you 1 extra items";
    }
}
