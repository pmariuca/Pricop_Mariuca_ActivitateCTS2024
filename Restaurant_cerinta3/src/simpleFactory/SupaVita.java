package simpleFactory;

import java.util.List;

public class SupaVita extends Supa {
    public SupaVita(int nrPortii, List<String> ingrediente) {
        super(nrPortii, ingrediente);
    }

    @Override
    public void afisareIngrediente() {
        System.out.println("Supa de vita are urmatoarele ingrediente: " + this.getIngrediente().toString());
    }
}
