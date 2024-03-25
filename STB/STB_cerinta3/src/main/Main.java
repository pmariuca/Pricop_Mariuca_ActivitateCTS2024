package main;

import classes.AutobuzLinie;
import classes.AutobuzLinieBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzLinieBuilder autobuzLinieBuilder = new AutobuzLinieBuilder();

        AutobuzLinie autobuzLinie = autobuzLinieBuilder
                .setModelAutobuz("autobuz")
                .setSofer("Popescu Ion")
                .setOpritiLaCapatLinie(true)
                .setUsiAutomate(true)
                .setTextAfisare("O zi buna!")
                .build();

        AutobuzLinie autobuzLinie1 = autobuzLinieBuilder
                .setModelAutobuz("troleibuz")
                .setOpritiLaCapatLinie(false)
                .setUsiAutomate(false)
                .build();

        System.out.println(autobuzLinie.toString());
        System.out.println(autobuzLinie1.toString());
    }
}
