package inheritance.ex2;

public class Driver {
    public static void main(String[] args) {
        // SuperHero is an abstract class (no instance)
//        SuperHero iron = new SuperHero("Tony", 40, 100, 100);
//        iron.fight();
//        System.out.println(iron.getAge());
//        iron.setAge(38);
//        System.out.println(iron.getAge());


        SuperHero ironMan = new IronMan(100, 1000, 10);
        System.out.println(ironMan.getName());
        // DownCasting  (SuperHero superclass -> IronMan subclass)
        System.out.println(((IronMan) ironMan).getNumOfSuits());
        ironMan.fight();

        SuperHero sp1 = new SpiderMan();
        SuperHero sp2 = new SpiderMan(70);
        SpiderMan sp3 = new SpiderMan(100,1000, 50);

        sp1.fight();
        sp2.fight();
        sp3.fight();

        SuperHero[] heros = new SuperHero[10];
        heros[0] = ironMan;
        heros[1] = sp1;
        heros[2] = sp2;

        // * inheritance ("extends" super class)
        // - subclass must call super class' constructor
        //   (except when super class has a default constructor, Java automatically adds
        //    a default constructor with super(); in it)
        // - everything (except for private fields) can be accessed from subclasses
        // - you can even override methods from super class - ("method overriding")
        // - you can create many methods with the same name unless they have different set of
        //   parameters(arguments) - ("method overloading")
        // - method overloading example: many different constructors!
        // - inheritance creates "is-a" relationship.
        //   * IronMan "is-a" SuperHero


    }
}
