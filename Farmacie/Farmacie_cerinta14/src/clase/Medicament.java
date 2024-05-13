package clase;

public class Medicament {
    private String denumire;
    private int stoc;
    private double pret;

    public Medicament(String denumire, int stoc, double pret) {
        this.denumire = denumire;
        this.stoc = stoc;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
    }
}
