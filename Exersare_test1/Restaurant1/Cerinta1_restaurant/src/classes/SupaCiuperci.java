package classes;

import java.util.List;

public class SupaCiuperci extends Supa {
    public SupaCiuperci(int nrPortii, List<String> ingrediente) {
        super(nrPortii, ingrediente);
    }

    @Override
    public void detaliiSupa() {
        System.out.println("Supa de ciuperci are " + this.getNrPortii() + " portii si ingredientele: " + this.getIngrediente());
    }
}
