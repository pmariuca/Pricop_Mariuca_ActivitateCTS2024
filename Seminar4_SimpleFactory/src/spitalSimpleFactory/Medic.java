package spitalSimpleFactory;

public class Medic extends PersonalSpital{

    public Medic(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicul " + this.getNume() + " are salariul " + this.getSalariu());
    }
}
