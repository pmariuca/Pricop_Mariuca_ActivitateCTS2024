package clase;

public class Client implements Flyweight {
    private String nume;
    private int numarAsigurare;

    public Client(String nume, int numarAsigurare) {
        this.nume = nume;
        this.numarAsigurare = numarAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public int getNumarAsigurare() {
        return numarAsigurare;
    }

    @Override
    public void achizitioneazaMedicament(InformatiiReteta informatiiReteta) {
        System.out.println(this.nume + " cu numarul de asigurare " + this.numarAsigurare + ": " + informatiiReteta.toString());
    }
}
