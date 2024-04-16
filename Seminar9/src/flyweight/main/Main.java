package flyweight.main;

import flyweight.clase.Caracteristici;
import flyweight.clase.Fabrica;

public class Main {
    public static void main(String[] args) {
        // sportiv cerinta 10
        Fabrica fabrica = new Fabrica();
        Caracteristici c1 = new Caracteristici(10, 10, "Roz");
        Caracteristici c2 = new Caracteristici(10, 15, "Violet");
        Caracteristici c3 = new Caracteristici(15, 30, "Albastru");
        Caracteristici c4  = new Caracteristici(17, 18, "Alb");

        fabrica.getSpectator(10, 10).deseneaza(c1);
        fabrica.getSpectator(20, 10).deseneaza(c2);
        fabrica.getSpectator(10, 10).deseneaza(c3);
        fabrica.getSpectator(20, 10).deseneaza(c4);
    }
}
