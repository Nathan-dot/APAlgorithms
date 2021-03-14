package frq.cs2011;
import java.util.List;
import static java.lang.Math.abs;


public class FuelDepot {
    private FuelRobot filler;
    private List<FuelTank> tanks;

    public FuelDepot(FuelRobot filler, List<FuelTank> tanks) {
        this.filler = filler;
        this.tanks = tanks;
    }

    public int nextTankToFill(int threshold) {
        int least = 0;
        for(int i = 0; i < tanks.size(); i++) {
            if(tanks.get(i).getFuelLevel() < tanks.get(least).getFuelLevel()) {
                least = i;
            }
        }
        if(tanks.get(least).getFuelLevel() <= threshold) {
            return least;
        }
        else{
            return filler.getCurrentIndex();
        }
    }

    public void moveToLocation(int locIndex) {
        if(locIndex < filler.getCurrentIndex() && filler.isFacingRight()) {
            filler.changeDirection();
        }
        else if(locIndex > filler.getCurrentIndex() && !filler.isFacingRight()){
            filler.changeDirection();
        }
        filler.moveForward(abs(locIndex - filler.getCurrentIndex()));
    }
}
