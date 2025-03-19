public class ContoCorrente {
    double saldo;
    int numeroDiConto;

    public ContoCorrente(float saldo, int num)  {
        this.saldo = saldo;
        this.numeroDiConto = num;
    }

    void deposita(double incr) {
        this.saldo += incr;
        System.out.printf("Hai versato nel conto: %.2f €", incr);        
    }

    void preleva(double decr) {
        this.saldo -= decr;
        System.out.printf("Hai prelevato dal conto: %.2f €", decr);   
    }

    void visualizzaSaldo() {
        System.out.printf("\n\nIl tuo saldo attuale e': %.2f €\n\n", this.saldo);
    }
}
