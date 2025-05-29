package it.unica.pr2.birrerie.birre;

public class Birra {
    //Birra ipa = new Birra("Super IPA", "IPA", 6.5);  //nome, stile, grado alcolico
    String nome;
    String stile;
    double gradoAlcolico;

    public Birra(String nome, String stile, double gradoAlcolico) {
        this.nome = nome;
        this.stile = stile;
        this.gradoAlcolico = gradoAlcolico;
    }

    public String getNome() {
        return this.nome;
    }

    public String getStile() {
        return this.stile;
    }

    public double getGradoAlcolico() {
        return this.gradoAlcolico;
    }
}