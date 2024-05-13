package clase;

public class Pacient {
    private Strategy plata;
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
        this.plata = new StrategyCash();
    }

    public Pacient(Strategy plata, String nume) {
        this.plata = plata;
        this.nume = nume;
    }

    public void setPlata(Strategy plata) {
        this.plata = plata;
    }

    public void plateste() {
        System.out.println(this.nume + ":");
        this.plata.efectueazaPlata();
        System.out.println();
    }
}
