package softVechi;

public class Medicament {
    private int id;
    private String denumire;
    private double pret;
    private int stocDepozit;

    public Medicament(int id, String denumire, double pret, int stocDepozit) {
        this.id = id;
        this.denumire = denumire;
        this.pret = pret;
        this.stocDepozit = stocDepozit;
    }

    public int getId() {
        return id;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    public int getStocDepozit() {
        return stocDepozit;
    }
}
