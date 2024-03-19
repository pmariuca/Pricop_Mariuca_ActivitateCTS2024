package spital_cerinta4;

import java.util.Map;

public class RetetaCrema implements RetetaAbstracta {
    private double cantitate;
    private String denumire;

    public RetetaCrema() {
        this.cantitate = 0.0;
        this.denumire = "";
    }

    public RetetaCrema(double cantitate, String denumire) {
        this.cantitate = cantitate;
        this.denumire = denumire;
    }

    public void setCantitate(double cantitate) {
        this.cantitate = cantitate;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        return "RetetaCrema{" +
                "cantitate=" + cantitate +
                ", denumire='" + denumire + '\'' +
                '}';
    }

    @Override
    public RetetaAbstracta clone() {
        RetetaCrema reteta = new RetetaCrema();
        reteta.setCantitate(this.cantitate);
        reteta.setDenumire(this.denumire);

        return reteta;
    }
}
