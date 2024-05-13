package clase;

public class InformatiiReteta {
    private int numarReteta;
    private int numarMedicamente;
    private double totalPlata;

    public InformatiiReteta(int numarReteta, int numarMedicamente, double totalPlata) {
        this.numarReteta = numarReteta;
        this.numarMedicamente = numarMedicamente;
        this.totalPlata = totalPlata;
    }

    public int getNumarReteta() {
        return numarReteta;
    }

    public int getNumarMedicamente() {
        return numarMedicamente;
    }

    public double getTotalPlata() {
        return totalPlata;
    }

    @Override
    public String toString() {
        return "Informatii Reteta: " +
                "numarReteta= " + numarReteta +
                ", numarMedicamente= " + numarMedicamente +
                ", totalPlata= " + totalPlata;
    }
}
