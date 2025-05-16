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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veicolo)) return false;

        Veicolo v = (Veicolo) o;
        return this.anno == v.anno &&
            this.cilindrata == v.cilindrata &&
            this.marca.equals(v.marca) &&
            this.modello.equals(v.modello);
    }
}
