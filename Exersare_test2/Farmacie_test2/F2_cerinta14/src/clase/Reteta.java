package clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta {
    private int numarReteta;
    private List<Medicament> medicamente;

    public Reteta(int numarReteta) {
        this.numarReteta = numarReteta;
        this.medicamente = new ArrayList<>();
    }

    public void adaugaMedicament(Medicament med) {
        this.medicamente.add(med);
    }

    public int getNumarReteta() {
        return numarReteta;
    }

    public List<Medicament> getMedicamente() {
        return medicamente;
    }
}
