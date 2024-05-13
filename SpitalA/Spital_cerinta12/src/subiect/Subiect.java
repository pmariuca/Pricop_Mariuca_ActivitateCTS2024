package subiect;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observer> listaObserveri = new ArrayList<>();

    public void adaugaObserver(Observer observer) {
        this.listaObserveri.add(observer);
    }

    public void stergeObserver(Observer observer) {
        if(this.listaObserveri.contains(observer)) {
            this.listaObserveri.remove(observer);
        }
    }

    public void notificaObserver(String mesaj) {
        for(Observer observer : listaObserveri) {
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaVirus();
    public abstract void notificaEpidemie();
}
