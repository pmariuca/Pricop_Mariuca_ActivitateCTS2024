package main;

import clase.Item;
import clase.Meniu;
import clase.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta sa1 = new Meniu("Meniu");
        StructuraAbstracta sa2 = new Meniu("Starter");
        StructuraAbstracta sa3 = new Meniu("Bautura");
        StructuraAbstracta sa4 = new Meniu("Desert");

        StructuraAbstracta sa21 = new Item("Nachos");
        StructuraAbstracta sa22 = new Item("Nuggets");
        StructuraAbstracta sa23 = new Item("Dippings");

        StructuraAbstracta sa31 = new Meniu("Alcool");
        StructuraAbstracta sa32 = new Meniu("Sucuri");
        StructuraAbstracta sa311 = new Item("Mojito");
        StructuraAbstracta sa321 = new Item("Lipton");

        sa2.adaugaStructura(sa21);
        sa2.adaugaStructura(sa22);
        sa2.adaugaStructura(sa23);

        sa31.adaugaStructura(sa311);
        sa32.adaugaStructura(sa321);
        sa3.adaugaStructura(sa31);
        sa3.adaugaStructura(sa32);

        sa1.adaugaStructura(sa2);
        sa1.adaugaStructura(sa3);
        sa1.adaugaStructura(sa4);
        sa1.afisare("   ");
    }
}
