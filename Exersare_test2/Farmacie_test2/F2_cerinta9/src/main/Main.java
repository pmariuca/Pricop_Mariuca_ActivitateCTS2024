package main;

import clase.Proxy;
import clase.Vanzare;
import clase.VanzareMedicament;

public class Main {
    public static void main(String[] args) {
        Vanzare vanzare = new VanzareMedicament("Paracetamol", 6.5);
        vanzare.vinde();

        Proxy proxyReteta = new Proxy(new VanzareMedicament("Duac", 98.2));
        proxyReteta.achizitioneazaMedicament(false);

        proxyReteta.achizitioneazaMedicament(true);
    }
}
