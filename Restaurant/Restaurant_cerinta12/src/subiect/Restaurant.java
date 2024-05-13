package subiect;

public class Restaurant extends Subiect {
    private String nume;

    public Restaurant(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificaOferta() {
        notificaObserver("Restaurantul " + this.nume + " anunta ca a aparut o noua oferta de pret.");
    }

    @Override
    public void notificaMeniu() {
        notificaObserver("Restaurantul " + this.nume + " anunta ca a aparut un nou meniu.");
    }
}
