

package PROJECT;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MessageManager {
    private static List<Message> messages = new ArrayList<>();

    public static void addMessage(Message message) {
        messages.add(message);
    }

    public static List<Message> getMessagesForUser(String username) {
        return messages.stream()
                       .filter(message -> message.getReceiver().equalsIgnoreCase(username))
                       .collect(Collectors.toList());
    }
}
