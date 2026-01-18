import java.util.HashMap;
import java.util.Map;

public class NotificationService {

    private final Map<Integer, NotificationSender> senders = new HashMap<>();

    public void registerSender(int type, NotificationSender sender) {
        senders.put(type, sender);
    }

    public void envoyer(String message, int choix) {
        NotificationSender sender = senders.get(choix);
        if (sender != null) {
            sender.send(message);
        } else {
            System.out.println("Type de notification inconnu");
        }
    }
}