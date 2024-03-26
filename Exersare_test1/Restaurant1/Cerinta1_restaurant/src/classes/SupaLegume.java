package classes;

import java.util.List;

public class SupaLegume extends Supa {
    public SupaLegume(int nrPortii, List<String> ingrediente) {
        super(nrPortii, ingrediente);
    }

    @Override
    public void detaliiSupa() {
        System.out.println("Supa de legume are " + this.getNrPortii() + " portii si ingredientele: " + this.getIngrediente());
    }
}
