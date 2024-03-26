package main;

import classes.Supa;
import classes.factory.SupaCiuperciFactory;
import classes.factory.SupaFactory;
import classes.factory.SupaLegumeFactory;
import classes.factory.SupaVitaFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void prelucrareSupe(SupaFactory supaFactory, int nrPortii, List<String> ingrediente) {
        Supa supa = supaFactory.creareSupa(nrPortii, ingrediente);

        supa.detaliiSupa();
    }
    public static void main(String[] args) {
        prelucrareSupe(new SupaCiuperciFactory(), 6, Arrays.asList("Ciuperci", "Leustean", "Marar"));
        prelucrareSupe(new SupaLegumeFactory(), 4, Arrays.asList("Morcovi", "Cartofi", "Telina"));
        prelucrareSupe(new SupaVitaFactory(), 10, Arrays.asList("Carne de vita", "Telina", "Leustean", "Marar"));
    }
}
