package state.main;

import state.classes.Pacient;

public class Main {
    public static void main(String[] args) {
        // spital cerinta 13
        // state - are mai multe stari si o regula
        // constructori protected la stari + setterul de stare protected
        Pacient pacient1 = new Pacient("Popescu Ion");
        pacient1.seAgraveazaStarea();
        pacient1.seVindeca();

        pacient1.seImbunatatesteStarea();
        pacient1.seVindeca();
        System.out.println();

        Pacient pacient2 = new Pacient("Bal Ion");
        pacient2.seAgraveazaStarea();
//        pacient2.setStare(pacient1.getStare());
    }
}
