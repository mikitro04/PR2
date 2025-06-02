package it.unica.pr2.animali;

public class Cane extends Animale {
    public static final String v = "Bau Bau";

    public Cane (String nome) {
        super(nome);
    }

    @Override
    public String verso() { return v; }
}