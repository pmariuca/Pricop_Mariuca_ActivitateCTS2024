package observer.classes.subject;

import observer.classes.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observeri = new ArrayList<>();

    public void adaugaObservator(Observer observer) {
        this.observeri.add(observer);
    }

    public void stergeObservator(Observer observer) {
        this.observeri.remove(observer);
    }

    public void trimiteNotificare(String mesaj) {
        for(Observer o : observeri) {
            o.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaMeciFotbal();
    public abstract void notificaMeciVolei();
    public abstract void notificaMeciHandbal();
}
