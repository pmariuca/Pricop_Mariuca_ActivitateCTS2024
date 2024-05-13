package clase;

public class Masa {
    private int nrMasa;
    private Stare stare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare = new Libera();
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void rezervaMasa() {
        if(stare instanceof Libera) {
            this.stare = new Rezervata();
            System.out.println("Masa cu numarul " + this.nrMasa + " a fost rezervata.");
        } else {
            System.out.println("Masa cu numarul " + this.nrMasa + " este deja rezervata.");
        }
    }

    public void ridicaRezervare() {
        if(stare instanceof Rezervata) {
            this.stare = new Ocupata();
            System.out.println("Rezervarea pentru masa " + this.nrMasa + " a fost ridicata.");
        } else {
            System.out.println("Masa cu numarul " + this.nrMasa + " nu a fost rezervata.");
        }
    }

    public void elibereazaMasa() {
        if(stare instanceof Ocupata) {
            this.stare = new Libera();
            System.out.println("Masa cu numarul " + this.nrMasa + " a fost eliberata.");
        } else {
            System.out.println("Masa cu numarul " + this.nrMasa + " nu a fost ocupata.");
        }
    }
}
