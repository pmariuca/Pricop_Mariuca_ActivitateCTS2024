package proxy.main;

import proxy.clase.*;

public class Main {
    public static void main(String[] args) {
        // sportiv cerinta 8
        Vanzare vanzare = new VanzareBilete("El Clasico", 100.5);
        Persoana persoana1 = new Persoana("Popa Andrei", 21, "Masculin");
        Persoana persoana2 = new Persoana("Popescu Andreea", 12, "Feminin");

        vanzare.vinde(persoana1);
        vanzare.vinde(persoana2);

        System.out.println();

        Vanzare vanzareProxy = new Proxy(vanzare);
        vanzareProxy.vinde(persoana1);
        vanzareProxy.vinde(persoana2);

        System.out.println();

        Vanzare vanzareProxyGen = new ProxyGen(vanzareProxy, "Feminin");
        vanzareProxyGen.vinde(persoana1);
        vanzareProxyGen.vinde(persoana2);
    }
}
