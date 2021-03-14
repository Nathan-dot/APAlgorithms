package frq.cs2011;

public class Sound {
    private int[] samples;

    public Sound(int[] samples) {
        this.samples = samples;
    }

    public int limitAmplitude(int limit) {
        int count = 0;
        for(int i = 0; i < samples.length; i++) {
            if(samples[i] > limit) {
                samples[i] = limit;
                count++;
            }
            if(samples[i] < limit * -1) {
                samples[i] = limit * -1;
                count++;
            }
        }
        return count;
    }

    public void trimSilenceFromBeginning() {
        int count = 0;
        for(int i = 0; i < samples.length; i++) {
            if(samples[i] != 0) {
                break;
            }
            if(samples[i] == 0) {
                count++;
            }

        }
        int[] sample = new int[samples.length - count];
        for(int i = 0; i < samples.length - count; i++) {
            sample[i] = samples[count];
        }
    }
}
