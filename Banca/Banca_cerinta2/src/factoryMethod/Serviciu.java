package factoryMethod;

public abstract class Serviciu {
    private String denumire;
    private String data;

    public Serviciu(String denumire, String data) {
        this.denumire = denumire;
        this.data = data;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getData() {
        return data;
    }

    public abstract void afisareDetalii();
}
