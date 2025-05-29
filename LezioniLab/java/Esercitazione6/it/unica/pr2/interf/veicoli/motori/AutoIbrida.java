package it.unica.pr2.interf.veicoli.motori;

public class AutoIbrida extends Auto implements MotoreElettrico, MotoreAScoppio{
    //kw della batteria, autonomia in km, cilindrata
    double kwBatteria;
    double autonomia;
    int cilindrata;

    public AutoIbrida(String marca, String modello, int annoDiProduzione, double kwBatteria, double autonomia, int cilindrata) {
        super(marca, modello, annoDiProduzione);

        this.kwBatteria = kwBatteria;
        this.autonomia = autonomia;
        this.cilindrata = cilindrata;
    }

    public AutoIbrida(AutoIbrida altro) {
        this.marca = altro.marca;
        this.modello = altro.modello;
        this.annoDiProduzione = altro.annoDiProduzione;
        this.numAuto = altro.numAuto;

        this.kwBatteria = altro.kwBatteria;
        this.autonomia = altro.autonomia;
        this.cilindrata = altro.cilindrata;
    }

    public AutoIbrida() {
        super();

        this.kwBatteria = -1;
        this.autonomia = -1;
        this.cilindrata = -1;
    }

    public int consumo() {
        //HINT: per calcolare il consumo dell'auto elettrica -> consumo_elettrico = (kw/autonomia) * 100;
        //HINT: per calcolare il consumo dell'auto elettrica -> consumo_classico = (cilindrata/100) * 0.8;
        //HINT: per calcolare il consumo dell'auto elettrica -> consumo_ibrido = 0.5 * consumo_elettrico + 0.5 * consumo_classico;
        double cc = ((this.cilindrata / 100) * 0.8);
        double ce = ((this.kwBatteria / this.autonomia) * 100);

        return (int)((0.5 * ce) + (0.5 * cc));
    }

    @Override
    public boolean equals (Object o) {
        if (!super.equals(o)) return false;

        AutoIbrida a = (AutoIbrida) o;
        return this.kwBatteria == a.kwBatteria &&
            this.autonomia == a.autonomia &&
            this.cilindrata == a.cilindrata;
    }

    @Override
    public double getKw() {
        return this.kwBatteria;
    }
}
