package subiect;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observer> listaObserveri = new ArrayList<>();
    public void adaugaObserver(Observer observer) {
        listaObserveri.add(observer);
    }

    public void stergeObserver(Observer observer) {
        if(listaObserveri.contains(observer)) {
            listaObserveri.remove(observer);
        }
    }

    public void notificaObserver(String mesaj) {
        for(Observer observer : listaObserveri) {
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaOferta();
    public abstract void notificaMeniu();
}
