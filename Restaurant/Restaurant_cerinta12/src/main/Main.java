package main;

import observer.Client;
import observer.Observer;
import subiect.Restaurant;
import subiect.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect restaurant = new Restaurant("Hard Rock Cafe");
        Observer client1 = new Client("Popescu Ion");
        Observer client2 = new Client("Pop Dan");
        restaurant.adaugaObserver(client1);
        restaurant.adaugaObserver(client2);

        restaurant.notificaMeniu();
        restaurant.notificaOferta();
        restaurant.notificaObserver("Va fi disponibil un nou concert!");
    }
}
