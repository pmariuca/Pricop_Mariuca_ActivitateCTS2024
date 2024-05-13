package main;

import clase.observer.Client;
import clase.observer.Observer;
import clase.subiect.Farmacie;

public class Main {
    public static void main(String[] args) {
        Observer client1 = new Client("Popescu Ion");
        Observer client2 = new Client("Pop Dan");

        Farmacie farmacie = new Farmacie("Dona");
        farmacie.abonareObservator(client1);
        farmacie.abonareObservator(client2);
        farmacie.notificaOferta();
    }
}
