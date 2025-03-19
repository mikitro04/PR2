import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ContoCorrente conto = new ContoCorrente(50000, 123456789);

        double input = 0;   

        while(input == 0){
            System.out.printf("\n\nScegli cosa fare:\n[0] esci\n[1]Preleva\n[2]Deposita\n-> ");
            input = scanner.nextDouble();

            switch ((int)input) {
                case 0:
                    return;
                case 1:
                    System.out.printf("Inserisci quanto prelevare: ");
                    input = scanner.nextDouble();
                    conto.preleva(input);
                    break;
                case 2:
                    System.out.printf("Inserisci quanto depositare: ");
                    input = scanner.nextDouble();
                    conto.deposita(input);
                    break;
                default:
                    System.out.printf("Inserisci una opzione valida!!");
                    break;
            }
            input = 0;
            conto.visualizzaSaldo();
            
        }

        scanner.close();
        System.out.printf("\n\n\n");
    }
}
