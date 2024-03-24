package simpleFactory;

import java.util.List;

public class SupaLegume extends Supa {
    public SupaLegume(int nrPortii, List<String> ingrediente) {
        super(nrPortii, ingrediente);
    }

    @Override
    public void afisareIngrediente() {
        System.out.println("Supa de legume are urmatoarele ingrediente: " + this.getIngrediente().toString());
    }
}
