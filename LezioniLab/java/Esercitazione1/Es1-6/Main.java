public class Main {
    public static void main(String[] args) {
        // Creazione di un'auto
        Auto miaAuto = new Auto("Fiesta", "Ford", 35.50, true);

        // Prendere l'auto a noleggio
        miaAuto.presa();

        // Aumentare il costo del noleggio
        miaAuto.aumentoCosto();

        // Cambiare modello e marca
        miaAuto.set("Civic", "Honda");
    }
}