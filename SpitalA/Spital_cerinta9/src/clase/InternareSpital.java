package clase;

public class InternareSpital implements Internare {
    private int nrZile;

    public InternareSpital(int nrZile) {
        this.nrZile = nrZile;
    }

    @Override
    public void interneaza(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat pentru " + this.nrZile + " zile.");
    }
}
