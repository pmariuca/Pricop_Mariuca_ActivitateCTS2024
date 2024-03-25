package classes;

public class Client implements ClientAbstract {
    private String nume;
    private String numarTelefon;
    private String email;

    private Client() {
        this.nume = "";
        this.numarTelefon = "";
        this.email = "";
    }

    public Client(String nume, String numarTelefon, String email) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public void setEmail(String email) {
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
    public ClientAbstract clone() {
        Client client = new Client();
        client.setNume(this.nume);
        client.setEmail(this.email);
        client.setNumarTelefon(this.numarTelefon);

        return client;
    }
}
