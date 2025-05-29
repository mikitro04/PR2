package it.unica.pr2.birrerie;
import it.unica.pr2.birrerie.birre.*; //le vostre classi vanno qui

public class TestBirrerie {

    public static void main(String[] args) {


        Birra ipa = new Birra("Super IPA", "IPA", 6.5); //nome, stile, grado alcolico
        Birra weiss = new Birra("Bavarian Weiss", "Weiss", 5.0);
        Birra stout = new Birra("Dark Stout", "Stout", 7.2);

        assert ipa.getNome().equals("Super IPA");
        assert ipa.getStile().equals("IPA");
        assert ipa.getGradoAlcolico() == 6.5;

        Cliente marco = new Cliente("Marco"); //nome

        marco.aggiungiBirrePreferite(ipa);
        marco.aggiungiBirrePreferite(weiss);

        assert marco.getBirrePreferite().size() == 2;
        assert marco.getBirrePreferite().contains(ipa);
        assert !marco.getBirrePreferite().contains(stout);


        Birra ichnusa = new Birra("Ichnusa","Bionda", 4.5);
        Birra corona = new Birra("Corona","Famiglia", 3);

        marco.aggiungiBirrePreferite(ichnusa, corona);

        assert marco.getBirrePreferite().size() == 4;
        
        Birreria birreria = new Birreria("La Birra Pazza"); //nome birreria

        birreria.aggiungiCliente(marco);
        birreria.aggiungiBirre(ipa, weiss, stout);

        assert birreria.getNome().equals("La Birra Pazza");
        assert birreria.getBirreDisponibili().size() == 3;
        assert birreria.getClienti().contains(marco);
        assert !birreria.getClienti().contains(new Cliente("Luca"));

        try {
             birreria.aggiungiBirre(ipa);// ipa già presente
             assert false;
        } catch (BirraGiaPresenteException e) {
            assert e.getMessage().equals("La birra 'Super IPA' è già presente nella birreria.");
        }
        try {
             birreria.aggiungiBirre(weiss);// weiss già presenti
        } catch (BirraGiaPresenteException e) {
            assert e.getMessage().equals("La birra 'Bavarian Weiss' è già presente nella birreria.");
        }

        assert birreria.getBirreDisponibili().size() == 3;

        try {
            birreria.aggiungiCliente(new Cliente("Marco")); // già presente
        } catch (ClienteGiaPresenteException e) {
            assert e.getMessage().equals("Il cliente 'Marco' è già registrato nella birreria.");
        }

        /**/
    }
}

 