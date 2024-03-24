package main;

import classes.FacturaBuilder;
import classes.Factura;

public class Main {
    public static void main(String[] args) {
        FacturaBuilder facturaBuilder = new FacturaBuilder();

        Factura factura1 = facturaBuilder
                .setNumarPungi(2)
                .setPlataCuCard(true)
                .build();
        Factura factura2 = facturaBuilder
                .setNumarPungi(0)
                .setPlataCuCard(false)
                .setCotaTVA(0.19)
                .build();

        System.out.println(factura1.toString());
        System.out.println(factura2.toString());
    }
}
