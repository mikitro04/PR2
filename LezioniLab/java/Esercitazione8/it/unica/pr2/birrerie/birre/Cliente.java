package it.unica.pr2.birrerie.birre;

import java.util.*;

public class Cliente {
    String nome;
    List<Birra> listaBirre = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void aggiungiBirrePreferite(Birra... birra) {
        //listaBirre.add(birra);
        for(Birra nuova : birra) {
            listaBirre.add(nuova);
        }
    }

    public List<Birra> getBirrePreferite() {
        return listaBirre;
    }

    public String getNome() {
        return this.nome;
    }
}