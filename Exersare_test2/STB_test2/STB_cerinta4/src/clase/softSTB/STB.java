package clase.softSTB;

public class STB implements Calatorie {
    private String numeStatie;

    public STB(String numeStatie) {
        this.numeStatie = numeStatie;
    }

    public String getNumeStatie() {
        return numeStatie;
    }

    @Override
    public void valideazaBilet(BiletSTB bilet) {
        System.out.println("La statia " + this.numeStatie + " de STB a fost validat biletul cu id-ul " + bilet.getId());
    }
}
