package it.unica.pr2.azienda.dipendenti;

public class Dipendente {
    //nome, cognome, stipendio
    String nome;
    String cognome;
    double stipendio;
    double stipendioN;

    public Dipendente(String nome, String cognome, double stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.stipendio = stipendio;

        stipendioN = stipendio;
    }

    // ore, paga oraria
    public double straordinari(double ore, double pagaOraria) {
        double tmp = ore * pagaOraria;
        stipendioN += tmp;
        return tmp;
    }

    public double stipendioNetto() {
        return stipendioN;
    }
}
