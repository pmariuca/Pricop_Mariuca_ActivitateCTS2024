package main;

import clase.Pacient;
import clase.StrategyCard;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Popescu Ion");
        pacient1.plateste();

        Pacient pacient2 = new Pacient(new StrategyCard(), "Pop Dan");
        pacient2.plateste();
    }
}
