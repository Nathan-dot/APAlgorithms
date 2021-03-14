package frq.cs2011;

import java.util.List;

public class ActualRobot implements FuelRobot {
    private int currentIndex;
    private boolean facingRight;

    public ActualRobot(int currentIndex, boolean facingRight) {
        this.currentIndex = currentIndex;
        this.facingRight = facingRight;
    }

    @Override
    public int getCurrentIndex() {
        return currentIndex;
    }

    @Override
    public boolean isFacingRight() {
        return facingRight;
    }

    @Override
    public void changeDirection() {
        facingRight = !facingRight;
    }

    @Override
    public void moveForward(int numLocs) {
        currentIndex = currentIndex + numLocs;
    }
}
