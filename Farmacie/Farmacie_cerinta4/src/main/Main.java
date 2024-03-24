package main;

import classes.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> solutii = new HashMap<>();
        solutii.put("paracetamol", 500.0);
        solutii.put("povidona", 30.0);
        solutii.put("amidon de porumb", 20.0);

        Reteta prototip = new Reteta("Paracetamol", solutii);
        RetetaAbstracta copieMedicament = prototip.clone();

        System.out.println(prototip.toString());
        System.out.println(copieMedicament.toString());
    }
}
