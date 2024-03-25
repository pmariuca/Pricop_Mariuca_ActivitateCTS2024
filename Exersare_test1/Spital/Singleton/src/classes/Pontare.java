package classes;

import java.util.HashMap;
import java.util.Map;

public class Pontare {
    private String data;
    private Map<Integer, Doctor> registruPontari = new HashMap<>();

    public Pontare(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public Map<Integer, Doctor> getRegistruPontari() {
        return registruPontari;
    }

    public void ponteaza(Doctor doctor) {
        if(registruPontari.containsKey(doctor.getIdDoctor())) {
            System.out.println("Doctorul " + doctor.getNume() + " s-a pontat deja!");
        } else {
            registruPontari.put(doctor.getIdDoctor(), doctor);
            System.out.println("Pontarea s-a efectuat!");
        }
    }
}
