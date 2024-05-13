package clase;

import java.util.ArrayList;
import java.util.List;

public class Sectie extends StructuraAbstracta {
    private List<StructuraAbstracta> listaNoduri;

    public Sectie(String nume) {
        super(nume);
        this.listaNoduri = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        this.listaNoduri.add(sa);
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        if(index >= 0 && index < listaNoduri.size()) {
            return listaNoduri.get(index);
        } else {
            return null;
        }
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        if(this.listaNoduri.contains(sa)) {
            this.listaNoduri.remove(sa);
        }
    }

    @Override
    public void afiseazaStructura(String indentare) {
        System.out.println(indentare + "Sectiunea " + this.getNume() + " are urmatoarele sectiuni:");
        for (StructuraAbstracta sa : listaNoduri) {
            sa.afiseazaStructura(indentare + "  ");
        }
    }
}
