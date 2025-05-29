package it.unica.pr2.interf.veicoli.motori;

public abstract class Auto {
    //marca, modello, anno di produzione
    String marca;
    String modello;
    int annoDiProduzione;
    int numAuto;

    static int counter = 0;

    public Auto(String marca, String modello, int annoDiProduzione) {
        this.marca = marca;
        this.modello = modello;
        this.annoDiProduzione = annoDiProduzione;
    }

    public Auto(Auto altro) {
        this.marca = altro.marca;
        this.modello = altro.modello;
        this.annoDiProduzione = altro.annoDiProduzione;
        this.numAuto = altro.numAuto;
    }

    public Auto() {
        this.marca = "not defined";
        this.modello = "not defined";
        this.annoDiProduzione = -1;
    }

    public int consumo(){
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass() != getClass()) return false;

        Auto v = (Auto) o;
        return this.marca.equals(v.marca) &&
            this.modello.equals(v.modello) &&
            this.annoDiProduzione == v.annoDiProduzione &&
            this.numAuto == v.numAuto;
    }

    public String getMarca() {
        return this.marca;
    }
    public String getModello() {
        return this.modello;
    }
    public double numeroAuto() {
        return this.numAuto;
    }
}
