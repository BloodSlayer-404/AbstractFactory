package org.example.tools.axes;

public class DiamondAxe implements Axe{

    /**
     * Returns the time that {@link DiamondAxe} takes to break the block
     * @return "The diamond axe cuts the block 0.5 seconds"
     */
    @Override
    public String cut() {
        return "The diamond axe cuts the block 0.5 seconds";
    }

    /**
     * Returns the damage dealt  by the {@link DiamondAxe}
     * @return "The diamond axe deals 7 points of damage"
     */
    @Override
    public String attack() {
        return "The diamond axe deals 7 points of damage";
    }
}
