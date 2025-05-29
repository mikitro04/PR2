package it.unica.pr2.birrerie.birre;

import java.util.*;

public class Birreria {
    String nome;
    List<Cliente> listaClienti = new ArrayList<>();
    List<Birra> listaBirre = new ArrayList<>();

    public Birreria(String nome) {
        this.nome = nome;
    }

    public void aggiungiCliente(Cliente nuovo) throws ClienteGiaPresenteException{
        //listaClienti.add(nuovo);
        if(this.listaClienti.contains(nuovo)) {
                throw new ClienteGiaPresenteException("Il cliente '" + nuovo.getNome() + "' è già registrato nella birreria.");
            }
            listaClienti.add(nuovo);
    }

    public void aggiungiBirre(Birra... nuova) throws BirraGiaPresenteException {
        for(Birra birra: nuova) {
            //listaBirre.add(birra);
            if(this.listaBirre.contains(birra)) {
                throw new BirraGiaPresenteException("La birra '" + birra.getNome() + "' è già presente nella birreria.");
            }
            listaBirre.add(birra);
        }
    }

    public String getNome() {
        return this.nome;
    }

    public List<Birra> getBirreDisponibili() {
        return listaBirre;
    }

    public List<Cliente> getClienti() {
        return listaClienti;
    }
}