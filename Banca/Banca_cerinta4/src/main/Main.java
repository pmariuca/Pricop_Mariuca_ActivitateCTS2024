package main;

import classes.AbstractContBancar;
import classes.ContBancar;

public class Main {
    public static void main(String[] args) {
        ContBancar prototip = new ContBancar("Popescu Ion", "2658961253214", "1235456985213652", "653");
        AbstractContBancar copie = prototip.clone();

        System.out.println(prototip.toString());
        System.out.println(copie.toString());
    }
}
