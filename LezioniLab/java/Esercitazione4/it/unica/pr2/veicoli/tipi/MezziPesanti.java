package it.unica.pr2.veicoli.tipi;

public abstract class MezziPesanti {
    //marca, peso in tonnellate, altezza
    String marca;
    double pesoTonn;
    double altezza;

    public MezziPesanti(String marca, double pesoTonn, double altezza) {
        this.marca = marca;
        this.pesoTonn = pesoTonn;
        this.altezza = altezza;
    }
}

