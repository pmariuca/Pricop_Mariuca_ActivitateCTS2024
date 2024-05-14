package clase;

public class Autobuz implements StructuraAbstracta {
    private String producator;
    private String model;
    private int numarLocuri;

    public Autobuz(String producator, String model, int numarLocuri) {
        this.producator = producator;
        this.model = model;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbstracta getNodStructura(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getNumarLocuri() {
        return this.numarLocuri;
    }

    @Override
    public void afiseazaIerarhie(String indentare) {
        System.out.println(indentare + "Autobuzul de la " + this.producator + ", modelul " + this.model);
    }
}
