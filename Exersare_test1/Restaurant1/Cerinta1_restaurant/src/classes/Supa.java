package classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Supa {
    private int nrPortii;
    private List<String> ingrediente;

    public Supa(int nrPortii, List<String> ingrediente) {
        this.nrPortii = nrPortii;
        this.ingrediente = new ArrayList<>();
        ingrediente.forEach(ingredient -> {
            this.ingrediente.add(ingredient);
        });
    }

    public int getNrPortii() {
        return nrPortii;
    }

    public List<String> getIngrediente() {
        return ingrediente;
    }

    public abstract void detaliiSupa();
}
