package composite.main;

import composite.clase.Departament;
import composite.clase.Sectie;
import composite.clase.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta spital = new Departament("Spital", "Miranda Bailey");
        StructuraAbstracta cardiologie = new Departament("Cardiologie", "Christina Yang");
        StructuraAbstracta neurologie = new Departament("Neurologie", "Derek Shepers");

        StructuraAbstracta terapieIntensiva = new Sectie("ATI", "Teddy Altman", 10);
        StructuraAbstracta donare = new Sectie("Donare de sange", "Owen Hunt", 2);
        StructuraAbstracta ct = new Sectie("CT", "Amelia Sheperd", 3);

        cardiologie.adaugaStructura(terapieIntensiva);
        cardiologie.adaugaStructura(donare);

        neurologie.adaugaStructura(ct);

        spital.adaugaStructura(cardiologie);
        spital.adaugaStructura(neurologie);
        spital.afiseazaDescriere("  ");
    }
}
