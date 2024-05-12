package clase;

import java.util.ArrayList;
import java.util.List;

public class Meniu extends StructuraAbstracta {
    private List<StructuraAbstracta> listaStructuri;

    public Meniu(String denumire) {
        super(denumire);
        this.listaStructuri = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraAbstracta structuraAbstracta) {
        this.listaStructuri.add(structuraAbstracta);
    }

    @Override
    public void stergeStructura(StructuraAbstracta structuraAbstracta) {
        if(this.listaStructuri.contains(structuraAbstracta)) {
            this.listaStructuri.remove(structuraAbstracta);
        }
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        if(index >= 0 && index < this.listaStructuri.size()) {
            return this.listaStructuri.get(index);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void afisare(String indentare) {
        System.out.println(indentare + "Sectiunea " + super.getDenumire() + " are urmatoarele componente: ");
        for(StructuraAbstracta sa : listaStructuri) {
            sa.afisare(indentare + "      ");
        }
    }
}
