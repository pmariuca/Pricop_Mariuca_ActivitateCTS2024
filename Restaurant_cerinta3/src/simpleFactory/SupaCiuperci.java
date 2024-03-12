package simpleFactory;

import java.util.List;

public class SupaCiuperci extends Supa {
    public SupaCiuperci(int nrPortii, List<String> ingrediente) {
        super(nrPortii, ingrediente);
    }

    @Override
    public void afisareIngrediente() {
        System.out.println("Supa de ciuperci are urmatoarele ingrediente: " + this.getIngrediente().toString());
    }
}
