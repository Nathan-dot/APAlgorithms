//package exam;
//
//import java.util.ArrayList;
//
//public class OnlinePurchaseManager {
//    private ArrayList<Gizmo> purchases;
//
//    public int countElectronicsByMaker(String maker) {
//        int count = 0;
//        for(int i = 0; i < purchases.size()-1; i++) {
//            if(purchases.get(i).isElectronic() && purchases.get(i).getMaker().equals(maker)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public boolean hasAdjacentEqualPair() {
//        for(int i = 1; i < purchases.size(); i++) {
//            if(purchases.get(i).equals(purchases.get(i-1))) {
//                return true;
//            }
//        }
//        return false;
//    }
//}
// getCheapestGizmoMaker - returns least expensive Gizmo purchased from a maker
// public Gizmo getCheapestGizmoMaker() {}
// In making this method, I would implement similar logic to hasAdjacentEqualPair.
// Instead of returning a boolean I would naturally return a Gizmo. I would make a local Gizmo variable
// to store the lowest Gizmo and in the forloop, would continuously check each Gizmo's cost in the purchases
// ArrayList. If one's cost was lower, I would update the Gizmo variable. When the forloop breaks,
// I would return the final Gizmo in the local variable.

// In the Gizmo class, I would include in the constructor(for each Gizmo) an integer parameter called price
// and would create a getter method in the Gizmo class to return the price. This getter method
// would be used when iterating through the purchases list and comparing prices to find the lowest cost
// Gizmo. (the forloop's bounds would be the identical to the one in the hasAdjacentEqualPair() method)

