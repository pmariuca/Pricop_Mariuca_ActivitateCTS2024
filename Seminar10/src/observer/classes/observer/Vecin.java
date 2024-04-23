package observer.classes.observer;

public class Vecin implements Observer {
    private double distanta;

    public Vecin(double distanta) {
        this.distanta = distanta;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Sala aflata la o distanta de " + this.distanta +
                " km de tine a trimis catre abonati urmatorul mesaj " + mesaj);
    }
}
