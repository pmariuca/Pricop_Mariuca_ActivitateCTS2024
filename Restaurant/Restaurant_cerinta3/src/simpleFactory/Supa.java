package simpleFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Supa {
    private int nrPortii;
    List<String> ingrediente = new ArrayList<>();

    public Supa(int nrPortii, List<String> ingrediente) {
        this.nrPortii = nrPortii;
        this.ingrediente = ingrediente;
    }

    public int getNrPortii() {
        return nrPortii;
    }

    public List<String> getIngrediente() {
        return ingrediente;
    }

    public abstract void afisareIngrediente();
}
