package clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements StructuraAbstracta {
    private int numarLocuri;
    private List<StructuraAbstracta> listaNoduri;

    public Grup(int numarLocuri) {
        this.numarLocuri = numarLocuri;
        this.listaNoduri = new ArrayList<>();
    }

    @Override
    public int getNumarLocuri() {
        return numarLocuri;
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        if(sa instanceof Autobuz) {
            if(this.numarLocuri == sa.getNumarLocuri()) {
                this.listaNoduri.add(sa);
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new UnsupportedOperationException();
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
    public void afiseazaIerarhie(String indentare) {
        System.out.println(indentare + "Grupul de " + this.numarLocuri + " locuri contine:");
        for(StructuraAbstracta sa : listaNoduri) {
            sa.afiseazaIerarhie(indentare + "   ");
        }
    }
}
