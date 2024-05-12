package classes;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map<String, Flyweight> rezervari;

    public Fabrica() {
        this.rezervari = new HashMap<>();
    }

    public Flyweight getRezervare(String nume, String numarTelefon, String email) {
        String cheie = nume + "_" + numarTelefon;
        Flyweight flyweight = rezervari.get(cheie);

        if(flyweight == null) {
            flyweight = new Client(nume, numarTelefon, email);
            this.rezervari.put(cheie, flyweight);
        }

        return flyweight;
    }
}
