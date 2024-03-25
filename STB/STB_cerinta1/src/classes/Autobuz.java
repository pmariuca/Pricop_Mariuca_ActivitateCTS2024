package classes;

public class Autobuz extends MijlocTransport {
    public Autobuz(int an, String numeSofer, String numarInmatriculare) {
        super(an, numeSofer, numarInmatriculare);
    }

    @Override
    public void descrie() {
        System.out.println("Autobuzul cu numarul " + this.getNumarInmatriculare() + " este din anul " + this.getAn() + " si este condus de soferul " + this.getNumeSofer());
    }
}
