package classes;

public class CaracteristiciInternare {
    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;

    public CaracteristiciInternare(int numarSalon, int numarPat, int numarZileSpitalizare) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    @Override
    public String toString() {
        return "CaracteristiciInternare{" +
                "numarSalon=" + numarSalon +
                ", numarPat=" + numarPat +
                ", numarZileSpitalizare=" + numarZileSpitalizare +
                '}';
    }
}
