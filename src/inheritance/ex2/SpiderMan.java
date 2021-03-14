package inheritance.ex2;

public class SpiderMan extends SuperHero {
    private int web;

    public SpiderMan() {
        super();
        this.web = 0;
    }

    public SpiderMan(int web) {
        super("Peter Parker", 17);
        this.web = web;
    }

    public SpiderMan(int attackPoint, int healthPoint, int web) {
        super("Peter Parker", 17, attackPoint, healthPoint);
        this.web = web;
    }

    @Override
    public void fight() {
        System.out.println(getName() + " is fighting with " + web + " web.");
    }

    public int getWeb() {
        return web;
    }

    public void setWeb(int web) {
        this.web = web;
    }
}
