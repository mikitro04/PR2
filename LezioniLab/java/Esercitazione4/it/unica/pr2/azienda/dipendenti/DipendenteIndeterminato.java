package it.unica.pr2.azienda.dipendenti;

public class DipendenteIndeterminato extends Dipendente{
    String mansione;

    public DipendenteIndeterminato(String nome, String cognome, double stipendio, String mansione) {
        super(nome, cognome, stipendio);
        this.mansione = mansione;
    }

    public String getMansione() {
        return this.mansione;
    }
}
