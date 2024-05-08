package template.classes;

public class SpitalPublic extends Template {
    private String nume;
    private int nrPaturiDisponibile;

    public SpitalPublic(String nume, int nrPaturiDisponibile) {
        this.nume = nume;
        this.nrPaturiDisponibile = nrPaturiDisponibile;
    }

    @Override
    protected void analizaSanatate(Pacient pacient) {
        pacient.setStareSanatate((pacient.getNume().length() % 5) + 1);
        System.out.println(pacient.getNume() + " are starea de sanatate " + pacient.getStareSanatate());
    }

    @Override
    protected int disponibilitatePaturi() {
        return this.nrPaturiDisponibile;
    }

    @Override
    protected void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " este internat in spitalul " + this.nume);
        this.nrPaturiDisponibile--;
    }

    @Override
    protected void refuzaInternare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " nu poate fi internat in spitalul " + this.nume + " si va fi trimis la alt spital.");
    }
}
