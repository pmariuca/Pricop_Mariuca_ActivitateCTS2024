package main;

import classes.Client;
import classes.IClient;

public class Main {
    public static void main(String[] args) {
        Client prototip = new Client("Popescu Ion", "0756923654", "popescuion@yahoo.com");
        IClient clona = prototip.clone();

        System.out.println(prototip.toString());
        System.out.println(clona.toString());
    }
}
