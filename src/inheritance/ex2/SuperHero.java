package inheritance.ex2;
// Marvel
// abstract class: (without subclasses, there's no need for abstract class)
// - no instance (cannot create an instance (object))
// - can have abstract methods
//      - abstract method: method without the body
public abstract class SuperHero {
    // instance variables
    private String name;
    private int age;
    private int healthPoint;
    private int attackPoint;

    // default constructor: no arguments constructor
    public SuperHero() {
        this.name = "SuperHero";
        this.age = 0;
        this.healthPoint = 0;
        this.attackPoint = 0;
    }

    // "method overloading" : same method name, different set of parameters
    public SuperHero(String name, int age) {
        this.name = name;
        this.age = age;
        this.healthPoint = 100;
        this.attackPoint = 100;
    }

    // constructor: call this method to create an instance(object) of SuperHero
    // - initialize instance variables
    public SuperHero(String name, int age, int healthPoint, int attackPoint) {
        this.name = name;
        this.age = age;
        this.healthPoint = healthPoint;
        this.attackPoint = attackPoint;
    }

    // methods
    public abstract void fight();

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
}
