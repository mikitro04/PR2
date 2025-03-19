class Rettangolo {
    int base;
    int altezza;

    public Rettangolo(int b, int a) {
        base = b;
        altezza = a;
    }

    int area() {
        return (base * altezza);
    }
}

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 8);

        System.err.printf("Base: %d\tAltezza: %d\nArea: %d\n", rettangolo.base, rettangolo.altezza, rettangolo.area());
    }
}
