package it.unica.pr2.classi;

public class Gatto extends Animale {
    double coda;

    public Gatto(String nome, double coda) {
        super(nome);
        this.coda = coda;
    }

    public double getCoda() { return this.coda; }
}