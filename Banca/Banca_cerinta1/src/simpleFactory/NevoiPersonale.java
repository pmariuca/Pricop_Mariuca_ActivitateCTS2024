package simpleFactory;

public class NevoiPersonale extends Credit {
    public NevoiPersonale(double valoare, double dobanda) {
        super(valoare, dobanda);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Creditul de nevoie personale are valoarea " + this.getValoare() + " si dobanda " + this.getDobanda());
    }
}
