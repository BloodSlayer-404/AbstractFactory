package org.example.tools.hoes;

public class IronHoe implements Hoe {

    /**
     * Returns the time that {@link IronHoe} takes to plow the block
     * @return "The iron hoe takes 1 seconds plowing the floor"
     */
    @Override
    public String plow() {
        return "The iron hoe takes 1 seconds plowing the floor";
    }

    /**
     * Returns the extra items given by the {@link IronHoe}
     * @return "The iron hoe gives you 3 extra items"
     */
    @Override
    public String harvest() {
        return "The iron hoe gives you 3 extra items";
    }
}
