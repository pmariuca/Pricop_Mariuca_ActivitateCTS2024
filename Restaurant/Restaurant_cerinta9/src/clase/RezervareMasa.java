package clase;

public class RezervareMasa implements Rezervare {
    private int nrMasa;

    public RezervareMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    @Override
    public void rezerva(Client client) {
        System.out.println("Clientul " + client.getNume() + " a rezervat masa cu nr. " + this.nrMasa + " pentru " + client.getNrPersoane() + " persoane.");
    }
}
