package it.unica.pr2.veicoli.tipi;

public class Moto extends Veicolo {
    boolean ABS;

    //m1 = "Yamaha", "MT-09", 2017
    //m2 = Yamaha, MT-09, 2017, 650cc non ha ABS

    //costruttore
    public Moto(String marca, String modello, int anno){
        super(marca, modello, anno);
    }

    public Moto(Moto altro) {
        super(altro);
        this.ABS = altro.ABS;
    }

    @Override
    public String descrizione() {
        String ret = "Moto " + super.descrizione();
        return ret;
    }

    public void hasABS(boolean value) {
        this.ABS = value;
    }

    @Override
    public String sicurezza() {
        //"La moto Yamaha MT-09, 2017, 850cc ha ABS, sei abbastanza sicuro!"
        String ret = "La moto " + super.descrizione();
        if(this.ABS) {
            ret += " ha ABS, sei abbastanza sicuro!";
        }else {
            ret += " non ha ABS, non sei abbastanza sicuro!";
        }

        return ret;
    }
}
