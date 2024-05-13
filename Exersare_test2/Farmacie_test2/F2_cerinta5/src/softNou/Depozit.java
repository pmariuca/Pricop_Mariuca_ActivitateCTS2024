package softNou;

import softVechi.Medicament;

import java.util.HashMap;
import java.util.Map;

public class Depozit {
    protected Map<Integer, Medicament> medicamente = new HashMap<>();
    protected int idMedicament = 0;

    public Depozit(Map<Integer, Medicament> medicamente) {
        this.medicamente = medicamente;
    }

    public void adaugaMedicament(Medicament medicament) {
        if(!this.medicamente.containsKey(medicament.getId())) {
            this.medicamente.put(medicament.getId(), medicament);
        }
    }

    public boolean verificaStocMedicament(int id, int stoc) {
        if(this.medicamente.containsKey(id)) {
            return this.medicamente.get(id).getStocDepozit() >= stoc;
        } else {
            return false;
        }
    }
}
