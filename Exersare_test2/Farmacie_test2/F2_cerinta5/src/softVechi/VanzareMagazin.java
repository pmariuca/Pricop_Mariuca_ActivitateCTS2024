package softVechi;

import java.util.HashMap;
import java.util.Map;

public class VanzareMagazin implements SoftMagazin {
    protected Map<Integer, Medicament> medicamente;
    protected int idMedicament;

    public VanzareMagazin() {
        this.medicamente = new HashMap<>();
        this.idMedicament = -1;
    }

    public void adaugaMedicament(Medicament medicament) {
        if(!this.medicamente.containsKey(medicament.getId())) {
            this.medicamente.put(medicament.getId(), medicament);
        }
    }

    @Override
    public void setareMedicament(int id) {
        if(this.medicamente.containsKey(id)) {
            this.idMedicament = id;
        } else {
            System.out.println("Acest medicament nu exista in magazin.");
        }
    }

    @Override
    public boolean verificareDisponibilitate(int stoc) {
        Medicament medicament = this.medicamente.get(idMedicament);
        if(medicament != null) {
            return stoc <= medicament.getStocDepozit();
        } else {
            return false;
        }
    }
}
