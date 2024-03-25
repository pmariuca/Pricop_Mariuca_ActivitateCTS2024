package main;

import classes.Doctor;
import classes.Pontare;

public class Main {
    public static void main(String[] args) {
        // voi face un Singleton registry pentru a verifica ca daca un doctor s-a pontat nu o poate face din nou in aceeasi zi
        Pontare pontare = new Pontare("25.03.2024");
        Doctor doctor1 = new Doctor(123, "Popescu Ion", "Neurochirugie");
        pontare.ponteaza(doctor1);

        Doctor doctor2 = new Doctor(983, "Gheorghe Adina", "Cardiologie");
        pontare.ponteaza(doctor2);

        pontare.ponteaza(doctor1);
    }
}
