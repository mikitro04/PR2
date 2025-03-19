class Numero {
    int n;

    public Numero(int n) {
        this.n = n;
    }

    int somma(int m) {
        return (n + m);
    }
}

public class Main {
    public static void main(String[] args) {
        Numero numero = new Numero(5);

        System.out.printf("Il numero n vale %d\n", numero.n);

        System.out.printf("Il numero dopo la somma di 6 vale: %d\n", numero.somma(6));
    }
}