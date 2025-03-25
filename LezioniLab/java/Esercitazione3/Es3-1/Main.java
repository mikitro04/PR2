public class Main {
    public static void main(String[] args) {
        /*------------------ ESERCIZIO 1------------------ */
        // Creo uno Studente con costruttore con parametri
        Studente studente = new Studente("Mario", "Rossi", 21, 12345, 2021);
        
        // Creo un Docente con costruttore con parametri
        Docente docente = new Docente("Laura", "Bianchi", 40, "Matematica");

        // Output dati Studente
        System.out.println("STUDENTE:");
        System.out.println("Nome: " + studente.getNome());
        System.out.println("Cognome: " + studente.getCognome());
        System.out.println("Età: " + studente.getEta());
        System.out.println("Matricola: " + studente.getMatricola());
        System.out.println("Anno di iscrizione: " + studente.getAnnoDiIscrizione());

        System.out.println();

        // Output dati Docente
        System.out.println("DOCENTE:");
        System.out.println("Nome: " + docente.getNome());
        System.out.println("Cognome: " + docente.getCognome());
        System.out.println("Età: " + docente.getEta());
        System.out.println("Insegnamento: " + docente.getInsegnamento());

        /*------------------ ESERCIZIO 2 ------------------ */
        System.out.printf("+--------------------------------------------+\n");
        
        double prezzoBase = 100.0;

        Persona anziano = new Persona("Gianni", "Verdi", 72);
        Persona adulto = new Persona("Laura", "Bianchi", 55);
        Persona giovane = new Persona("Marco", "Neri", 35);
        
        Studente s1 = new Studente("Luca", "Rossi", 25, 1234, 2024); // < 30 anni → 0 euro
        Studente s2 = new Studente("Anna", "Bruni", 30, 4321, 2023); // iscritta da 2 anni → sconto 50%
        Studente s3 = new Studente("Elisa", "Neri", 30, 5678, 2020); // iscritta da 5 anni → calcolo Persona

        Docente d1 = new Docente("Mauro", "Bianchi", 45, "Informatica");

        System.out.printf("Anziano paga: %.2f€\n", anziano.calcolaCostoBiglietto(prezzoBase));
        System.out.printf("Adulto paga: %.2f€\n", adulto.calcolaCostoBiglietto(prezzoBase));
        System.out.printf("Giovane paga: %.2f€\n", giovane.calcolaCostoBiglietto(prezzoBase));

        System.out.printf("Studente <30 paga: %.2f€\n", s1.calcolaCostoBiglietto(prezzoBase));
        System.out.printf("Studente iscritto da 2 anni paga: %.2f€\n", s2.calcolaCostoBiglietto(prezzoBase));
        System.out.printf("Studente iscritto da 5 anni paga: %.2f€\n", s3.calcolaCostoBiglietto(prezzoBase));

        System.out.printf("Docente paga: %.2f€\n", d1.calcolaCostoBiglietto(prezzoBase));
        
        /*------------------ ESERCIZIO 3 ------------------ */
        System.out.printf("+--------------------------------------------+\n");

        Persona personaX = new Persona();
        personaX = studente;
        System.out.printf("personaX deve pagare %.2f€\n", personaX.calcolaCostoBiglietto(prezzoBase));
        /*personaX paga come uno studente con età < 30*/

        
        /*------------------ ESERCIZIO 4 ------------------ */
        System.out.printf("+--------------------------------------------+\n");

        Persona p = new Persona("Mario", "Rossi", 45);
        Studente s = new Studente("Anna", "Bianchi", 22, 12345, 2022);
        Docente d = new Docente("Lucia", "Verdi", 50, "Matematica");

        System.out.println("PERSONA:");
        System.out.println(p); // chiamata implicita a toString()

        System.out.println("\nSTUDENTE:");
        System.out.println(s);

        System.out.println("\nDOCENTE:");
        System.out.println(d);
    }
}