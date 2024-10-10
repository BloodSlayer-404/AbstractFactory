package org.example.tools.axes;

public class IronAxe implements Axe{

    /**
     * Returns the time that {@link IronAxe} takes to break the block
     * @return "The iron axe cuts the block 0.65 seconds"
     */
    @Override
    public String cut() {
        return "The iron axe cuts the block 0.65 seconds";
    }

    /**
     * Returns the damage dealt  by the {@link IronAxe}
     * @return "The iron axe deals 6 points of damage";
     */
    @Override
    public String attack() {
        return "The iron axe deals 6 points of damage";
    }
}
