package simpleFactory;

public class Ipotecare extends Credit {
    public Ipotecare(double valoare, double dobanda) {
        super(valoare, dobanda);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Creditul de ipotecare are valoarea " + this.getValoare() + " si dobanda " + this.getDobanda());
    }
}
