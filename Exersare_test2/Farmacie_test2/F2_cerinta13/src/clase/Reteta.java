package clase;

public class Reteta {
    private int numarReteta;
    private Stare stare;

    public Reteta(int numarReteta) {
        this.numarReteta = numarReteta;
        this.stare = new Emisa();
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void solicitaMedicamente() {
        if(this.stare instanceof Emisa) {
            this.stare = new Solicitata();
            System.out.println("Au fost solicitate medicamentele pentru reteta " + this.numarReteta);
        } else if(this.stare instanceof Solicitata) {
            System.out.println("Medicamentele pentru reteta " + this.numarReteta + " au fost deja solicitate");
        } else {
            System.out.println("Reteta nu a fost inca emisa");
        }
    }

    public void cumparaMedicamente() {
        if(this.stare instanceof Solicitata) {
            this.stare = new Achizitionata();
            System.out.println("Au fost achizitionate medicamentele pentru reteta " + this.numarReteta);
        } else {
            System.out.println("Nu pot fi achizitionate medicamentele.");
        }
    }
}
