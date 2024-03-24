package prototype;

import java.util.ArrayList;
import java.util.List;

public class Client extends ClientAbstract {
    private String nume;
    private String prenume;
    private String email;
    private String numarTelefon;
    private int anInregistrare;

    private List<String> dateRezervari;

    public Client() {
        this.nume = "";
        this.prenume = "";
        this.email = "";
        this.numarTelefon = "";
        this.anInregistrare = 0;
        this.dateRezervari = null;
    }

    public Client(String nume, String prenume, String email, String numarTelefon, int anInregistrare, List<String> dateRezervari) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.numarTelefon = numarTelefon;
        this.anInregistrare = anInregistrare;
        this.dateRezervari = new ArrayList<String>();
        this.dateRezervari.addAll(dateRezervari);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public int getAnInregistrare() {
        return anInregistrare;
    }

    public void setAnInregistrare(int anInregistrare) {
        this.anInregistrare = anInregistrare;
    }

    public List<String> getDateRezervari() {
        return dateRezervari;
    }

    public void setDateRezervari(List<String> dateRezervari) {
        this.dateRezervari = new ArrayList<String>();
        this.dateRezervari.addAll(dateRezervari);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", email='" + email + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                ", anInregistrare=" + anInregistrare +
                ", dateRezervari=" + dateRezervari +
                '}';
    }

    @Override
    public ClientAbstract clone() {
        Client client = new Client();
        client.setNume(this.getNume());
        client.setPrenume(this.getPrenume());
        client.setEmail(this.getEmail());
        client.setNumarTelefon(this.getNumarTelefon());
        client.setAnInregistrare(this.getAnInregistrare());
        client.setDateRezervari(this.getDateRezervari());

        return client;
    }
}
