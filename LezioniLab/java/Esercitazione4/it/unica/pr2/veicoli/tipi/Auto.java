package it.unica.pr2.veicoli.tipi;

public class Auto extends Veicolo {
    boolean fourAirBag;

    //costruttore
    public Auto(String marca, String modello, int anno){
        super(marca, modello, anno);
        this.fourAirBag = false;
    }

    public Auto(Auto altro) {
        super(altro);
        this.fourAirBag = altro.fourAirBag;
    }

    @Override
    public String descrizione() {
        String ret = "Auto " + super.descrizione();
        return ret;
    }

    public void hasFourAirbags(boolean value) {
        this.fourAirBag = value;
    }

    @Override
    public String sicurezza() {
        String ret = "L'auto " + super.descrizione();
        if(this.fourAirBag) {
            ret += " ha 4 airbags, sei abbastanza sicuro!";
        }else {
            ret += " non ha 4 airbags, non sei abbastanza sicuro!";
        }

        return ret;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Auto)) return false;

        Auto a = (Auto) o;
        return this.fourAirBag == a.fourAirBag;
    }

}
