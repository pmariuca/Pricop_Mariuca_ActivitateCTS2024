package clase.softMetrorex;

public class Metrorex {
    private String numeStatie;

    public Metrorex(String numeStatie) {
        this.numeStatie = numeStatie;
    }

    public String getNumeStatie() {
        return numeStatie;
    }
    public void scaneazaBilet(BiletMetrorex bilet) {
        System.out.println("Biletul cu id-ul " + bilet.getId() + " a fost validat la statia de metrou " + this.numeStatie);
    }
}
