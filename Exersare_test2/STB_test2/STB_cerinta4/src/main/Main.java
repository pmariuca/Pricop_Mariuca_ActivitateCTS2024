package main;

import clase.softMetrorex.BiletMetrorex;
import clase.softMetrorex.Metrorex;
import clase.softSTB.AdapterSTBMetrorex;
import clase.softSTB.BiletSTB;
import clase.softSTB.STB;

public class Main {
    public static void main(String[] args) {
        STB statieSTB = new STB("Kaufland Bucurestii Noi");
        statieSTB.valideazaBilet(new BiletSTB(123));

        Metrorex statieMetrou = new Metrorex("Eroilor");
        statieMetrou.scaneazaBilet(new BiletMetrorex(560));

        BiletSTB bilet = new BiletSTB(654);
        statieSTB.valideazaBilet(bilet);
        AdapterSTBMetrorex adapter = new AdapterSTBMetrorex("Unirii");
        adapter.valideazaBilet(bilet);
    }
}
