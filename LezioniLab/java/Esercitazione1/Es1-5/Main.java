public class Main {
    public static void main(String[] args) {
        Operazione op = new Operazione(10, 5);

        System.out.println("Somma: " + op.somma());
        System.out.println("Sottrazione: " + op.sottrazione());
        System.out.println("Moltiplicazione: " + op.moltiplicazione());

        try {
            System.out.println("Divisione: " + op.divisione());
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}