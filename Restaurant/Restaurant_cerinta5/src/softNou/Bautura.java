package softNou;

public class Bautura {
    private String denumire;
    private double pret;

    public Bautura(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }
}
