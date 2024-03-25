package classes;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(int an, String numeSofer, String numarInmatriculare) {
        super(an, numeSofer, numarInmatriculare);
    }

    @Override
    public void descrie() {
        System.out.println("Troleibuz cu numarul " + this.getNumarInmatriculare() + " este din anul " + this.getAn() + " si este condus de soferul " + this.getNumeSofer());
    }
}
