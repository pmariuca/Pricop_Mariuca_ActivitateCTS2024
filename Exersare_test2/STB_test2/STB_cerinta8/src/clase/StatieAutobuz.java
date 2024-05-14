package clase;

public class StatieAutobuz {
    private String nume;
    private boolean suntCalatori;

    public StatieAutobuz(String nume, boolean suntCalatori) {
        this.nume = nume;
        this.suntCalatori = suntCalatori;
    }

    public String getNume() {
        return nume;
    }

    public boolean isSuntCalatori() {
        return suntCalatori;
    }

    public void setSuntCalatori(boolean suntCalatori) {
        this.suntCalatori = suntCalatori;
    }
}
