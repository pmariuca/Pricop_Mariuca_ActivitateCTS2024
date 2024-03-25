package classes;

public abstract class PersonalSpital {
    private String nume;
    private int varsta;

    public PersonalSpital(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }


    public int getVarsta() {
        return varsta;
    }

    public abstract void descriere();
}
