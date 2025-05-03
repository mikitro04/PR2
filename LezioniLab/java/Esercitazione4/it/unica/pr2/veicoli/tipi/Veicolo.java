package it.unica.pr2.veicoli.tipi;

public abstract class Veicolo {
    //marca, modello, anno
    String marca;
    String modello;
    int anno;
    int cilindrata;

    public Veicolo(String marca, String modello, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;

        this.cilindrata = 0;
    }

    public Veicolo(Veicolo altro) {
        this.marca = altro.marca;
        this.modello = altro.modello;
        this.anno = altro.anno;
        this.cilindrata = altro.cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String descrizione() {
        String ret = this.marca  + " " + this.modello + ", " + this.anno + ", " + this.cilindrata + "cc";
        return ret;
    }

    public abstract String sicurezza();
}
