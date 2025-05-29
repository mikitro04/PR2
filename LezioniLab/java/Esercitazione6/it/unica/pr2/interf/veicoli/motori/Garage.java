package it.unica.pr2.interf.veicoli.motori;

public class Garage {
    String nome;
    int counter;
    static final int MAX = 5;

    Auto[] array;

    public Garage(String nome) {
        this.nome = nome;
        this.counter = 0;
        array = new Auto[MAX]; 
    }

    public void aggiungi(Auto a) throws NumeroAutoEccessivoException{
        if(counter == 5) {
            String messaggio = "Hai già raggiunto il numero massimo di auto nel garage di " + this.nome;
            throw new NumeroAutoEccessivoException(messaggio);
        }
        array[counter++] = a;
    }

    public int numeroAuto() {
        return this.counter;
    }

    public Auto get(int i) {
        return array[i];
    }
}
