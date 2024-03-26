package main;

import classes.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant1 = Restaurant.getInstanta("Pisicutele", "Str. Pisicutelor");
        Restaurant restaurant2 = Restaurant.getInstanta("Catelusii", "Str. Catelusilor");

        System.out.println(restaurant1.hashCode());
        System.out.println(restaurant1.toString());

        System.out.println(restaurant2.hashCode());
        System.out.println(restaurant2.toString());
    }
}
