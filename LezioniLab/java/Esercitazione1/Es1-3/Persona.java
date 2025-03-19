public class Persona {
    String nome;
    String cognome;
    int eta;

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    /*Nome*/
    String getNome() {
        return nome;
    }
    void setNome(String name) {
        this.nome = name;
    }

    /*Cognome*/
    String getCognome() {
        return cognome;
    }
    void setCognome(String surname) {
        this.cognome = surname;
    }

    /*Età*/
    int getEta() {
        return eta;
    }
    void setEta(int eta) {
        this.eta = eta;
    }
}