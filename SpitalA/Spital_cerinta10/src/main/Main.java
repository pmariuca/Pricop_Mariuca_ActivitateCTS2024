package main;

import classes.CaracteristiciInternare;
import classes.Fabrica;
import classes.Flyweight;
import classes.Pacient;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        CaracteristiciInternare caracteristiciInternare1 = new CaracteristiciInternare(210, 2, 3);
        CaracteristiciInternare caracteristiciInternare2 = new CaracteristiciInternare(210, 6, 1);

        fabrica.getPacient("Popescu Ion", "0756236985", "Str. Barnova 2").interneaza(caracteristiciInternare1);
        System.out.println();
        fabrica.getPacient("Pop Dan", "0796854563", "Str. Primaverii").interneaza(caracteristiciInternare2);
    }
}
