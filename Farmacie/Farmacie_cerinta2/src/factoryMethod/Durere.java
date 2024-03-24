package factoryMethod;

public class Durere extends Medicament {
    public Durere(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul de durere " + this.getDenumire() + " are pretul " + this.getPret());
    }
}
