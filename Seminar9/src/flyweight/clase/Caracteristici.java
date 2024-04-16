package flyweight.clase;

public class Caracteristici {
    private int pozx;
    private int pozy;
    private String culoare;

    public Caracteristici(int pozx, int pozy, String culoare) {
        this.pozx = pozx;
        this.pozy = pozy;
        this.culoare = culoare;
    }

    public int getPozx() {
        return pozx;
    }

    public int getPozy() {
        return pozy;
    }

    public String getCuloare() {
        return culoare;
    }

    @Override
    public String toString() {
        return "Caracteristici: " +
                "pozx=" + pozx +
                ", pozy=" + pozy +
                ", culoare=" + culoare;
    }
}
