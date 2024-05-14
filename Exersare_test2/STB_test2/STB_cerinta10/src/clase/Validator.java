package clase;

public class Validator {
    private Algoritm algoritm;
    private int id;

    public Validator(Algoritm algoritm, int id) {
        this.algoritm = algoritm;
        this.id = id;
    }

    public Validator(int id) {
        this.id = id;
        this.algoritm = new CardCalatorii();
    }

    public void setAlgoritm(Algoritm algoritm) {
        this.algoritm = algoritm;
    }

    public void valideazaCalatorie(int id) {
        System.out.print("La validatorul cu id-ul " + this.id);
        this.algoritm.valideaza(id);
    }
}
