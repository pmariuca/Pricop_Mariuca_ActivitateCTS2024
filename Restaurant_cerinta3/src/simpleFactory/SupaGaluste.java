package simpleFactory;

import java.util.List;

public class SupaGaluste extends Supa {
    public SupaGaluste(int nrPortii, List<String> ingrediente) {
        super(nrPortii, ingrediente);
    }

    @Override
    public void afisareIngrediente() {
        System.out.println("Supa de galuste are urmatoarele ingrediente: " + this.getIngrediente().toString());
    }
}
