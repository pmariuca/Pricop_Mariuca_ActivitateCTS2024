package clase;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map<String, Flyweight> listaClienti;

    public Fabrica() {
        this.listaClienti = new HashMap<>();
    }

    public Flyweight getClient(String nume, int numarAsigurare) {
        String cheie = nume + "_" + numarAsigurare;
        Flyweight client = this.listaClienti.get(cheie);

        if(client == null) {
            client = new Client(nume, numarAsigurare);
            this.listaClienti.put(cheie, client);
        }

        return client;
    }
}
