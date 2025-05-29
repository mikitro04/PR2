package esercizi.es1;

public enum Mesi {
    GENNAIO(31, "Inverno"),
    FEBBRAIO(28, "Inverno"),
    MARZO(31, "Primavera"),
    APRILE(30, "Primavera"),
    MAGGIO(31, "Primavera"),
    GIUGNO(30, "Estate"),
    LUGLIO(31, "Estate"),
    AGOSTO(31, "Estate"),
    SETTEMBRE(30, "Autunno"),
    OTTOBRE(31, "Autunno"),
    NOVEMBRE(30, "Autunno"),
    DICEMBRE(31, "Inverno");

    private int giorni;
    private String stagione;

    Mesi (int giorni, String stagione) {
        this.giorni = giorni;
        this.stagione = stagione;
    }

    public int getGiorni() {
        return this.giorni;
    }

    public String getStagione() {
        return this.stagione;
    }

    public String getAll() {
        //A gennaio ci sono 31 giorni ed è inverno
        return ("A " + this.name().toLowerCase() + " ci sono " + this.getGiorni() + " giorni ed è " + this.getStagione());
    }
}