package frq.cs2004;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "dogsound";
}
}
