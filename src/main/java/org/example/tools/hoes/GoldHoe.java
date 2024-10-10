package org.example.tools.hoes;

public class GoldHoe implements Hoe {

    /**
     * Returns the time that {@link GoldHoe} takes to plow the block
     * @return ""The gold hoe takes 0.3 seconds plowing the floor"
     */
    @Override
    public String plow() {
        return "The gold hoe takes 0.3 seconds plowing the floor";
    }

    /**
     * Returns the extra items given by the {@link GoldHoe}
     * @return "The gold hoe don't give you an extra items"
     */
    @Override
    public String harvest() {
        return "The gold hoe don't give you extra items";
    }
}
