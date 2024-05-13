package softVechi;

import softNou.Depozit;

import java.util.Map;

public class AdapterMagazinDepozit extends Depozit implements SoftMagazin {

    public AdapterMagazinDepozit(Map<Integer, Medicament> medicamente) {
        super(medicamente);
    }

    @Override
    public void setareMedicament(int id) {
        if(super.medicamente.containsKey(id)) {
            this.idMedicament = id;
        } else {
            System.out.println("Medicamentul nu exista.");
        }
    }

    @Override
    public boolean verificareDisponibilitate(int stocDorit) {
        return verificaStocMedicament(this.idMedicament, stocDorit);
    }
}
