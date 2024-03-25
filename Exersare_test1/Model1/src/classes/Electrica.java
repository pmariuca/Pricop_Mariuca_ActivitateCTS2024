package classes;

public class Electrica implements IBicicleta {
    private String numeModel;
    private double pret;

    public Electrica(String numeModel, double pret) {
        this.numeModel = numeModel;
        this.pret = pret;
    }

    public String getNumeModel() {
        return numeModel;
    }

    public void setNumeModel(String numeModel) {
        this.numeModel = numeModel;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Bicicleta electrica " + this.numeModel + " are pretul " + this.pret + " lei.");
    }
}
