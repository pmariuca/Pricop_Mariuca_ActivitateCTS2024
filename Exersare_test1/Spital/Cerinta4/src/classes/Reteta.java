package classes;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaAbstracta {
    private String denumire;
    private Map<String, Double> solutii;

    public Reteta(String denumire, Map<String, Double> solutii) {
        this.denumire = denumire;
        this.solutii = solutii;
    }

    public Reteta() {
        this.denumire = "";
        this.solutii = null;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii = new HashMap<>();
        for(String solutie : solutii.keySet()) {
            this.solutii.put(solutie, solutii.get(solutie));
        }
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "denumire='" + denumire + '\'' +
                ", solutii=" + solutii +
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
