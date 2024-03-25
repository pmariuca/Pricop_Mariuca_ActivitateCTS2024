package main;

import classes.Reteta;
import classes.RetetaAbstracta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> solutii = new HashMap<>();
        solutii.put("Paracetamol", 500.0);
        solutii.put("Povidona", 30.0);
        solutii.put("Amidon de porumb", 20.0);

        Reteta prototip = new Reteta("Paracetamol", solutii);
        RetetaAbstracta paracetamol = prototip.clone();

        System.out.println(prototip.toString());
        System.out.println(paracetamol.toString());
    }
}
