package clase;

import java.util.ArrayList;
import java.util.List;

public class Unitate implements StructuraAbstracta {
    private String nume;
    private List<StructuraAbstracta> listaNoduri;

    public Unitate(String nume) {
        this.nume = nume;
        this.listaNoduri = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        if(sa instanceof Grup) {
            this.listaNoduri.add(sa);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        if(this.listaNoduri.contains(sa)) {
            this.listaNoduri.remove(sa);
        }
    }

    @Override
    public StructuraAbstracta getNodStructura(int index) {
        if(index >= 0 && index < this.listaNoduri.size()) {
            return this.listaNoduri.get(index);
        }
        return null;
    }

    @Override
    public int getNumarLocuri() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaIerarhie(String indentare) {
        System.out.println(indentare + "Unitatea " + this.nume + " are urmatoarele:");
        for(StructuraAbstracta sa : listaNoduri) {
            sa.afiseazaIerarhie(indentare + "   ");
        }
    }
}
