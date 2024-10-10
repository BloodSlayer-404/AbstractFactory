package org.example.tools.shovels;

public class DiamondShovel implements Shovel {

    /**
     * Returns the time that {@link DiamondShovel} takes to plow the block
     * @return "The diamond shovel takes 0.1 seconds digging"
     */
    @Override
    public String dig() {
        return "The diamond shovel takes 0.1 seconds digging";
    }

    /**
     * Returns the extra items given by the {@link DiamondShovel}
     * @return "The diamond shovel makes an exceptional path"
     */
    @Override
    public String makePath() {
        return "The diamond shovel makes an exceptional path";
    }
}
