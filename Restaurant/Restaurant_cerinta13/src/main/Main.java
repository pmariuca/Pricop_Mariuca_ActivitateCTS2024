package main;

import clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(1);
        masa.rezervaMasa();
        masa.ridicaRezervare();

        masa.rezervaMasa();

        masa.elibereazaMasa();
    }
}
