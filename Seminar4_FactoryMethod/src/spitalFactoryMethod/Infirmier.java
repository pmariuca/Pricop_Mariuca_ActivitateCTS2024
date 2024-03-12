package spitalFactoryMethod;

public class Infirmier extends PersonalSpital {
    public Infirmier(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Infirmierul " + this.getNume() + " are salariul " + this.getSalariu());
    }
}
