package org.example.tools.axes;

public class GoldAxe implements Axe{

    /**
     * Returns the time that {@link GoldAxe} takes to break the block
     * @return "The gold axe cuts the block 0.35 seconds"
     */
    @Override
    public String cut() {
        return "The gold axe cuts the block 0.35 seconds";
    }

    /**
     * Returns the damage dealt  by the {@link GoldAxe}
     * @return "The gold axe deals 4 points of damage"
     */
    @Override
    public String attack() {
        return "The gold axe deals 4 points of damage";
    }
}
