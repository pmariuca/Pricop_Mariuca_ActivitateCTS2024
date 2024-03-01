package clase.readers;

import clase.aplicanti.Student;
import clase.aplicanti.interfete.Aplicant;
import clase.readers.interfete.AplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {
    public StudentReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input.hasNext()) {
            Student student = new Student();
            readAplicant(input, student);

            int anStudii = input.nextInt();
            String facultate = (input.next()).toString();

            student.setAnStudii(anStudii);
            student.setFacultate(facultate);

            studenti.add(student);
        }
        input.close();;
        return studenti;
    }
}
