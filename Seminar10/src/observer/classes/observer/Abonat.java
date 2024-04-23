package observer.classes.observer;

public class Abonat implements Observer {
    private String numeAbonat;

    public Abonat(String numeAbonat) {
        this.numeAbonat = numeAbonat;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.numeAbonat + " ai primit urmatorul mesaj: " + mesaj);
    }
}
