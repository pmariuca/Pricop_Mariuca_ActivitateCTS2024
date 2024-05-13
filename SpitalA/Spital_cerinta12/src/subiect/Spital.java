package subiect;

public class Spital extends Subiect {
    private String nume;

    public Spital(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificaVirus() {
        notificaObserver("Spitalul " + this.nume + " va anunta ca a aparut un nou virus.");
    }

    @Override
    public void notificaEpidemie() {
        notificaObserver("Spitalul " + this.nume + " va anunta ca a aparut o noua epidemie.");
    }
}
