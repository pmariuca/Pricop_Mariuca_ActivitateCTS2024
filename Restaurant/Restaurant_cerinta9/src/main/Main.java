package main;

import clase.Client;
import clase.Proxy;
import clase.Rezervare;
import clase.RezervareMasa;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new RezervareMasa(4);
        Client client1 = new Client("Popescu Razvan", 5);
        Client client2 = new Client("Pop Dan", 3);
        rezervare.rezerva(client1);
        rezervare.rezerva(client2);
        System.out.println();

        Rezervare rezervareProxy = new Proxy(rezervare);
        rezervareProxy.rezerva(client1);
        rezervareProxy.rezerva(client2);
    }
}
