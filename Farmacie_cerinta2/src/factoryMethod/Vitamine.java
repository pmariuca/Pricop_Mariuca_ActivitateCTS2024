package factoryMethod;

public class Vitamine extends Medicament {
    public Vitamine(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul de vitamine " + this.getDenumire() + " are pretul " + this.getPret());
    }
}
