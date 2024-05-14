package clase;

public interface StructuraAbstracta {
    public void adaugaStructura(StructuraAbstracta sa);
    public void stergeStructura(StructuraAbstracta sa);
    public StructuraAbstracta getNodStructura(int index);
    public int getNumarLocuri();
    public void afiseazaIerarhie(String indentare);
}
