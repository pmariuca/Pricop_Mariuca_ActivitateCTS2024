package observer;

public class Pacient implements Observer {
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume + " ai primit urmatorul mesaj: " + mesaj);
    }
}
