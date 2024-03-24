package classes;

public abstract class Sportiv {
    private String nume;
    private int varsta;
    private String echipa;

    public Sportiv(String nume, int varsta, String echipa) {
        this.nume = nume;
        this.varsta = varsta;
        this.echipa = echipa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getEchipa() {
        return echipa;
    }

    public void setEchipa(String echipa) {
        this.echipa = echipa;
    }



    public abstract void descrie();
}
