package frq.barrons;

public abstract class Bird {
    private String name;
    private String noise;

    public Bird(String birdName, String birdNoise) {
        name = birdName;
        noise = birdNoise;
    }

    public String getName() {
        return name;
    }

    public String getNoise() {
        return noise;
    }

    public abstract String getFood();
}
