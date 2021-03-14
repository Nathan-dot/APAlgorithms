package frq.cs2016;
import java.util.List;
import java.util.ArrayList;

public class SystemLog {
    private List<LogMessage> messageList;

    public List<LogMessage> removeMessages(String keyword) {
        ArrayList<LogMessage> removedMessages = new ArrayList<LogMessage>();
        for(int i = 0; i < messageList.size(); i++) {
            if(messageList.get(i).containsWord(keyword)) {
                removedMessages.add(messageList.get(i));
                i--;
            }
        }
        return removedMessages;
    }
}
