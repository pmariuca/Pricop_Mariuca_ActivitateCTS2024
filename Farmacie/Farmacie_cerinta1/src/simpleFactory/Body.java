package simpleFactory;

public class Body extends Medicament {
    public Body(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul de body " + this.getDenumire() + " are pretul " + this.getPret());
    }
}
