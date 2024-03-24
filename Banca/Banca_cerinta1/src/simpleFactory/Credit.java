package simpleFactory;

public abstract class Credit {
    private double valoare;
    private double dobanda;

    public Credit(double valoare, double dobanda) {
        this.valoare = valoare;
        this.dobanda = dobanda;
    }

    public double getValoare() {
        return valoare;
    }

    public double getDobanda() {
        return dobanda;
    }

    public abstract void afisareDetalii();
}
