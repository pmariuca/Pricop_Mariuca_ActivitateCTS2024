package spital_cerinta4;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaAbstracta{
    private Map<String, Double> solutii;
    private String denumire;

    public Reteta() {
        this.solutii = null;
        denumire = "";
    }

    public Reteta(Map<String, Double> solutii, String denumire) {
        this.solutii = solutii;
        this.denumire = denumire;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii = new HashMap<>();

        for(String solutie : solutii.keySet()) {
            this.solutii.put(solutie, solutii.get(solutie));
        }
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "solutii=" + solutii +
                ", denumire='" + denumire + '\'' +
                '}';
    }

    @Override
    public RetetaAbstracta clone() {
        Reteta reteta = new Reteta();
        reteta.setDenumire(this.denumire);
        reteta.setSolutii(this.solutii);

        return reteta;
    }
}
