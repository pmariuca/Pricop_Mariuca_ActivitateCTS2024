package clase;

public class Autobuz {
    private String model;
    private int anFabricatie;
    private int nrLocuri;

    public Autobuz(String model, int anFabricatie, int nrLocuri) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz: " +
                "model=" + model +
                ", anFabricatie=" + anFabricatie +
                ", nrLocuri=" + nrLocuri;
    }
}
