package frq.cs2016;

public class Driver {
    public static void main(String[] args) {
        LogMessage logMessage = new LogMessage("Webserver:error on/dev/disk");
        System.out.println(logMessage.getMachineId());
        System.out.println(logMessage.getDescription());
        System.out.println(logMessage.containsWord("disk"));

    }

    String[] wordArray = {"wheels", "on", "the", "bus"};
    RandomStringChooser test = new RandomStringChooser(wordArray);

}
