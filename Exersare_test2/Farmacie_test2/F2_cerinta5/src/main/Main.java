package main;

import softNou.Depozit;
import softVechi.AdapterMagazinDepozit;
import softVechi.Medicament;
import softVechi.SoftMagazin;
import softVechi.VanzareMagazin;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        VanzareMagazin magazin = new VanzareMagazin();
        Medicament paracetamol =new Medicament(1, "Paracetamol", 5.6, 21);
        Medicament nurofen =new Medicament(2, "Nurofen", 35.6, 2);
        magazin.adaugaMedicament(paracetamol);
        magazin.adaugaMedicament(nurofen);

        magazin.setareMedicament(1);
        boolean areStoc = magazin.verificareDisponibilitate(30);
        System.out.println(areStoc ? "Exista stoc in magazin pentru medicamentul Paracetamol" : "Nu exista stoc in magazin pentru medicamentul Paracetamol");

        Map<Integer, Medicament> medicamente = new HashMap<>();
        medicamente.put(1, paracetamol);
        medicamente.put(2, nurofen);

        AdapterMagazinDepozit adapter = new AdapterMagazinDepozit(medicamente);
        adapter.setareMedicament(2);
        boolean areStocDepozit = adapter.verificareDisponibilitate(1);
        System.out.println(areStocDepozit ? "Exista stoc in depozit pentru medicamentul Nurofen" : "Nu exista stoc in depozit pentru medicamentul Nurofen");

    }
}
