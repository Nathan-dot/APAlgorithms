package frq.cs2012;

public class ActualHorse implements Horse {
    private String name;
    private int weight;

    public ActualHorse(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }



}
