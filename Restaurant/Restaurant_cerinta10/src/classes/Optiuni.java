package classes;

public class Optiuni {
    private int numarMasa;
    private int numarPersoane;
    private String oraRezervare;

    public Optiuni(int numarMasa, int numarPersoane, String oraRezervare) {
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
        this.oraRezervare = oraRezervare;
    }

    @Override
    public String toString() {
        return "Optiuni{" +
                "numarMasa=" + numarMasa +
                ", numarPersoane=" + numarPersoane +
                ", oraRezervare='" + oraRezervare + '\'' +
                '}';
    }
}
