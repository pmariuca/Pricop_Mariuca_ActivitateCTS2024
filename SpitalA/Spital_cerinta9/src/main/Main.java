package main;

import clase.Internare;
import clase.InternareSpital;
import clase.Pacient;
import clase.Proxy;

public class Main {
    public static void main(String[] args) {
        Internare internareSpital = new InternareSpital(3);
        Pacient pacient1 = new Pacient("Popescu Ion", 23, false);
        Pacient pacient2 = new Pacient("Pop Dan", 29, true);
        internareSpital.interneaza(pacient1);
        internareSpital.interneaza(pacient2);
        System.out.println();

        Internare internareProxy = new Proxy(internareSpital);
        internareProxy.interneaza(pacient1);
        internareProxy.interneaza(pacient2);
    }
}
