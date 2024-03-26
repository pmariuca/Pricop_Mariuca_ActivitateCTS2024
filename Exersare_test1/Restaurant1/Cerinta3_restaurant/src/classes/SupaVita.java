package classes;

import java.util.List;

public class SupaVita extends Supa {
    public SupaVita(int nrPortii, List<String> ingrediente) {
        super(nrPortii, ingrediente);
    }

    @Override
    public void detaliiSupa() {
        System.out.println("Supa de vita are " + this.getNrPortii() + " portii si ingredientele: " + this.getIngrediente());
    }
}
