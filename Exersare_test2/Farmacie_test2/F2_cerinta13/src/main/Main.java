package main;

import clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(1253);
        reteta.cumparaMedicamente();

        reteta.solicitaMedicamente();
        reteta.solicitaMedicamente();

        reteta.cumparaMedicamente();
    }
}
