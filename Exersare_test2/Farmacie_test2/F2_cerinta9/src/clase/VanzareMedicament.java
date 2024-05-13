package clase;

public class VanzareMedicament implements Vanzare {
    private String denumire;
    private double pret;

    public VanzareMedicament(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void vinde() {
        System.out.println("Ati achizitionat medicamentul " + this.denumire + " la pretul de " + this.pret + " lei.");
    }
}
