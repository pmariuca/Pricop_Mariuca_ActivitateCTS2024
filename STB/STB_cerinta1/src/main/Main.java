package main;

import classes.MijlocTransport;
import classes.factory.FactoryMijlocTransport;
import classes.factory.TipMijlocTransport;

public class Main {
    public static void main(String[] args) {
        FactoryMijlocTransport factoryMijlocTransport = new FactoryMijlocTransport();

        try {
            MijlocTransport autobuz = factoryMijlocTransport.creareObiect(TipMijlocTransport.AUTOBUZ, 2000, "Popescu Ion", "B666STB");
            MijlocTransport tramvai = factoryMijlocTransport.creareObiect(TipMijlocTransport.TRAMVAI, 1950, "Dan Gheorghe", "B362STB");
            MijlocTransport troleibuz = factoryMijlocTransport.creareObiect(TipMijlocTransport.TROLEIBUZ, 1980, "Mihai Darius", "B333STB");

            System.out.println(autobuz.toString());
            System.out.println(tramvai.toString());
            System.out.println(troleibuz.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
