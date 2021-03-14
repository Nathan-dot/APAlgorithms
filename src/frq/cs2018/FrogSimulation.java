package frq.cs2018;

public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    int hopDistance = 0;

    public FrogSimulation(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        hopDistance += goalDistance;
        return hopDistance;
    }

    public boolean simulate() {
        int frogPosition = 0;
        int hops = maxHops;

        while(frogPosition < goalDistance && frogPosition >= 0 && hops > 0) {
            frogPosition += hopDistance();
            hops--;
        }
        if(frogPosition >= goalDistance) {
            return true;
        }
        return false;
    }

    public double runSimulations(int num) {
        int count = 0;
        for(int i = 0; i <= num; i++) {
            if(simulate() == true) {
                count++;
            }
        }
        return count/num;
    }
}
