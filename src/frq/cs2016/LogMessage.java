package frq.cs2016;

public class LogMessage {
    private String machineId;
    private String description;

    public LogMessage(String message) {
        int colon = message.indexOf(":");
        machineId = message.substring(0, colon);
        description = message.substring(colon + 1);
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }

    public boolean containsWord(String keyword) {
        if (description.equals(keyword)) {
            return true;
        }
        if(description.indexOf(keyword + " ") == 0) {
            return true;
        }
        if(description.indexOf(" " + keyword + " ") != -1) {
            return true;
        }
        if(description.length() > keyword.length()) {
            if(description.substring(description.length()-keyword.length()-1).equals(" " + keyword)) {
                return true;
            }
        }
        return false;
    }
}
