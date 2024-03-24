package classes;

public class Portar extends Sportiv {
    public Portar(String nume, int varsta, String echipa) {
        super(nume, varsta, echipa);
    }

    @Override
    public void descrie() {
        System.out.println("Sportivul " + this.getNume() + " are varsta de " + this.getVarsta() + ", joaca la echipa " + this.getEchipa() + " si este portar");
    }
}
