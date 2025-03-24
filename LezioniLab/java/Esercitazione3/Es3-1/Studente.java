public class Studente extends Persona {
    int matricola;
    int annoDiIscrizione;

    public Studente(String nome, String cognome, int eta, int matricola, int annoDiIscrizione) {
        super(nome, cognome, eta);

        this.matricola = matricola;
        this.annoDiIscrizione = annoDiIscrizione;
    }

    public Studente() {
        super();

        this.matricola = 0;
        this.annoDiIscrizione = 2000;
    }

    void setMatricola(int matricola) {
        this.matricola = matricola;
    }
    int getMatricola() {
        return this.matricola;
    }

    void setAnnoDiIscrizione(int annoDiIscrizione) {
        this.annoDiIscrizione = annoDiIscrizione;
    }
    int getAnnoDiIscrizione() {
        return this.annoDiIscrizione;
    }

    @Override
    public double calcolaCostoBiglietto(double costoIntero) {
        if(this.eta < 30) {
            return 0;
        }else if((2025 - annoDiIscrizione) <= 3) {
            return costoIntero/2;
        }else{
            return super.calcolaCostoBiglietto(costoIntero);
        }
    }
}
