package clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends StructuraArborescenta {
    private List<StructuraArborescenta> listaStructuri;
    public Sectiune(String denumire) {
        super(denumire);
        this.listaStructuri = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraArborescenta structuraArborescenta) {
        this.listaStructuri.add(structuraArborescenta);
    }

    @Override
    public void stergeStructura(StructuraArborescenta structuraArborescenta) {
        if(this.listaStructuri.contains(structuraArborescenta)) {
            this.listaStructuri.remove(structuraArborescenta);
        }
    }

    @Override
    public StructuraArborescenta getStructura(int index) {
        if(index >= 0 && index < this.listaStructuri.size()) {
            return this.listaStructuri.get(index);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void afiseazaStructura(String indentare) {
        System.out.println(indentare + "Sectiunea " + super.getDenumire() + " contine urmatoarele:");
        for(StructuraArborescenta sa : listaStructuri) {
            sa.afiseazaStructura(indentare + "      ");
        }
    }
}
