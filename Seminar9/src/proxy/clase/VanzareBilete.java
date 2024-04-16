package proxy.clase;

public class VanzareBilete implements Vanzare {
    private String meci;
    private double pret;

    public VanzareBilete(String meci, double pret) {
        this.meci = meci;
        this.pret = pret;
    }

    @Override
    public void vinde(Persoana persoana) {
        System.out.println("Persoana " + persoana.getNume() +
                " a cumparat bilet la meciul " + this.meci +
                " platind " + this.pret + " lei.");
    }
}
