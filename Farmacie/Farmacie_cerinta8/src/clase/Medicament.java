package clase;

public class Medicament extends StructuraArborescenta {
    public Medicament(String denumire) {
        super(denumire);
    }

    @Override
    public void adaugaStructura(StructuraArborescenta structuraArborescenta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeStructura(StructuraArborescenta structuraArborescenta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraArborescenta getStructura(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaStructura(String indentare) {
        System.out.println(indentare + "Medicamentul " + super.getDenumire());
    }
}
