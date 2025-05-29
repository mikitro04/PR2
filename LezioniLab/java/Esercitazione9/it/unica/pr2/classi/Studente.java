package it.unica.pr2.classi;

public class Studente extends Persona {
    String uni;
    int votoDiLaurea;

    public Studente(String nome, String cognome, int annoNascita, String uni, int votoDiLaurea) {
        super(nome, cognome, annoNascita);
        this.uni = uni;
        this.votoDiLaurea = votoDiLaurea;
    }

    public int getVoto() { return this.votoDiLaurea; }
/*
    public int compareTo(Studente o) {
        // -1 se s1.votoDiLaurea < s2.votoDiLaurea
        // +1 se s1.votoDiLaurea > s2.votoDiLaurea
        // 0 se s1.votoDiLaurea == s2.votoDiLaurea
        if(this.votoDiLaurea < o.votoDiLaurea) return -1;
        if(this.votoDiLaurea > o.votoDiLaurea) return 1;
        return this.getNome().compareTo(o.getNome());
    }*/
}