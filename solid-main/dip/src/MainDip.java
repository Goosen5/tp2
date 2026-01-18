import java.util.Scanner;

public class MainDip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NotificationService service = new NotificationService();

        // Enregistrement des différents types de notifications
        service.registerSender(1, new EmailSender());
        service.registerSender(2, new SmsSender());
        service.registerSender(3, new PushNotificationSender());

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Envoyer un email");
            System.out.println("2. Envoyer un SMS");
            System.out.println("3. Envoyer une notification push");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            int choix = lireEntier(scanner);
            if (choix == 0) break;

            System.out.print("Message : ");
            String message = scanner.nextLine();

            service.envoyer(message, choix);
        }

        scanner.close();
    }

    private static int lireEntier(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide : ");
            }
        }
    }
}