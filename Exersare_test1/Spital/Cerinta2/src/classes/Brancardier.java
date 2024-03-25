package classes;

public class Brancardier extends PersonalSpital {
    public Brancardier(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void descriere() {
        System.out.println("Brancardierul " + this.getNume() + " are varsta de " + this.getVarsta() + " ani.");
    }
}
