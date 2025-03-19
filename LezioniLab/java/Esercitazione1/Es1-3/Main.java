import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Persona persona = new Persona("Michele", "Tronu", 20);
            Scanner scanner = new Scanner(System.in);
            String nomeAdd, cognomeAdd;
            int etaAdd;
            
            System.out.printf("Inserisci il nome: ");
            nomeAdd = scanner.nextLine();
            persona.setNome(nomeAdd);
            
            System.out.printf("Inserisci il cognome: ");
            cognomeAdd = scanner.nextLine();
            persona.setCognome(cognomeAdd);

            System.out.printf("Inserisci l'eta'");
            etaAdd = scanner.nextInt();
            persona.setEta(etaAdd);

            System.out.printf("\n\nNome: %s\nCognome: %s\nEta': %d\n\n", persona.getNome(), persona.getCognome(), persona.getEta());
            
            scanner.close();
        }
}
