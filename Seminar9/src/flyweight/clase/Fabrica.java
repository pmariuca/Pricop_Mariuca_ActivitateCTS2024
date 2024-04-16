package flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map<String, Flyweight> spectatori;

    public Fabrica() {
        this.spectatori = new HashMap<String, Flyweight>();
    }

    public Flyweight getSpectator(int inaltime, int latime) {
        String cheie = String.valueOf(inaltime) + "_" + String.valueOf(latime);

        Flyweight flyweight = spectatori.get(cheie);
        if(flyweight == null) {
            flyweight = new Spectator(inaltime, latime);
            this.spectatori.put(cheie, flyweight);
        }

        return flyweight;
    }
}
