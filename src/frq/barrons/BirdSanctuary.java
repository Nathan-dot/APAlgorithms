package frq.barrons;

public class BirdSanctuary {
    private Bird[] birdList;

    public void allEat() {
        for(Bird a : birdList) {
            System.out.println(a.getName() + " " + a.getFood());
        }
    }
}
