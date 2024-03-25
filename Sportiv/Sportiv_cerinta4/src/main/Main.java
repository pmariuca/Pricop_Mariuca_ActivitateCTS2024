package main;

import classes.Client;
import classes.ClientAbstract;

public class Main {
    public static void main(String[] args) {
        Client prototip = new Client("Popescu Ion", "0756325688", "popescuion@gmail.com");
        ClientAbstract copieClient = prototip.clone();

        System.out.println(prototip.toString());
        System.out.println(copieClient.toString());
    }
}
