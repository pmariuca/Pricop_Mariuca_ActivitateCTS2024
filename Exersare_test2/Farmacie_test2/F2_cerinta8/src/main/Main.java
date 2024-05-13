package main;

import clase.Sectie;
import clase.StructuraAbstracta;
import clase.Subsectiuni;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta sa = new Sectie("Farmacie");
        StructuraAbstracta sa1 = new Sectie("Raceala");
        StructuraAbstracta med1 = new Subsectiuni("Paracetamol");
        sa1.adaugaStructura(med1);
        sa.adaugaStructura(sa1);

        StructuraAbstracta sa2 = new Sectie("Durere");
        StructuraAbstracta dur1 = new Subsectiuni("Nurofen");
        StructuraAbstracta dur2 = new Subsectiuni("Panadol");
        sa2.adaugaStructura(dur2);
        sa2.adaugaStructura(dur1);
        sa.adaugaStructura(sa2);

        sa.afiseazaStructura("      ");
    }
}
