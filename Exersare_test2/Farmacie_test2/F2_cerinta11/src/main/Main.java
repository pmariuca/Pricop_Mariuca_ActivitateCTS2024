package main;

import clase.PlataCard;
import clase.PlataCash;
import clase.Vanzator;

public class Main {
    public static void main(String[] args) {
        String client = "Popescu Ion";

        Vanzator vanzatorCard = new Vanzator("Pop Dan", new PlataCard());
        vanzatorCard.vindeMedicament(client);

        Vanzator vanzatorCash = new Vanzator("Popa Diana", new PlataCash());
        vanzatorCash.vindeMedicament(client);
    }
}
