package clase.observer;

public class Client implements Observer {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void notifica(String mesaj) {
        System.out.println(this.nume + " ai primit urmatorul mesaj: " + mesaj);
    }
}
