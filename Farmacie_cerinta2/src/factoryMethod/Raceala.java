package factoryMethod;

public class Raceala extends Medicament {

    public Raceala(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul de raceala " + this.getDenumire() + " are pretul " + this.getPret());
    }
}