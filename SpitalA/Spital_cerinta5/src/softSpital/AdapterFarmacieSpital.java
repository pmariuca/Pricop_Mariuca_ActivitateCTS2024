package softSpital;

import softFarmacie.Farmacie;
import softFarmacie.MedicamentFarmacie;

public class AdapterFarmacieSpital extends Farmacie implements SoftMagazin {
    @Override
    public void cumpara(MedicamentSpital medicament) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(medicament.getDenumire(), medicament.getPret());
        super.cumparaMedicamentFarmacie(medicamentFarmacie);
    }

    @Override
    public void adaugaMedicament(MedicamentSpital medicament) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(medicament.getDenumire(), medicament.getPret());
        super.adaugaMedicamentFarmacie(medicamentFarmacie);
    }
}
