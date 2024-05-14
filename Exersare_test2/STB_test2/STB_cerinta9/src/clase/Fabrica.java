package clase;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map<String, Flyweight> colectieLinii;

    public Fabrica() {
        this.colectieLinii = new HashMap<>();
    }

    public Flyweight getLinie(int nrLinie, String primaStatie, String ultimaStatie) {
        String cheie = nrLinie + "_" + primaStatie;
        Flyweight flyweight = this.colectieLinii.get(cheie);

        if(flyweight == null) {
            flyweight = new Linie(nrLinie, primaStatie, ultimaStatie);
            this.colectieLinii.put(cheie, flyweight);
        }

        return flyweight;
    }
}
