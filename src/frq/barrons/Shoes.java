package frq.barrons;

public class Shoes implements ClothingItem {
    private String description;
    private double price;
    public Shoes(String description, double price) {
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
