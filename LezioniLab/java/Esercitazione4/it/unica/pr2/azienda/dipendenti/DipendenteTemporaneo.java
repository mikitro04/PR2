package it.unica.pr2.azienda.dipendenti;

public class DipendenteTemporaneo extends Dipendente {
    int annoScadenzaContratto;

    public DipendenteTemporaneo(String nome, String cognome, double stipendio, int annoScadenzaContratto) {
        super(nome, cognome, stipendio);
        this.annoScadenzaContratto = annoScadenzaContratto;
    }
}
