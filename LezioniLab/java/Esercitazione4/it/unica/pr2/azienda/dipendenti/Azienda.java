package it.unica.pr2.azienda.dipendenti;

public class Azienda {
    //nome azienda, sede legale, citta NB: OGNI AZIENDA PUO' ASSUMERE MASSIMO 5 DIPENDENTI
    String nome;
    String sedeLegale;
    String citta;
    Dipendente[] arrayDipendenti;
    int numDipendenti;

    public Azienda (String nome, String sedeLegale, String citta) {
        this.nome = nome;
        this.sedeLegale = sedeLegale;
        this.citta = citta;

        arrayDipendenti = new Dipendente[5];
        numDipendenti = 0;
    }

    public void assumi(Dipendente dipendente) {
        if(numDipendenti > 5) {
            arrayDipendenti[numDipendenti] = dipendente;
            numDipendenti++;
        }
    }

    public boolean lavoraQui(Dipendente dipendente) {
        for (int i = 0; i < numDipendenti; i++) {
            if(dipendente == arrayDipendenti[i]) {
                return true;
            }
        }
        return false;
    }

    public double totaleStipendi() {
        double ret = 0;
        for (int i = 0; i < numDipendenti; i++) {
            ret += arrayDipendenti[i].stipendioNetto();
        }
        return ret;
    }

    public int totaleDipendenti() {
        return numDipendenti;
    }

    public int contaDipendentiTemporanei() {
        int ret = 0;
        for (int i = 0; i < numDipendenti; i++) {
            if(arrayDipendenti[i] instanceof DipendenteTemporaneo) {
                ret ++;
            }
        }
        return ret;
    }

    public int contaDipendentiIndeterminati() {
        int ret = 0;
        for (int i = 0; i < numDipendenti; i++) {
            if(arrayDipendenti[i] instanceof DipendenteIndeterminato) {
                ret ++;
            }
        }
        return ret;
    }

    public int contaManager() {
        int ret = 0;
        for (int i = 0; i < numDipendenti; i++) {
            if(arrayDipendenti[i] instanceof DipendenteIndeterminato) {
                if(((DipendenteIndeterminato)arrayDipendenti[i]).getMansione().equals("Manager")) {
                    ret ++;
                }
            }
        }
        return ret;
    }

    public int contaSegretari() {
        int ret = 0;
        for (int i = 0; i < numDipendenti; i++) {
            if(arrayDipendenti[i] instanceof DipendenteIndeterminato) {
                if(((DipendenteIndeterminato)arrayDipendenti[i]).getMansione().equals("Segretario")) {
                    ret ++;
                }
            }
        }
        return ret;
    }
}
