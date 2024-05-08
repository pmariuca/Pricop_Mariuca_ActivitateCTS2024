package state.classes;

public class Pacient {
    private String nume;
    private Stare stare;

    public Pacient(String nume) {
        this.nume = nume;
        this.stare = new Internat();
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public Stare getStare() {
        return stare;
    }

    public void seAgraveazaStarea() {
        if(this.stare instanceof Internat) {
            new SubObservatie().setStare(this);
            System.out.println("Starea de sanatate a pacientului " + this.nume + " s-a gravat.");
        } else {
            System.out.println("Pacientul " + this.nume + " nu era in stare grava.");
        }
    }

    public void seImbunatatesteStarea() {
        if(this.stare instanceof SubObservatie) {
            new Internat().setStare(this);
            System.out.println("Starea de sanatate a pacientului " + this.nume + " s-a imbunatatit.");
        } else {
            System.out.println("Pacientul " + this.nume + " nu este internat.");
        }
    }

    public void seVindeca() {
        if(this.stare instanceof Internat) {
            new Externat().setStare(this);
            System.out.println("Pacientul " + this.nume + " a fost externat.");
        } else {
            System.out.println("Pacientul " + this.nume + " nu poate fi externat.");
        }
    }
}
