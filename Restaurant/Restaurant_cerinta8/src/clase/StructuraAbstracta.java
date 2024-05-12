package clase;

public abstract class StructuraAbstracta {
    // sectiile din meniu
    private String denumire;

    public StructuraAbstracta(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public abstract void adaugaStructura(StructuraAbstracta structuraAbstracta);
    public abstract void stergeStructura(StructuraAbstracta structuraAbstracta);
    public abstract StructuraAbstracta getStructura(int index);
    public abstract void afisare(String indentare);
}
