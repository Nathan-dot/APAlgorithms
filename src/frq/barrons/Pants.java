package frq.barrons;

public class Pants implements ClothingItem{
    private String description;
    private double price;
    public Pants(String description, double price) {
        this.description = description;
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getDescription() {
        return description;
    }
}
