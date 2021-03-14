package frq.cs2006;

public class Vehicle extends TaxableItem {
    private double dealerCost;
    private double dealerMarkUp;
    private double taxrate;
    public Vehicle(double dealerCost, double dealerMarkUp, double taxrate) {
        super(taxrate);
        this.dealerCost = dealerCost;
        this.dealerMarkUp = dealerMarkUp;
    }

    @Override
    public double getListPrice() {
        return dealerCost + dealerMarkUp;
    }

    public void changeMarkup(double markup) {
        dealerMarkUp = markup;
    }
}
