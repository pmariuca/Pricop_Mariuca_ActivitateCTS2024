package softSpital;

import softFarmacie.MedicamentFarmacie;

public class AdapterMedicamentFarmacieSpital extends MedicamentSpital {
    private MedicamentFarmacie medicamentFarmacie;
    public AdapterMedicamentFarmacieSpital(MedicamentFarmacie medicamentFarmacie) {
        super(medicamentFarmacie.getDenumire(), medicamentFarmacie.getPret());
        this.medicamentFarmacie = medicamentFarmacie;
    }
}
