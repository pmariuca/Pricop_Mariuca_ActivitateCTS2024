package softSpital;

public class MedicamentSpital {
    private String denumire;
    private double pret;

    public MedicamentSpital(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
    }

    public void prezintaReteta() {
        System.out.println("Pentru a achizitiona medicamentul " + this.denumire + " este nevoie de reteta.");
    }
}
