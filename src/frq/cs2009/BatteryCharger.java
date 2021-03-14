package frq.cs2009;

public class BatteryCharger {
    private int[] rateTable;

    private int getChargingCost(int startHour, int chargeTime) {
        int price = 0;
        for (int i = startHour; i < startHour + chargeTime; i++) {
            price += rateTable[i % rateTable.length];
            // if you have to cycle back in an array(etc.), always consider modular operator(%)
        }
        return price;
    }

    public int getChargeStartTime(int chargeTime) {
        int cheapPrice = 0;

        for(int i = 1; i < rateTable.length; i++) {
            if(getChargingCost(i, chargeTime) < getChargingCost(i, cheapPrice)) {
                cheapPrice = chargeTime;
            }
        }
        return cheapPrice;
    }
}
