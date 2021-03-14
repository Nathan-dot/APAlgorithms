package frq.cs2009;

public class Sample {
    private double[][] amps;
    public Sample(int n) {
        amps = new double[n][n];
        for(double[] r : amps) {
            for(int k = 0; k < n; k++) {
                r[k] = Math.random();
                System.out.println(r[k]);
            }
        }
        System.out.println(amps[4][0]);
    }
    public double get(int j, int k) {
        return amps[j][k];
    }
}
