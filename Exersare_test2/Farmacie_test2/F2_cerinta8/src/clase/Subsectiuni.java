package clase;

public class Subsectiuni extends StructuraAbstracta {
    public Subsectiuni(String nume) {
        super(nume);
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        throw new IllegalArgumentException();
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        throw new IllegalArgumentException();
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        throw new IllegalArgumentException();
    }

    @Override
    public void afiseazaStructura(String indentare) {
        System.out.println(indentare + "Subsectiunea " + this.getNume());
    }
}
