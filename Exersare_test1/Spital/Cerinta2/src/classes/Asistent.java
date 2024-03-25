package classes;

public class Asistent extends PersonalSpital {
    public Asistent(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void descriere() {
        System.out.println("Asistentul " + this.getNume() + " are varsta de " + this.getVarsta() + " ani.");
    }
}
