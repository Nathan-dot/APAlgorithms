package frq.barrons;

public class Outfit implements ClothingItem {
    private Shoes shoes;
    private Pants pants;
    private Top top;
    public Outfit(Shoes shoes, Pants pants, Top top) {
        ClothingItem outfit = new Outfit(shoes, pants, top);
    }
    @Override
    public String getDescription() {
        String[] a = new String[10];
        return shoes.getDescription() + "/" + pants.getDescription() + "/" + top.getDescription() + " " + "outfit";
    }

    @Override
    public double getPrice() {
        double discount = 0;
         if(shoes.getPrice() + pants.getPrice() >= 100 || pants.getPrice() + top.getPrice() >= 100 || top.getPrice() + shoes.getPrice() >= 100) {
             discount = 0.75;
         }
         else{
             discount = 0.9;
         }
         return (shoes.getPrice() + pants.getPrice() + top.getPrice()) * discount;
    }
}
