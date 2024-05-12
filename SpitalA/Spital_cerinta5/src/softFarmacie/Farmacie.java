package softFarmacie;

import java.util.ArrayList;
import java.util.List;

public class Farmacie {
    private List<MedicamentFarmacie> listaMedicamente;

    public Farmacie() {
        this.listaMedicamente = new ArrayList<>();
    }

    public List<MedicamentFarmacie> getListaMedicamente() {
        return listaMedicamente;
    }

    public void adaugaMedicamentFarmacie(MedicamentFarmacie medicamentFarmacie) {
        this.listaMedicamente.add(medicamentFarmacie);
    }

    public void cumparaMedicamentFarmacie(MedicamentFarmacie medicamentFarmacie) {
        medicamentFarmacie.cumparaMedicament();
    }
}
