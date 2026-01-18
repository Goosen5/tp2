import java.util.Scanner;

public class MainIsp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Imprimer");
            System.out.println("2. Scanner");
            System.out.println("3. Faxer");
            System.out.println("0. Quitter");
            System.out.print("Choix fonctionnalité : ");

            int fonction = lireEntier(scanner);
            if (fonction == 0) break;

            System.out.println("\nChoisir la machine :");
            System.out.println("1. Imprimante simple");
            System.out.println("2. Imprimante multifonction");
            System.out.print("Choix machine : ");

            int machineChoisie = lireEntier(scanner);

            switch (machineChoisie) {
                case 1:
                    if (fonction == 1) {
                        Imprimante imprimante = new ImprimanteSimple();
                        imprimante.print();
                    } else {
                        System.out.println("Fonctionnalité non supportée par cette machine");
                    }
                    break;
                case 2:
                    ImprimanteMultifonction imprimanteMultifonction = new ImprimanteMultifonction();
                    switch (fonction) {
                        case 1: imprimanteMultifonction.print(); break;
                        case 2: imprimanteMultifonction.scan(); break;
                        case 3: imprimanteMultifonction.fax(); break;
                        default: System.out.println("Fonction inconnue");
                    }
                    break;
                default:
                    System.out.println("Machine inconnue");
            }
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