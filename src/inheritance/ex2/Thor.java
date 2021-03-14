package inheritance.ex2;

public class Thor extends SuperHero implements Flyable {
    // if you don't provide any constructors, Java will provide default constructor
    // public Thor() {
    //     super(); // super class must have default constructor!
    // }

    @Override
    public void fight() {

    }

    @Override
    public void fly() {

    }

    @Override
    public int getFuel() {
        return 0;
    }
}
