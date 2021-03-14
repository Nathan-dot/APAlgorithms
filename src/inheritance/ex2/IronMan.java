package inheritance.ex2;

public class IronMan extends SuperHero implements Flyable {
    private int numOfSuits;

    public IronMan(int healthPoint, int attackPoint, int numOfSuits) {
        // "subclass constructor must call super class' constructor"
        super("Tony Stark", 40, healthPoint, attackPoint);
        this.numOfSuits = numOfSuits;
    }

    @Override
    public void fly() {

    }

    @Override
    public int getFuel() {
        return 0;
    }

    @Override
    public void fight() {
        // "method overriding" : superclass and subclass
        // we can override super class's methods.
        System.out.println(getName() + " is fighting with " + numOfSuits + " suits.");
    }

    public int getNumOfSuits() {
        return numOfSuits;
    }

    public void setNumOfSuits(int numOfSuits) {
        this.numOfSuits = numOfSuits;
    }
}

