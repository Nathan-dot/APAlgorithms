package frq.cs2012;
import java.util.ArrayList;
import java.util.List;
public class ClimbingClub {
    private List<ClimbInfo> climbList;

    public ClimbingClub() {
        climbList = new ArrayList<ClimbInfo>();
    }

    public List<ClimbInfo> getClimbList() {
        return climbList;
    }

    public void addClimb(String peakName, int climbTime) {
        climbList.add(new ClimbInfo(peakName, climbTime));
//        int i = 0;
//        while(i < climbList.size() && peakName.compareTo(climbList.get(i).getName()) > 0) {
//            i++;
//        }
//        climbList.add(i, new ClimbInfo(peakName, climbTime));
    }

    public int distinctPeakNames()
    {
        if (climbList.size() == 0)
        {
            return 0;
        }
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;
        for (int k = 1; k < climbList.size(); k++)
        {
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if (prevName.compareTo(currName) != 0)
            {
                numNames++;
                prevName = currName;
            }
        }
        return numNames;
    }








//    public int distinctPeakNames() {
//        for(int i = 0; i < climbList.size(); i++) {
//            while(climbList[i] == )
//        }
//    }
    // ClimbingClub:
    // (i) No. The shown distinctPeakNames code only compares adjacent climbList peakNames instead of comparing one element with the entire List
    // (ii) Yes. If the List is sorted, the only comparison that needs to occur is the one between adjacent elements.
    // i.e.: Everest, Everest, Kilamanjaro
}
