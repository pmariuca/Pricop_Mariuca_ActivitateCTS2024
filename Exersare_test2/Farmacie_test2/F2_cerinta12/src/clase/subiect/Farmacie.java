package clase.subiect;

public class Farmacie extends Subiect {
    private String nume;

    public Farmacie(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificaOferta() {
        notificaObservatori("Farmacia " + this.nume + " va anunta ca a aparut o noua oferta.");
    }
}
