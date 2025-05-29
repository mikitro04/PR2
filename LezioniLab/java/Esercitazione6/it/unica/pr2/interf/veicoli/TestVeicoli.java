package it.unica.pr2.interf.veicoli;

import it.unica.pr2.interf.veicoli.motori.*;

public class TestVeicoli{

    public static void main(String[] args){

        AutoElettrica ae = new AutoElettrica("Tesla","Model 3", 2019, 85,450); //marca, modello, anno di produzione, kw della batteria, autonomia in km

        AutoIbrida ai = new AutoIbrida("Ford", "Focus", 2023, 79, 550, 1600); //marca, modello, anno di produzione, kw della batteria, autonomia in km, cilindrata

        AutoClassica ac = new AutoClassica("Fiat", "Punto", 2006, 1200); // marca, modello, anno di produzione, cilindrata   

        assert (ae instanceof MotoreElettrico && ae instanceof Auto);
        assert (ai instanceof MotoreElettrico && ai instanceof MotoreAScoppio && ai instanceof Auto);
        assert (ac instanceof MotoreAScoppio && ac instanceof Auto);

        Garage g = new Garage("PaoloB"); //nome proprietario,dimensione massima 5 auto
        g.aggiungi(ae);
        g.aggiungi(ai);
        g.aggiungi(ac);
        
        assert g.numeroAuto() == 3;

        //HINT: per calcolare il consumo dell'auto elettrica -> consumo_elettrico = (kw/autonomia) * 100;
        //HINT: per calcolare il consumo dell'auto elettrica -> consumo_classico = (cilindrata/100) * 0.8;
        //HINT: per calcolare il consumo dell'auto elettrica -> consumo_ibrido = 0.5 * consumo_elettrico + 0.5 * consumo_classico;
        // FARE IL CAST AD INTERO PRIMA DI RESTITUIRE IL CONSUMO;
        
        assert ae.consumo() == 18;
        assert ai.consumo() == 13;
        assert ac.consumo() == 9;

        AutoClassica ac2 = new AutoClassica(ac);

        assert ac2.equals(ac);
        g.aggiungi(ac2);

        
        AutoElettrica ae2 = new AutoElettrica();
        assert ae2.getMarca().equals("not defined");
        assert ae2.getModello().equals("not defined");
        //HINT: per calcolare il consumo dell'auto elettrica -> consumo_elettrico = (kw/autonomia) * 100;
        assert ae2.getKw() == -1;

        g.aggiungi(ae2);
        assert g.numeroAuto() == 5;

        assert g.get(0).getMarca().equals("Tesla");

        
        AutoIbrida ai2 = new AutoIbrida();
        try{
            g.aggiungi(ai2);
        }catch(NumeroAutoEccessivoException e){
            assert e.getMessage().equals("Hai già raggiunto il numero massimo di auto nel garage di PaoloB");
        }

        /**/
    }
}