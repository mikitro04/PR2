package it.unica.pr2.interf.veicoli.motori;

public class AutoElettrica extends Auto implements MotoreElettrico{
    //kw della batteria, autonomia in km
    double kwBatteria;
    double autonomia;

    public AutoElettrica(String marca, String modello, int annoDiProduzione, double kwBatteria, double autonomia) {
        super(marca, modello, annoDiProduzione);

        this.kwBatteria = kwBatteria;
        this.autonomia = autonomia;
    }

    public AutoElettrica(AutoElettrica altro) {
        this.marca = altro.marca;
        this.modello = altro.modello;
        this.annoDiProduzione = altro.annoDiProduzione;
        this.numAuto = altro.numAuto;

        this.kwBatteria = altro.kwBatteria;
        this.autonomia = altro.autonomia;
    }

    public AutoElettrica() {
        super();

        this.kwBatteria = -1;
        this.autonomia = -1;
    }

    public int consumo() {
        //HINT: per calcolare il consumo dell'auto elettrica -> consumo_elettrico = (kw/autonomia) * 100;
        if(this.kwBatteria == -1) {
            return -1;
        }
        else{
            return (int)((this.kwBatteria / this.autonomia) * 100);
        }
    }

    @Override
    public boolean equals (Object o) {
        if (!super.equals(o)) return false;

        AutoElettrica a = (AutoElettrica) o;
        return this.kwBatteria == a.kwBatteria &&
            this.autonomia == a.autonomia;
    }

    @Override
    public double getKw() {
        return this.kwBatteria;
    }
}
