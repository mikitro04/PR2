package it.unica.pr2.interf.veicoli.motori;

public class AutoClassica extends Auto implements MotoreAScoppio{
    int cilindrata;

    public AutoClassica(String marca, String modello, int annoDiProduzione, int cilindrata) {
        super(marca, modello, annoDiProduzione);

        this.cilindrata = cilindrata;
    }

    public AutoClassica(AutoClassica altro) {
        this.marca = altro.marca;
        this.modello = altro.modello;
        this.annoDiProduzione = altro.annoDiProduzione;
        this.numAuto = altro.numAuto;

        this.cilindrata = altro.cilindrata;
    }

    public AutoClassica() {
        super();
        
        this.cilindrata = -1;
    }

    public int consumo() {
        //HINT: per calcolare il consumo dell'auto elettrica -> consumo_classico = (cilindrata/100) * 0.8;
        return (int)((this.cilindrata / 100) * 0.8);
    }

    @Override
    public boolean equals (Object o) {
        if (!super.equals(o)) return false;

        AutoClassica a = (AutoClassica) o;
        return this.cilindrata == a.cilindrata;
    }
}
