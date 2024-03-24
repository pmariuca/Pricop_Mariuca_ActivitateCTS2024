package main;

import prototype.Client;
import prototype.ClientAbstract;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> dateRezervari = new ArrayList<String>();
        dateRezervari.add("11.03.2024");
        dateRezervari.add("28.01.2024");
        dateRezervari.add("31.12.2023");

        Client prototip = new Client("Pricop", "Mariuca", "mariucapricop@gmail.com", "0755137644", 2023, dateRezervari);
        System.out.println(prototip.toString());

        ClientAbstract copieClient = prototip.clone();
        System.out.println(copieClient.toString());
    }
}
