public class Persona {
    //nome, cognome ed eta con i metodi getter e setter
    //attributi
    String nome;
    String cognome;
    int eta;

    //Costruttore
    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public Persona() {
        this.nome = "nome";
        this.cognome = "cognome";
        this.eta = 0;
    }

    void setNome(String nome) {
        this.nome = nome;
    }
    String getNome() {
        return this.nome;
    }

    void setCognome(String cognome) {
        this.cognome = cognome;
    }
    String getCognome() {
        return this.cognome;
    }

    void setEta(int eta) {
        this.eta = eta;
    }
    int getEta() {
        return this.eta;
    }

    public double calcolaCostoBiglietto(double costoIntero) {
        if(this.eta >= 70) {
            return (costoIntero - (costoIntero * 0.2));
        }else if (this.eta >= 50){
            return (costoIntero - (costoIntero * 0.1));
        }else {
            return costoIntero;
        }
    }

    @Override
    public String toString(){
        String s = "Nome: " + this.getNome() + " Cognome: " + this.getCognome();
        return s;
    }
}
