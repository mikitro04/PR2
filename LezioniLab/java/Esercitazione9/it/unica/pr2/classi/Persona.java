package it.unica.pr2.classi;

import java.util.*;

public class Persona implements Comparable<Persona> {
    String nome;
    String cognome;
    int annoNascita;

    public Persona(String nome, String cognome, int annoNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
    }

    public String getNome() {return this.nome; }

    @Override
    public int compareTo(Persona o) {
        return  o.annoNascita - this.annoNascita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Persona)) return false;

        Persona p = (Persona) o;
        return this.compareTo(p) == 0;
    }

    @Override
    public String toString() { return this.nome; }
}