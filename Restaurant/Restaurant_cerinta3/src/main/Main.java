package main;

import simpleFactory.Supa;
import simpleFactory.factory.FabricaSupa;
import simpleFactory.factory.TipSupa;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FabricaSupa fabricaSupa = new FabricaSupa();

        try {
            Supa supaLegume = fabricaSupa.createSupa(TipSupa.LEGUME, 10, new ArrayList<>(Arrays.asList("ceapa", "morcov", "marar", "patrunjel")));

            Supa supaCiuperci = fabricaSupa.createSupa(TipSupa.CIUPERCI, 11, new ArrayList<>(Arrays.asList("ceapa", "morcov", "marar", "patrunjel", "ciuperci")));

            Supa supaVita = fabricaSupa.createSupa(TipSupa.VITA, 5, new ArrayList<>(Arrays.asList("ceapa", "morcov", "marar", "patrunjel", "vita")));

            supaLegume.afisareIngrediente();
            supaCiuperci.afisareIngrediente();
            supaVita.afisareIngrediente();

            Supa supaGaluste = fabricaSupa.createSupa(TipSupa.GALUSTE, 8, new ArrayList<>(Arrays.asList("ceapa", "morcov", "marar", "patrunjel", "galuste")));
            supaGaluste.afisareIngrediente();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
