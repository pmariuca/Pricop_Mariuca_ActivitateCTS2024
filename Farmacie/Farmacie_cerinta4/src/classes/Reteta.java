package classes;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaAbstracta {
    private String denumireMedicament;
    private Map<String, Double> cantitatiSolutii;

    public Reteta() {
        this.denumireMedicament = "";
        this.cantitatiSolutii = null;
    }

    public Reteta(String denumireMedicament, Map<String, Double> cantitatiSolutii) {
        this.denumireMedicament = denumireMedicament;

        this.cantitatiSolutii = new HashMap<>();
        for(String solutie : cantitatiSolutii.keySet()) {
            this.cantitatiSolutii.put(solutie, cantitatiSolutii.get(solutie));
        }
    }

    public String getDenumireMedicament() {
        return denumireMedicament;
    }

    public void setDenumireMedicament(String denumireMedicament) {
        this.denumireMedicament = denumireMedicament;
    }

    public Map<String, Double> getCantitatiSolutii() {
        return cantitatiSolutii;
    }

    public void setCantitatiSolutii(Map<String, Double> cantitatiSolutii) {
        this.cantitatiSolutii = new HashMap<>();
        for(String solutie : cantitatiSolutii.keySet()) {
            this.cantitatiSolutii.put(solutie, cantitatiSolutii.get(solutie));
        }
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "denumireMedicament='" + denumireMedicament + '\'' +
                ", cantitatiSolutii=" + cantitatiSolutii +
                '}';
    }

    @Override
    public RetetaAbstracta clone() {
        Reteta reteta = new Reteta();
        reteta.setDenumireMedicament(this.denumireMedicament);
        reteta.setCantitatiSolutii(this.cantitatiSolutii);
        return reteta;
    }
}
