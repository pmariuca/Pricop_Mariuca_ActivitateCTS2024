package softFarmacie;

public class MedicamentFarmacie {
    private String denumire;
    private double pret;

    public MedicamentFarmacie(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    public void cumparaMedicament() {
        System.out.println("Ati achizitionat medicamentul " + this.denumire + " la pretul de " + this.pret + " lei.");
    }
}
