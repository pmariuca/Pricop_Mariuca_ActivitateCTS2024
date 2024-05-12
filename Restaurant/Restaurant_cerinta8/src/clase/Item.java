package clase;

public class Item extends StructuraAbstracta {
    public Item(String denumire) {
        super(denumire);
    }

    @Override
    public void adaugaStructura(StructuraAbstracta structuraAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeStructura(StructuraAbstracta structuraAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisare(String indentare) {
        System.out.println(indentare + "Sectiunea " + super.getDenumire());
    }
}
