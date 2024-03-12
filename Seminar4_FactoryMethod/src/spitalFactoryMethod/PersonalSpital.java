package spitalFactoryMethod;

public abstract class PersonalSpital {
    private String nume;
    private double salariu;

    public PersonalSpital(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public double getSalariu() {
        return salariu;
    }

    @Override
    public String toString() {
        return "PersonalSpital: {" +
                "nume='" + nume +
                ", salariu=" + salariu +
                '}';
    }

    public abstract void afisareDetalii();
}

