package org.example.tools.shovels;

public class GoldShovel implements Shovel {

    /**
     * Returns the time that {@link GoldShovel} takes to plow the block
     * @return "The gold shovel takes 0.1 seconds digging"
     */
    @Override
    public String dig(){
        return "The gold shovel takes 0.1 seconds digging";
    }

    /**
     * Returns the extra items given by the {@link GoldShovel}
     * @return "The gold shovel makes a mediocre path"
     */
    @Override
    public String makePath() {
        return "The gold shovel makes a mediocre path";
    }
}
