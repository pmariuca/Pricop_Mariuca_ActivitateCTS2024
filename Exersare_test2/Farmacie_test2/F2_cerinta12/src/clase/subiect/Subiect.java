package clase.subiect;

import clase.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observer> observatori;

    public Subiect() {
        this.observatori = new ArrayList<>();
    }

    public void abonareObservator(Observer observer) {
        this.observatori.add(observer);
    }

    public void stergeObservator(Observer observer) {
        if(this.observatori.contains(observer)) {
            this.observatori.remove(observer);
        }
    }

    public void notificaObservatori(String mesaj) {
        for(Observer o : observatori) {
            o.notifica(mesaj);
        }
    }

    public abstract void notificaOferta();
}
