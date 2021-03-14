package frq.hwork2;

public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    private int totalHopDistance;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        totalHopDistance += goalDistance;
        return hopDistance();
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
        double count = 0;
        for(int i = 0; i < num-1; i++) {
            if(simulate()) {
                count++;
            }
        }
        return count/num;
    }
}
