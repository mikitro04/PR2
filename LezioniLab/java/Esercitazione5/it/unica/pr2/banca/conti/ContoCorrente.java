package it.unica.pr2.banca.conti;

public class ContoCorrente extends ContoBancario {
    //nome, cognome, primo versamento, percentuale rendimento annuo
    int percentualeRendimentoAnnuo;

    public ContoCorrente (String nome, String cognome, int primoVersamento, int percentualeRendimentoAnnuo) {
        super(nome, cognome, primoVersamento);

        this.percentualeRendimentoAnnuo = percentualeRendimentoAnnuo;
    }

    public ContoCorrente () {
        super();

        this.percentualeRendimentoAnnuo = 0;
    }

    public ContoCorrente(ContoCorrente altro) {
        super(altro.nome, altro.cognome, altro.primoVersamento);

        this.percentualeRendimentoAnnuo = altro.percentualeRendimentoAnnuo;
        this.numConto = altro.numConto;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof ContoCorrente)) return false;

        ContoCorrente a = (ContoCorrente) o;
        return this.percentualeRendimentoAnnuo == a.percentualeRendimentoAnnuo;
    }

    public void preleva(double q) throws InsufficientFundsException {
        if(q < 0) {
            throw new IllegalArgumentException("Argomento non valido");
        }
        if ((this.saldo - q) < 0) {
            throw new InsufficientFundsException("Non hai fondi sufficienti!");
        }
        this.saldo -= q;
    }
}