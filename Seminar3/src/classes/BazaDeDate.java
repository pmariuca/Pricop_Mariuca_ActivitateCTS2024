package classes;

public class BazaDeDate {
    private static BazaDeDate instance = null;
    private String nume;
    private int nrTabele;
    private String linkConexiune;

    private BazaDeDate(String nume, int nrTabele, String linkConexiune) {
        this.nume = nume;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }

    @Override
    public String toString() {
        return "BazaDeDate{" +
                "nume='" + nume + '\'' +
                ", nrTabele=" + nrTabele +
                ", linkConexiune='" + linkConexiune + '\'' +
                '}';
    }

    public static synchronized BazaDeDate getInstance(String nume, int nrTabele, String linkConexiune) {
        if(instance == null) {
            instance = new BazaDeDate(nume, nrTabele, linkConexiune);
        }

        return instance;
    }
}
