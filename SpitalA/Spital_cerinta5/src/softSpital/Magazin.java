package softSpital;

import java.util.ArrayList;
import java.util.List;

public class Magazin implements SoftMagazin {
    private List<MedicamentSpital> listaMedicamente;

    public Magazin() {
        this.listaMedicamente = new ArrayList<>();
    }

    @Override
    public void cumpara(MedicamentSpital medicament) {
        medicament.achizitioneazaMedicament();
    }

    @Override
    public void adaugaMedicament(MedicamentSpital medicament) {
        this.listaMedicamente.add(medicament);
    }
}
