package it.unica.pr2.classi;

public class Animale implements Comparable<Animale> {
    String nome;

    public Animale(String nome) { this.nome = nome; }

    public String getNome() {return this.nome; }

    @Override
    public int compareTo(Animale o) { 
        return o.getNome().compareTo(this.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(!(o instanceof Animale)) return false;

        Animale a = (Animale) o;
        return this.compareTo(a) == 0;
    }

    @Override
    public String toString() { return this.nome; }
}