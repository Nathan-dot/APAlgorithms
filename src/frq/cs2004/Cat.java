package frq.cs2004;

public class Cat extends Pet {

    public Cat(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
