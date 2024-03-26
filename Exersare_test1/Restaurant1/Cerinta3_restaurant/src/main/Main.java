package main;

import classes.Supa;
import classes.factory.SupaFactory;
import classes.factory.TipSupa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SupaFactory supaFactory = new SupaFactory();

        try {
            Supa ciuperci = supaFactory.creareObiect(TipSupa.CIUPERCI, 12, Arrays.asList("Ciuperci", "Leustean", "Marar"));
            Supa legume = supaFactory.creareObiect(TipSupa.LEGUME, 10, Arrays.asList("Morcovi", "Cartofi", "Telina"));
            Supa vita = supaFactory.creareObiect(TipSupa.VITA, 8, Arrays.asList("Carne de vita", "Telina", "Leustean", "Marar"));

            ciuperci.detaliiSupa();
            legume.detaliiSupa();
            vita.detaliiSupa();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
