package main;

import classes.ContBancar;

public class Main {
    public static void main(String[] args) {
        ContBancar.ContBancarBuilder builder = new ContBancar.ContBancarBuilder();

        ContBancar cont1 = builder
                .setPrimesteSalariu(true)
                .setCardAtasat(true)
                .build();

        ContBancar cont2 = builder
                .setCardAtasat(false)
                .setInternetBanking(true)
                .build();

        System.out.println(cont1);
        System.out.println(cont2);
    }
}
