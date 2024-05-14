package main;

import clase.Autobuz;
import clase.IAutobuz;
import clase.ProxyCalatori;
import clase.StatieAutobuz;

public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz = new Autobuz(24706);
        StatieAutobuz statieCalatori = new StatieAutobuz("Colegiul economic", true);
        StatieAutobuz statieGoala = new StatieAutobuz("ASE", false);
        autobuz.opreste(statieCalatori);
        autobuz.opreste(statieGoala);

        System.out.println();

        ProxyCalatori proxy = new ProxyCalatori(autobuz);
        proxy.opreste(statieCalatori);
        proxy.opreste(statieGoala);
    }
}
