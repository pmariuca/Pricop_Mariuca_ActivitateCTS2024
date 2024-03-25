package classes;

public class Tramvai extends MijlocTransport {
    public Tramvai(int an, String numeSofer, String numarInmatriculare) {
        super(an, numeSofer, numarInmatriculare);
    }

    @Override
    public void descrie() {
        System.out.println("Tramvaiul cu numarul " + this.getNumarInmatriculare() + " este din anul " + this.getAn() + " si este condus de soferul " + this.getNumeSofer());
    }
}
