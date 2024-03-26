package classes;

public class Client extends IClient {
    private String nume;
    private String numarTelefon;
    private String email;

    public Client() {
        this.nume = "Necunoscut";
        this.numarTelefon = "Necunoscut";
        this.email = "Necunoscut";
    }

    public Client(String nume, String numarTelefon, String email) {
        this.nume = nume;

        if(numarTelefon.length() == 10 && numarTelefon.startsWith("07")) {
            this.numarTelefon = numarTelefon;
        } else {
            this.numarTelefon = "Necunoscut";
        }

        if(email.contains("@yahoo") || email.contains("@gmail")) {
            this.email = email;
        } else {
            this.email = "Necunoscut";
        }
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
    public IClient clone() {
        Client client = new Client();
        client.setNume(this.nume);
        client.setNumarTelefon(this.numarTelefon);
        client.setEmail(this.email);

        return client;
    }
}
