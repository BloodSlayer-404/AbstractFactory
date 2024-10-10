package org.example.tools.shovels;

public class IronShovel implements Shovel {

    /**
     * Returns the time that {@link IronShovel} takes to plow the block
     * @return "The iron shovel takes 0.15 seconds digging"
     */
    @Override
    public String dig() {
        return "The iron shovel takes 0.15 seconds digging";
    }

    /**
     * Returns the extra items given by the {@link IronShovel}
     * @return "The iron shovel makes a nice path"
     */
    @Override
    public String makePath() {
        return "The iron shovel makes a nice path";
    }
}
