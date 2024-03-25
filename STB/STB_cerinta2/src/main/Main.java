package main;

import classes.MijlocTransport;
import classes.MijlocTransportAbstract;

public class Main {
    public static void main(String[] args) {
        MijlocTransport prototip = new MijlocTransport(2000, "Popescu Ion", "B652STB");
        MijlocTransportAbstract copie = prototip.clone();

        System.out.println(prototip.toString());
        System.out.println(copie.toString());
    }
}
