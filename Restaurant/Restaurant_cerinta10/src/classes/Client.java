package classes;

public class Client implements Flyweight {
    private String nume;
    private String numarTelefon;
    private String email;

    public Client(String nume, String numarTelefon, String email) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void rezerva(Optiuni optiuni) {
        System.out.println(this.toString() + "\n" + optiuni.toString());
    }
}
