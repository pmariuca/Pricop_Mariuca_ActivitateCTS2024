package clase;

public class Masa extends Template {
    private int nrMasa;
    private Grup grup;

    public Masa(int nrMasa, Grup grup) {
        this.nrMasa = nrMasa;
        this.grup = grup;
    }

    @Override
    public void curataMasa() {
        System.out.println("Se curata masa cu numarul " + this.nrMasa + ".");
    }

    @Override
    public void asazaServetele() {
        System.out.println("Se asaza servetelele pe masa cu numarul " + this.nrMasa + ".");
    }

    @Override
    public void asazaTacamuri() {
        System.out.println("Se asaza tacamurile pe masa cu numarul " + this.nrMasa + ".");
    }

    @Override
    public void invitaPersoane() {
        System.out.println("La masa cu numarul " + this.nrMasa + " sunt invitati: ");
        grup.getPersoane();
    }
}
