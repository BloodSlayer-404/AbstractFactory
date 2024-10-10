package org.example.tools.shovels;

public class StoneShovel implements Shovel {

    /**
     * Returns the time that {@link StoneShovel} takes to plow the block
     * @return "The stone shovel takes 0.2 seconds digging"
     */
    @Override
    public String dig() {
        return "The stone shovel takes 0.2 seconds digging";
    }

    /**
     * Returns the extra items given by the {@link StoneShovel}
     * @return "The stone shovel makes a simple path"
     */
    @Override
    public String makePath() {
        return "The stone shovel makes a simple path";
    }
}
