package clase;

public class Client {
    private String nume;
    private int nrPersoane;

    public Client(String nume, int nrPersoane) {
        this.nume = nume;
        this.nrPersoane = nrPersoane;
    }

    public String getNume() {
        return nume;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }
}
