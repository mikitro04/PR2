package it.unica.pr2.animali;

import static java.util.stream.Collectors.toList;
import java.util.*;

public abstract class Animale {
    String nome;
    public static int c = 0;

    static final List<Animale> listA = new ArrayList<>();

    public Animale(String nome) throws NumeroEccessivoException{
        if(c < 2) {
            this.nome = nome;
            c++;

            listA.add(this);
        }else {
            throw new NumeroEccessivoException("Non puoi inserire più di due animali");
        }
    }

    public abstract String verso();
    
    public static int animaliTotali() { return c; }

    public static List<Animale> animali() {
        List<Animale> res = new ArrayList<>(listA);
        Collections.reverse(res);
        return res;
    }

    public static List<String> streamVersiMaiuscoliSenzaSpazi() {
        List<Animale> animali = new ArrayList<>(listA);
        Collections.reverse(animali);

        return animali.stream()
            .map(a -> a.verso())
            .map(String::toUpperCase)
            .map(s -> s.replace(" ", ""))
            .collect(toList());
    }
}