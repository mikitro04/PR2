public class Auto {
    String modello;
    String marca;
    double costoAlGiorno;
    boolean disponibilita;

    public Auto(String modello, String marca, double costoAlGiorno, boolean disponibilita){
        this.modello = modello;
        this.marca = marca;
        this.costoAlGiorno = costoAlGiorno;
        this.disponibilita = disponibilita;
    }

    void presa(){
        disponibilita = false;
    }

    void aumentoCosto(){
        costoAlGiorno++;
        System.out.printf("\nOra la macchina al giorno costa: %.2f €", costoAlGiorno);
    }

    void set(String mod, String mar){
        modello = mod;
        marca = mar;
        System.out.printf("\nLa macchina e' di modello \"%s\"\nLa marca e': \"%s\"", modello, marca);
    }
}
