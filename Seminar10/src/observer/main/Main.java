package observer.main;

import observer.classes.observer.Abonat;
import observer.classes.observer.Observer;
import observer.classes.observer.Vecin;
import observer.classes.subject.Sala;
import observer.classes.subject.Stadion;
import observer.classes.subject.Subject;

public class Main {
    public static void main(String[] args) {
        // sportiv cerinta 12
        Subject sala = new Sala("Ion Angelescu");

        Observer abonat1 = new Abonat("Popescu Ion");
        Observer abonat2 = new Abonat("Popescu Georgiana");
        Observer vecin1 = new Vecin(0.2);

        sala.adaugaObservator(abonat1);
        sala.adaugaObservator(abonat2);
        sala.adaugaObservator(vecin1);

        sala.notificaMeciFotbal();

        Subject stadion = new Stadion("Imperial");
        stadion.adaugaObservator(abonat1);
        stadion.adaugaObservator(abonat2);
        stadion.adaugaObservator(vecin1);
        ((Stadion)stadion).notificaConcert();
    }
}