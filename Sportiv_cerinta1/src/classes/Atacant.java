package classes;

public class Atacant extends Sportiv {
    public Atacant(String nume, int varsta, String echipa) {
        super(nume, varsta, echipa);
    }

    @Override
    public void descrie() {
        System.out.println("Sportivul " + this.getNume() + " are varsta de " + this.getVarsta() + ", joaca la echipa " + this.getEchipa() + " si este atacant");
    }
}
