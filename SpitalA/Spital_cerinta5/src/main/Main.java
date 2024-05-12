package main;

import softFarmacie.Farmacie;
import softFarmacie.MedicamentFarmacie;
import softSpital.*;

public class Main {
    public static void cumparaMedicament(SoftMagazin magazin, MedicamentSpital medicament) {
        magazin.cumpara(medicament);
    }

    public static void main(String[] args) {
        SoftMagazin magazin = new Magazin();

        MedicamentSpital medicamentSpital1 = new MedicamentSpital("Ketonal", 23.5);
        MedicamentSpital medicamentSpital2 = new MedicamentSpital("Aciclovir", 37.3);

        cumparaMedicament(magazin, medicamentSpital1);
        cumparaMedicament(magazin, medicamentSpital2);
        System.out.println();

        Farmacie farmacie = new Farmacie();
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("Nurofen", 37.5);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Paracetamol", 7.5);

        farmacie.cumparaMedicamentFarmacie(medicamentFarmacie1);
        farmacie.cumparaMedicamentFarmacie(medicamentFarmacie2);
        System.out.println();

        AdapterFarmacieSpital adapterFarmacieSpital = new AdapterFarmacieSpital();
        adapterFarmacieSpital.cumparaMedicamentFarmacie(new MedicamentFarmacie("Iod", 12.5));
        System.out.println();

        // medicamentul farmacie se transforma in medicament spital prin adapter si poate fi folosit cu metoda de cumparare initiala
        MedicamentFarmacie MedicamentFarmacieNou = new MedicamentFarmacie("Aminosteril", 42.5);
        AdapterMedicamentFarmacieSpital adapterMedicamentFarmacieSpital = new AdapterMedicamentFarmacieSpital(MedicamentFarmacieNou);
        cumparaMedicament(adapterFarmacieSpital, adapterMedicamentFarmacieSpital);
    }
}
