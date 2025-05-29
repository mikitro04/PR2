package esercizi.es1;

public class TestMesi {
    public static void main(String[] args) {
        for(Mesi m : Mesi.values()) {
            System.out.println(m.getAll());
        }
    }
}