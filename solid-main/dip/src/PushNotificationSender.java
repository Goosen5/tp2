public class PushNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Notification push envoyée : " + message);
    }
}