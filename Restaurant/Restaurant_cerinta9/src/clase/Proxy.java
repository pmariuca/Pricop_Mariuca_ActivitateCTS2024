package clase;

public class Proxy implements Rezervare {
    private Rezervare rezervare;
    private static int nrMinimPersoane = 4;

    public Proxy(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(Client client) {
        if(client.getNrPersoane() >= nrMinimPersoane) {
            rezervare.rezerva(client);
        } else {
            System.out.println("Clientul " + client.getNume() + " trebuie sa se prezinte la restaurant deoarece masa nu a fost rezervata.");
        }
    }
}
