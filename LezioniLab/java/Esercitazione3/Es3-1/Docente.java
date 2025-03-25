public class Docente extends Persona {
    String insegnamento;

    public Docente (String nome, String cognome, int eta, String insegnamento) {
        super(nome, cognome, eta);

        this.insegnamento = insegnamento;
    }

    public Docente () {
        super();

        this.insegnamento = "Da Inserire";
    }

    void setInsegnamento(String insegnamento) {
        this.insegnamento = insegnamento;
    }
    String getInsegnamento() {
        return this.insegnamento;
    }

    @Override
    public double calcolaCostoBiglietto(double costoIntero) {
        return ((costoIntero * 10) / 100);
    }

    @Override
    public String toString(){
        String s = super.toString() + " Insegnamento: " +  getInsegnamento();
        return s;
    }
}
