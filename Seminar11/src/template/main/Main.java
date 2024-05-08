package template.main;

import template.classes.Pacient;
import template.classes.SpitalPublic;

public class Main {
    public static void main(String[] args) {
        // spital cerinta 14
        // pasi de parcurs intr-o anumita ordine

        SpitalPublic spitalPublic = new SpitalPublic("Spital 1", 2);
        Pacient pacient1 = new Pacient("Popescu Ion");
        spitalPublic.internare(pacient1);

        Pacient pacient2 = new Pacient("Dan Maria");
        spitalPublic.internare(pacient2);

        Pacient pacient3 = new Pacient("Dinu Mihai");
        spitalPublic.internare(pacient3);
    }
}
