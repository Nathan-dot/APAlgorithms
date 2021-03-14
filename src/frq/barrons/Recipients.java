package frq.barrons;

import java.util.ArrayList;
import java.util.List;

public class Recipients {
    private List<String> lines;

    public Recipients() {

    }

    public String extractCity(String cityZip) {
        int a = cityZip.indexOf(",");
        return cityZip.substring(0, a-2);
    }

    public void printNames() {
        ArrayList<String> a = new ArrayList<String>();
        for(int i = 0; i < lines.size(); i++) {
            if(i == 0) {
                a.add(lines.get(i));
            }
            else{
                if(lines.get(i-1).equals("")) {
                    a.add(lines.get(i));
                }
            }

        }

    }

    public String getAddress(String name) {
        boolean found = false;
        for(int i = 0; i < lines.size(); i++) {
            if(lines.get(i).equals(name)) {
                found = true;
            }
            if(found) {
                return lines.get(i+1) + "\n" + lines.get(i+2) + "\n" + lines.get(i+3) + "\n";
            }
        }
        return null;
    }

}
