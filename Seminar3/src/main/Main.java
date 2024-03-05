package main;

import classes.BazaDeDate;
import classes.Student;
import classes.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        BazaDeDate bazaDeDate = BazaDeDate.getInstance("Pisicute", 2, "localhost:127.0.0");
        BazaDeDate bazaDeDate2 = BazaDeDate.getInstance("Catei", 2, "localhost:127.0.0");

        System.out.println(bazaDeDate);
        System.out.println(bazaDeDate2);

        bazaDeDate.setNrTabele(5);
        System.out.println(bazaDeDate);

        System.out.println();

        Student student1 = new Student(123, "Pop Denis", "popdenis21@stud.ase.ro", 3);
        Student student2 = new Student(556, "Butacu Laura", "butaculaura21@stud.ase.ro", 3);
        Student student3 = new Student(568, "Popescu Ion", "popescuion21@stud.ase.ro", 3);
        Student student4 = new Student(554, "Popescu Diana", "popescudiana21@stud.ase.ro", 3);

        SustinereExamen examenPoo = new SustinereExamen("Programare Orientata Obiect");
        SustinereExamen examenCts = new SustinereExamen("Calitate si Testare Software");

        examenPoo.inregistreazaStudent(student1);
        examenPoo.inregistreazaStudent(student2);
        examenPoo.inregistreazaStudent(student3);
        examenPoo.inregistreazaStudent(student4);
        examenPoo.inregistreazaStudent(student1);
        examenPoo.inregistreazaStudent(student3);
    }
}