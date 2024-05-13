package clase;

public class Vanzator {
    private Plata strategie;
    private String nume;

    public Vanzator(String nume, Plata strategie) {
        this.nume = nume;
        this.strategie = strategie;
    }

    public void vindeMedicament(String nume) {
        System.out.print(nume + " ");
        this.strategie.achizitioneaza();
    }
}
