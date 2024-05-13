package clase;

import java.util.ArrayList;
import java.util.List;

public class Grup {
    private List<String> persoane;

    public Grup() {
        this.persoane = new ArrayList<>();
    }
    public void adaugaPersoana(String nume) {
        this.persoane.add(nume);
    }

    public void getPersoane() {
        for(String persoana : persoane) {
            System.out.print(persoana);
            if(!this.persoane.getLast().equals(persoana)) {
                System.out.print(", ");
            }
        }
    }
}
