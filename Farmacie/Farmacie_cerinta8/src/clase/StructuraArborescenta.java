package clase;

public abstract class StructuraArborescenta {
    private String denumire;

    public StructuraArborescenta(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public abstract void adaugaStructura(StructuraArborescenta structuraArborescenta);
    public abstract void stergeStructura(StructuraArborescenta structuraArborescenta);
    public abstract StructuraArborescenta getStructura(int index);
    public abstract void afiseazaStructura(String indentare);
}
