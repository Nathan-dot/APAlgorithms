package frq.cs2010;
import java.util.List;
import java.util.ArrayList;

public class MasterOrder {
    private List<CookieOrder> orders;

    public MasterOrder() {
        orders = new ArrayList<CookieOrder>();
    }

    public void addOrder(CookieOrder theOrder) {
        orders.add(theOrder);
    }

    public int getTotalBoxes() {
        int count = 0;
        for(CookieOrder order : orders) {
            count += order.getNumBoxes();
        }
        return count;
     }

    public int removeVariety(String cookieVar) {
        int boxremoved = 0;
        for(int i = orders.size()-1; i >= 0; i--) {
            if(cookieVar.equals(orders.get(i).getVariety())) {
                boxremoved += orders.remove(i).getNumBoxes();
            }
        }
        return boxremoved;
    }
}
