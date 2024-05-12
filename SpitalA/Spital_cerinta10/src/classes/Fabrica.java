package classes;

import java.util.HashMap;

public class Fabrica {
    private HashMap<String, Flyweight> pacienti;

    public Fabrica() {
        this.pacienti = new HashMap<>();
    }

    public Flyweight getPacient(String nume, String numarTelefon, String adresa) {
        String cheie = nume + "_" + numarTelefon;

        Flyweight flyweight = pacienti.get(cheie);
        if(flyweight == null) {
            flyweight = new Pacient(nume, numarTelefon, adresa);
            pacienti.put(cheie, flyweight);
        }

        return flyweight;
    }
}
