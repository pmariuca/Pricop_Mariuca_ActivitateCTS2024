package classes;

public abstract class MijlocTransport {
    private int an;
    private String numeSofer;
    private String numarInmatriculare;

    public MijlocTransport(int an, String numeSofer, String numarInmatriculare) {
        this.an = an;
        this.numeSofer = numeSofer;
        this.numarInmatriculare = numarInmatriculare;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public String getNumarInmatriculare() {
        return numarInmatriculare;
    }

    public void setNumarInmatriculare(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    @Override
    public String toString() {
        return "MijlocTransport{" +
                "an=" + an +
                ", numeSofer='" + numeSofer + '\'' +
                ", numarInmatriculare='" + numarInmatriculare + '\'' +
                '}';
    }

    public abstract void descrie();
}
