package main;

import java.io.FileNotFoundException;
import java.util.List;

import classes.aplicanti.interfete.Aplicant;
import classes.readers.AngajatReader;
import classes.readers.interfete.AplicantReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantReader angajatReader = new AngajatReader("D:\\Facultate\\CTS\\Pricop_Mariuca_ActivitateCTS2024\\Seminar2\\dateIN\\angajati.txt");

		try {
			listaAngajati = angajatReader.read();
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
