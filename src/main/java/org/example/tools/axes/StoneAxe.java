package org.example.tools.axes;

public class StoneAxe implements Axe{

    /**
     * Returns the time that {@link StoneAxe} takes to break the block
     * @return "The stone axe cuts the block 0.95 seconds";
     */
    @Override
    public String cut() {
        return "The stone axe cuts the block 0.95 seconds";
    }

    /**
     * Returns the damage dealt  by the {@link StoneAxe}
     * @return "The stone axe deals 5 points of damage"
     */
    @Override
    public String attack() {
        return "The stone axe deals 5 points of damage";
    }
}
