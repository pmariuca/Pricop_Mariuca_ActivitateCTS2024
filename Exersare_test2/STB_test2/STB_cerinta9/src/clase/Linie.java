package clase;

public class Linie implements Flyweight {
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void inregistreazaAutobuz(Autobuz autobuz) {
        System.out.println("Linia cu nr. " + this.nrLinie + " cu prima statie " + this.primaStatie + " si ultima " + this.ultimaStatie + " are autobuzul " + autobuz.toString());
    }
}
