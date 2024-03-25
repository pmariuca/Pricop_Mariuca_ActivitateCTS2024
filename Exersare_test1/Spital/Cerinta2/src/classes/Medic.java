package classes;

public class Medic extends PersonalSpital {
    public Medic(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void descriere() {
        System.out.println("Medicul " + this.getNume() + " are varsta de " + this.getVarsta() + " ani.");
    }
}
