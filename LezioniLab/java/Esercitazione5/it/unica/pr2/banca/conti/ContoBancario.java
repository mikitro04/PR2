package it.unica.pr2.banca.conti;

public class ContoBancario {
    //nome, cognome, primo versamento
    String nome;
    String cognome;
    double primoVersamento;
    int numConto;
    double saldo = 0;
    static int contatore = 1000;

    public ContoBancario (String nome, String cognome, double primoVersamento) {
        this.nome = nome;
        this.cognome = cognome;
        this.primoVersamento = primoVersamento;
        this.saldo += primoVersamento;

        contatore++;
        
        this.numConto = contatore;
    }

    public ContoBancario () {
        this.nome = "";
        this.cognome = "";
        this.primoVersamento = 0;
        this.saldo += primoVersamento;

        contatore++;
        
        this.numConto = contatore;
    }

    public ContoBancario (ContoBancario altro) {
        this.nome = altro.nome;
        this.cognome = altro.cognome;
        this.primoVersamento = altro.primoVersamento;
        this.saldo += altro.primoVersamento;
        
        this.numConto = altro.numConto;
    }

    public int getNumeroConto() {
        return this.numConto;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof ContoBancario)) return false;

        ContoBancario v = (ContoBancario) o;
        return this.nome.equals(v.nome) &&
            this.cognome.equals(v.cognome) &&
            this.primoVersamento== v.primoVersamento &&
            this.saldo == v.saldo &&
            this.numConto == v.numConto;
    }


    public static double convertiInEuro(double dollari, double tassoConversione) {
        return dollari * tassoConversione;
    }
}