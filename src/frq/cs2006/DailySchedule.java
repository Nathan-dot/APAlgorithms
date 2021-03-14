package frq.cs2006;

import java.util.ArrayList;

public class DailySchedule {
    private ArrayList apptList;

    public DailySchedule() {
        apptList = new ArrayList();
    }

    public void clearConflicts(Appointment appt) {
        int a = 0;
        while(a < apptList.size()) {
            if(((Appointment)apptList.get(a)).conflictsWith(appt)) {
                apptList.remove(a);
            }
            else{
                a++;
            }
        }
    }

    public boolean addAppt(Appointment appt, boolean emergency) {
        if(emergency) {
            clearConflicts(appt);
            apptList.add(appt);
            return true;
        }
        for(int i = 0; i < apptList.size(); i++) {
            if(((Appointment)apptList.get(i)).conflictsWith(appt)) {
                return false;
            }
        }
        apptList.add(appt);
        return true;
    }

}
