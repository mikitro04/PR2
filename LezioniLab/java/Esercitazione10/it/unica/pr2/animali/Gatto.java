package it.unica.pr2.animali;

public class Gatto extends Animale {
    public static final String v = "Miao Miao";

    public Gatto (String nome) {
        super(nome);
    }

    @Override
    public String verso() { return v; }
}