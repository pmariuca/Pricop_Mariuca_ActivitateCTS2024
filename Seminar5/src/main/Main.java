package main;

import spital_cerinta1.Pacient;
import spital_cerinta1.PacientBuilder;
import spital_cerinta4.Reteta;
import spital_cerinta4.RetetaAbstracta;
import spital_cerinta4.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new PacientBuilder().setHalatInterior(false).setMicDejun(false).setPapuciCamera(false).setPatRabatabil(false).build();
        System.out.println(pacient.toString());

        spital_cerinta1_v2.Pacient.PacientBuilder builder = new spital_cerinta1_v2.Pacient.PacientBuilder();
        spital_cerinta1_v2.Pacient pacient_v2 = builder.setHalatInterior(true).setMicDejun(true).setPatRabatabil(false).setPapuciCamera(false).build();
        System.out.println(pacient_v2.toString());


        Map<String, Double> solutii = new HashMap<>();
        solutii.put("paracetamol", 500.0);
        solutii.put("povidona", 30.0);
        solutii.put("amidon de porumb", 20.0);

        Reteta prototip = new Reteta(solutii, "Paracetamol");
        System.out.println(prototip.toString());

        RetetaAbstracta reteta2 = prototip.clone();
        System.out.println(reteta2.toString());

        RetetaCrema prototipCrema = new RetetaCrema(25.05, "Crema maini");
        System.out.println(prototipCrema.toString());

        RetetaAbstracta reteta3 = prototipCrema.clone();
        System.out.println(reteta3.toString());
    }
}
