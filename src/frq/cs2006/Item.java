package frq.cs2006;

public interface Item {
    double purchasePrice();
}
abstract class TaxableItem implements Item {
    private double taxRate;
    public abstract double getListPrice();
    public TaxableItem(double rate) {
        taxRate = rate;
    }
    public double purchasePrice() {
        return getListPrice() * (taxRate + 1.0);
    }
}


