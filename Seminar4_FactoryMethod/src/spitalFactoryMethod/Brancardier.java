package spitalFactoryMethod;

public class Brancardier extends PersonalSpital {
    public Brancardier(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Brancardierul " + this.getNume() + " are salariul " + this.getSalariu());
    }
}
